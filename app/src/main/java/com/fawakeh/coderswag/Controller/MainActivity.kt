 package com.fawakeh.coderswag.Controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.fawakeh.coderswag.Model.Category
import com.fawakeh.coderswag.R
import com.fawakeh.coderswag.Services.DataService
import kotlinx.android.synthetic.main.activity_main.*

 class MainActivity : AppCompatActivity() {

     lateinit var adapter: ArrayAdapter<Category>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = ArrayAdapter(this,android.R.layout.simple_list_item_1, DataService.categories)

        categoryListView.adapter = adapter
    }


 }
