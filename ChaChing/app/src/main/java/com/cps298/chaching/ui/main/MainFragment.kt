package com.cps298.chaching.ui.main

//MainFragment doesnt do anything except display a framelayout that will be replaced by the
//MainFragment2 fragment, which is the actual main fragment, onCreateView
//then when a user wants to go to the search menu it calls the onButtonClicked method
//inside MainFragment2 which will replace the framelayout with the search fragment
//this primarily a demo of how the project will head in terms of navigation
//MainFragment can be emptied minus the onCreateView method.


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.cps298.chaching.R

import androidx.fragment.app.viewModels

import com.cps298.chaching.databinding.MainFragmentBinding
import com.cps298.chaching.ui.main.home.HomeFragment

class MainFragment : Fragment() {
    //NOTE DEC 4: I cleared out MainFragment and main_fragment.xml of all code except for the
    //onCreateView method where it transitions to MainFragment2

    private var adapter: ContactListAdapter? = null

    companion object {
        fun newInstance() = MainFragment()
    }

    val viewModel: MainViewModel by viewModels()
    private var _binding: MainFragmentBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = MainFragmentBinding.inflate(inflater, container, false)

        val newFragment = HomeFragment()
        val transaction = parentFragmentManager.beginTransaction()
        transaction.replace(R.id.frameLayout, newFragment)
        transaction.addToBackStack(null)
        transaction.commit()


//        listenerSetup()
//        observerSetup()
//        recyclerSetup()

        return binding.root

    }


}