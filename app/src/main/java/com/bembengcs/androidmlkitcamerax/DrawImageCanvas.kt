package com.bembengcs.androidmlkitcamerax

import android.content.Context
import android.graphics.*
import android.view.View

/**
 * Created by bembengcs on 2019-12-19.
 * Android Engineer
 */
class DrawImageCanvas(context: Context) : View(context) {
    private val paint = Paint()
    private val rectF = RectF()

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)

        paint.apply {
            isAntiAlias = true
            style = Paint.Style.STROKE
            color = Color.WHITE
            strokeWidth = 5F
        }

        rectF.apply {
            left = 0f
            top = 0f
            right = 3f
            bottom = 3f
        }


        canvas.drawRoundRect(rectF, 1f, 1f, paint)
    }
}