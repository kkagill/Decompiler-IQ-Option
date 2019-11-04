package com.iqoption.fragment.leftmenu.content;

import androidx.core.app.NotificationCompat;
import com.iqoption.microservice.regulators.response.StatusType;
import com.iqoption.x.R;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u000b\u001a\u00020\u0006H\u0016J\u0012\u0010\f\u001a\u0004\u0018\u00010\u00012\u0006\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u000eH\u0016J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0011H\u0016J\b\u0010\u0013\u001a\u00020\u0011H\u0016J\b\u0010\u0014\u001a\u00020\u0011H\u0016J\b\u0010\u0015\u001a\u00020\u000eH\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0017H\u0016J\b\u0010\u0019\u001a\u00020\u0017H\u0016J\b\u0010\u001a\u001a\u00020\u0017H\u0016J\b\u0010\u001b\u001a\u00020\u000eH\u0016J\b\u0010\u001c\u001a\u00020\u000eH\u0016J\b\u0010\u001d\u001a\u00020\u0006H\u0016R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00068VX\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u001e"}, bng = {"Lcom/iqoption/fragment/leftmenu/content/ProTraderMenuItem;", "Lcom/iqoption/fragment/leftmenu/content/LeftMenuItem;", "status", "Lcom/iqoption/microservice/regulators/response/StatusType;", "(Lcom/iqoption/microservice/regulators/response/StatusType;)V", "id", "", "getId", "()Ljava/lang/String;", "getStatus", "()Lcom/iqoption/microservice/regulators/response/StatusType;", "analyticsEventName", "getChild", "index", "", "getChildCount", "getCollapseIcon", "", "getExpandIcon", "getIcon", "getNameToDisplay", "getSize", "isClickable", "", "isEnabled", "isInProgress", "isVisible", "layoutResId", "menuPriority", "name", "app_optionXRelease"})
/* compiled from: ProTraderMenuItem.kt */
public final class b implements a {
    private final StatusType djq;

    public String analyticsEventName() {
        return "";
    }

    public a getChild(int i) {
        return null;
    }

    public int getChildCount() {
        return 0;
    }

    public int getSize() {
        return 1;
    }

    public boolean isEnabled() {
        return true;
    }

    public boolean isInProgress() {
        return false;
    }

    public boolean isVisible() {
        return true;
    }

    public int layoutResId() {
        return R.layout.left_menu_item_pro_trader;
    }

    public int menuPriority() {
        return 2;
    }

    public String name() {
        return "pro-trader";
    }

    public b(StatusType statusType) {
        kotlin.jvm.internal.i.f(statusType, NotificationCompat.CATEGORY_STATUS);
        this.djq = statusType;
    }

    public final StatusType aED() {
        return this.djq;
    }

    public /* synthetic */ int getCollapseIcon() {
        return ((Number) aEC()).intValue();
    }

    public /* synthetic */ int getExpandIcon() {
        return ((Number) aEB()).intValue();
    }

    public /* synthetic */ int getIcon() {
        return ((Number) aEA()).intValue();
    }

    public /* synthetic */ int getNameToDisplay() {
        return ((Number) aEz()).intValue();
    }

    public boolean isClickable() {
        return this.djq != StatusType.PENDING;
    }

    public Void aEz() {
        throw new IllegalStateException("Must not be used");
    }

    public Void aEA() {
        throw new IllegalStateException("Must not be used");
    }

    public Void aEB() {
        throw new IllegalStateException("Must not be used");
    }

    public Void aEC() {
        throw new IllegalStateException("Must not be used");
    }

    public String getId() {
        return name();
    }
}
