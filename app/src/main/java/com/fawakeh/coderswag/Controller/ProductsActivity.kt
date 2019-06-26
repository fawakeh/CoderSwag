package com.fawakeh.coderswag.Controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.fawakeh.coderswag.R
import com.fawakeh.coderswag.Utilities.EXTRA_CATEGORY

class ProductsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_products)

       val categorytype = intent.getStringExtra(EXTRA_CATEGORY)

        println(categorytype)

    }
}
