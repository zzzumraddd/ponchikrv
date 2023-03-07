package uz.itschool.foodee

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import uz.itschool.foodee.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.rv.adapter = Category_Adapter(CategoryFood.values())
    }
}