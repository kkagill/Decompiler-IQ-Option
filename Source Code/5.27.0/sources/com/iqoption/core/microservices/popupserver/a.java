package com.iqoption.core.microservices.popupserver;

import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.iqoption.core.d;
import io.reactivex.b.g;
import io.reactivex.e;
import io.reactivex.p;
import java.util.List;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0016B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\"\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00042\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eJ\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010J\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010J\u0012\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00150\u0014R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0017"}, bng = {"Lcom/iqoption/core/microservices/popupserver/PopupServerRequests;", "", "()V", "CMD_ADD_POPUP_EVENT", "", "CMD_GET_POPUPS", "EVENT_POPUP_ADDED", "EVENT_POPUP_DISABLED", "addPopupEvent", "Lio/reactivex/Completable;", "popupId", "", "eventName", "params", "Lcom/google/gson/JsonObject;", "getPopupAddedUpdate", "Lio/reactivex/Flowable;", "Lcom/iqoption/core/microservices/popupserver/response/Popup;", "getPopupDisabledUpdate", "getPopups", "Lio/reactivex/Single;", "", "Popups", "core_release"})
/* compiled from: PopupServerRequests.kt */
public final class a {
    public static final a bwG = new a();

    @i(bne = {1, 1, 15}, bnf = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0007\b\u0016¢\u0006\u0002\u0010\u0002B\u0015\u0012\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u001c\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0012"}, bng = {"Lcom/iqoption/core/microservices/popupserver/PopupServerRequests$Popups;", "", "()V", "popups", "", "Lcom/iqoption/core/microservices/popupserver/response/Popup;", "(Ljava/util/List;)V", "getPopups", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "core_release"})
    /* compiled from: PopupServerRequests.kt */
    public static final class a {
        @SerializedName("popups")
        private final List<com.iqoption.core.microservices.popupserver.response.a> bwH;

        /* JADX WARNING: Missing block: B:4:0x0010, code skipped:
            if (kotlin.jvm.internal.i.y(r1.bwH, ((com.iqoption.core.microservices.popupserver.a.a) r2).bwH) != false) goto L_0x0015;
     */
        public boolean equals(java.lang.Object r2) {
            /*
            r1 = this;
            if (r1 == r2) goto L_0x0015;
        L_0x0002:
            r0 = r2 instanceof com.iqoption.core.microservices.popupserver.a.a;
            if (r0 == 0) goto L_0x0013;
        L_0x0006:
            r2 = (com.iqoption.core.microservices.popupserver.a.a) r2;
            r0 = r1.bwH;
            r2 = r2.bwH;
            r2 = kotlin.jvm.internal.i.y(r0, r2);
            if (r2 == 0) goto L_0x0013;
        L_0x0012:
            goto L_0x0015;
        L_0x0013:
            r2 = 0;
            return r2;
        L_0x0015:
            r2 = 1;
            return r2;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.iqoption.core.microservices.popupserver.a$a.equals(java.lang.Object):boolean");
        }

        public int hashCode() {
            List list = this.bwH;
            return list != null ? list.hashCode() : 0;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Popups(popups=");
            stringBuilder.append(this.bwH);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public a(List<com.iqoption.core.microservices.popupserver.response.a> list) {
            kotlin.jvm.internal.i.f(list, "popups");
            this.bwH = list;
        }

        public final List<com.iqoption.core.microservices.popupserver.response.a> agh() {
            return this.bwH;
        }

        public a() {
            this(m.emptyList());
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "Lcom/iqoption/core/microservices/popupserver/response/Popup;", "it", "Lcom/iqoption/core/microservices/popupserver/PopupServerRequests$Popups;", "apply"})
    /* compiled from: PopupServerRequests.kt */
    static final class b<T, R> implements g<T, R> {
        public static final b bwI = new b();

        b() {
        }

        /* renamed from: a */
        public final List<com.iqoption.core.microservices.popupserver.response.a> apply(a aVar) {
            kotlin.jvm.internal.i.f(aVar, "it");
            return aVar.agh();
        }
    }

    private a() {
    }

    public final p<List<com.iqoption.core.microservices.popupserver.response.a>> age() {
        p t = d.EV().a("get-popups", a.class).UB().t(b.bwI);
        kotlin.jvm.internal.i.e(t, "requestBuilderFactory\n  …       .map { it.popups }");
        return t;
    }

    public final e<com.iqoption.core.microservices.popupserver.response.a> agf() {
        return d.EW().b("popup-added", com.iqoption.core.microservices.popupserver.response.a.class).HQ();
    }

    public final e<com.iqoption.core.microservices.popupserver.response.a> agg() {
        return d.EW().b("popup-disabled", com.iqoption.core.microservices.popupserver.response.a.class).HQ();
    }

    public static /* synthetic */ io.reactivex.a a(a aVar, long j, String str, JsonObject jsonObject, int i, Object obj) {
        if ((i & 4) != 0) {
            jsonObject = (JsonObject) null;
        }
        return aVar.a(j, str, jsonObject);
    }

    public final io.reactivex.a a(long j, String str, JsonObject jsonObject) {
        kotlin.jvm.internal.i.f(str, "eventName");
        JsonObject jsonObject2 = new JsonObject();
        jsonObject2.addProperty("popup_id", (Number) Long.valueOf(j));
        jsonObject2.addProperty("event_name", str);
        if (jsonObject != null) {
            jsonObject2.add("params", jsonObject);
        }
        io.reactivex.a blf = d.EV().a("add-popup-event", com.iqoption.core.connect.a.Uv()).eG(0).c(jsonObject2).UB().blf();
        kotlin.jvm.internal.i.e(blf, "requestBuilderFactory\n  …         .ignoreElement()");
        return blf;
    }
}
