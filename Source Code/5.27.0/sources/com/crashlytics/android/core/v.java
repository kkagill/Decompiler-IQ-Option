package com.crashlytics.android.core;

import io.fabric.sdk.android.h;
import io.fabric.sdk.android.k;
import io.fabric.sdk.android.services.common.a;
import io.fabric.sdk.android.services.common.s;
import io.fabric.sdk.android.services.network.HttpMethod;
import io.fabric.sdk.android.services.network.HttpRequest;
import io.fabric.sdk.android.services.network.c;
import java.io.File;
import java.util.Map.Entry;

/* compiled from: DefaultCreateReportSpiCall */
class v extends a implements t {
    public v(h hVar, String str, String str2, c cVar) {
        super(hVar, str, str2, cVar, HttpMethod.POST);
    }

    public boolean a(s sVar) {
        HttpRequest a = a(a(bjk(), sVar), sVar.qM);
        k biX = io.fabric.sdk.android.c.biX();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Sending report to: ");
        stringBuilder.append(getUrl());
        String str = "CrashlyticsCore";
        biX.d(str, stringBuilder.toString());
        int code = a.code();
        k biX2 = io.fabric.sdk.android.c.biX();
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append("Create report request ID: ");
        stringBuilder2.append(a.header("X-REQUEST-ID"));
        biX2.d(str, stringBuilder2.toString());
        k biX3 = io.fabric.sdk.android.c.biX();
        stringBuilder = new StringBuilder();
        stringBuilder.append("Result was: ");
        stringBuilder.append(code);
        biX3.d(str, stringBuilder.toString());
        return s.jq(code) == 0;
    }

    private HttpRequest a(HttpRequest httpRequest, s sVar) {
        String str = "X-CRASHLYTICS-API-CLIENT-VERSION";
        httpRequest = httpRequest.aS("X-CRASHLYTICS-API-KEY", sVar.oM).aS("X-CRASHLYTICS-API-CLIENT-TYPE", "android").aS(str, this.nP.getVersion());
        for (Entry k : sVar.qM.fK().entrySet()) {
            httpRequest = httpRequest.k(k);
        }
        return httpRequest;
    }

    private HttpRequest a(HttpRequest httpRequest, Report report) {
        httpRequest.aW("report[identifier]", report.getIdentifier());
        String str = "application/octet-stream";
        String str2 = " to report ";
        String str3 = "CrashlyticsCore";
        if (report.fJ().length == 1) {
            k biX = io.fabric.sdk.android.c.biX();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Adding single file ");
            stringBuilder.append(report.getFileName());
            stringBuilder.append(str2);
            stringBuilder.append(report.getIdentifier());
            biX.d(str3, stringBuilder.toString());
            return httpRequest.a("report[file]", report.getFileName(), str, report.fI());
        }
        int i = 0;
        for (File file : report.fJ()) {
            k biX2 = io.fabric.sdk.android.c.biX();
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("Adding file ");
            stringBuilder2.append(file.getName());
            stringBuilder2.append(str2);
            stringBuilder2.append(report.getIdentifier());
            biX2.d(str3, stringBuilder2.toString());
            StringBuilder stringBuilder3 = new StringBuilder();
            stringBuilder3.append("report[file");
            stringBuilder3.append(i);
            stringBuilder3.append("]");
            httpRequest.a(stringBuilder3.toString(), file.getName(), str, file);
            i++;
        }
        return httpRequest;
    }
}
