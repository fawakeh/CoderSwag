package com.fawakeh.coderswag.Services

import com.fawakeh.coderswag.Model.Category
import com.fawakeh.coderswag.Model.Product

object DataService {

    val categories = listOf(
        Category("SHIRTS", "shirtimage"),
        Category("HOODIES", "hoodieimage"),
        Category("HATS", "hatimage"),
        Category("DIGITAL", "digitalgoodsimage")
    )

    val hats = listOf(
        Product("devslopes Graphic Beanie", "$18", "hat1"),
        Product("devslopes Hat Black", "$21", "hat2"),
        Product("devslopes Hat White", "$17", "hat3"),
        Product("devslopes Blue Beanie", "$25", "hat4")
    )

    val hoodies = listOf(
        Product("Devslopes Hoddie Gray", "$28", "hoodie1"),
        Product("Devslopes Hoddie Blue", "$32", "hoodie2"),
        Product("Devslopes Hoddie Black", "$35", "hoodie3"),
        Product("Devslopes Hoddie Yellow", "$37", "hoodie4")
    )

    val shirts = listOf(
        Product("Devslopes Shirt Black", "$15", "shirt1"),
        Product("Devslopes Badge Light Grey", "$16", "shirt2"),
        Product("Devslopes Logo Shirt Red", "$19", "shirt3"),
        Product("Devslopes Hustle", "$25", "shirt4"),
        Product("Kickflip Studios", "$25", "shirt5")
    )

    val digitalGoods = listOf<Product>()

    fun getProducts(category: String) : List<Product>{

        return when(category){

            "SHIRTS" -> shirts
            "HATS" -> hats
            "HOODIES" -> hoodies
            else -> digitalGoods
        }
    }
}