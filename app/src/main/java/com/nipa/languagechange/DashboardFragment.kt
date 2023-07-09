package com.nipa.languagechange

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ArrayAdapter
import androidx.navigation.Navigation.findNavController
import androidx.navigation.fragment.findNavController
import com.nipa.languagechange.LanguageManager.Companion.languageCodeList
import com.nipa.languagechange.LanguageManager.Companion.languageList
import com.nipa.languagechange.databinding.FragmentABinding
import com.nipa.languagechange.databinding.FragmentDashboardBinding


class DashboardFragment : Fragment() {
    lateinit var binding: FragmentDashboardBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
         binding = FragmentDashboardBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        val adapter = ArrayAdapter(requireContext(), android.R.layout.simple_spinner_item, languageList.toList())
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        binding.spinnerLanguage.adapter = adapter
        binding.btnGo.setOnClickListener { view -> findNavController().navigate(R.id.action_dashboardFragment_to_AFragment) }

        binding.spinnerLanguage.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
              if(position>0){
                  LanguageManager.getLanguage=languageCodeList[position]
              }

            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                // Handle no selection
            }
        }
        binding.btnChangeLanguage.setOnClickListener {
            view -> btnChangeLanguage()
        }


    }
    fun btnChangeLanguage(){
        requireActivity().recreate();
    }

}