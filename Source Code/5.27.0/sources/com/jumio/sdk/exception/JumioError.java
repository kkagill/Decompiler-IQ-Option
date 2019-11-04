package com.jumio.sdk.exception;

import android.content.Context;
import java.util.Locale;

public class JumioError extends Exception {
    private int call;
    private int detailCode;
    private JumioErrorCase errorCase;

    public JumioError(JumioErrorCase jumioErrorCase) {
        this(jumioErrorCase, 0, 0);
    }

    public JumioError(JumioErrorCase jumioErrorCase, int i, int i2) {
        this.errorCase = jumioErrorCase;
        this.call = i;
        this.detailCode = i2;
    }

    public boolean isErrorCase(JumioErrorCase jumioErrorCase) {
        return this.errorCase == jumioErrorCase;
    }

    public boolean isRetryable() {
        return this.errorCase.retry();
    }

    public String getErrorCode() {
        return String.format(Locale.ENGLISH, "%s%d%04d", new Object[]{this.errorCase.code(), Integer.valueOf(this.call), Integer.valueOf(this.detailCode)});
    }

    public String getLocalizedError(Context context) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(context.getString(this.errorCase.message()));
        stringBuilder.append(" (");
        stringBuilder.append(getErrorCode());
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
