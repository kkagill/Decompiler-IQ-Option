package com.crashlytics.android.core;

import android.content.Context;
import io.fabric.sdk.android.services.common.CommonUtils;
import io.fabric.sdk.android.services.settings.o;

/* compiled from: DialogStringResolver */
class x {
    private final Context context;
    private final o qJ;

    public x(Context context, o oVar) {
        this.context = context;
        this.qJ = oVar;
    }

    public String getTitle() {
        return t("com.crashlytics.CrashSubmissionPromptTitle", this.qJ.title);
    }

    public String getMessage() {
        return t("com.crashlytics.CrashSubmissionPromptMessage", this.qJ.message);
    }

    public String fB() {
        return t("com.crashlytics.CrashSubmissionSendTitle", this.qJ.ePF);
    }

    public String fC() {
        return t("com.crashlytics.CrashSubmissionAlwaysSendTitle", this.qJ.ePJ);
    }

    public String fD() {
        return t("com.crashlytics.CrashSubmissionCancelTitle", this.qJ.ePH);
    }

    private String t(String str, String str2) {
        return u(CommonUtils.L(this.context, str), str2);
    }

    private String u(String str, String str2) {
        return aB(str) ? str2 : str;
    }

    private boolean aB(String str) {
        return str == null || str.length() == 0;
    }
}
