package com.example.chahatbhai.News

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.get
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.chahatbhai.R


class NewsFragment : Fragment() {

    private lateinit var newsViewModel: NewsViewModel
    private lateinit var adapter: NewsAdapter
    private lateinit var recyclerView: RecyclerView
    private lateinit var newsArrayList: ArrayList<News>
    lateinit var descList: Array<String>
    lateinit var detailImageList: Array<Int>

    lateinit var imageId :Array<Int>
    lateinit var heading: Array<String>
    lateinit var news : Array<String>


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        newsViewModel=ViewModelProvider(this).get(NewsViewModel::class.java)
        val root=inflater.inflate(R.layout.fragment_news,container,false)

        return root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        dataInitialize()
        val layoutManager= LinearLayoutManager(context)
        recyclerView=view.findViewById(R.id.recyclerView)
        recyclerView.layoutManager=layoutManager
        recyclerView.setHasFixedSize(true)
        adapter=NewsAdapter(newsArrayList)
        recyclerView.adapter=adapter
    }

    private fun dataInitialize(){

        newsArrayList= arrayListOf<News>()

        imageId= arrayOf(
            R.drawable.bit1,
            R.drawable.bit2,
            R.drawable.bit3
        )

        heading= arrayOf(
            getString(R.string.head_1),
            getString(R.string.head_2),
            getString(R.string.head_3)
        )

        descList= arrayOf(
            getString(R.string.news_1),
            getString(R.string.news_2),
            getString(R.string.news_3)
        )

        detailImageList= arrayOf(
            R.drawable.bit1,
            R.drawable.bit2,
            R.drawable.bit3
        )

        news = arrayOf(
            getString(R.string.news_1),
            getString(R.string.news_2),
            getString(R.string.news_3)
        )

        for (i in imageId.indices){
            val news= News(imageId[i],heading[i],descList[i], detailImageList[i])
            newsArrayList.add(news)
        }
    }
}