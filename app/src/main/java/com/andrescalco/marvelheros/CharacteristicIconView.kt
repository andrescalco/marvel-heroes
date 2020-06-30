package com.andrescalco.marvelheros

import android.content.Context
import android.util.AttributeSet
import androidx.constraintlayout.widget.ConstraintLayout
import com.andrescalco.marvelheros.R.styleable.*
import kotlinx.android.synthetic.main.characteristic_icon_view.view.*

class CharacteristicIconView(context: Context, attrs: AttributeSet) : ConstraintLayout(context, attrs) {
    init {
        inflate(context, R.layout.characteristic_icon_view, this)
        val attributes = context.obtainStyledAttributes(attrs, CharacteristicIconView)
        characteristicIcon.setImageDrawable(attributes.getDrawable(CharacteristicIconView_characteristicIcon))
        characteristicName.text = attributes.getText(CharacteristicIconView_name)
        attributes.recycle()
    }

    fun setName(name: String) {
        characteristicName.text = name
    }

}