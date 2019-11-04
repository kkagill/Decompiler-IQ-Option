package com.iqoption.fragment.assets.model;

import com.google.android.gms.plus.PlusShare;
import com.iqoption.core.data.model.InstrumentType;
import com.iqoption.core.rx.c;
import com.iqoption.core.ui.widget.recyclerview.adapter.a.d;
import com.iqoption.dto.event.OtnEmissionExecuted;
import java.util.List;
import kotlin.TypeCastException;
import kotlin.i;
import kotlin.jvm.a.b;

@i(bne = {1, 1, 15}, bnf = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0010\u0000\n\u0002\b\u0004\b\b\u0018\u0000 >2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001>B)\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0002\u0010\tB-\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00000\u000b¢\u0006\u0002\u0010\fB\u0001\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00000\u000b\u0012\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u000b\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0016\u0012\u0014\b\u0002\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00110\u0018¢\u0006\u0002\u0010\u001aJ\t\u0010-\u001a\u00020\u0002HÆ\u0003J\t\u0010.\u001a\u00020\u0016HÆ\u0003J\u0015\u0010/\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00110\u0018HÆ\u0003J\t\u00100\u001a\u00020\u0004HÆ\u0003J\t\u00101\u001a\u00020\u0002HÆ\u0003J\t\u00102\u001a\u00020\u0006HÆ\u0003J\t\u00103\u001a\u00020\u0002HÆ\u0003J\t\u00104\u001a\u00020\u0011HÆ\u0003J\t\u00105\u001a\u00020\u0011HÆ\u0003J\u000f\u00106\u001a\b\u0012\u0004\u0012\u00020\u00000\u000bHÆ\u0003J\u000f\u00107\u001a\b\u0012\u0004\u0012\u00020\u00140\u000bHÆ\u0003J\u0001\u00108\u001a\u00020\u00002\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u00062\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00112\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00000\u000b2\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u000b2\b\b\u0002\u0010\u0015\u001a\u00020\u00162\u0014\b\u0002\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00110\u0018HÆ\u0001J\u0013\u00109\u001a\u00020\u00112\b\u0010:\u001a\u0004\u0018\u00010;H\u0002J\b\u0010<\u001a\u00020\u0006H\u0016J\t\u0010=\u001a\u00020\u0002HÖ\u0001R\u0011\u0010\u0015\u001a\u00020\u0016¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u001d\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00110\u0018¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u0005\u001a\u00020\u0002¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0014\u0010\r\u001a\u00020\u0002X\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010 R\u0011\u0010\u000f\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u000b¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0011\u0010&\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0011\u0010\u0012\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010'R\u0011\u0010(\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b(\u0010'R\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010'R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00000\u000b¢\u0006\b\n\u0000\u001a\u0004\b)\u0010%R\u0011\u0010\u000e\u001a\u00020\u0002¢\u0006\b\n\u0000\u001a\u0004\b*\u0010 R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,¨\u0006?"}, bng = {"Lcom/iqoption/fragment/assets/model/AssetCategory;", "Lcom/iqoption/core/ui/widget/recyclerview/adapter/diff/Identifiable;", "", "type", "Lcom/iqoption/fragment/assets/model/AssetCategoryType;", "count", "", "titleResId", "imageResId", "(Lcom/iqoption/fragment/assets/model/AssetCategoryType;III)V", "subCategories", "", "(Lcom/iqoption/fragment/assets/model/AssetCategoryType;IILjava/util/List;)V", "id", "title", "image", "isSelected", "", "isExpanded", "instrumentTypes", "Lcom/iqoption/core/data/model/InstrumentType;", "assetSorting", "Lcom/iqoption/fragment/assets/model/AssetSorting;", "assetsFilter", "Lkotlin/Function1;", "Lcom/iqoption/core/microservices/tradingengine/response/active/Active;", "(Ljava/lang/String;Lcom/iqoption/fragment/assets/model/AssetCategoryType;Ljava/lang/String;ILjava/lang/String;ZZLjava/util/List;Ljava/util/List;Lcom/iqoption/fragment/assets/model/AssetSorting;Lkotlin/jvm/functions/Function1;)V", "getAssetSorting", "()Lcom/iqoption/fragment/assets/model/AssetSorting;", "getAssetsFilter", "()Lkotlin/jvm/functions/Function1;", "getCount", "()Ljava/lang/String;", "getId", "getImage", "()I", "getInstrumentTypes", "()Ljava/util/List;", "isExpandable", "()Z", "isSelectable", "getSubCategories", "getTitle", "getType", "()Lcom/iqoption/fragment/assets/model/AssetCategoryType;", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "", "hashCode", "toString", "Companion", "app_optionXRelease"})
/* compiled from: AssetCategory.kt */
public final class e implements d<String> {
    public static final a dbR = new a();
    private final boolean ape;
    private final List<InstrumentType> axW;
    private final AssetCategoryType dbM;
    private final String dbN;
    private final List<e> dbO;
    private final p dbP;
    private final b<com.iqoption.core.microservices.tradingengine.response.active.a, Boolean> dbQ;
    private final String id;
    private final int image;
    private final boolean isSelected;
    private final String title;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, bng = {"Lcom/iqoption/fragment/assets/model/AssetCategory$Companion;", "", "()V", "CATEGORY_ID_MORE", "", "app_optionXRelease"})
    /* compiled from: AssetCategory.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }
    }

    public static /* synthetic */ e a(e eVar, String str, AssetCategoryType assetCategoryType, String str2, int i, String str3, boolean z, boolean z2, List list, List list2, p pVar, b bVar, int i2, Object obj) {
        e eVar2 = eVar;
        int i3 = i2;
        return eVar.a((i3 & 1) != 0 ? eVar.getId() : str, (i3 & 2) != 0 ? eVar2.dbM : assetCategoryType, (i3 & 4) != 0 ? eVar2.title : str2, (i3 & 8) != 0 ? eVar2.image : i, (i3 & 16) != 0 ? eVar2.dbN : str3, (i3 & 32) != 0 ? eVar2.isSelected : z, (i3 & 64) != 0 ? eVar2.ape : z2, (i3 & 128) != 0 ? eVar2.dbO : list, (i3 & 256) != 0 ? eVar2.axW : list2, (i3 & 512) != 0 ? eVar2.dbP : pVar, (i3 & 1024) != 0 ? eVar2.dbQ : bVar);
    }

    public final e a(String str, AssetCategoryType assetCategoryType, String str2, int i, String str3, boolean z, boolean z2, List<e> list, List<? extends InstrumentType> list2, p pVar, b<? super com.iqoption.core.microservices.tradingengine.response.active.a, Boolean> bVar) {
        String str4 = str;
        kotlin.jvm.internal.i.f(str, "id");
        AssetCategoryType assetCategoryType2 = assetCategoryType;
        kotlin.jvm.internal.i.f(assetCategoryType, "type");
        String str5 = str2;
        kotlin.jvm.internal.i.f(str5, PlusShare.KEY_CONTENT_DEEP_LINK_METADATA_TITLE);
        String str6 = str3;
        kotlin.jvm.internal.i.f(str6, OtnEmissionExecuted.COUNT);
        List<e> list3 = list;
        kotlin.jvm.internal.i.f(list3, "subCategories");
        List<? extends InstrumentType> list4 = list2;
        kotlin.jvm.internal.i.f(list4, "instrumentTypes");
        p pVar2 = pVar;
        kotlin.jvm.internal.i.f(pVar2, "assetSorting");
        b<? super com.iqoption.core.microservices.tradingengine.response.active.a, Boolean> bVar2 = bVar;
        kotlin.jvm.internal.i.f(bVar2, "assetsFilter");
        return new e(str4, assetCategoryType2, str5, i, str6, z, z2, list3, list4, pVar2, bVar2);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("AssetCategory(id=");
        stringBuilder.append(getId());
        stringBuilder.append(", type=");
        stringBuilder.append(this.dbM);
        stringBuilder.append(", title=");
        stringBuilder.append(this.title);
        stringBuilder.append(", image=");
        stringBuilder.append(this.image);
        stringBuilder.append(", count=");
        stringBuilder.append(this.dbN);
        stringBuilder.append(", isSelected=");
        stringBuilder.append(this.isSelected);
        stringBuilder.append(", isExpanded=");
        stringBuilder.append(this.ape);
        stringBuilder.append(", subCategories=");
        stringBuilder.append(this.dbO);
        stringBuilder.append(", instrumentTypes=");
        stringBuilder.append(this.axW);
        stringBuilder.append(", assetSorting=");
        stringBuilder.append(this.dbP);
        stringBuilder.append(", assetsFilter=");
        stringBuilder.append(this.dbQ);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public e(String str, AssetCategoryType assetCategoryType, String str2, int i, String str3, boolean z, boolean z2, List<e> list, List<? extends InstrumentType> list2, p pVar, b<? super com.iqoption.core.microservices.tradingengine.response.active.a, Boolean> bVar) {
        kotlin.jvm.internal.i.f(str, "id");
        kotlin.jvm.internal.i.f(assetCategoryType, "type");
        kotlin.jvm.internal.i.f(str2, PlusShare.KEY_CONTENT_DEEP_LINK_METADATA_TITLE);
        kotlin.jvm.internal.i.f(str3, OtnEmissionExecuted.COUNT);
        kotlin.jvm.internal.i.f(list, "subCategories");
        kotlin.jvm.internal.i.f(list2, "instrumentTypes");
        kotlin.jvm.internal.i.f(pVar, "assetSorting");
        kotlin.jvm.internal.i.f(bVar, "assetsFilter");
        this.id = str;
        this.dbM = assetCategoryType;
        this.title = str2;
        this.image = i;
        this.dbN = str3;
        this.isSelected = z;
        this.ape = z2;
        this.dbO = list;
        this.axW = list2;
        this.dbP = pVar;
        this.dbQ = bVar;
    }

    public String getId() {
        return this.id;
    }

    public /* synthetic */ e(String str, AssetCategoryType assetCategoryType, String str2, int i, String str3, boolean z, boolean z2, List list, List list2, p pVar, b bVar, int i2, f fVar) {
        AssetCategoryType assetCategoryType2;
        int i3 = i2;
        if ((i3 & 2) != 0) {
            assetCategoryType2 = AssetCategoryType.UNKNOWN;
        } else {
            assetCategoryType2 = assetCategoryType;
        }
        this(str, assetCategoryType2, str2, (i3 & 8) != 0 ? 0 : i, (i3 & 16) != 0 ? "" : str3, (i3 & 32) != 0 ? false : z, (i3 & 64) != 0 ? false : z2, (i3 & 128) != 0 ? m.emptyList() : list, (i3 & 256) != 0 ? m.emptyList() : list2, (i3 & 512) != 0 ? AssetCategoryType.Companion.aAT() : pVar, (i3 & 1024) != 0 ? c.akb() : bVar);
    }

    public final AssetCategoryType aAN() {
        return this.dbM;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int aAO() {
        return this.image;
    }

    public final boolean isSelected() {
        return this.isSelected;
    }

    public final boolean nq() {
        return this.ape;
    }

    public final List<e> aAP() {
        return this.dbO;
    }

    public final List<InstrumentType> JU() {
        return this.axW;
    }

    public final p aAQ() {
        return this.dbP;
    }

    public final b<com.iqoption.core.microservices.tradingengine.response.active.a, Boolean> aAR() {
        return this.dbQ;
    }

    public final boolean Ng() {
        return this.dbO.isEmpty() ^ 1;
    }

    public final boolean isSelectable() {
        String id = getId();
        for (Enum enumR : AssetCategoryType.values()) {
            if (kotlin.jvm.internal.i.y(enumR.name(), id)) {
                break;
            }
        }
        Enum enumR2 = null;
        return enumR2 != null;
    }

    public /* synthetic */ e(AssetCategoryType assetCategoryType, int i, int i2, int i3, int i4, f fVar) {
        if ((i4 & 8) != 0) {
            i3 = 0;
        }
        this(assetCategoryType, i, i2, i3);
    }

    public e(AssetCategoryType assetCategoryType, int i, int i2, int i3) {
        AssetCategoryType assetCategoryType2 = assetCategoryType;
        kotlin.jvm.internal.i.f(assetCategoryType, "type");
        this(assetCategoryType.name(), assetCategoryType2, com.iqoption.core.d.getString(i2), i3, String.valueOf(i), false, false, null, assetCategoryType.getTypes(), assetCategoryType.getSorting(), new AssetCategory$1(assetCategoryType), 224, null);
    }

    public e(AssetCategoryType assetCategoryType, int i, int i2, List<e> list) {
        AssetCategoryType assetCategoryType2 = assetCategoryType;
        kotlin.jvm.internal.i.f(assetCategoryType2, "type");
        List<e> list2 = list;
        kotlin.jvm.internal.i.f(list2, "subCategories");
        this(assetCategoryType.name(), assetCategoryType2, com.iqoption.core.d.getString(i), i2, "", false, false, list2, null, null, null, 1888, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((kotlin.jvm.internal.i.y(getClass(), obj != null ? obj.getClass() : null) ^ 1) != 0) {
            return false;
        }
        if (obj != null) {
            e eVar = (e) obj;
            if ((kotlin.jvm.internal.i.y(getId(), eVar.getId()) ^ 1) == 0 && (kotlin.jvm.internal.i.y(this.title, eVar.title) ^ 1) == 0 && this.image == eVar.image && (kotlin.jvm.internal.i.y(this.dbN, eVar.dbN) ^ 1) == 0 && this.isSelected == eVar.isSelected && this.ape == eVar.ape && (kotlin.jvm.internal.i.y(this.dbP, eVar.dbP) ^ 1) == 0) {
                return true;
            }
            return false;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.iqoption.fragment.assets.model.AssetCategory");
    }

    public int hashCode() {
        return (((((((((((getId().hashCode() * 31) + this.title.hashCode()) * 31) + this.image) * 31) + this.dbN.hashCode()) * 31) + Boolean.valueOf(this.isSelected).hashCode()) * 31) + Boolean.valueOf(this.ape).hashCode()) * 31) + this.dbP.hashCode();
    }
}
