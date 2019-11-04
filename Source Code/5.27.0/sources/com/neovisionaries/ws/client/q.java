package com.neovisionaries.ws.client;

import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;

/* compiled from: OkHostnameVerifier */
final class q implements HostnameVerifier {
    private static final Pattern VERIFY_AS_IP_ADDRESS = Pattern.compile("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
    public static final q ezT = new q();

    private q() {
    }

    public boolean verify(String str, SSLSession sSLSession) {
        try {
            return verify(str, (X509Certificate) sSLSession.getPeerCertificates()[0]);
        } catch (SSLException unused) {
            return false;
        }
    }

    public boolean verify(String str, X509Certificate x509Certificate) {
        if (verifyAsIpAddress(str)) {
            return verifyIpAddress(str, x509Certificate);
        }
        return a(str, x509Certificate);
    }

    static boolean verifyAsIpAddress(String str) {
        return VERIFY_AS_IP_ADDRESS.matcher(str).matches();
    }

    private boolean verifyIpAddress(String str, X509Certificate x509Certificate) {
        List subjectAltNames = getSubjectAltNames(x509Certificate, 7);
        int size = subjectAltNames.size();
        for (int i = 0; i < size; i++) {
            if (str.equalsIgnoreCase((String) subjectAltNames.get(i))) {
                return true;
            }
        }
        return false;
    }

    private boolean a(String str, X509Certificate x509Certificate) {
        str = str.toLowerCase(Locale.US);
        List subjectAltNames = getSubjectAltNames(x509Certificate, 2);
        int size = subjectAltNames.size();
        int i = 0;
        Object obj = null;
        while (i < size) {
            if (aK(str, (String) subjectAltNames.get(i))) {
                return true;
            }
            i++;
            obj = 1;
        }
        if (obj == null) {
            String findMostSpecific = new h(x509Certificate.getSubjectX500Principal()).findMostSpecific("cn");
            if (findMostSpecific != null) {
                return aK(str, findMostSpecific);
            }
        }
        return false;
    }

    private static List<String> getSubjectAltNames(X509Certificate x509Certificate, int i) {
        ArrayList arrayList = new ArrayList();
        try {
            Collection<List> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return Collections.emptyList();
            }
            for (List list : subjectAlternativeNames) {
                if (list != null) {
                    if (list.size() >= 2) {
                        Integer num = (Integer) list.get(0);
                        if (num != null) {
                            if (num.intValue() == i) {
                                String str = (String) list.get(1);
                                if (str != null) {
                                    arrayList.add(str);
                                }
                            }
                        }
                    }
                }
            }
            return arrayList;
        } catch (CertificateParsingException unused) {
            return Collections.emptyList();
        }
    }

    private boolean aK(String str, String str2) {
        if (!(str == null || str.length() == 0)) {
            String str3 = ".";
            if (!str.startsWith(str3)) {
                String str4 = "..";
                if (!(str.endsWith(str4) || str2 == null || str2.length() == 0 || str2.startsWith(str3) || str2.endsWith(str4))) {
                    if (!str.endsWith(str3)) {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append(str);
                        stringBuilder.append('.');
                        str = stringBuilder.toString();
                    }
                    if (!str2.endsWith(str3)) {
                        StringBuilder stringBuilder2 = new StringBuilder();
                        stringBuilder2.append(str2);
                        stringBuilder2.append('.');
                        str2 = stringBuilder2.toString();
                    }
                    str2 = str2.toLowerCase(Locale.US);
                    if (!str2.contains("*")) {
                        return str.equals(str2);
                    }
                    str3 = "*.";
                    if (!str2.startsWith(str3) || str2.indexOf(42, 1) != -1 || str.length() < str2.length() || str3.equals(str2)) {
                        return false;
                    }
                    str2 = str2.substring(1);
                    if (!str.endsWith(str2)) {
                        return false;
                    }
                    int length = str.length() - str2.length();
                    if (length <= 0 || str.lastIndexOf(46, length - 1) == -1) {
                        return true;
                    }
                    return false;
                }
            }
        }
        return false;
    }
}
