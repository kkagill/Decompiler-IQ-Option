package com.iqoption.core.features.instrument;

import java.util.ArrayList;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, bng = {"Lcom/iqoption/core/features/instrument/DefaultTabsList;", "Ljava/util/ArrayList;", "Lcom/iqoption/core/features/instrument/DefaultTabParam;", "()V", "core_release"})
/* compiled from: DefaultTabParam.kt */
public final class DefaultTabsList extends ArrayList<a> {
    public boolean a(a aVar) {
        return super.contains(aVar);
    }

    public int b(a aVar) {
        return super.indexOf(aVar);
    }

    public int c(a aVar) {
        return super.lastIndexOf(aVar);
    }

    public final boolean contains(Object obj) {
        return obj instanceof a ? a((a) obj) : false;
    }

    public boolean d(a aVar) {
        return super.remove(aVar);
    }

    public int getSize() {
        return super.size();
    }

    public final int indexOf(Object obj) {
        return obj instanceof a ? b((a) obj) : -1;
    }

    public final int lastIndexOf(Object obj) {
        return obj instanceof a ? c((a) obj) : -1;
    }

    public final boolean remove(Object obj) {
        return obj instanceof a ? d((a) obj) : false;
    }

    public final int size() {
        return getSize();
    }
}
