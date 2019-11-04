package com.iqoption.core.ext;

import java.text.SimpleDateFormat;
import java.util.Locale;
import kotlin.i;
import kotlin.jvm.a.a;
import kotlin.jvm.internal.Lambda;

@i(bne = {1, 1, 15}, bnf = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, bng = {"<anonymous>", "Ljava/text/SimpleDateFormat;", "invoke"})
/* compiled from: CoreExtensions.kt */
final class CoreExt$TIME_FORMAT$2 extends Lambda implements a<SimpleDateFormat> {
    public static final CoreExt$TIME_FORMAT$2 bgX = new CoreExt$TIME_FORMAT$2();

    CoreExt$TIME_FORMAT$2() {
        super(0);
    }

    /* renamed from: Xi */
    public final SimpleDateFormat invoke() {
        return new SimpleDateFormat("HH:mm", Locale.getDefault());
    }
}
