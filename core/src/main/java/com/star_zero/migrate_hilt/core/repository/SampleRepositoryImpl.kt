package com.star_zero.migrate_hilt.core.repository

import android.util.Log
import com.star_zero.migrate_hilt.core.api.SampleAPI
import javax.inject.Inject

class SampleRepositoryImpl @Inject constructor(
    private val api: SampleAPI
) : SampleRepository {

    override fun doSomething() {
        Log.d("SampleRepositoryImpl", "DO SOMETHING")
    }
}
