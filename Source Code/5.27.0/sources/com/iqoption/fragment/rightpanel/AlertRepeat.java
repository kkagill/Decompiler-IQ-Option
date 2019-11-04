package com.iqoption.fragment.rightpanel;

import com.iqoption.x.R;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0017\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007j\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, bng = {"Lcom/iqoption/fragment/rightpanel/AlertRepeat;", "", "labelResId", "", "activations", "(Ljava/lang/String;III)V", "getActivations", "()I", "getLabelResId", "ONCE", "ALWAYS", "app_optionXRelease"})
/* compiled from: AlertRepeat.kt */
public enum AlertRepeat {
    ONCE(R.string.once, 1),
    ALWAYS(R.string.always, 0);
    
    private final int activations;
    private final int labelResId;

    private AlertRepeat(int i, int i2) {
        this.labelResId = i;
        this.activations = i2;
    }

    public final int getLabelResId() {
        return this.labelResId;
    }

    public final int getActivations() {
        return this.activations;
    }
}
