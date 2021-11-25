package kr.juho.navigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation

class ThirdFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_third, container, false)
        view.findViewById<Button>(R.id.btn_third).setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_thirdFragment_to_firstFragment)
        }
        // Inflate the layout for this fragment
        return view
    }
}