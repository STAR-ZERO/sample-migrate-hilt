package com.star_zero.migrate_hilt.feature.ui

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.star_zero.migrate_hilt.feature.R
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class FeatureActivity: AppCompatActivity() {

    private val viewModel: FeatureViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_feature)

        viewModel.execute()
    }
}
