package com.iqoption.chat.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.RecyclerView;
import com.iqoption.chat.a.ac;
import com.iqoption.chat.component.ReadPermissionTracker;
import com.iqoption.chat.e.h;
import com.iqoption.chat.viewmodel.f;
import com.iqoption.core.util.SystemUiSubstitude;
import java.io.File;
import java.util.List;
import kotlin.i;
import kotlin.l;

@i(bne = {1, 1, 15}, bnf = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u000b\u001a\u00020\bH\u0002J\u0012\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0014J&\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u001c\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX.¢\u0006\u0002\n\u0000¨\u0006\u0019"}, bng = {"Lcom/iqoption/chat/fragment/FilePickerFragment;", "Lcom/iqoption/core/ui/fragment/IQFragment;", "()V", "binding", "Lcom/iqoption/chat/databinding/ChatFragmentFilePickerBinding;", "onSelect", "Lkotlin/Function1;", "Ljava/io/File;", "", "viewModel", "Lcom/iqoption/chat/viewmodel/FilePickerViewModel;", "close", "onBackPressed", "", "childFragmentManager", "Landroidx/fragment/app/FragmentManager;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "chat_release"})
/* compiled from: FilePickerFragment.kt */
public final class j extends com.iqoption.core.ui.fragment.d {
    private static final String TAG = j.class.getName();
    public static final a aTc = new a();
    private kotlin.jvm.a.b<? super File, l> aOC;
    private ac aTa;
    private f aTb;

    @i(bne = {1, 1, 15}, bnf = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\b\u001a\u00020\t2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bR\u0019\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000e"}, bng = {"Lcom/iqoption/chat/fragment/FilePickerFragment$Companion;", "", "()V", "TAG", "", "kotlin.jvm.PlatformType", "getTAG", "()Ljava/lang/String;", "newInstance", "Lcom/iqoption/chat/fragment/FilePickerFragment;", "onSelect", "Lkotlin/Function1;", "Ljava/io/File;", "", "chat_release"})
    /* compiled from: FilePickerFragment.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final String Bx() {
            return j.TAG;
        }

        public final j h(kotlin.jvm.a.b<? super File, l> bVar) {
            kotlin.jvm.internal.i.f(bVar, "onSelect");
            j jVar = new j();
            jVar.setRetainInstance(true);
            jVar.aOC = bVar;
            return jVar;
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, bng = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/iqoption/chat/fragment/FilePickerFragment$onCreateView$1$3"})
    /* compiled from: FilePickerFragment.kt */
    static final class b implements OnClickListener {
        final /* synthetic */ j this$0;

        b(j jVar) {
            this.this$0 = jVar;
        }

        public final void onClick(View view) {
            this.this$0.close();
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0005¸\u0006\u0000"}, bng = {"com/iqoption/chat/fragment/FilePickerFragment$onCreateView$1$4", "Lcom/iqoption/chat/component/ReadPermissionTracker$Callback;", "onDenied", "", "onGranted", "chat_release"})
    /* compiled from: FilePickerFragment.kt */
    public static final class c implements com.iqoption.chat.component.ReadPermissionTracker.a {
        final /* synthetic */ j this$0;

        public void RB() {
        }

        c(j jVar) {
            this.this$0 = jVar;
        }

        public void RC() {
            this.this$0.close();
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, bng = {"<anonymous>", "", "it", "", "Lcom/iqoption/chat/viewmodel/FileItem;", "kotlin.jvm.PlatformType", "onChanged"})
    /* compiled from: FilePickerFragment.kt */
    static final class d<T> implements Observer<List<? extends com.iqoption.chat.viewmodel.e>> {
        final /* synthetic */ com.iqoption.chat.component.i aTd;

        d(com.iqoption.chat.component.i iVar) {
            this.aTd = iVar;
        }

        /* renamed from: u */
        public final void onChanged(List<com.iqoption.chat.viewmodel.e> list) {
            if (list != null) {
                this.aTd.w(list);
            }
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, bng = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "onChanged", "(Ljava/lang/Boolean;)V"})
    /* compiled from: FilePickerFragment.kt */
    static final class e<T> implements Observer<Boolean> {
        final /* synthetic */ com.iqoption.chat.component.i aTd;

        e(com.iqoption.chat.component.i iVar) {
            this.aTd = iVar;
        }

        /* renamed from: f */
        public final void onChanged(Boolean bool) {
            if (bool != null) {
                this.aTd.ce(bool.booleanValue());
            }
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.i.f(layoutInflater, "inflater");
        if (this.aOC == null) {
            close();
            return null;
        }
        getLifecycle().addObserver(new SystemUiSubstitude(getActivity(), 0));
        this.aTb = f.aXa.l(this);
        ac acVar = (ac) com.iqoption.core.ext.a.a((Fragment) this, h.chat_fragment_file_picker, viewGroup, false, 4, null);
        this.aTa = acVar;
        com.iqoption.chat.component.i iVar = new com.iqoption.chat.component.i(new FilePickerFragment$onCreateView$$inlined$apply$lambda$1(this));
        f fVar = this.aTb;
        String str = "viewModel";
        if (fVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        LifecycleOwner lifecycleOwner = this;
        fVar.Tn().observe(lifecycleOwner, new d(iVar));
        fVar = this.aTb;
        if (fVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        fVar.To().observe(lifecycleOwner, new e(iVar));
        fVar = this.aTb;
        if (fVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        f.a(fVar, null, 1, null);
        RecyclerView recyclerView = acVar.aRq;
        String str2 = "fileList";
        kotlin.jvm.internal.i.e(recyclerView, str2);
        recyclerView.setAdapter(iVar);
        RecyclerView recyclerView2 = acVar.aRq;
        kotlin.jvm.internal.i.e(recyclerView2, str2);
        com.iqoption.core.ext.a.b(recyclerView2);
        acVar.aHK.setOnClickListener(new b(this));
        getLifecycle().addObserver(new ReadPermissionTracker(new c(this)));
        return acVar.getRoot();
    }

    /* Access modifiers changed, original: protected */
    public boolean a(FragmentManager fragmentManager) {
        f fVar = this.aTb;
        String str = "viewModel";
        if (fVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        if (fVar.Tp()) {
            fVar = this.aTb;
            if (fVar == null) {
                kotlin.jvm.internal.i.lG(str);
            }
            fVar.Tq();
        } else {
            close();
        }
        return true;
    }

    private final void close() {
        com.iqoption.chat.b.b.ST().k(this);
    }
}
