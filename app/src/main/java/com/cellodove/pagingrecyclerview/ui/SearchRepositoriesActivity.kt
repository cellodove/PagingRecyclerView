package com.cellodove.pagingrecyclerview.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.KeyEvent
import android.view.inputmethod.EditorInfo
import androidx.activity.viewModels
import com.cellodove.pagingrecyclerview.databinding.ActivitySeachRepositoriesBinding

class SearchRepositoriesActivity : AppCompatActivity() {
    private val binding by lazy { ActivitySeachRepositoriesBinding.inflate(layoutInflater) }
    private val viewModel : SearchRepositoriesViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.searchRepo.setOnEditorActionListener { _, actionId, _ ->
            if (actionId == EditorInfo.IME_ACTION_GO) {
                search(binding.searchRepo.text.toString())
                true
            } else {
                false
            }
        }

        binding.searchRepo.setOnKeyListener { _, keyCode, event ->
            if (event.action == KeyEvent.ACTION_DOWN && keyCode == KeyEvent.KEYCODE_ENTER) {
                search(binding.searchRepo.text.toString())
                true
            } else {
                false
            }
        }
    }

    private fun search(name : String){
        viewModel.search(name)
    }
}