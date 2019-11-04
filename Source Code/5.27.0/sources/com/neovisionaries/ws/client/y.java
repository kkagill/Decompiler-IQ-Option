package com.neovisionaries.ws.client;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import javax.net.SocketFactory;

/* compiled from: ProxySettings */
public class y {
    private final ai eAj;
    private final ac eAk = new ac();
    private String eAl;
    private String[] eAm;
    private boolean ezF;
    private String ezt;
    private int ezu;
    private final Map<String, List<String>> mHeaders = new TreeMap(String.CASE_INSENSITIVE_ORDER);
    private String mId;

    y(ai aiVar) {
        this.eAj = aiVar;
        bfg();
    }

    public y bfg() {
        this.ezF = false;
        this.ezt = null;
        this.ezu = -1;
        this.mId = null;
        this.eAl = null;
        this.mHeaders.clear();
        this.eAm = null;
        return this;
    }

    public boolean isSecure() {
        return this.ezF;
    }

    public String getHost() {
        return this.ezt;
    }

    public int getPort() {
        return this.ezu;
    }

    public String getId() {
        return this.mId;
    }

    public String getPassword() {
        return this.eAl;
    }

    public Map<String, List<String>> getHeaders() {
        return this.mHeaders;
    }

    /* Access modifiers changed, original: 0000 */
    public SocketFactory bfh() {
        return this.eAk.fM(this.ezF);
    }

    public String[] bfi() {
        return this.eAm;
    }
}
