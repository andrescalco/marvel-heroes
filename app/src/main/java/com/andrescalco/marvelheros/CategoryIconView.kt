package com.andrescalco.marvelheros

import android.content.Context
import android.util.AttributeSet
import androidx.constraintlayout.widget.ConstraintLayout
import com.andrescalco.marvelheros.R.styleable.*
import kotlinx.android.synthetic.main.category_icon_view.view.*

class CategoryIconView(context: Context, attrs: AttributeSet) : ConstraintLayout(context, attrs) {

    init {
        inflate(context, R.layout.category_icon_view, this)
        val attributes = context.obtainStyledAttributes(attrs, CategoryIconView)
        categoryIcon.setImageDrawable(attributes.getDrawable(CategoryIconView_icon))
        categoryView.background = attributes.getDrawable(CategoryIconView_gradient)
        attributes.recycle()
    }
}