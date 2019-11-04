package com.iqoption.core.util;

import java.util.Arrays;
import java.util.NoSuchElementException;
import kotlin.TypeCastException;
import kotlin.i;
import kotlin.jvm.internal.n;

@i(bne = {1, 1, 15}, bnf = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 $*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001$B\u0011\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00018\u0000¢\u0006\u0002\u0010\u0004J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0002J \u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u000bJ,\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\r0\u0000\"\u0004\b\u0001\u0010\r2\u0018\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\r0\u00000\u000bJ\u000b\u0010\u000f\u001a\u00028\u0000¢\u0006\u0002\u0010\u0010J\r\u0010\u0011\u001a\u0004\u0018\u00018\u0000¢\u0006\u0002\u0010\u0010J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u001a\u0010\u0014\u001a\u00020\u00152\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00150\u000bJ\u0006\u0010\u0017\u001a\u00020\u0007J.\u0010\u0018\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\r0\u0000\"\u0004\b\u0001\u0010\r2\u0018\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\r0\u00000\u000bJ\u0013\u0010\u0019\u001a\u00028\u00002\u0006\u0010\b\u001a\u00028\u0000¢\u0006\u0002\u0010\u001aJ\u0019\u0010\u001b\u001a\u00028\u00002\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u001c¢\u0006\u0002\u0010\u001dJ#\u0010\u001e\u001a\u00028\u0000\"\b\b\u0001\u0010\u001f*\u00020 2\f\u0010!\u001a\b\u0012\u0004\u0012\u0002H\u001f0\u001c¢\u0006\u0002\u0010\u001dJ\b\u0010\"\u001a\u00020#H\u0016R\u0012\u0010\u0003\u001a\u0004\u0018\u00018\u0000X\u0004¢\u0006\u0004\n\u0002\u0010\u0005¨\u0006%"}, bng = {"Lcom/iqoption/core/util/Optional;", "T", "", "value", "(Ljava/lang/Object;)V", "Ljava/lang/Object;", "equals", "", "other", "filter", "predicate", "Lkotlin/Function1;", "flatMap", "U", "mapper", "get", "()Ljava/lang/Object;", "getOrNull", "hashCode", "", "ifPresent", "", "consumer", "isPresent", "map", "orElse", "(Ljava/lang/Object;)Ljava/lang/Object;", "orElseGet", "Lkotlin/Function0;", "(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "orElseThrow", "X", "", "exceptionSupplier", "toString", "", "Companion", "core_release"})
/* compiled from: Optional.kt */
public final class z<T> {
    private static final z<Object> bRf = new z(null, 1, null);
    public static final a bRg = new a();
    private final T value;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00060\u0004\"\u0004\b\u0001\u0010\u0006H\u0007J#\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00060\u0004\"\u0004\b\u0001\u0010\u00062\b\u0010\b\u001a\u0004\u0018\u0001H\u0006H\u0007¢\u0006\u0002\u0010\tR\u0016\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, bng = {"Lcom/iqoption/core/util/Optional$Companion;", "", "()V", "EMPTY", "Lcom/iqoption/core/util/Optional;", "empty", "T", "of", "value", "(Ljava/lang/Object;)Lcom/iqoption/core/util/Optional;", "core_release"})
    /* compiled from: Optional.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final <T> z<T> any() {
            z anx = z.bRf;
            if (anx != null) {
                return anx;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.iqoption.core.util.Optional<T>");
        }

        public final <T> z<T> bX(T t) {
            return new z(t);
        }
    }

    public z() {
        this(null, 1, null);
    }

    public z(T t) {
        this.value = t;
    }

    public /* synthetic */ z(Object obj, int i, f fVar) {
        if ((i & 1) != 0) {
            obj = null;
        }
        this(obj);
    }

    public final T get() {
        Object obj = this.value;
        if (obj != null) {
            return obj;
        }
        throw new NoSuchElementException("No value present");
    }

    public final T anw() {
        return this.value;
    }

    public final boolean isPresent() {
        return this.value != null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((kotlin.jvm.internal.i.y(getClass(), obj != null ? obj.getClass() : null) ^ 1) != 0) {
            return false;
        }
        if (obj != null) {
            if ((kotlin.jvm.internal.i.y(this.value, ((z) obj).value) ^ 1) != 0) {
                return false;
            }
            return true;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.iqoption.core.util.Optional<*>");
    }

    public int hashCode() {
        Object obj = this.value;
        return obj != null ? obj.hashCode() : 0;
    }

    public String toString() {
        if (this.value == null) {
            return "Optional.empty";
        }
        n nVar = n.eWf;
        Object[] objArr = new Object[]{this.value};
        String format = String.format("Optional[%s]", Arrays.copyOf(objArr, objArr.length));
        kotlin.jvm.internal.i.e(format, "java.lang.String.format(format, *args)");
        return format;
    }
}
