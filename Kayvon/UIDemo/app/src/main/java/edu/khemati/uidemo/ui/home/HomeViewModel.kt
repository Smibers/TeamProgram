package edu.khemati.uidemo.ui.home

import android.view.View
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HomeViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is home Fragment"
    }
    val text: LiveData<String> = _text


    //handle when groceryButton is clicked
    fun onGroceryButton(view: View) {
        _text.value = "Grocery Button Clicked" //this should send the user to another fragment
        //such as groceries, or any other category, I think it can be modular (like checking which button was clicked)
        //but for testing purposes we can just send the user to the grocery fragment
    }

}

