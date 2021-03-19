package id.migratingdagger.hilt.thirdparty

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.FragmentComponent
import dagger.multibindings.IntoSet
import id.migratingdagger.hilt.stats.NewsStats

@Module
@InstallIn(FragmentComponent::class)
class ThirdPartyStatsModule {

    @Provides
    @IntoSet // HERE
    fun provideWordsCountNewsStats(): NewsStats = WordCountNewsStats()
}