package com.star_zero.migrate_hilt.ui.main

import android.util.Log
import androidx.lifecycle.ViewModel
import com.star_zero.migrate_hilt.core.repository.SampleRepository
import javax.inject.Inject

class MainViewModel @Inject constructor(
    private val repository: SampleRepository
) : ViewModel() {

    fun execute() {
        Log.d("MainViewModel", "execute")
        repository.doSomething()
    }
}
