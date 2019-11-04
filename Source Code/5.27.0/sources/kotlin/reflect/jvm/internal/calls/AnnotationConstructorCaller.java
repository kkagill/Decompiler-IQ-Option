package kotlin.reflect.jvm.internal.calls;

import com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.i;
import kotlin.reflect.jvm.internal.calls.c.a;
import kotlin.reflect.jvm.internal.structure.b;

@i(bne = {1, 1, 15}, bnf = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0002\b\u0004\b\u0000\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001:\u0002 !B?\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0006¢\u0006\u0002\u0010\u000eJ\u001b\u0010\u001c\u001a\u0004\u0018\u00010\u00102\n\u0010\u001d\u001a\u0006\u0012\u0002\b\u00030\u001eH\u0016¢\u0006\u0002\u0010\u001fR\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u0006X\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0006X\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0004X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u00028VX\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0006X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u00168VX\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\""}, bng = {"Lkotlin/reflect/jvm/internal/calls/AnnotationConstructorCaller;", "Lkotlin/reflect/jvm/internal/calls/Caller;", "", "jClass", "Ljava/lang/Class;", "parameterNames", "", "", "callMode", "Lkotlin/reflect/jvm/internal/calls/AnnotationConstructorCaller$CallMode;", "origin", "Lkotlin/reflect/jvm/internal/calls/AnnotationConstructorCaller$Origin;", "methods", "Ljava/lang/reflect/Method;", "(Ljava/lang/Class;Ljava/util/List;Lkotlin/reflect/jvm/internal/calls/AnnotationConstructorCaller$CallMode;Lkotlin/reflect/jvm/internal/calls/AnnotationConstructorCaller$Origin;Ljava/util/List;)V", "defaultValues", "", "erasedParameterTypes", "member", "getMember", "()Ljava/lang/Void;", "parameterTypes", "Ljava/lang/reflect/Type;", "getParameterTypes", "()Ljava/util/List;", "returnType", "getReturnType", "()Ljava/lang/reflect/Type;", "call", "args", "", "([Ljava/lang/Object;)Ljava/lang/Object;", "CallMode", "Origin", "kotlin-reflect-api"})
/* compiled from: AnnotationConstructorCaller.kt */
public final class AnnotationConstructorCaller implements c {
    private final List<Type> Yq;
    private final List<Method> bEh;
    private final Class<?> eVY;
    private final List<Class<?>> eYs;
    private final List<Object> eYt;
    private final List<String> eYu;
    private final CallMode eYv;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, bng = {"Lkotlin/reflect/jvm/internal/calls/AnnotationConstructorCaller$CallMode;", "", "(Ljava/lang/String;I)V", "CALL_BY_NAME", "POSITIONAL_CALL", "kotlin-reflect-api"})
    /* compiled from: AnnotationConstructorCaller.kt */
    public enum CallMode {
        CALL_BY_NAME,
        POSITIONAL_CALL
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, bng = {"Lkotlin/reflect/jvm/internal/calls/AnnotationConstructorCaller$Origin;", "", "(Ljava/lang/String;I)V", "JAVA", "KOTLIN", "kotlin-reflect-api"})
    /* compiled from: AnnotationConstructorCaller.kt */
    public enum Origin {
        JAVA,
        KOTLIN
    }

    public Void bpX() {
        return null;
    }

    public AnnotationConstructorCaller(Class<?> cls, List<String> list, CallMode callMode, Origin origin, List<Method> list2) {
        kotlin.jvm.internal.i.f(cls, "jClass");
        kotlin.jvm.internal.i.f(list, "parameterNames");
        kotlin.jvm.internal.i.f(callMode, "callMode");
        kotlin.jvm.internal.i.f(origin, ConditionalUserProperty.ORIGIN);
        kotlin.jvm.internal.i.f(list2, "methods");
        this.eVY = cls;
        this.eYu = list;
        this.eYv = callMode;
        this.bEh = list2;
        Iterable<Method> iterable = this.bEh;
        Collection arrayList = new ArrayList(n.e(iterable, 10));
        for (Method genericReturnType : iterable) {
            arrayList.add(genericReturnType.getGenericReturnType());
        }
        this.Yq = (List) arrayList;
        iterable = this.bEh;
        arrayList = new ArrayList(n.e(iterable, 10));
        for (Method genericReturnType2 : iterable) {
            Object returnType = genericReturnType2.getReturnType();
            kotlin.jvm.internal.i.e(returnType, "it");
            Class T = b.T(returnType);
            if (T != null) {
                returnType = T;
            }
            arrayList.add(returnType);
        }
        this.eYs = (List) arrayList;
        iterable = this.bEh;
        arrayList = new ArrayList(n.e(iterable, 10));
        for (Method defaultValue : iterable) {
            arrayList.add(defaultValue.getDefaultValue());
        }
        this.eYt = (List) arrayList;
        if (this.eYv == CallMode.POSITIONAL_CALL && origin == Origin.JAVA && (u.d((Iterable) this.eYu, (Object) ConditionalUserProperty.VALUE).isEmpty() ^ 1) != 0) {
            throw new UnsupportedOperationException("Positional call of a Java annotation constructor is allowed only if there are no parameters or one parameter named \"value\". This restriction exists because Java annotations (in contrast to Kotlin)do not impose any order on their arguments. Use KCallable#callBy instead.");
        }
    }

    public void R(Object[] objArr) {
        kotlin.jvm.internal.i.f(objArr, "args");
        a.a(this, objArr);
    }

    public /* synthetic */ Member bpY() {
        return (Member) bpX();
    }

    public /* synthetic */ AnnotationConstructorCaller(Class cls, List list, CallMode callMode, Origin origin, List list2, int i, f fVar) {
        if ((i & 16) != 0) {
            Iterable<String> iterable = list;
            Collection arrayList = new ArrayList(n.e(iterable, 10));
            for (String declaredMethod : iterable) {
                arrayList.add(cls.getDeclaredMethod(declaredMethod, new Class[0]));
            }
            list2 = (List) arrayList;
        }
        this(cls, list, callMode, origin, list2);
    }

    public Type bpZ() {
        return this.eVY;
    }

    public List<Type> bqa() {
        return this.Yq;
    }

    public Object Q(Object[] objArr) {
        kotlin.jvm.internal.i.f(objArr, "args");
        R(objArr);
        Collection arrayList = new ArrayList(objArr.length);
        int length = objArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            Object obj = objArr[i];
            int i3 = i2 + 1;
            if (obj == null && this.eYv == CallMode.CALL_BY_NAME) {
                obj = this.eYt.get(i2);
            } else {
                obj = a.b(obj, (Class) this.eYs.get(i2));
            }
            if (obj != null) {
                arrayList.add(obj);
                i++;
                i2 = i3;
            } else {
                a.a(i2, (String) this.eYu.get(i2), (Class) this.eYs.get(i2));
                throw null;
            }
        }
        return a.a(this.eVY, af.ac(u.e((Iterable) this.eYu, (Iterable) (List) arrayList)), this.bEh);
    }
}
