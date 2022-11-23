package com.android.navigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController


class FragmentMain : Fragment() {
    val navHostFragment =
        supportFragmentManager.findFragmentById(R.id.fragmentMain) as NavHostFragment
    val navController = navHostFragment.navController
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

            findNavController().navigate(R.id.action_fragmentMain_to_fragmentViewTransaction22)

    }
}