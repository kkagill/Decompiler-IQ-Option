package com.iqoption.core.ui.widget.c;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.iqoption.core.i.m;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/* compiled from: RecyclerViewPager */
public class a extends RecyclerView {
    private float bNi;
    private float bNj;
    private float bNk;
    private List<a> bNl;
    private int bNm;
    private int bNn;
    boolean bNo;
    int bNp;
    int bNq;
    View bNr;
    int bNs;
    int bNt;
    int bNu;
    int bNv;
    int bNw;
    int bNx;

    /* compiled from: RecyclerViewPager */
    public interface a {
        void OnPageChanged(int i, int i2);
    }

    public a(Context context) {
        this(context, null);
    }

    public a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public a(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.bNi = 0.31f;
        this.bNj = 1.0f;
        this.bNm = -1;
        this.bNn = -1;
        this.bNs = Integer.MIN_VALUE;
        this.bNt = Integer.MAX_VALUE;
        this.bNu = Integer.MIN_VALUE;
        this.bNv = Integer.MAX_VALUE;
        this.bNw = 0;
        this.bNx = Integer.MAX_VALUE;
        a(context, attributeSet, i);
    }

    private void a(Context context, AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, m.RecyclerViewPager, i, 0);
        this.bNj = obtainStyledAttributes.getFloat(m.RecyclerViewPager_flingFactor, this.bNj);
        this.bNi = obtainStyledAttributes.getFloat(m.RecyclerViewPager_triggerOffset, this.bNi);
        obtainStyledAttributes.recycle();
    }

    public void setMinPosition(int i) {
        this.bNw = i;
    }

    public void setMaxPosition(int i) {
        this.bNx = i;
    }

    private int getMaxPosition() {
        int itemCount = getAdapter().getItemCount() - 1;
        int i = this.bNx;
        return i < itemCount ? i : itemCount;
    }

    public void setFlingFactor(float f) {
        this.bNj = f;
    }

    public float getFlingFactor() {
        return this.bNj;
    }

    public void setTriggerOffset(float f) {
        this.bNi = f;
    }

    public float getTriggerOffset() {
        return this.bNi;
    }

    /* Access modifiers changed, original: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        try {
            Field declaredField = parcelable.getClass().getDeclaredField("mLayoutState");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(parcelable);
            Field declaredField2 = obj.getClass().getDeclaredField("mAnchorOffset");
            Field declaredField3 = obj.getClass().getDeclaredField("mAnchorPosition");
            declaredField3.setAccessible(true);
            declaredField2.setAccessible(true);
            if (declaredField2.getInt(obj) > 0) {
                declaredField3.set(obj, Integer.valueOf(declaredField3.getInt(obj) - 1));
            } else {
                declaredField3.set(obj, Integer.valueOf(declaredField3.getInt(obj) + 1));
            }
            declaredField2.setInt(obj, 0);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        super.onRestoreInstanceState(parcelable);
    }

    public boolean fling(int i, int i2) {
        float f = (float) i;
        float f2 = this.bNj;
        boolean fling = super.fling((int) (f * f2), (int) (((float) i2) * f2));
        if (fling) {
            if (getLayoutManager().canScrollHorizontally()) {
                fl(i);
            } else {
                fm(i2);
            }
        }
        return fling;
    }

    public void smoothScrollToPosition(int i) {
        super.smoothScrollToPosition(i);
        this.bNm = i;
        List<a> list = this.bNl;
        if (list != null) {
            for (a aVar : list) {
                if (aVar != null) {
                    aVar.OnPageChanged(this.bNn, this.bNm);
                }
            }
        }
    }

    public int getCurrentPosition() {
        return getLayoutManager().canScrollHorizontally() ? b.e(this) : b.g(this);
    }

    public int getTargetPosition() {
        return this.bNm;
    }

    /* Access modifiers changed, original: protected */
    public void fl(int i) {
        if (getChildCount() > 0) {
            int e = b.e(this);
            i = Math.min(Math.max(((int) ((((float) i) * this.bNj) / ((float) ((getWidth() - getPaddingLeft()) - getPaddingRight())))) + e, this.bNw), getMaxPosition());
            if (i == e) {
                View d = b.d(this);
                if (d != null) {
                    if (this.bNk > ((float) d.getWidth()) * this.bNi && i > this.bNw) {
                        i--;
                    } else if (this.bNk < ((float) d.getWidth()) * (-this.bNi) && i != getMaxPosition()) {
                        i++;
                    }
                }
            }
            smoothScrollToPosition(as(i, getMaxPosition() + 1));
        }
    }

    /* Access modifiers changed, original: protected */
    public void fm(int i) {
        if (getChildCount() > 0) {
            int g = b.g(this);
            i = Math.min(Math.max(((int) ((((float) i) * this.bNj) / ((float) ((getHeight() - getPaddingTop()) - getPaddingBottom())))) + g, this.bNw), getMaxPosition());
            if (i == g) {
                View f = b.f(this);
                if (f != null) {
                    if (this.bNk > ((float) f.getHeight()) * this.bNi && i > this.bNw) {
                        i--;
                    } else if (this.bNk < ((float) f.getHeight()) * (-this.bNi) && i != getMaxPosition()) {
                        i++;
                    }
                }
            }
            smoothScrollToPosition(as(i, getMaxPosition() + 1));
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 2) {
            View view = this.bNr;
            if (view != null) {
                this.bNs = Math.max(view.getLeft(), this.bNs);
                this.bNu = Math.max(this.bNr.getTop(), this.bNu);
                this.bNt = Math.min(this.bNr.getLeft(), this.bNt);
                this.bNv = Math.min(this.bNr.getTop(), this.bNv);
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    /* JADX WARNING: Missing block: B:39:0x00dc, code skipped:
            if (r4.bNr.getLeft() <= r4.bNt) goto L_0x011f;
     */
    /* JADX WARNING: Missing block: B:48:0x011d, code skipped:
            if (r4.bNr.getTop() <= r4.bNv) goto L_0x011f;
     */
    /* JADX WARNING: Missing block: B:49:0x011f, code skipped:
            r5 = r5 + 1;
     */
    public void onScrollStateChanged(int r5) {
        /*
        r4 = this;
        super.onScrollStateChanged(r5);
        r0 = 0;
        r1 = 1;
        if (r5 != r1) goto L_0x0040;
    L_0x0007:
        r4.bNo = r1;
        r5 = r4.getLayoutManager();
        r5 = r5.canScrollHorizontally();
        if (r5 == 0) goto L_0x0018;
    L_0x0013:
        r5 = com.iqoption.core.ui.widget.c.b.d(r4);
        goto L_0x001c;
    L_0x0018:
        r5 = com.iqoption.core.ui.widget.c.b.f(r4);
    L_0x001c:
        r4.bNr = r5;
        r5 = r4.bNr;
        if (r5 == 0) goto L_0x0039;
    L_0x0022:
        r5 = r4.getChildLayoutPosition(r5);
        r4.bNn = r5;
        r5 = r4.bNr;
        r5 = r5.getLeft();
        r4.bNp = r5;
        r5 = r4.bNr;
        r5 = r5.getTop();
        r4.bNq = r5;
        goto L_0x003c;
    L_0x0039:
        r5 = -1;
        r4.bNn = r5;
    L_0x003c:
        r4.bNk = r0;
        goto L_0x0187;
    L_0x0040:
        r1 = 2;
        r2 = 0;
        if (r5 != r1) goto L_0x0075;
    L_0x0044:
        r5 = 0;
        r4.bNo = r5;
        r5 = r4.bNr;
        if (r5 == 0) goto L_0x006f;
    L_0x004b:
        r5 = r4.getLayoutManager();
        r5 = r5.canScrollHorizontally();
        if (r5 == 0) goto L_0x0062;
    L_0x0055:
        r5 = r4.bNr;
        r5 = r5.getLeft();
        r0 = r4.bNp;
        r5 = r5 - r0;
        r5 = (float) r5;
        r4.bNk = r5;
        goto L_0x0071;
    L_0x0062:
        r5 = r4.bNr;
        r5 = r5.getTop();
        r0 = r4.bNq;
        r5 = r5 - r0;
        r5 = (float) r5;
        r4.bNk = r5;
        goto L_0x0071;
    L_0x006f:
        r4.bNk = r0;
    L_0x0071:
        r4.bNr = r2;
        goto L_0x0187;
    L_0x0075:
        if (r5 != 0) goto L_0x0187;
    L_0x0077:
        r5 = r4.bNo;
        if (r5 == 0) goto L_0x0133;
    L_0x007b:
        r5 = r4.getLayoutManager();
        r5 = r5.canScrollHorizontally();
        if (r5 == 0) goto L_0x008a;
    L_0x0085:
        r5 = com.iqoption.core.ui.widget.c.b.e(r4);
        goto L_0x008e;
    L_0x008a:
        r5 = com.iqoption.core.ui.widget.c.b.g(r4);
    L_0x008e:
        r0 = r4.bNr;
        if (r0 == 0) goto L_0x0121;
    L_0x0092:
        r5 = r4.getChildAdapterPosition(r0);
        r0 = r4.getLayoutManager();
        r0 = r0.canScrollHorizontally();
        if (r0 == 0) goto L_0x00df;
    L_0x00a0:
        r0 = r4.bNr;
        r0 = r0.getLeft();
        r1 = r4.bNp;
        r0 = r0 - r1;
        r0 = (float) r0;
        r1 = r4.bNr;
        r1 = r1.getWidth();
        r1 = (float) r1;
        r3 = r4.bNi;
        r1 = r1 * r3;
        r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1));
        if (r1 <= 0) goto L_0x00c4;
    L_0x00b9:
        r1 = r4.bNr;
        r1 = r1.getLeft();
        r3 = r4.bNs;
        if (r1 < r3) goto L_0x00c4;
    L_0x00c3:
        goto L_0x0102;
    L_0x00c4:
        r1 = r4.bNr;
        r1 = r1.getWidth();
        r1 = (float) r1;
        r3 = r4.bNi;
        r3 = -r3;
        r1 = r1 * r3;
        r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1));
        if (r0 >= 0) goto L_0x0121;
    L_0x00d4:
        r0 = r4.bNr;
        r0 = r0.getLeft();
        r1 = r4.bNt;
        if (r0 > r1) goto L_0x0121;
    L_0x00de:
        goto L_0x011f;
    L_0x00df:
        r0 = r4.bNr;
        r0 = r0.getTop();
        r1 = r4.bNq;
        r0 = r0 - r1;
        r0 = (float) r0;
        r1 = r4.bNr;
        r1 = r1.getHeight();
        r1 = (float) r1;
        r3 = r4.bNi;
        r1 = r1 * r3;
        r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1));
        if (r1 <= 0) goto L_0x0105;
    L_0x00f8:
        r1 = r4.bNr;
        r1 = r1.getTop();
        r3 = r4.bNu;
        if (r1 < r3) goto L_0x0105;
    L_0x0102:
        r5 = r5 + -1;
        goto L_0x0121;
    L_0x0105:
        r1 = r4.bNr;
        r1 = r1.getHeight();
        r1 = (float) r1;
        r3 = r4.bNi;
        r3 = -r3;
        r1 = r1 * r3;
        r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1));
        if (r0 >= 0) goto L_0x0121;
    L_0x0115:
        r0 = r4.bNr;
        r0 = r0.getTop();
        r1 = r4.bNv;
        if (r0 > r1) goto L_0x0121;
    L_0x011f:
        r5 = r5 + 1;
    L_0x0121:
        r0 = r4.getAdapter();
        r0 = r0.getItemCount();
        r5 = r4.as(r5, r0);
        r4.smoothScrollToPosition(r5);
        r4.bNr = r2;
        goto L_0x017a;
    L_0x0133:
        r5 = r4.bNm;
        r0 = r4.bNn;
        if (r5 == r0) goto L_0x016b;
    L_0x0139:
        r5 = r4.bNl;
        if (r5 == 0) goto L_0x0157;
    L_0x013d:
        r5 = r5.iterator();
    L_0x0141:
        r0 = r5.hasNext();
        if (r0 == 0) goto L_0x0157;
    L_0x0147:
        r0 = r5.next();
        r0 = (com.iqoption.core.ui.widget.c.a.a) r0;
        if (r0 == 0) goto L_0x0141;
    L_0x014f:
        r1 = r4.bNn;
        r2 = r4.bNm;
        r0.OnPageChanged(r1, r2);
        goto L_0x0141;
    L_0x0157:
        r5 = r4.bNm;
        r4.bNn = r5;
        r0 = r4.getAdapter();
        r0 = r0.getItemCount();
        r5 = r4.as(r5, r0);
        r4.smoothScrollToPosition(r5);
        goto L_0x017a;
    L_0x016b:
        r5 = r4.getAdapter();
        r5 = r5.getItemCount();
        r5 = r4.as(r0, r5);
        r4.smoothScrollToPosition(r5);
    L_0x017a:
        r5 = -2147483648; // 0xffffffff80000000 float:-0.0 double:NaN;
        r4.bNs = r5;
        r0 = 2147483647; // 0x7fffffff float:NaN double:1.060997895E-314;
        r4.bNt = r0;
        r4.bNu = r5;
        r4.bNv = r0;
    L_0x0187:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iqoption.core.ui.widget.c.a.onScrollStateChanged(int):void");
    }

    public int as(int i, int i2) {
        int i3 = this.bNw;
        if (i < i3) {
            return i3;
        }
        return i >= i2 ? i2 - 1 : i;
    }

    public void a(a aVar) {
        if (this.bNl == null) {
            this.bNl = new ArrayList();
        }
        this.bNl.add(aVar);
    }
}
