package kotlin.reflect.jvm.internal;

import kotlin.i;
import kotlin.reflect.jvm.internal.impl.descriptors.ae;
import kotlin.reflect.jvm.internal.impl.descriptors.k;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.j;
import kotlin.reflect.jvm.internal.impl.resolve.c;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.h;
import kotlin.reflect.jvm.internal.r.a;

@i(bne = {1, 1, 15}, bnf = {"\u0000 \n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a \u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0006*\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00022\u0006\u0010\u0007\u001a\u00020\bH\u0002\u001a\f\u0010\t\u001a\u00020\b*\u00020\nH\u0002\"\"\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00028@X\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u000b"}, bng = {"boundReceiver", "", "Lkotlin/reflect/jvm/internal/KPropertyImpl$Accessor;", "getBoundReceiver", "(Lkotlin/reflect/jvm/internal/KPropertyImpl$Accessor;)Ljava/lang/Object;", "computeCallerForAccessor", "Lkotlin/reflect/jvm/internal/calls/Caller;", "isGetter", "", "isJvmFieldPropertyInCompanionObject", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;", "kotlin-reflect-api"})
/* compiled from: KPropertyImpl.kt */
public final class s {
    public static final Object a(a<?, ?> aVar) {
        kotlin.jvm.internal.i.f(aVar, "$this$boundReceiver");
        return aVar.bpg().bnx();
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x013b  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x013b  */
    private static final kotlin.reflect.jvm.internal.calls.c<?> a(kotlin.reflect.jvm.internal.r.a<?, ?> r7, boolean r8) {
        /*
        r0 = kotlin.reflect.jvm.internal.KDeclarationContainerImpl.eXt;
        r0 = r0.boY();
        r1 = r7.bpg();
        r1 = r1.RX();
        r1 = (java.lang.CharSequence) r1;
        r0 = r0.L(r1);
        if (r0 == 0) goto L_0x001b;
    L_0x0016:
        r7 = kotlin.reflect.jvm.internal.calls.i.eYN;
        r7 = (kotlin.reflect.jvm.internal.calls.c) r7;
        return r7;
    L_0x001b:
        r0 = new kotlin.reflect.jvm.internal.KPropertyImplKt$computeCallerForAccessor$1;
        r0.<init>(r7);
        r1 = new kotlin.reflect.jvm.internal.KPropertyImplKt$computeCallerForAccessor$2;
        r1.<init>(r7);
        r2 = new kotlin.reflect.jvm.internal.KPropertyImplKt$computeCallerForAccessor$3;
        r2.<init>(r7, r8, r1, r0);
        r1 = kotlin.reflect.jvm.internal.ab.eYn;
        r3 = r7.bpg();
        r3 = r3.box();
        r1 = r1.f(r3);
        r3 = r1 instanceof kotlin.reflect.jvm.internal.d.c;
        r4 = 0;
        if (r3 == 0) goto L_0x019c;
    L_0x003d:
        r1 = (kotlin.reflect.jvm.internal.d.c) r1;
        r3 = r1.bos();
        if (r8 == 0) goto L_0x0050;
    L_0x0045:
        r8 = r3.bIQ();
        if (r8 == 0) goto L_0x005b;
    L_0x004b:
        r8 = r3.bIR();
        goto L_0x005c;
    L_0x0050:
        r8 = r3.bIS();
        if (r8 == 0) goto L_0x005b;
    L_0x0056:
        r8 = r3.bIT();
        goto L_0x005c;
    L_0x005b:
        r8 = r4;
    L_0x005c:
        if (r8 == 0) goto L_0x0083;
    L_0x005e:
        r3 = r7.bpg();
        r3 = r3.boA();
        r5 = r1.bot();
        r6 = r8.bCg();
        r5 = r5.getString(r6);
        r1 = r1.bot();
        r8 = r8.bIr();
        r8 = r1.getString(r8);
        r8 = r3.ba(r5, r8);
        goto L_0x0084;
    L_0x0083:
        r8 = r4;
    L_0x0084:
        if (r8 != 0) goto L_0x013b;
    L_0x0086:
        r8 = r7.bpg();
        r8 = r8.box();
        r8 = (kotlin.reflect.jvm.internal.impl.descriptors.at) r8;
        r8 = kotlin.reflect.jvm.internal.impl.resolve.d.a(r8);
        if (r8 == 0) goto L_0x010b;
    L_0x0096:
        r8 = r7.bpg();
        r8 = r8.box();
        r8 = r8.brx();
        r0 = kotlin.reflect.jvm.internal.impl.descriptors.av.fdd;
        r8 = kotlin.jvm.internal.i.y(r8, r0);
        if (r8 == 0) goto L_0x010b;
    L_0x00aa:
        r8 = r7.bpg();
        r8 = r8.box();
        r8 = r8.brj();
        r8 = kotlin.reflect.jvm.internal.calls.g.a(r8);
        if (r8 == 0) goto L_0x00e9;
    L_0x00bc:
        r0 = r7.bpg();
        r0 = r0.box();
        r0 = (kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor) r0;
        r8 = kotlin.reflect.jvm.internal.calls.g.a(r8, r0);
        if (r8 == 0) goto L_0x00e9;
    L_0x00cc:
        r0 = r7.isBound();
        if (r0 == 0) goto L_0x00de;
    L_0x00d2:
        r0 = new kotlin.reflect.jvm.internal.calls.h$a;
        r1 = a(r7);
        r0.<init>(r8, r1);
        r0 = (kotlin.reflect.jvm.internal.calls.h) r0;
        goto L_0x00e5;
    L_0x00de:
        r0 = new kotlin.reflect.jvm.internal.calls.h$b;
        r0.<init>(r8);
        r0 = (kotlin.reflect.jvm.internal.calls.h) r0;
    L_0x00e5:
        r0 = (kotlin.reflect.jvm.internal.calls.c) r0;
        goto L_0x01de;
    L_0x00e9:
        r8 = new kotlin.reflect.jvm.internal.KotlinReflectionInternalError;
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = "Underlying property of inline class ";
        r0.append(r1);
        r7 = r7.bpg();
        r0.append(r7);
        r7 = " should have a field";
        r0.append(r7);
        r7 = r0.toString();
        r8.<init>(r7);
        r8 = (java.lang.Throwable) r8;
        throw r8;
    L_0x010b:
        r8 = r7.bpg();
        r8 = r8.bpK();
        if (r8 == 0) goto L_0x011e;
    L_0x0115:
        r8 = r2.invoke(r8);
        r0 = r8;
        r0 = (kotlin.reflect.jvm.internal.calls.c) r0;
        goto L_0x01de;
    L_0x011e:
        r8 = new kotlin.reflect.jvm.internal.KotlinReflectionInternalError;
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = "No accessors or field is found for property ";
        r0.append(r1);
        r7 = r7.bpg();
        r0.append(r7);
        r7 = r0.toString();
        r8.<init>(r7);
        r8 = (java.lang.Throwable) r8;
        throw r8;
    L_0x013b:
        r1 = r8.getModifiers();
        r1 = java.lang.reflect.Modifier.isStatic(r1);
        if (r1 != 0) goto L_0x0162;
    L_0x0145:
        r0 = r7.isBound();
        if (r0 == 0) goto L_0x0157;
    L_0x014b:
        r0 = new kotlin.reflect.jvm.internal.calls.d$h$a;
        r1 = a(r7);
        r0.<init>(r8, r1);
        r0 = (kotlin.reflect.jvm.internal.calls.d.h) r0;
        goto L_0x015e;
    L_0x0157:
        r0 = new kotlin.reflect.jvm.internal.calls.d$h$d;
        r0.<init>(r8);
        r0 = (kotlin.reflect.jvm.internal.calls.d.h) r0;
    L_0x015e:
        r0 = (kotlin.reflect.jvm.internal.calls.c) r0;
        goto L_0x01de;
    L_0x0162:
        r0 = r0.invoke();
        if (r0 == 0) goto L_0x0180;
    L_0x0168:
        r0 = r7.isBound();
        if (r0 == 0) goto L_0x0176;
    L_0x016e:
        r0 = new kotlin.reflect.jvm.internal.calls.d$h$b;
        r0.<init>(r8);
        r0 = (kotlin.reflect.jvm.internal.calls.d.h) r0;
        goto L_0x017d;
    L_0x0176:
        r0 = new kotlin.reflect.jvm.internal.calls.d$h$e;
        r0.<init>(r8);
        r0 = (kotlin.reflect.jvm.internal.calls.d.h) r0;
    L_0x017d:
        r0 = (kotlin.reflect.jvm.internal.calls.c) r0;
        goto L_0x01de;
    L_0x0180:
        r0 = r7.isBound();
        if (r0 == 0) goto L_0x0192;
    L_0x0186:
        r0 = new kotlin.reflect.jvm.internal.calls.d$h$c;
        r1 = a(r7);
        r0.<init>(r8, r1);
        r0 = (kotlin.reflect.jvm.internal.calls.d.h) r0;
        goto L_0x0199;
    L_0x0192:
        r0 = new kotlin.reflect.jvm.internal.calls.d$h$f;
        r0.<init>(r8);
        r0 = (kotlin.reflect.jvm.internal.calls.d.h) r0;
    L_0x0199:
        r0 = (kotlin.reflect.jvm.internal.calls.c) r0;
        goto L_0x01de;
    L_0x019c:
        r0 = r1 instanceof kotlin.reflect.jvm.internal.d.a;
        if (r0 == 0) goto L_0x01ae;
    L_0x01a0:
        r1 = (kotlin.reflect.jvm.internal.d.a) r1;
        r8 = r1.bgQ();
        r8 = r2.invoke(r8);
        r0 = r8;
        r0 = (kotlin.reflect.jvm.internal.calls.c) r0;
        goto L_0x01de;
    L_0x01ae:
        r0 = r1 instanceof kotlin.reflect.jvm.internal.d.b;
        if (r0 == 0) goto L_0x0208;
    L_0x01b2:
        if (r8 == 0) goto L_0x01bb;
    L_0x01b4:
        r1 = (kotlin.reflect.jvm.internal.d.b) r1;
        r8 = r1.bon();
        goto L_0x01c3;
    L_0x01bb:
        r1 = (kotlin.reflect.jvm.internal.d.b) r1;
        r8 = r1.boo();
        if (r8 == 0) goto L_0x01eb;
    L_0x01c3:
        r0 = r7.isBound();
        if (r0 == 0) goto L_0x01d5;
    L_0x01c9:
        r0 = new kotlin.reflect.jvm.internal.calls.d$h$a;
        r1 = a(r7);
        r0.<init>(r8, r1);
        r0 = (kotlin.reflect.jvm.internal.calls.d.h) r0;
        goto L_0x01dc;
    L_0x01d5:
        r0 = new kotlin.reflect.jvm.internal.calls.d$h$d;
        r0.<init>(r8);
        r0 = (kotlin.reflect.jvm.internal.calls.d.h) r0;
    L_0x01dc:
        r0 = (kotlin.reflect.jvm.internal.calls.c) r0;
    L_0x01de:
        r7 = r7.bpM();
        r7 = (kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor) r7;
        r8 = 0;
        r1 = 2;
        r7 = kotlin.reflect.jvm.internal.calls.g.a(r0, r7, r8, r1, r4);
        return r7;
    L_0x01eb:
        r7 = new kotlin.reflect.jvm.internal.KotlinReflectionInternalError;
        r8 = new java.lang.StringBuilder;
        r8.<init>();
        r0 = "No source found for setter of Java method property: ";
        r8.append(r0);
        r0 = r1.bon();
        r8.append(r0);
        r8 = r8.toString();
        r7.<init>(r8);
        r7 = (java.lang.Throwable) r7;
        throw r7;
    L_0x0208:
        r0 = r1 instanceof kotlin.reflect.jvm.internal.d.d;
        if (r0 == 0) goto L_0x02b6;
    L_0x020c:
        if (r8 == 0) goto L_0x0215;
    L_0x020e:
        r1 = (kotlin.reflect.jvm.internal.d.d) r1;
        r8 = r1.bov();
        goto L_0x021d;
    L_0x0215:
        r1 = (kotlin.reflect.jvm.internal.d.d) r1;
        r8 = r1.bow();
        if (r8 == 0) goto L_0x0299;
    L_0x021d:
        r0 = r7.bpg();
        r0 = r0.boA();
        r1 = r8.getMethodName();
        r8 = r8.bom();
        r8 = r0.ba(r1, r8);
        if (r8 == 0) goto L_0x027c;
    L_0x0233:
        r0 = r8.getModifiers();
        r0 = java.lang.reflect.Modifier.isStatic(r0);
        r0 = r0 ^ 1;
        r1 = kotlin.m.eVC;
        if (r1 == 0) goto L_0x0261;
    L_0x0241:
        if (r0 == 0) goto L_0x0244;
    L_0x0243:
        goto L_0x0261;
    L_0x0244:
        r8 = new java.lang.StringBuilder;
        r8.<init>();
        r0 = "Mapped property cannot have a static accessor: ";
        r8.append(r0);
        r7 = r7.bpg();
        r8.append(r7);
        r7 = r8.toString();
        r8 = new java.lang.AssertionError;
        r8.<init>(r7);
        r8 = (java.lang.Throwable) r8;
        throw r8;
    L_0x0261:
        r0 = r7.isBound();
        if (r0 == 0) goto L_0x0273;
    L_0x0267:
        r0 = new kotlin.reflect.jvm.internal.calls.d$h$a;
        r7 = a(r7);
        r0.<init>(r8, r7);
        r0 = (kotlin.reflect.jvm.internal.calls.c) r0;
        goto L_0x027b;
    L_0x0273:
        r7 = new kotlin.reflect.jvm.internal.calls.d$h$d;
        r7.<init>(r8);
        r0 = r7;
        r0 = (kotlin.reflect.jvm.internal.calls.c) r0;
    L_0x027b:
        return r0;
    L_0x027c:
        r8 = new kotlin.reflect.jvm.internal.KotlinReflectionInternalError;
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = "No accessor found for property ";
        r0.append(r1);
        r7 = r7.bpg();
        r0.append(r7);
        r7 = r0.toString();
        r8.<init>(r7);
        r8 = (java.lang.Throwable) r8;
        throw r8;
    L_0x0299:
        r8 = new kotlin.reflect.jvm.internal.KotlinReflectionInternalError;
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = "No setter found for property ";
        r0.append(r1);
        r7 = r7.bpg();
        r0.append(r7);
        r7 = r0.toString();
        r8.<init>(r7);
        r8 = (java.lang.Throwable) r8;
        throw r8;
    L_0x02b6:
        r7 = new kotlin.NoWhenBranchMatchedException;
        r7.<init>();
        throw r7;
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.s.a(kotlin.reflect.jvm.internal.r$a, boolean):kotlin.reflect.jvm.internal.calls.c");
    }

    private static final boolean c(ae aeVar) {
        k brj = aeVar.brj();
        kotlin.jvm.internal.i.e(brj, "containingDeclaration");
        if (!c.D(brj)) {
            return false;
        }
        brj = brj.brj();
        boolean z = true;
        if ((c.J(brj) || c.I(brj)) && !((aeVar instanceof h) && j.g(((h) aeVar).bOz()))) {
            z = false;
        }
        return z;
    }
}
