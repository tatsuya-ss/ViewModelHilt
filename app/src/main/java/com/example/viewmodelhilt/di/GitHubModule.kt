package com.example.viewmodelhilt.di

import com.example.viewmodelhilt.app.GitHubUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@InstallIn(SingletonComponent::class)
@Module
object GitHubModule {
    @Provides
    fun provideGitHubUseCase(): GitHubUseCase {
        return GitHubUseCase()
    }
}