package com.iqoption.chat.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleObserver;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.iqoption.chat.a.ci;
import com.iqoption.chat.b.b;
import com.iqoption.chat.e.h;
import com.iqoption.chat.viewmodel.c;
import com.iqoption.core.microservices.chat.response.ChatRoomType;
import com.iqoption.core.ui.fragment.d;
import com.iqoption.core.util.SystemUiSubstitude;
import com.iqoption.core.util.v;
import kotlin.i;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.k;
import kotlin.reflect.j;

@i(bne = {1, 1, 15}, bnf = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0014J\u0012\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0014H\u0014J&\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J\b\u0010\u001b\u001a\u00020\u0010H\u0016J\u001a\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u00162\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b¨\u0006\u001f"}, bng = {"Lcom/iqoption/chat/fragment/ChatFragment;", "Lcom/iqoption/core/ui/fragment/IQFragment;", "()V", "binding", "Lcom/iqoption/chat/databinding/FragmentChatBinding;", "viewModel", "Lcom/iqoption/chat/viewmodel/ChatViewModel;", "getViewModel", "()Lcom/iqoption/chat/viewmodel/ChatViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "onBackPressed", "", "childFragmentManager", "Landroidx/fragment/app/FragmentManager;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateTransitionProvider", "Lcom/iqoption/core/ui/animation/transitions/TransitionProvider;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDestroy", "onViewCreated", "view", "Companion", "chat_release"})
/* compiled from: ChatFragment.kt */
public final class e extends d {
    private static final String TAG = e.class.getName();
    public static final a aSG = new a();
    static final /* synthetic */ j[] anY = new j[]{k.a(new PropertyReference1Impl(k.G(e.class), "viewModel", "getViewModel()Lcom/iqoption/chat/viewmodel/ChatViewModel;"))};
    private ci aSF;
    private final kotlin.d apS = g.c(new ChatFragment$viewModel$2(this));

    @i(bne = {1, 1, 15}, bnf = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u0012\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\n \u0006*\u0004\u0018\u00010\u00040\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, bng = {"Lcom/iqoption/chat/fragment/ChatFragment$Companion;", "", "()V", "ARG_ROOM_TYPE", "", "TAG", "kotlin.jvm.PlatformType", "get", "Lcom/iqoption/chat/fragment/ChatFragment;", "child", "Landroidx/fragment/app/Fragment;", "getNavigatorEntry", "Lcom/iqoption/core/ui/navigation/NavigatorEntry;", "roomType", "Lcom/iqoption/core/microservices/chat/response/ChatRoomType;", "chat_release"})
    /* compiled from: ChatFragment.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }
    }

    private final c Sc() {
        kotlin.d dVar = this.apS;
        j jVar = anY[0];
        return (c) dVar.getValue();
    }

    /* Access modifiers changed, original: protected */
    public com.iqoption.core.ui.animation.transitions.e Bv() {
        return com.iqoption.core.ui.animation.transitions.c.bHB.d(this);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        bundle = getArguments();
        if (bundle != null) {
            ChatRoomType chatRoomType = (ChatRoomType) bundle.getSerializable("ARG_ROOM_TYPE");
            if (chatRoomType != null) {
                Sc().a(chatRoomType);
            }
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.i.f(layoutInflater, "inflater");
        this.aSF = (ci) com.iqoption.core.ext.a.a((Fragment) this, h.fragment_chat, viewGroup, false, 4, null);
        ci ciVar = this.aSF;
        if (ciVar == null) {
            kotlin.jvm.internal.i.lG("binding");
        }
        return ciVar.getRoot();
    }

    public void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.i.f(view, Promotion.ACTION_VIEW);
        super.onViewCreated(view, bundle);
        a((LifecycleObserver) new SystemUiSubstitude(getActivity(), 0));
        Fragment fragment = this;
        if (!b.ST().i(fragment)) {
            if (Sc().Ti() == null && Sc().Tj() == null) {
                b.ST().a(fragment, new aa());
            } else {
                b.ST().a(fragment, v.aUR.a(Sc().Ti(), Sc().Tj()), false);
            }
        }
    }

    public void onDestroy() {
        Sc().fd((String) null);
        Sc().a((ChatRoomType) null);
        super.onDestroy();
    }

    /* Access modifiers changed, original: protected */
    public boolean a(FragmentManager fragmentManager) {
        v.j(com.iqoption.core.ext.a.r(this));
        return super.a(fragmentManager);
    }
}
