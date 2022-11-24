package com.android.navigation

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import kotlinx.android.synthetic.main.fragment_confirmation.*
import kotlinx.android.synthetic.main.fragment_confirmation.view.*
import kotlinx.android.synthetic.main.fragment_specify_amount.*
import org.w3c.dom.Text


/**
 * A simple [Fragment] subclass.
 * create an instance of this fragment.
 */
class FragmentConfirmation : Fragment() {

    val args:FragmentConfirmationArgs by navArgs()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        val view=inflater.inflate(R.layout.fragment_confirmation, container, false)

        val textMessage=args.name
        view.text_confirmation.text= textMessage
        return view

    }


}