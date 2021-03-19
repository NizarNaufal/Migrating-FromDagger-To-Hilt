package id.migratingdagger.hilt.stats

import android.util.Log
import id.migratingdagger.hilt.repository.entity.News

class LengthNewsStats : NewsStats {
    override fun printStats(news: News) {
        Log.i(STATS_LOG, "News Length: ${news.body.length}")
    }
}