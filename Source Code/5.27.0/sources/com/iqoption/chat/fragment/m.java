package com.iqoption.chat.fragment;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ItemDecoration;
import androidx.recyclerview.widget.RecyclerView.State;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.iqoption.chat.component.ac;
import com.iqoption.chat.e.b;
import com.iqoption.chat.e.d;
import com.iqoption.core.ext.a;
import com.iqoption.core.j;
import com.iqoption.core.microservices.chat.response.e;
import kotlin.g.c;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ(\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"H\u0002J\u0011\u0010#\u001a\u00020\f2\u0006\u0010$\u001a\u00020\fH\u0001J\u0011\u0010%\u001a\u00020&2\u0006\u0010$\u001a\u00020\fH\u0001J\u0011\u0010'\u001a\u00020(2\u0006\u0010$\u001a\u00020\fH\u0001J\u0011\u0010)\u001a\u00020*2\u0006\u0010$\u001a\u00020\fH\u0001J(\u0010+\u001a\u00020\u001a2\u0006\u0010,\u001a\u00020-2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010.\u001a\u00020/H\u0016J\u0011\u00100\u001a\u00020\u00112\u0006\u0010$\u001a\u00020\fH\u0001J\u0011\u00101\u001a\u00020\f2\u0006\u0010$\u001a\u00020\fH\u0001J\u0011\u00102\u001a\u0002032\u0006\u0010$\u001a\u00020\fH\u0001J*\u00102\u001a\u0002032\u0006\u0010$\u001a\u00020\f2\u0012\u00104\u001a\n\u0012\u0006\b\u0001\u0012\u00020605\"\u000206H\u0001¢\u0006\u0002\u00107J\t\u00108\u001a\u000209H\u0001J \u0010:\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010.\u001a\u00020/H\u0016J\u0011\u0010;\u001a\u00020\u00112\u0006\u0010<\u001a\u00020\u0011H\u0001R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0011X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000¨\u0006="}, bng = {"Lcom/iqoption/chat/fragment/MessageDecoration;", "Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;", "Lcom/iqoption/core/Resourcer;", "resourcer", "dateComparator", "Lcom/iqoption/chat/util/DateComparator;", "adapter", "Lcom/iqoption/chat/component/MessagesAdapter;", "dateBadge", "Lcom/iqoption/chat/fragment/BadgeView;", "(Lcom/iqoption/core/Resourcer;Lcom/iqoption/chat/util/DateComparator;Lcom/iqoption/chat/component/MessagesAdapter;Lcom/iqoption/chat/fragment/BadgeView;)V", "dateBadgeOffset", "", "dateBadgeTopOffset", "dateDrawable", "Lcom/iqoption/chat/fragment/DateDrawable;", "dateOffsetBottom", "", "dateOffsetTop", "gapMsgBetweenDays", "gapMsgBetweenSenders", "gapMsgOneSender", "gapMsgSuggest", "gapOther", "gapSuggest", "drawDateAbove", "", "c", "Landroid/graphics/Canvas;", "view", "Landroid/view/View;", "parent", "Landroidx/recyclerview/widget/RecyclerView;", "date", "", "getColor", "resId", "getColors", "Landroid/content/res/ColorStateList;", "getDrawable", "Landroid/graphics/drawable/Drawable;", "getFont", "Landroid/graphics/Typeface;", "getItemOffsets", "outRect", "Landroid/graphics/Rect;", "state", "Landroidx/recyclerview/widget/RecyclerView$State;", "getPixels", "getPixelsInt", "getString", "", "args", "", "", "(I[Ljava/lang/Object;)Ljava/lang/CharSequence;", "getViewConfiguration", "Landroid/view/ViewConfiguration;", "onDrawOver", "toPixels", "dp", "chat_release"})
/* compiled from: MessageDecoration.kt */
public final class m extends ItemDecoration implements j {
    private final b aSO;
    private final /* synthetic */ j aSR;
    private final BadgeView aSc;
    private final int aTH = ez(d.dp2);
    private final int aTI = ez(d.dp12);
    private final int aTJ = ez(d.dp50);
    private final int aTK = ez(d.dp12);
    private final int aTL = ez(d.dp6);
    private final int aTM = ez(d.dp8);
    private final float aTN = ey(d.dp8);
    private final float aTO = ey(d.dp12);
    private final int aTP = ez(d.dp54);
    private final int aTQ = ez(d.dp46);
    private final f aTR;
    private final ac aTS;

    public CharSequence eA(int i) {
        return this.aSR.eA(i);
    }

    public ColorStateList ex(int i) {
        return this.aSR.ex(i);
    }

    public float ey(int i) {
        return this.aSR.ey(i);
    }

    public int ez(int i) {
        return this.aSR.ez(i);
    }

    public int getColor(int i) {
        return this.aSR.getColor(i);
    }

    public Drawable getDrawable(int i) {
        return this.aSR.getDrawable(i);
    }

    public Typeface getFont(int i) {
        return this.aSR.getFont(i);
    }

    public m(j jVar, b bVar, ac acVar, BadgeView badgeView) {
        kotlin.jvm.internal.i.f(jVar, "resourcer");
        kotlin.jvm.internal.i.f(bVar, "dateComparator");
        kotlin.jvm.internal.i.f(acVar, "adapter");
        kotlin.jvm.internal.i.f(badgeView, "dateBadge");
        this.aSR = jVar;
        this.aSO = bVar;
        this.aTS = acVar;
        this.aSc = badgeView;
        this.aTR = new f(jVar, this.aSO);
    }

    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, State state) {
        kotlin.jvm.internal.i.f(rect, "outRect");
        kotlin.jvm.internal.i.f(view, Promotion.ACTION_VIEW);
        kotlin.jvm.internal.i.f(recyclerView, "parent");
        kotlin.jvm.internal.i.f(state, "state");
        super.getItemOffsets(rect, view, recyclerView, state);
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        e et = this.aTS.et(childAdapterPosition);
        if (childAdapterPosition != this.aTS.getItemCount() - 1 || et == null) {
            if (et != null) {
                e et2 = this.aTS.et(childAdapterPosition + 1);
                if (et2 != null) {
                    if (et.acc() == et2.acc()) {
                        if (this.aSO.n(et.getDate(), et2.getDate())) {
                            rect.top = this.aTH;
                        } else {
                            rect.top = this.aTJ;
                        }
                    } else if (this.aSO.n(et.getDate(), et2.getDate())) {
                        rect.top = this.aTI;
                    } else {
                        rect.top = this.aTJ;
                    }
                }
            } else if (this.aTS.eu(childAdapterPosition) != null) {
                childAdapterPosition++;
                et = this.aTS.et(childAdapterPosition);
                com.iqoption.core.microservices.chat.response.m eu = this.aTS.eu(childAdapterPosition);
                if (et != null) {
                    rect.top = this.aTK;
                } else if (eu != null) {
                    rect.top = this.aTL;
                }
            } else {
                childAdapterPosition = this.aTM;
                rect.top = childAdapterPosition;
                rect.bottom = childAdapterPosition;
            }
            return;
        }
        rect.top = this.aTJ;
    }

    public void onDrawOver(Canvas canvas, RecyclerView recyclerView, State state) {
        RecyclerView recyclerView2 = recyclerView;
        kotlin.jvm.internal.i.f(canvas, "c");
        kotlin.jvm.internal.i.f(recyclerView2, "parent");
        kotlin.jvm.internal.i.f(state, "state");
        if (recyclerView.getChildCount() >= 2) {
            this.aTR.setBounds(0, 0, 0, 0);
            e eVar = (e) null;
            e eVar2 = eVar;
            int i = 0;
            int i2 = 0;
            int i3;
            for (int childCount = recyclerView.getChildCount(); i < childCount; childCount = i3) {
                int a = a.a(recyclerView2, i);
                e et = this.aTS.et(a);
                int i4 = a + 1;
                eVar = this.aTS.et(i4);
                if (et != null) {
                    View childAt;
                    String str = "parent.getChildAt(i)";
                    if (eVar != null) {
                        i3 = childCount;
                        if (!this.aSO.n(et.getDate(), eVar.getDate())) {
                            childAt = recyclerView2.getChildAt(i);
                            kotlin.jvm.internal.i.e(childAt, str);
                            a(canvas, childAt, recyclerView, et.getDate());
                        }
                    } else {
                        i3 = childCount;
                    }
                    if (i4 == this.aTS.getItemCount()) {
                        childAt = recyclerView2.getChildAt(i);
                        kotlin.jvm.internal.i.e(childAt, str);
                        a(canvas, childAt, recyclerView, et.getDate());
                    }
                } else {
                    i3 = childCount;
                }
                if (et != null) {
                    i2 = a;
                    eVar2 = et;
                }
                i++;
                Canvas canvas2 = canvas;
            }
            if (eVar2 != null) {
                this.aSc.setDate(eVar2.getDate());
            }
            Rect bounds = this.aTR.getBounds();
            BadgeView badgeView = this.aSc;
            float f = 0.0f;
            if (!bounds.isEmpty()) {
                if (i2 != this.aTS.getItemCount() - 1) {
                    if (bounds.top < this.aTQ) {
                        f = (float) (bounds.top - this.aTQ);
                    }
                } else if (bounds.top < this.aTP) {
                    f = (float) (bounds.top - this.aTP);
                }
            }
            badgeView.setTranslationY(f);
        }
    }

    private final void a(Canvas canvas, View view, RecyclerView recyclerView, long j) {
        this.aTR.setDate(j);
        int intrinsicWidth = this.aTR.getIntrinsicWidth();
        int intrinsicHeight = this.aTR.getIntrinsicHeight();
        int au = c.au(((float) (recyclerView.getWidth() - this.aTR.getIntrinsicWidth())) / 2.0f);
        int top = view.getTop();
        intrinsicWidth += au;
        int intrinsicHeight2 = this.aTR.getIntrinsicHeight();
        float f = this.aTN;
        float f2 = this.aTO;
        float f3 = (float) intrinsicHeight2;
        f = (f + f2) + f3;
        if (m.a((c) k.p(f2, f), top)) {
            top = c.au(this.aTN);
        } else {
            float f4 = (float) top;
            if (f4 > f) {
                f = this.aTN;
                top = c.au((f4 + f) - ((f + this.aTO) + f3));
            } else {
                top = -1;
            }
        }
        if (top != -1) {
            this.aTR.setBounds(au, top, intrinsicWidth, intrinsicHeight + top);
            this.aTR.draw(canvas);
        }
    }
}
