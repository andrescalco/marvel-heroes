package com.andrescalco.marvelheros

import android.content.Context
import android.util.AttributeSet
import android.widget.ImageView
import androidx.constraintlayout.widget.ConstraintLayout
import com.andrescalco.marvelheros.R.id.categoryIcon
import com.andrescalco.marvelheros.R.id.categoryView
import com.andrescalco.marvelheros.R.styleable.*

class CategoryIconView(context: Context, attrs: AttributeSet): ConstraintLayout(context, attrs) {

    init {
        inflate(context, R.layout.category_icon_view, this)

        val categoryView = findViewById<ConstraintLayout>(categoryView)
        val categoryIcon = findViewById<ImageView>(categoryIcon)

        val attributes = context.obtainStyledAttributes(attrs, CategoryIconView)

        categoryIcon.setImageDrawable(attributes.getDrawable(CategoryIconView_icon))
        categoryView.background = attributes.getDrawable(CategoryIconView_gradient)
        attributes.recycle()

    }

}