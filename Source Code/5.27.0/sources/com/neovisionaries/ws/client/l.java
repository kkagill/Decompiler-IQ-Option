package com.neovisionaries.ws.client;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* compiled from: HandshakeBuilder */
class l {
    private static final String[] ezC;
    private static final String[] ezD;
    private static final String[] ezE = new String[]{"Sec-WebSocket-Version", "13"};
    private boolean ezF;
    private String ezG;
    private final String ezH;
    private final URI ezI;
    private Set<String> ezJ;
    private List<ah> ezK;
    private List<String[]> ezL;
    private final String ezt;
    private String mKey;

    static {
        String str = "Upgrade";
        ezC = new String[]{"Connection", str};
        ezD = new String[]{str, "websocket"};
    }

    public l(boolean z, String str, String str2, String str3) {
        this.ezF = z;
        this.ezG = str;
        this.ezt = str2;
        this.ezH = str3;
        Object[] objArr = new Object[3];
        objArr[0] = z ? "wss" : "ws";
        objArr[1] = str2;
        objArr[2] = str3;
        this.ezI = URI.create(String.format("%s://%s%s", objArr));
    }

    public boolean kt(String str) {
        synchronized (this) {
            if (this.ezJ == null) {
                return false;
            }
            boolean contains = this.ezJ.contains(str);
            return contains;
        }
    }

    public void a(ah ahVar) {
        if (ahVar != null) {
            synchronized (this) {
                if (this.ezK == null) {
                    this.ezK = new ArrayList();
                }
                this.ezK.add(ahVar);
            }
        }
    }

    public void ku(String str) {
        a(ah.kG(str));
    }

    public boolean kv(String str) {
        if (str == null) {
            return false;
        }
        synchronized (this) {
            if (this.ezK == null) {
                return false;
            }
            for (ah name : this.ezK) {
                if (name.getName().equals(str)) {
                    return true;
                }
            }
            return false;
        }
    }

    public void addHeader(String str, String str2) {
        if (str != null && str.length() != 0) {
            if (str2 == null) {
                str2 = "";
            }
            synchronized (this) {
                if (this.ezL == null) {
                    this.ezL = new ArrayList();
                }
                this.ezL.add(new String[]{str, str2});
            }
        }
    }

    public void setKey(String str) {
        this.mKey = str;
    }

    public String beV() {
        return String.format("GET %s HTTP/1.1", new Object[]{this.ezH});
    }

    public List<String[]> beW() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new String[]{"Host", this.ezt});
        arrayList.add(ezC);
        arrayList.add(ezD);
        arrayList.add(ezE);
        arrayList.add(new String[]{"Sec-WebSocket-Key", this.mKey});
        Set set = this.ezJ;
        String str = ", ";
        if (!(set == null || set.size() == 0)) {
            arrayList.add(new String[]{"Sec-WebSocket-Protocol", p.d(this.ezJ, str)});
        }
        List list = this.ezK;
        if (!(list == null || list.size() == 0)) {
            arrayList.add(new String[]{"Sec-WebSocket-Extensions", p.d(this.ezK, str)});
        }
        String str2 = this.ezG;
        if (!(str2 == null || str2.length() == 0)) {
            String[] strArr = new String[2];
            strArr[0] = "Authorization";
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Basic ");
            stringBuilder.append(b.encode(this.ezG));
            strArr[1] = stringBuilder.toString();
            arrayList.add(strArr);
        }
        List list2 = this.ezL;
        if (!(list2 == null || list2.size() == 0)) {
            arrayList.addAll(this.ezL);
        }
        return arrayList;
    }

    public static String e(String str, List<String[]> list) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        str = "\r\n";
        stringBuilder.append(str);
        for (String[] strArr : list) {
            stringBuilder.append(strArr[0]);
            stringBuilder.append(": ");
            stringBuilder.append(strArr[1]);
            stringBuilder.append(str);
        }
        stringBuilder.append(str);
        return stringBuilder.toString();
    }
}
