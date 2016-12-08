package com.android.svg.iconlibs;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;

import com.android.svg.support.SVGRenderer;

/**
 * AUTO-GENERATED FILE.  DO NOT MODIFY.
 * 
 * This class was automatically generated by the
 * SVG-Generator. It should not be modified by hand.
 */
public class ic_money_off extends SVGRenderer {

    public ic_money_off(Context context) {
        super(context);
        mAlpha = 1.0f;
        mWidth = dip2px(24.0f);
        mHeight = dip2px(24.0f);
    }

    @Override
    public void render(Canvas canvas, int w, int h, ColorFilter filter) {
        
        final float scaleX = w / 24.0f;
        final float scaleY = h / 24.0f;
        
        mPath.reset();
        mRenderPath.reset();
        
        mFinalPathMatrix.setValues(new float[]{1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f});
        mFinalPathMatrix.postScale(scaleX, scaleY);
        
        mPath.moveTo(12.5f, 6.9f);
        mPath.rCubicTo(1.78f, 0.0f, 2.44f, 0.85f, 2.5f, 2.1f);
        mPath.rLineTo(2.21f, 0f);
        mPath.rCubicTo(-0.07f, -1.72f, -1.12f, -3.3f, -3.21f, -3.81f);
        mPath.lineTo(13.999999f, 3.0f);
        mPath.rLineTo(-3.0f, 0f);
        mPath.rLineTo(0f, 2.16f);
        mPath.rCubicTo(-0.53f, 0.12f, -1.03f, 0.3f, -1.48f, 0.54f);
        mPath.rLineTo(1.47f, 1.47f);
        mPath.rCubicTo(0.41f, -0.17f, 0.91f, -0.27f, 1.51f, -0.27f);
        mPath.close();
        mPath.moveTo(12.5f, 6.9f);
        mPath.moveTo(5.33f, 4.06f);
        mPath.lineTo(4.06f, 5.33f);
        mPath.lineTo(7.5f, 8.77f);
        mPath.rCubicTo(0.0f, 2.08f, 1.56f, 3.21f, 3.91f, 3.91f);
        mPath.rLineTo(3.51f, 3.51f);
        mPath.rCubicTo(-0.34f, 0.48f, -1.05f, 0.91f, -2.42f, 0.91f);
        mPath.rCubicTo(-2.06f, 0.0f, -2.87f, -0.92f, -2.98f, -2.1f);
        mPath.rLineTo(-2.2f, 0f);
        mPath.rCubicTo(0.12f, 2.19f, 1.76f, 3.42f, 3.68f, 3.83f);
        mPath.lineTo(11.000001f, 21.0f);
        mPath.rLineTo(3.0f, 0f);
        mPath.rLineTo(0f, -2.15f);
        mPath.rCubicTo(0.96f, -0.18f, 1.82f, -0.55f, 2.45f, -1.12f);
        mPath.rLineTo(2.22f, 2.22f);
        mPath.rLineTo(1.27f, -1.27f);
        mPath.lineTo(5.33f, 4.06f);
        mPath.close();
        mPath.moveTo(5.33f, 4.06f);
        
        mRenderPath.addPath(mPath, mFinalPathMatrix);
        if (mFillPaint == null) {
            mFillPaint = new Paint();
            mFillPaint.setStyle(Paint.Style.FILL);
            mFillPaint.setAntiAlias(true);
        }
        mFillPaint.setColor(applyAlpha(-16777216, 1.0f));
        mFillPaint.setColorFilter(filter);
        canvas.drawPath(mRenderPath, mFillPaint);

    }

}