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
public class ic_stars extends SVGRenderer {

    public ic_stars(Context context) {
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
        
        mPath.moveTo(11.99f, 2.0f);
        mPath.cubicTo(6.47f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
        mPath.rCubicTo(0.0f, 5.52f, 4.47f, 10.0f, 9.99f, 10.0f);
        mPath.cubicTo(17.52f, 22.0f, 22.0f, 17.52f, 22.0f, 12.0f);
        mPath.cubicTo(22.0f, 6.4799995f, 17.52f, 2.0f, 11.99f, 2.0f);
        mPath.close();
        mPath.moveTo(11.99f, 2.0f);
        mPath.rMoveTo(4.24f, 16.0f);
        mPath.lineTo(12.0f, 15.45f);
        mPath.lineTo(7.77f, 18.0f);
        mPath.rLineTo(1.12f, -4.81f);
        mPath.rLineTo(-3.73f, -3.23f);
        mPath.rLineTo(4.92f, -0.42f);
        mPath.lineTo(12.0f, 5.0f);
        mPath.rLineTo(1.92f, 4.53f);
        mPath.rLineTo(4.92f, 0.42f);
        mPath.rLineTo(-3.73f, 3.23f);
        mPath.lineTo(16.23f, 18.0f);
        mPath.close();
        mPath.moveTo(16.23f, 18.0f);
        
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