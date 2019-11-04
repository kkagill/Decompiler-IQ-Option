package com.crashlytics.android.answers;

import io.fabric.sdk.android.h;
import io.fabric.sdk.android.k;
import io.fabric.sdk.android.services.b.f;
import io.fabric.sdk.android.services.common.a;
import io.fabric.sdk.android.services.common.s;
import io.fabric.sdk.android.services.network.HttpMethod;
import io.fabric.sdk.android.services.network.HttpRequest;
import io.fabric.sdk.android.services.network.c;
import java.io.File;
import java.util.List;

/* compiled from: SessionAnalyticsFilesSender */
class y extends a implements f {
    private final String oM;

    public y(h hVar, String str, String str2, c cVar, String str3) {
        super(hVar, str, str2, cVar, HttpMethod.POST);
        this.oM = str3;
    }

    public boolean f(List<File> list) {
        String str = "X-CRASHLYTICS-API-KEY";
        HttpRequest aS = bjk().aS("X-CRASHLYTICS-API-CLIENT-TYPE", "android").aS("X-CRASHLYTICS-API-CLIENT-VERSION", this.nP.getVersion()).aS(str, this.oM);
        int i = 0;
        for (File file : list) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("session_analytics_file_");
            stringBuilder.append(i);
            aS.a(stringBuilder.toString(), file.getName(), "application/vnd.crashlytics.android.events", file);
            i++;
        }
        k biX = io.fabric.sdk.android.c.biX();
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append("Sending ");
        stringBuilder2.append(list.size());
        stringBuilder2.append(" analytics files to ");
        stringBuilder2.append(getUrl());
        String stringBuilder3 = stringBuilder2.toString();
        String str2 = "Answers";
        biX.d(str2, stringBuilder3);
        int code = aS.code();
        k biX2 = io.fabric.sdk.android.c.biX();
        StringBuilder stringBuilder4 = new StringBuilder();
        stringBuilder4.append("Response code for analytics file send is ");
        stringBuilder4.append(code);
        biX2.d(str2, stringBuilder4.toString());
        if (s.jq(code) == 0) {
            return true;
        }
        return false;
    }
}
