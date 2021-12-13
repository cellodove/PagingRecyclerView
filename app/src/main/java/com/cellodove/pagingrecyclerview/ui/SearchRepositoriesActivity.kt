package com.cellodove.pagingrecyclerview.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.KeyEvent
import android.view.inputmethod.EditorInfo
import com.cellodove.pagingrecyclerview.databinding.ActivitySeachRepositoriesBinding

class SearchRepositoriesActivity : AppCompatActivity() {
    private val binding by lazy { ActivitySeachRepositoriesBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.searchRepo.setOnEditorActionListener { _, actionId, _ ->
            if (actionId == EditorInfo.IME_ACTION_GO) {
                binding.searchRepo.text
                true
            } else {
                false
            }
        }

        binding.searchRepo.setOnKeyListener { _, keyCode, event ->
            if (event.action == KeyEvent.ACTION_DOWN && keyCode == KeyEvent.KEYCODE_ENTER) {
                binding.searchRepo.text
                true
            } else {
                false
            }
        }



    }
}