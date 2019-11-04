package com.iqoption.sessions;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.iqoption.core.microservices.auth.response.g;
import com.iqoption.e.w;
import com.iqoption.x.R;
import java.util.HashMap;
import java.util.List;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0005¢\u0006\u0002\u0010\u0002J&\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\u0016\u0010\u0011\u001a\u00020\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX.¢\u0006\u0002\n\u0000¨\u0006\u0017"}, bng = {"Lcom/iqoption/sessions/ActiveSessionsFragment;", "Landroidx/fragment/app/Fragment;", "()V", "binding", "Lcom/iqoption/databinding/ActiveSessionsFragmentBinding;", "sessionsAdapter", "Lcom/iqoption/sessions/ActiveSessionsAdapter;", "viewModel", "Lcom/iqoption/sessions/ActiveSessionsViewModel;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "terminateSessions", "", "sessions", "", "Lcom/iqoption/core/microservices/auth/response/Session;", "Companion", "app_optionXRelease"})
/* compiled from: ActiveSessionsFragment.kt */
public final class b extends Fragment {
    private static final String TAG = "javaClass";
    public static final a dSR = new a();
    private HashMap apm;
    private w dSO;
    private d dSP;
    private a dSQ;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u00020\u00048\u0006X\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, bng = {"Lcom/iqoption/sessions/ActiveSessionsFragment$Companion;", "", "()V", "TAG", "", "TAG$annotations", "getTAG", "()Ljava/lang/String;", "app_optionXRelease"})
    /* compiled from: ActiveSessionsFragment.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final String Bx() {
            return b.TAG;
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"})
    /* compiled from: ActiveSessionsFragment.kt */
    static final class b implements OnClickListener {
        final /* synthetic */ b this$0;

        b(b bVar) {
            this.this$0 = bVar;
        }

        public final void onClick(View view) {
            FragmentActivity activity = this.this$0.getActivity();
            if (activity != null) {
                activity.onBackPressed();
            }
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, bng = {"<anonymous>", "", "it", "Lcom/iqoption/core/ui/Resource;", "Ljava/lang/Void;", "kotlin.jvm.PlatformType", "onChanged"})
    /* compiled from: ActiveSessionsFragment.kt */
    static final class c<T> implements Observer<com.iqoption.core.ui.d<Void>> {
        final /* synthetic */ b this$0;

        c(b bVar) {
            this.this$0 = bVar;
        }

        /* renamed from: a */
        public final void onChanged(com.iqoption.core.ui.d<Void> dVar) {
            if (dVar != null) {
                int i = c.aob[dVar.akW().ordinal()];
                String str = "binding.progressLayout";
                FrameLayout frameLayout;
                if (i == 1) {
                    frameLayout = b.a(this.this$0).bTl;
                    kotlin.jvm.internal.i.e(frameLayout, str);
                    frameLayout.setVisibility(8);
                    b.b(this.this$0).notifyDataSetChanged();
                } else if (i == 2) {
                    frameLayout = b.a(this.this$0).bTl;
                    kotlin.jvm.internal.i.e(frameLayout, str);
                    frameLayout.setVisibility(8);
                    com.iqoption.app.a.b.Gq();
                } else if (i == 3) {
                    frameLayout = b.a(this.this$0).bTl;
                    kotlin.jvm.internal.i.e(frameLayout, str);
                    frameLayout.setVisibility(0);
                }
            }
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, bng = {"<anonymous>", "", "it", "Lcom/iqoption/core/ui/Resource;", "Ljava/lang/Void;", "kotlin.jvm.PlatformType", "onChanged"})
    /* compiled from: ActiveSessionsFragment.kt */
    static final class d<T> implements Observer<com.iqoption.core.ui.d<Void>> {
        final /* synthetic */ b this$0;

        d(b bVar) {
            this.this$0 = bVar;
        }

        /* renamed from: a */
        public final void onChanged(com.iqoption.core.ui.d<Void> dVar) {
            if (dVar != null) {
                int i = c.axg[dVar.akW().ordinal()];
                String str = "binding.progressLayout";
                FrameLayout frameLayout;
                if (i == 1) {
                    frameLayout = b.a(this.this$0).bTl;
                    kotlin.jvm.internal.i.e(frameLayout, str);
                    frameLayout.setVisibility(8);
                    b.b(this.this$0).notifyDataSetChanged();
                } else if (i == 2) {
                    frameLayout = b.a(this.this$0).bTl;
                    kotlin.jvm.internal.i.e(frameLayout, str);
                    frameLayout.setVisibility(8);
                    com.iqoption.app.a.b.Gq();
                } else if (i == 3) {
                    frameLayout = b.a(this.this$0).bTl;
                    kotlin.jvm.internal.i.e(frameLayout, str);
                    frameLayout.setVisibility(0);
                }
            }
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

    public static final /* synthetic */ w a(b bVar) {
        w wVar = bVar.dSO;
        if (wVar == null) {
            kotlin.jvm.internal.i.lG("binding");
        }
        return wVar;
    }

    public static final /* synthetic */ a b(b bVar) {
        a aVar = bVar.dSQ;
        if (aVar == null) {
            kotlin.jvm.internal.i.lG("sessionsAdapter");
        }
        return aVar;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.i.f(layoutInflater, "inflater");
        this.dSO = (w) com.iqoption.core.ext.a.a((Fragment) this, (int) R.layout.active_sessions_fragment, viewGroup, false);
        w wVar = this.dSO;
        String str = "binding";
        if (wVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        View view = wVar.bTk;
        if (view != null) {
            view.setOnClickListener(new b(this));
        }
        com.iqoption.sessions.d.a aVar = d.dSW;
        FragmentActivity activity = getActivity();
        if (activity == null) {
            kotlin.jvm.internal.i.bnJ();
        }
        kotlin.jvm.internal.i.e(activity, "activity!!");
        this.dSP = aVar.D(activity);
        d dVar = this.dSP;
        String str2 = "viewModel";
        if (dVar == null) {
            kotlin.jvm.internal.i.lG(str2);
        }
        this.dSQ = new a(dVar.aTQ(), new ActiveSessionsFragment$onCreateView$2(this));
        wVar = this.dSO;
        if (wVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        RecyclerView recyclerView = wVar.bTm;
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        recyclerView.setHasFixedSize(true);
        Context context = recyclerView.getContext();
        kotlin.jvm.internal.i.e(context, "context");
        recyclerView.addItemDecoration(new com.iqoption.widget.c(context.getResources().getDimensionPixelOffset(R.dimen.dp28), false, true));
        a aVar2 = this.dSQ;
        if (aVar2 == null) {
            kotlin.jvm.internal.i.lG("sessionsAdapter");
        }
        recyclerView.setAdapter(aVar2);
        d dVar2 = this.dSP;
        if (dVar2 == null) {
            kotlin.jvm.internal.i.lG(str2);
        }
        if (dVar2.aTQ().isEmpty()) {
            dVar2 = this.dSP;
            if (dVar2 == null) {
                kotlin.jvm.internal.i.lG(str2);
            }
            dVar2.aTR().observe(this, new c(this));
        }
        w wVar2 = this.dSO;
        if (wVar2 == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        return wVar2.getRoot();
    }

    private final void br(List<g> list) {
        d dVar = this.dSP;
        if (dVar == null) {
            kotlin.jvm.internal.i.lG("viewModel");
        }
        dVar.bs(list).observe(this, new d(this));
    }
}
