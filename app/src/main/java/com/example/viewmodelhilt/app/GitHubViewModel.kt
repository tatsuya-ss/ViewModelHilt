package com.example.viewmodelhilt.app

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel

class GitHubViewModel @ViewModelInject constructor(): ViewModel() {
    val a = "A"
}

