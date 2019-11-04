package com.iqoption.gl;

import com.iqoption.core.gl.ChartLibrary;
import com.iqoption.core.gl.ChartWindow;
import kotlin.i;
import kotlin.jvm.a.a;
import kotlin.jvm.internal.Lambda;

@i(bne = {1, 1, 15}, bnf = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, bng = {"<anonymous>", "Lcom/iqoption/core/gl/ChartWindow;", "invoke"})
/* compiled from: Charts.kt */
final class Charts$regular$2 extends Lambda implements a<ChartWindow> {
    public static final Charts$regular$2 drB = new Charts$regular$2();

    Charts$regular$2() {
        super(0);
    }

    /* renamed from: aIz */
    public final ChartWindow invoke() {
        return ChartLibrary.createWindow(NativeHandler.instance());
    }
}
