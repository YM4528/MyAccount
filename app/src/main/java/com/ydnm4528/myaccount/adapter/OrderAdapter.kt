package com.ydnm4528.myaccount.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ydnm4528.myaccount.R
import com.ydnm4528.myaccount.model.OrderItem
import kotlinx.android.synthetic.main.item_order.view.*

class OrderAdapter (var orderList : ArrayList <OrderItem>): RecyclerView.Adapter<OrderAdapter.OrderViewHolder> () {

    class OrderViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(orderitem: OrderItem) {
            itemView.img.setImageResource(orderitem.imgage)
            itemView.txt.text = orderitem.name
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): OrderViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.item_order, parent, false)
        return OrderViewHolder(view)
    }

    override fun onBindViewHolder(holder: OrderViewHolder, position: Int) {
        holder.bind(orderList[position])
    }

    override fun getItemCount(): Int  = orderList.size

}