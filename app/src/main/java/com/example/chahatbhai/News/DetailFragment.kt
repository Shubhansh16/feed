package com.example.chahatbhai.News

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider
import com.example.chahatbhai.R


class DetailFragment : Fragment() {

    lateinit var viewModel: DetalViewModel

    private lateinit var detailTitle: TextView
    private lateinit var detailImageView: ImageView
    private lateinit var detailDescription: TextView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
       val view: View=inflater.inflate(R.layout.activity_detail,container,false)

        detailTitle=view.findViewById(R.id.detailTitle)
        detailImageView=view.findViewById(R.id.detailImage)
        detailDescription=view.findViewById(R.id.detailDescription)

        viewModel=ViewModelProvider(this).get(DetalViewModel::class.java)
        return view
    }
}