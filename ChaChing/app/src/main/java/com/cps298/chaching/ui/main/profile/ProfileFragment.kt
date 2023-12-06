package com.cps298.chaching.ui.main.profile

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
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import com.cps298.chaching.Contact
import com.cps298.chaching.R
import com.cps298.chaching.databinding.FragmentProfileBinding
import com.cps298.chaching.databinding.HomeFragmentBinding
import com.cps298.chaching.ui.main.ContactListAdapter

class ProfileFragment : Fragment() {

    private var adapter: ContactListAdapter? = null

    companion object {
        fun newInstance() = ProfileFragment()
    }

    val viewModel: ProfileViewModel by viewModels()
    private var _binding: FragmentProfileBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentProfileBinding.inflate(inflater, container, false)

        listenerSetup()
        observerSetup()
        recyclerSetup()

        return binding.root
    }

    private fun listenerSetup() {
        binding.profileDisplayButton.setOnClickListener{
            viewModel.getAllContacts()
            Log.d(tag, "Profile Display button clicked")
        }
    }

    private fun observerSetup() {

        viewModel.getAllContacts()?.observe(viewLifecycleOwner, Observer { contacts ->
            contacts?.let  {
                adapter?.setContactList(it)
                Log.d(tag, "getAllContacts observer activated")
            }
        })

        //ANDROID WANTED TO SPECIFY VIEWLIFECYCLEOWNER INSTEAD OF "THIS"
        //viewModel.getSearchResults().observe(this, Observer { products ->

        viewModel.getSearchResults().observe(viewLifecycleOwner, Observer { contacts ->

            contacts?.let {
                if(it.isNotEmpty()){
                    adapter?.setContactList(it)
                }
                /* else if (binding.cardName.text.isNotEmpty()) { //if nothing comes up in the recyclerview but there is text in the textbox
                     val toast = Toast.makeText(context, "There are no cards that match your search", Toast.LENGTH_SHORT)
                     toast.show()

                 }*/
                else {
                    val toast = Toast.makeText(context, "You must enter a search criteria in the name field", Toast.LENGTH_SHORT)
                    toast.show()
                    //show your toast here
                    //when there is nothing in the array
                }

                /*if (it.isNotEmpty()) {
                    //recyclerSetup()
                    Log.d(tag, "getSearchResults observer activated")
                    binding.contactID.text = String.format(Locale.US, "%d", it[0].id)
                    binding.contactName.setText(it[0].contactName)
                    binding.contactQuantity.setText(it[0].quantity)
                } else {
                    binding.contactID.text = "No Match"
                }*/
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
                Log.d("ProfileFragment", "deleteButton Detected, ID: " + id)
            }

        })
    }

}