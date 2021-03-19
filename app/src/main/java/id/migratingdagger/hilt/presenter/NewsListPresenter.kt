package id.migratingdagger.hilt.presenter

import id.migratingdagger.common.mvp.Presenter
import id.migratingdagger.hilt.model.NewsListModel
import id.migratingdagger.hilt.ui.list.NewsListView

/**
 * The Presenter for the NewsList
 */
interface NewsListPresenter : Presenter<NewsListModel, NewsListView> {

    /**
     * Invoke in order to display the news
     */
    fun displayNewsList()
}