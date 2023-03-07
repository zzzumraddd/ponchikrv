package uz.itschool.foodee

import android.graphics.Color
enum class CategoryFood (var n: String, var photo: Int, var color: Int){
    FREE("Fries", R.drawable.img, Color.parseColor("#F5CAC3")),
    BURGERS("Burgers", R.drawable.img_1, Color.parseColor("#FFEF92")),
    DRINKS("Drink", R.drawable.img_2, Color.parseColor("#B6D7CF")),
    DESERTS("Desert", R.drawable.img_3, Color.parseColor("#A9D7DA"))

}