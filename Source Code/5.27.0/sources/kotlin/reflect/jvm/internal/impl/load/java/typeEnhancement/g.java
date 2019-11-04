package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import java.util.Map;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.k.a;
import kotlin.reflect.jvm.internal.impl.load.kotlin.u;

/* compiled from: predefinedEnhancementInfo.kt */
public final class g {
    private static final d fkK = new d(NullabilityQualifier.NULLABLE, null, false, false, 8, null);
    private static final d fkL = new d(NullabilityQualifier.NOT_NULL, null, false, false, 8, null);
    private static final d fkM = new d(NullabilityQualifier.NOT_NULL, null, true, false, 8, null);
    private static final Map<String, h> fkN;

    static {
        u uVar = u.fmf;
        String mj = uVar.mj("Object");
        String ml = uVar.ml("Predicate");
        String ml2 = uVar.ml("Function");
        String ml3 = uVar.ml("Consumer");
        String ml4 = uVar.ml("BiFunction");
        String ml5 = uVar.ml("BiConsumer");
        String ml6 = uVar.ml("UnaryOperator");
        String mk = uVar.mk("stream/Stream");
        String mk2 = uVar.mk("Optional");
        k kVar = new k();
        String str = ml3;
        String str2 = ml;
        String str3 = mk;
        String str4 = ml;
        a aVar = new a(kVar, uVar.mk("Iterator"));
        String str5 = ml6;
        String str6 = ml6;
        k kVar2 = kVar;
        String str7 = ml5;
        String str8 = mk2;
        String str9 = ml4;
        String str10 = ml2;
        String str11 = str8;
        aVar.f("forEachRemaining", new PredefinedEnhancementInfoKt$$special$$inlined$enhancement$lambda$1(uVar, str, str2, str3, str5, str7, mj, str9, str10, str11));
        u uVar2 = uVar;
        str2 = str4;
        str5 = str6;
        String str12 = ml5;
        a aVar2 = new a(kVar2, uVar.mj("Iterable"));
        mk2 = mj;
        aVar2.f("spliterator", new PredefinedEnhancementInfoKt$$special$$inlined$enhancement$lambda$2(uVar2, str, str2, str3, str5, str7, mk2, str9, str10, str11));
        aVar2 = new a(kVar2, uVar.mk("Collection"));
        str7 = str12;
        aVar2.f("removeIf", new PredefinedEnhancementInfoKt$$special$$inlined$enhancement$lambda$3(uVar2, str, str2, str3, str5, str7, mk2, str9, str10, str11));
        aVar2.f("stream", new PredefinedEnhancementInfoKt$$special$$inlined$enhancement$lambda$4(uVar2, str, str2, str3, str5, str7, mk2, str9, str10, str11));
        aVar2.f("parallelStream", new PredefinedEnhancementInfoKt$$special$$inlined$enhancement$lambda$5(uVar2, str, str2, str3, str5, str7, mk2, str9, str10, str11));
        mk2 = "replaceAll";
        new a(kVar2, uVar.mk("List")).f(mk2, new PredefinedEnhancementInfoKt$$special$$inlined$enhancement$lambda$6(uVar2, str, str2, str3, str5, str7, mk2, str9, str10, str11));
        aVar2 = new a(kVar2, uVar.mk("Map"));
        k kVar3 = kVar2;
        ml6 = mk2;
        mk2 = mj;
        aVar2.f("forEach", new PredefinedEnhancementInfoKt$$special$$inlined$enhancement$lambda$7(uVar2, str, str2, str3, str5, str7, mk2, str9, str10, str11));
        aVar2.f("putIfAbsent", new PredefinedEnhancementInfoKt$$special$$inlined$enhancement$lambda$8(uVar2, str, str2, str3, str5, str7, mk2, str9, str10, str11));
        mk2 = "replace";
        aVar2.f(mk2, new PredefinedEnhancementInfoKt$$special$$inlined$enhancement$lambda$9(uVar2, str, str2, str3, str5, str7, mk2, str9, str10, str11));
        String str13 = ml6;
        ml6 = mk2;
        mk2 = mj;
        aVar2.f(ml6, new PredefinedEnhancementInfoKt$$special$$inlined$enhancement$lambda$10(uVar2, str, str2, str3, str5, str7, mk2, str9, str10, str11));
        aVar2.f(str13, new PredefinedEnhancementInfoKt$$special$$inlined$enhancement$lambda$11(uVar2, str, str2, str3, str5, str7, mk2, str9, str10, str11));
        aVar2.f("compute", new PredefinedEnhancementInfoKt$$special$$inlined$enhancement$lambda$12(uVar2, str, str2, str3, str5, str7, mk2, str9, str10, str11));
        aVar2.f("computeIfAbsent", new PredefinedEnhancementInfoKt$$special$$inlined$enhancement$lambda$13(uVar2, str, str2, str3, str5, str7, mk2, str9, str10, str11));
        aVar2.f("computeIfPresent", new PredefinedEnhancementInfoKt$$special$$inlined$enhancement$lambda$14(uVar2, str, str2, str3, str5, str7, mk2, str9, str10, str11));
        aVar2.f("merge", new PredefinedEnhancementInfoKt$$special$$inlined$enhancement$lambda$15(uVar2, str, str2, str3, str5, str7, mk2, str9, str10, str11));
        ml5 = str8;
        kVar2 = kVar3;
        aVar = new a(kVar2, ml5);
        str11 = ml5;
        aVar.f("empty", new PredefinedEnhancementInfoKt$$special$$inlined$enhancement$lambda$16(uVar2, str, str2, str3, str5, str7, mk2, str9, str10, str11));
        aVar.f("of", new PredefinedEnhancementInfoKt$$special$$inlined$enhancement$lambda$17(uVar, str, str2, str3, str5, str7, mk2, str9, str10, str11));
        aVar.f("ofNullable", new PredefinedEnhancementInfoKt$$special$$inlined$enhancement$lambda$18(uVar, str, str2, str3, str5, str7, mk2, str9, str10, str11));
        uVar2 = uVar;
        mk2 = "get";
        aVar.f(mk2, new PredefinedEnhancementInfoKt$$special$$inlined$enhancement$lambda$19(uVar2, str, str2, str3, str5, str7, mk2, str9, str10, str11));
        String str14 = mk2;
        aVar.f("ifPresent", new PredefinedEnhancementInfoKt$$special$$inlined$enhancement$lambda$20(uVar2, str, str2, str3, str5, str7, mj, str9, str10, str11));
        uVar2 = uVar;
        str8 = ml3;
        mk2 = str14;
        new a(kVar2, uVar.mj("ref/Reference")).f(mk2, new PredefinedEnhancementInfoKt$$special$$inlined$enhancement$lambda$21(uVar2, str, str2, str3, str5, str7, mj, str9, str10, str11));
        ml3 = str4;
        str = str8;
        str2 = ml3;
        String str15 = mk2;
        mk2 = "test";
        new a(kVar2, ml3).f(mk2, new PredefinedEnhancementInfoKt$$special$$inlined$enhancement$lambda$22(uVar2, str, str2, str3, str5, str7, mj, str9, str10, str11));
        str4 = ml3;
        a aVar3 = new a(kVar2, uVar.ml("BiPredicate"));
        str7 = str12;
        u uVar3 = uVar;
        String str16 = mk2;
        mk2 = mj;
        aVar3.f(str16, new PredefinedEnhancementInfoKt$$special$$inlined$enhancement$lambda$23(uVar2, str, str2, str3, str5, str7, mk2, str9, str10, str11));
        ml = str8;
        uVar2 = uVar3;
        str = ml;
        str2 = str4;
        mk2 = "accept";
        new a(kVar2, ml).f(mk2, new PredefinedEnhancementInfoKt$$special$$inlined$enhancement$lambda$24(uVar2, str, str2, str3, str5, str7, mk2, str9, str10, str11));
        ml3 = str12;
        a aVar4 = new a(kVar2, ml3);
        str7 = ml3;
        str8 = ml3;
        ml3 = mk2;
        mk2 = mj;
        aVar4.f(ml3, new PredefinedEnhancementInfoKt$$special$$inlined$enhancement$lambda$25(uVar2, str, str2, str3, str5, str7, mk2, str9, str10, str11));
        str7 = str8;
        mk2 = "apply";
        new a(kVar2, ml2).f(mk2, new PredefinedEnhancementInfoKt$$special$$inlined$enhancement$lambda$26(uVar2, str, str2, str3, str5, str7, mk2, str9, str10, str11));
        str12 = ml;
        ml = mk2;
        mk2 = mj;
        new a(kVar2, ml4).f(ml, new PredefinedEnhancementInfoKt$$special$$inlined$enhancement$lambda$27(uVar2, str, str2, str3, str5, str7, mk2, str9, str10, str11));
        u uVar4 = uVar3;
        new a(kVar2, uVar4.ml("Supplier")).f(str15, new PredefinedEnhancementInfoKt$$special$$inlined$enhancement$lambda$28(uVar4, str12, str2, str3, str5, str7, mk2, str9, str10, str11));
        fkN = kVar2.build();
    }

    public static final Map<String, h> bxZ() {
        return fkN;
    }
}