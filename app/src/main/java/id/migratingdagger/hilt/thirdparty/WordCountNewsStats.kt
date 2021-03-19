package id.migratingdagger.hilt.thirdparty

import android.util.Log
import id.migratingdagger.hilt.repository.entity.News
import id.migratingdagger.hilt.stats.NewsStats
import id.migratingdagger.hilt.stats.STATS_LOG


class WordCountNewsStats : NewsStats {
    override fun printStats(news: News) {
        val wordsCount = news.body.splitToSequence(" ").count()
        Log.i(STATS_LOG, "News Word count: $wordsCount")
    }
}