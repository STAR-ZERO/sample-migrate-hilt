package com.star_zero.migrate_hilt.feature.ui

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.star_zero.migrate_hilt.feature.R
import com.star_zero.migrate_hilt.feature.di.FeatureComponentProvider
import javax.inject.Inject

class FeatureActivity: AppCompatActivity() {

    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory

    private val viewModel: FeatureViewModel by viewModels { viewModelFactory }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_feature)

        val component = (applicationContext as FeatureComponentProvider).provideFeatureComponent()
        component.inject(this)

        viewModel.execute()
    }
}
