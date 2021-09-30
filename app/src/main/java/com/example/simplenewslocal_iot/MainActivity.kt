package com.example.simplenewslocal_iot

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    lateinit var recyclerView: RecyclerView
    lateinit var layoutManager: LinearLayoutManager
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // init recycler view
        recyclerView = findViewById(R.id.rv_news)
        layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = layoutManager
        recyclerView.adapter = NewsAdapter(getFakeData())
    }

    fun getFakeData():List<News> = listOf(
        News(R.drawable.img1 , getString(R.string.title_one) , getString(R.string.description_one)),
        News(R.drawable.img2 , getString(R.string.title_two) , getString(R.string.description_two)),
        News(R.drawable.img3 , getString(R.string.title_three) , getString(R.string.description_three)),
        News(R.drawable.img4 , getString(R.string.title_four) , getString(R.string.description_four)),
        News(R.drawable.img5 , getString(R.string.title_five) , getString(R.string.description_five)),
        News(R.drawable.img6 , getString(R.string.title_six) , getString(R.string.description_six)),
        News(R.drawable.img7 , getString(R.string.title_seven) , getString(R.string.description_seven)),
        News(R.drawable.img8 , getString(R.string.title_eight) , getString(R.string.description_eight)),
        News(R.drawable.img9 , getString(R.string.title_nine) , getString(R.string.description_nine)),
        News(R.drawable.img10 , getString(R.string.title_ten) , getString(R.string.description_ten)),
    )
}