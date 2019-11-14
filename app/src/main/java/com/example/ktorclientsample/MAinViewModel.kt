package com.example.ktorclientsample

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.ktorclientsample.repository.GithubRepository
import kotlinx.coroutines.launch

class MAinViewModel : ViewModel() {

    fun getRepo() {
        viewModelScope.launch {
            val repo = GithubRepository().getRepo()
            repo.size
        }
    }
}
