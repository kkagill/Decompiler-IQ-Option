package com.google.i18n.phonenumbers;

import com.google.i18n.phonenumbers.Phonemetadata.PhoneMetadata;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: MultiFileMetadataSourceImpl */
final class g implements f {
    private final String afu;
    private final d afv;
    private final ConcurrentHashMap<String, PhoneMetadata> afw;
    private final ConcurrentHashMap<Integer, PhoneMetadata> afx;

    g(String str, d dVar) {
        this.afw = new ConcurrentHashMap();
        this.afx = new ConcurrentHashMap();
        this.afu = str;
        this.afv = dVar;
    }

    g(d dVar) {
        this("/com/google/i18n/phonenumbers/data/PhoneNumberMetadataProto", dVar);
    }

    public PhoneMetadata cp(String str) {
        return e.a(str, this.afw, this.afu, this.afv);
    }

    public PhoneMetadata cA(int i) {
        if (cB(i)) {
            return e.a(Integer.valueOf(i), this.afx, this.afu, this.afv);
        }
        return null;
    }

    private boolean cB(int i) {
        List list = (List) c.xr().get(Integer.valueOf(i));
        if (list.size() != 1) {
            return false;
        }
        if ("001".equals(list.get(0))) {
            return true;
        }
        return false;
    }
}
