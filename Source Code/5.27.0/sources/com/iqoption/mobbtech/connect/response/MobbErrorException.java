package com.iqoption.mobbtech.connect.response;

import android.text.TextUtils;
import com.iqoption.app.IQApp;
import com.iqoption.app.a.b;
import com.iqoption.x.R;
import java.util.concurrent.CancellationException;

public class MobbErrorException extends Exception {
    private final f mobbError;

    public MobbErrorException(f fVar) {
        this.mobbError = fVar;
    }

    public String toString() {
        return this.mobbError.toString();
    }

    public f aPQ() {
        return this.mobbError;
    }

    public static String R(Throwable th) {
        String str = null;
        if (th instanceof MobbErrorException) {
            f aPQ = ((MobbErrorException) th).aPQ();
            if (aPQ != null) {
                str = aPQ.getErrorMessage();
            }
            if (TextUtils.isEmpty(str)) {
                str = IQApp.Eu().getString(R.string.unknown_error_occurred);
            }
            b.b(str, IQApp.Eu());
            return str;
        } else if (th instanceof CancellationException) {
            return null;
        } else {
            String string = IQApp.Eu().getString(R.string.unknown_error_occurred);
            b.b(string, IQApp.Eu());
            return string;
        }
    }
}
