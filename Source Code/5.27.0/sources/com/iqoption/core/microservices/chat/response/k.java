package com.iqoption.core.microservices.chat.response;

import com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty;
import com.google.gson.annotations.SerializedName;
import io.reactivex.subjects.PublishSubject;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b,\b\b\u0018\u0000 >2\u00020\u0001:\u0002>?B\u0007\b\u0016¢\u0006\u0002\u0010\u0002B\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0014¢\u0006\u0002\u0010\u0015J\t\u0010)\u001a\u00020\u0004HÆ\u0003J\t\u0010*\u001a\u00020\u000eHÆ\u0003J\t\u0010+\u001a\u00020\u000eHÆ\u0003J\t\u0010,\u001a\u00020\u0004HÆ\u0003J\t\u0010-\u001a\u00020\u000eHÆ\u0003J\t\u0010.\u001a\u00020\u0014HÆ\u0003J\t\u0010/\u001a\u00020\u0006HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\t\u00102\u001a\u00020\u0004HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\t\u00106\u001a\u00020\u000eHÆ\u0003J\u0001\u00107\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\t\u001a\u00020\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00042\b\b\u0002\u0010\u0012\u001a\u00020\u000e2\b\b\u0002\u0010\u0013\u001a\u00020\u0014HÆ\u0001J\u0013\u00108\u001a\u00020\u000e2\b\u00109\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010:\u001a\u00020\u0014HÖ\u0001J\u000e\u0010;\u001a\u00020\u000e2\u0006\u0010<\u001a\u00020\u0004J\t\u0010=\u001a\u00020\u0004HÖ\u0001R\u001e\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0016\u0010\u0002\u001a\u0004\b\u0017\u0010\u0018R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0018R\u0016\u0010\r\u001a\u00020\u000e8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u001bR\u0016\u0010\u0010\u001a\u00020\u000e8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u001bR\u0016\u0010\u000f\u001a\u00020\u000e8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u001bR\u0016\u0010\u0011\u001a\u00020\u00048\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0018R\u0011\u0010\u001d\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0018R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0018R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0018R\u0016\u0010\t\u001a\u00020\u00048\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0018R\u0016\u0010\u0013\u001a\u00020\u00148\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0016\u0010\u0012\u001a\u00020\u000e8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001bR\u001a\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\n\n\u0002\b&\u001a\u0004\b%\u0010\u0018R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(¨\u0006@"}, bng = {"Lcom/iqoption/core/microservices/chat/response/ChatRoom;", "", "()V", "id", "", "type", "Lcom/iqoption/core/microservices/chat/response/ChatRoomType;", "locale", "subject", "name", "localizedName", "icon", "iconPath", "isPublic", "", "isWrite", "isRegulated", "lastReadMessageId", "removed", "onlineUsers", "", "(Ljava/lang/String;Lcom/iqoption/core/microservices/chat/response/ChatRoomType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZLjava/lang/String;ZI)V", "icon$annotations", "getIcon", "()Ljava/lang/String;", "getIconPath", "getId", "()Z", "getLastReadMessageId", "lastSeenMessageId", "getLastSeenMessageId", "getLocale", "getLocalizedName", "getName", "getOnlineUsers", "()I", "getRemoved", "getSubject", "subject$1", "getType", "()Lcom/iqoption/core/microservices/chat/response/ChatRoomType;", "component1", "component10", "component11", "component12", "component13", "component14", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "isSeen", "messageId", "toString", "Companion", "Event", "core_release"})
/* compiled from: ChatRoom.kt */
public final class k {
    private static final k bqL = new k();
    private static final PublishSubject<b> bqM;
    private static final Map<String, String> bqN = new LinkedHashMap();
    public static final a bqO = new a();
    @SerializedName("type")
    private final ChatRoomType aUD;
    @SerializedName("is_regulated")
    private final boolean aZy;
    @SerializedName("icon")
    private final String boP;
    @SerializedName("subject")
    private final String bqF;
    @SerializedName("localized_name")
    private final String bqG;
    @SerializedName("icon_path")
    private final String bqH;
    @SerializedName("is_write")
    private final boolean bqI;
    @SerializedName("last_read_message_id")
    private final String bqJ;
    @SerializedName("online_users")
    private final int bqK;
    @SerializedName("removed")
    private final boolean bqs;
    @SerializedName("id")
    private final String id;
    @SerializedName("is_public")
    private final boolean isPublic;
    @SerializedName("locale")
    private final String locale;
    @SerializedName("name")
    private final String name;

    @i(bne = {1, 1, 15}, bnf = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0013\u001a\u00020\u000eJ\u0016\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u000eJ\u0016\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u000eR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b8F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\rX\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u000f\u001a\u0010\u0012\f\u0012\n \u0011*\u0004\u0018\u00010\t0\t0\u0010X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, bng = {"Lcom/iqoption/core/microservices/chat/response/ChatRoom$Companion;", "", "()V", "EMPTY", "Lcom/iqoption/core/microservices/chat/response/ChatRoom;", "getEMPTY", "()Lcom/iqoption/core/microservices/chat/response/ChatRoom;", "events", "Lio/reactivex/Flowable;", "Lcom/iqoption/core/microservices/chat/response/ChatRoom$Event;", "getEvents", "()Lio/reactivex/Flowable;", "lastSeenMessages", "", "", "subject", "Lio/reactivex/subjects/PublishSubject;", "kotlin.jvm.PlatformType", "getSeen", "roomId", "isSeen", "", "messageId", "see", "", "core_release"})
    /* compiled from: ChatRoom.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final void am(String str, String str2) {
            kotlin.jvm.internal.i.f(str, "roomId");
            kotlin.jvm.internal.i.f(str2, "messageId");
            k.bqN.put(str, str2);
            k.bqM.onNext(new b(str, str2));
        }

        public final boolean an(String str, String str2) {
            kotlin.jvm.internal.i.f(str, "roomId");
            kotlin.jvm.internal.i.f(str2, "messageId");
            return kotlin.jvm.internal.i.y((String) k.bqN.get(str), str2);
        }

        public final String gs(String str) {
            kotlin.jvm.internal.i.f(str, "roomId");
            return (String) k.bqN.get(str);
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\t"}, bng = {"Lcom/iqoption/core/microservices/chat/response/ChatRoom$Event;", "", "chatRoomId", "", "lastReadMessageId", "(Ljava/lang/String;Ljava/lang/String;)V", "getChatRoomId", "()Ljava/lang/String;", "getLastReadMessageId", "core_release"})
    /* compiled from: ChatRoom.kt */
    public static final class b {
        private final String bqJ;
        private final String bqP;

        public b(String str, String str2) {
            kotlin.jvm.internal.i.f(str, "chatRoomId");
            kotlin.jvm.internal.i.f(str2, "lastReadMessageId");
            this.bqP = str;
            this.bqJ = str2;
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof k) {
                k kVar = (k) obj;
                if (kotlin.jvm.internal.i.y(this.id, kVar.id) && kotlin.jvm.internal.i.y(this.aUD, kVar.aUD) && kotlin.jvm.internal.i.y(this.locale, kVar.locale) && kotlin.jvm.internal.i.y(this.bqF, kVar.bqF) && kotlin.jvm.internal.i.y(this.name, kVar.name) && kotlin.jvm.internal.i.y(this.bqG, kVar.bqG) && kotlin.jvm.internal.i.y(this.boP, kVar.boP) && kotlin.jvm.internal.i.y(this.bqH, kVar.bqH)) {
                    if ((this.isPublic == kVar.isPublic ? 1 : null) != null) {
                        if ((this.bqI == kVar.bqI ? 1 : null) != null) {
                            if ((this.aZy == kVar.aZy ? 1 : null) != null && kotlin.jvm.internal.i.y(this.bqJ, kVar.bqJ)) {
                                if ((this.bqs == kVar.bqs ? 1 : null) != null) {
                                    if ((this.bqK == kVar.bqK ? 1 : null) != null) {
                                        return true;
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
        ChatRoomType chatRoomType = this.aUD;
        hashCode = (hashCode + (chatRoomType != null ? chatRoomType.hashCode() : 0)) * 31;
        String str2 = this.locale;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        str2 = this.bqF;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        str2 = this.name;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        str2 = this.bqG;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        str2 = this.boP;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        str2 = this.bqH;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        int i2 = this.isPublic;
        if (i2 != 0) {
            i2 = 1;
        }
        hashCode = (hashCode + i2) * 31;
        i2 = this.bqI;
        if (i2 != 0) {
            i2 = 1;
        }
        hashCode = (hashCode + i2) * 31;
        i2 = this.aZy;
        if (i2 != 0) {
            i2 = 1;
        }
        hashCode = (hashCode + i2) * 31;
        str2 = this.bqJ;
        if (str2 != null) {
            i = str2.hashCode();
        }
        hashCode = (hashCode + i) * 31;
        i = this.bqs;
        if (i != 0) {
            i = 1;
        }
        return ((hashCode + i) * 31) + this.bqK;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ChatRoom(id=");
        stringBuilder.append(this.id);
        stringBuilder.append(", type=");
        stringBuilder.append(this.aUD);
        stringBuilder.append(", locale=");
        stringBuilder.append(this.locale);
        stringBuilder.append(", subject=");
        stringBuilder.append(this.bqF);
        stringBuilder.append(", name=");
        stringBuilder.append(this.name);
        stringBuilder.append(", localizedName=");
        stringBuilder.append(this.bqG);
        stringBuilder.append(", icon=");
        stringBuilder.append(this.boP);
        stringBuilder.append(", iconPath=");
        stringBuilder.append(this.bqH);
        stringBuilder.append(", isPublic=");
        stringBuilder.append(this.isPublic);
        stringBuilder.append(", isWrite=");
        stringBuilder.append(this.bqI);
        stringBuilder.append(", isRegulated=");
        stringBuilder.append(this.aZy);
        stringBuilder.append(", lastReadMessageId=");
        stringBuilder.append(this.bqJ);
        stringBuilder.append(", removed=");
        stringBuilder.append(this.bqs);
        stringBuilder.append(", onlineUsers=");
        stringBuilder.append(this.bqK);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public k(String str, ChatRoomType chatRoomType, String str2, String str3, String str4, String str5, String str6, String str7, boolean z, boolean z2, boolean z3, String str8, boolean z4, int i) {
        kotlin.jvm.internal.i.f(str, "id");
        kotlin.jvm.internal.i.f(chatRoomType, "type");
        kotlin.jvm.internal.i.f(str4, ConditionalUserProperty.NAME);
        kotlin.jvm.internal.i.f(str8, "lastReadMessageId");
        this.id = str;
        this.aUD = chatRoomType;
        this.locale = str2;
        this.bqF = str3;
        this.name = str4;
        this.bqG = str5;
        this.boP = str6;
        this.bqH = str7;
        this.isPublic = z;
        this.bqI = z2;
        this.aZy = z3;
        this.bqJ = str8;
        this.bqs = z4;
        this.bqK = i;
    }

    public final String getId() {
        return this.id;
    }

    public /* synthetic */ k(String str, ChatRoomType chatRoomType, String str2, String str3, String str4, String str5, String str6, String str7, boolean z, boolean z2, boolean z3, String str8, boolean z4, int i, int i2, f fVar) {
        int i3 = i2;
        String str9 = "";
        String str10 = (i3 & 1) != 0 ? str9 : str;
        ChatRoomType chatRoomType2 = (i3 & 2) != 0 ? ChatRoomType.GLOBAL : chatRoomType;
        String str11 = (i3 & 4) != 0 ? (String) null : str2;
        String str12 = (i3 & 8) != 0 ? (String) null : str3;
        String str13 = (i3 & 16) != 0 ? str9 : str4;
        String str14 = (i3 & 32) != 0 ? (String) null : str5;
        String str15 = (i3 & 64) != 0 ? (String) null : str6;
        String str16 = (i3 & 128) != 0 ? (String) null : str7;
        int i4 = 0;
        boolean z5 = (i3 & 256) != 0 ? false : z;
        boolean z6 = (i3 & 512) != 0 ? false : z2;
        boolean z7 = (i3 & 1024) != 0 ? false : z3;
        if ((i3 & 2048) == 0) {
            str9 = str8;
        }
        boolean z8 = (i3 & 4096) != 0 ? false : z4;
        if ((i3 & 8192) == 0) {
            i4 = i;
        }
        this(str10, chatRoomType2, str11, str12, str13, str14, str15, str16, z5, z6, z7, str9, z8, i4);
    }

    public final ChatRoomType SG() {
        return this.aUD;
    }

    public final String getLocale() {
        return this.locale;
    }

    public final String getName() {
        return this.name;
    }

    public final String acy() {
        return this.bqH;
    }

    public final boolean isPublic() {
        return this.isPublic;
    }

    public final boolean Er() {
        return this.aZy;
    }

    public final boolean aci() {
        return this.bqs;
    }

    public final int acz() {
        return this.bqK;
    }

    static {
        PublishSubject bmR = PublishSubject.bmR();
        kotlin.jvm.internal.i.e(bmR, "PublishSubject.create<Event>()");
        bqM = bmR;
    }

    public k() {
        this("", null, null, null, null, null, null, null, false, false, false, null, false, 0, 16382, null);
    }

    public final String acx() {
        String gs = bqO.gs(this.id);
        return gs != null ? gs : this.bqJ;
    }

    public final boolean gr(String str) {
        kotlin.jvm.internal.i.f(str, "messageId");
        return kotlin.jvm.internal.i.y(str, this.bqJ) || bqO.an(this.id, str);
    }
}
