package com.star_zero.migrate_hilt.ui.foo

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.star_zero.migrate_hilt.R
import com.star_zero.migrate_hilt.feature.ui.FeatureActivity
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class FooFragment : Fragment(R.layout.fragment_foo) {

    private val viewModel: FooViewModel by viewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<Button>(R.id.button).setOnClickListener {
            startActivity(Intent(requireContext(), FeatureActivity::class.java))
        }

        viewModel.execute()
    }
}
