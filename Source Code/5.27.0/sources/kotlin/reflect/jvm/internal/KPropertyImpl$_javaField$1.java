package kotlin.reflect.jvm.internal;

import java.lang.reflect.Field;
import kotlin.NoWhenBranchMatchedException;
import kotlin.i;
import kotlin.jvm.a.a;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.d.b;
import kotlin.reflect.jvm.internal.d.c;
import kotlin.reflect.jvm.internal.impl.descriptors.ae;
import kotlin.reflect.jvm.internal.impl.descriptors.d;
import kotlin.reflect.jvm.internal.impl.descriptors.k;
import kotlin.reflect.jvm.internal.impl.load.java.m;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.f;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.j;

@i(bne = {1, 1, 15}, bnf = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\u0006\b\u0000\u0010\u0002 \u0001H\n¢\u0006\u0002\b\u0003"}, bng = {"<anonymous>", "Ljava/lang/reflect/Field;", "R", "invoke"})
/* compiled from: KPropertyImpl.kt */
final class KPropertyImpl$_javaField$1 extends Lambda implements a<Field> {
    final /* synthetic */ r this$0;

    KPropertyImpl$_javaField$1(r rVar) {
        this.this$0 = rVar;
        super(0);
    }

    /* renamed from: bpG */
    public final Field invoke() {
        d f = ab.eYn.f(this.this$0.box());
        Field field = null;
        if (f instanceof c) {
            c cVar = (c) f;
            ae boq = cVar.boq();
            f.a a = j.a(j.foZ, cVar.bor(), cVar.bot(), cVar.bou(), false, 8, null);
            if (a == null) {
                return null;
            }
            Class enclosingClass;
            if (m.g(boq) || j.g(cVar.bor())) {
                enclosingClass = this.this$0.boA().bnC().getEnclosingClass();
            } else {
                k brj = boq.brj();
                if (brj instanceof d) {
                    enclosingClass = ae.a((d) brj);
                } else {
                    enclosingClass = this.this$0.boA().bnC();
                }
            }
            if (enclosingClass == null) {
                return null;
            }
            try {
                field = enclosingClass.getDeclaredField(a.getName());
                return field;
            } catch (NoSuchFieldException unused) {
                return field;
            }
        } else if (f instanceof d.a) {
            return ((d.a) f).bgQ();
        } else {
            if ((f instanceof b) || (f instanceof d.d)) {
                return null;
            }
            throw new NoWhenBranchMatchedException();
        }
    }
}
