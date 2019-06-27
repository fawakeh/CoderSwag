package com.fawakeh.coderswag.Controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.fawakeh.coderswag.Adapters.Products_adapter
import com.fawakeh.coderswag.Model.Product
import com.fawakeh.coderswag.R
import com.fawakeh.coderswag.Utilities.EXTRA_PRODUCT
import kotlinx.android.synthetic.main.activity_product_detail.*

class ProductDetailActivity : AppCompatActivity() {

    lateinit var adapter: Products_adapter
    var product = Product("","","","")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product_detail)


        val product = intent.getParcelableExtra<Product>(EXTRA_PRODUCT)
        val resourceId = resources.getIdentifier(product.image, "drawable", packageName)
        productImage.setImageResource(resourceId)
        productTitle.text = product.title
        productPrice.text = product.price
        productDescription.text = product.description


    }



}
