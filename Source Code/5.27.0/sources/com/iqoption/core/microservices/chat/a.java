package com.iqoption.core.microservices.chat;

import com.google.gson.reflect.TypeToken;
import com.iqoption.dto.entity.position.Order;
import io.reactivex.p;
import java.lang.reflect.Type;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.internal.PropertyReference1Impl;

@kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\bÆ\u0002\u0018\u00002\u00020\u0001:\u0005_`abcB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u00103\u001a\b\u0012\u0004\u0012\u000205042\u0006\u00106\u001a\u00020\u0004J\f\u00107\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bJ\u0012\u00108\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020$0#0\u001bJ\u001a\u00108\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020$0#0\u001b2\u0006\u00109\u001a\u00020\u0004J\u0012\u0010:\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020(0#0\u001bJ\f\u0010;\u001a\b\u0012\u0004\u0012\u00020,0\u001bJ\f\u0010<\u001a\b\u0012\u0004\u0012\u0002000\u001bJ\u0014\u0010<\u001a\b\u0012\u0004\u0012\u0002000\u001b2\u0006\u00109\u001a\u00020\u0004J(\u0010=\u001a\b\u0012\u0004\u0012\u000205042\u0006\u00106\u001a\u00020\u00042\u0006\u0010>\u001a\u00020?2\n\b\u0002\u0010@\u001a\u0004\u0018\u00010\u0004J\u0014\u0010A\u001a\b\u0012\u0004\u0012\u000205042\u0006\u0010B\u001a\u00020\u0004J\u001a\u0010C\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020E0D042\u0006\u0010F\u001a\u00020\u0004J.\u0010G\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020$0H042\u0006\u0010B\u001a\u00020\u00042\b\b\u0002\u0010I\u001a\u00020J2\b\b\u0002\u0010K\u001a\u00020?J\u001a\u0010L\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020M0D042\u0006\u0010B\u001a\u00020\u0004J4\u0010N\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020$0H042\u0006\u0010B\u001a\u00020\u00042\u0006\u0010O\u001a\u00020\u00042\u0006\u0010P\u001a\u00020\u00042\b\b\u0002\u0010K\u001a\u00020?J\u0012\u0010Q\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020(0H04J\u0012\u0010R\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020,0D04J\u001e\u0010S\u001a\b\u0012\u0004\u0012\u000205042\u0006\u00106\u001a\u00020\u00042\b\b\u0002\u0010T\u001a\u00020UJ\u0014\u0010V\u001a\b\u0012\u0004\u0012\u00020W042\u0006\u0010B\u001a\u00020\u0004JN\u0010X\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020$0D042\u0006\u0010B\u001a\u00020\u00042\b\b\u0002\u0010Y\u001a\u00020\u00042\n\b\u0002\u0010Z\u001a\u0004\u0018\u00010\u00042\u0010\b\u0002\u0010[\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010#2\n\b\u0002\u0010\\\u001a\u0004\u0018\u00010\u0004J\u001c\u0010]\u001a\b\u0012\u0004\u0012\u000205042\u0006\u0010B\u001a\u00020\u00042\u0006\u0010Z\u001a\u00020\u0004J\u0014\u0010^\u001a\b\u0012\u0004\u0012\u000205042\u0006\u0010B\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R?\u0010\u001a\u001a&\u0012\f\u0012\n \u001d*\u0004\u0018\u00010\u001c0\u001c \u001d*\u0012\u0012\f\u0012\n \u001d*\u0004\u0018\u00010\u001c0\u001c\u0018\u00010\u001b0\u001b8BX\u0002¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\u001e\u0010\u001fRW\u0010\"\u001a>\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020$ \u001d*\n\u0012\u0004\u0012\u00020$\u0018\u00010#0# \u001d*\u001e\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020$ \u001d*\n\u0012\u0004\u0012\u00020$\u0018\u00010#0#\u0018\u00010\u001b0\u001b8BX\u0002¢\u0006\f\n\u0004\b&\u0010!\u001a\u0004\b%\u0010\u001fRW\u0010'\u001a>\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020( \u001d*\n\u0012\u0004\u0012\u00020(\u0018\u00010#0# \u001d*\u001e\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020( \u001d*\n\u0012\u0004\u0012\u00020(\u0018\u00010#0#\u0018\u00010\u001b0\u001b8BX\u0002¢\u0006\f\n\u0004\b*\u0010!\u001a\u0004\b)\u0010\u001fR?\u0010+\u001a&\u0012\f\u0012\n \u001d*\u0004\u0018\u00010,0, \u001d*\u0012\u0012\f\u0012\n \u001d*\u0004\u0018\u00010,0,\u0018\u00010\u001b0\u001b8BX\u0002¢\u0006\f\n\u0004\b.\u0010!\u001a\u0004\b-\u0010\u001fR?\u0010/\u001a&\u0012\f\u0012\n \u001d*\u0004\u0018\u00010000 \u001d*\u0012\u0012\f\u0012\n \u001d*\u0004\u0018\u00010000\u0018\u00010\u001b0\u001b8BX\u0002¢\u0006\f\n\u0004\b2\u0010!\u001a\u0004\b1\u0010\u001f¨\u0006d"}, bng = {"Lcom/iqoption/core/microservices/chat/ChatRequests;", "", "()V", "CMD_DENY_CHAT_SUPPORT_BOT", "", "CMD_RATE_SUPPORT_CHAT", "CMD_READ_CHAT_MESSAGE", "CMD_REQUEST_CHAT_CLIENT_MANAGER_ONLINE", "CMD_REQUEST_CHAT_MESSAGE", "CMD_REQUEST_CHAT_MESSAGE_SUGGESTIONS", "CMD_REQUEST_CHAT_MISSING_MESSAGE", "CMD_REQUEST_CHAT_ROOM", "CMD_REQUEST_CHAT_STATE", "CMD_RESOLVE_CHAT_SUPPORT", "CMD_SEND_CHAT_HEARTBEAT", "CMD_SEND_CHAT_MESSAGE", "CMD_SEND_CHAT_TEXT_TYPING", "CMD_SEND_CHAT_TYPING", "EVENT_CHAT_CLIENT_MANAGER_ONLINE_CHANGED", "EVENT_CHAT_MESSAGE_GENERATED", "EVENT_CHAT_MESSAGE_PUBLIC_GENERATED", "EVENT_CHAT_PUBLIC_TYPING", "EVENT_CHAT_ROOM_GENERATED", "EVENT_CHAT_STATE_UPDATED", "EVENT_CHAT_TYPING", "FEATURE_SUPPORT_BOT", "chatClientManagerOnlineStream", "Lio/reactivex/Flowable;", "Lcom/iqoption/core/microservices/chat/event/ChatClientManagerOnlineChanged;", "kotlin.jvm.PlatformType", "getChatClientManagerOnlineStream", "()Lio/reactivex/Flowable;", "chatClientManagerOnlineStream$delegate", "Lkotlin/Lazy;", "chatMessageStream", "", "Lcom/iqoption/core/microservices/chat/response/ChatMessage;", "getChatMessageStream", "chatMessageStream$delegate", "chatRoomStream", "Lcom/iqoption/core/microservices/chat/response/ChatRoom;", "getChatRoomStream", "chatRoomStream$delegate", "chatStateStream", "Lcom/iqoption/core/microservices/chat/response/ChatState;", "getChatStateStream", "chatStateStream$delegate", "chatTypingStream", "Lcom/iqoption/core/microservices/chat/event/ChatTypingInfo;", "getChatTypingStream", "chatTypingStream$delegate", "denyChatSupportBot", "Lio/reactivex/Single;", "Lcom/iqoption/core/microservices/chat/response/ChatResponse;", "messageId", "getChatClientManagerOnlineUpdates", "getChatMessageUpdates", "publicRoomId", "getChatRoomUpdates", "getChatStateUpdates", "getChatTypingUpdates", "rateSupportChat", "rate", "", "comment", "readChatMessage", "roomId", "requestChatClientManagerOnline", "Lcom/iqoption/core/microservices/chat/response/ChatDataResponse;", "Lcom/iqoption/core/microservices/chat/response/ChatClientManager;", "clientManagerId", "requestChatMessage", "Lcom/iqoption/core/microservices/chat/response/ChatListResponse;", "timestamp", "", "limit", "requestChatMessageSuggestions", "Lcom/iqoption/core/microservices/chat/response/ChatSuggestions;", "requestChatMissingMessage", "fromId", "toId", "requestChatRoom", "requestChatState", "resolveChatSupport", "isResolved", "", "sendChatHeartbeat", "Lcom/iqoption/core/microservices/chat/response/ChatHeartbeat;", "sendChatMessage", "requestId", "text", "attachments", "suggestionId", "sendChatTextTyping", "sendChatTyping", "DocumentChatClientManagerOnlineChanged", "DocumentChatMessageGenerated", "DocumentChatRoomGenerated", "DocumentChatStateUpdated", "DocumentChatTyping", "core_release"})
/* compiled from: ChatRequests.kt */
public final class a {
    static final /* synthetic */ kotlin.reflect.j[] anY = new kotlin.reflect.j[]{kotlin.jvm.internal.k.a(new PropertyReference1Impl(kotlin.jvm.internal.k.G(a.class), "chatMessageStream", "getChatMessageStream()Lio/reactivex/Flowable;")), kotlin.jvm.internal.k.a(new PropertyReference1Impl(kotlin.jvm.internal.k.G(a.class), "chatTypingStream", "getChatTypingStream()Lio/reactivex/Flowable;")), kotlin.jvm.internal.k.a(new PropertyReference1Impl(kotlin.jvm.internal.k.G(a.class), "chatRoomStream", "getChatRoomStream()Lio/reactivex/Flowable;")), kotlin.jvm.internal.k.a(new PropertyReference1Impl(kotlin.jvm.internal.k.G(a.class), "chatStateStream", "getChatStateStream()Lio/reactivex/Flowable;")), kotlin.jvm.internal.k.a(new PropertyReference1Impl(kotlin.jvm.internal.k.G(a.class), "chatClientManagerOnlineStream", "getChatClientManagerOnlineStream()Lio/reactivex/Flowable;"))};
    private static final kotlin.d bpu = g.c(ChatRequests$chatMessageStream$2.bpC);
    private static final kotlin.d bpv = g.c(ChatRequests$chatTypingStream$2.bpI);
    private static final kotlin.d bpw = g.c(ChatRequests$chatRoomStream$2.bpE);
    private static final kotlin.d bpx = g.c(ChatRequests$chatStateStream$2.bpG);
    private static final kotlin.d bpy = g.c(ChatRequests$chatClientManagerOnlineStream$2.bpA);
    public static final a bpz = new a();

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, bng = {"Lcom/iqoption/core/microservices/chat/ChatRequests$DocumentChatClientManagerOnlineChanged;", "Lcom/iqoption/core/microservices/chat/event/ChatEvent;", "Lcom/iqoption/core/microservices/chat/event/ChatClientManagerOnlineChanged;", "()V", "core_release"})
    /* compiled from: ChatRequests.kt */
    private static final class a extends com.iqoption.core.microservices.chat.a.b<com.iqoption.core.microservices.chat.a.a> {
        public a() {
            super(com.iqoption.core.microservices.chat.a.a.bpP.abM());
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, bng = {"Lcom/iqoption/core/microservices/chat/ChatRequests$DocumentChatStateUpdated;", "Lcom/iqoption/core/microservices/chat/event/ChatEvent;", "Lcom/iqoption/core/microservices/chat/response/ChatState;", "()V", "core_release"})
    /* compiled from: ChatRequests.kt */
    private static final class d extends com.iqoption.core.microservices.chat.a.b<com.iqoption.core.microservices.chat.response.l> {
        public d() {
            super(com.iqoption.core.microservices.chat.response.l.bqX.acG());
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, bng = {"Lcom/iqoption/core/microservices/chat/ChatRequests$DocumentChatTyping;", "Lcom/iqoption/core/microservices/chat/event/ChatEvent;", "Lcom/iqoption/core/microservices/chat/event/ChatTypingInfo;", "()V", "core_release"})
    /* compiled from: ChatRequests.kt */
    private static final class e extends com.iqoption.core.microservices.chat.a.b<com.iqoption.core.microservices.chat.a.d> {
        public e() {
            super(com.iqoption.core.microservices.chat.a.d.bpT.abP());
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "Lcom/iqoption/core/microservices/chat/response/ChatMessage;", "it", "Lcom/iqoption/core/microservices/chat/ChatRequests$DocumentChatMessageGenerated;", "apply"})
    /* compiled from: ChatRequests.kt */
    static final class f<T, R> implements io.reactivex.b.g<T, R> {
        public static final f bpK = new f();

        f() {
        }

        /* renamed from: a */
        public final List<com.iqoption.core.microservices.chat.response.e> apply(b bVar) {
            kotlin.jvm.internal.i.f(bVar, "it");
            return (List) bVar.getData();
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "", "Lcom/iqoption/core/microservices/chat/response/ChatMessage;", "test"})
    /* compiled from: ChatRequests.kt */
    static final class g<T> implements io.reactivex.b.l<List<? extends com.iqoption.core.microservices.chat.response.e>> {
        final /* synthetic */ String bpL;

        g(String str) {
            this.bpL = str;
        }

        /* renamed from: av */
        public final boolean test(List<com.iqoption.core.microservices.chat.response.e> list) {
            kotlin.jvm.internal.i.f(list, "it");
            com.iqoption.core.microservices.chat.response.e eVar = (com.iqoption.core.microservices.chat.response.e) u.bV(list);
            return kotlin.jvm.internal.i.y(eVar != null ? eVar.SJ() : null, this.bpL);
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, bng = {"<anonymous>", "Lcom/iqoption/core/microservices/chat/event/ChatTypingInfo;", "it", "Lcom/iqoption/core/microservices/chat/ChatRequests$DocumentChatTyping;", "apply"})
    /* compiled from: ChatRequests.kt */
    static final class h<T, R> implements io.reactivex.b.g<T, R> {
        public static final h bpM = new h();

        h() {
        }

        /* renamed from: a */
        public final com.iqoption.core.microservices.chat.a.d apply(e eVar) {
            kotlin.jvm.internal.i.f(eVar, "it");
            return (com.iqoption.core.microservices.chat.a.d) eVar.getData();
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, bng = {"<anonymous>", "", "it", "Lcom/iqoption/core/microservices/chat/event/ChatTypingInfo;", "test"})
    /* compiled from: ChatRequests.kt */
    static final class i<T> implements io.reactivex.b.l<com.iqoption.core.microservices.chat.a.d> {
        final /* synthetic */ String bpL;

        i(String str) {
            this.bpL = str;
        }

        /* renamed from: e */
        public final boolean test(com.iqoption.core.microservices.chat.a.d dVar) {
            kotlin.jvm.internal.i.f(dVar, "it");
            return kotlin.jvm.internal.i.y(dVar.SJ(), this.bpL);
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0003"}, bng = {"com/iqoption/core/ext/GsonExt$typeOf$1", "Lcom/google/gson/reflect/TypeToken;", "core_release", "com/iqoption/core/microservices/chat/ChatRequests$create$$inlined$typeOf$2"})
    /* compiled from: GsonExtensions.kt */
    public static final class j extends TypeToken<com.iqoption.core.microservices.chat.response.d<? extends com.iqoption.core.microservices.chat.response.e>> {
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0003"}, bng = {"com/iqoption/core/ext/GsonExt$typeOf$1", "Lcom/google/gson/reflect/TypeToken;", "core_release", "com/iqoption/core/microservices/chat/ChatRequests$create$$inlined$typeOf$6"})
    /* compiled from: GsonExtensions.kt */
    public static final class k extends TypeToken<com.iqoption.core.microservices.chat.response.c<? extends com.iqoption.core.microservices.chat.response.n>> {
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0003"}, bng = {"com/iqoption/core/ext/GsonExt$typeOf$1", "Lcom/google/gson/reflect/TypeToken;", "core_release", "com/iqoption/core/microservices/chat/ChatRequests$create$$inlined$typeOf$3"})
    /* compiled from: GsonExtensions.kt */
    public static final class l extends TypeToken<com.iqoption.core.microservices.chat.response.d<? extends com.iqoption.core.microservices.chat.response.e>> {
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0003"}, bng = {"com/iqoption/core/ext/GsonExt$typeOf$1", "Lcom/google/gson/reflect/TypeToken;", "core_release", "com/iqoption/core/microservices/chat/ChatRequests$create$$inlined$typeOf$4"})
    /* compiled from: GsonExtensions.kt */
    public static final class m extends TypeToken<com.iqoption.core.microservices.chat.response.d<? extends com.iqoption.core.microservices.chat.response.k>> {
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0003"}, bng = {"com/iqoption/core/ext/GsonExt$typeOf$1", "Lcom/google/gson/reflect/TypeToken;", "core_release", "com/iqoption/core/microservices/chat/ChatRequests$create$$inlined$typeOf$5"})
    /* compiled from: GsonExtensions.kt */
    public static final class n extends TypeToken<com.iqoption.core.microservices.chat.response.c<? extends com.iqoption.core.microservices.chat.response.l>> {
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0003"}, bng = {"com/iqoption/core/ext/GsonExt$typeOf$1", "Lcom/google/gson/reflect/TypeToken;", "core_release", "com/iqoption/core/microservices/chat/ChatRequests$create$$inlined$typeOf$7"})
    /* compiled from: GsonExtensions.kt */
    public static final class o extends TypeToken<com.iqoption.core.microservices.chat.response.c<? extends com.iqoption.core.microservices.chat.response.e>> {
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, bng = {"Lcom/iqoption/core/microservices/chat/ChatRequests$DocumentChatMessageGenerated;", "Lcom/iqoption/core/microservices/chat/event/ChatListEvent;", "Lcom/iqoption/core/microservices/chat/response/ChatMessage;", "()V", "core_release"})
    /* compiled from: ChatRequests.kt */
    private static final class b extends com.iqoption.core.microservices.chat.a.c<com.iqoption.core.microservices.chat.response.e> {
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, bng = {"Lcom/iqoption/core/microservices/chat/ChatRequests$DocumentChatRoomGenerated;", "Lcom/iqoption/core/microservices/chat/event/ChatListEvent;", "Lcom/iqoption/core/microservices/chat/response/ChatRoom;", "()V", "core_release"})
    /* compiled from: ChatRequests.kt */
    private static final class c extends com.iqoption.core.microservices.chat.a.c<com.iqoption.core.microservices.chat.response.k> {
    }

    private final io.reactivex.e<List<com.iqoption.core.microservices.chat.response.e>> abC() {
        kotlin.d dVar = bpu;
        kotlin.reflect.j jVar = anY[0];
        return (io.reactivex.e) dVar.getValue();
    }

    private final io.reactivex.e<com.iqoption.core.microservices.chat.a.d> abE() {
        kotlin.d dVar = bpv;
        kotlin.reflect.j jVar = anY[1];
        return (io.reactivex.e) dVar.getValue();
    }

    private final io.reactivex.e<List<com.iqoption.core.microservices.chat.response.k>> abG() {
        kotlin.d dVar = bpw;
        kotlin.reflect.j jVar = anY[2];
        return (io.reactivex.e) dVar.getValue();
    }

    private final io.reactivex.e<com.iqoption.core.microservices.chat.response.l> abI() {
        kotlin.d dVar = bpx;
        kotlin.reflect.j jVar = anY[3];
        return (io.reactivex.e) dVar.getValue();
    }

    private a() {
    }

    public final p<com.iqoption.core.microservices.chat.response.j> c(String str, int i, String str2) {
        kotlin.jvm.internal.i.f(str, "messageId");
        return com.iqoption.core.d.EV().a("rate-support-chat", com.iqoption.core.microservices.chat.response.j.class).k("message_id", str).k("rate", Integer.valueOf(i)).k("comment", str2).UB();
    }

    public final p<com.iqoption.core.microservices.chat.response.j> gl(String str) {
        kotlin.jvm.internal.i.f(str, "roomId");
        return com.iqoption.core.d.EV().a("read-chat-message", com.iqoption.core.microservices.chat.response.j.class).k("room_id", str).UB();
    }

    public final p<com.iqoption.core.microservices.chat.response.j> gm(String str) {
        kotlin.jvm.internal.i.f(str, "messageId");
        return com.iqoption.core.d.EV().a("deny-chat-support-bot", com.iqoption.core.microservices.chat.response.j.class).k("message_id", str).UB();
    }

    public final p<com.iqoption.core.microservices.chat.response.j> p(String str, boolean z) {
        kotlin.jvm.internal.i.f(str, "messageId");
        return com.iqoption.core.d.EV().a("resolve-chat-support", com.iqoption.core.microservices.chat.response.j.class).k("message_id", str).k("is_resolved", Boolean.valueOf(z)).UB();
    }

    public final p<com.iqoption.core.microservices.chat.response.d<com.iqoption.core.microservices.chat.response.e>> b(String str, long j, int i) {
        kotlin.jvm.internal.i.f(str, "roomId");
        com.iqoption.core.connect.k EV = com.iqoption.core.d.EV();
        Type type = new j().getType();
        kotlin.jvm.internal.i.e(type, "object : TypeToken<T>() {}.type");
        return EV.a("request-chat-message", type).k("room_id", str).k("timestamp", Long.valueOf(j)).k(Order.LIMIT, Integer.valueOf(i)).UB();
    }

    public final p<com.iqoption.core.microservices.chat.response.d<com.iqoption.core.microservices.chat.response.e>> b(String str, String str2, String str3, int i) {
        kotlin.jvm.internal.i.f(str, "roomId");
        kotlin.jvm.internal.i.f(str2, "fromId");
        kotlin.jvm.internal.i.f(str3, "toId");
        com.iqoption.core.connect.k EV = com.iqoption.core.d.EV();
        Type type = new l().getType();
        kotlin.jvm.internal.i.e(type, "object : TypeToken<T>() {}.type");
        return EV.a("request-chat-missing-message", type).k("room_id", str).k("from_id", str2).k("to_id", str3).k(Order.LIMIT, Integer.valueOf(i)).UB();
    }

    public final p<com.iqoption.core.microservices.chat.response.d<com.iqoption.core.microservices.chat.response.k>> abA() {
        com.iqoption.core.connect.k EV = com.iqoption.core.d.EV();
        Type type = new m().getType();
        kotlin.jvm.internal.i.e(type, "object : TypeToken<T>() {}.type");
        return EV.a("request-chat-room", type).UB();
    }

    public final p<com.iqoption.core.microservices.chat.response.c<com.iqoption.core.microservices.chat.response.l>> abB() {
        com.iqoption.core.connect.k EV = com.iqoption.core.d.EV();
        Type type = new n().getType();
        kotlin.jvm.internal.i.e(type, "object : TypeToken<T>() {}.type");
        return EV.a("request-chat-state", type).UB();
    }

    public final p<com.iqoption.core.microservices.chat.response.c<com.iqoption.core.microservices.chat.response.n>> gn(String str) {
        kotlin.jvm.internal.i.f(str, "roomId");
        com.iqoption.core.connect.k EV = com.iqoption.core.d.EV();
        Type type = new k().getType();
        kotlin.jvm.internal.i.e(type, "object : TypeToken<T>() {}.type");
        return EV.a("request-chat-message-suggestions", type).k("room_id", str).UB();
    }

    public static /* synthetic */ p a(a aVar, String str, String str2, String str3, List list, String str4, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = UUID.randomUUID().toString();
            kotlin.jvm.internal.i.e(str2, "UUID.randomUUID().toString()");
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            str3 = (String) null;
        }
        String str6 = str3;
        if ((i & 8) != 0) {
            list = (List) null;
        }
        List list2 = list;
        if ((i & 16) != 0) {
            str4 = (String) null;
        }
        return aVar.a(str, str5, str6, list2, str4);
    }

    public final p<com.iqoption.core.microservices.chat.response.c<com.iqoption.core.microservices.chat.response.e>> a(String str, String str2, String str3, List<String> list, String str4) {
        kotlin.jvm.internal.i.f(str, "roomId");
        kotlin.jvm.internal.i.f(str2, "requestId");
        com.iqoption.core.connect.k EV = com.iqoption.core.d.EV();
        Type type = new o().getType();
        kotlin.jvm.internal.i.e(type, "object : TypeToken<T>() {}.type");
        com.iqoption.core.connect.j k = EV.a("send-chat-message", type).eG(0).k("room_id", str).k("request_id", str2).k("text", str3).k("attachments", list).k("suggestion_id", str4);
        com.iqoption.core.microservices.features.a.a ei = com.iqoption.core.d.EH().ei("support-bot");
        return k.k("use_bot", ei != null ? Boolean.valueOf(ei.isEnabled()) : null).UB();
    }

    public final p<com.iqoption.core.microservices.chat.response.j> al(String str, String str2) {
        kotlin.jvm.internal.i.f(str, "roomId");
        String str3 = "text";
        kotlin.jvm.internal.i.f(str2, str3);
        return com.iqoption.core.d.EV().a("send-chat-text-typing", com.iqoption.core.microservices.chat.response.j.class).k("room_id", str).k(str3, str2).UB();
    }

    public final p<com.iqoption.core.microservices.chat.response.j> go(String str) {
        kotlin.jvm.internal.i.f(str, "roomId");
        return com.iqoption.core.d.EV().a("send-chat-typing", com.iqoption.core.microservices.chat.response.j.class).k("room_id", str).UB();
    }

    public final io.reactivex.e<List<com.iqoption.core.microservices.chat.response.e>> abD() {
        io.reactivex.e abC = abC();
        kotlin.jvm.internal.i.e(abC, "chatMessageStream");
        return abC;
    }

    public final io.reactivex.e<List<com.iqoption.core.microservices.chat.response.e>> gp(String str) {
        kotlin.jvm.internal.i.f(str, "publicRoomId");
        io.reactivex.e blb = com.iqoption.core.d.EW().b("chat-message-public-generated", b.class).i("room_id", str).HO().HQ().g(f.bpK).b((io.reactivex.b.l) new g(str)).blb();
        kotlin.jvm.internal.i.e(blb, "eventBuilderFactory\n    …\n                .share()");
        return blb;
    }

    public final io.reactivex.e<com.iqoption.core.microservices.chat.a.d> abF() {
        io.reactivex.e abE = abE();
        kotlin.jvm.internal.i.e(abE, "chatTypingStream");
        return abE;
    }

    public final io.reactivex.e<com.iqoption.core.microservices.chat.a.d> gq(String str) {
        kotlin.jvm.internal.i.f(str, "publicRoomId");
        io.reactivex.e blb = com.iqoption.core.d.EW().b("chat-public-typing", e.class).i("room_id", str).HO().HQ().g(h.bpM).b((io.reactivex.b.l) new i(str)).blb();
        kotlin.jvm.internal.i.e(blb, "eventBuilderFactory\n    …\n                .share()");
        return blb;
    }

    public final io.reactivex.e<List<com.iqoption.core.microservices.chat.response.k>> abH() {
        io.reactivex.e abG = abG();
        kotlin.jvm.internal.i.e(abG, "chatRoomStream");
        return abG;
    }

    public final io.reactivex.e<com.iqoption.core.microservices.chat.response.l> abJ() {
        io.reactivex.e abI = abI();
        kotlin.jvm.internal.i.e(abI, "chatStateStream");
        return abI;
    }
}
