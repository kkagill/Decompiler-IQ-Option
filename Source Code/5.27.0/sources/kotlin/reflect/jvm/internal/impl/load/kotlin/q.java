package kotlin.reflect.jvm.internal.impl.load.kotlin;

import com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.i;
import kotlin.reflect.jvm.internal.impl.metadata.a.c;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmMethodSignature;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.f;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.f.b;

/* compiled from: MemberSignature.kt */
public final class q {
    public static final a fme = new a();
    private final String signature;

    /* compiled from: MemberSignature.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final q a(c cVar, JvmMethodSignature jvmMethodSignature) {
            i.f(cVar, "nameResolver");
            i.f(jvmMethodSignature, "signature");
            return bd(cVar.getString(jvmMethodSignature.bCg()), cVar.getString(jvmMethodSignature.bIr()));
        }

        public final q bd(String str, String str2) {
            i.f(str, ConditionalUserProperty.NAME);
            i.f(str2, "desc");
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            stringBuilder.append(str2);
            return new q(stringBuilder.toString(), null);
        }

        public final q be(String str, String str2) {
            i.f(str, ConditionalUserProperty.NAME);
            i.f(str2, "desc");
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            stringBuilder.append("#");
            stringBuilder.append(str2);
            return new q(stringBuilder.toString(), null);
        }

        public final q a(f fVar) {
            i.f(fVar, "signature");
            if (fVar instanceof b) {
                return bd(fVar.getName(), fVar.getDesc());
            }
            if (fVar instanceof kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.f.a) {
                return be(fVar.getName(), fVar.getDesc());
            }
            throw new NoWhenBranchMatchedException();
        }

        public final q a(q qVar, int i) {
            i.f(qVar, "signature");
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(qVar.byM());
            stringBuilder.append("@");
            stringBuilder.append(i);
            return new q(stringBuilder.toString(), null);
        }
    }

    /* JADX WARNING: Missing block: B:4:0x0010, code skipped:
            if (kotlin.jvm.internal.i.y(r1.signature, ((kotlin.reflect.jvm.internal.impl.load.kotlin.q) r2).signature) != false) goto L_0x0015;
     */
    public boolean equals(java.lang.Object r2) {
        /*
        r1 = this;
        if (r1 == r2) goto L_0x0015;
    L_0x0002:
        r0 = r2 instanceof kotlin.reflect.jvm.internal.impl.load.kotlin.q;
        if (r0 == 0) goto L_0x0013;
    L_0x0006:
        r2 = (kotlin.reflect.jvm.internal.impl.load.kotlin.q) r2;
        r0 = r1.signature;
        r2 = r2.signature;
        r2 = kotlin.jvm.internal.i.y(r0, r2);
        if (r2 == 0) goto L_0x0013;
    L_0x0012:
        goto L_0x0015;
    L_0x0013:
        r2 = 0;
        return r2;
    L_0x0015:
        r2 = 1;
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.kotlin.q.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        String str = this.signature;
        return str != null ? str.hashCode() : 0;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("MemberSignature(signature=");
        stringBuilder.append(this.signature);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    private q(String str) {
        this.signature = str;
    }

    public /* synthetic */ q(String str, f fVar) {
        this(str);
    }

    public final String byM() {
        return this.signature;
    }
}
