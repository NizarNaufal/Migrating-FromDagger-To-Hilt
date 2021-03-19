package id.migratingdagger.hilt.stats

import id.migratingdagger.hilt.repository.entity.News

const val STATS_LOG = "NEWS_STATS"

interface NewsStats {

    fun printStats(news: News)
}