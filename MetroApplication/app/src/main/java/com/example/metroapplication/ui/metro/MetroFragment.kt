package com.example.metroapplication.ui.metro

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.metroapplication.R

class MetroFragment : Fragment() {

    private lateinit var metroViewModel: MetroViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        metroViewModel =
                ViewModelProvider(this).get(MetroViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_metro, container, false)
        val textView: TextView = root.findViewById(R.id.text_metro)
        metroViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }
}