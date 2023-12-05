package com.cps298.chaching.ui.main

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.cps298.chaching.Contact
import com.cps298.chaching.R

import com.cps298.chaching.databinding.ContactListItemBinding
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale




class ContactListAdapter(private val contactItemLayout: Int) :  RecyclerView.Adapter<ContactListAdapter.ViewHolder>() {
    private var _binding: ContactListItemBinding? = null
    var listener: onItemClickListener? = null


    private var contactList: List<Contact>? = null

    //THIS IS CALLED WHEN SETTING IT TO THE ADAPTER
    fun settingListener(listener: onItemClickListener?) {
        this.listener = listener
    }

    //THIS IS THE INTERFACE
    interface onItemClickListener {
        fun onClick(str: String){
            Log.d("ContactListAdapter", "onItemClickListener ran")
        } //pass your object types.
    }

    override fun onBindViewHolder(holder: ViewHolder, listPosition: Int) { //set contact list
        val item = holder.item
        val item2 = holder.item2
        val item3 = holder.item3
        val item4 = holder.item4
        val item5 = holder.item5
        val item6 = holder.item6
        val item7 = holder.item7
        val deleteBtn = holder.deleteBtn
        contactList.let {
            item.text = it!![listPosition].cardName
            item2.text = it!![listPosition].cardBrand
            item3.text = it!![listPosition].id.toString() //store PK in view so when I go to delete I can delete by PK
            item4.text = it!![listPosition].fee
            item5.text = it!![listPosition].perk
            item6.text = it!![listPosition].useCategory
            item7.text = it!![listPosition].expiration

            //check if card is expired, set text red
            val currentDate: String =
                SimpleDateFormat("MM-yyyy", Locale.getDefault()).format(Date())
            if (item7.text.equals(currentDate)){

                item7.setTextColor (0xFFFF0000.toInt()) //red

            }
        }


        //WE NEED THIS TO CALL THE ONCLICK IN THE ONBINDVIEWHOLDER
        //var listener: onItemClickListener? = null

        //onClickListener for delete button (trash icon)

        //used binding to detect deleteButton
        deleteBtn.setOnClickListener(View.OnClickListener {
            //...some code here to get the id of the record
            Log.d("ContactListAdapter", "deleteButton Detected")
            Log.d("ContactListAdapter", "contact ID:" + item3.text.toString())
            var id = item3.text.toString()
            //var intId = Integer.parseInt(id)
            listener?.onClick(id) //return item3 as that is the PK ID
        })
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):
            ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(
            contactItemLayout, parent, false)
        return ViewHolder(view)
    }

    fun setContactList(contacts: List<Contact>) {
        Log.d("ContactListAdapter", "notifyDataSetChanged")
        contactList = contacts
        notifyDataSetChanged() //UPDATE RECYCLERVIEW, NEEDS TO BE DONE WHEN ITEM ADDED/DELETED/MODIFIED or possibly even when ASC/DESC
    }

    override fun getItemCount(): Int {
        return if (contactList == null) 0 else contactList!!.size
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) { //viewholder values
        var item: TextView = itemView.findViewById(R.id.contact_row)
        var item2: TextView = itemView.findViewById(R.id.number_row)
        var item3: TextView = itemView.findViewById(R.id.primarykey_row)
        var item4: TextView = itemView.findViewById(R.id.fee_row)
        var item5: TextView = itemView.findViewById(R.id.perk_row)
        var item6: TextView = itemView.findViewById(R.id.useCategory_row)
        var item7: TextView = itemView.findViewById(R.id.ownership_row)
        val deleteBtn: ImageView = itemView.findViewById(R.id.deleteBtn) //First in the adapter you need to add the delete button
    }
}