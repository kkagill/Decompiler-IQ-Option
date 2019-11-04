package com.iqoption.withdraw;

import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, bng = {"Lcom/iqoption/withdraw/InfoPopupParams;", "", "text", "", "anchorX", "", "anchorY", "(Ljava/lang/CharSequence;II)V", "getAnchorX", "()I", "getAnchorY", "getText", "()Ljava/lang/CharSequence;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "withdraw_release"})
/* compiled from: WithdrawSelectionViewModel.kt */
public final class c {
    private final int anchorX;
    private final int anchorY;
    private final CharSequence text;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof c) {
                c cVar = (c) obj;
                if (kotlin.jvm.internal.i.y(this.text, cVar.text)) {
                    if ((this.anchorX == cVar.anchorX ? 1 : null) != null) {
                        if ((this.anchorY == cVar.anchorY ? 1 : null) != null) {
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
        CharSequence charSequence = this.text;
        return ((((charSequence != null ? charSequence.hashCode() : 0) * 31) + this.anchorX) * 31) + this.anchorY;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("InfoPopupParams(text=");
        stringBuilder.append(this.text);
        stringBuilder.append(", anchorX=");
        stringBuilder.append(this.anchorX);
        stringBuilder.append(", anchorY=");
        stringBuilder.append(this.anchorY);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public c(CharSequence charSequence, int i, int i2) {
        kotlin.jvm.internal.i.f(charSequence, "text");
        this.text = charSequence;
        this.anchorX = i;
        this.anchorY = i2;
    }

    public final int getAnchorX() {
        return this.anchorX;
    }

    public final int getAnchorY() {
        return this.anchorY;
    }

    public final CharSequence getText() {
        return this.text;
    }
}
