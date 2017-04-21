package com.jeepc.galayxmarquee;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by jeepc on 2017/4/21.
 */

public class MarqueeView extends View {
    private Paint mPaint;
    private int mColor = 0xff000000;
    private float mProgress;

    public MarqueeView(Context context) {
        super(context,null);
    }

    public MarqueeView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        mPaint = new Paint(Paint.ANTI_ALIAS_FLAG);

        TypedArray ta = context.obtainStyledAttributes(attrs,
                R.styleable.MarqueeView);
        mColor = ta.getColor(
                R.styleable.MarqueeView_color,mColor);
        mProgress = ta.getFloat(R.styleable.MarqueeView_progress, 0);

        ta.recycle();

    }


    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        drawPath(canvas);
    }

    private void drawPath(Canvas canvas){

    }
}
