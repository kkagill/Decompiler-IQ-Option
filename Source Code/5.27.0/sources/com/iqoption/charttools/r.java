package com.iqoption.charttools;

import com.iqoption.charttools.q.b;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\bH\u0016J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0013"}, bng = {"Lcom/iqoption/charttools/TemplateRemoved;", "Lcom/iqoption/charttools/TemplateEvent;", "id", "", "(J)V", "getId", "()J", "asUpdate", "Lcom/iqoption/charttools/TemplateManager$TemplatesUpdate;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "techtools_release"})
/* compiled from: TemplateManager.kt */
public final class r extends p {
    private final long id;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof r) {
                if ((this.id == ((r) obj).id ? 1 : null) != null) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        long j = this.id;
        return (int) (j ^ (j >>> 32));
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("TemplateRemoved(id=");
        stringBuilder.append(this.id);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public r(long j) {
        super();
        this.id = j;
    }

    public b Mt() {
        return new b(null, Long.valueOf(this.id), null, null, 13, null);
    }
}
