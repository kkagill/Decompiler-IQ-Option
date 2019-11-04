package com.iqoption.chat.fragment;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ItemAnimator;
import androidx.recyclerview.widget.RecyclerView.ItemDecoration;
import androidx.recyclerview.widget.RecyclerView.State;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.iqoption.chat.a.co;
import com.iqoption.chat.component.aj;
import com.iqoption.chat.viewmodel.h;
import com.iqoption.chat.viewmodel.l;
import com.iqoption.chat.viewmodel.m;
import com.iqoption.chat.viewmodel.q;
import com.iqoption.core.microservices.chat.response.ChatRoomType;
import com.iqoption.core.microservices.chat.response.k;
import com.iqoption.core.util.AnalyticsLifecycleObserver;
import com.iqoption.dto.Event;
import java.util.List;
import kotlin.Pair;
import kotlin.TypeCastException;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0005¢\u0006\u0002\u0010\u0002J&\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J\u001a\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000e2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX.¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX.¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX.¢\u0006\u0002\n\u0000¨\u0006\u0019"}, bng = {"Lcom/iqoption/chat/fragment/RoomListFragment;", "Lcom/iqoption/core/ui/fragment/IQFragment;", "()V", "adapter", "Lcom/iqoption/chat/component/RoomsAdapter;", "binding", "Lcom/iqoption/chat/databinding/FragmentRoomListBinding;", "itemAnimator", "Landroidx/recyclerview/widget/RecyclerView$ItemAnimator;", "lastMessagesViewModel", "Lcom/iqoption/chat/viewmodel/LastMessagesViewModel;", "roomsViewModel", "Lcom/iqoption/chat/viewmodel/RoomsViewModel;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "", "view", "Companion", "chat_release"})
/* compiled from: RoomListFragment.kt */
public final class w extends com.iqoption.core.ui.fragment.d {
    private static final String TAG;
    public static final a aVc = new a();
    private ItemAnimator aNY;
    private aj aNZ;
    private l aOa;
    private com.iqoption.chat.viewmodel.i aOb;
    private co aVb;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0007\u001a\u00020\bH\u0007R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, bng = {"Lcom/iqoption/chat/fragment/RoomListFragment$Companion;", "", "()V", "TAG", "", "getTAG", "()Ljava/lang/String;", "newInstance", "Lcom/iqoption/chat/fragment/RoomListFragment;", "chat_release"})
    /* compiled from: RoomListFragment.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final String Bx() {
            return w.TAG;
        }

        public final w SR() {
            return new w();
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006¨\u0006\u0007"}, bng = {"<anonymous>", "", "it", "", "Lcom/iqoption/core/microservices/chat/response/ChatRoom;", "kotlin.jvm.PlatformType", "onChanged", "com/iqoption/chat/fragment/RoomListFragment$onCreateView$1$1"})
    /* compiled from: RoomListFragment.kt */
    static final class b<T> implements Observer<List<? extends k>> {
        final /* synthetic */ q aOd;
        final /* synthetic */ w this$0;

        b(q qVar, w wVar) {
            this.aOd = qVar;
            this.this$0 = wVar;
        }

        /* renamed from: u */
        public final void onChanged(List<k> list) {
            List list2;
            if (list2 != null) {
                w.a(this.this$0).TR();
                w.b(this.this$0).ae(list2);
                for (Object next : list2) {
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
                    this.aOd.fm(kVar.getId());
                }
            }
            aj c = w.c(this.this$0);
            if (list2 == null) {
                list2 = m.emptyList();
            }
            c.V(list2);
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, bng = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "onChanged", "com/iqoption/chat/fragment/RoomListFragment$onCreateView$1$2"})
    /* compiled from: RoomListFragment.kt */
    static final class c<T> implements Observer<CharSequence> {
        final /* synthetic */ w this$0;

        c(w wVar) {
            this.this$0 = wVar;
        }

        /* renamed from: y */
        public final void onChanged(CharSequence charSequence) {
            aj c = w.c(this.this$0);
            if (charSequence == null) {
                charSequence = "";
            }
            c.filter(charSequence);
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u00004\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0005\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, bng = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "onChanged", "(Ljava/lang/Boolean;)V", "com/iqoption/chat/fragment/RoomListFragment$onCreateView$1$3$1", "com/iqoption/chat/fragment/RoomListFragment$$special$$inlined$let$lambda$1"})
    /* compiled from: RoomListFragment.kt */
    static final class d<T> implements Observer<Boolean> {
        final /* synthetic */ h aOf;
        final /* synthetic */ w this$0;

        d(h hVar, w wVar) {
            this.aOf = hVar;
            this.this$0 = wVar;
        }

        /* renamed from: f */
        public final void onChanged(Boolean bool) {
            if (kotlin.jvm.internal.i.y(bool, Boolean.valueOf(true))) {
                w.c(this.this$0).notifyDataSetChanged();
                this.aOf.Tw();
            }
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000(\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012&\u0010\u0002\u001a\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005 \u0006*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0007¨\u0006\t"}, bng = {"<anonymous>", "", "it", "Lkotlin/Pair;", "", "", "kotlin.jvm.PlatformType", "onChanged", "com/iqoption/chat/fragment/RoomListFragment$onCreateView$1$3$2", "com/iqoption/chat/fragment/RoomListFragment$$special$$inlined$let$lambda$2"})
    /* compiled from: RoomListFragment.kt */
    static final class e<T> implements Observer<Pair<? extends Boolean, ? extends String>> {
        final /* synthetic */ h aOf;
        final /* synthetic */ w this$0;

        e(h hVar, w wVar) {
            this.aOf = hVar;
            this.this$0 = wVar;
        }

        /* renamed from: a */
        public final void onChanged(Pair<Boolean, String> pair) {
            if (pair != null && ((Boolean) pair.getFirst()).booleanValue()) {
                int eY = w.c(this.this$0).eY((String) pair.bni());
                if (eY > -1) {
                    w.c(this.this$0).notifyItemChanged(eY);
                    this.aOf.Tx();
                }
            }
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u00004\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0005\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, bng = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "onChanged", "(Ljava/lang/Boolean;)V", "com/iqoption/chat/fragment/RoomListFragment$onCreateView$1$3$3", "com/iqoption/chat/fragment/RoomListFragment$$special$$inlined$let$lambda$3"})
    /* compiled from: RoomListFragment.kt */
    static final class f<T> implements Observer<Boolean> {
        final /* synthetic */ w this$0;

        f(w wVar) {
            this.this$0 = wVar;
        }

        /* renamed from: f */
        public final void onChanged(Boolean bool) {
            RecyclerView recyclerView = w.d(this.this$0).aRZ;
            kotlin.jvm.internal.i.e(recyclerView, "binding.chatList");
            recyclerView.setItemAnimator(kotlin.jvm.internal.i.y(bool, Boolean.valueOf(false)) ? w.e(this.this$0) : null);
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000A\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J(\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J \u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0017"}, bng = {"com/iqoption/chat/fragment/RoomListFragment$onCreateView$1$7", "Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;", "lineWidth", "", "getLineWidth", "()I", "paint", "Landroid/graphics/Paint;", "getPaint", "()Landroid/graphics/Paint;", "getItemOffsets", "", "outRect", "Landroid/graphics/Rect;", "view", "Landroid/view/View;", "parent", "Landroidx/recyclerview/widget/RecyclerView;", "state", "Landroidx/recyclerview/widget/RecyclerView$State;", "onDrawOver", "c", "Landroid/graphics/Canvas;", "chat_release"})
    /* compiled from: RoomListFragment.kt */
    public static final class g extends ItemDecoration {
        private final int aVd = com.iqoption.core.ext.a.c((ViewDataBinding) this.aVe, com.iqoption.chat.e.d.chat_room_divider_height);
        final /* synthetic */ co aVe;
        private final Paint fh;

        g(co coVar) {
            this.aVe = coVar;
            Paint paint = new Paint(1);
            paint.setColor(com.iqoption.core.ext.a.a((ViewDataBinding) this.aVe, com.iqoption.chat.e.c.chat_room_divider));
            this.fh = paint;
        }

        public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, State state) {
            kotlin.jvm.internal.i.f(rect, "outRect");
            kotlin.jvm.internal.i.f(view, Promotion.ACTION_VIEW);
            kotlin.jvm.internal.i.f(recyclerView, "parent");
            kotlin.jvm.internal.i.f(state, "state");
            if (recyclerView.getChildAdapterPosition(view) != 0) {
                rect.top = this.aVd;
            }
        }

        public void onDrawOver(Canvas canvas, RecyclerView recyclerView, State state) {
            kotlin.jvm.internal.i.f(canvas, "c");
            kotlin.jvm.internal.i.f(recyclerView, "parent");
            kotlin.jvm.internal.i.f(state, "state");
            ViewGroup viewGroup = recyclerView;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (!(childAt == null || recyclerView.getChildAdapterPosition(childAt) == 0)) {
                    canvas.drawRect(0.0f, ((float) childAt.getTop()) - ((float) this.aVd), (float) recyclerView.getWidth(), (float) childAt.getTop(), this.fh);
                }
            }
        }
    }

    public static final /* synthetic */ l a(w wVar) {
        l lVar = wVar.aOa;
        if (lVar == null) {
            kotlin.jvm.internal.i.lG("roomsViewModel");
        }
        return lVar;
    }

    public static final /* synthetic */ com.iqoption.chat.viewmodel.i b(w wVar) {
        com.iqoption.chat.viewmodel.i iVar = wVar.aOb;
        if (iVar == null) {
            kotlin.jvm.internal.i.lG("lastMessagesViewModel");
        }
        return iVar;
    }

    public static final /* synthetic */ aj c(w wVar) {
        aj ajVar = wVar.aNZ;
        if (ajVar == null) {
            kotlin.jvm.internal.i.lG("adapter");
        }
        return ajVar;
    }

    public static final /* synthetic */ co d(w wVar) {
        co coVar = wVar.aVb;
        if (coVar == null) {
            kotlin.jvm.internal.i.lG("binding");
        }
        return coVar;
    }

    public static final /* synthetic */ ItemAnimator e(w wVar) {
        ItemAnimator itemAnimator = wVar.aNY;
        if (itemAnimator == null) {
            kotlin.jvm.internal.i.lG("itemAnimator");
        }
        return itemAnimator;
    }

    static {
        String simpleName = w.class.getSimpleName();
        kotlin.jvm.internal.i.e(simpleName, "RoomListFragment::class.java.simpleName");
        TAG = simpleName;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.i.f(layoutInflater, "inflater");
        co coVar = (co) com.iqoption.core.ext.a.a((Fragment) this, com.iqoption.chat.e.h.fragment_room_list, viewGroup, false, 4, null);
        this.aVb = coVar;
        FragmentActivity requireActivity = requireActivity();
        kotlin.jvm.internal.i.e(requireActivity, "requireActivity()");
        this.aOa = l.aYE.TT();
        this.aOb = com.iqoption.chat.viewmodel.i.aXv.TB();
        q Ud = q.aYX.Ud();
        m i = m.aYM.i(requireActivity);
        l lVar = this.aOa;
        if (lVar == null) {
            kotlin.jvm.internal.i.lG("roomsViewModel");
        }
        a(lVar.TQ(), new b(Ud, this));
        a(i.TV(), new c(this));
        h h = h.aXm.h(com.iqoption.core.ext.a.r(this));
        a(h.Tt(), new d(h, this));
        a(h.Tu(), new e(h, this));
        a(h.Tv(), new f(this));
        com.iqoption.chat.f aX = com.iqoption.chat.f.aOi.aX(requireActivity);
        LifecycleOwner lifecycleOwner = this;
        kotlin.jvm.a.b roomListFragment$onCreateView$$inlined$apply$lambda$6 = new RoomListFragment$onCreateView$$inlined$apply$lambda$6(this);
        com.iqoption.chat.viewmodel.i iVar = this.aOb;
        if (iVar == null) {
            kotlin.jvm.internal.i.lG("lastMessagesViewModel");
        }
        this.aNZ = new aj(aX, lifecycleOwner, roomListFragment$onCreateView$$inlined$apply$lambda$6, Ud, iVar, new RoomListFragment$onCreateView$$inlined$apply$lambda$7(this));
        aj ajVar = this.aNZ;
        if (ajVar == null) {
            kotlin.jvm.internal.i.lG("adapter");
        }
        ajVar.c((kotlin.jvm.a.m) new RoomListFragment$onCreateView$$inlined$apply$lambda$8(this));
        coVar.aRZ.setHasFixedSize(true);
        coVar.aRZ.addItemDecoration(new g(coVar));
        RecyclerView recyclerView = coVar.aRZ;
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
            return coVar.getRoot();
        }
        throw new TypeCastException("null cannot be cast to non-null type androidx.recyclerview.widget.DefaultItemAnimator");
    }

    public void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.i.f(view, Promotion.ACTION_VIEW);
        super.onViewCreated(view, bundle);
        com.iqoption.core.analytics.b W = com.iqoption.core.d.EC().W(Event.CATEGORY_SCREEN_OPENED, "chat_main-page");
        kotlin.jvm.internal.i.e(W, "analytics.createEvent(IQ…OPENED, \"chat_main-page\")");
        a((LifecycleObserver) new AnalyticsLifecycleObserver(W, null, 2, null));
    }
}
