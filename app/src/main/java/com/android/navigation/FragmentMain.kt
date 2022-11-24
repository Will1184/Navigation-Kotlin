package com.android.navigation

import android.os.Bundle
import android.view.LayoutInflater
import androidx.fragment.app.Fragment
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_main.*

/**
* A simple [Fragment] subclass
*/
class FragmentMain : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_main,container,false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btn_transaction.setOnClickListener{
            Navigation.findNavController(view).navigate(R.id.action_fragmentMain_to_fragmentViewTransaction22)
        }
        btn_balance.setOnClickListener{
            Navigation.findNavController(view).navigate(R.id.action_fragmentMain_to_fragmentViewBalance)
        }
        btn_sendMoney.setOnClickListener{
            Navigation.findNavController(view).navigate(R.id.action_fragmentMain_to_fragmentChooseRecipient)
        }
    }

}