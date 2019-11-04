package com.iqoption.fragment.leftpanel;

import com.google.gson.annotations.SerializedName;
import com.iqoption.core.ui.widget.recyclerview.adapter.a.d;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0006HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0014\u0010\t\u001a\u00020\u00028VX\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\fR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\fR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, bng = {"Lcom/iqoption/fragment/leftpanel/LeftPanelItem;", "Lcom/iqoption/core/ui/widget/recyclerview/adapter/diff/Identifiable;", "", "section", "Lcom/iqoption/fragment/leftpanel/LeftPanelSection;", "isVisible", "", "isSelected", "(Lcom/iqoption/fragment/leftpanel/LeftPanelSection;ZZ)V", "id", "getId", "()Ljava/lang/Integer;", "()Z", "getSection", "()Lcom/iqoption/fragment/leftpanel/LeftPanelSection;", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "toString", "", "app_optionXRelease"})
/* compiled from: LeftPanelSection.kt */
public final class f implements d<Integer> {
    @SerializedName("section")
    private final LeftPanelSection dka;
    private final transient boolean isSelected;
    @SerializedName("visible")
    private final boolean isVisible;

    public static /* synthetic */ f a(f fVar, LeftPanelSection leftPanelSection, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            leftPanelSection = fVar.dka;
        }
        if ((i & 2) != 0) {
            z = fVar.isVisible;
        }
        if ((i & 4) != 0) {
            z2 = fVar.isSelected;
        }
        return fVar.a(leftPanelSection, z, z2);
    }

    public final f a(LeftPanelSection leftPanelSection, boolean z, boolean z2) {
        kotlin.jvm.internal.i.f(leftPanelSection, "section");
        return new f(leftPanelSection, z, z2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof f) {
                f fVar = (f) obj;
                if (kotlin.jvm.internal.i.y(this.dka, fVar.dka)) {
                    if ((this.isVisible == fVar.isVisible ? 1 : null) != null) {
                        if ((this.isSelected == fVar.isSelected ? 1 : null) != null) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        LeftPanelSection leftPanelSection = this.dka;
        int hashCode = (leftPanelSection != null ? leftPanelSection.hashCode() : 0) * 31;
        int i = this.isVisible;
        if (i != 0) {
            i = 1;
        }
        hashCode = (hashCode + i) * 31;
        i = this.isSelected;
        if (i != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("LeftPanelItem(section=");
        stringBuilder.append(this.dka);
        stringBuilder.append(", isVisible=");
        stringBuilder.append(this.isVisible);
        stringBuilder.append(", isSelected=");
        stringBuilder.append(this.isSelected);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public f(LeftPanelSection leftPanelSection, boolean z, boolean z2) {
        kotlin.jvm.internal.i.f(leftPanelSection, "section");
        this.dka = leftPanelSection;
        this.isVisible = z;
        this.isSelected = z2;
    }

    public final LeftPanelSection aEJ() {
        return this.dka;
    }

    public final boolean isVisible() {
        return this.isVisible;
    }

    public /* synthetic */ f(LeftPanelSection leftPanelSection, boolean z, boolean z2, int i, f fVar) {
        if ((i & 2) != 0) {
            z = true;
        }
        if ((i & 4) != 0) {
            z2 = false;
        }
        this(leftPanelSection, z, z2);
    }

    public final boolean isSelected() {
        return this.isSelected;
    }

    /* renamed from: JR */
    public Integer getId() {
        return Integer.valueOf(this.dka.ordinal());
    }
}
