package br.com.gtb.interview.appgas.order.ui.model

import androidx.annotation.ColorRes

data class OrderListItem(
    val description: String,
    val count: Int,
    val companyName: String,
    @ColorRes val companyColor: Int,
)
