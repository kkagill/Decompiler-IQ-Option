package com.iqoption.core.microservices.techinstruments.a;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001:\u0001\u0016B\u0007\b\u0016¢\u0006\u0002\u0010\u0002B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0004HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, bng = {"Lcom/iqoption/core/microservices/techinstruments/response/StandardLibrary;", "", "()V", "version", "", "library", "Lcom/iqoption/core/microservices/techinstruments/response/StandardLibrary$Data;", "(JLcom/iqoption/core/microservices/techinstruments/response/StandardLibrary$Data;)V", "getLibrary", "()Lcom/iqoption/core/microservices/techinstruments/response/StandardLibrary$Data;", "getVersion", "()J", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Data", "core_release"})
/* compiled from: StandardLibrary.kt */
public final class d {
    @SerializedName("version")
    private final long byT;
    @SerializedName("library")
    private final a byU;

    @i(bne = {1, 1, 15}, bnf = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0007\b\u0016¢\u0006\u0002\u0010\u0002B%\u0012\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004¢\u0006\u0002\u0010\bJ\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004HÆ\u0003J)\u0010\u000e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u001c\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u00048\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\n¨\u0006\u0016"}, bng = {"Lcom/iqoption/core/microservices/techinstruments/response/StandardLibrary$Data;", "", "()V", "categories", "", "Lcom/iqoption/core/microservices/techinstruments/response/Category;", "indicators", "Lcom/iqoption/core/microservices/techinstruments/response/Indicator;", "(Ljava/util/List;Ljava/util/List;)V", "getCategories", "()Ljava/util/List;", "getIndicators", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "core_release"})
    /* compiled from: StandardLibrary.kt */
    public static final class a {
        @SerializedName("indicators")
        private final List<b> aCK;
        @SerializedName("categories")
        private final List<a> aDW;

        /* JADX WARNING: Missing block: B:6:0x001a, code skipped:
            if (kotlin.jvm.internal.i.y(r2.aCK, r3.aCK) != false) goto L_0x001f;
     */
        public boolean equals(java.lang.Object r3) {
            /*
            r2 = this;
            if (r2 == r3) goto L_0x001f;
        L_0x0002:
            r0 = r3 instanceof com.iqoption.core.microservices.techinstruments.a.d.a;
            if (r0 == 0) goto L_0x001d;
        L_0x0006:
            r3 = (com.iqoption.core.microservices.techinstruments.a.d.a) r3;
            r0 = r2.aDW;
            r1 = r3.aDW;
            r0 = kotlin.jvm.internal.i.y(r0, r1);
            if (r0 == 0) goto L_0x001d;
        L_0x0012:
            r0 = r2.aCK;
            r3 = r3.aCK;
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
            throw new UnsupportedOperationException("Method not decompiled: com.iqoption.core.microservices.techinstruments.a.d$a.equals(java.lang.Object):boolean");
        }

        public int hashCode() {
            List list = this.aDW;
            int i = 0;
            int hashCode = (list != null ? list.hashCode() : 0) * 31;
            List list2 = this.aCK;
            if (list2 != null) {
                i = list2.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Data(categories=");
            stringBuilder.append(this.aDW);
            stringBuilder.append(", indicators=");
            stringBuilder.append(this.aCK);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public a(List<a> list, List<b> list2) {
            kotlin.jvm.internal.i.f(list, "categories");
            kotlin.jvm.internal.i.f(list2, "indicators");
            this.aDW = list;
            this.aCK = list2;
        }

        public /* synthetic */ a(List list, List list2, int i, f fVar) {
            if ((i & 1) != 0) {
                list = m.emptyList();
            }
            if ((i & 2) != 0) {
                list2 = m.emptyList();
            }
            this(list, list2);
        }

        public final List<a> Mk() {
            return this.aDW;
        }

        public final List<b> LV() {
            return this.aCK;
        }

        public a() {
            this(m.emptyList(), null, 2, null);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof d) {
                d dVar = (d) obj;
                if ((this.byT == dVar.byT ? 1 : null) == null || !kotlin.jvm.internal.i.y(this.byU, dVar.byU)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        long j = this.byT;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        a aVar = this.byU;
        return i + (aVar != null ? aVar.hashCode() : 0);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("StandardLibrary(version=");
        stringBuilder.append(this.byT);
        stringBuilder.append(", library=");
        stringBuilder.append(this.byU);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public d(long j, a aVar) {
        this.byT = j;
        this.byU = aVar;
    }

    public final long getVersion() {
        return this.byT;
    }

    public /* synthetic */ d(long j, a aVar, int i, f fVar) {
        if ((i & 1) != 0) {
            j = 0;
        }
        if ((i & 2) != 0) {
            aVar = (a) null;
        }
        this(j, aVar);
    }

    public final a ahu() {
        return this.byU;
    }

    public d() {
        this(0, null, 2, null);
    }
}
