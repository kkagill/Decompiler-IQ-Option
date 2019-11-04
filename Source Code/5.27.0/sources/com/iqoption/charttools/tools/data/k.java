package com.iqoption.charttools.tools.data;

import com.iqoption.core.ui.widget.recyclerview.adapter.a.d;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\u000e\u001a\u00020\u0004HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J\u001d\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\u0006\u0010\u0017\u001a\u00020\u0000R\u0014\u0010\b\u001a\u00020\u0002X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u000bR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, bng = {"Lcom/iqoption/charttools/tools/data/SettingItem;", "Lcom/iqoption/core/ui/widget/recyclerview/adapter/diff/Identifiable;", "", "type", "Lcom/iqoption/charttools/tools/data/SettingType;", "isEnabled", "", "(Lcom/iqoption/charttools/tools/data/SettingType;Z)V", "id", "getId", "()Ljava/lang/Integer;", "()Z", "getType", "()Lcom/iqoption/charttools/tools/data/SettingType;", "component1", "component2", "copy", "equals", "other", "", "hashCode", "toString", "", "toggle", "app_optionXRelease"})
/* compiled from: SettingType.kt */
public final class k implements d<Integer> {
    private final SettingType aNb;
    private final int id = this.aNb.ordinal();
    private final boolean isEnabled;

    public static /* synthetic */ k a(k kVar, SettingType settingType, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            settingType = kVar.aNb;
        }
        if ((i & 2) != 0) {
            z = kVar.isEnabled;
        }
        return kVar.a(settingType, z);
    }

    public final k a(SettingType settingType, boolean z) {
        kotlin.jvm.internal.i.f(settingType, "type");
        return new k(settingType, z);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof k) {
                k kVar = (k) obj;
                if (kotlin.jvm.internal.i.y(this.aNb, kVar.aNb)) {
                    if ((this.isEnabled == kVar.isEnabled ? 1 : null) != null) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        SettingType settingType = this.aNb;
        int hashCode = (settingType != null ? settingType.hashCode() : 0) * 31;
        int i = this.isEnabled;
        if (i != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SettingItem(type=");
        stringBuilder.append(this.aNb);
        stringBuilder.append(", isEnabled=");
        stringBuilder.append(this.isEnabled);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public k(SettingType settingType, boolean z) {
        kotlin.jvm.internal.i.f(settingType, "type");
        this.aNb = settingType;
        this.isEnabled = z;
    }

    public final SettingType QA() {
        return this.aNb;
    }

    public final boolean isEnabled() {
        return this.isEnabled;
    }

    /* renamed from: JR */
    public Integer getId() {
        return Integer.valueOf(this.id);
    }

    public final k Qz() {
        return a(this, null, this.isEnabled ^ 1, 1, null);
    }
}
