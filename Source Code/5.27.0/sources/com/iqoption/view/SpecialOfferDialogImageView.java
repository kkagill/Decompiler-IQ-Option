package com.iqoption.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.iqoption.util.q;
import com.iqoption.x.R;

public class SpecialOfferDialogImageView extends ImageView {
    public SpecialOfferDialogImageView(Context context) {
        super(context);
    }

    public SpecialOfferDialogImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SpecialOfferDialogImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* Access modifiers changed, original: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawBitmap(a(Bitmap.createScaledBitmap(BitmapFactory.decodeResource(getContext().getResources(), R.drawable.dialog_angle), getWidth(), getHeight(), true), new q(getContext()).ad(8.0f)), 0.0f, 0.0f, new Paint(5));
    }

    public static Bitmap a(Bitmap bitmap, int i) {
        Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint();
        Rect rect = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
        RectF rectF = new RectF(rect);
        float f = (float) i;
        Rect rect2 = new Rect(bitmap.getWidth() / 2, 0, bitmap.getWidth(), bitmap.getHeight() / 2);
        Rect rect3 = new Rect(0, bitmap.getHeight() / 2, bitmap.getWidth(), bitmap.getHeight());
        paint.setAntiAlias(true);
        canvas.drawARGB(0, 0, 0, 0);
        paint.setColor(-12434878);
        canvas.drawRoundRect(rectF, f, f, paint);
        canvas.drawRect(rect2, paint);
        canvas.drawRect(rect3, paint);
        paint.setXfermode(new PorterDuffXfermode(Mode.SRC_IN));
        canvas.drawBitmap(bitmap, rect, rect, paint);
        return createBitmap;
    }
}
