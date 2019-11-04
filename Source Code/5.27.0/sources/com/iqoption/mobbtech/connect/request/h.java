package com.iqoption.mobbtech.connect.request;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Nullable;
import com.facebook.appevents.AppEventsLogger;
import com.google.android.gms.analytics.HitBuilders.EventBuilder;
import com.google.android.gms.analytics.Tracker;
import com.iqoption.app.IQApp;
import com.iqoption.app.d;
import com.iqoption.core.microservices.core.register.SocialTypeId;

/* compiled from: RegisterRequest */
public class h {

    /* compiled from: RegisterRequest */
    /* renamed from: com.iqoption.mobbtech.connect.request.h$1 */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] dIb = new int[SocialTypeId.values().length];

        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Missing block: B:7:?, code skipped:
            return;
     */
        static {
            /*
            r0 = com.iqoption.core.microservices.core.register.SocialTypeId.values();
            r0 = r0.length;
            r0 = new int[r0];
            dIb = r0;
            r0 = dIb;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = com.iqoption.core.microservices.core.register.SocialTypeId.FACEBOOK;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = 1;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            r0 = dIb;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = com.iqoption.core.microservices.core.register.SocialTypeId.GOOGLE_PLUS;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x001f }
            r2 = 2;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x001f }
        L_0x001f:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.iqoption.mobbtech.connect.request.h$AnonymousClass1.<clinit>():void");
        }
    }

    public static void a(Context context, @Nullable SocialTypeId socialTypeId, boolean z, boolean z2) {
        String str = "fb_mobile_complete_registration";
        String str2 = "fb_registration_method";
        String str3 = "Registration_Trial";
        String str4 = "&cid";
        String str5 = "Android";
        if (z2) {
            try {
                d.aP(context).Fk();
                Tracker aO = IQApp.aO(context);
                aO.send(((EventBuilder) new EventBuilder().setCategory(str5).setAction(str3).setLabel(str3).setCustomDimension(2, aO.get(str4))).build());
            } catch (Exception unused) {
                return;
            }
        }
        Bundle bundle = new Bundle();
        String str6 = "EMAIL";
        String str7 = "Form";
        if (z) {
            int i = AnonymousClass1.dIb[socialTypeId.ordinal()];
            if (i == 1) {
                str6 = "FACEBOOK";
                str7 = "Facebook";
            } else if (i == 2) {
                str6 = "GOOGLE";
                str7 = "Google";
            }
        }
        Tracker aO2 = IQApp.aO(context);
        aO2.send(((EventBuilder) new EventBuilder().setCategory(str5).setAction("Registration_Real").setLabel(str7).setCustomDimension(2, aO2.get(str4))).build());
        bundle.putString(str2, str6);
        AppEventsLogger.O(context).logEvent(str, bundle);
        if (!d.aP(context).Fl()) {
            aO2 = IQApp.aO(context);
            aO2.send(((EventBuilder) new EventBuilder().setCategory(str5).setAction("Welcomescreen_Registration").setLabel(str7).setCustomDimension(2, aO2.get(str4))).build());
            bundle.putString(str2, str6);
            AppEventsLogger.O(context).logEvent(str, bundle);
        }
        if (!z2) {
            IQApp.a("registration", null);
        }
    }
}
