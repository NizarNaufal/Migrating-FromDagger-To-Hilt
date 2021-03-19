package id.migratingdagger.hilt.ui.list

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import id.migratingdagger.common.events.OnViewHolderItemSelected
import id.migratingdagger.hilt.R
import id.migratingdagger.hilt.model.NewsListModel
import id.migratingdagger.hilt.repository.entity.News

class NewsListViewAdapter(
        private val model: NewsListModel,
        private val listener: OnViewHolderItemSelected<News?>? = null
) :
        RecyclerView.Adapter<NewsListItemViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewsListItemViewHolder {
        val itemView =
                LayoutInflater.from(parent.context)
                        .inflate(R.layout.news_list_item_layout, parent, false)
        return NewsListItemViewHolder(itemView, listener)
    }

    override fun getItemCount(): Int = model.newsList.size

    override fun onBindViewHolder(holder: NewsListItemViewHolder, position: Int) {
        holder.bind(model.newsList[position])
    }
}