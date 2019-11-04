package org.slf4j;

import java.io.IOException;
import java.net.URL;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import org.slf4j.helpers.a;
import org.slf4j.helpers.d;
import org.slf4j.impl.b;

/* compiled from: LoggerFactory */
public final class c {
    static int fFF;
    static org.slf4j.helpers.c fFG = new org.slf4j.helpers.c();
    static a fFH = new a();
    static boolean fFI = Boolean.getBoolean("slf4j.detectLoggerNameMismatch");
    private static final String[] fFJ = new String[]{"1.6", "1.7"};
    private static String fFK = "org/slf4j/impl/StaticLoggerBinder.class";

    private c() {
    }

    private static final void bSw() {
        bSx();
        if (fFF == 3) {
            bSz();
        }
    }

    private static boolean nF(String str) {
        if (str == null) {
            return false;
        }
        return (str.indexOf("org/slf4j/impl/StaticLoggerBinder") == -1 && str.indexOf("org.slf4j.impl.StaticLoggerBinder") == -1) ? false : true;
    }

    private static final void bSx() {
        try {
            Set bSA = bSA();
            t(bSA);
            b.bSF();
            fFF = 3;
            u(bSA);
            bSy();
        } catch (NoClassDefFoundError e) {
            if (nF(e.getMessage())) {
                fFF = 4;
                d.nG("Failed to load class \"org.slf4j.impl.StaticLoggerBinder\".");
                d.nG("Defaulting to no-operation (NOP) logger implementation");
                d.nG("See http://www.slf4j.org/codes.html#StaticLoggerBinder for further details.");
                return;
            }
            as(e);
            throw e;
        } catch (NoSuchMethodError e2) {
            String message = e2.getMessage();
            if (!(message == null || message.indexOf("org.slf4j.impl.StaticLoggerBinder.getSingleton()") == -1)) {
                fFF = 2;
                d.nG("slf4j-api 1.6.x (or later) is incompatible with this binding.");
                d.nG("Your binding is version 1.5.5 or earlier.");
                d.nG("Upgrade your binding to version 1.6.x.");
            }
            throw e2;
        } catch (Exception e3) {
            as(e3);
            throw new IllegalStateException("Unexpected initialization failure", e3);
        }
    }

    static void as(Throwable th) {
        fFF = 2;
        d.h("Failed to instantiate SLF4J LoggerFactory", th);
    }

    private static final void bSy() {
        List<org.slf4j.helpers.b> bSD = fFG.bSD();
        if (!bSD.isEmpty()) {
            d.nG("The following set of substitute loggers may have been accessed");
            d.nG("during the initialization phase. Logging calls during this");
            d.nG("phase were not honored. However, subsequent logging calls to these");
            d.nG("loggers will work as normally expected.");
            d.nG("See also http://www.slf4j.org/codes.html#substituteLogger");
            for (org.slf4j.helpers.b bVar : bSD) {
                bVar.a(nE(bVar.getName()));
                d.nG(bVar.getName());
            }
            fFG.clear();
        }
    }

    private static final void bSz() {
        try {
            String str = b.REQUESTED_API_VERSION;
            Object obj = null;
            for (String startsWith : fFJ) {
                if (str.startsWith(startsWith)) {
                    obj = 1;
                }
            }
            if (obj == null) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("The requested version ");
                stringBuilder.append(str);
                stringBuilder.append(" by your slf4j binding is not compatible with ");
                stringBuilder.append(Arrays.asList(fFJ).toString());
                d.nG(stringBuilder.toString());
                d.nG("See http://www.slf4j.org/codes.html#version_mismatch for further details.");
            }
        } catch (NoSuchFieldError unused) {
        } catch (Throwable th) {
            d.h("Unexpected problem occured during version sanity check", th);
        }
    }

    private static Set<URL> bSA() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        try {
            Enumeration systemResources;
            ClassLoader classLoader = c.class.getClassLoader();
            if (classLoader == null) {
                systemResources = ClassLoader.getSystemResources(fFK);
            } else {
                systemResources = classLoader.getResources(fFK);
            }
            while (systemResources.hasMoreElements()) {
                linkedHashSet.add((URL) systemResources.nextElement());
            }
        } catch (IOException e) {
            d.h("Error getting resources from path", e);
        }
        return linkedHashSet;
    }

    private static boolean s(Set<URL> set) {
        return set.size() > 1;
    }

    private static void t(Set<URL> set) {
        if (s(set)) {
            d.nG("Class path contains multiple SLF4J bindings.");
            for (URL url : set) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Found binding in [");
                stringBuilder.append(url);
                stringBuilder.append("]");
                d.nG(stringBuilder.toString());
            }
            d.nG("See http://www.slf4j.org/codes.html#multiple_bindings for an explanation.");
        }
    }

    private static void u(Set<URL> set) {
        if (s(set)) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Actual binding is of type [");
            stringBuilder.append(b.bSF().bSH());
            stringBuilder.append("]");
            d.nG(stringBuilder.toString());
        }
    }

    public static b nE(String str) {
        return bSB().nE(str);
    }

    public static b ac(Class<?> cls) {
        b nE = nE(cls.getName());
        if (fFI) {
            if (a(cls, d.bSE())) {
                d.nG(String.format("Detected logger name mismatch. Given name: \"%s\"; computed name: \"%s\".", new Object[]{nE.getName(), d.bSE().getName()}));
                d.nG("See http://www.slf4j.org/codes.html#loggerNameMismatch for an explanation");
            }
        }
        return nE;
    }

    private static boolean a(Class<?> cls, Class<?> cls2) {
        return cls2.isAssignableFrom(cls) ^ 1;
    }

    public static a bSB() {
        if (fFF == 0) {
            fFF = 1;
            bSw();
        }
        int i = fFF;
        if (i == 1) {
            return fFG;
        }
        if (i == 2) {
            throw new IllegalStateException("org.slf4j.LoggerFactory could not be successfully initialized. See also http://www.slf4j.org/codes.html#unsuccessfulInit");
        } else if (i == 3) {
            return b.bSF().bSG();
        } else {
            if (i == 4) {
                return fFH;
            }
            throw new IllegalStateException("Unreachable code");
        }
    }
}
