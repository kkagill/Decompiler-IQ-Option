package org.apache.commons.lang3;

import java.io.PrintStream;

/* compiled from: SystemUtils */
public class d {
    public static final String fBV = nf("line.separator");
    public static final String fCA = nf("awt.toolkit");
    public static final String fCB = nf("file.encoding");
    public static final String fCC = nf("file.separator");
    public static final String fCD = nf("java.awt.fonts");
    public static final String fCE = nf("java.awt.graphicsenv");
    public static final String fCF = nf("java.awt.headless");
    public static final String fCG = nf("java.awt.printerjob");
    public static final String fCH = nf("java.class.path");
    public static final String fCI = nf("java.class.version");
    public static final String fCJ = nf("java.compiler");
    public static final String fCK = nf("java.endorsed.dirs");
    public static final String fCL = nf("java.ext.dirs");
    public static final String fCM = nf("java.home");
    public static final String fCN = nf("java.io.tmpdir");
    public static final String fCO = nf("java.library.path");
    public static final String fCP = nf("java.runtime.name");
    public static final String fCQ = nf("java.runtime.version");
    public static final String fCR = nf("java.specification.name");
    public static final String fCS = nf("java.specification.vendor");
    public static final String fCT = nf("java.specification.version");
    private static final JavaVersion fCU = JavaVersion.get(fCT);
    public static final String fCV = nf("java.util.prefs.PreferencesFactory");
    public static final String fCW = nf("java.vendor");
    public static final String fCX = nf("java.vendor.url");
    public static final String fCY = nf("java.version");
    public static final String fCZ = nf("java.vm.info");
    public static final boolean fDA;
    public static final boolean fDB = ne("Mac");
    public static final boolean fDC = ne("Mac OS X");
    public static final boolean fDD = ne("OS/2");
    public static final boolean fDE = ne("Solaris");
    public static final boolean fDF = ne("SunOS");
    public static final boolean fDG;
    public static final boolean fDH;
    public static final boolean fDI;
    public static final boolean fDJ;
    public static final boolean fDK;
    public static final boolean fDL;
    public static final boolean fDM = ne("Windows NT");
    public static final boolean fDN;
    public static final boolean fDO;
    public static final boolean fDP;
    public static final String fDa = nf("java.vm.name");
    public static final String fDb = nf("java.vm.specification.name");
    public static final String fDc = nf("java.vm.specification.vendor");
    public static final String fDd = nf("java.vm.specification.version");
    public static final String fDe = nf("java.vm.vendor");
    public static final String fDf = nf("java.vm.version");
    public static final String fDg = nf("os.arch");
    public static final String fDh = nf("os.name");
    public static final String fDi = nf("os.version");
    public static final String fDj = nf("path.separator");
    public static final String fDk;
    public static final String fDl = nf("user.dir");
    public static final String fDm = nf("user.home");
    public static final String fDn = nf("user.language");
    public static final String fDo = nf("user.name");
    public static final String fDp = nf("user.timezone");
    public static final boolean fDq = nd("1.1");
    public static final boolean fDr = nd("1.2");
    public static final boolean fDs = nd("1.3");
    public static final boolean fDt = nd("1.4");
    public static final boolean fDu = nd("1.5");
    public static final boolean fDv = nd("1.6");
    public static final boolean fDw = nd("1.7");
    public static final boolean fDx = ne("AIX");
    public static final boolean fDy = ne("HP-UX");
    public static final boolean fDz = ne("Irix");

    static {
        String str = "user.country";
        if (nf(str) == null) {
            str = "user.region";
        }
        fDk = nf(str);
        boolean z = false;
        boolean z2 = ne("Linux") || ne("LINUX");
        fDA = z2;
        if (fDx || fDy || fDz || fDA || fDC || fDE || fDF) {
            z = true;
        }
        fDG = z;
        str = "Windows";
        fDH = ne(str);
        fDI = bn(str, "5.0");
        String str2 = "Windows 9";
        fDJ = bn(str2, "4.0");
        fDK = bn(str2, "4.1");
        fDL = bn(str, "4.9");
        fDN = bn(str, "5.1");
        fDO = bn(str, "6.0");
        fDP = bn(str, "6.1");
    }

    private static boolean nd(String str) {
        return bo(fCT, str);
    }

    private static boolean bn(String str, String str2) {
        return l(fDh, fDi, str, str2);
    }

    private static boolean ne(String str) {
        return bp(fDh, str);
    }

    private static String nf(String str) {
        try {
            str = System.getProperty(str);
            return str;
        } catch (SecurityException unused) {
            PrintStream printStream = System.err;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Caught a SecurityException reading the system property '");
            stringBuilder.append(str);
            stringBuilder.append("'; the SystemUtils property value will default to null.");
            printStream.println(stringBuilder.toString());
            return null;
        }
    }

    static boolean bo(String str, String str2) {
        return str == null ? false : str.startsWith(str2);
    }

    static boolean l(String str, String str2, String str3, String str4) {
        return str != null && str2 != null && str.startsWith(str3) && str2.startsWith(str4);
    }

    static boolean bp(String str, String str2) {
        return str == null ? false : str.startsWith(str2);
    }
}
