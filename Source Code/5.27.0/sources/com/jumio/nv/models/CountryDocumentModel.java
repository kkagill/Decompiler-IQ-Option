package com.jumio.nv.models;

import android.content.Context;
import android.content.res.Configuration;
import androidx.annotation.NonNull;
import com.jumio.core.mvp.model.StaticModel;
import com.jumio.nv.R;
import com.jumio.nv.data.country.Country;
import com.jumio.nv.data.document.DocumentType;
import com.jumio.nv.data.document.NVDocumentType;
import com.jumio.nv.data.document.NVDocumentVariant;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import jumio.nv.core.l;
import jumio.nv.core.m;

public class CountryDocumentModel implements StaticModel {
    private l a;

    public CountryDocumentModel() {
        this.a = new m();
    }

    public CountryDocumentModel(l lVar) {
        this.a = lVar;
    }

    public void add(Country country, DocumentType... documentTypeArr) {
        this.a.a(country, documentTypeArr);
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x000f A:{SYNTHETIC} */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x008e  */
    /* JADX WARNING: Missing block: B:6:0x002a, code skipped:
            if (r2.getParts() == 0) goto L_0x007a;
     */
    public java.util.List<com.jumio.nv.data.document.DocumentType> getDocumentTypesFor(com.jumio.nv.data.country.Country r8, boolean r9, boolean r10, java.util.List<com.jumio.nv.data.document.NVDocumentType> r11, @androidx.annotation.Nullable com.jumio.nv.data.document.NVDocumentVariant r12) {
        /*
        r7 = this;
        r0 = new java.util.LinkedList;
        r0.<init>();
        r1 = r7.a;
        r1 = r1.a(r8);
        r1 = r1.iterator();
    L_0x000f:
        r2 = r1.hasNext();
        if (r2 == 0) goto L_0x0093;
    L_0x0015:
        r2 = r1.next();
        r2 = (com.jumio.nv.data.document.DocumentType) r2;
        r3 = r2.getId();
        r3 = r11.contains(r3);
        r4 = 0;
        if (r9 == 0) goto L_0x002d;
    L_0x0026:
        r5 = r2.getParts();
        if (r5 != 0) goto L_0x007b;
    L_0x002c:
        goto L_0x007a;
    L_0x002d:
        r5 = r2.hasExtractionMethod();
        if (r5 == 0) goto L_0x007a;
    L_0x0033:
        r5 = new com.jumio.nv.data.document.DocumentType;
        r5.<init>(r2);
        r2 = r8.getIsoCode();
        r6 = "DEU";
        r2 = r6.equals(r2);
        if (r2 == 0) goto L_0x0066;
    L_0x0044:
        r2 = r5.getId();
        r6 = com.jumio.nv.data.document.NVDocumentType.IDENTITY_CARD;
        if (r2 != r6) goto L_0x0066;
    L_0x004c:
        if (r10 == 0) goto L_0x005c;
    L_0x004e:
        r2 = com.jumio.core.data.document.DocumentScanMode.TD1;
        r5.setDocumentScanMode(r2);
        r2 = com.jumio.core.plugins.PluginRegistry.PluginMode.MRZ;
        r2 = com.jumio.core.plugins.PluginRegistry.hasPlugin(r2);
        if (r2 != 0) goto L_0x005c;
    L_0x005b:
        r3 = 0;
    L_0x005c:
        r2 = com.jumio.core.plugins.PluginRegistry.PluginMode.MRZ;
        r2 = com.jumio.core.plugins.PluginRegistry.hasPlugin(r2);
        r5.setPaperVariant(r2);
        goto L_0x0069;
    L_0x0066:
        r5.setPaperVariant(r4);
    L_0x0069:
        if (r10 == 0) goto L_0x0078;
    L_0x006b:
        r2 = r5.getDocumentScanMode();
        r6 = com.jumio.core.data.document.DocumentScanMode.CSSN;
        if (r2 != r6) goto L_0x0075;
    L_0x0073:
        r2 = r5;
        goto L_0x007a;
    L_0x0075:
        r5.setFallbackScan(r4);
    L_0x0078:
        r2 = r5;
        goto L_0x007b;
    L_0x007a:
        r3 = 0;
    L_0x007b:
        if (r12 == 0) goto L_0x008c;
    L_0x007d:
        r5 = com.jumio.nv.data.document.NVDocumentVariant.PAPER;
        r5 = r12.equals(r5);
        if (r5 == 0) goto L_0x008c;
    L_0x0085:
        r5 = r2.hasPaperVariant();
        if (r5 != 0) goto L_0x008c;
    L_0x008b:
        r3 = 0;
    L_0x008c:
        if (r3 == 0) goto L_0x000f;
    L_0x008e:
        r0.add(r2);
        goto L_0x000f;
    L_0x0093:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.jumio.nv.models.CountryDocumentModel.getDocumentTypesFor(com.jumio.nv.data.country.Country, boolean, boolean, java.util.List, com.jumio.nv.data.document.NVDocumentVariant):java.util.List");
    }

    public DocumentType getDocumentTypeFor(@NonNull String str, @NonNull NVDocumentType nVDocumentType) {
        Country countryForIso3 = getCountryForIso3(str);
        if (countryForIso3 == null) {
            return null;
        }
        for (DocumentType documentType : this.a.a(countryForIso3)) {
            if (nVDocumentType.equals(documentType.getId())) {
                return documentType;
            }
        }
        return null;
    }

    public List<Country> getCountriesFor(boolean z, boolean z2, List<NVDocumentType> list, NVDocumentVariant nVDocumentVariant) {
        LinkedList linkedList = new LinkedList();
        List<Country> a = this.a.a((NVDocumentType[]) list.toArray(new NVDocumentType[list.size()]));
        if (a != null) {
            for (Country country : a) {
                if (getDocumentTypesFor(country, z, z2, list, nVDocumentVariant).size() > 0) {
                    linkedList.add(country);
                }
            }
        }
        return linkedList;
    }

    public static boolean isDeviceLanguageLocalizable(Context context) {
        Configuration configuration = new Configuration(context.getResources().getConfiguration());
        String string = context.getResources().getString(R.string.netverify_scanview_title);
        configuration.setLocale(Locale.ENGLISH);
        return context.createConfigurationContext(configuration).getResources().getString(R.string.netverify_scanview_title).equalsIgnoreCase(string) ^ 1;
    }

    public Country getCountryForIso3(String str) {
        return this.a.a(str);
    }

    public Country getCountryForIso2(String str) {
        return this.a.b(str);
    }

    public boolean contains(Country country) {
        return this.a.b(country);
    }

    public boolean isEmpty() {
        return this.a.a();
    }

    public List<Country> getCountries() {
        return this.a.b();
    }
}
