package com.iqoption.chat.c;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.iqoption.core.microservices.chat.response.l;
import io.reactivex.b.f;
import io.reactivex.b.g;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\r\u001a\u00020\u000eJ\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\bH\u0016R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078F¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\fX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, bng = {"Lcom/iqoption/chat/repository/StateRepository;", "Lcom/iqoption/chat/repository/StateListener;", "()V", "TAG", "", "kotlin.jvm.PlatformType", "state", "Landroidx/lifecycle/LiveData;", "Lcom/iqoption/core/microservices/chat/response/ChatState;", "getState", "()Landroidx/lifecycle/LiveData;", "stateData", "Landroidx/lifecycle/MutableLiveData;", "loadState", "", "onChatStateUpdated", "chat_release"})
/* compiled from: StateRepository.kt */
public final class c {
    private static final String TAG = c.class.getSimpleName();
    private static final MutableLiveData<l> aKM = new MutableLiveData();
    public static final c aWg = new c();

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, bng = {"<anonymous>", "Lcom/iqoption/core/microservices/chat/response/ChatState;", "it", "Lcom/iqoption/core/microservices/chat/response/ChatDataResponse;", "apply"})
    /* compiled from: StateRepository.kt */
    static final class a<T, R> implements g<T, R> {
        public static final a aWh = new a();

        a() {
        }

        /* renamed from: a */
        public final l apply(com.iqoption.core.microservices.chat.response.c<l> cVar) {
            kotlin.jvm.internal.i.f(cVar, "it");
            return (l) cVar.getData();
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "Lcom/iqoption/core/microservices/chat/response/ChatState;", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: StateRepository.kt */
    static final class b<T> implements f<l> {
        public static final b aWi = new b();

        b() {
        }

        /* renamed from: d */
        public final void accept(l lVar) {
            c.aKM.postValue(lVar);
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: StateRepository.kt */
    static final class c<T> implements f<Throwable> {
        public static final c aWj = new c();

        c() {
        }

        /* renamed from: o */
        public final void accept(Throwable th) {
        }
    }

    private c() {
    }

    public void c(l lVar) {
        kotlin.jvm.internal.i.f(lVar, "state");
        aKM.postValue(lVar);
    }

    public final LiveData<l> getState() {
        return aKM;
    }

    public final void SW() {
        com.iqoption.core.microservices.chat.a.bpz.abB().t(a.aWh).h(com.iqoption.core.rx.i.aki()).a((f) b.aWi, (f) c.aWj);
    }
}
