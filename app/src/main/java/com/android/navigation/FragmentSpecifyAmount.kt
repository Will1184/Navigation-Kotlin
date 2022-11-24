package com.android.navigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_choose_recipient.*
import kotlinx.android.synthetic.main.fragment_main.*
import kotlinx.android.synthetic.main.fragment_specify_amount.*


/**
 * A simple [Fragment] subclass.
 * Use the [FragmentSpecifyAmount.newInstance] factory method to
 * create an instance of this fragment.
 */
class FragmentSpecifyAmount : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_specify_amount, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btn_send.setOnClickListener{
            Navigation.findNavController(view).navigate(R.id.action_fragmentSpecifyAmount_to_fragmentConfirmation)
        }
        btn_cancel.setOnClickListener{
            Navigation.findNavController(view).navigate(R.id.action_fragmentSpecifyAmount_to_fragmentChooseRecipient)
        }


    }
}