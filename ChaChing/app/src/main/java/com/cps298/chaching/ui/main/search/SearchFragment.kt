package com.cps298.chaching.ui.main.search

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.cps298.chaching.R
import com.cps298.chaching.databinding.FragmentProfileBinding
import com.cps298.chaching.databinding.FragmentSearchBinding
import com.cps298.chaching.ui.main.ContactListAdapter
import com.cps298.chaching.ui.main.profile.ProfileFragment
import com.cps298.chaching.ui.main.profile.ProfileViewModel

class SearchFragment : Fragment() {

    private var adapter: ContactListAdapter? = null

    companion object {
        fun newInstance() = ProfileFragment()
    }

    val viewModel: SearchViewModel by viewModels()
    private var _binding: FragmentSearchBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentSearchBinding.inflate(inflater, container, false)

        listenerSetup()
        observerSetup()
        recyclerSetup()

        return binding.root
    }

    private fun listenerSetup() {

        binding.searchButton.setOnClickListener {

            val cardNameSearch = binding.searchBox.text.toString()

            if (cardNameSearch != "") {
                viewModel.findContact(cardNameSearch)
            } else {
                val toast = Toast.makeText(context, "You must enter a card name", Toast.LENGTH_SHORT)
                toast.show()
            }
        }
    }
    private fun observerSetup() {

        //ANDROID WANTED TO SPECIFY VIEWLIFECYCLEOWNER INSTEAD OF "THIS"
        //viewModel.getSearchResults().observe(this, Observer { products ->

        viewModel.getSearchResults().observe(viewLifecycleOwner, Observer { contacts ->

            contacts?.let {
                if(it.isNotEmpty()){
                    adapter?.setContactList(it)
                }
                else if (binding.searchBox.text.isNotEmpty()) { //if nothing comes up in the recyclerview but there is text in the textbox
                    val toast = Toast.makeText(context, "There are no cards that match your search", Toast.LENGTH_SHORT)
                    toast.show()
                    //clearFields()
                    recyclerSetup() // reset recycle view when no cards are matched
                }
                else {
                    val toast = Toast.makeText(context, "You must enter a search criteria in the name field2", Toast.LENGTH_SHORT)
                    toast.show()
                    //show your toast here
                    //when there is nothing in the array
                }
            }
        })
    }

    private fun recyclerSetup() {
        adapter = ContactListAdapter(R.layout.contact_list_item)
        binding.contactRecycler.layoutManager = LinearLayoutManager(context)
        binding.contactRecycler.adapter = adapter

        adapter!!.settingListener(object: ContactListAdapter.onItemClickListener{
            //...code here to send the id to the deleteContact method of the mainviewmodel
            override fun onClick(id: String) {
                //return ()
                var contactId: Int = Integer.parseInt(id)
                viewModel.deleteContact(contactId)
                Log.d("SearchFragment", "deleteButton Detected, ID: " + id)
            }

        })
    }

    private fun clearFields() { //clear contacts on ui to prevent repetition
        binding.searchBox.setText("")

    }

}