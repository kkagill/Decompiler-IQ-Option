package com.iqoption.charttools.constructor;

import com.iqoption.charttools.model.indicator.constructor.c;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, bng = {"Lcom/iqoption/charttools/constructor/InputGroupDescription;", "Lcom/iqoption/charttools/constructor/InputAdapterItem;", "id", "", "text", "", "group", "Lcom/iqoption/charttools/model/indicator/constructor/InputGroup;", "(ILjava/lang/String;Lcom/iqoption/charttools/model/indicator/constructor/InputGroup;)V", "getGroup", "()Lcom/iqoption/charttools/model/indicator/constructor/InputGroup;", "getText", "()Ljava/lang/String;", "techtools_release"})
/* compiled from: InputAdapterItems.kt */
public final class m extends f {
    private final c aFu;
    private final String text;

    public final String getText() {
        return this.text;
    }

    public m(int i, String str, c cVar) {
        kotlin.jvm.internal.i.f(str, "text");
        kotlin.jvm.internal.i.f(cVar, "group");
        super(i, null);
        this.text = str;
        this.aFu = cVar;
    }
}
