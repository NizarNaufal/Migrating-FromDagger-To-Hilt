package id.migratingdagger.hilt.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.FragmentComponent
import dagger.multibindings.ElementsIntoSet
import id.migratingdagger.hilt.stats.LengthNewsStats
import id.migratingdagger.hilt.stats.NewsStats

@Module
@InstallIn(FragmentComponent::class)
class StatsModule {

    @Provides
    @ElementsIntoSet // HERE
    fun provideNewsStats(): Set<NewsStats> = setOf(
        LengthNewsStats()
    )
}