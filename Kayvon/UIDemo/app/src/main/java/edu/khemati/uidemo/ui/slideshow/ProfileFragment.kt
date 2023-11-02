package edu.khemati.uidemo.ui.slideshow

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import edu.khemati.uidemo.R
import edu.khemati.uidemo.databinding.FragmentProfileBinding

class ProfileFragment : Fragment() {

private var _binding: FragmentProfileBinding? = null
  // This property is only valid between onCreateView and
  // onDestroyView.
  private val binding get() = _binding!!

  override fun onCreateView(
    inflater: LayoutInflater,
    container: ViewGroup?,
    savedInstanceState: Bundle?
  ): View {
    val profileViewModel =
            ViewModelProvider(this).get(ProfileViewModel::class.java)

    _binding = FragmentProfileBinding.inflate(inflater, container, false)
    val root: View = binding.root

    val textView: TextView = binding.textSlideshow
    profileViewModel.text.observe(viewLifecycleOwner) {
      textView.text = it
    }
    return root
  }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val fab: FloatingActionButton? = activity?.findViewById(R.id.fab)
        Log.d("Debug", "FloatingActionButton")
        fab?.show()
        //show the fab when entering the profile
        fab?.setOnClickListener {
            //Handle click events here (like starting edit mode)
            Snackbar.make(view, "This will let you delete cards", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }

    }

override fun onDestroyView() {
        super.onDestroyView()
        val fab: FloatingActionButton? = activity?.findViewById(R.id.fab)
        fab?.hide() //hide fab when exiting profile
        _binding = null
    }
}