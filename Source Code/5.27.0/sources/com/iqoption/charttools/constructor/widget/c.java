package com.iqoption.charttools.constructor.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView.ItemAnimator;
import androidx.recyclerview.widget.RecyclerView.ItemDecoration;
import androidx.recyclerview.widget.RecyclerView.LayoutManager;
import androidx.recyclerview.widget.RecyclerView.State;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import java.util.Arrays;
import java.util.List;

@SuppressLint({"ViewConstructor"})
/* compiled from: ColorPresetsView */
final class c extends RecyclerView {
    private static final int aHo = com.iqoption.charttools.n.d.dp42;
    private static final int aHp = com.iqoption.charttools.n.d.dp20;
    private static final int aHq = com.iqoption.charttools.n.d.dp12;
    private static final int aHr = com.iqoption.charttools.n.d.dp5;
    private final int[] aHs;
    private final d aHt;
    private a aHu;
    private int lineHeight;

    /* compiled from: ColorPresetsView */
    interface a {
        void eo(int i);
    }

    /* compiled from: ColorPresetsView */
    static final class b extends View {
        private final b aHx;
        private final float aHy;

        b(Context context) {
            super(context);
            this.aHy = com.iqoption.core.ext.a.l(context, c.aHo);
            this.aHx = new b(com.iqoption.core.ext.a.l(context, c.aHp), com.iqoption.core.ext.a.l(context, c.aHq), com.iqoption.core.ext.a.a(context, 1.0f));
            this.aHx.setCallback(this);
        }

        /* Access modifiers changed, original: protected */
        public void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            i = com.iqoption.core.ext.a.M(this.aHy);
            this.aHx.setBounds(0, 0, i, i);
            setMeasuredDimension(i, i);
        }

        /* Access modifiers changed, original: protected */
        public void onDraw(Canvas canvas) {
            super.onDraw(canvas);
            this.aHx.draw(canvas);
        }

        /* Access modifiers changed, original: protected */
        public boolean verifyDrawable(@NonNull Drawable drawable) {
            return this.aHx == drawable || super.verifyDrawable(drawable);
        }

        /* Access modifiers changed, original: protected */
        public void drawableStateChanged() {
            super.drawableStateChanged();
            int[] drawableState = getDrawableState();
            if (this.aHx.isStateful() && this.aHx.setState(drawableState)) {
                invalidate();
            }
        }

        /* Access modifiers changed, original: 0000 */
        public void setColor(int i) {
            this.aHx.setColor(i);
        }

        public void setSelected(boolean z) {
            super.setSelected(z);
            this.aHx.jumpToCurrentState();
        }

        /* Access modifiers changed, original: 0000 */
        public void bT(boolean z) {
            super.setSelected(z);
        }
    }

    /* compiled from: ColorPresetsView */
    static final class c extends ViewHolder {
        final b aHz = ((b) this.itemView);

        c(@NonNull Context context, @NonNull OnClickListener onClickListener) {
            super(new b(context));
            this.aHz.setOnClickListener(onClickListener);
        }

        /* Access modifiers changed, original: 0000 */
        public void bind(int i, boolean z) {
            this.aHz.setColor(i);
            this.aHz.setSelected(z);
            this.aHz.setTag(Integer.valueOf(i));
        }

        /* Access modifiers changed, original: 0000 */
        public void bU(boolean z) {
            this.aHz.bT(z);
        }
    }

    /* compiled from: ColorPresetsView */
    static final class d extends Adapter<c> {
        private static final Object aHA = new Object();
        private final OnClickListener aHB;
        private int[] hR;
        private int selected = -1;

        d(@NonNull OnClickListener onClickListener) {
            this.aHB = onClickListener;
        }

        /* Access modifiers changed, original: 0000 */
        public void setColors(int[] iArr) {
            if (!Arrays.equals(this.hR, iArr)) {
                this.hR = iArr;
                notifyDataSetChanged();
            }
        }

        /* Access modifiers changed, original: 0000 */
        public void setSelected(int i) {
            int i2;
            int length = this.hR.length;
            if (i != 0) {
                i2 = 0;
                while (i2 < length) {
                    if (this.hR[i2] == i) {
                        break;
                    }
                    i2++;
                }
            }
            i2 = -1;
            i = this.selected;
            if (i != i2) {
                this.selected = i2;
                if (i != -1) {
                    notifyItemChanged(i, aHA);
                }
                if (i2 != -1) {
                    notifyItemChanged(i2, aHA);
                }
            }
        }

        @NonNull
        /* renamed from: k */
        public c onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
            return new c(viewGroup.getContext(), this.aHB);
        }

        /* renamed from: a */
        public void onBindViewHolder(@NonNull c cVar, int i) {
            cVar.bind(this.hR[i], this.selected == i);
        }

        /* renamed from: a */
        public void onBindViewHolder(@NonNull c cVar, int i, @NonNull List<Object> list) {
            if (list.size() > 0) {
                boolean z = false;
                if (list.get(0) == aHA) {
                    if (this.selected == i) {
                        z = true;
                    }
                    cVar.bU(z);
                    return;
                }
            }
            super.onBindViewHolder(cVar, i, list);
        }

        public int getItemCount() {
            int[] iArr = this.hR;
            if (iArr == null) {
                return 0;
            }
            return iArr.length;
        }

        public long getItemId(int i) {
            return (long) this.hR[i];
        }
    }

    private int NN() {
        return 4;
    }

    c(Context context, int[] iArr) {
        super(context);
        if (iArr.length == 12) {
            this.aHs = iArr;
        } else {
            int[] iArr2 = new int[12];
            System.arraycopy(iArr, 0, iArr2, 0, iArr2.length);
            this.aHs = iArr2;
        }
        super.setLayoutManager(new GridLayoutManager(context, NN()));
        this.aHt = new d(new -$$Lambda$c$Z-T9mta0y9EZzxFYaLmSYY__8jM(this));
        this.aHt.setColors(this.aHs);
        super.setAdapter(this.aHt);
        super.setItemAnimator(null);
        final int m = com.iqoption.core.ext.a.m(context, aHr);
        this.lineHeight = com.iqoption.core.ext.a.m(context, aHo);
        super.addItemDecoration(new ItemDecoration() {
            public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, State state) {
                if (recyclerView.getChildAdapterPosition(view) / c.this.NN() != 0) {
                    rect.top = m;
                }
            }
        });
        setHasFixedSize(true);
        setOverScrollMode(2);
        setNestedScrollingEnabled(false);
        setFocusableInTouchMode(false);
    }

    private /* synthetic */ void V(View view) {
        int intValue = ((Integer) view.getTag()).intValue();
        a aVar = this.aHu;
        if (aVar != null) {
            aVar.eo(intValue);
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void a(a aVar) {
        this.aHu = aVar;
    }

    /* Access modifiers changed, original: 0000 */
    public int getLineHeight() {
        return this.lineHeight;
    }

    /* Access modifiers changed, original: 0000 */
    public void setSelected(int i) {
        this.aHt.setSelected(i);
    }

    public void setAdapter(Adapter adapter) {
        throw new UnsupportedOperationException();
    }

    public void setLayoutManager(LayoutManager layoutManager) {
        throw new UnsupportedOperationException();
    }

    public void setItemAnimator(ItemAnimator itemAnimator) {
        throw new UnsupportedOperationException();
    }

    public void addItemDecoration(ItemDecoration itemDecoration) {
        throw new UnsupportedOperationException();
    }

    public void removeItemDecoration(ItemDecoration itemDecoration) {
        throw new UnsupportedOperationException();
    }

    public void removeItemDecorationAt(int i) {
        throw new UnsupportedOperationException();
    }
}
