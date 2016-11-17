package com.cn.watermark;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PixelFormat;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;

/**
 * Created by nurmemet on 2016/11/16.
 */

public class WaterMarkDrawable extends Drawable {

    private MarkDrawable mMarkDrawable;
    private RectF mBoundRect;
    private BitmapShader mShader;
    private Paint mPaint;
    private String mMarkStr;

    public WaterMarkDrawable(String markStr) {
        this.mMarkDrawable = new MarkDrawable(markStr);
        mBoundRect = new RectF();
        final int width=mMarkDrawable.getIntrinsicWidth();
        final  int height=mMarkDrawable.getIntrinsicHeight();
        Bitmap bmp = Bitmap.createBitmap(width,height, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bmp);
        mMarkDrawable.setBounds(0,0,width,height);
        mMarkDrawable.draw(canvas);
        mShader = new BitmapShader(bmp, Shader.TileMode.REPEAT, Shader.TileMode.REPEAT);
        mPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
        mPaint.setStyle(Paint.Style.FILL);
        mPaint.setShader(mShader);




    }


    @Override
    public void draw(Canvas canvas) {


        canvas.drawRect(0, 0, mBoundRect.right, mBoundRect.bottom, mPaint);

    }

    @Override
    public void setAlpha(int i) {
        mPaint.setAlpha(i);
    }

    @Override
    public void setColorFilter(ColorFilter colorFilter) {
        mPaint.setColorFilter(colorFilter);
    }

    @Override
    public int getOpacity() {
        return PixelFormat.TRANSPARENT;
    }

    @Override
    public void setBounds(int left, int top, int right, int bottom) {
        mBoundRect.set(left, top, right, bottom);
    }
}
