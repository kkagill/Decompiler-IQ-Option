package com.google.android.gms.internal.gtm;

import android.content.res.Resources.NotFoundException;
import android.content.res.XmlResourceParser;
import android.text.TextUtils;
import com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty;
import java.io.IOException;
import java.util.Locale;
import org.xmlpull.v1.XmlPullParserException;

class zzbo<T extends zzbn> extends zzam {
    private zzbp<T> zzyn;

    public zzbo(zzap zzap, zzbp<T> zzbp) {
        super(zzap);
        this.zzyn = zzbp;
    }

    public final T zzq(int i) {
        try {
            return zza(zzcm().zzdc().getResources().getXml(i));
        } catch (NotFoundException e) {
            zzd("inflate() called with unknown resourceId", e);
            return null;
        }
    }

    private final T zza(XmlResourceParser xmlResourceParser) {
        try {
            xmlResourceParser.next();
            int eventType = xmlResourceParser.getEventType();
            while (eventType != 1) {
                if (xmlResourceParser.getEventType() == 2) {
                    String toLowerCase = xmlResourceParser.getName().toLowerCase(Locale.US);
                    boolean equals = toLowerCase.equals("screenname");
                    String str = ConditionalUserProperty.NAME;
                    String trim;
                    if (equals) {
                        toLowerCase = xmlResourceParser.getAttributeValue(null, str);
                        trim = xmlResourceParser.nextText().trim();
                        if (!(TextUtils.isEmpty(toLowerCase) || TextUtils.isEmpty(trim))) {
                            this.zzyn.zzb(toLowerCase, trim);
                        }
                    } else if (toLowerCase.equals("string")) {
                        toLowerCase = xmlResourceParser.getAttributeValue(null, str);
                        trim = xmlResourceParser.nextText().trim();
                        if (!(TextUtils.isEmpty(toLowerCase) || trim == null)) {
                            this.zzyn.zzc(toLowerCase, trim);
                        }
                    } else if (toLowerCase.equals("bool")) {
                        toLowerCase = xmlResourceParser.getAttributeValue(null, str);
                        trim = xmlResourceParser.nextText().trim();
                        if (!(TextUtils.isEmpty(toLowerCase) || TextUtils.isEmpty(trim))) {
                            try {
                                this.zzyn.zza(toLowerCase, Boolean.parseBoolean(trim));
                            } catch (NumberFormatException e) {
                                zzc("Error parsing bool configuration value", trim, e);
                            }
                        }
                    } else if (toLowerCase.equals("integer")) {
                        toLowerCase = xmlResourceParser.getAttributeValue(null, str);
                        trim = xmlResourceParser.nextText().trim();
                        if (!(TextUtils.isEmpty(toLowerCase) || TextUtils.isEmpty(trim))) {
                            try {
                                this.zzyn.zzb(toLowerCase, Integer.parseInt(trim));
                            } catch (NumberFormatException e2) {
                                zzc("Error parsing int configuration value", trim, e2);
                            }
                        }
                    }
                }
                eventType = xmlResourceParser.next();
            }
        } catch (IOException | XmlPullParserException e3) {
            zze("Error parsing tracker configuration file", e3);
        }
        return this.zzyn.zzel();
    }
}
