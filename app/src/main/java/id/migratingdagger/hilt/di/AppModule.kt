package id.migratingdagger.hilt.di

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import id.migratingdagger.hilt.repository.NewsRepository
import id.migratingdagger.hilt.repository.impl.MemoryNewsRepository

@Module
@InstallIn(ApplicationComponent::class)
abstract class AppModule {

    @Binds
    abstract fun provideNewsRepository(newsRepository: MemoryNewsRepository): NewsRepository
}
