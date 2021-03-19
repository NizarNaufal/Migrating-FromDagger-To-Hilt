package id.migratingdagger.hilt.ui.list

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import dagger.hilt.android.AndroidEntryPoint
import id.migratingdagger.hilt.R
import id.migratingdagger.hilt.model.NewsListModel
import id.migratingdagger.hilt.presenter.NewsListPresenter
import id.migratingdagger.hilt.ui.detail.NewsDetailFragment
import javax.inject.Inject

@AndroidEntryPoint
class NewsListFragment : Fragment(), NewsListView {

    @Inject
    lateinit var newsListPresenter: NewsListPresenter

    private lateinit var recyclerView: RecyclerView
    private lateinit var newsListViewAdapter: NewsListViewAdapter
    private val newsListModel = NewsListModel(emptyList())

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.news_list_layout, container, false)
        newsListPresenter.bind(this)
        initRecyclerView(view)
        return view
    }

    override fun onStart() {
        super.onStart()
        newsListPresenter.displayNewsList()
    }

    override fun displayNews(newsList: NewsListModel) {
        newsListModel.newsList = newsList.newsList
        newsListViewAdapter.notifyDataSetChanged()
    }

    override fun onDestroy() {
        super.onDestroy()
        newsListPresenter.unbind()
    }

    private fun initRecyclerView(view: View) {
        recyclerView = view.findViewById(R.id.recycler_view)
        recyclerView.layoutManager =
            LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
        val dividerItemDecoration = DividerItemDecoration(
            context,
            LinearLayoutManager.VERTICAL
        )
        recyclerView.addItemDecoration(dividerItemDecoration)
        newsListViewAdapter = NewsListViewAdapter(newsListModel) { selectedNews ->
            val bundle = Bundle().apply {
                putLong(NewsDetailFragment.NEWS_ID, selectedNews?.id ?: -1)
            }
            fragmentManager?.run {
                beginTransaction()
                    .replace(R.id.anchor, NewsDetailFragment.create(bundle))
                    .addToBackStack(null)
                    .commit()
            }
        }
        recyclerView.adapter = newsListViewAdapter
    }
}