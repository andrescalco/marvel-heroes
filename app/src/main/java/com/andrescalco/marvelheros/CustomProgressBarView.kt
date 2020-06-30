package com.andrescalco.marvelheros

import android.content.Context
import android.graphics.Canvas
import android.graphics.Paint
import android.util.AttributeSet
import android.view.View
import com.andrescalco.marvelheros.R.color.*
import com.andrescalco.marvelheros.R.styleable.*
import kotlin.math.ceil

class CustomProgressBarView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : View(context, attrs, defStyleAttr) {

    private val attributes = context.obtainStyledAttributes(attrs, CustomProgressBarView)
    private var percentage: Int = 0

    fun setProgress(progressValue: Int){
        percentage = progressValue
    }

    override fun onDraw(canvas: Canvas?) {
        val paint = Paint()
        paint.style = Paint.Style.STROKE
        paint.color = resources.getColor(primaryWhite)
        paint.strokeWidth = 1.px.toFloat()

        val spacing = 5.px
        val lineH = 10.px
        val fullH = 12.px

        for (index in 1..44){

            var startX = (index * spacing).toFloat()
            var startY = (2.px).toFloat()
            var stopX = (index * spacing).toFloat()
            var stopY = (lineH).toFloat()

            var position = ceil((percentage * 44 / 100).toDouble()).toInt()

            when {
                index < position -> {
                    canvas!!.drawLine(startX, startY, stopX, stopY,paint)
                }
                index == position -> {
                    startY = (0).toFloat()
                    stopY = (fullH).toFloat()
                    canvas!!.drawLine(startX, startY, stopX, stopY,paint)
                }
                else -> {
                    paint.color = resources.getColor(primaryGrey)
                    canvas!!.drawLine(startX, startY, stopX, stopY,paint)
                }
            }
        }

        super.onDraw(canvas)
    }


}
