package com.shubham.navigationjetpackdemo


import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_first.*

class FirstFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_first, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        if (arguments != null) {
            tv_text.text = arguments?.getString("key", "Hi!!! args not received")
        }

        btn_bottom_nav.setOnClickListener {
            val intent = Intent(activity, BottomNavActivity::class.java)
            startActivity(intent)
        }

        btn_pop.setOnClickListener {
            findNavController().navigate(R.id.action_firstFragment_to_popEverythingFragment)
        }
    }


}
