package com.example.chahatbhai.News

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.View.OnClickListener
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.example.chahatbhai.R
import com.google.android.material.imageview.ShapeableImageView

class NewsAdapter(private val newsList :ArrayList<News>):RecyclerView.Adapter<NewsAdapter.NewsViewHolder>() {


    class NewsViewHolder(itemView: View):RecyclerView.ViewHolder(itemView)
    {
        val titleImage: ShapeableImageView= itemView.findViewById(R.id.title_image)
        val tvHeading: TextView = itemView.findViewById(R.id.tvHeading)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewsViewHolder {
       val itemView= LayoutInflater.from(parent.context).inflate(R.layout.list_item,parent,false)
        return NewsViewHolder(itemView)
    }

    override fun getItemCount(): Int {
       return newsList.size
    }

    override fun onBindViewHolder(holder: NewsViewHolder, @SuppressLint("RecyclerView") position: Int) {
       val currentItem= newsList[position]
        holder.titleImage.setImageResource(currentItem.titleImage)

        holder.tvHeading.text=currentItem.heading

        holder.itemView.setOnClickListener{ view ->
            view.findNavController().navigate(R.id.action_nav_news_to_detailFragment)
        }
    }
}