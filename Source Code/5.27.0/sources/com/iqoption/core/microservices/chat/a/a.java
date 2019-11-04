package com.iqoption.core.microservices.chat.a;

import androidx.core.app.NotificationCompat;
import com.google.gson.annotations.SerializedName;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0003\b\b\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u0007\b\u0016¢\u0006\u0002\u0010\u0002B-\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004¢\u0006\u0002\u0010\nJ\t\u0010\u0011\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0013\u001a\u00020\bHÆ\u0003J\t\u0010\u0014\u001a\u00020\u0004HÆ\u0003J1\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u0004HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0004HÖ\u0001R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\rR\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\t\u001a\u00020\u00048\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\f¨\u0006\u001c"}, bng = {"Lcom/iqoption/core/microservices/chat/event/ChatClientManagerOnlineChanged;", "", "()V", "id", "", "isOnline", "", "lastSeen", "", "status", "(Ljava/lang/String;ZJLjava/lang/String;)V", "getId", "()Ljava/lang/String;", "()Z", "getLastSeen", "()J", "getStatus", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "Companion", "core_release"})
/* compiled from: ChatClientManagerOnlineChanged.kt */
public final class a {
    private static final a bpO = new a();
    public static final a bpP = new a();
    @SerializedName("is_online")
    private final boolean asB;
    @SerializedName("last_seen")
    private final long bpN;
    @SerializedName("id")
    private final String id;
    @SerializedName("status")
    private final String status;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, bng = {"Lcom/iqoption/core/microservices/chat/event/ChatClientManagerOnlineChanged$Companion;", "", "()V", "EMPTY", "Lcom/iqoption/core/microservices/chat/event/ChatClientManagerOnlineChanged;", "getEMPTY", "()Lcom/iqoption/core/microservices/chat/event/ChatClientManagerOnlineChanged;", "core_release"})
    /* compiled from: ChatClientManagerOnlineChanged.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final a abM() {
            return a.bpO;
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (kotlin.jvm.internal.i.y(this.id, aVar.id)) {
                    if ((this.asB == aVar.asB ? 1 : null) != null) {
                        if ((this.bpN == aVar.bpN ? 1 : null) == null || !kotlin.jvm.internal.i.y(this.status, aVar.status)) {
                            return false;
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
        int i2 = this.asB;
        if (i2 != 0) {
            i2 = 1;
        }
        hashCode = (hashCode + i2) * 31;
        long j = this.bpN;
        hashCode = (hashCode + ((int) (j ^ (j >>> 32)))) * 31;
        String str2 = this.status;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ChatClientManagerOnlineChanged(id=");
        stringBuilder.append(this.id);
        stringBuilder.append(", isOnline=");
        stringBuilder.append(this.asB);
        stringBuilder.append(", lastSeen=");
        stringBuilder.append(this.bpN);
        stringBuilder.append(", status=");
        stringBuilder.append(this.status);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public a(String str, boolean z, long j, String str2) {
        kotlin.jvm.internal.i.f(str, "id");
        kotlin.jvm.internal.i.f(str2, NotificationCompat.CATEGORY_STATUS);
        this.id = str;
        this.asB = z;
        this.bpN = j;
        this.status = str2;
    }

    public /* synthetic */ a(String str, boolean z, long j, String str2, int i, f fVar) {
        String str3 = "";
        String str4 = (i & 1) != 0 ? str3 : str;
        boolean z2 = (i & 2) != 0 ? false : z;
        if ((i & 4) != 0) {
            j = 0;
        }
        this(str4, z2, j, (i & 8) != 0 ? str3 : str2);
    }

    public a() {
        this("", false, 0, null, 14, null);
    }
}
