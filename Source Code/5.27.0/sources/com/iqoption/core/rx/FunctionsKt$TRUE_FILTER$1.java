package com.iqoption.core.rx;

import kotlin.i;
import kotlin.jvm.a.b;
import kotlin.jvm.internal.Lambda;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, bng = {"<anonymous>", "", "<anonymous parameter 0>", "", "invoke"})
/* compiled from: Functions.kt */
final class FunctionsKt$TRUE_FILTER$1 extends Lambda implements b<Object, Boolean> {
    public static final FunctionsKt$TRUE_FILTER$1 bEO = new FunctionsKt$TRUE_FILTER$1();

    FunctionsKt$TRUE_FILTER$1() {
        super(1);
    }

    public final boolean bP(Object obj) {
        kotlin.jvm.internal.i.f(obj, "<anonymous parameter 0>");
        return true;
    }

    public /* synthetic */ Object invoke(Object obj) {
        return Boolean.valueOf(bP(obj));
    }
}
