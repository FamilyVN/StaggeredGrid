package com.tuananh.staggeredgrid

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.StaggeredGridLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*


class MainActivity : AppCompatActivity() {
    private var personNameList: MutableList<String> = mutableListOf(
            "Person 1", "Person 2",
            "Person 3", "Person 4",
            "Person 5", "Person 6",
            "Person 7", "Person 8",
            "Person 9", "Person 10",
            "Person 11", "Person 12",
            "Person 13", "Person 14")
    private var personImageList: MutableList<Int> = mutableListOf(
            R.drawable.person1, R.drawable.person2,
            R.drawable.person3, R.drawable.person4,
            R.drawable.person5, R.drawable.person6,
            R.drawable.person7, R.drawable.person8,
            R.drawable.person9, R.drawable.person10,
            R.drawable.person11, R.drawable.person12,
            R.drawable.person13, R.drawable.person14)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val staggeredGridLayoutManager = StaggeredGridLayoutManager(3, LinearLayoutManager.VERTICAL)
        recyclerView.layoutManager = staggeredGridLayoutManager
        Collections.shuffle(personImageList)
        val customAdapter = CustomAdapter(this, personNameList, personImageList)
        recyclerView.adapter = customAdapter
        btnRefresh.setOnClickListener {
            Collections.shuffle(personImageList)
            customAdapter.notifyDataSetChanged()
        }
    }
}
