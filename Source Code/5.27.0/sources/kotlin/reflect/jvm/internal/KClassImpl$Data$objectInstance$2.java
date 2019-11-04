package kotlin.reflect.jvm.internal;

import java.lang.reflect.Field;
import kotlin.TypeCastException;
import kotlin.i;
import kotlin.jvm.a.a;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.builtins.c;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.d;

@i(bne = {1, 1, 15}, bnf = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0002H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, bng = {"<anonymous>", "T", "", "invoke", "()Ljava/lang/Object;"})
/* compiled from: KClassImpl.kt */
final class KClassImpl$Data$objectInstance$2 extends Lambda implements a<T> {
    final /* synthetic */ g.a this$0;

    KClassImpl$Data$objectInstance$2(g.a aVar) {
        this.this$0 = aVar;
        super(0);
    }

    public final T invoke() {
        d boI = this.this$0.boI();
        if (boI.brt() != ClassKind.OBJECT) {
            return null;
        }
        Field declaredField;
        if (!boI.bry() || c.eZl.b(boI)) {
            declaredField = g.this.bnC().getDeclaredField("INSTANCE");
        } else {
            declaredField = g.this.bnC().getEnclosingClass().getDeclaredField(boI.bsZ().boi());
        }
        Object obj = declaredField.get(null);
        if (obj != null) {
            return obj;
        }
        throw new TypeCastException("null cannot be cast to non-null type T");
    }
}
