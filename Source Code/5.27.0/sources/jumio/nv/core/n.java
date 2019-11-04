package jumio.nv.core;

import android.content.Context;
import com.jumio.commons.log.Log;
import com.jumio.core.data.document.ScanSide;
import com.jumio.nv.data.country.Country;
import com.jumio.nv.data.document.NVDocumentType;
import com.jumio.nv.environment.NVEnvironment;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* compiled from: TemplateMatcherFileStorage */
public class n implements o {
    private final transient Context a;

    public n(Context context) {
        this.a = context;
    }

    public boolean a(Country country, NVDocumentType nVDocumentType, ScanSide scanSide) {
        try {
            return new File(a(), a(country.getIsoCode(), nVDocumentType, scanSide)).exists();
        } catch (Exception e) {
            Log.w("TemplateMatcher", e);
            return false;
        }
    }

    public List<String> b(Country country, NVDocumentType nVDocumentType, ScanSide scanSide) {
        ArrayList arrayList = new ArrayList();
        File file = new File(a(), a(country.getIsoCode(), nVDocumentType, scanSide));
        if (file.exists()) {
            arrayList.add(file.getAbsolutePath());
        }
        return arrayList;
    }

    public boolean a(String str) {
        try {
            return new File(a(), str).exists();
        } catch (Exception e) {
            Log.w("TemplateMatcher", "hasTemplate", e);
            return false;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0024  */
    public void a(java.lang.String r3, byte[] r4) {
        /*
        r2 = this;
        if (r4 == 0) goto L_0x0035;
    L_0x0002:
        if (r3 == 0) goto L_0x0028;
    L_0x0004:
        r0 = new java.io.File;
        r1 = r2.a();
        r0.<init>(r1, r3);
        r3 = 0;
        r1 = new java.io.FileOutputStream;	 Catch:{ all -> 0x001f }
        r1.<init>(r0);	 Catch:{ all -> 0x001f }
        r1.write(r4);	 Catch:{ all -> 0x001d }
        r1.flush();	 Catch:{ all -> 0x001d }
        com.jumio.commons.utils.IOUtils.closeQuietly(r1);
        return;
    L_0x001d:
        r3 = move-exception;
        goto L_0x0022;
    L_0x001f:
        r4 = move-exception;
        r1 = r3;
        r3 = r4;
    L_0x0022:
        if (r1 == 0) goto L_0x0027;
    L_0x0024:
        com.jumio.commons.utils.IOUtils.closeQuietly(r1);
    L_0x0027:
        throw r3;
    L_0x0028:
        r3 = new java.io.IOException;
        r4 = new java.lang.NullPointerException;
        r0 = "destination file path was null";
        r4.<init>(r0);
        r3.<init>(r4);
        throw r3;
    L_0x0035:
        r3 = new java.io.IOException;
        r4 = new java.lang.NullPointerException;
        r0 = "data array was null!";
        r4.<init>(r0);
        r3.<init>(r4);
        throw r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: jumio.nv.core.n.a(java.lang.String, byte[]):void");
    }

    private String a(String str, NVDocumentType nVDocumentType, ScanSide scanSide) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str.toUpperCase());
        str = "_";
        stringBuilder.append(str);
        stringBuilder.append(a(nVDocumentType).toLowerCase());
        stringBuilder.append(str);
        stringBuilder.append(scanSide.toString().toLowerCase());
        stringBuilder.append(".bin");
        return stringBuilder.toString();
    }

    private String a(NVDocumentType nVDocumentType) {
        if (nVDocumentType == NVDocumentType.DRIVER_LICENSE) {
            return "DL";
        }
        if (nVDocumentType == NVDocumentType.IDENTITY_CARD) {
            return "ID";
        }
        if (nVDocumentType == NVDocumentType.PASSPORT) {
            return "PP";
        }
        return nVDocumentType.toString();
    }

    private File a() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.a.getFilesDir());
        stringBuilder.append(File.separator);
        stringBuilder.append("tm_");
        stringBuilder.append(NVEnvironment.CLIENTLIB_VERSION);
        stringBuilder.append(File.separator);
        File file = new File(stringBuilder.toString());
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }
}
