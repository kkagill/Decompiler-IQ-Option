package kotlin.reflect.jvm.internal;

import com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import kotlin.jvm.internal.CallableReference;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.k;
import kotlin.reflect.e;
import kotlin.reflect.j;
import kotlin.reflect.jvm.internal.calls.c;
import kotlin.reflect.jvm.internal.calls.d;
import kotlin.reflect.jvm.internal.calls.d.h.f;
import kotlin.reflect.jvm.internal.calls.g;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.s;
import kotlin.reflect.jvm.internal.x.a;
import kotlin.reflect.jvm.internal.x.b;

@kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00032\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00042\u00020\u0005B)\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0002\u0010\fB\u0017\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0002\u0010\u000fB5\b\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0002¢\u0006\u0002\u0010\u0012J&\u00102\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u000304032\n\u00105\u001a\u0006\u0012\u0002\b\u0003042\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0010\u00106\u001a\u0002072\u0006\u00105\u001a\u000208H\u0002J\u0010\u00109\u001a\u0002072\u0006\u00105\u001a\u000208H\u0002J\u0010\u0010:\u001a\u0002072\u0006\u00105\u001a\u000208H\u0002J\u0013\u0010;\u001a\u00020)2\b\u0010<\u001a\u0004\u0018\u00010\u0002H\u0002J\b\u0010=\u001a\u00020\u0014H\u0016J\b\u0010>\u001a\u00020\tH\u0016R\u0014\u0010\u0013\u001a\u00020\u00148VX\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\u00028BX\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u001f\u0010\u0019\u001a\u0006\u0012\u0002\b\u00030\u001a8VX\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R!\u0010!\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u001a8VX\u0002¢\u0006\f\n\u0004\b#\u0010\u001e\u001a\u0004\b\"\u0010\u001cR\u001b\u0010\r\u001a\u00020\u000e8VX\u0002¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b$\u0010%R\u0014\u0010(\u001a\u00020)8VX\u0004¢\u0006\u0006\u001a\u0004\b(\u0010*R\u0014\u0010+\u001a\u00020)8VX\u0004¢\u0006\u0006\u001a\u0004\b+\u0010*R\u0014\u0010,\u001a\u00020)8VX\u0004¢\u0006\u0006\u001a\u0004\b,\u0010*R\u0014\u0010-\u001a\u00020)8VX\u0004¢\u0006\u0006\u001a\u0004\b-\u0010*R\u0014\u0010.\u001a\u00020)8VX\u0004¢\u0006\u0006\u001a\u0004\b.\u0010*R\u0014\u0010/\u001a\u00020)8VX\u0004¢\u0006\u0006\u001a\u0004\b/\u0010*R\u0014\u0010\b\u001a\u00020\t8VX\u0004¢\u0006\u0006\u001a\u0004\b0\u00101R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0002X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000¨\u0006?"}, bng = {"Lkotlin/reflect/jvm/internal/KFunctionImpl;", "Lkotlin/reflect/jvm/internal/KCallableImpl;", "", "Lkotlin/reflect/KFunction;", "Lkotlin/jvm/internal/FunctionBase;", "Lkotlin/reflect/jvm/internal/FunctionWithAllInvokes;", "container", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "name", "", "signature", "boundReceiver", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V", "descriptor", "Lkotlin/reflect/jvm/internal/impl/descriptors/FunctionDescriptor;", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;)V", "descriptorInitialValue", "rawBoundReceiver", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Ljava/lang/String;Ljava/lang/String;Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;Ljava/lang/Object;)V", "arity", "", "getArity", "()I", "getBoundReceiver", "()Ljava/lang/Object;", "caller", "Lkotlin/reflect/jvm/internal/calls/Caller;", "getCaller", "()Lkotlin/reflect/jvm/internal/calls/Caller;", "caller$delegate", "Lkotlin/reflect/jvm/internal/ReflectProperties$LazyVal;", "getContainer", "()Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "defaultCaller", "getDefaultCaller", "defaultCaller$delegate", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;", "descriptor$delegate", "Lkotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal;", "isBound", "", "()Z", "isExternal", "isInfix", "isInline", "isOperator", "isSuspend", "getName", "()Ljava/lang/String;", "createConstructorCaller", "Lkotlin/reflect/jvm/internal/calls/CallerImpl;", "Ljava/lang/reflect/Constructor;", "member", "createInstanceMethodCaller", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$Method;", "Ljava/lang/reflect/Method;", "createJvmStaticInObjectCaller", "createStaticMethodCaller", "equals", "other", "hashCode", "toString", "kotlin-reflect-api"})
/* compiled from: KFunctionImpl.kt */
public final class i extends e<Object> implements h<Object>, e<Object>, b {
    static final /* synthetic */ j[] anY = new j[]{k.a(new PropertyReference1Impl(k.G(i.class), "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;")), k.a(new PropertyReference1Impl(k.G(i.class), "caller", "getCaller()Lkotlin/reflect/jvm/internal/calls/Caller;")), k.a(new PropertyReference1Impl(k.G(i.class), "defaultCaller", "getDefaultCaller()Lkotlin/reflect/jvm/internal/calls/Caller;"))};
    private final a eWX;
    private final b eXA;
    private final KDeclarationContainerImpl eXB;
    private final Object eXC;
    private final b eXz;
    private final String signature;

    public c<?> boy() {
        return (c) this.eXz.B(this, anY[1]);
    }

    public c<?> boz() {
        return (c) this.eXA.B(this, anY[2]);
    }

    /* renamed from: bpb */
    public s box() {
        return (s) this.eWX.B(this, anY[0]);
    }

    public Object a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        return b.a.a(this, obj, obj2, obj3, obj4, obj5, obj6, obj7);
    }

    public Object b(Object obj, Object obj2, Object obj3) {
        return b.a.a(this, obj, obj2, obj3);
    }

    public Object invoke() {
        return b.a.a(this);
    }

    public Object invoke(Object obj) {
        return b.a.a(this, obj);
    }

    public Object w(Object obj, Object obj2) {
        return b.a.a(this, obj, obj2);
    }

    public KDeclarationContainerImpl boA() {
        return this.eXB;
    }

    /* synthetic */ i(KDeclarationContainerImpl kDeclarationContainerImpl, String str, String str2, s sVar, Object obj, int i, f fVar) {
        if ((i & 16) != 0) {
            obj = CallableReference.eVW;
        }
        this(kDeclarationContainerImpl, str, str2, sVar, obj);
    }

    private i(KDeclarationContainerImpl kDeclarationContainerImpl, String str, String str2, s sVar, Object obj) {
        this.eXB = kDeclarationContainerImpl;
        this.signature = str2;
        this.eXC = obj;
        this.eWX = x.a(sVar, new KFunctionImpl$descriptor$2(this, str));
        this.eXz = x.d(new KFunctionImpl$caller$2(this));
        this.eXA = x.d(new KFunctionImpl$defaultCaller$2(this));
    }

    public i(KDeclarationContainerImpl kDeclarationContainerImpl, String str, String str2, Object obj) {
        kotlin.jvm.internal.i.f(kDeclarationContainerImpl, "container");
        kotlin.jvm.internal.i.f(str, ConditionalUserProperty.NAME);
        kotlin.jvm.internal.i.f(str2, "signature");
        this(kDeclarationContainerImpl, str, str2, null, obj);
    }

    public i(KDeclarationContainerImpl kDeclarationContainerImpl, s sVar) {
        kotlin.jvm.internal.i.f(kDeclarationContainerImpl, "container");
        kotlin.jvm.internal.i.f(sVar, "descriptor");
        String boi = sVar.bsZ().boi();
        kotlin.jvm.internal.i.e(boi, "descriptor.name.asString()");
        this(kDeclarationContainerImpl, boi, ab.eYn.d(sVar).boi(), sVar, null, 16, null);
    }

    public boolean isBound() {
        return kotlin.jvm.internal.i.y(this.eXC, CallableReference.eVW) ^ 1;
    }

    public String getName() {
        String boi = box().bsZ().boi();
        kotlin.jvm.internal.i.e(boi, "descriptor.name.asString()");
        return boi;
    }

    private final Object bnx() {
        return g.a(this.eXC, (CallableMemberDescriptor) box());
    }

    private final d.h c(Method method) {
        return isBound() ? new d.h.c(method, bnx()) : new f(method);
    }

    private final d.h d(Method method) {
        return isBound() ? new d.h.b(method) : new d.h.e(method);
    }

    private final d.h e(Method method) {
        return isBound() ? new d.h.a(method, bnx()) : new d.h.d(method);
    }

    private final d<Constructor<?>> a(Constructor<?> constructor, s sVar) {
        if (kotlin.reflect.jvm.internal.impl.resolve.jvm.a.J(sVar)) {
            if (isBound()) {
                return new d.a(constructor, bnx());
            }
            return new d.b(constructor);
        } else if (isBound()) {
            return new d.c(constructor, bnx());
        } else {
            return new d.e(constructor);
        }
    }

    public int bnH() {
        return kotlin.reflect.jvm.internal.calls.e.a(boy());
    }

    public boolean equals(Object obj) {
        i du = ae.du(obj);
        if (du != null && kotlin.jvm.internal.i.y(boA(), du.boA()) && kotlin.jvm.internal.i.y(getName(), du.getName()) && kotlin.jvm.internal.i.y(this.signature, du.signature) && kotlin.jvm.internal.i.y(this.eXC, du.eXC)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((boA().hashCode() * 31) + getName().hashCode()) * 31) + this.signature.hashCode();
    }

    public String toString() {
        return z.eYj.b(box());
    }
}
