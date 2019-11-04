package com.iqoption.chat.c;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs;
import com.iqoption.core.microservices.chat.response.d;
import com.iqoption.core.microservices.chat.response.e;
import io.reactivex.b.g;
import io.reactivex.p;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002:\u0001!B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u000eJ \u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J.\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t2\u0006\u0010\u0013\u001a\u00020\u00052\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u0017J4\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t2\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u00052\b\b\u0002\u0010\u0016\u001a\u00020\u0017J\u0016\u0010\u001b\u001a\u00020\u00102\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016J\u0016\u0010\u001d\u001a\u00020\u00102\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016J\u0016\u0010\u001e\u001a\u00020\u00102\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002J\u000e\u0010 \u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u000eR\u0016\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u0005X\u0004¢\u0006\u0002\n\u0000R&\u0010\u0007\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t0\bX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0004¢\u0006\u0002\n\u0000¨\u0006\""}, bng = {"Lcom/iqoption/chat/repository/MessageRepository;", "Lcom/iqoption/chat/repository/MessagesListener;", "Lcom/iqoption/chat/repository/PublicMessagesListener;", "()V", "TAG", "", "kotlin.jvm.PlatformType", "cache", "", "Lio/reactivex/Single;", "", "Lcom/iqoption/core/microservices/chat/response/ChatMessage;", "messageListeners", "", "Lcom/iqoption/chat/repository/MessageRepository$MessageListener;", "addMessageListener", "", "listener", "createCacheKey", "roomId", "timestamp", "", "limit", "", "getMessages", "fromId", "toId", "onChatMessageGenerated", "event", "onChatMessagePublicGenerated", "onMessageEvent", "messages", "removeMessageListener", "MessageListener", "chat_release"})
/* compiled from: MessageRepository.kt */
public final class a {
    private static final String TAG = a.class.getSimpleName();
    private static final Set<a> aVQ = new LinkedHashSet();
    private static final Map<String, p<List<e>>> aVR = new LinkedHashMap();
    public static final a aVS = new a();

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&¨\u0006\u0007"}, bng = {"Lcom/iqoption/chat/repository/MessageRepository$MessageListener;", "", "onMessageEvent", "", "messages", "", "Lcom/iqoption/core/microservices/chat/response/ChatMessage;", "chat_release"})
    /* compiled from: MessageRepository.kt */
    public interface a {
        void aa(List<e> list);
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "Lcom/iqoption/core/microservices/chat/response/ChatMessage;", "it", "Lcom/iqoption/core/microservices/chat/response/ChatListResponse;", "apply"})
    /* compiled from: MessageRepository.kt */
    static final class b<T, R> implements g<T, R> {
        public static final b aVT = new b();

        b() {
        }

        /* renamed from: a */
        public final List<e> apply(d<e> dVar) {
            kotlin.jvm.internal.i.f(dVar, "it");
            return (List) dVar.getData();
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "Lcom/iqoption/core/microservices/chat/response/ChatMessage;", "it", "Lcom/iqoption/core/microservices/chat/response/ChatListResponse;", "apply"})
    /* compiled from: MessageRepository.kt */
    static final class c<T, R> implements g<T, R> {
        public static final c aVU = new c();

        c() {
        }

        /* renamed from: a */
        public final List<e> apply(d<e> dVar) {
            kotlin.jvm.internal.i.f(dVar, "it");
            return (List) dVar.getData();
        }
    }

    private a() {
    }

    public void Y(List<e> list) {
        kotlin.jvm.internal.i.f(list, "event");
        aa(list);
    }

    public void Z(List<e> list) {
        kotlin.jvm.internal.i.f(list, "event");
        aa(list);
    }

    private final void aa(List<e> list) {
        for (a aa : aVQ) {
            aa.aa(list);
        }
    }

    public final void a(a aVar) {
        kotlin.jvm.internal.i.f(aVar, CastExtraArgs.LISTENER);
        aVQ.add(aVar);
    }

    public final void b(a aVar) {
        kotlin.jvm.internal.i.f(aVar, CastExtraArgs.LISTENER);
        aVQ.remove(aVar);
    }

    public static /* synthetic */ p a(a aVar, String str, long j, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            j = 0;
        }
        if ((i2 & 4) != 0) {
            i = 20;
        }
        return aVar.a(str, j, i);
    }

    public final p<List<e>> a(String str, long j, int i) {
        kotlin.jvm.internal.i.f(str, "roomId");
        p t = com.iqoption.core.microservices.chat.a.bpz.b(str, j, i).t(b.aVT);
        kotlin.jvm.internal.i.e(t, "ChatRequests.requestChat…         .map { it.data }");
        return t;
    }

    public static /* synthetic */ p a(a aVar, String str, String str2, String str3, int i, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            i = 20;
        }
        return aVar.a(str, str2, str3, i);
    }

    public final p<List<e>> a(String str, String str2, String str3, int i) {
        kotlin.jvm.internal.i.f(str, "roomId");
        kotlin.jvm.internal.i.f(str2, "fromId");
        kotlin.jvm.internal.i.f(str3, "toId");
        p t = com.iqoption.core.microservices.chat.a.bpz.b(str, str2, str3, i).t(c.aVU);
        kotlin.jvm.internal.i.e(t, "ChatRequests.requestChat…d, limit).map { it.data }");
        return t;
    }
}
