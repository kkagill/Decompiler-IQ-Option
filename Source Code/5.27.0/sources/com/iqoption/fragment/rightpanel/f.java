package com.iqoption.fragment.rightpanel;

import androidx.annotation.NonNull;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.a;
import com.iqoption.core.d;
import java.util.Locale;

/* compiled from: CryptoVideoPaths */
public final class f {
    private static final ImmutableMap<String, String> dmU;
    private static final ImmutableMap<String, String> dmV;
    private static final ImmutableMap<String, String> dmW;
    private static final ImmutableMap<String, String> dmX;
    private static final ImmutableMap<String, String> dmY;
    private static final ImmutableMap<String, String> dmZ;
    private static final ImmutableMap<String, String> dna;
    private static final ImmutableMap<String, String> dnb;
    private static final ImmutableMap<String, String> dnc;
    private static final ImmutableMap<String, String> dnd;

    static {
        String str = "BTCUSD";
        String str2 = "XRPUSD";
        String str3 = "ETHUSD";
        String str4 = "LTCUSD";
        String str5 = "IOTUSD";
        String str6 = "DSHUSD";
        dmU = new a().m(str, "storage/public/59/ae/cdb9d5f4d.mp4").m(str2, "storage/public/59/ae/cdec58db6.mp4").m(str3, "storage/public/59/ae/ce053ad26.mp4").m(str4, "storage/public/59/ae/ce239ce7f.mp4").m(str5, "storage/public/59/ae/ce38dfccb.mp4").m(str6, "storage/public/59/ae/ce517c1d6.mp4").tf();
        dmV = new a().m(str, "storage/public/59/b2/ca460fa35.mp4").m(str2, "storage/public/59/b2/d94177cce.mp4").m(str3, "storage/public/59/b2/d53773f0f.mp4").m(str4, "storage/public/59/b2/d94193e62.mp4").m(str5, "storage/public/59/b2/d93fbbaae.mp4").m(str6, "storage/public/59/b2/cabd71f74.mp4").tf();
        dmW = new a().m(str, "storage/public/59/b2/d96e9eb73.mp4").m(str2, "storage/public/59/b2/d96e8a015.mp4").m(str3, "storage/public/59/b2/d96f232b7.mp4").m(str4, "storage/public/59/b2/d96e45f53.mp4").m(str5, "storage/public/59/b2/d96dad64b.mp4").m(str6, "storage/public/59/b2/d96cac78d.mp4").tf();
        dmX = new a().m(str, "storage/public/59/b2/d991efd74.mp4").m(str2, "storage/public/59/b2/d9922d34d.mp4").m(str3, "storage/public/59/b2/d990cca82.mp4").m(str4, "storage/public/59/b2/d990e79ce.mp4").m(str5, "storage/public/59/b2/d9911d39f.mp4").m(str6, "storage/public/59/b2/d98f7ee51.mp4").tf();
        dmY = new a().m(str, "storage/public/59/b2/d9b2be93b.mp4").m(str2, "storage/public/59/b2/d9b3c6104.mp4").m(str3, "storage/public/59/b2/d9b39a4c0.mp4").m(str4, "storage/public/59/b2/d9b3b29dc.mp4").m(str5, "storage/public/59/b2/d9b2ab34b.mp4").m(str6, "storage/public/59/b2/d9b21fb97.mp4").tf();
        dmZ = new a().m(str, "storage/public/59/b2/d9ec07757.mp4").m(str2, "storage/public/59/b2/d9ee0b7c9.mp4").m(str3, "storage/public/59/b2/d9ecd7289.mp4").m(str4, "storage/public/59/b2/d9ed19659.mp4").m(str5, "storage/public/59/b2/d9efa4562.mp4").m(str6, "storage/public/59/b2/d9eabe48b.mp4").tf();
        dna = new a().m(str, "storage/public/59/b2/da0cc8ff6.mp4").m(str2, "storage/public/59/b2/da0ccf387.mp4").m(str3, "storage/public/59/b2/da0cd895a.mp4").m(str4, "storage/public/59/b2/da0beff44.mp4").m(str5, "storage/public/59/b2/da0b65a2c.mp4").m(str6, "storage/public/59/b2/da0c87e4f.mp4").tf();
        dnb = new a().m(str, "storage/public/59/b2/da26dcb33.mp4").m(str2, "storage/public/59/b2/da27a7e26.mp4").m(str3, "storage/public/59/b2/da27eef79.mp4").m(str4, "storage/public/59/b2/da26b0f4b.mp4").m(str5, "storage/public/59/b2/da27ce23b.mp4").m(str6, "storage/public/59/b2/da26afe7f.mp4").tf();
        dnc = new a().m(str, "storage/public/59/b2/da42d6151.mp4").m(str2, "storage/public/59/b2/da4336e41.mp4").m(str3, "storage/public/59/b2/da42844d3.mp4").m(str4, "storage/public/59/b2/da4245fb9.mp4").m(str5, "storage/public/59/b2/da426f1b0.mp4").m(str6, "storage/public/59/b2/da41752dd.mp4").tf();
        dnd = new a().m(str, "storage/public/59/b2/da5e903d5.mp4").m(str2, "storage/public/59/b2/da5db5ab5.mp4").m(str3, "storage/public/59/b2/da5d6efe7.mp4").m(str4, "storage/public/59/b2/da5e6e445.mp4").m(str5, "storage/public/59/b2/da5e00162.mp4").m(str6, "storage/public/59/b2/da5d89c6d.mp4").tf();
    }

    @NonNull
    public static String a(String str, Locale locale) {
        String language = locale.getLanguage();
        if (new Locale("fr").getLanguage().equals(language)) {
            str = (String) dmV.get(str);
        } else if (new Locale("zh").getLanguage().equals(language)) {
            str = (String) dmW.get(str);
        } else if (new Locale("de").getLanguage().equals(language)) {
            str = (String) dmX.get(str);
        } else if (new Locale("id").getLanguage().equals(language)) {
            str = (String) dmY.get(str);
        } else if (new Locale("it").getLanguage().equals(language)) {
            str = (String) dmZ.get(str);
        } else if (new Locale("pt").getLanguage().equals(language)) {
            str = (String) dna.get(str);
        } else if (new Locale("es").getLanguage().equals(language)) {
            str = (String) dnb.get(str);
        } else if (new Locale("tr").getLanguage().equals(language)) {
            str = (String) dnd.get(str);
        } else {
            str = (String) dmU.get(str);
        }
        return d.EE().fz(str);
    }
}
