package kotlin.reflect.jvm.internal.impl.load.java;

/* compiled from: utils.kt */
public final class s {
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00c6  */
    /* JADX WARNING: Missing block: B:37:0x00c0, code skipped:
            if (kotlin.reflect.jvm.internal.impl.builtins.g.I(r4) != false) goto L_0x00c4;
     */
    public static final kotlin.reflect.jvm.internal.impl.load.java.j a(kotlin.reflect.jvm.internal.impl.types.w r4, java.lang.String r5) {
        /*
        r0 = "$this$lexicalCastFrom";
        kotlin.jvm.internal.i.f(r4, r0);
        r0 = "value";
        kotlin.jvm.internal.i.f(r5, r0);
        r0 = r4.bMZ();
        r0 = r0.brQ();
        r1 = r0 instanceof kotlin.reflect.jvm.internal.impl.descriptors.d;
        r2 = 0;
        if (r1 == 0) goto L_0x004e;
    L_0x0018:
        r0 = (kotlin.reflect.jvm.internal.impl.descriptors.d) r0;
        r1 = r0.brt();
        r3 = kotlin.reflect.jvm.internal.impl.descriptors.ClassKind.ENUM_CLASS;
        if (r1 != r3) goto L_0x004e;
    L_0x0022:
        r4 = r0.btd();
        r5 = kotlin.reflect.jvm.internal.impl.name.f.ms(r5);
        r0 = "Name.identifier(value)";
        kotlin.jvm.internal.i.e(r5, r0);
        r0 = kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation.FROM_BACKEND;
        r0 = (kotlin.reflect.jvm.internal.impl.incremental.components.b) r0;
        r4 = r4.c(r5, r0);
        r5 = r4 instanceof kotlin.reflect.jvm.internal.impl.descriptors.d;
        if (r5 == 0) goto L_0x004d;
    L_0x003b:
        r4 = (kotlin.reflect.jvm.internal.impl.descriptors.d) r4;
        r5 = r4.brt();
        r0 = kotlin.reflect.jvm.internal.impl.descriptors.ClassKind.ENUM_ENTRY;
        if (r5 != r0) goto L_0x004d;
    L_0x0045:
        r5 = new kotlin.reflect.jvm.internal.impl.load.java.f;
        r5.<init>(r4);
        r2 = r5;
        r2 = (kotlin.reflect.jvm.internal.impl.load.java.j) r2;
    L_0x004d:
        return r2;
    L_0x004e:
        r4 = kotlin.reflect.jvm.internal.impl.types.b.a.aZ(r4);
        r0 = kotlin.reflect.jvm.internal.impl.utils.g.mS(r5);
        r1 = r0.UD();
        r0 = r0.component2();
        r3 = kotlin.reflect.jvm.internal.impl.builtins.g.s(r4);	 Catch:{ IllegalArgumentException -> 0x00c3 }
        if (r3 == 0) goto L_0x006d;
    L_0x0064:
        r4 = java.lang.Boolean.parseBoolean(r5);	 Catch:{ IllegalArgumentException -> 0x00c3 }
        r5 = java.lang.Boolean.valueOf(r4);	 Catch:{ IllegalArgumentException -> 0x00c3 }
        goto L_0x00c4;
    L_0x006d:
        r3 = kotlin.reflect.jvm.internal.impl.builtins.g.t(r4);	 Catch:{ IllegalArgumentException -> 0x00c3 }
        if (r3 == 0) goto L_0x007a;
    L_0x0073:
        r5 = (java.lang.CharSequence) r5;	 Catch:{ IllegalArgumentException -> 0x00c3 }
        r5 = kotlin.text.x.ag(r5);	 Catch:{ IllegalArgumentException -> 0x00c3 }
        goto L_0x00c4;
    L_0x007a:
        r3 = kotlin.reflect.jvm.internal.impl.builtins.g.v(r4);	 Catch:{ IllegalArgumentException -> 0x00c3 }
        if (r3 == 0) goto L_0x0085;
    L_0x0080:
        r5 = kotlin.text.t.T(r1, r0);	 Catch:{ IllegalArgumentException -> 0x00c3 }
        goto L_0x00c4;
    L_0x0085:
        r3 = kotlin.reflect.jvm.internal.impl.builtins.g.x(r4);	 Catch:{ IllegalArgumentException -> 0x00c3 }
        if (r3 == 0) goto L_0x0090;
    L_0x008b:
        r5 = kotlin.text.t.U(r1, r0);	 Catch:{ IllegalArgumentException -> 0x00c3 }
        goto L_0x00c4;
    L_0x0090:
        r3 = kotlin.reflect.jvm.internal.impl.builtins.g.u(r4);	 Catch:{ IllegalArgumentException -> 0x00c3 }
        if (r3 == 0) goto L_0x009b;
    L_0x0096:
        r5 = kotlin.text.t.V(r1, r0);	 Catch:{ IllegalArgumentException -> 0x00c3 }
        goto L_0x00c4;
    L_0x009b:
        r3 = kotlin.reflect.jvm.internal.impl.builtins.g.w(r4);	 Catch:{ IllegalArgumentException -> 0x00c3 }
        if (r3 == 0) goto L_0x00a6;
    L_0x00a1:
        r5 = kotlin.text.t.W(r1, r0);	 Catch:{ IllegalArgumentException -> 0x00c3 }
        goto L_0x00c4;
    L_0x00a6:
        r0 = kotlin.reflect.jvm.internal.impl.builtins.g.y(r4);	 Catch:{ IllegalArgumentException -> 0x00c3 }
        if (r0 == 0) goto L_0x00b1;
    L_0x00ac:
        r5 = kotlin.text.s.mU(r5);	 Catch:{ IllegalArgumentException -> 0x00c3 }
        goto L_0x00c4;
    L_0x00b1:
        r0 = kotlin.reflect.jvm.internal.impl.builtins.g.A(r4);	 Catch:{ IllegalArgumentException -> 0x00c3 }
        if (r0 == 0) goto L_0x00bc;
    L_0x00b7:
        r5 = kotlin.text.s.mV(r5);	 Catch:{ IllegalArgumentException -> 0x00c3 }
        goto L_0x00c4;
    L_0x00bc:
        r4 = kotlin.reflect.jvm.internal.impl.builtins.g.I(r4);	 Catch:{ IllegalArgumentException -> 0x00c3 }
        if (r4 == 0) goto L_0x00c3;
    L_0x00c2:
        goto L_0x00c4;
    L_0x00c3:
        r5 = r2;
    L_0x00c4:
        if (r5 == 0) goto L_0x00ce;
    L_0x00c6:
        r4 = new kotlin.reflect.jvm.internal.impl.load.java.d;
        r4.<init>(r5);
        r2 = r4;
        r2 = (kotlin.reflect.jvm.internal.impl.load.java.j) r2;
    L_0x00ce:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.s.a(kotlin.reflect.jvm.internal.impl.types.w, java.lang.String):kotlin.reflect.jvm.internal.impl.load.java.j");
    }
}
