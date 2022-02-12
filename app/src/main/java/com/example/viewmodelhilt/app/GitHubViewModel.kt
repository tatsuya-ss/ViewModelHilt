package com.example.viewmodelhilt.app

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class GitHubViewModel @Inject constructor(
    val gitHubUseCase: GitHubUseCase
): ViewModel() {
    val a = gitHubUseCase.a
}

class GitHubUseCase @Inject constructor() {
    val a = "a"
}