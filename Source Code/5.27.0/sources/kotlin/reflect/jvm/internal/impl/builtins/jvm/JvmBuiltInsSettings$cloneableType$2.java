package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import kotlin.jvm.a.a;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.r;
import kotlin.reflect.jvm.internal.impl.descriptors.x;
import kotlin.reflect.jvm.internal.impl.storage.h;
import kotlin.reflect.jvm.internal.impl.types.ad;

/* compiled from: JvmBuiltInsSettings.kt */
final class JvmBuiltInsSettings$cloneableType$2 extends Lambda implements a<ad> {
    final /* synthetic */ h $storageManager;
    final /* synthetic */ JvmBuiltInsSettings this$0;

    JvmBuiltInsSettings$cloneableType$2(JvmBuiltInsSettings jvmBuiltInsSettings, h hVar) {
        this.this$0 = jvmBuiltInsSettings;
        this.$storageManager = hVar;
        super(0);
    }

    /* renamed from: bsD */
    public final ad invoke() {
        return r.a(this.this$0.bsr(), d.fck.bsl(), new x(this.$storageManager, this.this$0.bsr())).bsY();
    }
}
