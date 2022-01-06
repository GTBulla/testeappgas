package br.com.gtb.interview.appgas.order.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import br.com.gtb.interview.appgas.databinding.OrderListItemBinding
import br.com.gtb.interview.appgas.order.ui.model.OrderListItem

class OrderItemAdapter(
    private var mList: List<OrderListItem>,
) : RecyclerView.Adapter<OrderItemViewHolder>() {

    override fun getItemCount() = mList.size

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): OrderItemViewHolder {
        val binding = OrderListItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return OrderItemViewHolder(binding)
    }

    override fun onBindViewHolder(holder: OrderItemViewHolder, position: Int) {
        holder.bind(mList[position])
    }

}
