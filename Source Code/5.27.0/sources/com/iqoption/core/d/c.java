package com.iqoption.core.d;

import kotlin.f.d;
import kotlin.i;
import kotlin.jvm.a.b;
import kotlin.l;

@i(bne = {1, 1, 15}, bnf = {"\u0000@\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a%\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0003¢\u0006\u0002\u0010\u0005\u001a\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u00012\u0006\u0010\u0004\u001a\u00020\u0007\u001a\u001a\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t0\u00012\u0006\u0010\u0004\u001a\u00020\t\u001a\u001a\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b0\u00012\u0006\u0010\u0004\u001a\u00020\u000b\u001a\u001a\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\r0\u00012\u0006\u0010\u0004\u001a\u00020\r\u001a,\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u00032\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u00020\u00110\u0010\u001aO\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0003\"\u0004\b\u0001\u0010\u00122\u0006\u0010\u0013\u001a\u0002H\u00122\u001f\b\u0004\u0010\u000f\u001a\u0019\u0012\u0004\u0012\u0002H\u0012\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u00020\u00110\u0014¢\u0006\u0002\b\u0015H\b¢\u0006\u0002\u0010\u0016\u001a+\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u0001H\u00030\u0001\"\u0004\b\u0000\u0010\u00032\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u0001H\u0003¢\u0006\u0002\u0010\u0005¨\u0006\u0019"}, bng = {"atomic", "Lkotlin/properties/ReadWriteProperty;", "", "T", "initial", "(Ljava/lang/Object;)Lkotlin/properties/ReadWriteProperty;", "atomicBool", "", "atomicDouble", "", "atomicInt", "", "atomicLong", "", "bindable", "onBind", "Lkotlin/Function1;", "", "C", "context", "Lkotlin/Function2;", "Lkotlin/ExtensionFunctionType;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Lkotlin/properties/ReadWriteProperty;", "weak", "value", "core_release"})
/* compiled from: Delegates.kt */
public final class c {
    public static final <T> d<Object, T> bK(T t) {
        return new a(t);
    }

    public static final <T> d<Object, T> j(b<? super T, l> bVar) {
        kotlin.jvm.internal.i.f(bVar, "onBind");
        return new b(bVar);
    }

    public static /* synthetic */ d c(Object obj, int i, Object obj2) {
        if ((i & 1) != 0) {
            obj = null;
        }
        return bL(obj);
    }

    public static final <T> d<Object, T> bL(T t) {
        return new d(t);
    }
}
