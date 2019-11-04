package com.neovisionaries.ws.client;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;

/* compiled from: SNIHelper */
class aa {
    private static Constructor<?> eAy;
    private static Method eAz;

    static {
        try {
            initialize();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void initialize() {
        eAy = p.b("javax.net.ssl.SNIHostName", new Class[]{String.class});
        eAz = p.b("javax.net.ssl.SSLParameters", "setServerNames", new Class[]{List.class});
    }

    private static Object kB(String str) {
        return p.a(eAy, str);
    }

    private static List<Object> e(String[] strArr) {
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String kB : strArr) {
            arrayList.add(kB(kB));
        }
        return arrayList;
    }

    private static void a(SSLParameters sSLParameters, String[] strArr) {
        p.a(eAz, (Object) sSLParameters, e(strArr));
    }

    static void a(Socket socket, String[] strArr) {
        if ((socket instanceof SSLSocket) && strArr != null) {
            SSLParameters sSLParameters = ((SSLSocket) socket).getSSLParameters();
            if (sSLParameters != null) {
                a(sSLParameters, strArr);
            }
        }
    }
}
