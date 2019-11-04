package com.iqoption.fragment;

import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0001\u0002\u0007\b¨\u0006\t"}, bng = {"Lcom/iqoption/fragment/AssetTab;", "", "tabType", "Lcom/iqoption/fragment/TabType;", "(Lcom/iqoption/fragment/TabType;)V", "getTabType", "()Lcom/iqoption/fragment/TabType;", "Lcom/iqoption/fragment/TabMore;", "Lcom/iqoption/fragment/InstrumentTab;", "app_optionXRelease"})
/* compiled from: TabTypes.kt */
public abstract class b {
    private final TabType cUb;

    private b(TabType tabType) {
        this.cUb = tabType;
    }

    public /* synthetic */ b(TabType tabType, f fVar) {
        this(tabType);
    }

    public final TabType axq() {
        return this.cUb;
    }
}
