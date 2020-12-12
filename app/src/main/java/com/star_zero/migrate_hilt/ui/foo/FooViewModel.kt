package com.star_zero.migrate_hilt.ui.foo

import android.util.Log
import androidx.lifecycle.ViewModel
import com.star_zero.migrate_hilt.core.repository.SampleRepository
import javax.inject.Inject

class FooViewModel @Inject constructor(
    private val repository: SampleRepository
): ViewModel() {

    fun execute() {
        Log.d("FooViewModel", "execute")
        repository.doSomething()
    }
}
