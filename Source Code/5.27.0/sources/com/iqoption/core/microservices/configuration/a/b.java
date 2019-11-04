package com.iqoption.core.microservices.configuration.a;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import kotlin.TypeCastException;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J$\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0007J \u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u00050\tj\b\u0012\u0004\u0012\u00020\u0005`\n2\u0006\u0010\u0003\u001a\u00020\u0007H\u0002¨\u0006\u000b"}, bng = {"Lcom/iqoption/core/microservices/configuration/response/CountriesUtils;", "", "()V", "filter", "", "Lcom/iqoption/core/microservices/configuration/response/Country;", "countries", "", "filteredComparator", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "core_release"})
/* compiled from: CountriesUtils.kt */
public final class b {
    public static final b bru = new b();

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u001e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, bng = {"<anonymous>", "", "T", "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2"})
    /* compiled from: Comparisons.kt */
    public static final class a<T> implements Comparator<T> {
        public final int compare(T t, T t2) {
            return b.c(((c) t).getName(), ((c) t2).getName());
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u001e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, bng = {"<anonymous>", "", "T", "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2"})
    /* compiled from: Comparisons.kt */
    public static final class b<T> implements Comparator<T> {
        final /* synthetic */ String brv;

        public b(String str) {
            this.brv = str;
        }

        public final int compare(T t, T t2) {
            boolean z = true;
            Comparable valueOf = Boolean.valueOf(v.a((CharSequence) ((c) t).getName(), this.brv, 0, false, 6, null) != 0);
            if (v.a((CharSequence) ((c) t2).getName(), this.brv, 0, false, 6, null) == 0) {
                z = false;
            }
            return b.c(valueOf, Boolean.valueOf(z));
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u001e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, bng = {"<anonymous>", "", "T", "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$thenBy$1"})
    /* compiled from: Comparisons.kt */
    public static final class c<T> implements Comparator<T> {
        final /* synthetic */ Comparator brw;

        public c(Comparator comparator) {
            this.brw = comparator;
        }

        public final int compare(T t, T t2) {
            int compare = this.brw.compare(t, t2);
            return compare != 0 ? compare : b.c(((c) t).getName(), ((c) t2).getName());
        }
    }

    private b() {
    }

    public final List<c> b(List<c> list, String str) {
        kotlin.jvm.internal.i.f(list, "countries");
        CharSequence charSequence = str;
        int i = (charSequence == null || u.Y(charSequence)) ? 1 : 0;
        i ^= 1;
        if (i != 0) {
            Collection arrayList = new ArrayList();
            for (Object next : list) {
                String name = ((c) next).getName();
                String str2 = "null cannot be cast to non-null type java.lang.String";
                if (name != null) {
                    name = name.toLowerCase();
                    String str3 = "(this as java.lang.String).toLowerCase()";
                    kotlin.jvm.internal.i.e(name, str3);
                    CharSequence charSequence2 = name;
                    if (str == null) {
                        kotlin.jvm.internal.i.bnJ();
                    }
                    if (str != null) {
                        str2 = str.toLowerCase();
                        kotlin.jvm.internal.i.e(str2, str3);
                        if (v.b(charSequence2, (CharSequence) str2, false, 2, null)) {
                            arrayList.add(next);
                        }
                    } else {
                        throw new TypeCastException(str2);
                    }
                }
                throw new TypeCastException(str2);
            }
            list = (List) arrayList;
        }
        if (i == 0) {
            return u.a((Iterable) list, (Comparator) new a());
        }
        Iterable iterable = list;
        if (str == null) {
            kotlin.jvm.internal.i.bnJ();
        }
        return u.a(iterable, gx(str));
    }

    private final Comparator<c> gx(String str) {
        return new c(new b(str));
    }
}
