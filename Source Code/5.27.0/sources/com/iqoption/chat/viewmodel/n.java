package com.iqoption.chat.viewmodel;

import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, bng = {"Lcom/iqoption/chat/viewmodel/SelectEvent;", "", "preview", "Lcom/iqoption/chat/viewmodel/AttachmentPreview;", "time", "", "(Lcom/iqoption/chat/viewmodel/AttachmentPreview;J)V", "getPreview", "()Lcom/iqoption/chat/viewmodel/AttachmentPreview;", "getTime", "()J", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "chat_release"})
/* compiled from: AttachmentPickerViewModel.kt */
public final class n {
    private final b aYN;
    private final long time;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof n) {
                n nVar = (n) obj;
                if (kotlin.jvm.internal.i.y(this.aYN, nVar.aYN)) {
                    if ((this.time == nVar.time ? 1 : null) != null) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        b bVar = this.aYN;
        int hashCode = (bVar != null ? bVar.hashCode() : 0) * 31;
        long j = this.time;
        return hashCode + ((int) (j ^ (j >>> 32)));
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SelectEvent(preview=");
        stringBuilder.append(this.aYN);
        stringBuilder.append(", time=");
        stringBuilder.append(this.time);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public n(b bVar, long j) {
        kotlin.jvm.internal.i.f(bVar, "preview");
        this.aYN = bVar;
        this.time = j;
    }

    public /* synthetic */ n(b bVar, long j, int i, f fVar) {
        if ((i & 2) != 0) {
            j = System.currentTimeMillis();
        }
        this(bVar, j);
    }

    public final b TW() {
        return this.aYN;
    }

    public final long getTime() {
        return this.time;
    }
}
