package com.iqoption.core.util.c;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.os.Bundle;
import android.telephony.PhoneNumberUtils;
import androidx.core.view.ViewCompat;
import com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import java.util.EnumMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012J.\u0010\u0013\u001a\u00020\u000e2\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00032\b\u0010\u0014\u001a\u0004\u0018\u00010\u0003H\u0002J$\u0010\u0015\u001a\u00020\u00162\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0003H\u0002R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u000fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0018"}, bng = {"Lcom/iqoption/core/util/qrcode/QRCodeEncoder;", "", "data", "", "bundle", "Landroid/os/Bundle;", "type", "format", "dimension", "", "(Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;I)V", "contents", "displayContents", "encoded", "", "Lcom/google/zxing/BarcodeFormat;", "title", "encodeAsBitmap", "Landroid/graphics/Bitmap;", "encodeContents", "formatString", "encodeQRCodeContents", "", "Companion", "core_release"})
/* compiled from: QRCodeEncoder.kt */
public final class b {
    public static final a bSm = new a();
    private String bSh;
    private String bSi;
    private BarcodeFormat bSj;
    private boolean bSk;
    private final int bSl;
    private String title;

    @i(bne = {1, 1, 15}, bnf = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002J\u0012\u0010\t\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0014\u0010\f\u001a\u0004\u0018\u00010\u00072\b\u0010\r\u001a\u0004\u0018\u00010\u0007H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u000e"}, bng = {"Lcom/iqoption/core/util/qrcode/QRCodeEncoder$Companion;", "", "()V", "BLACK", "", "WHITE", "escapeMECARD", "", "input", "guessAppropriateEncoding", "contents", "", "trim", "s", "core_release"})
    /* compiled from: QRCodeEncoder.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        private final String I(CharSequence charSequence) {
            int length = charSequence.length();
            for (int i = 0; i < length; i++) {
                if (charSequence.charAt(i) > 255) {
                    return "UTF-8";
                }
            }
            return null;
        }

        private final String hy(String str) {
            if (str == null) {
                return str;
            }
            CharSequence charSequence = str;
            if (v.a(charSequence, ':', 0, false, 6, null) < 0 && v.a(charSequence, ';', 0, false, 6, null) < 0) {
                return str;
            }
            int length = str.length();
            StringBuilder stringBuilder = new StringBuilder(length);
            for (int i = 0; i < length; i++) {
                char charAt = str.charAt(i);
                if (charAt == ':' || charAt == ';') {
                    stringBuilder.append('\\');
                }
                stringBuilder.append(charAt);
            }
            return stringBuilder.toString();
        }

        private final String trim(String str) {
            if (str == null) {
                return null;
            }
            CharSequence charSequence = str;
            int i = 1;
            int length = charSequence.length() - 1;
            int i2 = 0;
            Object obj = null;
            while (i2 <= length) {
                Object obj2 = charSequence.charAt(obj == null ? i2 : length) <= ' ' ? 1 : null;
                if (obj == null) {
                    if (obj2 == null) {
                        obj = 1;
                    } else {
                        i2++;
                    }
                } else if (obj2 == null) {
                    break;
                } else {
                    length--;
                }
            }
            str = charSequence.subSequence(i2, length + 1).toString();
            if (str.length() != 0) {
                i = 0;
            }
            if (i != 0) {
                str = null;
            }
            return str;
        }
    }

    public b(String str, Bundle bundle, String str2, String str3, int i) {
        kotlin.jvm.internal.i.f(str, "data");
        kotlin.jvm.internal.i.f(str2, "type");
        kotlin.jvm.internal.i.f(str3, "format");
        this.bSl = i;
        this.bSk = a(str, bundle, str2, str3);
    }

    private final boolean a(String str, Bundle bundle, String str2, String str3) {
        this.bSj = (BarcodeFormat) null;
        if (str3 != null) {
            try {
                this.bSj = BarcodeFormat.valueOf(str3);
            } catch (IllegalArgumentException unused) {
            }
        }
        BarcodeFormat barcodeFormat = this.bSj;
        if (barcodeFormat == null || barcodeFormat == BarcodeFormat.QR_CODE) {
            this.bSj = BarcodeFormat.QR_CODE;
            a(str, bundle, str2);
        } else if (str != null && str.length() > 0) {
            this.bSh = str;
            this.bSi = str;
            this.title = "Text";
        }
        str = this.bSh;
        if (str != null) {
            if (str == null) {
                kotlin.jvm.internal.i.bnJ();
            }
            if ((((CharSequence) str).length() > 0 ? 1 : null) != null) {
                return true;
            }
        }
        return false;
    }

    private final void a(String str, Bundle bundle, String str2) {
        StringBuilder stringBuilder;
        StringBuilder stringBuilder2;
        if (kotlin.jvm.internal.i.y(str2, "TEXT_TYPE")) {
            if (str != null && str.length() > 0) {
                this.bSh = str;
                this.bSi = str;
                this.title = "Text";
            }
        } else if (kotlin.jvm.internal.i.y(str2, "EMAIL_TYPE")) {
            str = bSm.trim(str);
            if (str != null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append("mailto:");
                stringBuilder.append(str);
                this.bSh = stringBuilder.toString();
                this.bSi = str;
                this.title = "E-Mail";
            }
        } else if (kotlin.jvm.internal.i.y(str2, "PHONE_TYPE")) {
            str = bSm.trim(str);
            if (str != null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append("tel:");
                stringBuilder.append(str);
                this.bSh = stringBuilder.toString();
                this.bSi = PhoneNumberUtils.formatNumber(str);
                this.title = "Phone";
            }
        } else if (kotlin.jvm.internal.i.y(str2, "SMS_TYPE")) {
            str = bSm.trim(str);
            if (str != null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append("sms:");
                stringBuilder.append(str);
                this.bSh = stringBuilder.toString();
                this.bSi = PhoneNumberUtils.formatNumber(str);
                this.title = "SMS";
            }
        } else if (kotlin.jvm.internal.i.y(str2, "CONTACT_TYPE")) {
            if (bundle != null) {
                String a;
                String str3;
                stringBuilder2 = new StringBuilder(100);
                StringBuilder stringBuilder3 = new StringBuilder(100);
                stringBuilder2.append("MECARD:");
                str2 = bSm.trim(bundle.getString(ConditionalUserProperty.NAME));
                if (str2 != null) {
                    stringBuilder2.append("N:");
                    stringBuilder2.append(bSm.hy(str2));
                    stringBuilder2.append(';');
                    stringBuilder3.append(str2);
                }
                str2 = bSm.trim(bundle.getString("postal"));
                if (str2 != null) {
                    stringBuilder2.append("ADR:");
                    stringBuilder2.append(bSm.hy(str2));
                    stringBuilder2.append(';');
                    stringBuilder3.append(10);
                    stringBuilder3.append(str2);
                }
                HashSet hashSet = new HashSet(a.bSg.anX().length);
                for (String string : a.bSg.anX()) {
                    a = bSm.trim(bundle.getString(string));
                    if (a != null) {
                        hashSet.add(a);
                    }
                }
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    str3 = (String) it.next();
                    stringBuilder2.append("TEL:");
                    stringBuilder2.append(bSm.hy(str3));
                    stringBuilder2.append(';');
                    stringBuilder3.append(10);
                    stringBuilder3.append(PhoneNumberUtils.formatNumber(str3));
                }
                hashSet = new HashSet(a.bSg.anY().length);
                for (String a2 : a.bSg.anY()) {
                    String a3 = bSm.trim(bundle.getString(a2));
                    if (a3 != null) {
                        hashSet.add(a3);
                    }
                }
                it = hashSet.iterator();
                while (it.hasNext()) {
                    str3 = (String) it.next();
                    stringBuilder2.append("EMAIL:");
                    stringBuilder2.append(bSm.hy(str3));
                    stringBuilder2.append(';');
                    stringBuilder3.append(10);
                    stringBuilder3.append(str3);
                }
                str2 = bSm.trim(bundle.getString("URL_KEY"));
                if (str2 != null) {
                    stringBuilder2.append("URL:");
                    stringBuilder2.append(str2);
                    stringBuilder2.append(';');
                    stringBuilder3.append(10);
                    stringBuilder3.append(str2);
                }
                String a4 = bSm.trim(bundle.getString("NOTE_KEY"));
                if (a4 != null) {
                    stringBuilder2.append("NOTE:");
                    stringBuilder2.append(bSm.hy(a4));
                    stringBuilder2.append(';');
                    stringBuilder3.append(10);
                    stringBuilder3.append(a4);
                }
                if (stringBuilder3.length() > 0) {
                    stringBuilder2.append(';');
                    this.bSh = stringBuilder2.toString();
                    this.bSi = stringBuilder3.toString();
                    this.title = "Contact";
                    return;
                }
                str = (String) null;
                this.bSh = str;
                this.bSi = str;
            }
        } else if (kotlin.jvm.internal.i.y(str2, "LOCATION_TYPE") && bundle != null) {
            float f = bundle.getFloat("LAT", Float.MAX_VALUE);
            float f2 = bundle.getFloat("LONG", Float.MAX_VALUE);
            if (f != Float.MAX_VALUE && f2 != Float.MAX_VALUE) {
                stringBuilder2 = new StringBuilder();
                stringBuilder2.append("geo:");
                stringBuilder2.append(f);
                stringBuilder2.append(',');
                stringBuilder2.append(f2);
                this.bSh = stringBuilder2.toString();
                stringBuilder2 = new StringBuilder();
                stringBuilder2.append(f);
                stringBuilder2.append(',');
                stringBuilder2.append(f2);
                this.bSi = stringBuilder2.toString();
                this.title = "Location";
            }
        }
    }

    public final Bitmap anZ() {
        if (!this.bSk) {
            return null;
        }
        Map enumMap = new EnumMap(EncodeHintType.class);
        enumMap.put(EncodeHintType.MARGIN, Integer.valueOf(0));
        a aVar = bSm;
        String str = this.bSh;
        if (str == null) {
            kotlin.jvm.internal.i.bnJ();
        }
        String a = aVar.I(str);
        if (a != null) {
            enumMap.put(EncodeHintType.CHARACTER_SET, a);
        }
        com.google.zxing.b bVar = new com.google.zxing.b();
        String str2 = this.bSh;
        BarcodeFormat barcodeFormat = this.bSj;
        if (barcodeFormat == null) {
            kotlin.jvm.internal.i.bnJ();
        }
        int i = this.bSl;
        com.google.zxing.common.b a2 = bVar.a(str2, barcodeFormat, i, i, enumMap);
        kotlin.jvm.internal.i.e(a2, "result");
        int width = a2.getWidth();
        int height = a2.getHeight();
        int[] iArr = new int[(width * height)];
        for (int i2 = 0; i2 < height; i2++) {
            int i3 = i2 * width;
            for (int i4 = 0; i4 < width; i4++) {
                iArr[i3 + i4] = a2.P(i4, i2) ? ViewCompat.MEASURED_STATE_MASK : -1;
            }
        }
        Bitmap createBitmap = Bitmap.createBitmap(width, height, Config.ARGB_8888);
        createBitmap.setPixels(iArr, 0, width, 0, 0, width, height);
        return createBitmap;
    }
}
