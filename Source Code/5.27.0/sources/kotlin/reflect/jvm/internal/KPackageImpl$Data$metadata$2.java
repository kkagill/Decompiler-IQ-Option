package kotlin.reflect.jvm.internal;

import kotlin.Pair;
import kotlin.Triple;
import kotlin.i;
import kotlin.jvm.a.a;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.components.e;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Package;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.g;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.h;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.j;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "Lkotlin/Triple;", "Lkotlin/reflect/jvm/internal/impl/metadata/jvm/deserialization/JvmNameResolver;", "Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Package;", "Lkotlin/reflect/jvm/internal/impl/metadata/jvm/deserialization/JvmMetadataVersion;", "invoke"})
/* compiled from: KPackageImpl.kt */
final class KPackageImpl$Data$metadata$2 extends Lambda implements a<Triple<? extends h, ? extends Package, ? extends g>> {
    final /* synthetic */ a this$0;

    KPackageImpl$Data$metadata$2(a aVar) {
        this.this$0 = aVar;
        super(0);
    }

    /* renamed from: bpu */
    public final Triple<h, Package, g> invoke() {
        e a = this.this$0.bpp();
        if (a == null) {
            return null;
        }
        KotlinClassHeader bqj = a.bqj();
        if (bqj == null) {
            return null;
        }
        String[] byX = bqj.byX();
        String[] byZ = bqj.byZ();
        if (byX == null || byZ == null) {
            return null;
        }
        Pair b = j.b(byX, byZ);
        return new Triple((h) b.bnj(), (Package) b.bnk(), bqj.byW());
    }
}
