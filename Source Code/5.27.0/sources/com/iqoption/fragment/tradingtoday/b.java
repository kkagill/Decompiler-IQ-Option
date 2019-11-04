package com.iqoption.fragment.tradingtoday;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.iqoption.core.d.c;
import com.iqoption.core.ext.g;
import com.iqoption.e.pb;
import kotlin.f.d;
import kotlin.i;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.k;
import kotlin.reflect.j;

@i(bne = {1, 1, 15}, bnf = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001:\u0001\u0010B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R+\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b8F@FX\u0002¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, bng = {"Lcom/iqoption/fragment/tradingtoday/PopularAssetHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "callback", "Lcom/iqoption/fragment/tradingtoday/PopularAssetHolder$Callback;", "binding", "Lcom/iqoption/databinding/ItemTrendingTodayBinding;", "(Lcom/iqoption/fragment/tradingtoday/PopularAssetHolder$Callback;Lcom/iqoption/databinding/ItemTrendingTodayBinding;)V", "<set-?>", "Lcom/iqoption/fragment/tradingtoday/PopularAssetItem;", "bound", "getBound", "()Lcom/iqoption/fragment/tradingtoday/PopularAssetItem;", "setBound", "(Lcom/iqoption/fragment/tradingtoday/PopularAssetItem;)V", "bound$delegate", "Lkotlin/properties/ReadWriteProperty;", "Callback", "app_optionXRelease"})
/* compiled from: PopularAssetHolder.kt */
public final class b extends ViewHolder {
    static final /* synthetic */ j[] anY = new j[]{k.a(new MutablePropertyReference1Impl(k.G(b.class), "bound", "getBound()Lcom/iqoption/fragment/tradingtoday/PopularAssetItem;"))};
    private final d bHX;
    private final b dqD;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, bng = {"Lcom/iqoption/fragment/tradingtoday/PopularAssetHolder$Callback;", "", "onItemClick", "", "item", "Lcom/iqoption/fragment/tradingtoday/PopularAssetItem;", "app_optionXRelease"})
    /* compiled from: PopularAssetHolder.kt */
    public interface b {
        void b(d dVar);
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006¸\u0006\u0000"}, bng = {"com/iqoption/core/ext/AndroidExt$setOnDelayedClickListener$1", "Lcom/iqoption/core/ext/OnDelayClickListener;", "onDelayClick", "", "v", "Landroid/view/View;", "core_release"})
    /* compiled from: AndroidExtensions.kt */
    public static final class a extends g {
        final /* synthetic */ b dqE;

        public a(b bVar) {
            this.dqE = bVar;
            super(0, 1, null);
        }

        public void M(View view) {
            kotlin.jvm.internal.i.f(view, "v");
            this.dqE.dqD.b(this.dqE.aIe());
        }
    }

    public final void a(d dVar) {
        kotlin.jvm.internal.i.f(dVar, "<set-?>");
        this.bHX.a(this, anY[0], dVar);
    }

    public final d aIe() {
        return (d) this.bHX.b(this, anY[0]);
    }

    public b(b bVar, pb pbVar) {
        kotlin.jvm.internal.i.f(bVar, "callback");
        kotlin.jvm.internal.i.f(pbVar, "binding");
        super(pbVar.getRoot());
        this.dqD = bVar;
        ConstraintLayout constraintLayout = pbVar.cfP;
        kotlin.jvm.internal.i.e(constraintLayout, "binding.container");
        constraintLayout.setOnClickListener(new a(this));
        this.bHX = c.j(new PopularAssetHolder$$special$$inlined$bindable$1(pbVar, pbVar));
    }
}
