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
        Product("devslopes Graphic Beanie", "$18", "hat01"),
        Product("devslopes Hat Black", "$21", "hat02"),
        Product("devslopes Hat White", "$17", "hat03"),
        Product("devslopes Blue Beanie", "$25", "hat04")
    )

    val hoodies = listOf(
        Product("Devslopes Hoddie Gray", "$28", "hoodie01"),
        Product("Devslopes Hoddie Blue", "$32", "hoodie02"),
        Product("Devslopes Hoddie Black", "$35", "hoodie03"),
        Product("Devslopes Hoddie Yellow", "$37", "hoodie04")
    )

    val shirts = listOf(
        Product("Devslopes Shirt Black", "$15", "shirt01"),
        Product("Devslopes Badge Light Grey", "$16", "shirt02"),
        Product("Devslopes Logo Shirt Red", "$19", "shirt03"),
        Product("Devslopes Hustle", "$25", "shirt04"),
        Product("Kickflip Studios", "$25", "shirt05")
    )

}