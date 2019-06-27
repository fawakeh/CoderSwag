package com.fawakeh.coderswag.Controller

import android.content.Intent
import android.content.res.Configuration
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Adapter
import android.widget.GridLayout
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.GridLayoutManager
import com.fawakeh.coderswag.Adapters.Products_adapter
import com.fawakeh.coderswag.Model.Product
import com.fawakeh.coderswag.R
import com.fawakeh.coderswag.Services.DataService
import com.fawakeh.coderswag.Utilities.EXTRA_CATEGORY
import com.fawakeh.coderswag.Utilities.EXTRA_PRODUCT
import kotlinx.android.synthetic.main.activity_products.*



class ProductsActivity : AppCompatActivity() {


  var product = Product("","","","")

    lateinit var adapter: Products_adapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_products)

       val categorytype = intent.getStringExtra(EXTRA_CATEGORY)
        adapter = Products_adapter(this, DataService.getProducts(categorytype)){product ->
            var productDetailIntent = Intent(this, ProductDetailActivity :: class.java)
            productDetailIntent.putExtra(EXTRA_PRODUCT, product )
           startActivity(productDetailIntent)

        }

        var spanCount = 2
        val orientation = resources.configuration.orientation
        if (orientation == Configuration.ORIENTATION_LANDSCAPE){
            spanCount = 3
        }

        val screenSize = resources.configuration.screenWidthDp
        if (screenSize > 720){
            spanCount = 3
        }

        var layoutManager = GridLayoutManager(this, spanCount)
        productyListView.layoutManager = layoutManager
        productyListView.adapter = adapter



    }
    fun onShoppingCartClicked(view: View){
        val addToCart = Intent(this, ProductscartActivity::class.java)
       startActivity(addToCart)
    }
}
