package org.threeten.bp.format;

public enum SignStyle {
    NORMAL,
    ALWAYS,
    NEVER,
    NOT_NEGATIVE,
    EXCEEDS_PAD;

    /* Access modifiers changed, original: 0000 */
    public boolean parse(boolean z, boolean z2, boolean z3) {
        int ordinal = ordinal();
        boolean z4 = false;
        if (ordinal == 0) {
            if (!(z && z2)) {
                z4 = true;
            }
            return z4;
        } else if (ordinal == 1 || ordinal == 4) {
            return true;
        } else {
            if (!(z2 || z3)) {
                z4 = true;
            }
            return z4;
        }
    }
}
