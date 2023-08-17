package com.example.recyclerview

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : ComponentActivity() {
    data class MyData(val value1: String, val value2: String)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val recyclerView : RecyclerView = findViewById(R.id.recyclerView);
        recyclerView.layoutManager = LinearLayoutManager(this)

        val  item = fetchData();
        val adapter = MyAdapter(item)
        recyclerView.adapter= adapter



    }
    private fun fetchData(): ArrayList<MyData> {
        val list = ArrayList<MyData>()
        for (i in 0 until 20) {
            val name = "name $i"
            val email = "email$i@mail.com"
            val data = MyData(name, email)
            list.add(data)
        }
        return list
    }

}


