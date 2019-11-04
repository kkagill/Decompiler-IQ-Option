package com.google.android.gms.common.internal;

import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.util.VisibleForTesting;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;

@KeepForSdk
public class LibraryVersion {
    private static final GmsLogger zzel = new GmsLogger("LibraryVersion", "");
    private static LibraryVersion zzem = new LibraryVersion();
    private ConcurrentHashMap<String, String> zzen = new ConcurrentHashMap();

    @KeepForSdk
    public static LibraryVersion getInstance() {
        return zzem;
    }

    @VisibleForTesting
    protected LibraryVersion() {
    }

    @KeepForSdk
    public String getVersion(@NonNull String str) {
        String str2 = "Failed to get app version for libraryName: ";
        String str3 = "LibraryVersion";
        Preconditions.checkNotEmpty(str, "Please provide a valid libraryName");
        if (this.zzen.containsKey(str)) {
            return (String) this.zzen.get(str);
        }
        Properties properties = new Properties();
        Object obj = null;
        try {
            InputStream resourceAsStream = LibraryVersion.class.getResourceAsStream(String.format("/%s.properties", new Object[]{str}));
            GmsLogger gmsLogger;
            if (resourceAsStream != null) {
                properties.load(resourceAsStream);
                obj = properties.getProperty("version", null);
                gmsLogger = zzel;
                StringBuilder stringBuilder = new StringBuilder((String.valueOf(str).length() + 12) + String.valueOf(obj).length());
                stringBuilder.append(str);
                stringBuilder.append(" version is ");
                stringBuilder.append(obj);
                gmsLogger.v(str3, stringBuilder.toString());
            } else {
                gmsLogger = zzel;
                String valueOf = String.valueOf(str);
                gmsLogger.e(str3, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
            }
        } catch (IOException e) {
            GmsLogger gmsLogger2 = zzel;
            String valueOf2 = String.valueOf(str);
            gmsLogger2.e(str3, valueOf2.length() != 0 ? str2.concat(valueOf2) : new String(str2), e);
        }
        if (obj == null) {
            zzel.d(str3, ".properties file is dropped during release process. Failure to read app version isexpected druing Google internal testing where locally-built libraries are used");
            obj = "UNKNOWN";
        }
        this.zzen.put(str, obj);
        return obj;
    }
}
