package com.ydnm4528.myaccount

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.ydnm4528.myaccount.adapter.OrderAdapter
import com.ydnm4528.myaccount.model.OrderItem
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var OrderList = ArrayList<OrderItem>()

        OrderList.add(OrderItem("My Wishlist", R.drawable.wishlist))
        OrderList.add(OrderItem("Followed Seller", R.drawable.cardwallet))
        OrderList.add(OrderItem("Purchased Item", R.drawable.purchase))

        OrderList.add(OrderItem("Cards Wallet", R.drawable.cardwallet))
        OrderList.add(OrderItem("Exp Points", R.drawable.xpoint))
        OrderList.add(OrderItem("My Coupons", R.drawable.coupon))

        OrderList.add(OrderItem("Given Feedbacks", R.drawable.feedback))
        OrderList.add(OrderItem("Searched History", R.drawable.shistory))
        OrderList.add(OrderItem("Events&Date", R.drawable.event))

        var orderAdapter = OrderAdapter(OrderList)
        orderRecycler.layoutManager = GridLayoutManager(this, 3)
        orderRecycler.adapter = orderAdapter


    }


}