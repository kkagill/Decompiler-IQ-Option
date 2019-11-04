package com.iqoption.view;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Point;
import android.os.Handler;
import android.os.Message;
import android.text.SpannableString;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.PopupWindow;
import androidx.annotation.AnimRes;
import androidx.annotation.DimenRes;
import androidx.cardview.widget.CardView;
import androidx.core.content.ContextCompat;
import androidx.core.widget.TextViewCompat;
import com.iqoption.app.IQApp;
import com.iqoption.dto.IconSettings;
import com.iqoption.dto.ToastEntity;
import com.iqoption.e.qp;
import com.iqoption.mobbtech.connect.a.c;
import com.iqoption.util.ak;
import com.iqoption.view.d.d;
import com.iqoption.x.R;
import java.util.LinkedList;
import java.util.Queue;

public class LocalToast extends CardView {
    private GestureDetector azZ;
    private qp efc;
    private volatile Queue<ToastEntity> efd;
    private PopupWindow efe;
    private a eff;
    private long efg;
    private c efh;
    private int efi;
    private Handler mHandler;

    private class a extends SimpleOnGestureListener {
        private boolean cVB;
        private final c efk;

        public boolean onDown(MotionEvent motionEvent) {
            return true;
        }

        private a() {
            this.cVB = false;
            this.efk = new c() {
                public void perform(Object... objArr) {
                    LocalToast.this.efh.perform(objArr);
                    if (LocalToast.this.efc.aoa() != null && !TextUtils.isEmpty(LocalToast.this.efc.aoa().getActionText())) {
                        IQApp.Ex().bd(new b(LocalToast.this.efc.aoa().getId()));
                    }
                }
            };
        }

        /* synthetic */ a(LocalToast localToast, AnonymousClass1 anonymousClass1) {
            this();
        }

        public boolean onSingleTapUp(MotionEvent motionEvent) {
            LocalToast.this.mHandler.removeMessages(1);
            int dimensionPixelOffset = LocalToast.this.getContext().getResources().getDimensionPixelOffset(R.dimen.dp12);
            int i = dimensionPixelOffset * 2;
            LocalToast.this.efe.setWidth(LocalToast.this.getWidth() + i);
            LocalToast.this.efe.setHeight(LocalToast.this.getHeight() + i);
            PopupWindow d = LocalToast.this.efe;
            LocalToast localToast = LocalToast.this;
            d.showAsDropDown(localToast, -dimensionPixelOffset, (-localToast.getHeight()) - dimensionPixelOffset);
            if (ak.a(motionEvent.getRawX(), motionEvent.getRawY(), LocalToast.this.efc.cmX)) {
                LocalToast localToast2 = LocalToast.this;
                localToast2.a(localToast2.efh, true);
            } else {
                LocalToast.this.b(this.efk, true);
            }
            return true;
        }

        public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            this.cVB = true;
            if (f < 0.0f) {
                LocalToast.this.animate().translationXBy(-f).setDuration(0).start();
            }
            return true;
        }

        public void axP() {
            if (this.cVB) {
                LocalToast.this.mHandler.removeMessages(1);
                LocalToast localToast = LocalToast.this;
                localToast.a(localToast.efh, true);
            }
            this.cVB = false;
        }
    }

    public static class b {
        public final long efm;

        public b(long j) {
            this.efm = j;
        }
    }

    public LocalToast(Context context) {
        this(context, null);
    }

    public LocalToast(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LocalToast(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.efd = new LinkedList();
        this.mHandler = new Handler() {
            public void handleMessage(Message message) {
                LocalToast localToast = LocalToast.this;
                localToast.b(localToast.efh, false);
            }
        };
        this.efh = new -$$Lambda$LocalToast$NDRdcJF5QszzIvIN-ryA6xH4j70(this);
        this.efi = 0;
        aXO();
    }

    private void aXO() {
        if (!isInEditMode()) {
            this.efc = qp.t(LayoutInflater.from(getContext()), this, true);
            this.eff = new a(this, null);
            this.azZ = new GestureDetector(getContext(), this.eff);
            setOnTouchListener(new d(0.7f));
            ImageView imageView = new ImageView(getContext());
            imageView.setScaleType(ScaleType.FIT_XY);
            imageView.setLayoutParams(new LayoutParams(-1, -1));
            imageView.setImageResource(R.drawable.popup_closeposition_small_smoke);
            this.efe = new PopupWindow(imageView, -2, -2);
            this.efe.setAnimationStyle(R.style.AnimationSmokePopup);
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            this.eff.axP();
        }
        return this.azZ.onTouchEvent(motionEvent);
    }

    public LocalToast a(int i, long j, String str, long j2) {
        if (System.currentTimeMillis() - this.efg > 300) {
            this.efg = System.currentTimeMillis();
            this.efd.add(new ToastEntity(i, j, str, null, j2));
        }
        return this;
    }

    public LocalToast c(ToastEntity toastEntity) {
        if (System.currentTimeMillis() - this.efg > 300) {
            this.efg = System.currentTimeMillis();
            this.efd.add(toastEntity);
        }
        return this;
    }

    public LocalToast d(ToastEntity toastEntity) {
        this.efd.add(toastEntity);
        return this;
    }

    public LocalToast a(int i, long j, SpannableString spannableString, long j2) {
        this.efd.add(new ToastEntity(i, j, spannableString, null, j2));
        return this;
    }

    public LocalToast a(int i, long j, String str, long j2, com.iqoption.a.b.a aVar) {
        this.efd.add(new ToastEntity(i, j, str, null, j2, aVar));
        return this;
    }

    public LocalToast a(int i, long j, String str, String str2, long j2) {
        this.efd.add(new ToastEntity(i, j, str, str2, j2));
        return this;
    }

    public void aYa() {
        if (!this.efd.isEmpty()) {
            if (getAnimation() != null && (getAnimation().hasStarted() || !getAnimation().hasEnded())) {
                return;
            }
            if (getVisibility() == 0) {
                this.mHandler.removeMessages(1);
                this.mHandler.sendEmptyMessage(2);
                return;
            }
            e((ToastEntity) this.efd.poll());
        }
    }

    private void a(c cVar, boolean z) {
        a((int) R.anim.appear_from_rigth_to_left_with_alpha_hide, cVar, z);
    }

    private void b(c cVar, boolean z) {
        a((int) R.anim.appear_from_bottom_to_top_with_alpha_hide, cVar, z);
    }

    private void a(@AnimRes int i, c cVar, boolean z) {
        Animation loadAnimation = AnimationUtils.loadAnimation(getContext(), i);
        loadAnimation.setAnimationListener(com.iqoption.view.a.a.a.a.c(new -$$Lambda$LocalToast$3xgWz3tYSbFE9z_4-a8bhHHTGbY(this, z, cVar)));
        startAnimation(loadAnimation);
    }

    private /* synthetic */ void u(Object[] objArr) {
        aYa();
    }

    private void e(ToastEntity toastEntity) {
        if (toastEntity != null) {
            this.efc.a(toastEntity);
            this.efc.cmW.setBackgroundResource(toastEntity.getTypeId());
            if (TextUtils.isEmpty(toastEntity.getTitle())) {
                this.efc.cmV.setVisibility(8);
            } else {
                this.efc.cmV.setVisibility(0);
            }
            RobotoTextView robotoTextView = this.efc.cmU;
            Integer actionTextAppearance = toastEntity.getActionTextAppearance();
            if (actionTextAppearance != null) {
                TextViewCompat.setTextAppearance(robotoTextView, actionTextAppearance.intValue());
            }
            ImageView imageView = this.efc.cmX;
            if (TextUtils.isEmpty(toastEntity.getActionText())) {
                robotoTextView.setVisibility(8);
                imageView.setVisibility(8);
            } else {
                robotoTextView.setVisibility(0);
                imageView.setVisibility(0);
                IconSettings iconSettings = toastEntity.getIconSettings();
                imageView.setImageDrawable(ContextCompat.getDrawable(getContext(), iconSettings.getIcon()));
                Point size = iconSettings.getSize();
                if (size != null) {
                    ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
                    layoutParams.width = size.x;
                    layoutParams.height = size.y;
                    imageView.setLayoutParams(layoutParams);
                }
            }
            setVisibility(0);
            setTranslationX(0.0f);
            setTranslationY(0.0f);
            clearAnimation();
            startAnimation(AnimationUtils.loadAnimation(getContext(), R.anim.appear_from_rigth_to_left_with_alpha_show));
            this.mHandler.sendEmptyMessageDelayed(1, toastEntity.getDuration());
        }
    }

    private int hD(int i) {
        if (this.efi == 0) {
            this.efi = fA(R.dimen.dp58);
        }
        int i2 = this.efi + i;
        this.efi = i2;
        return i2;
    }

    private final int fA(@DimenRes int i) {
        return getResources().getDimensionPixelSize(i);
    }

    public void f(int i, long j) {
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) getLayoutParams();
        i = hD(i);
        if (getVisibility() == 8) {
            marginLayoutParams.topMargin = i;
            return;
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{marginLayoutParams.topMargin, i});
        ofInt.addUpdateListener(new com.iqoption.view.a.a.d(this));
        ofInt.setDuration(j);
        ofInt.start();
    }
}
