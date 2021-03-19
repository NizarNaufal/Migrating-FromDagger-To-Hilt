package id.migratingdagger.hilt.presenter

import id.migratingdagger.common.mvp.Presenter
import id.migratingdagger.hilt.model.NewsModel
import id.migratingdagger.hilt.ui.detail.NewsDetailView

/**
 * The Presenter for the News Detail
 */
interface NewsDetailPresenter : Presenter<NewsModel, NewsDetailView> {

    /**
     * Invoke in order to display the detail for the news
     */
    fun displayNewsDetail(newsId: Long)
}