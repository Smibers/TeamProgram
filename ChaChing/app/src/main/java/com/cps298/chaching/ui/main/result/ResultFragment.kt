package com.cps298.chaching.ui.main.result

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import com.cps298.chaching.R
import com.cps298.chaching.databinding.FragmentResultBinding
import com.cps298.chaching.ui.main.ContactListAdapter

class ResultFragment : Fragment() {

    private var adapter: ContactListAdapter? = null
    private val viewModel: ResultViewModel by viewModels()
    private lateinit var binding: FragmentResultBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
//        val view = inflater.inflate(R.layout.fragment_result, container, false)
//        Log.d("ResultFragment ", "ResultFragment Ran")
//
//        val category = arguments?.getString("category")
//
//        category?.let {
//            // Use it to query your database and populate RecyclerView
//            //loadDataBasedOnCategory(it)
//            Log.d("ResultFragment ", "Category: $it") //does not run for some reason
//            //println("Category: $it")
//        }
//
//        observerSetup(category)

        // Initialize the binding properly, code above caused an error due to a lateinit
        binding = FragmentResultBinding.inflate(inflater, container, false)
        val view = binding.root

        val category = arguments?.getString("category")
        category?.let {
            Log.d("ResultFragment", "Category: $it")
            observerSetup(it)
        }

        recyclerSetup()

        return view

        recyclerSetup()


        return view
    }

    private fun observerSetup(category: String?) {
        category?.let {
            viewModel.getContactsByCategory(it)?.observe(viewLifecycleOwner, Observer { contacts ->
                contacts?.let {
                    adapter?.setContactList(it)
                }
            })
        }
    }

    private fun loadDataBasedOnCategory(category: String) {
        // Your code to load data based on the category
    }

    private fun recyclerSetup() {
        adapter = ContactListAdapter(R.layout.contact_list_item, true)
        binding.contactRecycler.layoutManager = LinearLayoutManager(context)
        binding.contactRecycler.adapter = adapter
        //now i want to hide the deletebtn

        adapter!!.settingListener(object: ContactListAdapter.onItemClickListener{
            //...code here to send the id to the deleteContact method of the mainviewmodel
            override fun onClick(id: String) {
                //return ()
                var contactId: Int = Integer.parseInt(id)
                viewModel.deleteContact(contactId)
                Log.d("ProfileFragment", "deleteButton Detected, ID: " + id)
            }

        })
    }


}