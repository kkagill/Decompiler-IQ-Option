package com.microblink.secured;

/* compiled from: line */
public final class ae {
    private int eym = -1;
    private int eyn = -1;
    private int eyo = -1;

    public ae(String str) {
        if (str != null) {
            String[] split = str.split("\\.");
            if (split.length == 0) {
                StringBuilder stringBuilder = new StringBuilder("Invalid version string ");
                stringBuilder.append(str);
                throw new IllegalArgumentException(stringBuilder.toString());
            } else if (split.length > 0) {
                this.eym = Integer.parseInt(split[0]);
                if (split.length >= 2) {
                    this.eyn = Integer.parseInt(split[1]);
                    if (split.length >= 3) {
                        this.eyo = Integer.parseInt(split[2]);
                        return;
                    }
                    return;
                }
                return;
            } else {
                return;
            }
        }
        throw new NullPointerException("Cannot parse null version string!");
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.eym);
        if (this.eyn != -1) {
            stringBuilder.append('.');
            stringBuilder.append(this.eyn);
            if (this.eyo != -1) {
                stringBuilder.append('.');
                stringBuilder.append(this.eyo);
            }
        }
        return stringBuilder.toString();
    }

    public final boolean a(ae aeVar) {
        if (aeVar != null) {
            int i = this.eym;
            int i2 = aeVar.eym;
            if (i < i2) {
                return false;
            }
            if (i > i2) {
                return true;
            }
            i = this.eyn;
            if (i == -1) {
                return false;
            }
            int i3 = aeVar.eyn;
            if (i3 == -1) {
                return i != 0;
            } else {
                if (i < i3) {
                    return false;
                }
                if (i > i3) {
                    return true;
                }
                i = this.eyo;
                if (i == -1) {
                    return false;
                }
                int i4 = aeVar.eyo;
                return i4 == -1 ? i != 0 : i > i4;
            }
        } else {
            throw new NullPointerException("Cannot compare with null version!");
        }
    }

    public final boolean b(ae aeVar) {
        if (aeVar != null) {
            int i = this.eym;
            int i2 = aeVar.eym;
            if (i < i2) {
                return false;
            }
            if (i > i2) {
                return true;
            }
            i = this.eyn;
            int i3;
            if (i == -1) {
                i3 = aeVar.eyn;
                return i3 == -1 || i3 == 0;
            } else {
                int i4 = aeVar.eyn;
                if (i4 == -1) {
                    return true;
                }
                if (i < i4) {
                    return false;
                }
                if (i > i4) {
                    return true;
                }
                i = this.eyo;
                if (i == -1) {
                    i3 = aeVar.eyo;
                    return i3 == -1 || i3 == 0;
                } else {
                    i3 = aeVar.eyo;
                    return i3 == -1 || i >= i3;
                }
            }
        } else {
            throw new NullPointerException("Cannot compare with null version!");
        }
    }
}
