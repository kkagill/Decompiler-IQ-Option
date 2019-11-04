package com.iqoption.chat.viewmodel;

import android.os.SystemClock;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import io.reactivex.p;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.k;
import kotlin.l;

@kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0010#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 (2\u00020\u00012\u00020\u0002:\u0001(B\u0005¢\u0006\u0002\u0010\u0003J*\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00062\u0018\u0010\u0015\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0004\u0012\u00020\u00130\u0016H\u0002J\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\f0\u00182\u0006\u0010\u0014\u001a\u00020\u0006J\u0010\u0010\u0019\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0014\u001a\u00020\u0006J\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0014\u001a\u00020\u0006H\u0002J\u000e\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0014\u001a\u00020\u0006J\u001c\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u001f0\u001e2\u0006\u0010\u0014\u001a\u00020\u0006H\u0002J\b\u0010 \u001a\u00020\u0013H\u0014J\u0016\u0010!\u001a\u00020\u00132\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\f0\u001fH\u0016J\u001a\u0010#\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00062\b\u0010$\u001a\u0004\u0018\u00010\fH\u0002J\u0018\u0010%\u001a\u00020\u00132\u0010\b\u0002\u0010&\u001a\n\u0012\u0004\u0012\u00020'\u0018\u00010\u001fR\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\tX\u0004¢\u0006\u0002\n\u0000R \u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\u0005X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\tX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\f0\u000fX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u000fX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\f0\u000fX\u0004¢\u0006\u0002\n\u0000¨\u0006)"}, bng = {"Lcom/iqoption/chat/viewmodel/LastMessagesViewModel;", "Lcom/iqoption/core/ui/viewmodel/DisposableViewModel;", "Lcom/iqoption/chat/repository/MessageRepository$MessageListener;", "()V", "cacheTimeRegistry", "", "", "", "emptyRooms", "", "lastMessages", "Landroidx/lifecycle/MutableLiveData;", "Lcom/iqoption/core/microservices/chat/response/ChatMessage;", "loadingRegistry", "messagesToAdd", "", "messagesToClear", "messagesToSwap", "changeLastMessage", "", "roomId", "changeBlock", "Lkotlin/Function1;", "getLastMessage", "Landroidx/lifecycle/LiveData;", "getLastMessageImmediate", "isMessageExpired", "", "isMessageLoading", "loadLastMessage", "Lio/reactivex/Single;", "", "onCleared", "onMessageEvent", "messages", "postLastMessage", "message", "subscribeForChanges", "chatRooms", "Lcom/iqoption/core/microservices/chat/response/ChatRoom;", "Companion", "chat_release"})
/* compiled from: LastMessagesViewModel.kt */
public final class i extends com.iqoption.core.ui.f.d implements com.iqoption.chat.c.a.a {
    private static final String TAG;
    private static final kotlin.d aWy = g.c(LastMessagesViewModel$Companion$instance$2.aXw);
    private static final long aXu = TimeUnit.SECONDS.toMillis(10);
    public static final a aXv = new a();
    private final Map<String, MutableLiveData<com.iqoption.core.microservices.chat.response.e>> aXn = new LinkedHashMap();
    private final Map<String, Long> aXo = new LinkedHashMap();
    private final Set<String> aXp = new LinkedHashSet();
    private final Set<String> aXq = new LinkedHashSet();
    private final List<String> aXr = new ArrayList();
    private final List<com.iqoption.core.microservices.chat.response.e> aXs = new ArrayList();
    private final List<com.iqoption.core.microservices.chat.response.e> aXt = new ArrayList();

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0011\u001a\u00020\fR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001b\u0010\u000b\u001a\u00020\f8BX\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000e¨\u0006\u0012"}, bng = {"Lcom/iqoption/chat/viewmodel/LastMessagesViewModel$Companion;", "", "()V", "CACHE_LIFE_TIME", "", "getCACHE_LIFE_TIME", "()J", "TAG", "", "getTAG", "()Ljava/lang/String;", "instance", "Lcom/iqoption/chat/viewmodel/LastMessagesViewModel;", "getInstance", "()Lcom/iqoption/chat/viewmodel/LastMessagesViewModel;", "instance$delegate", "Lkotlin/Lazy;", "get", "chat_release"})
    /* compiled from: LastMessagesViewModel.kt */
    public static final class a {
        static final /* synthetic */ kotlin.reflect.j[] anY = new kotlin.reflect.j[]{k.a(new PropertyReference1Impl(k.G(a.class), "instance", "getInstance()Lcom/iqoption/chat/viewmodel/LastMessagesViewModel;"))};

        private final i TA() {
            kotlin.d Te = i.aWy;
            a aVar = i.aXv;
            kotlin.reflect.j jVar = anY[0];
            return (i) Te.getValue();
        }

        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final i TB() {
            return TA();
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006¨\u0006\u0007"}, bng = {"<anonymous>", "", "it", "", "Lcom/iqoption/core/microservices/chat/response/ChatMessage;", "kotlin.jvm.PlatformType", "accept", "com/iqoption/chat/viewmodel/LastMessagesViewModel$getLastMessage$2$1"})
    /* compiled from: LastMessagesViewModel.kt */
    static final class b<T> implements io.reactivex.b.f<List<? extends com.iqoption.core.microservices.chat.response.e>> {
        final /* synthetic */ String aQv;
        final /* synthetic */ i aXx;

        b(i iVar, String str) {
            this.aXx = iVar;
            this.aQv = str;
        }

        /* renamed from: v */
        public final void accept(List<com.iqoption.core.microservices.chat.response.e> list) {
            i iVar = this.aXx;
            String str = this.aQv;
            kotlin.jvm.internal.i.e(list, "it");
            iVar.a(str, (com.iqoption.core.microservices.chat.response.e) u.bV(list));
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: LastMessagesViewModel.kt */
    static final class c<T> implements io.reactivex.b.f<Throwable> {
        public static final c aXy = new c();

        c() {
        }

        /* renamed from: o */
        public final void accept(Throwable th) {
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0004"}, bng = {"<anonymous>", "", "Lcom/iqoption/core/microservices/chat/response/ChatMessage;", "it", "apply"})
    /* compiled from: LastMessagesViewModel.kt */
    static final class d<T, R> implements io.reactivex.b.g<T, R> {
        public static final d aXz = new d();

        d() {
        }

        public final List<com.iqoption.core.microservices.chat.response.e> apply(List<com.iqoption.core.microservices.chat.response.e> list) {
            kotlin.jvm.internal.i.f(list, "it");
            Collection arrayList = new ArrayList();
            for (Object next : list) {
                if ((((com.iqoption.core.microservices.chat.response.e) next).aci() ^ 1) != 0) {
                    arrayList.add(next);
                }
            }
            return (List) arrayList;
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, bng = {"<anonymous>", "", "it", "", "Lcom/iqoption/core/microservices/chat/response/ChatMessage;", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: LastMessagesViewModel.kt */
    static final class e<T> implements io.reactivex.b.f<List<? extends com.iqoption.core.microservices.chat.response.e>> {
        final /* synthetic */ String aXA;
        final /* synthetic */ i aXx;

        e(i iVar, String str) {
            this.aXx = iVar;
            this.aXA = str;
        }

        /* renamed from: v */
        public final void accept(List<com.iqoption.core.microservices.chat.response.e> list) {
            this.aXx.aXp.remove(this.aXA);
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: LastMessagesViewModel.kt */
    static final class f<T> implements io.reactivex.b.f<Throwable> {
        final /* synthetic */ String aXA;
        final /* synthetic */ i aXx;

        f(i iVar, String str) {
            this.aXx = iVar;
            this.aXA = str;
        }

        /* renamed from: o */
        public final void accept(Throwable th) {
            this.aXx.aXp.remove(this.aXA);
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, bng = {"<anonymous>", "", "it", "", "Lcom/iqoption/core/microservices/chat/response/ChatMessage;", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: LastMessagesViewModel.kt */
    static final class g<T> implements io.reactivex.b.f<List<? extends com.iqoption.core.microservices.chat.response.e>> {
        final /* synthetic */ MutableLiveData aXB;

        g(MutableLiveData mutableLiveData) {
            this.aXB = mutableLiveData;
        }

        /* renamed from: v */
        public final void accept(List<com.iqoption.core.microservices.chat.response.e> list) {
            MutableLiveData mutableLiveData = this.aXB;
            kotlin.jvm.internal.i.e(list, "it");
            mutableLiveData.postValue(u.bV(list));
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: LastMessagesViewModel.kt */
    static final class h<T> implements io.reactivex.b.f<Throwable> {
        public static final h aXC = new h();

        h() {
        }

        /* renamed from: o */
        public final void accept(Throwable th) {
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, bng = {"<anonymous>", "", "it", "", "Lcom/iqoption/core/microservices/chat/response/ChatMessage;", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: LastMessagesViewModel.kt */
    static final class i<T> implements io.reactivex.b.f<List<? extends com.iqoption.core.microservices.chat.response.e>> {
        public static final i aXD = new i();

        i() {
        }

        /* renamed from: v */
        public final void accept(List<com.iqoption.core.microservices.chat.response.e> list) {
            com.iqoption.chat.c.a aVar = com.iqoption.chat.c.a.aVS;
            kotlin.jvm.internal.i.e(list, "it");
            aVar.Y(list);
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: LastMessagesViewModel.kt */
    static final class j<T> implements io.reactivex.b.f<Throwable> {
        public static final j aXE = new j();

        j() {
        }

        /* renamed from: o */
        public final void accept(Throwable th) {
        }
    }

    public i() {
        com.iqoption.chat.c.a.aVS.a(this);
    }

    static {
        String simpleName = i.class.getSimpleName();
        kotlin.jvm.internal.i.e(simpleName, "LastMessagesViewModel::class.java.simpleName");
        TAG = simpleName;
    }

    public void aa(List<com.iqoption.core.microservices.chat.response.e> list) {
        MutableLiveData mutableLiveData;
        kotlin.jvm.internal.i.f(list, "messages");
        this.aXr.clear();
        this.aXs.clear();
        this.aXt.clear();
        for (com.iqoption.core.microservices.chat.response.e eVar : list) {
            this.aXq.remove(eVar.SJ());
            mutableLiveData = (MutableLiveData) this.aXn.get(eVar.SJ());
            if (mutableLiveData != null) {
                com.iqoption.core.microservices.chat.response.e eVar2 = (com.iqoption.core.microservices.chat.response.e) mutableLiveData.getValue();
                if (eVar2 != null) {
                    if (kotlin.jvm.internal.i.y(eVar2.getId(), eVar.getId())) {
                        if (eVar.aci()) {
                            this.aXr.add(eVar.SJ());
                        } else {
                            this.aXs.add(eVar);
                        }
                    } else if (eVar2.getDate() < eVar.getDate()) {
                        this.aXt.add(eVar);
                    }
                } else if (!fi(eVar.SJ())) {
                    this.aXt.add(eVar);
                }
            }
        }
        Collection arrayList = new ArrayList();
        Iterator it = this.aXr.iterator();
        while (true) {
            Object obj = null;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            String str = (String) next;
            for (Object next2 : this.aXt) {
                if (kotlin.jvm.internal.i.y(((com.iqoption.core.microservices.chat.response.e) next2).SJ(), str)) {
                    obj = next2;
                    break;
                }
            }
            if ((obj != null ? 1 : null) != null) {
                arrayList.add(next);
            }
        }
        List list2 = (List) arrayList;
        for (String str2 : this.aXr) {
            for (Object next3 : this.aXt) {
                if (kotlin.jvm.internal.i.y(((com.iqoption.core.microservices.chat.response.e) next3).SJ(), str2)) {
                    break;
                }
            }
            Object next32 = null;
            if (next32 == null) {
                mutableLiveData = (MutableLiveData) this.aXn.get(str2);
                if (mutableLiveData != null) {
                    fj(str2).h(com.iqoption.core.rx.i.aki()).a((io.reactivex.b.f) new g(mutableLiveData), (io.reactivex.b.f) h.aXC);
                }
            }
        }
        for (com.iqoption.core.microservices.chat.response.e eVar3 : this.aXs) {
            a(eVar3.SJ(), eVar3);
        }
        for (com.iqoption.core.microservices.chat.response.e eVar32 : this.aXt) {
            a(eVar32.SJ(), eVar32);
        }
    }

    private final void c(String str, kotlin.jvm.a.b<? super MutableLiveData<com.iqoption.core.microservices.chat.response.e>, l> bVar) {
        MutableLiveData mutableLiveData = (MutableLiveData) this.aXn.get(str);
        if (mutableLiveData != null) {
            bVar.invoke(mutableLiveData);
            this.aXo.put(str, Long.valueOf(SystemClock.elapsedRealtime()));
        }
    }

    private final void a(String str, com.iqoption.core.microservices.chat.response.e eVar) {
        c(str, new LastMessagesViewModel$postLastMessage$1(eVar));
    }

    /* Access modifiers changed, original: protected */
    public void onCleared() {
        super.onCleared();
        com.iqoption.chat.c.a.aVS.b(this);
    }

    public final com.iqoption.core.microservices.chat.response.e ff(String str) {
        kotlin.jvm.internal.i.f(str, "roomId");
        MutableLiveData mutableLiveData = (MutableLiveData) this.aXn.get(str);
        return mutableLiveData != null ? (com.iqoption.core.microservices.chat.response.e) mutableLiveData.getValue() : null;
    }

    public final LiveData<com.iqoption.core.microservices.chat.response.e> fg(String str) {
        kotlin.jvm.internal.i.f(str, "roomId");
        MutableLiveData mutableLiveData = (MutableLiveData) this.aXn.get(str);
        if (mutableLiveData == null) {
            mutableLiveData = new MutableLiveData();
            this.aXn.put(str, mutableLiveData);
        }
        if (fh(str) && !fi(str)) {
            fj(str).h(com.iqoption.core.rx.i.aki()).a((io.reactivex.b.f) new b(this, str), (io.reactivex.b.f) c.aXy);
        }
        return mutableLiveData;
    }

    private final boolean fh(String str) {
        Long l = (Long) this.aXo.get(str);
        if (l == null) {
            return true;
        }
        return SystemClock.elapsedRealtime() - ((Number) l).longValue() > aXu;
    }

    public final boolean fi(String str) {
        kotlin.jvm.internal.i.f(str, "roomId");
        return this.aXp.contains(str);
    }

    private final p<List<com.iqoption.core.microservices.chat.response.e>> fj(String str) {
        this.aXp.add(str);
        p i = com.iqoption.chat.c.a.a(com.iqoption.chat.c.a.aVS, str, 0, 3, 2, null).t(d.aXz).h((io.reactivex.b.f) new e(this, str)).i((io.reactivex.b.f) new f(this, str));
        kotlin.jvm.internal.i.e(i, "MessageRepository.getMes…Registry.remove(roomId) }");
        return i;
    }

    public final void ae(List<com.iqoption.core.microservices.chat.response.k> list) {
        if (list != null) {
            Collection arrayList = new ArrayList();
            for (Object next : list) {
                if (((com.iqoption.core.microservices.chat.response.k) next).isPublic()) {
                    arrayList.add(next);
                }
            }
            Iterable<com.iqoption.core.microservices.chat.response.k> iterable = (List) arrayList;
            Collection arrayList2 = new ArrayList(n.e(iterable, 10));
            for (com.iqoption.core.microservices.chat.response.k id : iterable) {
                arrayList2.add(id.getId());
            }
            for (String gp : (List) arrayList2) {
                io.reactivex.disposables.b a = com.iqoption.core.microservices.chat.a.bpz.gp(gp).d(com.iqoption.core.rx.i.aki()).a((io.reactivex.b.f) i.aXD, (io.reactivex.b.f) j.aXE);
                kotlin.jvm.internal.i.e(a, "ChatRequests.getChatMess…                   }, {})");
                b(a);
            }
        }
    }
}
