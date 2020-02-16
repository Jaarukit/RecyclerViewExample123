package com.example.recyclerviewexample1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recyclerviewexample1.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    lateinit var carlist: ArrayList<Cars>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        carlist = ArrayList()
        addCars()

        carRecyclerView.layoutManager = LinearLayoutManager(this)
        carRecyclerView.addItemDecoration(DividerItemDecoration(this, 1))
        carRecyclerView.adapter = CarAdapter(carlist)
    }

    fun  addCars(){
        carlist.add(Cars("Toyota","good car, good car, good car, good car, good car, good car, good car, good car, good car, good car", R.drawable.toyota) )
        carlist.add(Cars("Hyundai","good car, good car, good car, good car, good car, good car, good car, good car, good car, good car", R.drawable.hyundai) )
        carlist.add(Cars("Marcedese","good car, good car, good car, good car, good car, good car, good car, good car, good car, good car", R.drawable.marcedese) )
        carlist.add(Cars("Bentley","good car, good car, good car, good car, good car, good car, good car, good car, good car, good car", R.drawable.bentley) )
        carlist.add(Cars("Nissan","good car, good car, good car, good car, good car, good car, good car, good car, good car, good car", R.drawable.nissan) )
        carlist.add(Cars("Ford","good car, good car, good car, good car, good car, good car, good car, good car, good car, good car", R.drawable.ford) )
    }
}

