package id.migratingdagger.hilt.model

import id.migratingdagger.common.mvp.Model
import id.migratingdagger.hilt.repository.entity.News

data class NewsListModel(var newsList: List<News>) : Model