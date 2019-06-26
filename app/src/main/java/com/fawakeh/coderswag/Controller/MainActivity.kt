 package com.fawakeh.coderswag.Controller

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.fawakeh.coderswag.Adapters.CategoryAdapter
import com.fawakeh.coderswag.Adapters.CategoryRecyclerAdapter
import com.fawakeh.coderswag.Model.Category
import com.fawakeh.coderswag.R
import com.fawakeh.coderswag.Services.DataService
import com.fawakeh.coderswag.Utilities.EXTRA_CATEGORY
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_products.*
import kotlinx.android.synthetic.main.category_list_item.*

 class MainActivity : AppCompatActivity() {

     lateinit var adapter: CategoryRecyclerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = CategoryRecyclerAdapter(this, DataService.categories){category ->

            val productIntent = Intent(this, ProductsActivity:: class.java)
            productIntent.putExtra(EXTRA_CATEGORY, category.title)
            startActivity(productIntent)
            
        }
        categoryListView.adapter = adapter

       val layoutManager = LinearLayoutManager(this)
        categoryListView.layoutManager = layoutManager
        categoryListView.setHasFixedSize(true)


        }
    }

