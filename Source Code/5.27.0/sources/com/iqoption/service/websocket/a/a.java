package com.iqoption.service.websocket.a;

import com.google.common.util.concurrent.aa;
import com.google.gson.JsonObject;
import com.iqoption.mobbtech.connect.request.a.a.b;
import java.util.Map;

/* compiled from: IQBusRequestHandler */
public abstract class a extends b {
    protected final Map<String, Object> auM;
    protected String auN = null;
    protected final String bgx;
    protected final JsonObject dIx;
    private final String dSw;
    public String version = "1.0";

    a(String str, String str2, Map<String, Object> map, long j) {
        super(j);
        this.dSw = str;
        this.bgx = str2;
        this.auM = map;
        this.dIx = null;
    }

    a(String str, b bVar, aa aaVar, String str2, Map<String, Object> map, long j) {
        super(bVar, aaVar, j);
        this.dSw = str;
        this.bgx = str2;
        this.auM = map;
        this.dIx = null;
    }

    a(String str, b bVar, aa aaVar, String str2, JsonObject jsonObject, long j) {
        super(bVar, aaVar, j);
        this.dSw = str;
        this.bgx = str2;
        this.auM = null;
        this.dIx = jsonObject;
    }

    public String aTF() {
        return this.dSw;
    }

    public String aTG() {
        return this.bgx;
    }

    public a jL(String str) {
        this.version = str;
        return this;
    }

    public a jM(String str) {
        this.auN = str;
        return this;
    }
}
