package com.iqoption.core.microservices.chat.response;

import com.google.gson.JsonElement;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.d;
import kotlin.i;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.k;
import kotlin.reflect.j;

@i(bne = {1, 1, 15}, bnf = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0010\b\n\u0002\b\u0003\b\b\u0018\u0000 u2\u00020\u0001:\u0001uB\u0007\b\u0016¢\u0006\u0002\u0010\u0002B\u0002\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u0004\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0018\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0018\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0018\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0018\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0018\u0012\u0010\b\u0002\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u001f\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\"J\t\u0010W\u001a\u00020\u0004HÆ\u0003J\u000b\u0010X\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010Y\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010Z\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010[\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\\\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010]\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010^\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\t\u0010_\u001a\u00020\u0018HÆ\u0003J\t\u0010`\u001a\u00020\u0018HÆ\u0003J\t\u0010a\u001a\u00020\u0018HÆ\u0003J\t\u0010b\u001a\u00020\u0004HÆ\u0003J\t\u0010c\u001a\u00020\u000eHÆ\u0003J\t\u0010d\u001a\u00020\u0018HÆ\u0003J\t\u0010e\u001a\u00020\u0018HÆ\u0003J\u0011\u0010f\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u001fHÆ\u0003J\u000b\u0010g\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\t\u0010h\u001a\u00020\u0004HÆ\u0003J\t\u0010i\u001a\u00020\bHÆ\u0003J\u000b\u0010j\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010k\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\t\u0010l\u001a\u00020\u0004HÆ\u0003J\t\u0010m\u001a\u00020\u000eHÆ\u0003J\u000b\u0010n\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u0002\u0010o\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001a\u001a\u00020\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u000e2\b\b\u0002\u0010\u001c\u001a\u00020\u00182\b\b\u0002\u0010\u001d\u001a\u00020\u00182\u0010\b\u0002\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u001f2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\u0013\u0010p\u001a\u00020\u00182\b\u0010q\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010r\u001a\u00020sHÖ\u0001J\t\u0010t\u001a\u00020\u0004HÖ\u0001R\u001e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u001f8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0016\u0010\u001d\u001a\u00020\u00188\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u001b\u0010'\u001a\u00020(8FX\u0002¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b)\u0010*R\u0016\u0010\u001b\u001a\u00020\u000e8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0016\u0010\u0019\u001a\u00020\u00188\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010&R\u0016\u0010\u001a\u001a\u00020\u00188\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010&R\u0011\u00101\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\b1\u0010&R\u0016\u0010\u0017\u001a\u00020\u00188\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010&R\u0018\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u0018\u0010!\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b4\u00100R\u001b\u00105\u001a\u0002068FX\u0002¢\u0006\f\n\u0004\b9\u0010,\u001a\u0004\b7\u00108R\u0016\u0010\u001c\u001a\u00020\u00188\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b:\u0010&R\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b;\u00100R\u0016\u0010\u0006\u001a\u00020\u00048\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b<\u00100R\u0016\u0010\f\u001a\u00020\u00048\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b=\u00100R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b>\u00100R\u001e\u0010\u0013\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b?\u0010\u0002\u001a\u0004\b@\u00100R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\bA\u00100R\u001e\u0010\u0012\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bB\u0010\u0002\u001a\u0004\bC\u00100R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\bD\u00100R\u001e\u0010\u0011\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bE\u0010\u0002\u001a\u0004\bF\u00100R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\bG\u00100R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\bH\u00100R\u0016\u0010\r\u001a\u00020\u000e8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\bI\u0010.R\u001b\u0010J\u001a\u00020K8FX\u0002¢\u0006\f\n\u0004\bN\u0010,\u001a\u0004\bL\u0010MR\u0018\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\bO\u00100R\u001b\u0010P\u001a\u00020Q8FX\u0002¢\u0006\f\n\u0004\bT\u0010,\u001a\u0004\bR\u0010SR\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\bU\u0010V¨\u0006v"}, bng = {"Lcom/iqoption/core/microservices/chat/response/ChatMessage;", "", "()V", "id", "", "requestId", "roomId", "type", "Lcom/iqoption/core/microservices/chat/response/ChatMessageType;", "text", "options", "Lcom/google/gson/JsonElement;", "sender", "senderId", "", "senderFlag", "senderCountryId", "senderAvatarUrl", "senderAvatar68Url", "senderAvatar110Url", "senderAvatarPath", "senderAvatar68Path", "senderAvatar110Path", "isSenderVip", "", "isSenderAdmin", "isSenderSystem", "date", "removed", "author_only", "attachments", "", "Lcom/iqoption/core/microservices/chat/response/ChatAttachment;", "previousId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/iqoption/core/microservices/chat/response/ChatMessageType;Ljava/lang/String;Lcom/google/gson/JsonElement;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZJZZLjava/util/List;Ljava/lang/String;)V", "getAttachments", "()Ljava/util/List;", "getAuthor_only", "()Z", "closedAdapter", "Lcom/iqoption/core/microservices/chat/response/ChatMessageClosedAdapter;", "getClosedAdapter", "()Lcom/iqoption/core/microservices/chat/response/ChatMessageClosedAdapter;", "closedAdapter$delegate", "Lkotlin/Lazy;", "getDate", "()J", "getId", "()Ljava/lang/String;", "isSenderUser", "getOptions", "()Lcom/google/gson/JsonElement;", "getPreviousId", "rateAdapter", "Lcom/iqoption/core/microservices/chat/response/ChatMessageRateAdapter;", "getRateAdapter", "()Lcom/iqoption/core/microservices/chat/response/ChatMessageRateAdapter;", "rateAdapter$delegate", "getRemoved", "getRequestId", "getRoomId", "getSender", "getSenderAvatar110Path", "senderAvatar110Url$annotations", "getSenderAvatar110Url", "getSenderAvatar68Path", "senderAvatar68Url$annotations", "getSenderAvatar68Url", "getSenderAvatarPath", "senderAvatarUrl$annotations", "getSenderAvatarUrl", "getSenderCountryId", "getSenderFlag", "getSenderId", "suggestionsAdapter", "Lcom/iqoption/core/microservices/chat/response/ChatMessageSuggestionsAdapter;", "getSuggestionsAdapter", "()Lcom/iqoption/core/microservices/chat/response/ChatMessageSuggestionsAdapter;", "suggestionsAdapter$delegate", "getText", "transferAdapter", "Lcom/iqoption/core/microservices/chat/response/ChatMessageTransferAdapter;", "getTransferAdapter", "()Lcom/iqoption/core/microservices/chat/response/ChatMessageTransferAdapter;", "transferAdapter$delegate", "getType", "()Lcom/iqoption/core/microservices/chat/response/ChatMessageType;", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "", "toString", "Companion", "core_release"})
/* compiled from: ChatMessage.kt */
public final class e {
    static final /* synthetic */ j[] anY = new j[]{k.a(new PropertyReference1Impl(k.G(e.class), "rateAdapter", "getRateAdapter()Lcom/iqoption/core/microservices/chat/response/ChatMessageRateAdapter;")), k.a(new PropertyReference1Impl(k.G(e.class), "suggestionsAdapter", "getSuggestionsAdapter()Lcom/iqoption/core/microservices/chat/response/ChatMessageSuggestionsAdapter;")), k.a(new PropertyReference1Impl(k.G(e.class), "closedAdapter", "getClosedAdapter()Lcom/iqoption/core/microservices/chat/response/ChatMessageClosedAdapter;")), k.a(new PropertyReference1Impl(k.G(e.class), "transferAdapter", "getTransferAdapter()Lcom/iqoption/core/microservices/chat/response/ChatMessageTransferAdapter;"))};
    private static final d bqw = g.c(ChatMessage$Companion$EMPTY$2.bqy);
    public static final a bqx = new a();
    @SerializedName("date")
    private final long aSH;
    @SerializedName("room_id")
    private final String bpQ;
    private final d bpY;
    private final d bpZ;
    private final d bqa;
    private final d bqb;
    @SerializedName("request_id")
    private final String bqc;
    @SerializedName("type")
    private final ChatMessageType bqd;
    @SerializedName("options")
    private final JsonElement bqe;
    @SerializedName("sender")
    private final String bqf;
    @SerializedName("sender_id")
    private final long bqg;
    @SerializedName("sender_flag")
    private final String bqh;
    @SerializedName("sender_country_id")
    private final String bqi;
    @SerializedName("sender_avatar_url")
    private final String bqj;
    @SerializedName("sender_avatar_68_url")
    private final String bqk;
    @SerializedName("sender_avatar_110_url")
    private final String bql;
    @SerializedName("sender_avatar_path")
    private final String bqm;
    @SerializedName("sender_avatar_68_path")
    private final String bqn;
    @SerializedName("sender_avatar_110_path")
    private final String bqo;
    @SerializedName("is_sender_vip")
    private final boolean bqp;
    @SerializedName("is_sender_admin")
    private final boolean bqq;
    @SerializedName("is_sender_system")
    private final boolean bqr;
    @SerializedName("removed")
    private final boolean bqs;
    @SerializedName("author_only")
    private final boolean bqt;
    @SerializedName("attachments")
    private final List<a> bqu;
    @SerializedName("previous_id")
    private final String bqv;
    @SerializedName("id")
    private final String id;
    @SerializedName("text")
    private final String text;

    @i(bne = {1, 1, 15}, bnf = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001b\u0010\u0003\u001a\u00020\u00048FX\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\t\u001a\u00020\nXT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fXT¢\u0006\u0002\n\u0000¨\u0006\r"}, bng = {"Lcom/iqoption/core/microservices/chat/response/ChatMessage$Companion;", "", "()V", "EMPTY", "Lcom/iqoption/core/microservices/chat/response/ChatMessage;", "getEMPTY", "()Lcom/iqoption/core/microservices/chat/response/ChatMessage;", "EMPTY$delegate", "Lkotlin/Lazy;", "NO_ID", "", "SENDER_ID_SYSTEM", "", "core_release"})
    /* compiled from: ChatMessage.kt */
    public static final class a {
        static final /* synthetic */ j[] anY = new j[]{k.a(new PropertyReference1Impl(k.G(a.class), "EMPTY", "getEMPTY()Lcom/iqoption/core/microservices/chat/response/ChatMessage;"))};

        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }
    }

    public final g abV() {
        d dVar = this.bpY;
        j jVar = anY[0];
        return (g) dVar.getValue();
    }

    public final h abW() {
        d dVar = this.bpZ;
        j jVar = anY[1];
        return (h) dVar.getValue();
    }

    public final f abX() {
        d dVar = this.bqa;
        j jVar = anY[2];
        return (f) dVar.getValue();
    }

    public final i abY() {
        d dVar = this.bqb;
        j jVar = anY[3];
        return (i) dVar.getValue();
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof e) {
                e eVar = (e) obj;
                if (kotlin.jvm.internal.i.y(this.id, eVar.id) && kotlin.jvm.internal.i.y(this.bqc, eVar.bqc) && kotlin.jvm.internal.i.y(this.bpQ, eVar.bpQ) && kotlin.jvm.internal.i.y(this.bqd, eVar.bqd) && kotlin.jvm.internal.i.y(this.text, eVar.text) && kotlin.jvm.internal.i.y(this.bqe, eVar.bqe) && kotlin.jvm.internal.i.y(this.bqf, eVar.bqf)) {
                    if ((this.bqg == eVar.bqg ? 1 : null) != null && kotlin.jvm.internal.i.y(this.bqh, eVar.bqh) && kotlin.jvm.internal.i.y(this.bqi, eVar.bqi) && kotlin.jvm.internal.i.y(this.bqj, eVar.bqj) && kotlin.jvm.internal.i.y(this.bqk, eVar.bqk) && kotlin.jvm.internal.i.y(this.bql, eVar.bql) && kotlin.jvm.internal.i.y(this.bqm, eVar.bqm) && kotlin.jvm.internal.i.y(this.bqn, eVar.bqn) && kotlin.jvm.internal.i.y(this.bqo, eVar.bqo)) {
                        if ((this.bqp == eVar.bqp ? 1 : null) != null) {
                            if ((this.bqq == eVar.bqq ? 1 : null) != null) {
                                if ((this.bqr == eVar.bqr ? 1 : null) != null) {
                                    if ((this.aSH == eVar.aSH ? 1 : null) != null) {
                                        if ((this.bqs == eVar.bqs ? 1 : null) != null) {
                                            if (!((this.bqt == eVar.bqt ? 1 : null) != null && kotlin.jvm.internal.i.y(this.bqu, eVar.bqu) && kotlin.jvm.internal.i.y(this.bqv, eVar.bqv))) {
                                                return false;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.id;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.bqc;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        str2 = this.bpQ;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        ChatMessageType chatMessageType = this.bqd;
        hashCode = (hashCode + (chatMessageType != null ? chatMessageType.hashCode() : 0)) * 31;
        str2 = this.text;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        JsonElement jsonElement = this.bqe;
        hashCode = (hashCode + (jsonElement != null ? jsonElement.hashCode() : 0)) * 31;
        str2 = this.bqf;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        long j = this.bqg;
        hashCode = (hashCode + ((int) (j ^ (j >>> 32)))) * 31;
        str2 = this.bqh;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        str2 = this.bqi;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        str2 = this.bqj;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        str2 = this.bqk;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        str2 = this.bql;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        str2 = this.bqm;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        str2 = this.bqn;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        str2 = this.bqo;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        int i2 = this.bqp;
        if (i2 != 0) {
            i2 = 1;
        }
        hashCode = (hashCode + i2) * 31;
        i2 = this.bqq;
        if (i2 != 0) {
            i2 = 1;
        }
        hashCode = (hashCode + i2) * 31;
        i2 = this.bqr;
        if (i2 != 0) {
            i2 = 1;
        }
        hashCode = (hashCode + i2) * 31;
        long j2 = this.aSH;
        hashCode = (hashCode + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        i2 = this.bqs;
        if (i2 != 0) {
            i2 = 1;
        }
        hashCode = (hashCode + i2) * 31;
        i2 = this.bqt;
        if (i2 != 0) {
            i2 = 1;
        }
        hashCode = (hashCode + i2) * 31;
        List list = this.bqu;
        hashCode = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        str2 = this.bqv;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ChatMessage(id=");
        stringBuilder.append(this.id);
        stringBuilder.append(", requestId=");
        stringBuilder.append(this.bqc);
        stringBuilder.append(", roomId=");
        stringBuilder.append(this.bpQ);
        stringBuilder.append(", type=");
        stringBuilder.append(this.bqd);
        stringBuilder.append(", text=");
        stringBuilder.append(this.text);
        stringBuilder.append(", options=");
        stringBuilder.append(this.bqe);
        stringBuilder.append(", sender=");
        stringBuilder.append(this.bqf);
        stringBuilder.append(", senderId=");
        stringBuilder.append(this.bqg);
        stringBuilder.append(", senderFlag=");
        stringBuilder.append(this.bqh);
        stringBuilder.append(", senderCountryId=");
        stringBuilder.append(this.bqi);
        stringBuilder.append(", senderAvatarUrl=");
        stringBuilder.append(this.bqj);
        stringBuilder.append(", senderAvatar68Url=");
        stringBuilder.append(this.bqk);
        stringBuilder.append(", senderAvatar110Url=");
        stringBuilder.append(this.bql);
        stringBuilder.append(", senderAvatarPath=");
        stringBuilder.append(this.bqm);
        stringBuilder.append(", senderAvatar68Path=");
        stringBuilder.append(this.bqn);
        stringBuilder.append(", senderAvatar110Path=");
        stringBuilder.append(this.bqo);
        stringBuilder.append(", isSenderVip=");
        stringBuilder.append(this.bqp);
        stringBuilder.append(", isSenderAdmin=");
        stringBuilder.append(this.bqq);
        stringBuilder.append(", isSenderSystem=");
        stringBuilder.append(this.bqr);
        stringBuilder.append(", date=");
        stringBuilder.append(this.aSH);
        stringBuilder.append(", removed=");
        stringBuilder.append(this.bqs);
        stringBuilder.append(", author_only=");
        stringBuilder.append(this.bqt);
        stringBuilder.append(", attachments=");
        stringBuilder.append(this.bqu);
        stringBuilder.append(", previousId=");
        stringBuilder.append(this.bqv);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public e(String str, String str2, String str3, ChatMessageType chatMessageType, String str4, JsonElement jsonElement, String str5, long j, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, boolean z, boolean z2, boolean z3, long j2, boolean z4, boolean z5, List<a> list, String str14) {
        String str15 = str;
        String str16 = str2;
        String str17 = str3;
        ChatMessageType chatMessageType2 = chatMessageType;
        String str18 = str5;
        kotlin.jvm.internal.i.f(str, "id");
        kotlin.jvm.internal.i.f(str2, "requestId");
        kotlin.jvm.internal.i.f(str3, "roomId");
        kotlin.jvm.internal.i.f(chatMessageType, "type");
        kotlin.jvm.internal.i.f(str5, "sender");
        this.id = str15;
        this.bqc = str16;
        this.bpQ = str17;
        this.bqd = chatMessageType2;
        this.text = str4;
        this.bqe = jsonElement;
        this.bqf = str18;
        this.bqg = j;
        this.bqh = str6;
        this.bqi = str7;
        this.bqj = str8;
        this.bqk = str9;
        this.bql = str10;
        this.bqm = str11;
        this.bqn = str12;
        this.bqo = str13;
        this.bqp = z;
        this.bqq = z2;
        this.bqr = z3;
        this.aSH = j2;
        this.bqs = z4;
        this.bqt = z5;
        this.bqu = list;
        this.bqv = str14;
        this.bpY = g.c(new ChatMessage$rateAdapter$2(this));
        this.bpZ = g.c(new ChatMessage$suggestionsAdapter$2(this));
        this.bqa = g.c(new ChatMessage$closedAdapter$2(this));
        this.bqb = g.c(new ChatMessage$transferAdapter$2(this));
    }

    public final String getId() {
        return this.id;
    }

    public final String SJ() {
        return this.bpQ;
    }

    public /* synthetic */ e(String str, String str2, String str3, ChatMessageType chatMessageType, String str4, JsonElement jsonElement, String str5, long j, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, boolean z, boolean z2, boolean z3, long j2, boolean z4, boolean z5, List list, String str14, int i, f fVar) {
        int i2 = i;
        String str15 = (i2 & 1) != 0 ? "0" : str;
        String str16 = "";
        String str17 = (i2 & 2) != 0 ? str16 : str2;
        String str18 = (i2 & 4) != 0 ? str16 : str3;
        ChatMessageType chatMessageType2 = (i2 & 8) != 0 ? ChatMessageType.TEXT : chatMessageType;
        String str19 = (i2 & 16) != 0 ? (String) null : str4;
        JsonElement jsonElement2 = (i2 & 32) != 0 ? (JsonElement) null : jsonElement;
        if ((i2 & 64) == 0) {
            str16 = str5;
        }
        long j3 = (i2 & 128) != 0 ? 0 : j;
        String str20 = (i2 & 256) != 0 ? (String) null : str6;
        String str21 = (i2 & 512) != 0 ? (String) null : str7;
        String str22 = (i2 & 1024) != 0 ? (String) null : str8;
        String str23 = (i2 & 2048) != 0 ? (String) null : str9;
        String str24 = (i2 & 4096) != 0 ? (String) null : str10;
        String str25 = (i2 & 8192) != 0 ? (String) null : str11;
        String str26 = (i2 & 16384) != 0 ? (String) null : str12;
        String str27 = (i2 & 32768) != 0 ? (String) null : str13;
        boolean z6 = false;
        boolean z7 = (i2 & 65536) != 0 ? false : z;
        boolean z8 = (i2 & 131072) != 0 ? false : z2;
        boolean z9 = (i2 & 262144) != 0 ? false : z3;
        long j4 = (i2 & 524288) != 0 ? 0 : j2;
        boolean z10 = (i2 & 1048576) != 0 ? false : z4;
        if ((i2 & 2097152) == 0) {
            z6 = z5;
        }
        this(str15, str17, str18, chatMessageType2, str19, jsonElement2, str16, j3, str20, str21, str22, str23, str24, str25, str26, str27, z7, z8, z9, j4, z10, z6, (i2 & 4194304) != 0 ? (List) null : list, (i2 & 8388608) != 0 ? (String) null : str14);
    }

    public final ChatMessageType abZ() {
        return this.bqd;
    }

    public final String getText() {
        return this.text;
    }

    public final JsonElement aca() {
        return this.bqe;
    }

    public final String acb() {
        return this.bqf;
    }

    public final long acc() {
        return this.bqg;
    }

    public final String acd() {
        return this.bqh;
    }

    public final String ace() {
        return this.bqi;
    }

    public final String acf() {
        return this.bqm;
    }

    public final boolean acg() {
        return this.bqq;
    }

    public final boolean ach() {
        return this.bqr;
    }

    public final long getDate() {
        return this.aSH;
    }

    public final boolean aci() {
        return this.bqs;
    }

    public final boolean acj() {
        return this.bqt;
    }

    public final List<a> ack() {
        return this.bqu;
    }

    public final String acl() {
        return this.bqv;
    }

    public e() {
        this("0", null, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, false, false, false, 0, false, false, null, null, 16777214, null);
    }

    public final boolean abU() {
        return com.iqoption.core.d.EA().getUserId() == this.bqg;
    }
}
