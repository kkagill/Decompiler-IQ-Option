package androidx.media;

import android.os.Bundle;
import androidx.annotation.RestrictTo;
import androidx.annotation.RestrictTo.Scope;

@RestrictTo({Scope.LIBRARY_GROUP})
public class MediaBrowserCompatUtils {
    public static boolean areSameOptions(Bundle bundle, Bundle bundle2) {
        boolean z = true;
        if (bundle == bundle2) {
            return true;
        }
        String str = "android.media.browse.extra.PAGE_SIZE";
        String str2 = "android.media.browse.extra.PAGE";
        if (bundle == null) {
            if (!(bundle2.getInt(str2, -1) == -1 && bundle2.getInt(str, -1) == -1)) {
                z = false;
            }
            return z;
        } else if (bundle2 == null) {
            if (!(bundle.getInt(str2, -1) == -1 && bundle.getInt(str, -1) == -1)) {
                z = false;
            }
            return z;
        } else {
            if (!(bundle.getInt(str2, -1) == bundle2.getInt(str2, -1) && bundle.getInt(str, -1) == bundle2.getInt(str, -1))) {
                z = false;
            }
            return z;
        }
    }

    public static boolean hasDuplicatedItems(Bundle bundle, Bundle bundle2) {
        int i;
        int i2;
        int i3;
        String str = "android.media.browse.extra.PAGE";
        int i4 = bundle == null ? -1 : bundle.getInt(str, -1);
        if (bundle2 == null) {
            i = -1;
        } else {
            i = bundle2.getInt(str, -1);
        }
        String str2 = "android.media.browse.extra.PAGE_SIZE";
        if (bundle == null) {
            i2 = -1;
        } else {
            i2 = bundle.getInt(str2, -1);
        }
        if (bundle2 == null) {
            i3 = -1;
        } else {
            i3 = bundle2.getInt(str2, -1);
        }
        int i5 = Integer.MAX_VALUE;
        if (i4 == -1 || i2 == -1) {
            i2 = Integer.MAX_VALUE;
            i4 = 0;
        } else {
            i4 *= i2;
            i2 = (i2 + i4) - 1;
        }
        if (i == -1 || i3 == -1) {
            i = 0;
        } else {
            i *= i3;
            i5 = (i3 + i) - 1;
        }
        return i2 >= i && i5 >= i4;
    }

    private MediaBrowserCompatUtils() {
    }
}
