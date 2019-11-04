package com.iqoption.fragment.dialog.popup.b;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Observer;
import com.google.android.gms.plus.PlusShare;
import com.iqoption.core.ext.g;
import com.iqoption.e.zl;
import com.iqoption.x.R;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 #2\u00020\u0001:\u0001#B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0010\u001a\u00020\u0011J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u0012\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0014J&\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\b\u0010 \u001a\u00020\u0011H\u0016J\b\u0010!\u001a\u00020\u0011H\u0016J\b\u0010\"\u001a\u00020\u0011H\u0016R\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0004\n\u0002\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u00020\u000b8BX\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u000e¢\u0006\u0002\n\u0000¨\u0006$"}, bng = {"Lcom/iqoption/fragment/dialog/popup/toast/TemplateToast;", "Lcom/iqoption/core/ui/fragment/IQFragment;", "()V", "duration", "", "Ljava/lang/Long;", "handler", "Landroid/os/Handler;", "hideCommand", "Ljava/lang/Runnable;", "popup", "Lcom/iqoption/core/microservices/popupserver/response/Popup;", "getPopup", "()Lcom/iqoption/core/microservices/popupserver/response/Popup;", "showEvent", "Lcom/iqoption/core/analytics/AnalyticsSendEvent;", "close", "", "event", "", "onBackPressed", "", "childFragmentManager", "Landroidx/fragment/app/FragmentManager;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "onStart", "onStop", "Companion", "app_optionXRelease"})
/* compiled from: TemplateToast.kt */
public final class a extends com.iqoption.core.ui.fragment.d {
    public static final String TAG = a.class.getName();
    public static final a dfe = new a();
    private final Runnable aUY = new b(this);
    private HashMap apm;
    private com.iqoption.core.analytics.c dfd;
    private Long duration;
    private final Handler handler = new Handler();

    @i(bne = {1, 1, 15}, bnf = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0018\u0010\u0005\u001a\n \u0006*\u0004\u0018\u00010\u00040\u00048\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, bng = {"Lcom/iqoption/fragment/dialog/popup/toast/TemplateToast$Companion;", "", "()V", "ARG_POPUP", "", "TAG", "kotlin.jvm.PlatformType", "newInstance", "Lcom/iqoption/fragment/dialog/popup/toast/TemplateToast;", "popup", "Lcom/iqoption/core/microservices/popupserver/response/Popup;", "app_optionXRelease"})
    /* compiled from: TemplateToast.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final a h(com.iqoption.core.microservices.popupserver.response.a aVar) {
            kotlin.jvm.internal.i.f(aVar, "popup");
            a aVar2 = new a();
            Bundle bundle = new Bundle();
            bundle.putParcelable("arg.popup", aVar);
            aVar2.setArguments(bundle);
            return aVar2;
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, bng = {"<anonymous>", "", "run"})
    /* compiled from: TemplateToast.kt */
    static final class b implements Runnable {
        final /* synthetic */ a dff;

        b(a aVar) {
            this.dff = aVar;
        }

        public final void run() {
            this.dff.close();
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "action", "Lcom/iqoption/fragment/dialog/popup/toast/TemplateToastViewModel$Action;", "kotlin.jvm.PlatformType", "onChanged"})
    /* compiled from: TemplateToast.kt */
    static final class d<T> implements Observer<com.iqoption.fragment.dialog.popup.b.b.a> {
        final /* synthetic */ a dff;
        final /* synthetic */ b dfj;

        d(a aVar, b bVar) {
            this.dff = aVar;
            this.dfj = bVar;
        }

        /* JADX WARNING: Missing block: B:3:0x0016, code skipped:
            if (r3 != null) goto L_0x001b;
     */
        /* renamed from: a */
        public final void onChanged(com.iqoption.fragment.dialog.popup.b.b.a r5) {
            /*
            r4 = this;
            r0 = com.iqoption.fragment.dialog.popup.b.deN;
            r1 = r4.dfj;
            r1 = r1.aCn();
            r1 = r1.getId();
            r1 = r1.longValue();
            if (r5 == 0) goto L_0x0019;
        L_0x0012:
            r3 = r5.getId();
            if (r3 == 0) goto L_0x0019;
        L_0x0018:
            goto L_0x001b;
        L_0x0019:
            r3 = "";
        L_0x001b:
            r0.k(r1, r3);
            r5 = r5 instanceof com.iqoption.fragment.dialog.popup.b.b.a.a;
            if (r5 == 0) goto L_0x0027;
        L_0x0022:
            r5 = r4.dff;
            r5.close();
        L_0x0027:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.iqoption.fragment.dialog.popup.b.a$d.onChanged(com.iqoption.fragment.dialog.popup.b.b$a):void");
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, bng = {"com/iqoption/fragment/dialog/popup/toast/TemplateToast$onCreateView$clickListener$1", "Lcom/iqoption/core/ext/OnDelayClickListener;", "onDelayClick", "", "v", "Landroid/view/View;", "app_optionXRelease"})
    /* compiled from: TemplateToast.kt */
    public static final class e extends g {
        final /* synthetic */ b dfj;

        e(b bVar) {
            this.dfj = bVar;
            super(0, 1, null);
        }

        public void M(View view) {
            kotlin.jvm.internal.i.f(view, "v");
            int id = view.getId();
            if (id == R.id.accept) {
                this.dfj.aCr();
            } else if (id == R.id.veil) {
                this.dfj.aCq();
            }
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006¸\u0006\u0007"}, bng = {"com/iqoption/fragment/dialog/popup/toast/TemplateToast$onCreateView$root$1$1$1", "Lcom/iqoption/core/util/link/OpenBrowserClickListener;", "onLinkClicked", "", "link", "Lcom/iqoption/core/util/link/Link;", "app_optionXRelease", "com/iqoption/fragment/dialog/popup/toast/TemplateToast$$special$$inlined$let$lambda$1"})
    /* compiled from: TemplateToast.kt */
    public static final class c extends com.iqoption.core.util.b.g {
        final /* synthetic */ a dff;
        final /* synthetic */ zl dfg;
        final /* synthetic */ e dfh;
        final /* synthetic */ b dfi;

        c(Context context, zl zlVar, a aVar, e eVar, b bVar) {
            this.dfg = zlVar;
            this.dff = aVar;
            this.dfh = eVar;
            this.dfi = bVar;
            super(context);
        }

        public void onLinkClicked(com.iqoption.core.util.b.a aVar) {
            kotlin.jvm.internal.i.f(aVar, "link");
            super.onLinkClicked(aVar);
            com.iqoption.fragment.dialog.popup.b.deN.l(this.dfi.aCn().getId().longValue(), aVar.getUrl());
        }
    }

    public static final a h(com.iqoption.core.microservices.popupserver.response.a aVar) {
        return dfe.h(aVar);
    }

    public void Bj() {
        HashMap hashMap = this.apm;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    private final com.iqoption.core.microservices.popupserver.response.a aCn() {
        Parcelable parcelable = com.iqoption.core.ext.a.s(this).getParcelable("arg.popup");
        kotlin.jvm.internal.i.e(parcelable, "args.getParcelable(ARG_POPUP)");
        return (com.iqoption.core.microservices.popupserver.response.a) parcelable;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.i.f(layoutInflater, "inflater");
        b a = b.dfo.a(this, aCn());
        if (a.isInvalid()) {
            close();
            return null;
        }
        View view;
        this.duration = a.aCo().getDuration();
        this.dfd = com.iqoption.fragment.dialog.popup.b.deN.f(aCn());
        e eVar = new e(a);
        zl zlVar = (zl) com.iqoption.core.ext.a.a(layoutInflater, (int) R.layout.template_toast, viewGroup, false, 4, null);
        OnClickListener onClickListener = eVar;
        zlVar.cdJ.setOnClickListener(onClickListener);
        zlVar.cmS.setOnClickListener(onClickListener);
        TextView textView = zlVar.alH;
        kotlin.jvm.internal.i.e(textView, PlusShare.KEY_CONTENT_DEEP_LINK_METADATA_TITLE);
        textView.setText(a.aCo().getTitle());
        com.iqoption.core.util.b.a aCt = a.aCo().aCt();
        String message = a.aCo().getMessage();
        String str = "message";
        if (aCt != null) {
            TextView textView2 = zlVar.bfF;
            kotlin.jvm.internal.i.e(textView2, str);
            com.iqoption.core.util.b.a[] aVarArr = new com.iqoption.core.util.b.a[]{aCt};
            com.iqoption.core.util.b.d.a(new com.iqoption.core.util.b.e(aVarArr, textView2, message, 0, 0, false, new c(com.iqoption.core.ext.a.q(this), zlVar, this, eVar, a), 56, null));
        } else {
            TextView textView3 = zlVar.bfF;
            kotlin.jvm.internal.i.e(textView3, str);
            textView3.setText(message);
        }
        str = "accept";
        if (kotlin.jvm.internal.i.y(a.aCo().aCv(), com.iqoption.fragment.dialog.popup.b.b.a.b.dfp)) {
            view = zlVar.bVK;
            kotlin.jvm.internal.i.e(view, "separator");
            com.iqoption.core.ext.a.al(view);
            textView = zlVar.cmS;
            kotlin.jvm.internal.i.e(textView, str);
            com.iqoption.core.ext.a.al(textView);
        }
        textView = zlVar.cmS;
        kotlin.jvm.internal.i.e(textView, str);
        textView.setText(a.aCo().aCv().getTitle());
        view = zlVar.getRoot();
        kotlin.jvm.internal.i.e(view, "inflater.inflateBinding<…tion.title\n        }.root");
        a.aCp().observe(this, new d(this, a));
        return view;
    }

    public void onStart() {
        super.onStart();
        Long l = this.duration;
        if (l != null) {
            this.handler.postDelayed(this.aUY, TimeUnit.SECONDS.toMillis(l.longValue()));
        }
    }

    public void onStop() {
        super.onStop();
        this.handler.removeCallbacks(this.aUY);
    }

    public void onDestroyView() {
        super.onDestroyView();
        com.iqoption.core.analytics.c cVar = this.dfd;
        if (cVar != null) {
            cVar.Cc();
        }
        Bj();
    }

    /* Access modifiers changed, original: protected */
    public boolean a(FragmentManager fragmentManager) {
        close();
        return true;
    }

    public final void close() {
        close("close");
    }

    private final void close(String str) {
        FragmentActivity activity = getActivity();
        if (activity != null && isAdded() && !isStateSaved()) {
            com.iqoption.core.ext.a.t(this).popBackStack();
            com.iqoption.popup.c.a aVar = com.iqoption.popup.c.dKG;
            kotlin.jvm.internal.i.e(activity, "activity");
            aVar.A(activity).a(aCn(), str);
        }
    }
}
