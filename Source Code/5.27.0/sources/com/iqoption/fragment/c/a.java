package com.iqoption.fragment.c;

import com.google.gson.JsonObject;
import com.iqoption.app.b;
import com.iqoption.app.managers.tab.TabHelper;
import com.iqoption.core.analytics.d;
import com.iqoption.dto.Event;
import com.iqoption.dto.Event.Builder;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\n\u0010\u0003\u001a\u00060\u0004R\u00020\u0005J\u0006\u0010\u0006\u001a\u00020\u0007J\u0006\u0010\b\u001a\u00020\u0007J\u0006\u0010\t\u001a\u00020\u0007J\u0006\u0010\n\u001a\u00020\u0007J\u0006\u0010\u000b\u001a\u00020\u0007J\u0006\u0010\f\u001a\u00020\u0007J\u000e\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u000f¨\u0006\u0010"}, bng = {"Lcom/iqoption/fragment/infoasset/InfoAssetAnalyticsHelper;", "", "()V", "createInfoAsset", "Lcom/iqoption/dto/Event$Builder;", "Lcom/iqoption/dto/Event;", "sendCloseInfoAsset", "", "sendDescrInfoAsset", "sendFavoriteInfoAsset", "sendFullInformationInfoAsset", "sendMorePeriodsInfoAsset", "sendShowInfoAsset", "sendTabInfoAsset", "tabName", "", "app_optionXRelease"})
/* compiled from: InfoAssetAnalyticsHelper.kt */
public final class a {
    public static final a dgs = new a();

    private a() {
    }

    public final void aCZ() {
        d EC = com.iqoption.core.d.Um().EC();
        JsonObject jsonObject = new JsonObject();
        TabHelper IM = TabHelper.IM();
        String str = "TabHelper.instance()";
        kotlin.jvm.internal.i.e(IM, str);
        jsonObject.addProperty("asset_id", (Number) Integer.valueOf(IM.IX()));
        IM = TabHelper.IM();
        kotlin.jvm.internal.i.e(IM, str);
        jsonObject.addProperty("instrument_type", IM.IY().toString());
        b DG = b.DG();
        kotlin.jvm.internal.i.e(DG, "IQAccount.instance()");
        jsonObject.addProperty("balance_type", (Number) Integer.valueOf(DG.DJ()));
        EC.a("traderoom_info", jsonObject);
    }

    public final Builder aDa() {
        Builder Builder = Event.Builder(Event.CATEGORY_POPUP_SERVED, "asset-profile-large_show");
        JsonObject jsonObject = new JsonObject();
        TabHelper IM = TabHelper.IM();
        String str = "TabHelper.instance()";
        kotlin.jvm.internal.i.e(IM, str);
        jsonObject.addProperty("asset_id", (Number) Integer.valueOf(IM.IX()));
        IM = TabHelper.IM();
        kotlin.jvm.internal.i.e(IM, str);
        jsonObject.addProperty("instrument_type", IM.IY().toString());
        b DG = b.DG();
        kotlin.jvm.internal.i.e(DG, "IQAccount.instance()");
        jsonObject.addProperty("balance_type", (Number) Integer.valueOf(DG.DJ()));
        Builder = Builder.setParameters(jsonObject);
        kotlin.jvm.internal.i.e(Builder, "Event.Builder(Event.CATE…).balanceType)\n        })");
        return Builder;
    }

    public final void aDb() {
        d EC = com.iqoption.core.d.Um().EC();
        JsonObject jsonObject = new JsonObject();
        TabHelper IM = TabHelper.IM();
        String str = "TabHelper.instance()";
        kotlin.jvm.internal.i.e(IM, str);
        jsonObject.addProperty("asset_id", (Number) Integer.valueOf(IM.IX()));
        IM = TabHelper.IM();
        kotlin.jvm.internal.i.e(IM, str);
        jsonObject.addProperty("instrument_type", IM.IY().toString());
        b DG = b.DG();
        kotlin.jvm.internal.i.e(DG, "IQAccount.instance()");
        jsonObject.addProperty("balance_type", (Number) Integer.valueOf(DG.DJ()));
        EC.a("asset-profile-large_close", jsonObject);
    }

    public final void iu(String str) {
        kotlin.jvm.internal.i.f(str, "tabName");
        d EC = com.iqoption.core.d.Um().EC();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("asset-profile-large_");
        stringBuilder.append(str);
        str = stringBuilder.toString();
        JsonObject jsonObject = new JsonObject();
        TabHelper IM = TabHelper.IM();
        String str2 = "TabHelper.instance()";
        kotlin.jvm.internal.i.e(IM, str2);
        jsonObject.addProperty("asset_id", (Number) Integer.valueOf(IM.IX()));
        IM = TabHelper.IM();
        kotlin.jvm.internal.i.e(IM, str2);
        jsonObject.addProperty("instrument_type", IM.IY().toString());
        b DG = b.DG();
        kotlin.jvm.internal.i.e(DG, "IQAccount.instance()");
        jsonObject.addProperty("balance_type", (Number) Integer.valueOf(DG.DJ()));
        EC.a(str, jsonObject);
    }

    public final void aDc() {
        d EC = com.iqoption.core.d.Um().EC();
        JsonObject jsonObject = new JsonObject();
        TabHelper IM = TabHelper.IM();
        String str = "TabHelper.instance()";
        kotlin.jvm.internal.i.e(IM, str);
        jsonObject.addProperty("asset_id", (Number) Integer.valueOf(IM.IX()));
        IM = TabHelper.IM();
        kotlin.jvm.internal.i.e(IM, str);
        jsonObject.addProperty("instrument_type", IM.IY().toString());
        b DG = b.DG();
        kotlin.jvm.internal.i.e(DG, "IQAccount.instance()");
        jsonObject.addProperty("balance_type", (Number) Integer.valueOf(DG.DJ()));
        EC.a("asset-profile-large_information-favorite", jsonObject);
    }

    public final void aDd() {
        d EC = com.iqoption.core.d.Um().EC();
        JsonObject jsonObject = new JsonObject();
        TabHelper IM = TabHelper.IM();
        String str = "TabHelper.instance()";
        kotlin.jvm.internal.i.e(IM, str);
        jsonObject.addProperty("asset_id", (Number) Integer.valueOf(IM.IX()));
        IM = TabHelper.IM();
        kotlin.jvm.internal.i.e(IM, str);
        jsonObject.addProperty("instrument_type", IM.IY().toString());
        b DG = b.DG();
        kotlin.jvm.internal.i.e(DG, "IQAccount.instance()");
        jsonObject.addProperty("balance_type", (Number) Integer.valueOf(DG.DJ()));
        EC.a("asset-profile-large_information-more-periods", jsonObject);
    }

    public final void aDe() {
        d EC = com.iqoption.core.d.Um().EC();
        JsonObject jsonObject = new JsonObject();
        TabHelper IM = TabHelper.IM();
        String str = "TabHelper.instance()";
        kotlin.jvm.internal.i.e(IM, str);
        jsonObject.addProperty("asset_id", (Number) Integer.valueOf(IM.IX()));
        IM = TabHelper.IM();
        kotlin.jvm.internal.i.e(IM, str);
        jsonObject.addProperty("instrument_type", IM.IY().toString());
        b DG = b.DG();
        kotlin.jvm.internal.i.e(DG, "IQAccount.instance()");
        jsonObject.addProperty("balance_type", (Number) Integer.valueOf(DG.DJ()));
        EC.a("asset-profile-large_information-more-descriptions", jsonObject);
    }

    public final void aDf() {
        d EC = com.iqoption.core.d.Um().EC();
        JsonObject jsonObject = new JsonObject();
        TabHelper IM = TabHelper.IM();
        String str = "TabHelper.instance()";
        kotlin.jvm.internal.i.e(IM, str);
        jsonObject.addProperty("asset_id", (Number) Integer.valueOf(IM.IX()));
        IM = TabHelper.IM();
        kotlin.jvm.internal.i.e(IM, str);
        jsonObject.addProperty("instrument_type", IM.IY().toString());
        b DG = b.DG();
        kotlin.jvm.internal.i.e(DG, "IQAccount.instance()");
        jsonObject.addProperty("balance_type", (Number) Integer.valueOf(DG.DJ()));
        EC.a("asset-profile-large_information-full-information", jsonObject);
    }
}
