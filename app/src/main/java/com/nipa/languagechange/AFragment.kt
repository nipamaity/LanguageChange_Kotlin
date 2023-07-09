package com.nipa.languagechange

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.nipa.languagechange.databinding.ActivityMainBinding
import com.nipa.languagechange.databinding.FragmentABinding
import com.nipa.languagechange.databinding.FragmentDashboardBinding


class AFragment : Fragment() {
    lateinit var binding: FragmentABinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentABinding.inflate(inflater, container, false)
        return binding.root
    }


}