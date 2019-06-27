package com.fawakeh.coderswag.Controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.fawakeh.coderswag.Model.Product
import com.fawakeh.coderswag.R
import com.fawakeh.coderswag.Utilities.EXTRA_PRODUCT
import kotlinx.android.synthetic.main.activity_product_detail.*
import kotlinx.android.synthetic.main.shopping_cart_item.*

class ProductscartActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_productscart)

    }
}
