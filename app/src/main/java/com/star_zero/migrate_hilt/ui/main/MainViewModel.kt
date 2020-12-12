package com.star_zero.migrate_hilt.ui.main

import android.util.Log
import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel
import com.star_zero.migrate_hilt.core.repository.SampleRepository

class MainViewModel @ViewModelInject constructor(
    private val repository: SampleRepository
) : ViewModel() {

    fun execute() {
        Log.d("MainViewModel", "execute")
        repository.doSomething()
    }
}
