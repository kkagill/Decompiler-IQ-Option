package com.iqoption.fragment.assets.model;

import com.iqoption.core.ui.widget.recyclerview.adapter.a.d;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0004J\u0010\u0010\u001f\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020!H\u0016R\u0014\u0010\u0005\u001a\u00020\u00068VX\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\n8VX\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u000e8VX\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u000e8VX\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u000e8VX\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\n8VX\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\fR\u0014\u0010\u0014\u001a\u00020\u00028VX\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\n8VX\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\fR\u0014\u0010\u0019\u001a\u00020\n8VX\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\fR\u0014\u0010\u001b\u001a\u00020\u00068VX\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\bR\u0014\u0010\u001d\u001a\u00020\u00068VX\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\b\u0001\u0003\"#$¨\u0006%"}, bng = {"Lcom/iqoption/fragment/assets/model/AssetAdapterItem;", "Lcom/iqoption/core/ui/widget/recyclerview/adapter/diff/Identifiable;", "", "Lcom/iqoption/fragment/assets/model/AssetSortable;", "()V", "diff", "", "getDiff", "()D", "expiration", "", "getExpiration", "()I", "isFavorite", "", "()Z", "isOpened", "isSystem", "leverage", "getLeverage", "name", "getName", "()Ljava/lang/String;", "profit", "getProfit", "spotProfit", "getSpotProfit", "spread", "getSpread", "volume", "getVolume", "matches", "constraint", "", "Lcom/iqoption/fragment/assets/model/AssetItem;", "Lcom/iqoption/fragment/assets/model/SpreadWarning;", "Lcom/iqoption/fragment/assets/model/MultiWarning;", "app_optionXRelease"})
/* compiled from: AssetAdapterItems.kt */
public abstract class a implements d<String>, o {
    public boolean L(CharSequence charSequence) {
        kotlin.jvm.internal.i.f(charSequence, "constraint");
        return true;
    }

    public boolean QE() {
        return false;
    }

    public int aAH() {
        return 0;
    }

    public int aAI() {
        return 0;
    }

    public int aAJ() {
        return 0;
    }

    public double aAK() {
        return 0.0d;
    }

    public double aAL() {
        return 0.0d;
    }

    public double adn() {
        return 0.0d;
    }

    public int getLeverage() {
        return 0;
    }

    public String getName() {
        return "";
    }

    public boolean isOpened() {
        return true;
    }

    public boolean isSystem() {
        return false;
    }

    private a() {
    }

    public /* synthetic */ a(f fVar) {
        this();
    }
}
