package br.com.gtb.interview.appgas.widget

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.LinearLayout
import androidx.constraintlayout.widget.ConstraintLayout
import br.com.gtb.interview.appgas.R
import br.com.gtb.interview.appgas.databinding.ComponentTopbarBinding
import br.com.gtb.interview.appgas.databinding.OrderStateFlowBinding

class OrderStateFlowLayout @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : ConstraintLayout(context, attrs, defStyleAttr) {

    private var binding =
        OrderStateFlowBinding.inflate(LayoutInflater.from(context), this)

}
