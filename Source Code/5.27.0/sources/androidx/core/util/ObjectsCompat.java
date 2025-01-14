package androidx.core.util;

import android.os.Build.VERSION;
import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.Objects;

public class ObjectsCompat {
    private ObjectsCompat() {
    }

    public static boolean equals(@Nullable Object obj, @Nullable Object obj2) {
        if (VERSION.SDK_INT >= 19) {
            return Objects.equals(obj, obj2);
        }
        boolean z = obj == obj2 || (obj != null && obj.equals(obj2));
        return z;
    }

    public static int hashCode(@Nullable Object obj) {
        return obj != null ? obj.hashCode() : 0;
    }

    public static int hash(@Nullable Object... objArr) {
        if (VERSION.SDK_INT >= 19) {
            return Objects.hash(objArr);
        }
        return Arrays.hashCode(objArr);
    }
}
