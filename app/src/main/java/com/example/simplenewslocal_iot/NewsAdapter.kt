package com.example.simplenewslocal_iot

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class NewsAdapter(
    private val newsData: List<News>,
) :
    RecyclerView.Adapter<NewsAdapter.NewsViewHolder>() {
    var data = newsData
        set(value) {
            field = value
            notifyDataSetChanged()
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewsViewHolder {
        var layoutInflater = LayoutInflater.from(parent.context)
        var view =
            layoutInflater.inflate(R.layout.news_list_item, parent, false)
        return NewsViewHolder(view)
    }

    override fun onBindViewHolder(holder: NewsViewHolder, position: Int) {
        val item = data[position]
        holder.bind(item)

    }


    override fun getItemCount() = data.size

    inner class NewsViewHolder(var itemView: View) :
        RecyclerView.ViewHolder(itemView) {
        val title: TextView = itemView.findViewById(R.id.tv_title)
        val description: TextView = itemView.findViewById(R.id.tv_description)
        val image: ImageView = itemView.findViewById(R.id.iv_news)

        fun bind(item: News) {
            title.text = item.title
            description.text = item.description
            image.setImageResource(item.image)
        }


    }
}