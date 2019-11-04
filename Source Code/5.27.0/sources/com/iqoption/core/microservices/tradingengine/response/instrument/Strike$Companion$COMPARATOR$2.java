package com.iqoption.core.microservices.tradingengine.response.instrument;

import java.util.Comparator;
import kotlin.i;
import kotlin.jvm.internal.Lambda;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003H\n¢\u0006\u0002\b\u0004"}, bng = {"<anonymous>", "Ljava/util/Comparator;", "Lcom/iqoption/core/microservices/tradingengine/response/instrument/Strike;", "Lkotlin/Comparator;", "invoke"})
/* compiled from: Strike.kt */
final class Strike$Companion$COMPARATOR$2 extends Lambda implements kotlin.jvm.a.a<Comparator<e>> {
    public static final Strike$Companion$COMPARATOR$2 bBd = new Strike$Companion$COMPARATOR$2();

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u001e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, bng = {"<anonymous>", "", "T", "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2"})
    /* compiled from: Comparisons.kt */
    public static final class a<T> implements Comparator<T> {
        public final int compare(T t, T t2) {
            return b.c(Long.valueOf(((e) t).bAW), Long.valueOf(((e) t2).bAW));
        }
    }

    Strike$Companion$COMPARATOR$2() {
        super(0);
    }

    /* renamed from: aiG */
    public final Comparator<e> invoke() {
        return new a();
    }
}
