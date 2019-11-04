package com.iqoption.instruments.strikes;

import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u000b"}, bng = {"Lcom/iqoption/instruments/strikes/StrikeSelectionMode;", "", "text", "", "(Ljava/lang/String;II)V", "getText", "()I", "MANUALLY", "CLOSEST", "SPOT", "Companion", "instruments_release"})
/* compiled from: StrikeSelectionMode.kt */
public enum StrikeSelectionMode {
    MANUALLY(com.iqoption.instruments.b.a.strike_selection_manually),
    CLOSEST(com.iqoption.instruments.b.a.strike_selection_closest),
    SPOT(com.iqoption.instruments.b.a.strike_selection_spot);
    
    public static final a Companion = null;
    private final int text;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, bng = {"Lcom/iqoption/instruments/strikes/StrikeSelectionMode$Companion;", "", "()V", "default", "Lcom/iqoption/instruments/strikes/StrikeSelectionMode;", "instrumentType", "Lcom/iqoption/core/data/model/InstrumentType;", "instruments_release"})
    /* compiled from: StrikeSelectionMode.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }
    }

    private StrikeSelectionMode(int i) {
        this.text = i;
    }

    public final int getText() {
        return this.text;
    }

    static {
        Companion = new a();
    }
}
