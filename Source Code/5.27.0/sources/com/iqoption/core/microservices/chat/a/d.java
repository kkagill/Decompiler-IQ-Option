package com.iqoption.core.microservices.chat.a;

import com.google.gson.annotations.SerializedName;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\b\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0007\b\u0016¢\u0006\u0002\u0010\u0002B\u0019\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0004HÆ\u0003J\t\u0010\r\u001a\u00020\u0006HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0004HÖ\u0001R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, bng = {"Lcom/iqoption/core/microservices/chat/event/ChatTypingInfo;", "", "()V", "roomId", "", "user", "Lcom/iqoption/core/microservices/chat/event/ChatTypingUser;", "(Ljava/lang/String;Lcom/iqoption/core/microservices/chat/event/ChatTypingUser;)V", "getRoomId", "()Ljava/lang/String;", "getUser", "()Lcom/iqoption/core/microservices/chat/event/ChatTypingUser;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "core_release"})
/* compiled from: ChatTypingInfo.kt */
public final class d {
    private static final d bpS = new d();
    public static final a bpT = new a();
    @SerializedName("room_id")
    private final String bpQ;
    @SerializedName("user")
    private final e bpR;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, bng = {"Lcom/iqoption/core/microservices/chat/event/ChatTypingInfo$Companion;", "", "()V", "EMPTY", "Lcom/iqoption/core/microservices/chat/event/ChatTypingInfo;", "getEMPTY", "()Lcom/iqoption/core/microservices/chat/event/ChatTypingInfo;", "core_release"})
    /* compiled from: ChatTypingInfo.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final d abP() {
            return d.bpS;
        }
    }

    /* JADX WARNING: Missing block: B:6:0x001a, code skipped:
            if (kotlin.jvm.internal.i.y(r2.bpR, r3.bpR) != false) goto L_0x001f;
     */
    public boolean equals(java.lang.Object r3) {
        /*
        r2 = this;
        if (r2 == r3) goto L_0x001f;
    L_0x0002:
        r0 = r3 instanceof com.iqoption.core.microservices.chat.a.d;
        if (r0 == 0) goto L_0x001d;
    L_0x0006:
        r3 = (com.iqoption.core.microservices.chat.a.d) r3;
        r0 = r2.bpQ;
        r1 = r3.bpQ;
        r0 = kotlin.jvm.internal.i.y(r0, r1);
        if (r0 == 0) goto L_0x001d;
    L_0x0012:
        r0 = r2.bpR;
        r3 = r3.bpR;
        r3 = kotlin.jvm.internal.i.y(r0, r3);
        if (r3 == 0) goto L_0x001d;
    L_0x001c:
        goto L_0x001f;
    L_0x001d:
        r3 = 0;
        return r3;
    L_0x001f:
        r3 = 1;
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iqoption.core.microservices.chat.a.d.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        String str = this.bpQ;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        e eVar = this.bpR;
        if (eVar != null) {
            i = eVar.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ChatTypingInfo(roomId=");
        stringBuilder.append(this.bpQ);
        stringBuilder.append(", user=");
        stringBuilder.append(this.bpR);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public d(String str, e eVar) {
        kotlin.jvm.internal.i.f(str, "roomId");
        kotlin.jvm.internal.i.f(eVar, "user");
        this.bpQ = str;
        this.bpR = eVar;
    }

    public final String SJ() {
        return this.bpQ;
    }

    public /* synthetic */ d(String str, e eVar, int i, f fVar) {
        if ((i & 1) != 0) {
            str = "";
        }
        if ((i & 2) != 0) {
            eVar = e.bpV.abR();
        }
        this(str, eVar);
    }

    public final e abN() {
        return this.bpR;
    }

    public d() {
        this("", null, 2, null);
    }
}
