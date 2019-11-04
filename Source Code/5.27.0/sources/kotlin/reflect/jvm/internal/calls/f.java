package kotlin.reflect.jvm.internal.calls;

import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;
import kotlin.TypeCastException;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\b\u0000\u0018\u0000*\f\b\u0000\u0010\u0001 \u0001*\u0004\u0018\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003:\u0001\u001cB#\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u001b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\n\u0010\u0019\u001a\u0006\u0012\u0002\b\u00030\u001aH\u0016¢\u0006\u0002\u0010\u001bR\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u00028\u00008VX\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108VX\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00118VX\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001d"}, bng = {"Lkotlin/reflect/jvm/internal/calls/InlineClassAwareCaller;", "M", "Ljava/lang/reflect/Member;", "Lkotlin/reflect/jvm/internal/calls/Caller;", "descriptor", "Lkotlin/reflect/jvm/internal/impl/descriptors/CallableMemberDescriptor;", "caller", "isDefault", "", "(Lorg/jetbrains/kotlin/descriptors/CallableMemberDescriptor;Lkotlin/reflect/jvm/internal/calls/Caller;Z)V", "data", "Lkotlin/reflect/jvm/internal/calls/InlineClassAwareCaller$BoxUnboxData;", "member", "getMember", "()Ljava/lang/reflect/Member;", "parameterTypes", "", "Ljava/lang/reflect/Type;", "getParameterTypes", "()Ljava/util/List;", "returnType", "getReturnType", "()Ljava/lang/reflect/Type;", "call", "", "args", "", "([Ljava/lang/Object;)Ljava/lang/Object;", "BoxUnboxData", "kotlin-reflect-api"})
/* compiled from: InlineClassAwareCaller.kt */
public final class f<M extends Member> implements c<M> {
    private final a eYH;
    private final c<M> eYI;
    private final boolean isDefault;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\r\b\u0002\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\bJ\t\u0010\u0010\u001a\u00020\u0003H\u0002J\u0016\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005H\u0002¢\u0006\u0002\u0010\u000eJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0006H\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0013"}, bng = {"Lkotlin/reflect/jvm/internal/calls/InlineClassAwareCaller$BoxUnboxData;", "", "argumentRange", "Lkotlin/ranges/IntRange;", "unbox", "", "Ljava/lang/reflect/Method;", "box", "(Lkotlin/ranges/IntRange;[Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;)V", "getArgumentRange", "()Lkotlin/ranges/IntRange;", "getBox", "()Ljava/lang/reflect/Method;", "getUnbox", "()[Ljava/lang/reflect/Method;", "[Ljava/lang/reflect/Method;", "component1", "component2", "component3", "kotlin-reflect-api"})
    /* compiled from: InlineClassAwareCaller.kt */
    private static final class a {
        private final kotlin.g.f eYJ;
        private final Method[] eYK;
        private final Method eYL;

        public a(kotlin.g.f fVar, Method[] methodArr, Method method) {
            kotlin.jvm.internal.i.f(fVar, "argumentRange");
            kotlin.jvm.internal.i.f(methodArr, "unbox");
            this.eYJ = fVar;
            this.eYK = methodArr;
            this.eYL = method;
        }

        public final kotlin.g.f bqc() {
            return this.eYJ;
        }

        public final Method[] bqd() {
            return this.eYK;
        }

        public final Method bqe() {
            return this.eYL;
        }
    }

    /* JADX WARNING: Missing block: B:15:0x0058, code skipped:
            if ((r1 instanceof kotlin.reflect.jvm.internal.calls.b) != false) goto L_0x0079;
     */
    public f(kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r9, kotlin.reflect.jvm.internal.calls.c<? extends M> r10, boolean r11) {
        /*
        r8 = this;
        r0 = "descriptor";
        kotlin.jvm.internal.i.f(r9, r0);
        r0 = "caller";
        kotlin.jvm.internal.i.f(r10, r0);
        r8.<init>();
        r8.eYI = r10;
        r8.isDefault = r11;
        r10 = r8;
        r10 = (kotlin.reflect.jvm.internal.calls.f) r10;
        r11 = r9.bsN();
        if (r11 != 0) goto L_0x001d;
    L_0x001a:
        kotlin.jvm.internal.i.bnJ();
    L_0x001d:
        r0 = "descriptor.returnType!!";
        kotlin.jvm.internal.i.e(r11, r0);
        r11 = kotlin.reflect.jvm.internal.calls.g.c(r11);
        r0 = 0;
        if (r11 == 0) goto L_0x002e;
    L_0x0029:
        r11 = kotlin.reflect.jvm.internal.calls.g.b(r11, r9);
        goto L_0x002f;
    L_0x002e:
        r11 = r0;
    L_0x002f:
        r1 = r9;
        r1 = (kotlin.reflect.jvm.internal.impl.descriptors.a) r1;
        r1 = kotlin.reflect.jvm.internal.impl.resolve.d.g(r1);
        r2 = 0;
        if (r1 == 0) goto L_0x0048;
    L_0x0039:
        r9 = kotlin.g.f.eWo;
        r9 = r9.bnW();
        r10 = new java.lang.reflect.Method[r2];
        r0 = new kotlin.reflect.jvm.internal.calls.f$a;
        r0.<init>(r9, r10, r11);
        goto L_0x014f;
    L_0x0048:
        r1 = r10.eYI;
        r3 = r1 instanceof kotlin.reflect.jvm.internal.calls.d.h.c;
        r4 = "descriptor.containingDeclaration";
        r5 = -1;
        if (r3 == 0) goto L_0x0052;
    L_0x0051:
        goto L_0x0079;
    L_0x0052:
        r3 = r9 instanceof kotlin.reflect.jvm.internal.impl.descriptors.j;
        if (r3 == 0) goto L_0x005b;
    L_0x0056:
        r1 = r1 instanceof kotlin.reflect.jvm.internal.calls.b;
        if (r1 == 0) goto L_0x0078;
    L_0x005a:
        goto L_0x0079;
    L_0x005b:
        r1 = r9.bsL();
        if (r1 == 0) goto L_0x0078;
    L_0x0061:
        r1 = r10.eYI;
        r1 = r1 instanceof kotlin.reflect.jvm.internal.calls.b;
        if (r1 != 0) goto L_0x0078;
    L_0x0067:
        r1 = r9.brj();
        kotlin.jvm.internal.i.e(r1, r4);
        r1 = kotlin.reflect.jvm.internal.impl.resolve.d.N(r1);
        if (r1 == 0) goto L_0x0075;
    L_0x0074:
        goto L_0x0078;
    L_0x0075:
        r1 = 1;
        r5 = 1;
        goto L_0x0079;
    L_0x0078:
        r5 = 0;
    L_0x0079:
        r1 = r10.isDefault;
        if (r1 == 0) goto L_0x007f;
    L_0x007d:
        r1 = 2;
        goto L_0x0080;
    L_0x007f:
        r1 = 0;
    L_0x0080:
        r3 = new java.util.ArrayList;
        r3.<init>();
        r6 = r9.bsK();
        if (r6 == 0) goto L_0x0090;
    L_0x008b:
        r6 = r6.bpT();
        goto L_0x0091;
    L_0x0090:
        r6 = r0;
    L_0x0091:
        if (r6 == 0) goto L_0x0097;
    L_0x0093:
        r3.add(r6);
        goto L_0x00df;
    L_0x0097:
        r6 = r9 instanceof kotlin.reflect.jvm.internal.impl.descriptors.j;
        if (r6 == 0) goto L_0x00c5;
    L_0x009b:
        r4 = r9;
        r4 = (kotlin.reflect.jvm.internal.impl.descriptors.j) r4;
        r4 = r4.bth();
        r6 = "descriptor.constructedClass";
        kotlin.jvm.internal.i.e(r4, r6);
        r6 = r4.brz();
        if (r6 == 0) goto L_0x00df;
    L_0x00ad:
        r4 = r4.brj();
        if (r4 == 0) goto L_0x00bd;
    L_0x00b3:
        r4 = (kotlin.reflect.jvm.internal.impl.descriptors.d) r4;
        r4 = r4.bsY();
        r3.add(r4);
        goto L_0x00df;
    L_0x00bd:
        r9 = new kotlin.TypeCastException;
        r10 = "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor";
        r9.<init>(r10);
        throw r9;
    L_0x00c5:
        r6 = r9.brj();
        kotlin.jvm.internal.i.e(r6, r4);
        r4 = r6 instanceof kotlin.reflect.jvm.internal.impl.descriptors.d;
        if (r4 == 0) goto L_0x00df;
    L_0x00d0:
        r6 = (kotlin.reflect.jvm.internal.impl.descriptors.d) r6;
        r4 = r6.brA();
        if (r4 == 0) goto L_0x00df;
    L_0x00d8:
        r4 = r6.bsY();
        r3.add(r4);
    L_0x00df:
        r4 = r9.bsP();
        r6 = "descriptor.valueParameters";
        kotlin.jvm.internal.i.e(r4, r6);
        r4 = (java.lang.Iterable) r4;
        r4 = r4.iterator();
    L_0x00ee:
        r6 = r4.hasNext();
        if (r6 == 0) goto L_0x0105;
    L_0x00f4:
        r6 = r4.next();
        r7 = r3;
        r7 = (java.util.Collection) r7;
        r6 = (kotlin.reflect.jvm.internal.impl.descriptors.ar) r6;
        r6 = r6.bpT();
        r7.add(r6);
        goto L_0x00ee;
    L_0x0105:
        r4 = r3;
        r4 = (java.util.Collection) r4;
        r3 = (java.util.List) r3;
        r4 = r3.size();
        r4 = r4 + r5;
        r4 = r4 + r1;
        r1 = r10;
        r1 = (kotlin.reflect.jvm.internal.calls.c) r1;
        r6 = kotlin.reflect.jvm.internal.calls.e.a(r1);
        if (r6 != r4) goto L_0x0152;
    L_0x0119:
        r10 = java.lang.Math.max(r5, r2);
        r1 = r3.size();
        r1 = r1 + r5;
        r10 = kotlin.g.m.bh(r10, r1);
        r1 = new java.lang.reflect.Method[r4];
        r4 = r1.length;
    L_0x0129:
        if (r2 >= r4) goto L_0x014a;
    L_0x012b:
        r6 = r10.contains(r2);
        if (r6 == 0) goto L_0x0144;
    L_0x0131:
        r6 = r2 - r5;
        r6 = r3.get(r6);
        r6 = (kotlin.reflect.jvm.internal.impl.types.w) r6;
        r6 = kotlin.reflect.jvm.internal.calls.g.c(r6);
        if (r6 == 0) goto L_0x0144;
    L_0x013f:
        r6 = kotlin.reflect.jvm.internal.calls.g.a(r6, r9);
        goto L_0x0145;
    L_0x0144:
        r6 = r0;
    L_0x0145:
        r1[r2] = r6;
        r2 = r2 + 1;
        goto L_0x0129;
    L_0x014a:
        r0 = new kotlin.reflect.jvm.internal.calls.f$a;
        r0.<init>(r10, r1, r11);
    L_0x014f:
        r8.eYH = r0;
        return;
    L_0x0152:
        r11 = new kotlin.reflect.jvm.internal.KotlinReflectionInternalError;
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r2 = "Inconsistent number of parameters in the descriptor and Java reflection object: ";
        r0.append(r2);
        r1 = kotlin.reflect.jvm.internal.calls.e.a(r1);
        r0.append(r1);
        r1 = " != ";
        r0.append(r1);
        r0.append(r4);
        r1 = 10;
        r0.append(r1);
        r2 = "Calling: ";
        r0.append(r2);
        r0.append(r9);
        r0.append(r1);
        r9 = "Parameter types: ";
        r0.append(r9);
        r9 = r10.bqa();
        r0.append(r9);
        r9 = ")\n";
        r0.append(r9);
        r9 = "Default: ";
        r0.append(r9);
        r9 = r10.isDefault;
        r0.append(r9);
        r9 = r0.toString();
        r11.<init>(r9);
        r11 = (java.lang.Throwable) r11;
        goto L_0x01a3;
    L_0x01a2:
        throw r11;
    L_0x01a3:
        goto L_0x01a2;
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.calls.f.<init>(kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor, kotlin.reflect.jvm.internal.calls.c, boolean):void");
    }

    public M bpY() {
        return this.eYI.bpY();
    }

    public Type bpZ() {
        return this.eYI.bpZ();
    }

    public List<Type> bqa() {
        return this.eYI.bqa();
    }

    public Object Q(Object[] objArr) {
        kotlin.jvm.internal.i.f(objArr, "args");
        a aVar = this.eYH;
        kotlin.g.f bqc = aVar.bqc();
        Method[] bqd = aVar.bqd();
        Method bqe = aVar.bqe();
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        kotlin.jvm.internal.i.e(copyOf, "java.util.Arrays.copyOf(this, size)");
        if (copyOf != null) {
            int first = bqc.getFirst();
            int last = bqc.getLast();
            if (first <= last) {
                while (true) {
                    Method method = bqd[first];
                    Object obj = objArr[first];
                    if (!(method == null || obj == null)) {
                        obj = method.invoke(obj, new Object[0]);
                    }
                    copyOf[first] = obj;
                    if (first == last) {
                        break;
                    }
                    first++;
                }
            }
            Object Q = this.eYI.Q(copyOf);
            if (bqe == null) {
                return Q;
            }
            Object invoke = bqe.invoke(null, new Object[]{Q});
            return invoke != null ? invoke : Q;
        } else {
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        }
    }
}
