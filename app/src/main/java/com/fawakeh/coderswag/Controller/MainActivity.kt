 package com.fawakeh.coderswag.Controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import com.fawakeh.coderswag.Adapters.CategoryAdapter
import com.fawakeh.coderswag.Model.Category
import com.fawakeh.coderswag.R
import com.fawakeh.coderswag.Services.DataService
import kotlinx.android.synthetic.main.activity_main.*

 class MainActivity : AppCompatActivity() {

     lateinit var adapter: CategoryAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = CategoryAdapter(this, DataService.categories)

        categoryListView.adapter = adapter

       

        }
    }


 }
