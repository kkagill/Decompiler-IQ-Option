package kotlin.reflect.jvm.internal.structure;

import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.TypeCastException;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\u00020\u0001:\u0001\u000fB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000bJ\u0016\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r2\u0006\u0010\n\u001a\u00020\u000bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u0010"}, bng = {"Lkotlin/reflect/jvm/internal/structure/Java8ParameterNamesLoader;", "", "()V", "cache", "Lkotlin/reflect/jvm/internal/structure/Java8ParameterNamesLoader$Cache;", "getCache", "()Lkotlin/reflect/jvm/internal/structure/Java8ParameterNamesLoader$Cache;", "setCache", "(Lkotlin/reflect/jvm/internal/structure/Java8ParameterNamesLoader$Cache;)V", "buildCache", "member", "Ljava/lang/reflect/Member;", "loadParameterNames", "", "", "Cache", "descriptors.runtime"})
/* compiled from: ReflectJavaMember.kt */
final class a {
    private static a fAv;
    public static final a fAw = new a();

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\t"}, bng = {"Lkotlin/reflect/jvm/internal/structure/Java8ParameterNamesLoader$Cache;", "", "getParameters", "Ljava/lang/reflect/Method;", "getName", "(Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;)V", "getGetName", "()Ljava/lang/reflect/Method;", "getGetParameters", "descriptors.runtime"})
    /* compiled from: ReflectJavaMember.kt */
    public static final class a {
        private final Method fAx;
        private final Method fAy;

        public a(Method method, Method method2) {
            this.fAx = method;
            this.fAy = method2;
        }

        public final Method bQk() {
            return this.fAx;
        }

        public final Method bQl() {
            return this.fAy;
        }
    }

    private a() {
    }

    public final a a(Member member) {
        kotlin.jvm.internal.i.f(member, "member");
        Class cls = member.getClass();
        try {
            return new a(cls.getMethod("getParameters", new Class[0]), b.Q(cls).loadClass("java.lang.reflect.Parameter").getMethod("getName", new Class[0]));
        } catch (NoSuchMethodException unused) {
            return new a(null, null);
        }
    }

    public final List<String> b(Member member) {
        kotlin.jvm.internal.i.f(member, "member");
        a aVar = fAv;
        if (aVar == null) {
            aVar = a(member);
            fAv = aVar;
        }
        Method bQk = aVar.bQk();
        if (bQk != null) {
            Method bQl = aVar.bQl();
            if (bQl != null) {
                Object invoke = bQk.invoke(member, new Object[0]);
                if (invoke != null) {
                    Object[] objArr = (Object[]) invoke;
                    Collection arrayList = new ArrayList(objArr.length);
                    int length = objArr.length;
                    int i = 0;
                    while (i < length) {
                        Object invoke2 = bQl.invoke(objArr[i], new Object[0]);
                        if (invoke2 != null) {
                            arrayList.add((String) invoke2);
                            i++;
                        } else {
                            throw new TypeCastException("null cannot be cast to non-null type kotlin.String");
                        }
                    }
                    return (List) arrayList;
                }
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<*>");
            }
        }
        return null;
    }
}
