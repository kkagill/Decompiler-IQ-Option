package com.noveogroup.android.log;

import com.noveogroup.android.log.Logger.Level;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.WeakHashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: LoggerManager */
public final class c {
    private static final b eBB = new e(Level.VERBOSE, "%logger", "%date %caller%n");
    private static final Logger eBC = new f("ROOT", eBB);
    private static final Pattern eBD = Pattern.compile("(.*?):(.*?)(:(.*))?");
    private static final Map<String, b> eBE = Collections.unmodifiableMap(bgs());
    private static final Map<String, Logger> eBF = new WeakHashMap();

    private c() {
        throw new UnsupportedOperationException();
    }

    private static void a(Properties properties) {
        String str = "android-logger.properties";
        InputStream inputStream = null;
        try {
            inputStream = c.class.getClassLoader().getResourceAsStream(str);
            if (inputStream != null) {
                properties.load(inputStream);
            } else {
                inputStream = ClassLoader.getSystemClassLoader().getResourceAsStream(str);
                if (inputStream != null) {
                    properties.load(inputStream);
                }
            }
            if (inputStream != null) {
                inputStream.close();
            }
        } catch (Throwable th) {
            if (inputStream != null) {
                inputStream.close();
            }
        }
    }

    private static b kN(String str) {
        Matcher matcher = eBD.matcher(str);
        if (matcher.matches()) {
            str = matcher.group(1);
            String group = matcher.group(2);
            String group2 = matcher.group(4);
            if (group.length() > 23) {
                String substring = group.substring(0, 23);
                eBC.w("Android doesn't support tags %d characters longer. Tag '%s' will be trimmed to '%s'", Integer.valueOf(23), group, substring);
                group = substring;
            }
            try {
                return new e(Level.valueOf(str), group, group2);
            } catch (IllegalArgumentException unused) {
                eBC.w("Cannot parse '%s' as logging level. Only %s are allowed", str, Arrays.toString(Level.values()));
                return null;
            }
        }
        eBC.w("Wrong format of logger configuration: '%s'", str);
        return null;
    }

    private static Map<String, b> bgs() {
        String str = "android-logger.properties";
        HashMap hashMap = new HashMap();
        Properties properties = new Properties();
        try {
            a(properties);
            if (properties.propertyNames().hasMoreElements()) {
                Enumeration propertyNames = properties.propertyNames();
                while (propertyNames.hasMoreElements()) {
                    String str2 = (String) propertyNames.nextElement();
                    b kN = kN(properties.getProperty(str2));
                    if (kN != null) {
                        if (str2.equals("root")) {
                            hashMap.put(null, kN);
                        } else if (str2.startsWith("logger.")) {
                            Object substring = str2.substring(7);
                            if (substring.equalsIgnoreCase("ROOT")) {
                                substring = null;
                            }
                            hashMap.put(substring, kN);
                        } else {
                            eBC.e("unknown key '%s' in '%s' file", str2, str);
                        }
                    }
                }
                if (!hashMap.containsKey(null)) {
                    hashMap.put(null, eBB);
                }
                return hashMap;
            }
            eBC.e("Logger configuration file is empty. Default configuration will be used", new Object[0]);
            hashMap.put(null, eBB);
            return hashMap;
        } catch (IOException e) {
            eBC.a(e, "Cannot configure logger from '%s'. Default configuration will be used", str);
            hashMap.put(null, eBB);
            return hashMap;
        }
    }

    private static b kO(String str) {
        Object obj = null;
        if (str != null) {
            for (String str2 : eBE.keySet()) {
                if (str2 != null && str.startsWith(str2)) {
                    if ((str2.length() >= str.length() || str.charAt(str2.length()) == '.' || str.charAt(str2.length()) == '$') && (r0 == null || r0.length() < str2.length())) {
                        String str3 = str2;
                    }
                }
            }
        }
        b bVar = (b) eBE.get(obj);
        return bVar != null ? bVar : eBB;
    }

    public static Logger kP(String str) {
        Logger logger;
        synchronized (eBF) {
            logger = (Logger) eBF.get(str);
        }
        if (logger == null) {
            logger = new f(str, kO(str));
            synchronized (eBF) {
                eBF.put(logger.getName(), logger);
            }
        }
        return logger;
    }
}
