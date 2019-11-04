package com.iqoption.core.data.model;

import com.iqoption.core.ext.c;
import kotlin.NoWhenBranchMatchedException;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0001\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0007\u001a\u00020\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\f"}, bng = {"Lcom/iqoption/core/data/model/Sign;", "", "strValue", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getStrValue", "()Ljava/lang/String;", "invert", "PLUS", "MINUS", "NONE", "Companion", "core_release"})
/* compiled from: Sign.kt */
public enum Sign {
    PLUS("+"),
    MINUS("-"),
    NONE("");
    
    public static final a Companion = null;
    private final String strValue;

    @i(bne = {1, 1, 15}, bnf = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0010\u0007\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0007J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tH\u0007J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\nH\u0007J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\tH\u0007¨\u0006\u000b"}, bng = {"Lcom/iqoption/core/data/model/Sign$Companion;", "", "()V", "of", "Lcom/iqoption/core/data/model/Sign;", "number", "", "tolerance", "minorUnits", "", "", "core_release"})
    /* compiled from: Sign.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final Sign of(int i) {
            if (i > 0) {
                return Sign.PLUS;
            }
            if (i < 0) {
                return Sign.MINUS;
            }
            return Sign.NONE;
        }

        public final Sign of(float f) {
            if (f > 0.0f) {
                return Sign.PLUS;
            }
            if (f < 0.0f) {
                return Sign.MINUS;
            }
            return Sign.NONE;
        }

        public final Sign of(double d) {
            if (d > 0.0d) {
                return Sign.PLUS;
            }
            if (d < 0.0d) {
                return Sign.MINUS;
            }
            return Sign.NONE;
        }

        public final Sign of(double d, double d2) {
            int c = c.c(d, 0.0d, d2);
            if (c == -1) {
                return Sign.MINUS;
            }
            if (c != 1) {
                return Sign.NONE;
            }
            return Sign.PLUS;
        }

        public final Sign of(double d, int i) {
            int a = c.a(d, 0.0d, i);
            if (a == -1) {
                return Sign.MINUS;
            }
            if (a != 1) {
                return Sign.NONE;
            }
            return Sign.PLUS;
        }
    }

    public static final Sign of(double d) {
        return Companion.of(d);
    }

    public static final Sign of(double d, double d2) {
        return Companion.of(d, d2);
    }

    public static final Sign of(double d, int i) {
        return Companion.of(d, i);
    }

    public static final Sign of(float f) {
        return Companion.of(f);
    }

    public static final Sign of(int i) {
        return Companion.of(i);
    }

    private Sign(String str) {
        this.strValue = str;
    }

    public final String getStrValue() {
        return this.strValue;
    }

    static {
        Companion = new a();
    }

    public final Sign invert() {
        int i = d.aob[ordinal()];
        if (i == 1) {
            return MINUS;
        }
        if (i == 2) {
            return PLUS;
        }
        if (i == 3) {
            return NONE;
        }
        throw new NoWhenBranchMatchedException();
    }
}
