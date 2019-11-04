package com.iqoption.chat.viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.iqoption.core.microservices.chat.response.k;
import io.reactivex.b.f;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.i;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.j;

@i(bne = {1, 1, 15}, bnf = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u0000 \u00132\u00020\u00012\u00020\u0002:\u0001\u0013B\u0005¢\u0006\u0002\u0010\u0003J$\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002J\b\u0010\u0010\u001a\u00020\rH\u0014J\u0016\u0010\u0011\u001a\u00020\r2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016J\u0006\u0010\u0012\u001a\u00020\rR\u001d\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u000bX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, bng = {"Lcom/iqoption/chat/viewmodel/RoomsViewModel;", "Lcom/iqoption/core/ui/viewmodel/DisposableViewModel;", "Lcom/iqoption/chat/repository/RoomRepository$RoomListener;", "()V", "chatRooms", "Landroidx/lifecycle/LiveData;", "", "Lcom/iqoption/core/microservices/chat/response/ChatRoom;", "getChatRooms", "()Landroidx/lifecycle/LiveData;", "chatRoomsData", "Landroidx/lifecycle/MutableLiveData;", "merge", "", "initial", "portion", "onCleared", "onRoomEvent", "subscribeForChanges", "Companion", "chat_release"})
/* compiled from: RoomsViewModel.kt */
public final class l extends com.iqoption.core.ui.f.d implements com.iqoption.chat.c.b.c {
    private static final String TAG;
    private static final kotlin.d aWy = g.c(RoomsViewModel$Companion$instance$2.aYF);
    public static final a aYE = new a();
    private final MutableLiveData<List<k>> aYC;
    private final LiveData<List<k>> aYD = this.aYC;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\r\u001a\u00020\bR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\u0007\u001a\u00020\b8BX\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\n¨\u0006\u000e"}, bng = {"Lcom/iqoption/chat/viewmodel/RoomsViewModel$Companion;", "", "()V", "TAG", "", "getTAG", "()Ljava/lang/String;", "instance", "Lcom/iqoption/chat/viewmodel/RoomsViewModel;", "getInstance", "()Lcom/iqoption/chat/viewmodel/RoomsViewModel;", "instance$delegate", "Lkotlin/Lazy;", "get", "chat_release"})
    /* compiled from: RoomsViewModel.kt */
    public static final class a {
        static final /* synthetic */ j[] anY = new j[]{kotlin.jvm.internal.k.a(new PropertyReference1Impl(kotlin.jvm.internal.k.G(a.class), "instance", "getInstance()Lcom/iqoption/chat/viewmodel/RoomsViewModel;"))};

        private final l TS() {
            kotlin.d Te = l.aWy;
            a aVar = l.aYE;
            j jVar = anY[0];
            return (l) Te.getValue();
        }

        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final l TT() {
            return TS();
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, bng = {"<anonymous>", "", "it", "", "Lcom/iqoption/core/microservices/chat/response/ChatRoom;", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: RoomsViewModel.kt */
    static final class b<T> implements f<List<? extends k>> {
        final /* synthetic */ MutableLiveData aYG;

        b(MutableLiveData mutableLiveData) {
            this.aYG = mutableLiveData;
        }

        /* renamed from: v */
        public final void accept(List<k> list) {
            this.aYG.postValue(list);
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: RoomsViewModel.kt */
    static final class c<T> implements f<Throwable> {
        public static final c aYH = new c();

        c() {
        }

        /* renamed from: o */
        public final void accept(Throwable th) {
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, bng = {"<anonymous>", "", "it", "", "Lcom/iqoption/core/microservices/chat/response/ChatRoom;", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: RoomsViewModel.kt */
    static final class d<T> implements f<List<? extends k>> {
        public static final d aYI = new d();

        d() {
        }

        /* renamed from: v */
        public final void accept(List<k> list) {
            com.iqoption.chat.c.b bVar = com.iqoption.chat.c.b.aVX;
            kotlin.jvm.internal.i.e(list, "it");
            bVar.ab(list);
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: RoomsViewModel.kt */
    static final class e<T> implements f<Throwable> {
        public static final e aYJ = new e();

        e() {
        }

        /* renamed from: o */
        public final void accept(Throwable th) {
        }
    }

    public l() {
        com.iqoption.chat.c.b.aVX.a((com.iqoption.chat.c.b.c) this);
        MutableLiveData mutableLiveData = new MutableLiveData();
        com.iqoption.chat.c.b.aVX.SU().h(com.iqoption.core.rx.i.aki()).a((f) new b(mutableLiveData), (f) c.aYH);
        this.aYC = mutableLiveData;
    }

    static {
        String simpleName = l.class.getSimpleName();
        kotlin.jvm.internal.i.e(simpleName, "RoomsViewModel::class.java.simpleName");
        TAG = simpleName;
    }

    public final LiveData<List<k>> TQ() {
        return this.aYD;
    }

    public void ac(List<k> list) {
        kotlin.jvm.internal.i.f(list, "chatRooms");
        List list2 = (List) this.aYC.getValue();
        if (list2 != null) {
            e(list2, list);
        }
    }

    private final void e(List<k> list, List<k> list2) {
        Iterable iterable = list2;
        Collection arrayList = new ArrayList();
        for (Object next : iterable) {
            if (((k) next).aci()) {
                arrayList.add(next);
            }
        }
        List list3 = (List) arrayList;
        Iterable iterable2 = list3;
        Collection arrayList2 = new ArrayList();
        for (Object next2 : u.d(iterable, iterable2)) {
            if (!list.contains((k) next2)) {
                arrayList2.add(next2);
            }
        }
        Iterable iterable3 = (List) arrayList2;
        List d = u.d((Iterable) u.d(iterable, iterable3), iterable2);
        Collection arrayList3 = new ArrayList();
        for (Object next3 : list) {
            if (list3.contains((k) next3)) {
                arrayList3.add(next3);
            }
        }
        Iterable<Object> b = u.b((Collection) (List) arrayList3, iterable3);
        arrayList = new ArrayList(n.e(b, 10));
        for (Object obj : b) {
            Object obj2;
            for (Object next4 : d) {
                if (kotlin.jvm.internal.i.y(((k) next4).getId(), obj2.getId())) {
                    break;
                }
            }
            Object next42 = null;
            k kVar = (k) next42;
            if (kVar != null) {
                obj2 = kVar;
            }
            arrayList.add(obj2);
        }
        list3 = (List) arrayList;
    }

    /* Access modifiers changed, original: protected */
    public void onCleared() {
        super.onCleared();
        com.iqoption.chat.c.b.aVX.b((com.iqoption.chat.c.b.c) this);
    }

    public final void TR() {
        io.reactivex.disposables.b a = com.iqoption.core.microservices.chat.a.bpz.abH().d(com.iqoption.core.rx.i.aki()).a((f) d.aYI, (f) e.aYJ);
        kotlin.jvm.internal.i.e(a, "ChatRequests.getChatRoom…t)\n                }, {})");
        b(a);
    }
}
