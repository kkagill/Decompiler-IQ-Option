package com.iqoption.chat.viewmodel;

import com.iqoption.chat.e.j;
import com.iqoption.core.d;
import java.io.File;
import java.util.Arrays;
import kotlin.i;
import kotlin.jvm.internal.n;

@i(bne = {1, 1, 15}, bnf = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000e¨\u0006\u0019"}, bng = {"Lcom/iqoption/chat/viewmodel/FileItem;", "", "file", "Ljava/io/File;", "(Ljava/io/File;)V", "getFile", "()Ljava/io/File;", "id", "", "getId", "()J", "modified", "", "getModified", "()Ljava/lang/String;", "size", "getSize", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "chat_release"})
/* compiled from: FilePickerViewModel.kt */
public final class e {
    private final String aWR;
    private final String aWS;
    private final File file;
    private final long id = ((long) this.file.getPath().hashCode());

    /* JADX WARNING: Missing block: B:4:0x0010, code skipped:
            if (kotlin.jvm.internal.i.y(r1.file, ((com.iqoption.chat.viewmodel.e) r2).file) != false) goto L_0x0015;
     */
    public boolean equals(java.lang.Object r2) {
        /*
        r1 = this;
        if (r1 == r2) goto L_0x0015;
    L_0x0002:
        r0 = r2 instanceof com.iqoption.chat.viewmodel.e;
        if (r0 == 0) goto L_0x0013;
    L_0x0006:
        r2 = (com.iqoption.chat.viewmodel.e) r2;
        r0 = r1.file;
        r2 = r2.file;
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
        throw new UnsupportedOperationException("Method not decompiled: com.iqoption.chat.viewmodel.e.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        File file = this.file;
        return file != null ? file.hashCode() : 0;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("FileItem(file=");
        stringBuilder.append(this.file);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public e(File file) {
        kotlin.jvm.internal.i.f(file, "file");
        this.file = file;
        String str;
        if (this.file.isDirectory()) {
            str = (String) null;
            this.aWR = str;
            this.aWS = str;
            return;
        }
        double length = (double) this.file.length();
        if (length == 0.0d) {
            str = "";
        } else {
            str = "java.lang.String.format(format, *args)";
            String str2 = "%.1f";
            int i;
            Object[] objArr;
            n nVar;
            Object[] objArr2;
            String format;
            if (length > 1.099511627776E12d) {
                i = j.n1_tb;
                objArr = new Object[1];
                nVar = n.eWf;
                objArr2 = new Object[1];
                Double.isNaN(length);
                objArr2[0] = Double.valueOf(length / 1.099511627776E12d);
                format = String.format(str2, Arrays.copyOf(objArr2, objArr2.length));
                kotlin.jvm.internal.i.e(format, str);
                objArr[0] = format;
                str = d.getString(i, objArr);
            } else if (length > 1.073741824E9d) {
                i = j.n1_gb;
                objArr = new Object[1];
                nVar = n.eWf;
                objArr2 = new Object[1];
                Double.isNaN(length);
                objArr2[0] = Double.valueOf(length / 1.073741824E9d);
                format = String.format(str2, Arrays.copyOf(objArr2, objArr2.length));
                kotlin.jvm.internal.i.e(format, str);
                objArr[0] = format;
                str = d.getString(i, objArr);
            } else if (length > 1048576.0d) {
                i = j.n1_mb;
                objArr = new Object[1];
                nVar = n.eWf;
                objArr2 = new Object[1];
                Double.isNaN(length);
                objArr2[0] = Double.valueOf(length / 1048576.0d);
                format = String.format(str2, Arrays.copyOf(objArr2, objArr2.length));
                kotlin.jvm.internal.i.e(format, str);
                objArr[0] = format;
                str = d.getString(i, objArr);
            } else if (length > 1024.0d) {
                i = j.n1_kb;
                objArr = new Object[1];
                nVar = n.eWf;
                objArr2 = new Object[1];
                Double.isNaN(length);
                objArr2[0] = Double.valueOf(length / 1024.0d);
                format = String.format(str2, Arrays.copyOf(objArr2, objArr2.length));
                kotlin.jvm.internal.i.e(format, str);
                objArr[0] = format;
                str = d.getString(i, objArr);
            } else {
                str = d.getString(j.n1_bytes, Long.valueOf((long) length));
            }
        }
        this.aWR = str;
        this.aWS = g.aXf.format(Long.valueOf(this.file.lastModified()));
    }

    public final File fI() {
        return this.file;
    }

    public final long getId() {
        return this.id;
    }

    public final String Tl() {
        return this.aWR;
    }

    public final String Tm() {
        return this.aWS;
    }
}
