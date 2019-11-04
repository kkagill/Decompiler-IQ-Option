package com.iqoption.debugmenu.debugmenu;

import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001:\u00040123B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\u0002\u0010\rJ\t\u0010%\u001a\u00020\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010'\u001a\u00020\u0007HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0011\u0010)\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0003JG\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0001J\u0013\u0010+\u001a\u00020\u001b2\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010-\u001a\u00020.HÖ\u0001J\t\u0010/\u001a\u00020\u0005HÖ\u0001R\"\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u0011\u0010\u001a\u001a\u00020\u001b8F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001cR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$¨\u00064"}, bng = {"Lcom/iqoption/debugmenu/debugmenu/ContainerEntity;", "", "id", "", "status", "", "container", "Lcom/iqoption/debugmenu/debugmenu/ContainerEntity$Container;", "user", "Lcom/iqoption/debugmenu/debugmenu/ContainerEntity$User;", "buildProjects", "Ljava/util/ArrayList;", "Lcom/iqoption/debugmenu/debugmenu/ContainerEntity$BuildProject;", "(JLjava/lang/String;Lcom/iqoption/debugmenu/debugmenu/ContainerEntity$Container;Lcom/iqoption/debugmenu/debugmenu/ContainerEntity$User;Ljava/util/ArrayList;)V", "getBuildProjects", "()Ljava/util/ArrayList;", "setBuildProjects", "(Ljava/util/ArrayList;)V", "getContainer", "()Lcom/iqoption/debugmenu/debugmenu/ContainerEntity$Container;", "setContainer", "(Lcom/iqoption/debugmenu/debugmenu/ContainerEntity$Container;)V", "getId", "()J", "setId", "(J)V", "isSuccess", "", "()Z", "getStatus", "()Ljava/lang/String;", "setStatus", "(Ljava/lang/String;)V", "getUser", "()Lcom/iqoption/debugmenu/debugmenu/ContainerEntity$User;", "setUser", "(Lcom/iqoption/debugmenu/debugmenu/ContainerEntity$User;)V", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "BuildProject", "Container", "List", "User", "debugmenu_release"})
/* compiled from: ContainerEntity.kt */
public final class ContainerEntity {
    private a cvf;
    private b cvg;
    private ArrayList<Object> cvh;
    private long id;
    private String status;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, bng = {"Lcom/iqoption/debugmenu/debugmenu/ContainerEntity$List;", "Ljava/util/ArrayList;", "Lcom/iqoption/debugmenu/debugmenu/ContainerEntity;", "()V", "debugmenu_release"})
    /* compiled from: ContainerEntity.kt */
    public static final class List extends ArrayList<ContainerEntity> {
        public boolean a(ContainerEntity containerEntity) {
            return super.contains(containerEntity);
        }

        public int b(ContainerEntity containerEntity) {
            return super.indexOf(containerEntity);
        }

        public int c(ContainerEntity containerEntity) {
            return super.lastIndexOf(containerEntity);
        }

        public final boolean contains(Object obj) {
            return obj instanceof ContainerEntity ? a((ContainerEntity) obj) : false;
        }

        public boolean d(ContainerEntity containerEntity) {
            return super.remove(containerEntity);
        }

        public int getSize() {
            return super.size();
        }

        public final int indexOf(Object obj) {
            return obj instanceof ContainerEntity ? b((ContainerEntity) obj) : -1;
        }

        public final int lastIndexOf(Object obj) {
            return obj instanceof ContainerEntity ? c((ContainerEntity) obj) : -1;
        }

        public final boolean remove(Object obj) {
            return obj instanceof ContainerEntity ? d((ContainerEntity) obj) : false;
        }

        public final int size() {
            return getSize();
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B5\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\bJ\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\fJ\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\fJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0006HÆ\u0003J>\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\u0006\u0010\u0019\u001a\u00020\u0006J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0006HÖ\u0001R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000e\u0010\fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\n¨\u0006\u001d"}, bng = {"Lcom/iqoption/debugmenu/debugmenu/ContainerEntity$Container;", "", "id", "", "nodeId", "status", "", "_hostname", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;)V", "get_hostname", "()Ljava/lang/String;", "getId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getNodeId", "getStatus", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;)Lcom/iqoption/debugmenu/debugmenu/ContainerEntity$Container;", "equals", "", "other", "getHostName", "hashCode", "", "toString", "debugmenu_release"})
    /* compiled from: ContainerEntity.kt */
    public static final class a {
        @SerializedName("node_id")
        private final Long cvi;
        @SerializedName("hostname")
        private final String cvj;
        @SerializedName("id")
        private final Long id;
        @SerializedName("status")
        private final String status;

        public a() {
            this(null, null, null, null, 15, null);
        }

        /* JADX WARNING: Missing block: B:10:0x002e, code skipped:
            if (kotlin.jvm.internal.i.y(r2.cvj, r3.cvj) != false) goto L_0x0033;
     */
        public boolean equals(java.lang.Object r3) {
            /*
            r2 = this;
            if (r2 == r3) goto L_0x0033;
        L_0x0002:
            r0 = r3 instanceof com.iqoption.debugmenu.debugmenu.ContainerEntity.a;
            if (r0 == 0) goto L_0x0031;
        L_0x0006:
            r3 = (com.iqoption.debugmenu.debugmenu.ContainerEntity.a) r3;
            r0 = r2.id;
            r1 = r3.id;
            r0 = kotlin.jvm.internal.i.y(r0, r1);
            if (r0 == 0) goto L_0x0031;
        L_0x0012:
            r0 = r2.cvi;
            r1 = r3.cvi;
            r0 = kotlin.jvm.internal.i.y(r0, r1);
            if (r0 == 0) goto L_0x0031;
        L_0x001c:
            r0 = r2.status;
            r1 = r3.status;
            r0 = kotlin.jvm.internal.i.y(r0, r1);
            if (r0 == 0) goto L_0x0031;
        L_0x0026:
            r0 = r2.cvj;
            r3 = r3.cvj;
            r3 = kotlin.jvm.internal.i.y(r0, r3);
            if (r3 == 0) goto L_0x0031;
        L_0x0030:
            goto L_0x0033;
        L_0x0031:
            r3 = 0;
            return r3;
        L_0x0033:
            r3 = 1;
            return r3;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.iqoption.debugmenu.debugmenu.ContainerEntity$a.equals(java.lang.Object):boolean");
        }

        public int hashCode() {
            Long l = this.id;
            int i = 0;
            int hashCode = (l != null ? l.hashCode() : 0) * 31;
            Long l2 = this.cvi;
            hashCode = (hashCode + (l2 != null ? l2.hashCode() : 0)) * 31;
            String str = this.status;
            hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
            str = this.cvj;
            if (str != null) {
                i = str.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Container(id=");
            stringBuilder.append(this.id);
            stringBuilder.append(", nodeId=");
            stringBuilder.append(this.cvi);
            stringBuilder.append(", status=");
            stringBuilder.append(this.status);
            stringBuilder.append(", _hostname=");
            stringBuilder.append(this.cvj);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public a(Long l, Long l2, String str, String str2) {
            this.id = l;
            this.cvi = l2;
            this.status = str;
            this.cvj = str2;
        }

        public /* synthetic */ a(Long l, Long l2, String str, String str2, int i, f fVar) {
            if ((i & 1) != 0) {
                l = (Long) null;
            }
            if ((i & 2) != 0) {
                l2 = (Long) null;
            }
            if ((i & 4) != 0) {
                str = (String) null;
            }
            if ((i & 8) != 0) {
                str2 = (String) null;
            }
            this(l, l2, str, str2);
        }

        public final String getStatus() {
            return this.status;
        }

        public final String getHostName() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("http://");
            stringBuilder.append(this.cvj);
            stringBuilder.append('/');
            return stringBuilder.toString();
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\bJ\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J&\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, bng = {"Lcom/iqoption/debugmenu/debugmenu/ContainerEntity$User;", "", "id", "", "username", "", "(Ljava/lang/Long;Ljava/lang/String;)V", "getId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getUsername", "()Ljava/lang/String;", "component1", "component2", "copy", "(Ljava/lang/Long;Ljava/lang/String;)Lcom/iqoption/debugmenu/debugmenu/ContainerEntity$User;", "equals", "", "other", "hashCode", "", "toString", "debugmenu_release"})
    /* compiled from: ContainerEntity.kt */
    public static final class b {
        @SerializedName("id")
        private final Long id;
        @SerializedName("username")
        private final String username;

        public b() {
            this(null, null, 3, null);
        }

        /* JADX WARNING: Missing block: B:6:0x001a, code skipped:
            if (kotlin.jvm.internal.i.y(r2.username, r3.username) != false) goto L_0x001f;
     */
        public boolean equals(java.lang.Object r3) {
            /*
            r2 = this;
            if (r2 == r3) goto L_0x001f;
        L_0x0002:
            r0 = r3 instanceof com.iqoption.debugmenu.debugmenu.ContainerEntity.b;
            if (r0 == 0) goto L_0x001d;
        L_0x0006:
            r3 = (com.iqoption.debugmenu.debugmenu.ContainerEntity.b) r3;
            r0 = r2.id;
            r1 = r3.id;
            r0 = kotlin.jvm.internal.i.y(r0, r1);
            if (r0 == 0) goto L_0x001d;
        L_0x0012:
            r0 = r2.username;
            r3 = r3.username;
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
            throw new UnsupportedOperationException("Method not decompiled: com.iqoption.debugmenu.debugmenu.ContainerEntity$b.equals(java.lang.Object):boolean");
        }

        public int hashCode() {
            Long l = this.id;
            int i = 0;
            int hashCode = (l != null ? l.hashCode() : 0) * 31;
            String str = this.username;
            if (str != null) {
                i = str.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("User(id=");
            stringBuilder.append(this.id);
            stringBuilder.append(", username=");
            stringBuilder.append(this.username);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public b(Long l, String str) {
            this.id = l;
            this.username = str;
        }

        public /* synthetic */ b(Long l, String str, int i, f fVar) {
            if ((i & 1) != 0) {
                l = (Long) null;
            }
            if ((i & 2) != 0) {
                str = (String) null;
            }
            this(l, str);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ContainerEntity) {
                ContainerEntity containerEntity = (ContainerEntity) obj;
                if (!((this.id == containerEntity.id ? 1 : null) != null && kotlin.jvm.internal.i.y(this.status, containerEntity.status) && kotlin.jvm.internal.i.y(this.cvf, containerEntity.cvf) && kotlin.jvm.internal.i.y(this.cvg, containerEntity.cvg) && kotlin.jvm.internal.i.y(this.cvh, containerEntity.cvh))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        long j = this.id;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        String str = this.status;
        int i2 = 0;
        i = (i + (str != null ? str.hashCode() : 0)) * 31;
        a aVar = this.cvf;
        i = (i + (aVar != null ? aVar.hashCode() : 0)) * 31;
        b bVar = this.cvg;
        i = (i + (bVar != null ? bVar.hashCode() : 0)) * 31;
        ArrayList arrayList = this.cvh;
        if (arrayList != null) {
            i2 = arrayList.hashCode();
        }
        return i + i2;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ContainerEntity(id=");
        stringBuilder.append(this.id);
        stringBuilder.append(", status=");
        stringBuilder.append(this.status);
        stringBuilder.append(", container=");
        stringBuilder.append(this.cvf);
        stringBuilder.append(", user=");
        stringBuilder.append(this.cvg);
        stringBuilder.append(", buildProjects=");
        stringBuilder.append(this.cvh);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public final long getId() {
        return this.id;
    }

    public final a aob() {
        return this.cvf;
    }

    public final boolean isSuccess() {
        boolean z = false;
        if (TextUtils.isEmpty(this.status)) {
            return false;
        }
        a aVar = this.cvf;
        if (aVar == null) {
            kotlin.jvm.internal.i.bnJ();
        }
        if (!TextUtils.isEmpty(aVar.getStatus()) && kotlin.jvm.internal.i.y(this.status, "success")) {
            aVar = this.cvf;
            if (aVar == null) {
                kotlin.jvm.internal.i.bnJ();
            }
            if (kotlin.jvm.internal.i.y(aVar.getStatus(), "running")) {
                z = true;
            }
        }
        return z;
    }
}
