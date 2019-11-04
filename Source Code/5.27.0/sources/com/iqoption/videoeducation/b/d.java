package com.iqoption.videoeducation.b;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.graphics.Rect;
import android.os.Bundle;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.google.android.gms.plus.PlusShare;
import com.iqoption.analytics.q;
import com.iqoption.core.util.ah;
import com.iqoption.e.nt;
import com.iqoption.util.ak;
import com.iqoption.util.y;
import com.iqoption.videoeducation.m;
import com.iqoption.videoeducation.n;
import com.iqoption.x.R;
import java.util.HashMap;
import java.util.List;

@kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\n\u001a\u00020\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0014J&\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0016H\u0016J\u0014\u0010\u0018\u001a\u00020\u0016*\u00020\u00042\u0006\u0010\b\u001a\u00020\tH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u00068VX\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX.¢\u0006\u0002\n\u0000¨\u0006\u001a"}, bng = {"Lcom/iqoption/videoeducation/fragment/VideosFragment;", "Lcom/iqoption/core/ui/fragment/IQFragment;", "()V", "binding", "Lcom/iqoption/databinding/FragmentVideoEducationVideosBinding;", "isCustomAnimationsEnabled", "", "()Z", "viewModel", "Lcom/iqoption/videoeducation/VideoEducationViewModel;", "onBackPressed", "childFragmentManager", "Landroidx/fragment/app/FragmentManager;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onEnterAnimation", "", "onExitAnimation", "onLayout", "Companion", "app_optionXRelease"})
/* compiled from: VideosFragment.kt */
public final class d extends com.iqoption.core.ui.fragment.d {
    public static final String TAG = d.class.getName();
    public static final a edD = new a();
    private HashMap apm;
    private com.iqoption.videoeducation.j edB;
    private nt edC;

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0018\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u00048\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, bng = {"Lcom/iqoption/videoeducation/fragment/VideosFragment$Companion;", "", "()V", "TAG", "", "kotlin.jvm.PlatformType", "app_optionXRelease"})
    /* compiled from: VideosFragment.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004¸\u0006\u0005"}, bng = {"com/iqoption/core/ext/AndroidExt$doOnLayout$1", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "onGlobalLayout", "", "core_release", "com/iqoption/videoeducation/fragment/VideosFragment$$special$$inlined$doOnLayout$1"})
    /* compiled from: AndroidExtensions.kt */
    public static final class d implements OnGlobalLayoutListener {
        final /* synthetic */ View bgH;
        final /* synthetic */ d edE;
        final /* synthetic */ nt edF;

        public d(View view, nt ntVar, d dVar) {
            this.bgH = view;
            this.edF = ntVar;
            this.edE = dVar;
        }

        public void onGlobalLayout() {
            this.bgH.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            d dVar = this.edE;
            dVar.a(this.edF, d.a(dVar));
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006¸\u0006\u0000"}, bng = {"com/iqoption/videoeducation/fragment/VideosFragment$onCreateView$1$clickListener$1", "Lcom/iqoption/core/ext/OnDelayClickListener;", "onDelayClick", "", "v", "Landroid/view/View;", "app_optionXRelease"})
    /* compiled from: VideosFragment.kt */
    public static final class b extends com.iqoption.core.ext.g {
        final /* synthetic */ d edE;

        b(d dVar) {
            this.edE = dVar;
            super(0, 1, null);
        }

        public void M(View view) {
            kotlin.jvm.internal.i.f(view, "v");
            int id = view.getId();
            if (id == R.id.btnBack) {
                d.a(this.edE).aXs();
            } else if (id == R.id.btnCloseSearch) {
                d.a(this.edE).aXt();
            } else if (id == R.id.btnSearch) {
                d.a(this.edE).Qr();
            }
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006¸\u0006\u0000"}, bng = {"com/iqoption/videoeducation/fragment/VideosFragment$onCreateView$1$1", "Lcom/iqoption/core/util/TextWatcherAdapter;", "afterTextChanged", "", "s", "Landroid/text/Editable;", "app_optionXRelease"})
    /* compiled from: VideosFragment.kt */
    public static final class c extends ah {
        final /* synthetic */ d edE;

        c(d dVar) {
            this.edE = dVar;
        }

        public void afterTextChanged(Editable editable) {
            kotlin.jvm.internal.i.f(editable, "s");
            super.afterTextChanged(editable);
            d.a(this.edE).P(editable);
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "catalog", "Lcom/iqoption/videoeducation/model/VideoCatalog;", "kotlin.jvm.PlatformType", "onChanged"})
    /* compiled from: VideosFragment.kt */
    static final class e<T> implements Observer<com.iqoption.videoeducation.c.a> {
        final /* synthetic */ nt edG;

        e(nt ntVar) {
            this.edG = ntVar;
        }

        /* renamed from: d */
        public final void onChanged(com.iqoption.videoeducation.c.a aVar) {
            if (aVar != null) {
                TextView textView = this.edG.alH;
                kotlin.jvm.internal.i.e(textView, PlusShare.KEY_CONTENT_DEEP_LINK_METADATA_TITLE);
                textView.setText(aVar.aXE().On());
            }
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0005¸\u0006\u0000"}, bng = {"com/iqoption/videoeducation/fragment/VideosFragment$onLayout$1$1", "Landroidx/recyclerview/widget/GridLayoutManager$SpanSizeLookup;", "getSpanSize", "", "position", "app_optionXRelease"})
    /* compiled from: VideosFragment.kt */
    public static final class f extends SpanSizeLookup {
        final /* synthetic */ com.iqoption.videoeducation.a.i edH;
        final /* synthetic */ int edI;

        f(com.iqoption.videoeducation.a.i iVar, int i) {
            this.edH = iVar;
            this.edI = i;
        }

        public int getSpanSize(int i) {
            if (this.edH.getItemCount() == 1 && this.edH.getItemViewType(0) == -1) {
                return this.edI;
            }
            return 1;
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, bng = {"<anonymous>", "", "isShown", "", "kotlin.jvm.PlatformType", "onChanged", "(Ljava/lang/Boolean;)V"})
    /* compiled from: VideosFragment.kt */
    static final class g<T> implements Observer<Boolean> {
        final /* synthetic */ d edE;
        final /* synthetic */ nt edJ;

        g(d dVar, nt ntVar) {
            this.edE = dVar;
            this.edJ = ntVar;
        }

        /* renamed from: f */
        public final void onChanged(Boolean bool) {
            if (bool != null) {
                boolean booleanValue = bool.booleanValue();
                String str = PlusShare.KEY_CONTENT_DEEP_LINK_METADATA_TITLE;
                String str2 = "btnSearch";
                String str3 = "btnCloseSearch";
                String str4 = "searchLayout";
                LinearLayout linearLayout;
                TextView textView;
                ImageView imageView;
                if (booleanValue) {
                    linearLayout = this.edJ.ckA;
                    kotlin.jvm.internal.i.e(linearLayout, str4);
                    com.iqoption.core.ext.a.ak(linearLayout);
                    textView = this.edJ.ckz;
                    kotlin.jvm.internal.i.e(textView, str3);
                    com.iqoption.core.ext.a.ak(textView);
                    imageView = this.edJ.cfA;
                    kotlin.jvm.internal.i.e(imageView, str2);
                    com.iqoption.core.ext.a.al(imageView);
                    textView = this.edJ.alH;
                    kotlin.jvm.internal.i.e(textView, str);
                    com.iqoption.core.ext.a.al(textView);
                    this.edJ.aRC.requestFocus();
                    y.b(this.edE.getActivity(), this.edJ.aRC);
                    return;
                }
                EditText editText = this.edJ.aRC;
                kotlin.jvm.internal.i.e(editText, "searchInput");
                editText.setText((CharSequence) null);
                linearLayout = this.edJ.ckA;
                kotlin.jvm.internal.i.e(linearLayout, str4);
                com.iqoption.core.ext.a.al(linearLayout);
                textView = this.edJ.ckz;
                kotlin.jvm.internal.i.e(textView, str3);
                com.iqoption.core.ext.a.al(textView);
                imageView = this.edJ.cfA;
                kotlin.jvm.internal.i.e(imageView, str2);
                com.iqoption.core.ext.a.ak(imageView);
                textView = this.edJ.alH;
                kotlin.jvm.internal.i.e(textView, str);
                com.iqoption.core.ext.a.ak(textView);
                y.j(this.edE.getActivity());
            }
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, bng = {"<anonymous>", "", "items", "", "Lcom/iqoption/videoeducation/VideoAdapterItem;", "kotlin.jvm.PlatformType", "onChanged"})
    /* compiled from: VideosFragment.kt */
    static final class h<T> implements Observer<List<? extends com.iqoption.videoeducation.c>> {
        final /* synthetic */ com.iqoption.videoeducation.a.i edK;

        h(com.iqoption.videoeducation.a.i iVar) {
            this.edK = iVar;
        }

        /* renamed from: u */
        public final void onChanged(List<? extends com.iqoption.videoeducation.c> list) {
            if (list != null) {
                com.iqoption.core.ui.widget.recyclerview.adapter.a.a(this.edK, list, null, 2, null);
            }
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, bng = {"<anonymous>", "", "items", "", "Lcom/iqoption/videoeducation/VideoTagItem;", "kotlin.jvm.PlatformType", "onChanged"})
    /* compiled from: VideosFragment.kt */
    static final class i<T> implements Observer<List<? extends n>> {
        final /* synthetic */ nt edJ;
        final /* synthetic */ com.iqoption.videoeducation.a.b edL;

        i(nt ntVar, com.iqoption.videoeducation.a.b bVar) {
            this.edJ = ntVar;
            this.edL = bVar;
        }

        /* renamed from: u */
        public final void onChanged(List<n> list) {
            if (list != null) {
                com.iqoption.core.ui.widget.recyclerview.adapter.a.a(this.edL, list, null, 2, null);
                String str = "tagsList";
                RecyclerView recyclerView;
                if ((list.isEmpty() ^ 1) != 0) {
                    recyclerView = this.edJ.ckB;
                    kotlin.jvm.internal.i.e(recyclerView, str);
                    com.iqoption.core.ext.a.ak(recyclerView);
                    return;
                }
                recyclerView = this.edJ.ckB;
                kotlin.jvm.internal.i.e(recyclerView, str);
                com.iqoption.core.ext.a.al(recyclerView);
            }
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, bng = {"com/iqoption/videoeducation/fragment/VideosFragment$onLayout$tagItemsAdapter$1", "Lcom/iqoption/videoeducation/component/TagItemsAdapter$Callbacks;", "onItemClick", "", "item", "Lcom/iqoption/videoeducation/VideoTagItem;", "app_optionXRelease"})
    /* compiled from: VideosFragment.kt */
    public static final class j implements com.iqoption.videoeducation.a.b.a {
        final /* synthetic */ com.iqoption.videoeducation.j edM;

        j(com.iqoption.videoeducation.j jVar) {
            this.edM = jVar;
        }

        public void a(n nVar) {
            kotlin.jvm.internal.i.f(nVar, "item");
            this.edM.a(nVar.aXw());
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, bng = {"com/iqoption/videoeducation/fragment/VideosFragment$onLayout$videoItemsAdapter$1", "Lcom/iqoption/videoeducation/component/VideoItemsAdapter$Callbacks;", "onItemClick", "", "item", "Lcom/iqoption/videoeducation/VideoItem;", "position", "", "app_optionXRelease"})
    /* compiled from: VideosFragment.kt */
    public static final class k implements com.iqoption.videoeducation.a.i.a {
        final /* synthetic */ d edE;

        k(d dVar) {
            this.edE = dVar;
        }

        public void a(m mVar, int i) {
            kotlin.jvm.internal.i.f(mVar, "item");
            com.iqoption.core.microservices.videoeducation.response.g aXu = mVar.aXu();
            if (aXu.ajp() != null) {
                Rect a = ak.a(d.b(this.edE).ckD, (int) R.id.image, i);
                FragmentManager fragmentManager = this.edE.getFragmentManager();
                if (fragmentManager != null && !fragmentManager.isStateSaved() && !fragmentManager.isDestroyed()) {
                    fragmentManager.beginTransaction().add(this.edE.getId(), c.a(aXu.getId(), a), c.TAG).addToBackStack(c.TAG).commit();
                    q.a(aXu.getId(), aXu.Mk(), aXu.ajs());
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

    public boolean PU() {
        return true;
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        Bj();
    }

    public static final /* synthetic */ nt b(d dVar) {
        nt ntVar = dVar.edC;
        if (ntVar == null) {
            kotlin.jvm.internal.i.lG("binding");
        }
        return ntVar;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.i.f(layoutInflater, "inflater");
        this.edC = (nt) com.iqoption.core.ext.a.a((Fragment) this, (int) R.layout.fragment_video_education_videos, viewGroup, false, 4, null);
        this.edB = com.iqoption.videoeducation.j.ecL.I(com.iqoption.core.ext.a.r(this));
        nt ntVar = this.edC;
        String str = "binding";
        if (ntVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        OnClickListener bVar = new b(this);
        ntVar.aHK.setOnClickListener(bVar);
        ntVar.cfA.setOnClickListener(bVar);
        ntVar.ckz.setOnClickListener(bVar);
        FrameLayout frameLayout = ntVar.bZY;
        kotlin.jvm.internal.i.e(frameLayout, "headerLayout");
        frameLayout.setLayoutTransition(ak.aWZ());
        frameLayout = ntVar.ckC;
        kotlin.jvm.internal.i.e(frameLayout, "titleLayout");
        frameLayout.setLayoutTransition(ak.aWZ());
        ntVar.ckD.setHasFixedSize(true);
        ntVar.ckB.setHasFixedSize(true);
        ntVar.aRC.addTextChangedListener(new c(this));
        com.iqoption.videoeducation.j jVar = this.edB;
        if (jVar == null) {
            kotlin.jvm.internal.i.lG("viewModel");
        }
        jVar.aXp().observe(this, new e(ntVar));
        View root = ntVar.getRoot();
        kotlin.jvm.internal.i.e(root, "root");
        root.getViewTreeObserver().addOnGlobalLayoutListener(new d(root, ntVar, this));
        ntVar = this.edC;
        if (ntVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        return ntVar.getRoot();
    }

    private final void a(nt ntVar, com.iqoption.videoeducation.j jVar) {
        b bVar = new b();
        bVar.m(ntVar.ckD);
        int spanCount = bVar.getSpanCount();
        int aXz = bVar.aXz();
        com.iqoption.core.graphics.b aXA = bVar.aXA();
        kotlin.jvm.internal.i.e(aXA, "imageSize");
        ViewDataBinding viewDataBinding = ntVar;
        com.iqoption.videoeducation.a.i iVar = new com.iqoption.videoeducation.a.i(aXA, com.iqoption.core.ext.a.c(viewDataBinding, (int) R.dimen.dp6), new k(this));
        RecyclerView recyclerView = ntVar.ckD;
        String str = "videosList";
        kotlin.jvm.internal.i.e(recyclerView, str);
        recyclerView.setAdapter(iVar);
        recyclerView = ntVar.ckD;
        kotlin.jvm.internal.i.e(recyclerView, str);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(com.iqoption.core.ext.a.q(this), spanCount);
        gridLayoutManager.setSpanSizeLookup(new f(iVar, spanCount));
        recyclerView.setLayoutManager(gridLayoutManager);
        ntVar.ckD.addItemDecoration(new com.iqoption.widget.a(spanCount, aXz, false));
        ntVar.ckB.addItemDecoration(new com.iqoption.core.ui.widget.e(com.iqoption.core.ext.a.c(viewDataBinding, (int) R.dimen.dp8)));
        com.iqoption.videoeducation.a.b bVar2 = new com.iqoption.videoeducation.a.b(new j(jVar));
        RecyclerView recyclerView2 = ntVar.ckB;
        kotlin.jvm.internal.i.e(recyclerView2, "tagsList");
        recyclerView2.setAdapter(bVar2);
        LiveData aAz = jVar.aAz();
        if (aAz != null) {
            aAz.observe(this, new g(this, ntVar));
        }
        aAz = jVar.aXq();
        if (aAz != null) {
            aAz.observe(this, new h(iVar));
        }
        LiveData aXr = jVar.aXr();
        if (aXr != null) {
            aXr.observe(this, new i(ntVar, bVar2));
        }
    }

    /* Access modifiers changed, original: protected */
    public boolean a(FragmentManager fragmentManager) {
        com.iqoption.videoeducation.j jVar = this.edB;
        if (jVar == null) {
            kotlin.jvm.internal.i.lG("viewModel");
        }
        jVar.aXs();
        return true;
    }

    public void PX() {
        super.PX();
        nt ntVar = this.edC;
        if (ntVar == null) {
            kotlin.jvm.internal.i.lG("binding");
        }
        View root = ntVar.getRoot();
        kotlin.jvm.internal.i.e(root, Promotion.ACTION_VIEW);
        root.setAlpha(0.0f);
        root.setTranslationX(-com.iqoption.core.ext.a.b((Fragment) this, (int) R.dimen.dp48));
        PropertyValuesHolder[] propertyValuesHolderArr = new PropertyValuesHolder[2];
        propertyValuesHolderArr[0] = PropertyValuesHolder.ofFloat(View.ALPHA, new float[]{1.0f});
        propertyValuesHolderArr[1] = PropertyValuesHolder.ofFloat(View.TRANSLATION_X, new float[]{0.0f});
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(root, propertyValuesHolderArr);
        kotlin.jvm.internal.i.e(ofPropertyValuesHolder, "animator");
        com.iqoption.core.ext.a.a((Animator) ofPropertyValuesHolder, PV());
        ofPropertyValuesHolder.setInterpolator(com.iqoption.view.a.a.c.egR);
        ofPropertyValuesHolder.start();
    }

    public void PY() {
        super.PY();
        nt ntVar = this.edC;
        if (ntVar == null) {
            kotlin.jvm.internal.i.lG("binding");
        }
        View root = ntVar.getRoot();
        PropertyValuesHolder[] propertyValuesHolderArr = new PropertyValuesHolder[2];
        propertyValuesHolderArr[0] = PropertyValuesHolder.ofFloat(View.ALPHA, new float[]{0.0f});
        propertyValuesHolderArr[1] = PropertyValuesHolder.ofFloat(View.TRANSLATION_X, new float[]{-com.iqoption.core.ext.a.b((Fragment) this, (int) R.dimen.dp48)});
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(root, propertyValuesHolderArr);
        kotlin.jvm.internal.i.e(ofPropertyValuesHolder, "animator");
        com.iqoption.core.ext.a.a((Animator) ofPropertyValuesHolder, PW());
        ofPropertyValuesHolder.setInterpolator(com.iqoption.view.a.a.c.egR);
        ofPropertyValuesHolder.start();
    }
}
