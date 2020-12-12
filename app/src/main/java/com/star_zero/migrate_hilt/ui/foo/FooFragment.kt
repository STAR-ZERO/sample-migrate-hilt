package com.star_zero.migrate_hilt.ui.foo

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModelProvider
import com.star_zero.migrate_hilt.R
import com.star_zero.migrate_hilt.feature.ui.FeatureActivity
import dagger.android.support.DaggerFragment
import javax.inject.Inject

class FooFragment : DaggerFragment(R.layout.fragment_foo) {

    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory

    private val viewModel: FooViewModel by viewModels { viewModelFactory }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<Button>(R.id.button).setOnClickListener {
            startActivity(Intent(requireContext(), FeatureActivity::class.java))
        }

        viewModel.execute()
    }
}
