package com.iqoption.chat.c;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs;
import com.iqoption.core.microservices.chat.response.k;
import io.reactivex.p;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

@kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u0001:\u0003\u001b\u001c\u001dB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\bJ\u000e\u0010\u000e\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\nJ\u0016\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00102\u0006\u0010\u0012\u001a\u00020\u0004J\u0012\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00140\u0010J\u0016\u0010\u0015\u001a\u00020\f2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00110\u0014H\u0016J\u000e\u0010\u0017\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\bJ\u000e\u0010\u0018\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\nJ\u000e\u0010\u0019\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u0004R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, bng = {"Lcom/iqoption/chat/repository/RoomRepository;", "Lcom/iqoption/chat/repository/RoomListener;", "()V", "TAG", "", "kotlin.jvm.PlatformType", "lastSeenMessageListeners", "", "Lcom/iqoption/chat/repository/RoomRepository$LastSeenMessageListener;", "roomListeners", "Lcom/iqoption/chat/repository/RoomRepository$RoomListener;", "addLastSeenMessageListener", "", "listener", "addRoomListener", "getRoom", "Lio/reactivex/Single;", "Lcom/iqoption/core/microservices/chat/response/ChatRoom;", "id", "getRooms", "", "onChatRoomGenerated", "event", "removeLastSeenMessageListener", "removeRoomListener", "setRoomRead", "roomId", "Cache", "LastSeenMessageListener", "RoomListener", "chat_release"})
/* compiled from: RoomRepository.kt */
public final class b {
    private static final String TAG = b.class.getSimpleName();
    private static final Set<c> aVV = new LinkedHashSet();
    private static final Set<b> aVW = new LinkedHashSet();
    public static final b aVX = new b();

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R(\u0010\u0003\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u000b"}, bng = {"Lcom/iqoption/chat/repository/RoomRepository$Cache;", "", "()V", "all", "Lio/reactivex/Single;", "", "Lcom/iqoption/core/microservices/chat/response/ChatRoom;", "getAll", "()Lio/reactivex/Single;", "setAll", "(Lio/reactivex/Single;)V", "chat_release"})
    /* compiled from: RoomRepository.kt */
    public static final class a {
        private static p<List<k>> aVY;
        public static final a aVZ = new a();

        private a() {
        }

        public final p<List<k>> SV() {
            return aVY;
        }

        public final void b(p<List<k>> pVar) {
            aVY = pVar;
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&¨\u0006\u0007"}, bng = {"Lcom/iqoption/chat/repository/RoomRepository$LastSeenMessageListener;", "", "onLastSeenMessageChanged", "", "roomId", "", "messageId", "chat_release"})
    /* compiled from: RoomRepository.kt */
    public interface b {
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&¨\u0006\u0007"}, bng = {"Lcom/iqoption/chat/repository/RoomRepository$RoomListener;", "", "onRoomEvent", "", "chatRooms", "", "Lcom/iqoption/core/microservices/chat/response/ChatRoom;", "chat_release"})
    /* compiled from: RoomRepository.kt */
    public interface c {
        void ac(List<k> list);
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, bng = {"<anonymous>", "Lcom/iqoption/core/microservices/chat/response/ChatRoom;", "it", "", "apply"})
    /* compiled from: RoomRepository.kt */
    static final class d<T, R> implements io.reactivex.b.g<T, R> {
        final /* synthetic */ String aWa;

        d(String str) {
            this.aWa = str;
        }

        /* renamed from: ad */
        public final k apply(List<k> list) {
            kotlin.jvm.internal.i.f(list, "it");
            for (Object next : list) {
                if (kotlin.jvm.internal.i.y(((k) next).getId(), this.aWa)) {
                    break;
                }
            }
            Object next2 = null;
            return (k) next2;
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, bng = {"<anonymous>", "Lcom/iqoption/core/microservices/chat/response/ChatRoom;", "it", "", "apply"})
    /* compiled from: RoomRepository.kt */
    static final class e<T, R> implements io.reactivex.b.g<T, R> {
        final /* synthetic */ String aWa;

        e(String str) {
            this.aWa = str;
        }

        /* renamed from: ad */
        public final k apply(List<k> list) {
            kotlin.jvm.internal.i.f(list, "it");
            for (Object next : list) {
                if (kotlin.jvm.internal.i.y(((k) next).getId(), this.aWa)) {
                    break;
                }
            }
            Object next2 = null;
            return (k) next2;
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "Lcom/iqoption/core/microservices/chat/response/ChatRoom;", "it", "Lcom/iqoption/core/microservices/chat/response/ChatListResponse;", "apply"})
    /* compiled from: RoomRepository.kt */
    static final class f<T, R> implements io.reactivex.b.g<T, R> {
        public static final f aWb = new f();

        f() {
        }

        /* renamed from: a */
        public final List<k> apply(com.iqoption.core.microservices.chat.response.d<k> dVar) {
            kotlin.jvm.internal.i.f(dVar, "it");
            return (List) dVar.getData();
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, bng = {"<anonymous>", "", "it", "", "Lcom/iqoption/core/microservices/chat/response/ChatRoom;", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: RoomRepository.kt */
    static final class g<T> implements io.reactivex.b.f<List<? extends k>> {
        public static final g aWc = new g();

        g() {
        }

        /* renamed from: v */
        public final void accept(List<k> list) {
            a.aVZ.b((p) null);
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: RoomRepository.kt */
    static final class h<T> implements io.reactivex.b.f<Throwable> {
        public static final h aWd = new h();

        h() {
        }

        /* renamed from: o */
        public final void accept(Throwable th) {
            a.aVZ.b((p) null);
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, bng = {"<anonymous>", "", "run"})
    /* compiled from: RoomRepository.kt */
    static final class i implements io.reactivex.b.a {
        public static final i aWe = new i();

        i() {
        }

        public final void run() {
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: RoomRepository.kt */
    static final class j<T> implements io.reactivex.b.f<Throwable> {
        public static final j aWf = new j();

        j() {
        }

        /* renamed from: o */
        public final void accept(Throwable th) {
        }
    }

    private b() {
    }

    public void ab(List<k> list) {
        kotlin.jvm.internal.i.f(list, "event");
        for (c ac : aVV) {
            ac.ac(list);
        }
    }

    public final void a(c cVar) {
        kotlin.jvm.internal.i.f(cVar, CastExtraArgs.LISTENER);
        aVV.add(cVar);
    }

    public final void b(c cVar) {
        kotlin.jvm.internal.i.f(cVar, CastExtraArgs.LISTENER);
        aVV.remove(cVar);
    }

    public final void a(b bVar) {
        kotlin.jvm.internal.i.f(bVar, CastExtraArgs.LISTENER);
        aVW.add(bVar);
    }

    public final void b(b bVar) {
        kotlin.jvm.internal.i.f(bVar, CastExtraArgs.LISTENER);
        aVW.remove(bVar);
    }

    public final p<List<k>> SU() {
        p<List<k>> SV = a.aVZ.SV();
        if (SV != null) {
            return SV;
        }
        p i = com.iqoption.core.microservices.chat.a.bpz.abA().t(f.aWb).h((io.reactivex.b.f) g.aWc).i((io.reactivex.b.f) h.aWd);
        a.aVZ.b(i);
        kotlin.jvm.internal.i.e(i, "ChatRequests.requestChat… = this\n                }");
        return i;
    }

    public final p<k> fb(String str) {
        kotlin.jvm.internal.i.f(str, "id");
        p SV = a.aVZ.SV();
        if (SV != null) {
            p<k> t = SV.t(new d(str));
            if (t != null) {
                return t;
            }
        }
        SV = SU().t(new e(str));
        kotlin.jvm.internal.i.e(SV, "getRooms().map { it.find { it.id == id } }");
        return SV;
    }

    public final void fc(String str) {
        kotlin.jvm.internal.i.f(str, "roomId");
        com.iqoption.core.microservices.chat.a.bpz.gl(str).blf().b(com.iqoption.core.rx.i.aki()).a(i.aWe, j.aWf);
    }
}
