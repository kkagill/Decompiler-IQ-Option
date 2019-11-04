package com.iqoption.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.RectF;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.PopupWindow.OnDismissListener;
import androidx.core.content.ContextCompat;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.iqoption.charttools.model.indicator.i;
import com.iqoption.util.ak;
import com.iqoption.util.d;
import com.iqoption.x.R;

public class ColorPickerView extends FrameLayout implements OnClickListener {
    public static final int[] hR = i.aIZ;
    private a eeA;
    private int eeq;
    private int eer;
    private PopupWindow ees;
    private View eet;
    private RecyclerView eeu;
    private com.iqoption.a.d.a eev;
    private RectF eew;
    private float eex = 14.0f;
    private float eey = 4.0f;
    private int eez = 0;
    private int mDirection = 0;
    private Paint mPaint;

    public interface a {
        void em(int i);
    }

    public void setOnColorChangeListener(a aVar) {
        this.eeA = aVar;
    }

    public int getSelectedColor() {
        int i = this.eez;
        if (i == -1) {
            return d.eJ(this.mPaint.getColor());
        }
        return hz(i);
    }

    public void setSelectedColor(int i) {
        int i2 = 0;
        while (true) {
            int[] iArr = hR;
            if (i2 >= iArr.length) {
                i2 = -1;
                break;
            } else if (i == d.eJ(iArr[i2])) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 != -1) {
            hA(i2);
            return;
        }
        this.eez = -1;
        this.mPaint.setColor(d.eK(i));
        this.eev.dB(this.eez);
        ViewCompat.postInvalidateOnAnimation(this);
        a aVar = this.eeA;
        if (aVar != null) {
            aVar.em(this.eez);
        }
    }

    public ColorPickerView(Context context) {
        super(context);
        aXO();
    }

    public ColorPickerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        e(context, attributeSet);
        aXO();
    }

    public ColorPickerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        e(context, attributeSet);
        aXO();
    }

    public static int hz(int i) {
        return d.eJ(hR[i]);
    }

    private void e(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.iqoption.d.a.ColorPickerView);
            this.eex = obtainStyledAttributes.getDimension(3, 14.0f);
            this.eey = obtainStyledAttributes.getDimension(2, 4.0f);
            this.eez = hB(obtainStyledAttributes.getInt(0, 0));
            this.mDirection = obtainStyledAttributes.getInt(1, 0);
            obtainStyledAttributes.recycle();
        }
    }

    private void aXO() {
        aXP();
        float f = this.eex;
        this.eew = new RectF(0.0f, 0.0f, f, f);
        this.mPaint = new Paint(5);
        this.mPaint.setStyle(Style.FILL);
        this.mPaint.setColor(hR[this.eez]);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.dp35);
        int length = hR.length / 5;
        this.eeq = dimensionPixelSize * 5;
        this.eer = dimensionPixelSize * length;
        this.eet = LayoutInflater.from(getContext()).inflate(R.layout.picker_popup, null);
        this.ees = new PopupWindow(this.eet, this.eeq, this.eer);
        this.ees.setAnimationStyle(R.style.PickerPopup);
        this.ees.setSplitTouchEnabled(false);
        this.ees.setBackgroundDrawable(ContextCompat.getDrawable(getContext(), R.drawable.bg_tools_dialog));
        if (VERSION.SDK_INT >= 21) {
            this.ees.setElevation((float) getResources().getDimensionPixelOffset(R.dimen.dp12));
        }
        this.ees.setOutsideTouchable(true);
        this.ees.setOnDismissListener(new OnDismissListener() {
            public void onDismiss() {
                ColorPickerView.this.setSelected(false);
                ColorPickerView.this.postDelayed(new Runnable() {
                    public void run() {
                        ColorPickerView.this.setOnClickListener(ColorPickerView.this);
                    }
                }, 500);
            }
        });
        this.eeu = (RecyclerView) this.eet.findViewById(R.id.colorsList);
        this.eev = new com.iqoption.a.d.a(new com.iqoption.a.b.a() {
            public void onItemClick(View view, int i) {
                ColorPickerView.this.hA(i);
                ColorPickerView.this.ees.dismiss();
            }
        });
        this.eev.setHasStableIds(true);
        this.eev.dB(this.eez);
        this.eeu.setLayoutManager(new GridLayoutManager(getContext(), 5));
        this.eeu.setItemAnimator(new DefaultItemAnimator());
        this.eeu.setAdapter(this.eev);
        setSelected(isSelected());
        setOnClickListener(this);
        setOnTouchListener(new com.iqoption.view.d.d(0.5f));
    }

    private void aXP() {
        LayoutParams layoutParams = new LayoutParams(-2, -2);
        ImageView imageView = new ImageView(getContext());
        if (this.mDirection == 0) {
            ak.setBackground(this, ContextCompat.getDrawable(getContext(), R.drawable.bg_l1_down_color_picker));
            layoutParams.gravity = 85;
            imageView.setImageResource(R.drawable.bg_l2_down_color_picker);
        } else {
            ak.setBackground(this, ContextCompat.getDrawable(getContext(), R.drawable.bg_l1_up_color_picker));
            layoutParams.gravity = 53;
            imageView.setImageResource(R.drawable.bg_l2_up_color_picker);
        }
        imageView.setLayoutParams(layoutParams);
        addView(imageView);
    }

    private void aXQ() {
        this.ees.showAsDropDown(this, (getWidth() / 2) - (this.eeq / 2), this.mDirection == 0 ? 0 : (this.eer * -1) - getHeight());
    }

    /* Access modifiers changed, original: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        q(canvas);
        RectF rectF = this.eew;
        float f = this.eey;
        canvas.drawRoundRect(rectF, f, f, this.mPaint);
    }

    private void q(Canvas canvas) {
        this.eew.set(((float) (canvas.getWidth() / 2)) - (this.eex / 2.0f), ((float) (canvas.getHeight() / 2)) - (this.eex / 2.0f), ((float) (canvas.getWidth() / 2)) + (this.eex / 2.0f), ((float) (canvas.getHeight() / 2)) + (this.eex / 2.0f));
    }

    public void onClick(View view) {
        if (!isSelected()) {
            setSelected(true);
        }
        requestFocus();
    }

    public void setSelected(boolean z) {
        super.setSelected(z);
        if (z) {
            setOnClickListener(null);
            aXQ();
            if (VERSION.SDK_INT >= 21) {
                setElevation((float) getResources().getDimensionPixelSize(R.dimen.dp12));
            }
        } else {
            this.ees.dismiss();
            if (VERSION.SDK_INT >= 21) {
                setElevation(0.0f);
            }
        }
        setAlpha(0.3f);
        animate().alpha(1.0f).setDuration(400).start();
    }

    public void setSelectedIndex(int i) {
        hA(i);
    }

    private void hA(int i) {
        this.eez = hB(i);
        this.mPaint.setColor(hR[this.eez]);
        this.eev.dB(this.eez);
        ViewCompat.postInvalidateOnAnimation(this);
        a aVar = this.eeA;
        if (aVar != null) {
            aVar.em(this.eez);
        }
    }

    private int hB(int i) {
        return (i < 0 || i >= hR.length) ? 0 : i;
    }
}
