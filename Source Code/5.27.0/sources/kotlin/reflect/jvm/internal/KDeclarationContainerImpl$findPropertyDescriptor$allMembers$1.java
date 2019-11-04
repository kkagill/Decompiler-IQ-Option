package kotlin.reflect.jvm.internal;

import kotlin.i;
import kotlin.jvm.a.b;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.ae;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, bng = {"<anonymous>", "", "descriptor", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;", "invoke"})
/* compiled from: KDeclarationContainerImpl.kt */
final class KDeclarationContainerImpl$findPropertyDescriptor$allMembers$1 extends Lambda implements b<ae, String> {
    public static final KDeclarationContainerImpl$findPropertyDescriptor$allMembers$1 eXx = new KDeclarationContainerImpl$findPropertyDescriptor$allMembers$1();

    KDeclarationContainerImpl$findPropertyDescriptor$allMembers$1() {
        super(1);
    }

    /* renamed from: b */
    public final String invoke(ae aeVar) {
        kotlin.jvm.internal.i.f(aeVar, "descriptor");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(kotlin.reflect.jvm.internal.impl.renderer.b.frp.s(aeVar));
        stringBuilder.append(" | ");
        stringBuilder.append(ab.eYn.f(aeVar));
        return stringBuilder.toString();
    }
}
