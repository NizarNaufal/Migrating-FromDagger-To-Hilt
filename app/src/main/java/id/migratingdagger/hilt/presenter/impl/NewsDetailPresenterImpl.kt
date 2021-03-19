package id.migratingdagger.hilt.presenter.impl

import android.util.Log
import dagger.hilt.android.scopes.FragmentScoped
import id.migratingdagger.common.mvp.impl.BasePresenter
import id.migratingdagger.hilt.conf.TAG
import id.migratingdagger.hilt.model.NewsModel
import id.migratingdagger.hilt.presenter.NewsDetailPresenter
import id.migratingdagger.hilt.repository.NewsRepository
import id.migratingdagger.hilt.stats.NewsStats
import id.migratingdagger.hilt.ui.detail.NewsDetailView
import javax.inject.Inject

@FragmentScoped
class NewsDetailPresenterImpl @Inject constructor(
    private val newsRepository: NewsRepository,
    private val newsStats: @JvmSuppressWildcards(true) Set<NewsStats>
) : BasePresenter<NewsModel, NewsDetailView>(),
    NewsDetailPresenter {

    override fun displayNewsDetail(newsId: Long) {
        Log.i(TAG, "In NewsDetailPresenterImpl using Repository $newsRepository")
        newsRepository.byId(newsId)?.let { news ->
            view?.displayNews(news)
            newsStats.forEach { stats ->
                stats.printStats(news)
            }
        }
    }
}