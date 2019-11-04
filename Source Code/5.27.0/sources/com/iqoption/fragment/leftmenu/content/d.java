package com.iqoption.fragment.leftmenu.content;

import com.iqoption.deposit.verification.e;
import com.iqoption.x.R;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u000b\u001a\u00020\u0006H\u0016J\u0012\u0010\f\u001a\u0004\u0018\u00010\u00012\u0006\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u000eH\u0016J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0011H\u0016J\b\u0010\u0013\u001a\u00020\u0011H\u0016J\b\u0010\u0014\u001a\u00020\u0011H\u0016J\b\u0010\u0015\u001a\u00020\u000eH\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0017H\u0016J\b\u0010\u0019\u001a\u00020\u0017H\u0016J\b\u0010\u001a\u001a\u00020\u0017H\u0016J\b\u0010\u001b\u001a\u00020\u000eH\u0016J\b\u0010\u001c\u001a\u00020\u000eH\u0016J\b\u0010\u001d\u001a\u00020\u0006H\u0016R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00068VX\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0015\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u001e"}, bng = {"Lcom/iqoption/fragment/leftmenu/content/VerifyNotificationMenuItem;", "Lcom/iqoption/fragment/leftmenu/content/LeftMenuItem;", "verifyWarning", "Lcom/iqoption/deposit/verification/VerifyWarning;", "(Lcom/iqoption/deposit/verification/VerifyWarning;)V", "id", "", "getId", "()Ljava/lang/String;", "getVerifyWarning", "()Lcom/iqoption/deposit/verification/VerifyWarning;", "analyticsEventName", "getChild", "index", "", "getChildCount", "getCollapseIcon", "", "getExpandIcon", "getIcon", "getNameToDisplay", "getSize", "isClickable", "", "isEnabled", "isInProgress", "isVisible", "layoutResId", "menuPriority", "name", "app_optionXRelease"})
/* compiled from: VerifyNotificationMenuItem.kt */
public final class d implements a {
    private final e<?> djg;

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

    public boolean isClickable() {
        return false;
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
        return R.layout.left_menu_item_notification;
    }

    public int menuPriority() {
        return 1;
    }

    public String name() {
        return "verify-notification";
    }

    public d(e<?> eVar) {
        kotlin.jvm.internal.i.f(eVar, "verifyWarning");
        this.djg = eVar;
    }

    public final e<?> aEv() {
        return this.djg;
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