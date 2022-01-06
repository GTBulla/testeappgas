package br.com.gtb.interview.appgas.widget

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.LinearLayout
import androidx.constraintlayout.widget.ConstraintLayout
import br.com.gtb.interview.appgas.R
import br.com.gtb.interview.appgas.databinding.ComponentTopbarBinding

class CustomTopBarLayout @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : ConstraintLayout(context, attrs, defStyleAttr) {

    private var binding =
        ComponentTopbarBinding.inflate(LayoutInflater.from(context), this)

    init {
        attrs?.let {
            fillTextProperties(it)
        }
    }

    private fun fillTextProperties(attributeSet: AttributeSet) {
        val typedArray = context.obtainStyledAttributes(attributeSet, R.styleable.Text, 0, 0)
        binding.titleTextView.text = typedArray.getString(R.styleable.Text_title)
        typedArray.recycle()
    }

}
