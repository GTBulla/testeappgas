package br.com.gtb.interview.appgas.order.ui.adapter

import android.annotation.SuppressLint
import androidx.annotation.ColorRes
import androidx.appcompat.content.res.AppCompatResources
import androidx.recyclerview.widget.RecyclerView
import br.com.gtb.interview.appgas.databinding.OrderListItemBinding
import br.com.gtb.interview.appgas.order.ui.model.OrderListItem

class OrderItemViewHolder internal constructor(
    val binding: OrderListItemBinding,
) : RecyclerView.ViewHolder(binding.root) {

    fun bind(item: OrderListItem) {
        bindFieldCount(item.count)
        bindFieldDescription(item.description)
        bindFieldsCompany(item.companyName, item.companyColor)
    }

    private fun bindFieldCount(count: Int) {
        with(binding.textItemCount) {
            text = count.toString()
            contentDescription = count.toString()
        }
    }

    private fun bindFieldDescription(description: String) {
        with(binding.textItemDescription) {
            text = description
            contentDescription = description
        }
    }

    @SuppressLint("UseCompatLoadingForColorStateLists")
    private fun bindFieldsCompany(
        companyName: String,
        @ColorRes companyColor: Int
    ) {
        with(binding.textItemCompany) {
            text = companyName
            backgroundTintList = AppCompatResources.getColorStateList(context, companyColor)
        }
    }

    companion object {
        private val TAG = OrderItemViewHolder::class.java.simpleName
    }

}
