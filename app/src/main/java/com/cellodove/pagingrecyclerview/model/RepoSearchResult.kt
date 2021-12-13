package com.cellodove.pagingrecyclerview.model

import java.lang.Exception

/**
 * RepoSearchResult from a search, which contains List<Repo> holding query data,
 * and a String of network error state.
 */
sealed class RepoSearchResult {
    data class Success(val data: List<GithubRepo>) : RepoSearchResult()
    data class Error(val error: Exception) : RepoSearchResult()
}
