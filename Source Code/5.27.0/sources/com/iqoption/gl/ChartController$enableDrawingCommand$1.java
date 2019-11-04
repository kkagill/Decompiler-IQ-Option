package com.iqoption.gl;

import com.iqoption.core.gl.ChartLibrary;
import kotlin.i;
import kotlin.jvm.a.a;
import kotlin.jvm.internal.Lambda;

@i(bne = {1, 1, 15}, bnf = {"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, bng = {"<anonymous>", "", "invoke"})
/* compiled from: ChartController.kt */
final class ChartController$enableDrawingCommand$1 extends Lambda implements a<Boolean> {
    public static final ChartController$enableDrawingCommand$1 dry = new ChartController$enableDrawingCommand$1();

    ChartController$enableDrawingCommand$1() {
        super(0);
    }

    public final boolean invoke() {
        return ChartLibrary.isInitialized();
    }
}
