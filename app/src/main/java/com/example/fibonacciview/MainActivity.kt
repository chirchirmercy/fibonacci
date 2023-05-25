package com.example.fibonacciview
import NumbersRvAdapter
import Numbersrvadapter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import com.example.fibonacciview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView( R.layout.activity_main)
      binding=ActivityMainBinding.inflate(layoutInflater)
//        setContentView(this.binding.root)
    }

    override fun onResume() {
        super.onResume()
        this.displayNumbersList()
    }
    fun displayNumbersList(){

        var numbers=listOf(0,101)


//        binding.rvNumbers.layoutManager.GridLayoutManager(this,3)
        val numbersRvAdapter = NumbersRvAdapter(numbers)
//        this.binding.rvNumbers.adapter.Numbersrvadapter

    }
}

