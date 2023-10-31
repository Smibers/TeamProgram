package com.ebookfrenzy.roomdemo.ui.main



import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.ebookfrenzy.roomdemo.R

import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import com.ebookfrenzy.roomdemo.Contact
import androidx.fragment.app.viewModels
import androidx.lifecycle.LiveData
import com.ebookfrenzy.roomdemo.ContactRepository

import java.util.*

import com.ebookfrenzy.roomdemo.databinding.MainFragmentBinding

class MainFragment : Fragment() {
    //add button listeners
    //add observers on live data

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

        listenerSetup()
        observerSetup()
        recyclerSetup()

        return binding.root
    }

    /*DEPRECATED SO I MOVED THE FUNCTION CALLS TO ONCREATEVIEW
    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        listenerSetup()
        observerSetup()
        recyclerSetup()

    }*/

    private fun listenerSetup() {

        binding.addButton.setOnClickListener {
            val cardName = binding.cardName.text.toString()
            val cardBrand = binding.cardBrand.text.toString()
            val fee = binding.fee.text.toString()
            val perk = binding.perk.text.toString()
            val useCategory = binding.useCategory.text.toString()
            val ownership = binding.ownership.text.toString()

            if (cardName != "" && cardBrand != "" && fee != "" && perk != "" && useCategory != "") {
                val contact = Contact(cardName , cardBrand, fee, ownership, perk, useCategory  )
                viewModel.insertContact(contact)
                clearFields()
            } else {
                val toast = Toast.makeText(context, "You must enter values for all boxes", Toast.LENGTH_SHORT)
                toast.show()
                //binding.contactID.text = "Incomplete information"
            }
        }

        binding.descButton.setOnClickListener {
            viewModel.getAllContactsDesc()
            Log.d(tag, "DESC button clicked") }

        binding.ascButton.setOnClickListener {
            viewModel.getAllContactsAsc()
            Log.d(tag, "ASC button clicked") }

        binding.findButton.setOnClickListener { viewModel.findContact(binding.cardName.text.toString()) }

        binding.deleteButton.setOnClickListener {
            //val userInput = Integer.parseInt(binding.contactName.text.toString())
            //viewModel.deleteContact(userInput)//checks if user has entered the right name before deleting, i'll have to
            //repurpose this for use with the trashcan probably, I can compare it to a hidden value stored in the recyclerview
            clearFields()
        }
    }

    private fun observerSetup() {

        viewModel.getAllContacts()?.observe(viewLifecycleOwner, Observer { contacts ->
            contacts?.let  {
                adapter?.setContactList(it)
                Log.d(tag, "getAllContacts observer activated")
            }
        })

        /*viewModel.getAllContactsDesc()?.observe(viewLifecycleOwner, Observer { contacts ->
            contacts?.let  {
                adapter?.setContactList(it)
                Log.d(tag, "DESC observer activated")
            }
        })

        viewModel.getAllContactsAsc()?.observe(viewLifecycleOwner, Observer { contacts ->
            contacts?.let  {
                adapter?.setContactList(it)
                Log.d(tag, "ASC observer activated")
            }
        })
*/
        //ANDROID WANTED TO SPECIFY VIEWLIFECYCLEOWNER INSTEAD OF "THIS"
        //viewModel.getSearchResults().observe(this, Observer { products ->

        viewModel.getSearchResults().observe(viewLifecycleOwner, Observer { contacts ->

            contacts?.let {
                if(it.isNotEmpty()){
                    adapter?.setContactList(it)
                }
                else if (binding.cardName.text.isNotEmpty()) { //if nothing comes up in the recyclerview but there is text in the textbox
                    val toast = Toast.makeText(context, "There are no cards that match your search", Toast.LENGTH_SHORT)
                    toast.show()

                }
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
                Log.d("MainFragment", "deleteButton Detected, ID: " + id)
            }

        })
    }

    private fun clearFields() { //clear contacts on ui to prevent repetition
        binding.contactID.text = ""
        binding.cardName.setText("")
        binding.cardBrand.setText("")
        binding.fee.setText("")
        binding.ownership.setText("")
        binding.useCategory.setText("")
        binding.perk.setText("")
    }

}