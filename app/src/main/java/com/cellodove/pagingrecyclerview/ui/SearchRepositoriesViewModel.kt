package com.cellodove.pagingrecyclerview.ui

import android.util.Log
import androidx.lifecycle.ViewModel
import com.cellodove.pagingrecyclerview.repository.GithubRepository
import com.cellodove.pagingrecyclerview.repository.api.GithubService
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.launch

class SearchRepositoriesViewModel : ViewModel() {
    private val baseJob = SupervisorJob()
    private val uiScope = CoroutineScope(Dispatchers.IO + baseJob)
    private val repository = GithubRepository(GithubService.create())

    fun search(name : String){
        uiScope.launch {
            var repoSearchResult = repository.getSearchResultStream(name)
            Log.e("repoSearchResult","repoSearchResult: $repoSearchResult")
        }
    }
}