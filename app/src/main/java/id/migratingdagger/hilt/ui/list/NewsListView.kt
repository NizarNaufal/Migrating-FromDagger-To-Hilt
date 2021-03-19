package id.migratingdagger.hilt.ui.list

import id.migratingdagger.common.mvp.View
import id.migratingdagger.hilt.model.NewsListModel

interface NewsListView : View<NewsListModel> {

    /**
     * Displays the list of news in the View
     */
    fun displayNews(newsList: NewsListModel)
}