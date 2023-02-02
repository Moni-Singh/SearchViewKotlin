package com.example.searchviewkotlin

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.util.*

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView

    private var mList = ArrayList<Pre_requisitiesData>()
    private lateinit var adapter: Pre_requisitiesAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(this)
        addDataToList()
        adapter = Pre_requisitiesAdapter(mList)
        recyclerView.adapter = adapter

    }

    private fun addDataToList() {
        mList.add(Pre_requisitiesData("Visa", R.drawable.ic_baseline_check_circle_24,))

        mList.add(Pre_requisitiesData("Password", R.drawable.ic_baseline_check_circle_24,))

        mList.add(Pre_requisitiesData("Email", R.drawable.ic_baseline_check_circle_24,))

        mList.add(Pre_requisitiesData("Adharcard", R.drawable.ic_baseline_check_circle_24,))

        mList.add(Pre_requisitiesData("Pancard", R.drawable.ic_baseline_check_circle_24,))

        mList.add(Pre_requisitiesData("Phone no", R.drawable.ic_baseline_check_circle_24,))

        mList.add(Pre_requisitiesData("KYC", R.drawable.ic_baseline_check_circle_24,))

    }
}