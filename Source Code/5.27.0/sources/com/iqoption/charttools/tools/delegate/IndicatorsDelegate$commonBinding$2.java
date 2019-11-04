package com.iqoption.charttools.tools.delegate;

import android.view.View;
import android.widget.LinearLayout;
import androidx.lifecycle.Observer;
import androidx.viewpager.widget.ViewPager;
import com.iqoption.charttools.tools.data.c;
import com.iqoption.core.ext.g;
import com.iqoption.e.zv;
import com.iqoption.x.R;
import java.util.List;
import kotlin.i;
import kotlin.jvm.internal.Lambda;

@i(bne = {1, 1, 15}, bnf = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, bng = {"<anonymous>", "Lcom/iqoption/databinding/ToolsContentIndicatorsCommonBinding;", "invoke"})
/* compiled from: IndicatorsDelegate.kt */
final class IndicatorsDelegate$commonBinding$2 extends Lambda implements kotlin.jvm.a.a<zv> {
    final /* synthetic */ c $context;
    final /* synthetic */ d this$0;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006¸\u0006\u0007"}, bng = {"com/iqoption/core/ext/AndroidExt$setOnDelayedClickListener$1", "Lcom/iqoption/core/ext/OnDelayClickListener;", "onDelayClick", "", "v", "Landroid/view/View;", "core_release", "com/iqoption/charttools/tools/delegate/IndicatorsDelegate$commonBinding$2$$special$$inlined$setOnDelayedClickListener$1"})
    /* compiled from: AndroidExtensions.kt */
    public static final class a extends g {
        final /* synthetic */ IndicatorsDelegate$commonBinding$2 aNt;

        public a(IndicatorsDelegate$commonBinding$2 indicatorsDelegate$commonBinding$2) {
            this.aNt = indicatorsDelegate$commonBinding$2;
            super(0, 1, null);
        }

        public void M(View view) {
            kotlin.jvm.internal.i.f(view, "v");
            this.aNt.this$0.PL().Qr();
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006¨\u0006\u0007"}, bng = {"<anonymous>", "", "items", "", "Lcom/iqoption/charttools/tools/data/CategoryAdapterItem;", "kotlin.jvm.PlatformType", "onChanged", "com/iqoption/charttools/tools/delegate/IndicatorsDelegate$commonBinding$2$1$2"})
    /* compiled from: IndicatorsDelegate.kt */
    static final class b<T> implements Observer<List<? extends c>> {
        final /* synthetic */ IndicatorsDelegate$commonBinding$2 aNt;
        final /* synthetic */ zv aNu;

        b(zv zvVar, IndicatorsDelegate$commonBinding$2 indicatorsDelegate$commonBinding$2) {
            this.aNu = zvVar;
            this.aNt = indicatorsDelegate$commonBinding$2;
        }

        /* renamed from: u */
        public final void onChanged(List<? extends c> list) {
            if (list != null) {
                ViewPager viewPager = this.aNu.aRy;
                kotlin.jvm.internal.i.e(viewPager, "pager");
                viewPager.setAdapter(new c(this.aNt.$context, this.aNt.this$0.PQ(), this.aNt.this$0.PL(), list));
            }
        }
    }

    IndicatorsDelegate$commonBinding$2(d dVar, c cVar) {
        this.this$0 = dVar;
        this.$context = cVar;
        super(0);
    }

    /* renamed from: QL */
    public final zv invoke() {
        zv zvVar = (zv) com.iqoption.core.ext.a.a(this.$context.PP(), (int) R.layout.tools_content_indicators_common, null, false, 6, null);
        zvVar.cfQ.setupWithViewPager(zvVar.aRy);
        LinearLayout linearLayout = zvVar.cus;
        kotlin.jvm.internal.i.e(linearLayout, "searchContent");
        linearLayout.setOnClickListener(new a(this));
        this.this$0.PL().Qe().observe(this.this$0, new b(zvVar, this));
        return zvVar;
    }
}
