package id.migratingdagger.hilt.di

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.FragmentComponent
import id.migratingdagger.hilt.presenter.NewsDetailPresenter
import id.migratingdagger.hilt.presenter.NewsListPresenter
import id.migratingdagger.hilt.presenter.impl.NewsDetailPresenterImpl
import id.migratingdagger.hilt.presenter.impl.NewsListPresenterImpl

@Module
@InstallIn(FragmentComponent::class)
abstract class FeatureModule {

    @Binds
    abstract fun provideNewsListPresenter(newsRepository: NewsListPresenterImpl): NewsListPresenter

    @Binds
    abstract fun provideNewsDetailPresenter(newsRepository: NewsDetailPresenterImpl): NewsDetailPresenter
}