package com.microblink.util;

import android.content.Context;
import android.os.Environment;
import android.util.Log;
import androidx.annotation.Nullable;
import com.microblink.util.Log.LogLevel;
import java.io.PrintWriter;
import java.sql.Timestamp;
import java.util.Date;

/* compiled from: line */
public class a implements com.microblink.util.Log.a {
    private static String eyT;
    private PrintWriter eyS;

    public static synchronized String bT(@Nullable Context context) {
        String str;
        synchronized (a.class) {
            if (eyT == null) {
                StringBuilder stringBuilder;
                StringBuilder stringBuilder2;
                if (Environment.getExternalStorageState().equals("mounted")) {
                    stringBuilder2 = new StringBuilder();
                    stringBuilder2.append(Environment.getExternalStorageDirectory());
                    stringBuilder2.append("/microblink");
                    eyT = stringBuilder2.toString();
                } else if (context != null) {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append(context.getCacheDir().getAbsolutePath());
                    stringBuilder.append("/microblink");
                    eyT = stringBuilder.toString();
                } else {
                    stringBuilder2 = new StringBuilder();
                    stringBuilder2.append(Environment.getDataDirectory().getAbsolutePath());
                    stringBuilder2.append("/microblink");
                    eyT = stringBuilder2.toString();
                }
                if (Log.beK().ordinal() >= LogLevel.LOG_INFORMATION.ordinal()) {
                    stringBuilder = new StringBuilder("Log folder will be ");
                    stringBuilder.append(eyT);
                    Log.i("LOG", stringBuilder.toString());
                }
            }
            str = eyT;
        }
        return str;
    }

    public void a(String str, String str2, String str3, Throwable th) {
        synchronized (this) {
            if (this.eyS != null) {
                this.eyS.write(str);
                Timestamp timestamp = new Timestamp(new Date().getTime());
                this.eyS.write(" (");
                this.eyS.write(timestamp.toString());
                this.eyS.write(") [");
                this.eyS.write(str2);
                this.eyS.write("] ");
                this.eyS.write(str3);
                this.eyS.write("\n");
                if (th != null) {
                    th.printStackTrace(this.eyS);
                }
                this.eyS.flush();
            }
        }
    }
}
