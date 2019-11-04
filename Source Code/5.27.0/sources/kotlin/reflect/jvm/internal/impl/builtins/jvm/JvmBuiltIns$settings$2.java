package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import kotlin.jvm.a.a;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.i;
import kotlin.reflect.jvm.internal.impl.descriptors.v;
import kotlin.reflect.jvm.internal.impl.storage.h;

/* compiled from: JvmBuiltIns.kt */
final class JvmBuiltIns$settings$2 extends Lambda implements a<JvmBuiltInsSettings> {
    final /* synthetic */ h $storageManager;
    final /* synthetic */ e this$0;

    /* compiled from: JvmBuiltIns.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns$settings$2$1 */
    static final class AnonymousClass1 extends Lambda implements a<v> {
        final /* synthetic */ JvmBuiltIns$settings$2 this$0;

        AnonymousClass1(JvmBuiltIns$settings$2 jvmBuiltIns$settings$2) {
            this.this$0 = jvmBuiltIns$settings$2;
            super(0);
        }

        /* renamed from: bsq */
        public final v invoke() {
            v a = this.this$0.this$0.fcm;
            if (a != null) {
                return a;
            }
            throw new AssertionError("JvmBuiltins has not been initialized properly");
        }
    }

    /* compiled from: JvmBuiltIns.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns$settings$2$2 */
    static final class AnonymousClass2 extends Lambda implements a<Boolean> {
        final /* synthetic */ JvmBuiltIns$settings$2 this$0;

        AnonymousClass2(JvmBuiltIns$settings$2 jvmBuiltIns$settings$2) {
            this.this$0 = jvmBuiltIns$settings$2;
            super(0);
        }

        public final boolean invoke() {
            if (this.this$0.this$0.fcm != null) {
                return this.this$0.this$0.fcn;
            }
            throw new AssertionError("JvmBuiltins has not been initialized properly");
        }
    }

    JvmBuiltIns$settings$2(e eVar, h hVar) {
        this.this$0 = eVar;
        this.$storageManager = hVar;
        super(0);
    }

    /* renamed from: bsp */
    public final JvmBuiltInsSettings invoke() {
        kotlin.reflect.jvm.internal.impl.descriptors.impl.v bqA = this.this$0.bqA();
        i.e(bqA, "builtInsModule");
        return new JvmBuiltInsSettings(bqA, this.$storageManager, new AnonymousClass1(this), new AnonymousClass2(this));
    }
}
