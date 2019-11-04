package com.iqoption.charttools;

import com.iqoption.charttools.model.b.a;
import com.iqoption.charttools.q.b;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\bH\u0016J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0013"}, bng = {"Lcom/iqoption/charttools/TemplateUpdated;", "Lcom/iqoption/charttools/TemplateEvent;", "template", "Lcom/iqoption/charttools/model/template/ChartTemplate;", "(Lcom/iqoption/charttools/model/template/ChartTemplate;)V", "getTemplate", "()Lcom/iqoption/charttools/model/template/ChartTemplate;", "asUpdate", "Lcom/iqoption/charttools/TemplateManager$TemplatesUpdate;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "techtools_release"})
/* compiled from: TemplateManager.kt */
public final class s extends p {
    private final a aEv;

    /* JADX WARNING: Missing block: B:4:0x0010, code skipped:
            if (kotlin.jvm.internal.i.y(r1.aEv, ((com.iqoption.charttools.s) r2).aEv) != false) goto L_0x0015;
     */
    public boolean equals(java.lang.Object r2) {
        /*
        r1 = this;
        if (r1 == r2) goto L_0x0015;
    L_0x0002:
        r0 = r2 instanceof com.iqoption.charttools.s;
        if (r0 == 0) goto L_0x0013;
    L_0x0006:
        r2 = (com.iqoption.charttools.s) r2;
        r0 = r1.aEv;
        r2 = r2.aEv;
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
        throw new UnsupportedOperationException("Method not decompiled: com.iqoption.charttools.s.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        a aVar = this.aEv;
        return aVar != null ? aVar.hashCode() : 0;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("TemplateUpdated(template=");
        stringBuilder.append(this.aEv);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public s(a aVar) {
        kotlin.jvm.internal.i.f(aVar, "template");
        super();
        this.aEv = aVar;
    }

    public b Mt() {
        return new b(null, null, this.aEv, null, 11, null);
    }
}
