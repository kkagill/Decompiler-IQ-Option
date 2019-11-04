package kotlin.reflect.jvm.internal;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import kotlin.i;
import kotlin.jvm.a.b;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.calls.d;
import kotlin.reflect.jvm.internal.calls.d.f;
import kotlin.reflect.jvm.internal.calls.d.f.c;
import kotlin.reflect.jvm.internal.calls.d.f.e;
import kotlin.reflect.jvm.internal.calls.d.g;
import kotlin.reflect.jvm.internal.r.a;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0002\b\u0004"}, bng = {"computeFieldCaller", "Lkotlin/reflect/jvm/internal/calls/CallerImpl;", "Ljava/lang/reflect/Field;", "field", "invoke"})
/* compiled from: KPropertyImpl.kt */
final class KPropertyImplKt$computeCallerForAccessor$3 extends Lambda implements b<Field, d<? extends Field>> {
    final /* synthetic */ boolean $isGetter;
    final /* synthetic */ KPropertyImplKt$computeCallerForAccessor$1 $isJvmStaticProperty$1;
    final /* synthetic */ KPropertyImplKt$computeCallerForAccessor$2 $isNotNullProperty$2;
    final /* synthetic */ a $this_computeCallerForAccessor;

    KPropertyImplKt$computeCallerForAccessor$3(a aVar, boolean z, KPropertyImplKt$computeCallerForAccessor$2 kPropertyImplKt$computeCallerForAccessor$2, KPropertyImplKt$computeCallerForAccessor$1 kPropertyImplKt$computeCallerForAccessor$1) {
        this.$this_computeCallerForAccessor = aVar;
        this.$isGetter = z;
        this.$isNotNullProperty$2 = kPropertyImplKt$computeCallerForAccessor$2;
        this.$isJvmStaticProperty$1 = kPropertyImplKt$computeCallerForAccessor$1;
        super(1);
    }

    /* renamed from: b */
    public final d<Field> invoke(Field field) {
        kotlin.jvm.internal.i.f(field, "field");
        f aVar;
        g aVar2;
        if (s.c(this.$this_computeCallerForAccessor.bpg().box()) || !Modifier.isStatic(field.getModifiers())) {
            if (this.$isGetter) {
                if (this.$this_computeCallerForAccessor.isBound()) {
                    aVar = new f.a(field, s.a(this.$this_computeCallerForAccessor));
                } else {
                    aVar = new c(field);
                }
                return aVar;
            }
            if (this.$this_computeCallerForAccessor.isBound()) {
                aVar2 = new g.a(field, this.$isNotNullProperty$2.invoke(), s.a(this.$this_computeCallerForAccessor));
            } else {
                aVar2 = new g.c(field, this.$isNotNullProperty$2.invoke());
            }
            return aVar2;
        } else if (this.$isJvmStaticProperty$1.invoke()) {
            if (this.$isGetter) {
                if (this.$this_computeCallerForAccessor.isBound()) {
                    aVar = new f.b(field);
                } else {
                    aVar = new f.d(field);
                }
                return aVar;
            }
            if (this.$this_computeCallerForAccessor.isBound()) {
                aVar2 = new g.b(field, this.$isNotNullProperty$2.invoke());
            } else {
                aVar2 = new g.d(field, this.$isNotNullProperty$2.invoke());
            }
            return aVar2;
        } else if (this.$isGetter) {
            return new e(field);
        } else {
            return new g.e(field, this.$isNotNullProperty$2.invoke());
        }
    }
}
