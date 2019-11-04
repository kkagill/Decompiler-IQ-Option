package kotlin.reflect.jvm.internal.calls;

import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;
import kotlin.TypeCastException;
import kotlin.i;
import kotlin.reflect.jvm.internal.calls.d.d;

@i(bne = {1, 1, 15}, bnf = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001:\u0002\u0016\u0017B\u001d\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J%\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\u0014H\u0004¢\u0006\u0002\u0010\u0015R\u0013\u0010\b\u001a\u0004\u0018\u00010\u00028F¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0003\u001a\u00020\u0002X\u0004¢\u0006\u0002\n\u0000\u0001\u0002\u0018\u0019¨\u0006\u001a"}, bng = {"Lkotlin/reflect/jvm/internal/calls/InternalUnderlyingValOfInlineClass;", "Lkotlin/reflect/jvm/internal/calls/Caller;", "Ljava/lang/reflect/Method;", "unboxMethod", "parameterTypes", "", "Ljava/lang/reflect/Type;", "(Ljava/lang/reflect/Method;Ljava/util/List;)V", "member", "getMember", "()Ljava/lang/reflect/Method;", "getParameterTypes", "()Ljava/util/List;", "returnType", "getReturnType", "()Ljava/lang/reflect/Type;", "callMethod", "", "instance", "args", "", "(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", "Bound", "Unbound", "Lkotlin/reflect/jvm/internal/calls/InternalUnderlyingValOfInlineClass$Unbound;", "Lkotlin/reflect/jvm/internal/calls/InternalUnderlyingValOfInlineClass$Bound;", "kotlin-reflect-api"})
/* compiled from: InternalUnderlyingValOfInlineClass.kt */
public abstract class h implements c<Method> {
    private final List<Type> Yq;
    private final Type eYC;
    private final Method eYM;

    @i(bne = {1, 1, 15}, bnf = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u001b\u0010\b\u001a\u0004\u0018\u00010\u00062\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\nH\u0016¢\u0006\u0002\u0010\u000bR\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, bng = {"Lkotlin/reflect/jvm/internal/calls/InternalUnderlyingValOfInlineClass$Bound;", "Lkotlin/reflect/jvm/internal/calls/InternalUnderlyingValOfInlineClass;", "Lkotlin/reflect/jvm/internal/calls/BoundCaller;", "unboxMethod", "Ljava/lang/reflect/Method;", "boundReceiver", "", "(Ljava/lang/reflect/Method;Ljava/lang/Object;)V", "call", "args", "", "([Ljava/lang/Object;)Ljava/lang/Object;", "kotlin-reflect-api"})
    /* compiled from: InternalUnderlyingValOfInlineClass.kt */
    public static final class a extends h implements b {
        private final Object eYF;

        public a(Method method, Object obj) {
            kotlin.jvm.internal.i.f(method, "unboxMethod");
            super(method, m.emptyList(), null);
            this.eYF = obj;
        }

        public Object Q(Object[] objArr) {
            kotlin.jvm.internal.i.f(objArr, "args");
            R(objArr);
            return c(this.eYF, objArr);
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\bH\u0016¢\u0006\u0002\u0010\t¨\u0006\n"}, bng = {"Lkotlin/reflect/jvm/internal/calls/InternalUnderlyingValOfInlineClass$Unbound;", "Lkotlin/reflect/jvm/internal/calls/InternalUnderlyingValOfInlineClass;", "unboxMethod", "Ljava/lang/reflect/Method;", "(Ljava/lang/reflect/Method;)V", "call", "", "args", "", "([Ljava/lang/Object;)Ljava/lang/Object;", "kotlin-reflect-api"})
    /* compiled from: InternalUnderlyingValOfInlineClass.kt */
    public static final class b extends h {
        public b(Method method) {
            kotlin.jvm.internal.i.f(method, "unboxMethod");
            super(method, l.listOf(method.getDeclaringClass()), null);
        }

        public Object Q(Object[] objArr) {
            kotlin.jvm.internal.i.f(objArr, "args");
            R(objArr);
            Object obj = objArr[0];
            d dVar = d.eYE;
            if (objArr.length <= 1) {
                objArr = new Object[0];
            } else {
                objArr = h.copyOfRange(objArr, 1, objArr.length);
                if (objArr == null) {
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
                }
            }
            return c(obj, objArr);
        }
    }

    /* renamed from: bqf */
    public final Method bpY() {
        return null;
    }

    private h(Method method, List<? extends Type> list) {
        this.eYM = method;
        this.Yq = list;
        Class returnType = this.eYM.getReturnType();
        kotlin.jvm.internal.i.e(returnType, "unboxMethod.returnType");
        this.eYC = returnType;
    }

    public /* synthetic */ h(Method method, List list, f fVar) {
        this(method, list);
    }

    public void R(Object[] objArr) {
        kotlin.jvm.internal.i.f(objArr, "args");
        kotlin.reflect.jvm.internal.calls.c.a.a(this, objArr);
    }

    public final List<Type> bqa() {
        return this.Yq;
    }

    public final Type bpZ() {
        return this.eYC;
    }

    /* Access modifiers changed, original: protected|final */
    public final Object c(Object obj, Object[] objArr) {
        kotlin.jvm.internal.i.f(objArr, "args");
        return this.eYM.invoke(obj, Arrays.copyOf(objArr, objArr.length));
    }
}
