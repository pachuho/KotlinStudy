package kr.juho.navigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation

// TODO: Rename parameter arguments, choose names that match

class SecondFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_second, container, false)
        view.findViewById<Button>(R.id.btn_second).setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_secondFragment_to_thirdFragment)
        }
        // Inflate the layout for this fragment
        return view
    }

}