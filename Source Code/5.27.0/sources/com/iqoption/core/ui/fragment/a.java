package com.iqoption.core.ui.fragment;

import android.content.Intent;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0006HÆ\u0003J)\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0017"}, bng = {"Lcom/iqoption/core/ui/fragment/ActivityResult;", "", "requestCode", "", "resultCode", "data", "Landroid/content/Intent;", "(IILandroid/content/Intent;)V", "getData", "()Landroid/content/Intent;", "getRequestCode", "()I", "getResultCode", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "core_release"})
/* compiled from: FragmentActivityResult.kt */
public final class a {
    private final int bIE;
    private final int bIF;
    private final Intent bIG;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if ((this.bIE == aVar.bIE ? 1 : null) != null) {
                    if ((this.bIF == aVar.bIF ? 1 : null) == null || !kotlin.jvm.internal.i.y(this.bIG, aVar.bIG)) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i = ((this.bIE * 31) + this.bIF) * 31;
        Intent intent = this.bIG;
        return i + (intent != null ? intent.hashCode() : 0);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ActivityResult(requestCode=");
        stringBuilder.append(this.bIE);
        stringBuilder.append(", resultCode=");
        stringBuilder.append(this.bIF);
        stringBuilder.append(", data=");
        stringBuilder.append(this.bIG);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public a(int i, int i2, Intent intent) {
        this.bIE = i;
        this.bIF = i2;
        this.bIG = intent;
    }

    public final int alr() {
        return this.bIE;
    }

    public final Intent als() {
        return this.bIG;
    }

    public final int getResultCode() {
        return this.bIF;
    }
}
