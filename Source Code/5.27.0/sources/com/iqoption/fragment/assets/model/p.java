package com.iqoption.fragment.assets.model;

import com.google.common.collect.Ordering;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import kotlin.TypeCastException;

@kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000  2\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003:\u0001 B\u001f\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nB%\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\f¢\u0006\u0002\u0010\rJ\u001c\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u00022\b\u0010\u0019\u001a\u0004\u0018\u00010\u0002H\u0016J$\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tJ\u0013\u0010\u001b\u001a\u00020\t2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0002J\b\u0010\u001e\u001a\u00020\u0017H\u0016J\u0010\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\u001f\u001a\u00020\u0007R\"\u0010\u000e\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001j\n\u0012\u0004\u0012\u00020\u0002\u0018\u0001`\u0003X\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\f8\u0002X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R!\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u00038F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006!"}, bng = {"Lcom/iqoption/fragment/assets/model/AssetSorting;", "Ljava/util/Comparator;", "Lcom/iqoption/fragment/assets/model/AssetSortable;", "Lkotlin/Comparator;", "categoryType", "Lcom/iqoption/fragment/assets/model/AssetCategoryType;", "sortType", "Lcom/iqoption/fragment/assets/model/AssetSortType;", "isAscending", "", "(Lcom/iqoption/fragment/assets/model/AssetCategoryType;Lcom/iqoption/fragment/assets/model/AssetSortType;Z)V", "ascFlags", "", "(Lcom/iqoption/fragment/assets/model/AssetCategoryType;Lcom/iqoption/fragment/assets/model/AssetSortType;Ljava/util/List;)V", "_comparator", "getCategoryType", "()Lcom/iqoption/fragment/assets/model/AssetCategoryType;", "comparator", "getComparator", "()Ljava/util/Comparator;", "getSortType", "()Lcom/iqoption/fragment/assets/model/AssetSortType;", "compare", "", "o1", "o2", "copy", "equals", "other", "", "hashCode", "type", "Companion", "app_optionXRelease"})
/* compiled from: AssetSorting.kt */
public final class p implements Comparator<o> {
    private static final Ordering<o> dcJ = Ordering.from((Comparator) m.ddd);
    private static final Ordering<o> dcK = Ordering.from((Comparator) k.ddb);
    private static final Ordering<o> dcL = Ordering.from((Comparator) l.ddc);
    private static final Ordering<o> dcM = dcJ.compound((Comparator) dcK).compound((Comparator) dcL);
    private static final Comparator<o> dcN;
    private static final Map<AssetSortType, Comparator<o>> dcO;
    private static final Map<AssetSortType, Ordering<o>> dcP;
    private static final Map<AssetSortType, Ordering<o>> dcQ;
    public static final a dcR = new a();
    private transient Comparator<o> dcF;
    @SerializedName("categoryType")
    private final AssetCategoryType dcG;
    @SerializedName("sortType")
    private final AssetSortType dcH;
    @SerializedName("ascFlags")
    private final List<Boolean> dcI;

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J(\u0010\u0015\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u00062\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u000bH\u0002J.\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00050\f2\u0016\u0010\u001a\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u00062\u0006\u0010\u001b\u001a\u00020\u0017H\u0002R!\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR \u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\f0\nX\u0004¢\u0006\u0002\n\u0000R*\u0010\r\u001a\u001e\u0012\u0004\u0012\u00020\u000b\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u00060\u000eX\u0004¢\u0006\u0002\n\u0000R \u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\f0\nX\u0004¢\u0006\u0002\n\u0000R2\u0010\u0010\u001a&\u0012\f\u0012\n \u0011*\u0004\u0018\u00010\u00050\u0005 \u0011*\u0012\u0012\f\u0012\n \u0011*\u0004\u0018\u00010\u00050\u0005\u0018\u00010\f0\fX\u0004¢\u0006\u0002\n\u0000R2\u0010\u0012\u001a&\u0012\f\u0012\n \u0011*\u0004\u0018\u00010\u00050\u0005 \u0011*\u0012\u0012\f\u0012\n \u0011*\u0004\u0018\u00010\u00050\u0005\u0018\u00010\f0\fX\u0004¢\u0006\u0002\n\u0000R2\u0010\u0013\u001a&\u0012\f\u0012\n \u0011*\u0004\u0018\u00010\u00050\u0005 \u0011*\u0012\u0012\f\u0012\n \u0011*\u0004\u0018\u00010\u00050\u0005\u0018\u00010\f0\fX\u0004¢\u0006\u0002\n\u0000R2\u0010\u0014\u001a&\u0012\f\u0012\n \u0011*\u0004\u0018\u00010\u00050\u0005 \u0011*\u0012\u0012\f\u0012\n \u0011*\u0004\u0018\u00010\u00050\u0005\u0018\u00010\f0\fX\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, bng = {"Lcom/iqoption/fragment/assets/model/AssetSorting$Companion;", "", "()V", "ASC_BY_NAME_ORDERING", "Ljava/util/Comparator;", "Lcom/iqoption/fragment/assets/model/AssetSortable;", "Lkotlin/Comparator;", "getASC_BY_NAME_ORDERING", "()Ljava/util/Comparator;", "ASC_COMPARATORS", "", "Lcom/iqoption/fragment/assets/model/AssetSortType;", "Lcom/google/common/collect/Ordering;", "CONCRETE_COMPARATORS", "", "DESC_COMPARATORS", "IS_FAVORITE_ORDERING", "kotlin.jvm.PlatformType", "IS_OPENED_ORDERING", "IS_ORDERING", "IS_SYSTEM_ORDERING", "chooseComparator", "isAscending", "", "sortType", "wrap", "comparator", "endsWithNameOrdering", "app_optionXRelease"})
    /* compiled from: AssetSorting.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        private final Ordering<o> a(Comparator<o> comparator, boolean z) {
            Ordering compound = p.dcM.compound((Comparator) Ordering.from((Comparator) comparator));
            if (z) {
                Ordering<o> compound2 = compound.compound(p.dcR.aBA());
                kotlin.jvm.internal.i.e(compound2, "ordering.compound(ASC_BY_NAME_ORDERING)");
                return compound2;
            }
            kotlin.jvm.internal.i.e(compound, "ordering");
            return compound;
        }

        public final Comparator<o> aBA() {
            return p.dcN;
        }

        private final Comparator<o> a(boolean z, AssetSortType assetSortType) {
            Map aBy;
            if (z) {
                aBy = p.dcP;
            } else {
                aBy = p.dcQ;
            }
            Ordering ordering = (Ordering) aBy.get(assetSortType);
            if (ordering != null) {
                return ordering;
            }
            return aBA();
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, bng = {"<anonymous>", "", "o1", "Lcom/iqoption/fragment/assets/model/AssetSortable;", "kotlin.jvm.PlatformType", "o2", "compare"})
    /* compiled from: AssetSorting.kt */
    static final class b<T> implements Comparator<T> {
        public static final b dcS = new b();

        b() {
        }

        /* renamed from: a */
        public final int compare(o oVar, o oVar2) {
            return oVar.getName().compareTo(oVar2.getName());
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, bng = {"<anonymous>", "", "o1", "Lcom/iqoption/fragment/assets/model/AssetSortable;", "kotlin.jvm.PlatformType", "o2", "compare"})
    /* compiled from: AssetSorting.kt */
    static final class c<T> implements Comparator<o> {
        public static final c dcT = new c();

        c() {
        }

        /* renamed from: a */
        public final int compare(o oVar, o oVar2) {
            return oVar.getName().compareTo(oVar2.getName());
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, bng = {"<anonymous>", "", "o1", "Lcom/iqoption/fragment/assets/model/AssetSortable;", "kotlin.jvm.PlatformType", "o2", "compare"})
    /* compiled from: AssetSorting.kt */
    static final class d<T> implements Comparator<o> {
        public static final d dcU = new d();

        d() {
        }

        /* renamed from: a */
        public final int compare(o oVar, o oVar2) {
            return kotlin.jvm.internal.i.compare(oVar.aAH(), oVar2.aAH());
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, bng = {"<anonymous>", "", "o1", "Lcom/iqoption/fragment/assets/model/AssetSortable;", "kotlin.jvm.PlatformType", "o2", "compare"})
    /* compiled from: AssetSorting.kt */
    static final class e<T> implements Comparator<o> {
        public static final e dcV = new e();

        e() {
        }

        /* renamed from: a */
        public final int compare(o oVar, o oVar2) {
            return Double.compare(oVar.adn(), oVar2.adn());
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, bng = {"<anonymous>", "", "o1", "Lcom/iqoption/fragment/assets/model/AssetSortable;", "kotlin.jvm.PlatformType", "o2", "compare"})
    /* compiled from: AssetSorting.kt */
    static final class f<T> implements Comparator<o> {
        public static final f dcW = new f();

        f() {
        }

        /* renamed from: a */
        public final int compare(o oVar, o oVar2) {
            return kotlin.jvm.internal.i.compare(oVar.aAI(), oVar2.aAI());
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, bng = {"<anonymous>", "", "o1", "Lcom/iqoption/fragment/assets/model/AssetSortable;", "kotlin.jvm.PlatformType", "o2", "compare"})
    /* compiled from: AssetSorting.kt */
    static final class g<T> implements Comparator<o> {
        public static final g dcX = new g();

        g() {
        }

        /* renamed from: a */
        public final int compare(o oVar, o oVar2) {
            return kotlin.jvm.internal.i.compare(oVar.aAJ(), oVar2.aAJ());
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, bng = {"<anonymous>", "", "o1", "Lcom/iqoption/fragment/assets/model/AssetSortable;", "kotlin.jvm.PlatformType", "o2", "compare"})
    /* compiled from: AssetSorting.kt */
    static final class h<T> implements Comparator<o> {
        public static final h dcY = new h();

        h() {
        }

        /* renamed from: a */
        public final int compare(o oVar, o oVar2) {
            return Double.compare(oVar.aAK(), oVar2.aAK());
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, bng = {"<anonymous>", "", "o1", "Lcom/iqoption/fragment/assets/model/AssetSortable;", "kotlin.jvm.PlatformType", "o2", "compare"})
    /* compiled from: AssetSorting.kt */
    static final class i<T> implements Comparator<o> {
        public static final i dcZ = new i();

        i() {
        }

        /* renamed from: a */
        public final int compare(o oVar, o oVar2) {
            return Double.compare(oVar.aAL(), oVar2.aAL());
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, bng = {"<anonymous>", "", "o1", "Lcom/iqoption/fragment/assets/model/AssetSortable;", "kotlin.jvm.PlatformType", "o2", "compare"})
    /* compiled from: AssetSorting.kt */
    static final class j<T> implements Comparator<o> {
        public static final j dda = new j();

        j() {
        }

        /* renamed from: a */
        public final int compare(o oVar, o oVar2) {
            return kotlin.jvm.internal.i.compare(oVar.getLeverage(), oVar2.getLeverage());
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, bng = {"<anonymous>", "", "o1", "Lcom/iqoption/fragment/assets/model/AssetSortable;", "kotlin.jvm.PlatformType", "o2", "compare"})
    /* compiled from: AssetSorting.kt */
    static final class k<T> implements Comparator<T> {
        public static final k ddb = new k();

        k() {
        }

        /* renamed from: a */
        public final int compare(o oVar, o oVar2) {
            return kotlin.jvm.internal.i.compare(oVar.QE() ^ 1, oVar2.QE() ^ 1);
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, bng = {"<anonymous>", "", "o1", "Lcom/iqoption/fragment/assets/model/AssetSortable;", "kotlin.jvm.PlatformType", "o2", "compare"})
    /* compiled from: AssetSorting.kt */
    static final class l<T> implements Comparator<T> {
        public static final l ddc = new l();

        l() {
        }

        /* renamed from: a */
        public final int compare(o oVar, o oVar2) {
            return kotlin.jvm.internal.i.compare(oVar.isOpened() ^ 1, oVar2.isOpened() ^ 1);
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, bng = {"<anonymous>", "", "o1", "Lcom/iqoption/fragment/assets/model/AssetSortable;", "kotlin.jvm.PlatformType", "o2", "compare"})
    /* compiled from: AssetSorting.kt */
    static final class m<T> implements Comparator<T> {
        public static final m ddd = new m();

        m() {
        }

        /* renamed from: a */
        public final int compare(o oVar, o oVar2) {
            return kotlin.jvm.internal.i.compare(oVar.isSystem(), oVar2.isSystem());
        }
    }

    private p(AssetCategoryType assetCategoryType, AssetSortType assetSortType, List<Boolean> list) {
        this.dcG = assetCategoryType;
        this.dcH = assetSortType;
        this.dcI = list;
    }

    public final AssetCategoryType aBu() {
        return this.dcG;
    }

    public final AssetSortType aBv() {
        return this.dcH;
    }

    public final Comparator<o> getComparator() {
        Comparator<o> comparator = this.dcF;
        if (comparator != null) {
            return comparator;
        }
        Ordering compound = Ordering.from(dcR.a(a(this, null, 1, null), this.dcH)).compound(dcN);
        Comparator<o> comparator2 = compound;
        this.dcF = comparator2;
        kotlin.jvm.internal.i.e(compound, "Ordering.from(chooseComp…comparator = it\n        }");
        return comparator2;
    }

    public p(AssetCategoryType assetCategoryType, AssetSortType assetSortType, boolean z) {
        kotlin.jvm.internal.i.f(assetCategoryType, "categoryType");
        kotlin.jvm.internal.i.f(assetSortType, "sortType");
        AssetSortType[] values = AssetSortType.values();
        Collection arrayList = new ArrayList(values.length);
        for (AssetSortType assetSortType2 : values) {
            boolean z2 = assetSortType2 == assetSortType && z;
            arrayList.add(Boolean.valueOf(z2));
        }
        this(assetCategoryType, assetSortType, (List) arrayList);
    }

    /* renamed from: a */
    public int compare(o oVar, o oVar2) {
        return getComparator().compare(oVar, oVar2);
    }

    public static /* synthetic */ boolean a(p pVar, AssetSortType assetSortType, int i, Object obj) {
        if ((i & 1) != 0) {
            assetSortType = pVar.dcH;
        }
        return pVar.b(assetSortType);
    }

    public final boolean b(AssetSortType assetSortType) {
        kotlin.jvm.internal.i.f(assetSortType, "type");
        return ((Boolean) this.dcI.get(assetSortType.ordinal())).booleanValue();
    }

    public static /* synthetic */ p a(p pVar, AssetCategoryType assetCategoryType, AssetSortType assetSortType, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            assetCategoryType = pVar.dcG;
        }
        if ((i & 2) != 0) {
            assetSortType = pVar.dcH;
        }
        if ((i & 4) != 0) {
            z = pVar.b(assetSortType);
        }
        return pVar.a(assetCategoryType, assetSortType, z);
    }

    public final p a(AssetCategoryType assetCategoryType, AssetSortType assetSortType, boolean z) {
        List a;
        kotlin.jvm.internal.i.f(assetCategoryType, "categoryType");
        kotlin.jvm.internal.i.f(assetSortType, "sortType");
        if (((Boolean) this.dcI.get(assetSortType.ordinal())).booleanValue() != z) {
            a = com.iqoption.core.ext.c.a(this.dcI, assetSortType.ordinal(), Boolean.valueOf(z));
        } else {
            a = this.dcI;
        }
        return new p(assetCategoryType, assetSortType, a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((kotlin.jvm.internal.i.y(getClass(), obj != null ? obj.getClass() : null) ^ 1) != 0) {
            return false;
        }
        if (obj != null) {
            p pVar = (p) obj;
            if (this.dcG == pVar.dcG && this.dcH == pVar.dcH && (kotlin.jvm.internal.i.y(this.dcI, pVar.dcI) ^ 1) == 0) {
                return true;
            }
            return false;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.iqoption.fragment.assets.model.AssetSorting");
    }

    public int hashCode() {
        return (((this.dcG.hashCode() * 31) + this.dcH.hashCode()) * 31) + this.dcI.hashCode();
    }

    static {
        Entry entry;
        Ordering from = Ordering.from((Comparator) b.dcS);
        kotlin.jvm.internal.i.e(from, "Ordering.from { o1, o2 -…pareTo(o2.name)\n        }");
        dcN = from;
        Map linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(AssetSortType.BY_NAME, c.dcT);
        linkedHashMap.put(AssetSortType.BY_PROFIT, d.dcU);
        linkedHashMap.put(AssetSortType.BY_DIFF, e.dcV);
        linkedHashMap.put(AssetSortType.BY_SPOT_PROFIT, f.dcW);
        linkedHashMap.put(AssetSortType.BY_EXPIRATION, g.dcX);
        linkedHashMap.put(AssetSortType.BY_VOLUME, h.dcY);
        linkedHashMap.put(AssetSortType.BY_SPREAD, i.dcZ);
        linkedHashMap.put(AssetSortType.BY_LEVERAGE, j.dda);
        dcO = linkedHashMap;
        linkedHashMap = dcO;
        Map linkedHashMap2 = new LinkedHashMap(af.jL(linkedHashMap.size()));
        Iterator it = linkedHashMap.entrySet().iterator();
        while (true) {
            boolean z = true;
            if (!it.hasNext()) {
                break;
            }
            entry = (Entry) it.next();
            Object key = entry.getKey();
            a aVar = dcR;
            Comparator comparator = (Comparator) entry.getValue();
            if (((AssetSortType) entry.getKey()) == AssetSortType.BY_NAME) {
                z = false;
            }
            linkedHashMap2.put(key, aVar.a(comparator, z));
        }
        dcP = linkedHashMap2;
        linkedHashMap = dcO;
        linkedHashMap2 = new LinkedHashMap(af.jL(linkedHashMap.size()));
        for (Entry entry2 : linkedHashMap.entrySet()) {
            linkedHashMap2.put(entry2.getKey(), dcR.a(com.iqoption.core.ext.c.e((Comparator) entry2.getValue()), ((AssetSortType) entry2.getKey()) != AssetSortType.BY_NAME));
        }
        dcQ = linkedHashMap2;
    }
}
