package com.example.passportotabekaka.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.passportotabekaka.R
import com.example.passportotabekaka.adapters.MyRvAdapter
import com.example.passportotabekaka.databinding.FragmentGivePassportBinding
import com.example.passportotabekaka.db.AppDatabase
import com.example.passportotabekaka.models.User

class GivePassportFragment : Fragment() {
    private lateinit var binding: FragmentGivePassportBinding
    private lateinit var appDatabase: AppDatabase
    private lateinit var list: ArrayList<User>
    private lateinit var myRvAdapter: MyRvAdapter
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
       binding = FragmentGivePassportBinding.inflate(layoutInflater)

        appDatabase = AppDatabase.getInstance(binding.root.context)
        list = ArrayList()
        list.addAll(appDatabase.myDao().getAllUser())
        myRvAdapter = MyRvAdapter(list)
        binding.rv.adapter = myRvAdapter
        myRvAdapter.notifyItemInserted(list.size-1)

        binding.addUser.setOnClickListener {

            findNavController().navigate(R.id.addUserFragment2)
        }

        return binding.root

    }

}