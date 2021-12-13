package com.cellodove.pagingrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.cellodove.pagingrecyclerview.databinding.ActivitySeachRepositoriesBinding

class SearchRepositoriesActivity : AppCompatActivity() {
    val binding by lazy { ActivitySeachRepositoriesBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }

}