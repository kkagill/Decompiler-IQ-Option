package com.iqoption.core.ui.fragment;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.iqoption.core.a.h;
import com.iqoption.core.analytics.c;
import com.iqoption.core.d;
import com.iqoption.core.ext.g;
import java.util.HashMap;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J&\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J\b\u0010\u0013\u001a\u00020\nH\u0016J\b\u0010\u0014\u001a\u00020\nH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0016"}, bng = {"Lcom/iqoption/core/ui/fragment/TechnicalLogFragment;", "Landroidx/fragment/app/Fragment;", "()V", "binding", "Lcom/iqoption/core/databinding/FragmentTechnicalLogBinding;", "event", "Lcom/iqoption/core/analytics/AnalyticsSendEvent;", "log", "", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onPause", "onResume", "Companion", "core_release"})
/* compiled from: TechnicalLogFragment.kt */
public final class e extends Fragment {
    private static final String TAG;
    public static final a bIX = new a();
    private HashMap apm;
    private h bIV;
    private c bIW;
    private String biU;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000b"}, bng = {"Lcom/iqoption/core/ui/fragment/TechnicalLogFragment$Companion;", "", "()V", "ARG_LOG", "", "TAG", "getTAG", "()Ljava/lang/String;", "newInstance", "Lcom/iqoption/core/ui/fragment/TechnicalLogFragment;", "log", "core_release"})
    /* compiled from: TechnicalLogFragment.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final String Bx() {
            return e.TAG;
        }

        public final e hi(String str) {
            kotlin.jvm.internal.i.f(str, "log");
            e eVar = new e();
            Bundle bundle = new Bundle();
            bundle.putString("ARG_LOG", str);
            eVar.setArguments(bundle);
            return eVar;
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006¸\u0006\u0000"}, bng = {"com/iqoption/core/ext/AndroidExt$setOnDelayedClickListener$1", "Lcom/iqoption/core/ext/OnDelayClickListener;", "onDelayClick", "", "v", "Landroid/view/View;", "core_release"})
    /* compiled from: AndroidExtensions.kt */
    public static final class b extends g {
        final /* synthetic */ e bIY;

        public b(e eVar) {
            this.bIY = eVar;
            super(0, 1, null);
        }

        public void M(View view) {
            kotlin.jvm.internal.i.f(view, "v");
            com.iqoption.core.ext.a.t(this.bIY).popBackStack();
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

    static {
        String name = e.class.getName();
        if (name == null) {
            kotlin.jvm.internal.i.bnJ();
        }
        TAG = name;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        bundle = getArguments();
        this.biU = bundle != null ? bundle.getString("ARG_LOG") : null;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.i.f(layoutInflater, "inflater");
        this.bIV = (h) com.iqoption.core.ext.a.a((Fragment) this, com.iqoption.core.i.h.fragment_technical_log, viewGroup, false);
        h hVar = this.bIV;
        String str = "binding";
        if (hVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        TextView textView = hVar.bfF;
        String str2 = "binding.message";
        kotlin.jvm.internal.i.e(textView, str2);
        textView.setMovementMethod(ScrollingMovementMethod.getInstance());
        hVar = this.bIV;
        if (hVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        textView = hVar.bfF;
        kotlin.jvm.internal.i.e(textView, str2);
        textView.setText(this.biU);
        hVar = this.bIV;
        if (hVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        FrameLayout frameLayout = hVar.bfE;
        kotlin.jvm.internal.i.e(frameLayout, "binding.logLayout");
        frameLayout.setOnClickListener(new b(this));
        hVar = this.bIV;
        if (hVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        return hVar.getRoot();
    }

    public void onResume() {
        super.onResume();
        this.bIW = d.EC().dm("technical-log");
    }

    public void onPause() {
        super.onPause();
        c cVar = this.bIW;
        if (cVar != null) {
            cVar.Cc();
        }
        this.bIW = (c) null;
    }
}
