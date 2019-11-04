package com.iqoption.fragment.c.a.a;

import com.google.android.gms.plus.PlusShare;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, bng = {"Lcom/iqoption/fragment/infoasset/adapters/conditions/AssetScheduleTitle;", "Lcom/iqoption/fragment/infoasset/adapters/conditions/ConditionsAssetAdapterItem;", "title", "", "(Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "app_optionXRelease"})
/* compiled from: ConditionsAssetAdapterItems.kt */
public final class h extends j {
    private final String title;

    public final String getTitle() {
        return this.title;
    }

    public h(String str) {
        kotlin.jvm.internal.i.f(str, PlusShare.KEY_CONTENT_DEEP_LINK_METADATA_TITLE);
        super(7, null);
        this.title = str;
    }
}
