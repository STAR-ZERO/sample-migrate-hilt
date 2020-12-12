package com.star_zero.migrate_hilt.feature.ui

import android.util.Log
import androidx.lifecycle.ViewModel
import com.star_zero.migrate_hilt.core.repository.SampleRepository
import javax.inject.Inject

class FeatureViewModel @Inject constructor(
    private val repository: SampleRepository
): ViewModel() {

    fun execute() {
        Log.d("FeatureViewModel", "execute")
        repository.doSomething()
    }
}
