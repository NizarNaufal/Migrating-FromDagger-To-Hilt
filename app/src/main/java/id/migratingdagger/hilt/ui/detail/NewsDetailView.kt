package id.migratingdagger.hilt.ui.detail

import id.migratingdagger.common.mvp.View
import id.migratingdagger.hilt.model.NewsModel
import id.migratingdagger.hilt.repository.entity.News

/**
 * The View for the Detail
 */
interface NewsDetailView : View<NewsModel> {

    /**
     * Displays the given News
     */
    fun displayNews(news: News)
}