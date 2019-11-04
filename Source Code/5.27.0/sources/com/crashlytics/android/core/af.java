package com.crashlytics.android.core;

import io.fabric.sdk.android.h;
import io.fabric.sdk.android.k;
import io.fabric.sdk.android.services.common.a;
import io.fabric.sdk.android.services.common.s;
import io.fabric.sdk.android.services.network.HttpMethod;
import io.fabric.sdk.android.services.network.HttpRequest;
import io.fabric.sdk.android.services.network.c;
import java.io.File;

/* compiled from: NativeCreateReportSpiCall */
class af extends a implements t {
    public af(h hVar, String str, String str2, c cVar) {
        super(hVar, str, str2, cVar, HttpMethod.POST);
    }

    public boolean a(s sVar) {
        HttpRequest a = a(a(bjk(), sVar.oM), sVar.qM);
        k biX = io.fabric.sdk.android.c.biX();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Sending report to: ");
        stringBuilder.append(getUrl());
        String str = "CrashlyticsCore";
        biX.d(str, stringBuilder.toString());
        int code = a.code();
        biX = io.fabric.sdk.android.c.biX();
        stringBuilder = new StringBuilder();
        stringBuilder.append("Result was: ");
        stringBuilder.append(code);
        biX.d(str, stringBuilder.toString());
        return s.jq(code) == 0;
    }

    private HttpRequest a(HttpRequest httpRequest, String str) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Crashlytics Android SDK/");
        stringBuilder.append(this.nP.getVersion());
        String str2 = "X-CRASHLYTICS-API-CLIENT-VERSION";
        httpRequest.aS("User-Agent", stringBuilder.toString()).aS("X-CRASHLYTICS-API-CLIENT-TYPE", "android").aS(str2, this.nP.getVersion()).aS("X-CRASHLYTICS-API-KEY", str);
        return httpRequest;
    }

    private HttpRequest a(HttpRequest httpRequest, Report report) {
        httpRequest.aW("report_id", report.getIdentifier());
        for (File file : report.fJ()) {
            String str = "application/octet-stream";
            if (file.getName().equals("minidump")) {
                httpRequest.a("minidump_file", file.getName(), str, file);
            } else if (file.getName().equals("metadata")) {
                httpRequest.a("crash_meta_file", file.getName(), str, file);
            } else if (file.getName().equals("binaryImages")) {
                httpRequest.a("binary_images_file", file.getName(), str, file);
            } else if (file.getName().equals("session")) {
                httpRequest.a("session_meta_file", file.getName(), str, file);
            } else if (file.getName().equals("app")) {
                httpRequest.a("app_meta_file", file.getName(), str, file);
            } else if (file.getName().equals("device")) {
                httpRequest.a("device_meta_file", file.getName(), str, file);
            } else if (file.getName().equals("os")) {
                httpRequest.a("os_meta_file", file.getName(), str, file);
            } else if (file.getName().equals("user")) {
                httpRequest.a("user_meta_file", file.getName(), str, file);
            } else if (file.getName().equals("logs")) {
                httpRequest.a("logs_file", file.getName(), str, file);
            } else if (file.getName().equals("keys")) {
                httpRequest.a("keys_file", file.getName(), str, file);
            }
        }
        return httpRequest;
    }
}
