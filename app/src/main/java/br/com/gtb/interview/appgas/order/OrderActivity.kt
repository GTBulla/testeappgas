package br.com.gtb.interview.appgas.order

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.gtb.interview.appgas.order.ui.adapter.OrderItemAdapter
import br.com.gtb.interview.appgas.R
import br.com.gtb.interview.appgas.databinding.ActivityOrderBinding
import br.com.gtb.interview.appgas.order.ui.model.OrderListItem

class OrderActivity : AppCompatActivity() {

    private lateinit var binding: ActivityOrderBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityOrderBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setupView()
    }

    private fun setupView() {
        binding.listItem.adapter = OrderItemAdapter(getList())
    }

    private fun getList(): List<OrderListItem> {
        val list = mutableListOf<OrderListItem>()
        list.add(OrderListItem("Botijão: 20kg", 2, "Supergasbras", R.color.red))
        list.add(OrderListItem("Botijão: 13kg", 1, "Liquigas", R.color.green))
        return list
    }

    override fun onDestroy() {
        super.onDestroy()
//        binding.listItem.adapter = null
    }
}