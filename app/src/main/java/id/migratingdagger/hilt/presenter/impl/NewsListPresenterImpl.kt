package id.migratingdagger.hilt.presenter.impl

import android.util.Log
import dagger.hilt.android.scopes.FragmentScoped
import id.migratingdagger.common.mvp.impl.BasePresenter
import id.migratingdagger.hilt.conf.TAG
import id.migratingdagger.hilt.model.NewsListModel
import id.migratingdagger.hilt.presenter.NewsListPresenter
import id.migratingdagger.hilt.repository.NewsRepository
import id.migratingdagger.hilt.ui.list.NewsListView
import javax.inject.Inject

/**
 * Presenter for the display of the list
 */
@FragmentScoped
class NewsListPresenterImpl @Inject constructor(
    private val newsRepository: NewsRepository
) : BasePresenter<NewsListModel, NewsListView>(),
    NewsListPresenter {

    override fun displayNewsList() {
        Log.i(TAG, "In NewsListPresenterImpl using Repository $newsRepository")
        val newsList = newsRepository.list()
        view?.displayNews(NewsListModel(newsList))
    }
}