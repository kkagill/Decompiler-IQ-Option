package com.iqoption.tradinghistory.filter.a;

import android.os.Bundle;
import android.text.Editable;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.transition.AutoTransition;
import androidx.transition.TransitionManager;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.iqoption.core.util.ah;
import com.iqoption.core.util.v;
import com.iqoption.tradinghistory.a.k;
import com.iqoption.tradinghistory.a.y;
import java.util.HashMap;
import java.util.List;
import kotlin.TypeCastException;

@kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007*\u0002\b\u000b\u0018\u0000 %2\u00020\u0001:\u0001%B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0002J\u0012\u0010\u0013\u001a\u00020\u00122\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0014J\u0012\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J&\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\u001a\u0010 \u001a\u00020\u00172\u0006\u0010!\u001a\u00020\u001b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\b\u0010\"\u001a\u00020\u0017H\u0002J\u0010\u0010#\u001a\u00020\u00172\u0006\u0010$\u001a\u00020\u0012H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X.¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0004\n\u0002\u0010\tR\u0010\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0004\n\u0002\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX.¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X.¢\u0006\u0002\n\u0000¨\u0006&"}, bng = {"Lcom/iqoption/tradinghistory/filter/active/ActiveFilterFragment;", "Lcom/iqoption/core/ui/fragment/IQFragment;", "()V", "adapter", "Lcom/iqoption/tradinghistory/filter/active/ActiveFilterAdapter;", "binding", "Lcom/iqoption/tradinghistory/databinding/FragmentTradingHistoryOptionsBinding;", "filterTextWatcher", "com/iqoption/tradinghistory/filter/active/ActiveFilterFragment$filterTextWatcher$1", "Lcom/iqoption/tradinghistory/filter/active/ActiveFilterFragment$filterTextWatcher$1;", "listener", "com/iqoption/tradinghistory/filter/active/ActiveFilterFragment$listener$1", "Lcom/iqoption/tradinghistory/filter/active/ActiveFilterFragment$listener$1;", "toolbarBinding", "Lcom/iqoption/tradinghistory/databinding/LayoutTradingHistoryToolbarBinding;", "viewModel", "Lcom/iqoption/tradinghistory/filter/active/ActiveFilterViewModel;", "isSearchOpened", "", "onBackPressed", "childFragmentManager", "Landroidx/fragment/app/FragmentManager;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onViewCreated", "view", "updateClearVisibility", "updateSearchVisibility", "expand", "Companion", "tradinghistory_release"})
/* compiled from: ActiveFilterFragment.kt */
public final class c extends com.iqoption.core.ui.fragment.d {
    private static final String TAG;
    public static final b dXp = new b();
    private HashMap apm;
    private e dXj;
    private k dXk;
    private y dXl;
    private b dXm;
    private final d dXn = new d(this);
    private final c dXo = new c(this);

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0006R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, bng = {"Lcom/iqoption/tradinghistory/filter/active/ActiveFilterFragment$Companion;", "", "()V", "TAG", "", "navEntry", "Lcom/iqoption/core/ui/navigation/NavigatorEntry;", "tradinghistory_release"})
    /* compiled from: ActiveFilterFragment.kt */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(f fVar) {
            this();
        }

        public final com.iqoption.core.ui.d.c Lj() {
            return new com.iqoption.core.ui.d.c(c.TAG, c.class, null, 0, 0, 0, 0, null, null, null, null, 2044, null);
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016¨\u0006\n¸\u0006\u0000"}, bng = {"com/iqoption/tradinghistory/filter/active/ActiveFilterFragment$onViewCreated$1$4", "Landroid/widget/TextView$OnEditorActionListener;", "onEditorAction", "", "v", "Landroid/widget/TextView;", "actionId", "", "event", "Landroid/view/KeyEvent;", "tradinghistory_release"})
    /* compiled from: ActiveFilterFragment.kt */
    public static final class g implements OnEditorActionListener {
        final /* synthetic */ Bundle $savedInstanceState$inlined;
        final /* synthetic */ c dXr;

        g(c cVar, Bundle bundle) {
            this.dXr = cVar;
            this.$savedInstanceState$inlined = bundle;
        }

        public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            kotlin.jvm.internal.i.f(textView, "v");
            if (i != 3) {
                return false;
            }
            v.az(c.a(this.dXr).dWh);
            return true;
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, bng = {"<anonymous>", "", "run"})
    /* compiled from: ActiveFilterFragment.kt */
    static final class i implements Runnable {
        final /* synthetic */ y dXs;

        i(y yVar) {
            this.dXs = yVar;
        }

        public final void run() {
            this.dXs.dWx.requestFocus();
            v.ad(this.dXs.dWx);
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006¸\u0006\u0000"}, bng = {"com/iqoption/core/ext/AndroidExt$setOnDelayedClickListener$1", "Lcom/iqoption/core/ext/OnDelayClickListener;", "onDelayClick", "", "v", "Landroid/view/View;", "core_release"})
    /* compiled from: AndroidExtensions.kt */
    public static final class a extends com.iqoption.core.ext.g {
        final /* synthetic */ y dXq;

        public a(y yVar) {
            this.dXq = yVar;
            super(0, 1, null);
        }

        public void M(View view) {
            kotlin.jvm.internal.i.f(view, "v");
            EditText editText = this.dXq.dWx;
            kotlin.jvm.internal.i.e(editText, "tradingHistorySearchEdit");
            editText.setText((CharSequence) null);
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, bng = {"com/iqoption/tradinghistory/filter/active/ActiveFilterFragment$filterTextWatcher$1", "Lcom/iqoption/core/util/TextWatcherAdapter;", "afterTextChanged", "", "s", "Landroid/text/Editable;", "tradinghistory_release"})
    /* compiled from: ActiveFilterFragment.kt */
    public static final class c extends ah {
        final /* synthetic */ c dXr;

        c(c cVar) {
            this.dXr = cVar;
        }

        public void afterTextChanged(Editable editable) {
            kotlin.jvm.internal.i.f(editable, "s");
            e c = c.c(this.dXr);
            String obj = editable.toString();
            if (obj != null) {
                c.jN(v.trim(obj).toString());
                this.dXr.aVP();
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, bng = {"com/iqoption/tradinghistory/filter/active/ActiveFilterFragment$listener$1", "Lcom/iqoption/tradinghistory/filter/active/OnActiveCheckListener;", "onChecked", "", "item", "Lcom/iqoption/tradinghistory/filter/active/ActiveAdapterItem;", "checked", "", "tradinghistory_release"})
    /* compiled from: ActiveFilterFragment.kt */
    public static final class d implements i {
        final /* synthetic */ c dXr;

        d(c cVar) {
            this.dXr = cVar;
        }

        public void a(a aVar, boolean z) {
            kotlin.jvm.internal.i.f(aVar, "item");
            c.c(this.dXr).b(aVar, z);
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006¸\u0006\u0007"}, bng = {"com/iqoption/core/ext/AndroidExt$setOnDelayedClickListener$1", "Lcom/iqoption/core/ext/OnDelayClickListener;", "onDelayClick", "", "v", "Landroid/view/View;", "core_release", "com/iqoption/tradinghistory/filter/active/ActiveFilterFragment$$special$$inlined$setOnDelayedClickListener$1"})
    /* compiled from: AndroidExtensions.kt */
    public static final class e extends com.iqoption.core.ext.g {
        final /* synthetic */ Bundle $savedInstanceState$inlined;
        final /* synthetic */ c dXr;

        public e(c cVar, Bundle bundle) {
            this.dXr = cVar;
            this.$savedInstanceState$inlined = bundle;
            super(0, 1, null);
        }

        public void M(View view) {
            kotlin.jvm.internal.i.f(view, "v");
            FragmentActivity activity = this.dXr.getActivity();
            if (activity != null) {
                activity.onBackPressed();
            }
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006¸\u0006\u0007"}, bng = {"com/iqoption/core/ext/AndroidExt$setOnDelayedClickListener$1", "Lcom/iqoption/core/ext/OnDelayClickListener;", "onDelayClick", "", "v", "Landroid/view/View;", "core_release", "com/iqoption/tradinghistory/filter/active/ActiveFilterFragment$$special$$inlined$setOnDelayedClickListener$2"})
    /* compiled from: AndroidExtensions.kt */
    public static final class f extends com.iqoption.core.ext.g {
        final /* synthetic */ Bundle $savedInstanceState$inlined;
        final /* synthetic */ c dXr;

        public f(c cVar, Bundle bundle) {
            this.dXr = cVar;
            this.$savedInstanceState$inlined = bundle;
            super(0, 1, null);
        }

        public void M(View view) {
            kotlin.jvm.internal.i.f(view, "v");
            this.dXr.eN(true);
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, bng = {"<anonymous>", "", "it", "", "Lcom/iqoption/tradinghistory/filter/active/BaseActiveAdapterItem;", "kotlin.jvm.PlatformType", "onChanged"})
    /* compiled from: ActiveFilterFragment.kt */
    static final class h<T> implements Observer<List<? extends h>> {
        final /* synthetic */ c dXr;

        h(c cVar) {
            this.dXr = cVar;
        }

        /* renamed from: u */
        public final void onChanged(List<? extends h> list) {
            b b = c.b(this.dXr);
            kotlin.jvm.internal.i.e(list, "it");
            com.iqoption.core.ui.widget.recyclerview.adapter.a.a(b, list, null, 2, null);
        }
    }

    public void Bj() {
        HashMap hashMap = this.apm;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        Bj();
    }

    public static final /* synthetic */ b b(c cVar) {
        b bVar = cVar.dXm;
        if (bVar == null) {
            kotlin.jvm.internal.i.lG("adapter");
        }
        return bVar;
    }

    public static final /* synthetic */ e c(c cVar) {
        e eVar = cVar.dXj;
        if (eVar == null) {
            kotlin.jvm.internal.i.lG("viewModel");
        }
        return eVar;
    }

    static {
        String name = c.class.getName();
        if (name == null) {
            kotlin.jvm.internal.i.bnJ();
        }
        TAG = name;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.dXj = e.dXz.aW(this);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.i.f(layoutInflater, "inflater");
        this.dXk = (k) com.iqoption.core.ext.a.a((Fragment) this, com.iqoption.tradinghistory.g.e.fragment_trading_history_options, viewGroup, false, 4, null);
        k kVar = this.dXk;
        String str = "binding";
        if (kVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        y yVar = kVar.dWj;
        kotlin.jvm.internal.i.e(yVar, "binding.tradingHistoryOptionsToolbar");
        this.dXl = yVar;
        kVar = this.dXk;
        if (kVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        return kVar.getRoot();
    }

    public void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.i.f(view, Promotion.ACTION_VIEW);
        super.onViewCreated(view, bundle);
        y yVar = this.dXl;
        if (yVar == null) {
            kotlin.jvm.internal.i.lG("toolbarBinding");
        }
        ImageView imageView = yVar.cCu;
        kotlin.jvm.internal.i.e(imageView, "toolbarBack");
        imageView.setOnClickListener(new e(this, bundle));
        yVar.dWz.setText(com.iqoption.tradinghistory.g.f.assets);
        imageView = yVar.dWy;
        String str = "tradingHistorySearchIcon";
        kotlin.jvm.internal.i.e(imageView, str);
        imageView.setOnClickListener(new f(this, bundle));
        imageView = yVar.dWw;
        kotlin.jvm.internal.i.e(imageView, "tradingHistorySearchClear");
        imageView.setOnClickListener(new a(yVar));
        yVar.dWx.addTextChangedListener(this.dXo);
        yVar.dWx.setOnEditorActionListener(new g(this, bundle));
        if (bundle == null) {
            ImageView imageView2 = yVar.dWy;
            kotlin.jvm.internal.i.e(imageView2, str);
            com.iqoption.core.ext.a.ak(imageView2);
        }
        this.dXm = new b(this.dXn);
        k kVar = this.dXk;
        String str2 = "binding";
        if (kVar == null) {
            kotlin.jvm.internal.i.lG(str2);
        }
        RecyclerView recyclerView = kVar.dWi;
        String str3 = "binding.tradingHistoryOptionsList";
        kotlin.jvm.internal.i.e(recyclerView, str3);
        b bVar = this.dXm;
        if (bVar == null) {
            kotlin.jvm.internal.i.lG("adapter");
        }
        recyclerView.setAdapter(bVar);
        kVar = this.dXk;
        if (kVar == null) {
            kotlin.jvm.internal.i.lG(str2);
        }
        recyclerView = kVar.dWi;
        kotlin.jvm.internal.i.e(recyclerView, str3);
        recyclerView.setLayoutManager(new LinearLayoutManager(com.iqoption.core.ext.a.q(this)));
        kVar = this.dXk;
        if (kVar == null) {
            kotlin.jvm.internal.i.lG(str2);
        }
        recyclerView = kVar.dWi;
        kotlin.jvm.internal.i.e(recyclerView, str3);
        com.iqoption.core.ext.a.b(recyclerView);
        e eVar = this.dXj;
        if (eVar == null) {
            kotlin.jvm.internal.i.lG("viewModel");
        }
        eVar.Bo().observe(this, new h(this));
    }

    /* Access modifiers changed, original: protected */
    public boolean a(FragmentManager fragmentManager) {
        if (!aVO()) {
            return false;
        }
        eN(false);
        return true;
    }

    private final boolean aVO() {
        y yVar = this.dXl;
        if (yVar == null) {
            kotlin.jvm.internal.i.lG("toolbarBinding");
        }
        EditText editText = yVar.dWx;
        kotlin.jvm.internal.i.e(editText, "toolbarBinding.tradingHistorySearchEdit");
        return com.iqoption.core.ext.a.af(editText);
    }

    private final void eN(boolean z) {
        y yVar = this.dXl;
        if (yVar == null) {
            kotlin.jvm.internal.i.lG("toolbarBinding");
        }
        yVar.dWz.setBackgroundColor(0);
        AutoTransition autoTransition = new AutoTransition();
        View root = yVar.getRoot();
        if (root != null) {
            TransitionManager.beginDelayedTransition((ViewGroup) root, autoTransition);
            String str = "tradingHistoryTitle";
            String str2 = "tradingHistorySearchIcon";
            String str3 = "tradingHistorySearchEdit";
            ImageView imageView;
            EditText editText;
            TextView textView;
            if (z) {
                imageView = yVar.dWy;
                kotlin.jvm.internal.i.e(imageView, str2);
                com.iqoption.core.ext.a.al(imageView);
                editText = yVar.dWx;
                kotlin.jvm.internal.i.e(editText, str3);
                com.iqoption.core.ext.a.ak(editText);
                textView = yVar.dWz;
                kotlin.jvm.internal.i.e(textView, str);
                com.iqoption.core.ext.a.al(textView);
                yVar.dWx.postDelayed(new i(yVar), 300);
                aVP();
                return;
            }
            imageView = yVar.dWy;
            kotlin.jvm.internal.i.e(imageView, str2);
            com.iqoption.core.ext.a.ak(imageView);
            editText = yVar.dWx;
            kotlin.jvm.internal.i.e(editText, str3);
            com.iqoption.core.ext.a.al(editText);
            editText = yVar.dWx;
            kotlin.jvm.internal.i.e(editText, str3);
            editText.setText((CharSequence) null);
            imageView = yVar.dWw;
            kotlin.jvm.internal.i.e(imageView, "tradingHistorySearchClear");
            com.iqoption.core.ext.a.al(imageView);
            textView = yVar.dWz;
            kotlin.jvm.internal.i.e(textView, str);
            com.iqoption.core.ext.a.ak(textView);
            v.az(yVar.dWx);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup");
    }

    /* JADX WARNING: Missing block: B:9:0x0032, code skipped:
            if ((((java.lang.CharSequence) r1.getText().toString()).length() > 0 ? 1 : null) != null) goto L_0x0036;
     */
    private final void aVP() {
        /*
        r5 = this;
        r0 = r5.dXl;
        if (r0 != 0) goto L_0x0009;
    L_0x0004:
        r1 = "toolbarBinding";
        kotlin.jvm.internal.i.lG(r1);
    L_0x0009:
        r1 = r0.dWx;
        r2 = "tradingHistorySearchEdit";
        kotlin.jvm.internal.i.e(r1, r2);
        r1 = (android.view.View) r1;
        r1 = com.iqoption.core.ext.a.af(r1);
        r3 = 1;
        r4 = 0;
        if (r1 == 0) goto L_0x0035;
    L_0x001a:
        r1 = r0.dWx;
        kotlin.jvm.internal.i.e(r1, r2);
        r1 = r1.getText();
        r1 = r1.toString();
        r1 = (java.lang.CharSequence) r1;
        r1 = r1.length();
        if (r1 <= 0) goto L_0x0031;
    L_0x002f:
        r1 = 1;
        goto L_0x0032;
    L_0x0031:
        r1 = 0;
    L_0x0032:
        if (r1 == 0) goto L_0x0035;
    L_0x0034:
        goto L_0x0036;
    L_0x0035:
        r3 = 0;
    L_0x0036:
        r1 = "tradingHistorySearchClear";
        if (r3 == 0) goto L_0x0045;
    L_0x003a:
        r0 = r0.dWw;
        kotlin.jvm.internal.i.e(r0, r1);
        r0 = (android.view.View) r0;
        com.iqoption.core.ext.a.ak(r0);
        goto L_0x004f;
    L_0x0045:
        r0 = r0.dWw;
        kotlin.jvm.internal.i.e(r0, r1);
        r0 = (android.view.View) r0;
        com.iqoption.core.ext.a.al(r0);
    L_0x004f:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iqoption.tradinghistory.filter.a.c.aVP():void");
    }
}
