package com.iqoption.util;

import com.google.common.base.Suppliers;
import com.google.common.base.n;
import com.google.gson.Gson;
import com.google.gson.JsonParser;

/* compiled from: Gsons */
public final class w {
    private static final n<Gson> ebu = Suppliers.a(-$$Lambda$DFdDsKuZX237jdquKiKopsiiyWs.INSTANCE);
    private static final n<JsonParser> ebv = Suppliers.a(-$$Lambda$ShwhzFfzZWx00YFnXhftjR4fzGM.INSTANCE);
    private static final n<Gson> ebw = Suppliers.a(-$$Lambda$w$m60iSVfnrPOp9wm_sPi7rHTmJ-s.INSTANCE);

    public static Gson aWL() {
        return (Gson) ebw.get();
    }

    public static Gson aWM() {
        return (Gson) ebu.get();
    }

    public static JsonParser aWN() {
        return (JsonParser) ebv.get();
    }
}
