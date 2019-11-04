package jumio.nv.nfc;

import com.jumio.commons.log.Log;
import java.io.File;
import java.io.PrintWriter;
import java.io.StringWriter;

/* compiled from: NfcLogger */
public class f {
    public static File a;

    public static void a(String str) {
    }

    static {
        a();
    }

    private static void a() {
        a(null);
    }

    public static void a(String str, String str2) {
        Log.d(str, str2);
        File file = a;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append(" :: ");
        stringBuilder.append(str2);
        a(file, stringBuilder.toString());
    }

    public static void b(String str, String str2) {
        Log.i(str, str2);
        File file = a;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append(" :: ");
        stringBuilder.append(str2);
        a(file, stringBuilder.toString());
    }

    public static void c(String str, String str2) {
        Log.w(str, str2);
        File file = a;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append(" :: ");
        stringBuilder.append(str2);
        a(file, stringBuilder.toString());
    }

    public static void a(String str, String str2, Exception exception) {
        Log.w(str, str2, (Throwable) exception);
        File file = a;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append(" :: ");
        stringBuilder.append(str2);
        a(file, stringBuilder.toString());
        a(a, exception);
    }

    public static void b(String str, String str2, Exception exception) {
        Log.e(str, str2, (Throwable) exception);
        File file = a;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append(" :: ");
        stringBuilder.append(str2);
        a(file, stringBuilder.toString());
        a(a, exception);
    }

    private static void a(File file, Exception exception) {
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        Log.printStackTrace(exception);
        a(file, stringWriter.toString());
    }

    private static synchronized void a(File file, String str) {
        synchronized (f.class) {
        }
    }
}
