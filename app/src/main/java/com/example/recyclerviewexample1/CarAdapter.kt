package com.example.recyclerviewexample1

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.layout_item_view.view.*

class CarAdapter(var items : ArrayList<Cars>) : RecyclerView.Adapter<CarViewHoler>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CarViewHoler {
        lateinit var carViewHoler: CarViewHoler
        carViewHoler = CarViewHoler(LayoutInflater.from(parent.context).inflate(R.layout.layout_item_view, parent, false))
        return  carViewHoler
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: CarViewHoler, position: Int) {
        holder.carName?.text = items.get(position).name
        holder.carDescription?.text = items.get(position).description
        holder.carLogo.setImageResource(items.get(position).logo)

    }

}

class CarViewHoler(itemView: View): RecyclerView.ViewHolder(itemView){
    var carName = itemView.carname
    var carDescription = itemView.cardescription
    var carLogo = itemView.carlogo
}