package com.iqoption.chat;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ItemAnimator;
import com.iqoption.chat.a.ck;
import com.iqoption.chat.component.aj;
import com.iqoption.chat.viewmodel.h;
import com.iqoption.chat.viewmodel.l;
import com.iqoption.chat.viewmodel.q;
import com.iqoption.core.ext.g;
import com.iqoption.core.microservices.chat.response.ChatRoomType;
import com.iqoption.core.microservices.chat.response.k;
import com.iqoption.x.R;
import java.util.HashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.TypeCastException;
import kotlin.i;
import kotlin.jvm.a.m;

@i(bne = {1, 1, 15}, bnf = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u0005¢\u0006\u0002\u0010\u0002J\"\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0010H\u0016J&\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX.¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX.¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX.¢\u0006\u0002\n\u0000¨\u0006\u001d"}, bng = {"Lcom/iqoption/chat/MicroRoomListFragment;", "Lcom/iqoption/core/ui/fragment/IQFragment;", "()V", "adapter", "Lcom/iqoption/chat/component/RoomsAdapter;", "binding", "Lcom/iqoption/chat/databinding/FragmentMicroRoomListBinding;", "itemAnimator", "Landroidx/recyclerview/widget/RecyclerView$ItemAnimator;", "lastMessagesViewModel", "Lcom/iqoption/chat/viewmodel/LastMessagesViewModel;", "roomsViewModel", "Lcom/iqoption/chat/viewmodel/RoomsViewModel;", "onCreateAnimation", "Landroid/view/animation/Animation;", "transit", "", "enter", "", "nextAnim", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "app_optionXRelease"})
/* compiled from: MicroRoomListFragment.kt */
public final class c extends com.iqoption.core.ui.fragment.d {
    private static final String TAG = c.class.getName();
    public static final a aOc = new a();
    private ck aNX;
    private ItemAnimator aNY;
    private aj aNZ;
    private l aOa;
    private com.iqoption.chat.viewmodel.i aOb;
    private HashMap apm;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u00020\nH\u0007R$\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u00048\u0006X\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0006\u0010\u0002\u001a\u0004\b\u0007\u0010\b¨\u0006\u000b"}, bng = {"Lcom/iqoption/chat/MicroRoomListFragment$Companion;", "", "()V", "TAG", "", "kotlin.jvm.PlatformType", "TAG$annotations", "getTAG", "()Ljava/lang/String;", "newInstance", "Lcom/iqoption/chat/MicroRoomListFragment;", "app_optionXRelease"})
    /* compiled from: MicroRoomListFragment.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final String Bx() {
            return c.TAG;
        }

        public final c QP() {
            return new c();
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006¸\u0006\u0007"}, bng = {"com/iqoption/core/ext/AndroidExt$setOnDelayedClickListener$1", "Lcom/iqoption/core/ext/OnDelayClickListener;", "onDelayClick", "", "v", "Landroid/view/View;", "core_release", "com/iqoption/chat/MicroRoomListFragment$$special$$inlined$setOnDelayedClickListener$1"})
    /* compiled from: AndroidExtensions.kt */
    public static final class b extends g {
        final /* synthetic */ FragmentActivity $activity$inlined;
        final /* synthetic */ c this$0;

        public b(c cVar, FragmentActivity fragmentActivity) {
            this.this$0 = cVar;
            this.$activity$inlined = fragmentActivity;
            super(0, 1, null);
        }

        public void M(View view) {
            kotlin.jvm.internal.i.f(view, "v");
            ChatActivity.aNV.aW(com.iqoption.core.ext.a.q(this.this$0));
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, bng = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "onChanged", "(Ljava/lang/Boolean;)V", "com/iqoption/chat/MicroRoomListFragment$onCreateView$1$2"})
    /* compiled from: MicroRoomListFragment.kt */
    static final class c<T> implements Observer<Boolean> {
        final /* synthetic */ FragmentActivity $activity$inlined;
        final /* synthetic */ q aOd;
        final /* synthetic */ c this$0;

        @i(bne = {1, 1, 15}, bnf = {"\u0000$\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006¨\u0006\b"}, bng = {"<anonymous>", "", "it", "", "Lcom/iqoption/core/microservices/chat/response/ChatRoom;", "kotlin.jvm.PlatformType", "onChanged", "com/iqoption/chat/MicroRoomListFragment$onCreateView$1$2$1$1", "com/iqoption/chat/MicroRoomListFragment$onCreateView$1$2$$special$$inlined$also$lambda$1"})
        /* compiled from: MicroRoomListFragment.kt */
        /* renamed from: com.iqoption.chat.c$c$1 */
        static final class AnonymousClass1<T> implements Observer<List<? extends k>> {
            final /* synthetic */ c aOe;

            AnonymousClass1(c cVar) {
                this.aOe = cVar;
            }

            /* renamed from: u */
            public final void onChanged(List<k> list) {
                c.a(this.aOe.this$0).TR();
                c.b(this.aOe.this$0).ae(list);
                if (list != null) {
                    for (Object next : list) {
                        Object obj;
                        if (((k) next).SG() == ChatRoomType.SUPPORT) {
                            obj = 1;
                            continue;
                        } else {
                            obj = null;
                            continue;
                        }
                        if (obj != null) {
                            break;
                        }
                    }
                    Object next2 = null;
                    k kVar = (k) next2;
                    if (kVar != null) {
                        this.aOe.aOd.fm(kVar.getId());
                    }
                }
                if (list != null) {
                    c.c(this.aOe.this$0).V(list);
                }
            }
        }

        c(q qVar, c cVar, FragmentActivity fragmentActivity) {
            this.aOd = qVar;
            this.this$0 = cVar;
            this.$activity$inlined = fragmentActivity;
        }

        /* renamed from: f */
        public final void onChanged(Boolean bool) {
            if (bool != null && !bool.booleanValue()) {
                c cVar = this.this$0;
                cVar.a(c.a(cVar).TQ(), new AnonymousClass1(this));
            }
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u00004\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0005\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, bng = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "onChanged", "(Ljava/lang/Boolean;)V", "com/iqoption/chat/MicroRoomListFragment$onCreateView$1$3$1", "com/iqoption/chat/MicroRoomListFragment$$special$$inlined$let$lambda$1"})
    /* compiled from: MicroRoomListFragment.kt */
    static final class d<T> implements Observer<Boolean> {
        final /* synthetic */ FragmentActivity $activity$inlined;
        final /* synthetic */ h aOf;
        final /* synthetic */ c this$0;

        d(h hVar, c cVar, FragmentActivity fragmentActivity) {
            this.aOf = hVar;
            this.this$0 = cVar;
            this.$activity$inlined = fragmentActivity;
        }

        /* renamed from: f */
        public final void onChanged(Boolean bool) {
            if (bool != null && bool.booleanValue()) {
                c.c(this.this$0).notifyDataSetChanged();
                this.aOf.Tw();
            }
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000(\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012&\u0010\u0002\u001a\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005 \u0006*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0007¨\u0006\t"}, bng = {"<anonymous>", "", "it", "Lkotlin/Pair;", "", "", "kotlin.jvm.PlatformType", "onChanged", "com/iqoption/chat/MicroRoomListFragment$onCreateView$1$3$2", "com/iqoption/chat/MicroRoomListFragment$$special$$inlined$let$lambda$2"})
    /* compiled from: MicroRoomListFragment.kt */
    static final class e<T> implements Observer<Pair<? extends Boolean, ? extends String>> {
        final /* synthetic */ FragmentActivity $activity$inlined;
        final /* synthetic */ h aOf;
        final /* synthetic */ c this$0;

        e(h hVar, c cVar, FragmentActivity fragmentActivity) {
            this.aOf = hVar;
            this.this$0 = cVar;
            this.$activity$inlined = fragmentActivity;
        }

        /* renamed from: a */
        public final void onChanged(Pair<Boolean, String> pair) {
            if (pair != null && ((Boolean) pair.getFirst()).booleanValue()) {
                int eY = c.c(this.this$0).eY((String) pair.bni());
                if (eY > -1) {
                    c.c(this.this$0).notifyItemChanged(eY);
                    this.aOf.Tx();
                }
            }
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u00004\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0005\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, bng = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "onChanged", "(Ljava/lang/Boolean;)V", "com/iqoption/chat/MicroRoomListFragment$onCreateView$1$3$3", "com/iqoption/chat/MicroRoomListFragment$$special$$inlined$let$lambda$3"})
    /* compiled from: MicroRoomListFragment.kt */
    static final class f<T> implements Observer<Boolean> {
        final /* synthetic */ FragmentActivity $activity$inlined;
        final /* synthetic */ c this$0;

        f(c cVar, FragmentActivity fragmentActivity) {
            this.this$0 = cVar;
            this.$activity$inlined = fragmentActivity;
        }

        /* renamed from: f */
        public final void onChanged(Boolean bool) {
            if (bool != null) {
                boolean booleanValue = bool.booleanValue();
                RecyclerView recyclerView = c.d(this.this$0).aRZ;
                kotlin.jvm.internal.i.e(recyclerView, "binding.chatList");
                recyclerView.setItemAnimator(booleanValue ? null : c.e(this.this$0));
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

    public static final /* synthetic */ l a(c cVar) {
        l lVar = cVar.aOa;
        if (lVar == null) {
            kotlin.jvm.internal.i.lG("roomsViewModel");
        }
        return lVar;
    }

    public static final /* synthetic */ com.iqoption.chat.viewmodel.i b(c cVar) {
        com.iqoption.chat.viewmodel.i iVar = cVar.aOb;
        if (iVar == null) {
            kotlin.jvm.internal.i.lG("lastMessagesViewModel");
        }
        return iVar;
    }

    public static final /* synthetic */ aj c(c cVar) {
        aj ajVar = cVar.aNZ;
        if (ajVar == null) {
            kotlin.jvm.internal.i.lG("adapter");
        }
        return ajVar;
    }

    public static final /* synthetic */ ck d(c cVar) {
        ck ckVar = cVar.aNX;
        if (ckVar == null) {
            kotlin.jvm.internal.i.lG("binding");
        }
        return ckVar;
    }

    public static final /* synthetic */ ItemAnimator e(c cVar) {
        ItemAnimator itemAnimator = cVar.aNY;
        if (itemAnimator == null) {
            kotlin.jvm.internal.i.lG("itemAnimator");
        }
        return itemAnimator;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.i.f(layoutInflater, "inflater");
        this.aNX = (ck) com.iqoption.core.ext.a.a((Fragment) this, (int) R.layout.fragment_micro_room_list, viewGroup, false, 4, null);
        FragmentActivity r = com.iqoption.core.ext.a.r(this);
        this.aOa = l.aYE.TT();
        this.aOb = com.iqoption.chat.viewmodel.i.aXv.TB();
        ck ckVar = this.aNX;
        String str = "binding";
        if (ckVar == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        ImageView imageView = ckVar.aIs;
        kotlin.jvm.internal.i.e(imageView, "btnExpand");
        imageView.setOnClickListener(new b(this, r));
        q Ud = q.aYX.Ud();
        c cVar = this;
        a(com.iqoption.core.ui.f.a.bJH.B(cVar).alI(), new c(Ud, this, r));
        h h = h.aXm.h(com.iqoption.core.ext.a.r(this));
        a(h.Tt(), new d(h, this, r));
        a(h.Tu(), new e(h, this, r));
        a(h.Tv(), new f(this, r));
        f aX = f.aOi.aX(r);
        LifecycleOwner lifecycleOwner = cVar;
        kotlin.jvm.a.b microRoomListFragment$onCreateView$$inlined$apply$lambda$6 = new MicroRoomListFragment$onCreateView$$inlined$apply$lambda$6(this, r);
        com.iqoption.chat.viewmodel.i iVar = this.aOb;
        if (iVar == null) {
            kotlin.jvm.internal.i.lG("lastMessagesViewModel");
        }
        this.aNZ = new aj(aX, lifecycleOwner, microRoomListFragment$onCreateView$$inlined$apply$lambda$6, Ud, iVar, new MicroRoomListFragment$onCreateView$$inlined$apply$lambda$7(this, r));
        aj ajVar = this.aNZ;
        if (ajVar == null) {
            kotlin.jvm.internal.i.lG("adapter");
        }
        ajVar.c((m) new MicroRoomListFragment$onCreateView$$inlined$apply$lambda$8(this, r));
        ckVar.aRZ.setHasFixedSize(true);
        ckVar.aRZ.addItemDecoration(new com.iqoption.core.ui.widget.e(com.iqoption.core.ext.a.c((ViewDataBinding) ckVar, (int) R.dimen.dp8)));
        RecyclerView recyclerView = ckVar.aRZ;
        kotlin.jvm.internal.i.e(recyclerView, "chatList");
        ItemAnimator itemAnimator = recyclerView.getItemAnimator();
        if (itemAnimator == null) {
            kotlin.jvm.internal.i.bnJ();
        }
        itemAnimator.setAddDuration(100);
        itemAnimator.setRemoveDuration(100);
        itemAnimator.setMoveDuration(150);
        if (itemAnimator != null) {
            ((DefaultItemAnimator) itemAnimator).setSupportsChangeAnimations(false);
            kotlin.jvm.internal.i.e(itemAnimator, "chatList.itemAnimator!!.…ons = false\n            }");
            this.aNY = itemAnimator;
            ck ckVar2 = this.aNX;
            if (ckVar2 == null) {
                kotlin.jvm.internal.i.lG(str);
            }
            return ckVar2.getRoot();
        }
        throw new TypeCastException("null cannot be cast to non-null type androidx.recyclerview.widget.DefaultItemAnimator");
    }

    public Animation onCreateAnimation(int i, boolean z, int i2) {
        Animation loadAnimation = i2 == 0 ? null : AnimationUtils.loadAnimation(com.iqoption.core.ext.a.q(this), i2);
        if (loadAnimation != null && z) {
            com.iqoption.core.ui.f.a.bJH.B(this).a(loadAnimation);
        }
        return loadAnimation;
    }
}
