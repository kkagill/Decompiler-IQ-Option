package a;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

/* compiled from: AppLinks */
public final class a {
    public static Bundle b(Intent intent) {
        return intent.getBundleExtra("al_applink_data");
    }

    public static Uri a(Context context, Intent intent) {
        Bundle b = b(intent);
        if (b != null) {
            String string = b.getString("target_url");
            if (string != null) {
                b.a(context, "al_nav_in", intent, null);
                return Uri.parse(string);
            }
        }
        return null;
    }
}
