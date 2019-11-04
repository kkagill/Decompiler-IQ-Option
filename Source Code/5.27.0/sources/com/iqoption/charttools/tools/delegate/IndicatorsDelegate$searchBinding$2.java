package com.iqoption.charttools.tools.delegate;

import android.text.Editable;
import android.view.View;
import android.widget.ImageView;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.LayoutManager;
import com.iqoption.charttools.tools.data.h;
import com.iqoption.charttools.tools.data.j;
import com.iqoption.core.ext.g;
import com.iqoption.core.util.ah;
import com.iqoption.e.zx;
import com.iqoption.x.R;
import java.util.List;
import kotlin.i;
import kotlin.jvm.a.m;
import kotlin.jvm.internal.Lambda;
import kotlin.l;

@i(bne = {1, 1, 15}, bnf = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, bng = {"<anonymous>", "Lcom/iqoption/databinding/ToolsContentIndicatorsSearchBinding;", "invoke"})
/* compiled from: IndicatorsDelegate.kt */
final class IndicatorsDelegate$searchBinding$2 extends Lambda implements kotlin.jvm.a.a<zx> {
    final /* synthetic */ c $context;
    final /* synthetic */ d this$0;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006¸\u0006\u0000"}, bng = {"com/iqoption/charttools/tools/delegate/IndicatorsDelegate$searchBinding$2$1$1", "Lcom/iqoption/core/util/TextWatcherAdapter;", "afterTextChanged", "", "s", "Landroid/text/Editable;", "app_optionXRelease"})
    /* compiled from: IndicatorsDelegate.kt */
    public static final class a extends ah {
        final /* synthetic */ IndicatorsDelegate$searchBinding$2 aNv;

        a(IndicatorsDelegate$searchBinding$2 indicatorsDelegate$searchBinding$2) {
            this.aNv = indicatorsDelegate$searchBinding$2;
        }

        public void afterTextChanged(Editable editable) {
            kotlin.jvm.internal.i.f(editable, "s");
            this.aNv.this$0.PL().u(editable);
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006¸\u0006\u0007"}, bng = {"com/iqoption/core/ext/AndroidExt$setOnDelayedClickListener$1", "Lcom/iqoption/core/ext/OnDelayClickListener;", "onDelayClick", "", "v", "Landroid/view/View;", "core_release", "com/iqoption/charttools/tools/delegate/IndicatorsDelegate$searchBinding$2$$special$$inlined$setOnDelayedClickListener$1"})
    /* compiled from: AndroidExtensions.kt */
    public static final class b extends g {
        final /* synthetic */ IndicatorsDelegate$searchBinding$2 aNv;
        final /* synthetic */ zx aNw;

        public b(zx zxVar, IndicatorsDelegate$searchBinding$2 indicatorsDelegate$searchBinding$2) {
            this.aNw = zxVar;
            this.aNv = indicatorsDelegate$searchBinding$2;
            super(0, 1, null);
        }

        public void M(View view) {
            kotlin.jvm.internal.i.f(view, "v");
            this.aNv.this$0.PL().Qs();
            this.aNw.cfF.setText("");
            RecyclerView recyclerView = this.aNw.cuw;
            kotlin.jvm.internal.i.e(recyclerView, "searchResults");
            LayoutManager layoutManager = recyclerView.getLayoutManager();
            if (layoutManager == null) {
                kotlin.jvm.internal.i.bnJ();
            }
            layoutManager.scrollToPosition(0);
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016R,\u0010\u0004\u001a \u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u00060\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, bng = {"com/iqoption/charttools/tools/delegate/IndicatorsDelegate$searchBinding$2$1$3", "Landroidx/lifecycle/Observer;", "", "Lcom/iqoption/charttools/tools/data/IndicatorAdapterItem;", "scrollToStart", "Lkotlin/Function2;", "", "onChanged", "items", "app_optionXRelease"})
    /* compiled from: IndicatorsDelegate.kt */
    public static final class c implements Observer<List<? extends h>> {
        final /* synthetic */ com.iqoption.charttools.tools.a.b aNs;
        private final m<List<? extends h>, List<? extends h>, l> aNx = new IndicatorsDelegate$searchBinding$2$1$3$scrollToStart$1(this);
        final /* synthetic */ zx aNy;

        c(zx zxVar, com.iqoption.charttools.tools.a.b bVar) {
            this.aNy = zxVar;
            this.aNs = bVar;
        }

        /* renamed from: u */
        public void onChanged(List<? extends h> list) {
            if (list != null) {
                this.aNs.a((List) list, this.aNx);
            }
        }
    }

    IndicatorsDelegate$searchBinding$2(d dVar, c cVar) {
        this.this$0 = dVar;
        this.$context = cVar;
        super(0);
    }

    /* renamed from: QM */
    public final zx invoke() {
        zx zxVar = (zx) com.iqoption.core.ext.a.a(this.$context.PP(), (int) R.layout.tools_content_indicators_search, null, false, 6, null);
        zxVar.cfF.addTextChangedListener(new a(this));
        ImageView imageView = zxVar.bZN;
        kotlin.jvm.internal.i.e(imageView, "btnCancel");
        imageView.setOnClickListener(new b(zxVar, this));
        zxVar.cuw.addOnScrollListener(new com.iqoption.core.ui.widget.recyclerview.b(zxVar.cfF));
        com.iqoption.charttools.tools.a.b bVar = new com.iqoption.charttools.tools.a.b(new b(this.this$0.PQ(), this.this$0.PL(), j.aNa));
        RecyclerView recyclerView = zxVar.cuw;
        kotlin.jvm.internal.i.e(recyclerView, "searchResults");
        recyclerView.setAdapter(bVar);
        this.this$0.PL().a((com.iqoption.charttools.tools.data.c) j.aNa).observe(this.$context, new c(zxVar, bVar));
        return zxVar;
    }
}
