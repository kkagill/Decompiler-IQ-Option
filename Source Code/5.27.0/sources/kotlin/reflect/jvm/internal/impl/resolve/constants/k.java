package kotlin.reflect.jvm.internal.impl.resolve.constants;

import kotlin.jvm.internal.i;
import kotlin.l;
import kotlin.reflect.jvm.internal.impl.descriptors.v;
import kotlin.reflect.jvm.internal.impl.types.ad;
import kotlin.reflect.jvm.internal.impl.types.p;

/* compiled from: constantValues.kt */
public abstract class k extends g<l> {
    public static final a ftE = new a();

    /* compiled from: constantValues.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final k mG(String str) {
            i.f(str, "message");
            return new b(str);
        }
    }

    /* compiled from: constantValues.kt */
    public static final class b extends k {
        private final String message;

        public b(String str) {
            i.f(str, "message");
            this.message = str;
        }

        /* renamed from: h */
        public ad g(v vVar) {
            i.f(vVar, "module");
            ad mK = p.mK(this.message);
            i.e(mK, "ErrorUtils.createErrorType(message)");
            return mK;
        }

        public String toString() {
            return this.message;
        }
    }

    public k() {
        super(l.eVB);
    }

    /* renamed from: bNg */
    public l getValue() {
        throw new UnsupportedOperationException();
    }
}
