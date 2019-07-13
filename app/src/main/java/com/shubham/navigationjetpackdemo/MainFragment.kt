package com.shubham.navigationjetpackdemo


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_main.*

class MainFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_main, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        btn_first.setOnClickListener {
            val args=Bundle()
            args.putString("key","Hi!!! I am text from args")
            findNavController().navigate(R.id.action_mainFragment_to_firstFragment,args)
        }
        btn_second.setOnClickListener {
            findNavController().navigate(R.id.action_mainFragment_to_secondFragment)
        }

    }
}
