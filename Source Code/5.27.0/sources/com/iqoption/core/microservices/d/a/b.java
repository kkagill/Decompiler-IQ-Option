package com.iqoption.core.microservices.d.a;

import com.google.gson.annotations.SerializedName;
import java.util.Collections;
import java.util.List;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\b\u0018\u0000 !2\u00020\u0001:\u0001!B\u0007\b\u0016¢\u0006\u0002\u0010\u0002B9\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0007\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\t\u0010\u0015\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0004HÆ\u0003J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007HÆ\u0003J\u000f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\t0\u0007HÆ\u0003J\t\u0010\u0019\u001a\u00020\u000bHÆ\u0003JG\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00072\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0004HÖ\u0001R\u001c\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00078\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u00078\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\""}, bng = {"Lcom/iqoption/core/microservices/resources/responses/ResourceElement;", "", "()V", "id", "", "type", "tags", "", "data", "Lcom/iqoption/core/microservices/resources/responses/ResourceData;", "updatedAt", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;J)V", "getData", "()Ljava/util/List;", "getId", "()Ljava/lang/String;", "getTags", "getType", "getUpdatedAt", "()J", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "core_release"})
/* compiled from: ResourceResponses.kt */
public final class b {
    public static final a bxX = new a();
    @SerializedName("updated_at")
    private final long bvT;
    @SerializedName("data")
    private final List<a> bxW;
    @SerializedName("id")
    private final String id;
    @SerializedName("tags")
    private final List<String> tags;
    @SerializedName("type")
    private final String type;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\b"}, bng = {"Lcom/iqoption/core/microservices/resources/responses/ResourceElement$Companion;", "", "()V", "TYPE_ANIMATION", "", "TYPE_FILE", "TYPE_IMAGE", "TYPE_JSON", "core_release"})
    /* compiled from: ResourceResponses.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (kotlin.jvm.internal.i.y(this.id, bVar.id) && kotlin.jvm.internal.i.y(this.type, bVar.type) && kotlin.jvm.internal.i.y(this.tags, bVar.tags) && kotlin.jvm.internal.i.y(this.bxW, bVar.bxW)) {
                    if ((this.bvT == bVar.bvT ? 1 : null) != null) {
                        return true;
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
        String str2 = this.type;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        List list = this.tags;
        hashCode = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        list = this.bxW;
        if (list != null) {
            i = list.hashCode();
        }
        hashCode = (hashCode + i) * 31;
        long j = this.bvT;
        return hashCode + ((int) (j ^ (j >>> 32)));
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ResourceElement(id=");
        stringBuilder.append(this.id);
        stringBuilder.append(", type=");
        stringBuilder.append(this.type);
        stringBuilder.append(", tags=");
        stringBuilder.append(this.tags);
        stringBuilder.append(", data=");
        stringBuilder.append(this.bxW);
        stringBuilder.append(", updatedAt=");
        stringBuilder.append(this.bvT);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public b(String str, String str2, List<String> list, List<a> list2, long j) {
        kotlin.jvm.internal.i.f(str, "id");
        kotlin.jvm.internal.i.f(str2, "type");
        kotlin.jvm.internal.i.f(list, "tags");
        kotlin.jvm.internal.i.f(list2, "data");
        this.id = str;
        this.type = str2;
        this.tags = list;
        this.bxW = list2;
        this.bvT = j;
    }

    public final String getId() {
        return this.id;
    }

    public final String getType() {
        return this.type;
    }

    public final List<a> agZ() {
        return this.bxW;
    }

    public final long aha() {
        return this.bvT;
    }

    public b() {
        List emptyList = Collections.emptyList();
        String str = "Collections.emptyList()";
        kotlin.jvm.internal.i.e(emptyList, str);
        List emptyList2 = Collections.emptyList();
        kotlin.jvm.internal.i.e(emptyList2, str);
        this("", "", emptyList, emptyList2, 0);
    }
}
