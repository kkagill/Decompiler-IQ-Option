package com.iqoption.signals;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.annotation.IntRange;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.iqoption.core.d.c;
import com.iqoption.core.ext.g;
import kotlin.f.d;
import kotlin.i;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.k;
import kotlin.l;
import kotlin.reflect.j;

@i(bne = {1, 1, 15}, bnf = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0016B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0002\u0010\bR+\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00068F@FX\u0002¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u000e\u0010\u0011\u001a\u00020\u0012X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0012X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, bng = {"Lcom/iqoption/signals/SignalItemViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/iqoption/signals/SignalItemBinding;", "onClick", "Lkotlin/Function1;", "Lcom/iqoption/signals/SignalItem;", "", "(Lcom/iqoption/signals/SignalItemBinding;Lkotlin/jvm/functions/Function1;)V", "<set-?>", "bound", "getBound", "()Lcom/iqoption/signals/SignalItem;", "setBound", "(Lcom/iqoption/signals/SignalItem;)V", "bound$delegate", "Lkotlin/properties/ReadWriteProperty;", "colorNegative", "", "colorPositive", "dotsDrawable", "Lcom/iqoption/signals/SignalItemViewHolder$DotsDrawable;", "DotsDrawable", "signals_release"})
/* compiled from: SignalItemViewHolder.kt */
public final class h extends ViewHolder {
    static final /* synthetic */ j[] anY = new j[]{k.a(new MutablePropertyReference1Impl(k.G(h.class), "bound", "getBound()Lcom/iqoption/signals/SignalItem;"))};
    private final d bHX;
    private final int dTg = com.iqoption.core.ext.a.b((ViewHolder) this, com.iqoption.signals.d.a.green);
    private final int dTh = com.iqoption.core.ext.a.b((ViewHolder) this, com.iqoption.signals.d.a.red);
    private final b dTi = new b(com.iqoption.core.ext.a.c((ViewHolder) this, com.iqoption.signals.d.b.dp1), com.iqoption.core.ext.a.c((ViewHolder) this, com.iqoption.signals.d.b.dp7) / 2.0f, com.iqoption.core.ext.a.c((ViewHolder) this, com.iqoption.signals.d.b.dp7));

    @i(bne = {1, 1, 15}, bnf = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000  2\u00020\u0001:\u0001 B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\u0012\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\b\u0010\u0018\u001a\u00020\bH\u0016J\b\u0010\u0019\u001a\u00020\bH\u0016J\b\u0010\u001a\u001a\u00020\bH\u0016J\u0010\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\bH\u0016J\u0012\u0010\u001d\u001a\u00020\u00152\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016R$\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b8F@FX\u000e¢\u0006\f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u000e\u0010\u0005\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R&\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b8\u0006@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u000b\"\u0004\b\u0010\u0010\rR\u000e\u0010\u0011\u001a\u00020\u0012X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006!"}, bng = {"Lcom/iqoption/signals/SignalItemViewHolder$DotsDrawable;", "Landroid/graphics/drawable/Drawable;", "dotStrokeWidth", "", "dotRadius", "dotOffset", "(FFF)V", "value", "", "color", "getColor", "()I", "setColor", "(I)V", "fillCount", "getFillCount", "setFillCount", "paint", "Landroid/graphics/Paint;", "strokeRadius", "draw", "", "canvas", "Landroid/graphics/Canvas;", "getIntrinsicHeight", "getIntrinsicWidth", "getOpacity", "setAlpha", "alpha", "setColorFilter", "colorFilter", "Landroid/graphics/ColorFilter;", "Companion", "signals_release"})
    /* compiled from: SignalItemViewHolder.kt */
    public static final class b extends Drawable {
        public static final a dTk = new a();
        private final float bNd;
        @IntRange(from = 1, to = 2)
        private int bNe = 1;
        private final float bNf;
        private final float bNg;
        private final Paint fh;

        @i(bne = {1, 1, 15}, bnf = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, bng = {"Lcom/iqoption/signals/SignalItemViewHolder$DotsDrawable$Companion;", "", "()V", "DOT_MAX", "", "signals_release"})
        /* compiled from: SignalItemViewHolder.kt */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(f fVar) {
                this();
            }
        }

        public int getOpacity() {
            return -3;
        }

        public void setAlpha(int i) {
        }

        public void setColorFilter(ColorFilter colorFilter) {
        }

        public b(float f, float f2, float f3) {
            this.bNf = f2;
            this.bNg = f3;
            Paint paint = new Paint(1);
            paint.setStrokeWidth(f);
            this.fh = paint;
            this.bNd = this.bNf - (f / 2.0f);
        }

        public final void setColor(int i) {
            this.fh.setColor(i);
            invalidateSelf();
        }

        public final void fk(int i) {
            if (this.bNe != i) {
                this.bNe = i;
                invalidateSelf();
            }
        }

        public int getIntrinsicWidth() {
            float f = (float) 2;
            return c.au(((this.bNf * f) * f) + (this.bNg * ((float) 1)));
        }

        public int getIntrinsicHeight() {
            return c.au(((float) 2) * this.bNf);
        }

        public void draw(Canvas canvas) {
            if (canvas != null) {
                canvas.save();
                float f = this.bNf;
                canvas.translate(f, f);
                for (int i = 0; i < 2; i++) {
                    float f2;
                    if (i < this.bNe) {
                        this.fh.setStyle(Style.FILL);
                        f2 = this.bNf;
                    } else {
                        this.fh.setStyle(Style.STROKE);
                        f2 = this.bNd;
                    }
                    if (i != 0) {
                        canvas.translate(this.bNg + (this.bNf * ((float) 2)), 0.0f);
                    }
                    canvas.drawCircle(0.0f, 0.0f, f2, this.fh);
                }
                canvas.restore();
            }
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006¸\u0006\u0000"}, bng = {"com/iqoption/core/ext/AndroidExt$setOnDelayedClickListener$1", "Lcom/iqoption/core/ext/OnDelayClickListener;", "onDelayClick", "", "v", "Landroid/view/View;", "core_release"})
    /* compiled from: AndroidExtensions.kt */
    public static final class a extends g {
        final /* synthetic */ kotlin.jvm.a.b dTj;
        final /* synthetic */ h this$0;

        public a(h hVar, kotlin.jvm.a.b bVar) {
            this.this$0 = hVar;
            this.dTj = bVar;
            super(0, 1, null);
        }

        public void M(View view) {
            kotlin.jvm.internal.i.f(view, "v");
            this.dTj.invoke(this.this$0.aUh());
        }
    }

    public final void a(f fVar) {
        kotlin.jvm.internal.i.f(fVar, "<set-?>");
        this.bHX.a(this, anY[0], fVar);
    }

    public final f aUh() {
        return (f) this.bHX.b(this, anY[0]);
    }

    public h(g gVar, kotlin.jvm.a.b<? super f, l> bVar) {
        kotlin.jvm.internal.i.f(gVar, "binding");
        kotlin.jvm.internal.i.f(bVar, "onClick");
        super(gVar.getRoot());
        gVar.getRoot().setOnClickListener(new a(this, bVar));
        gVar.awI().setImageDrawable(this.dTi);
        this.bHX = c.j(new SignalItemViewHolder$$special$$inlined$bindable$1(gVar, this));
    }
}
