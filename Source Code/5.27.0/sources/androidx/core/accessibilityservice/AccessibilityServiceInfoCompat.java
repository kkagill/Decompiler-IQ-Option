package androidx.core.accessibilityservice;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.pm.PackageManager;
import android.os.Build.VERSION;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public final class AccessibilityServiceInfoCompat {
    public static final int CAPABILITY_CAN_FILTER_KEY_EVENTS = 8;
    public static final int CAPABILITY_CAN_REQUEST_ENHANCED_WEB_ACCESSIBILITY = 4;
    public static final int CAPABILITY_CAN_REQUEST_TOUCH_EXPLORATION = 2;
    public static final int CAPABILITY_CAN_RETRIEVE_WINDOW_CONTENT = 1;
    public static final int FEEDBACK_ALL_MASK = -1;
    public static final int FEEDBACK_BRAILLE = 32;
    public static final int FLAG_INCLUDE_NOT_IMPORTANT_VIEWS = 2;
    public static final int FLAG_REPORT_VIEW_IDS = 16;
    public static final int FLAG_REQUEST_ENHANCED_WEB_ACCESSIBILITY = 8;
    public static final int FLAG_REQUEST_FILTER_KEY_EVENTS = 32;
    public static final int FLAG_REQUEST_TOUCH_EXPLORATION_MODE = 4;

    @NonNull
    public static String capabilityToString(int i) {
        return i != 1 ? i != 2 ? i != 4 ? i != 8 ? "UNKNOWN" : "CAPABILITY_CAN_FILTER_KEY_EVENTS" : "CAPABILITY_CAN_REQUEST_ENHANCED_WEB_ACCESSIBILITY" : "CAPABILITY_CAN_REQUEST_TOUCH_EXPLORATION" : "CAPABILITY_CAN_RETRIEVE_WINDOW_CONTENT";
    }

    @Nullable
    public static String flagToString(int i) {
        return i != 1 ? i != 2 ? i != 4 ? i != 8 ? i != 16 ? i != 32 ? null : "FLAG_REQUEST_FILTER_KEY_EVENTS" : "FLAG_REPORT_VIEW_IDS" : "FLAG_REQUEST_ENHANCED_WEB_ACCESSIBILITY" : "FLAG_REQUEST_TOUCH_EXPLORATION_MODE" : "FLAG_INCLUDE_NOT_IMPORTANT_VIEWS" : "DEFAULT";
    }

    private AccessibilityServiceInfoCompat() {
    }

    @Nullable
    public static String loadDescription(@NonNull AccessibilityServiceInfo accessibilityServiceInfo, @NonNull PackageManager packageManager) {
        if (VERSION.SDK_INT >= 16) {
            return accessibilityServiceInfo.loadDescription(packageManager);
        }
        return accessibilityServiceInfo.getDescription();
    }

    @NonNull
    public static String feedbackTypeToString(int i) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[");
        while (i > 0) {
            int numberOfTrailingZeros = 1 << Integer.numberOfTrailingZeros(i);
            i &= numberOfTrailingZeros ^ -1;
            if (stringBuilder.length() > 1) {
                stringBuilder.append(", ");
            }
            if (numberOfTrailingZeros == 1) {
                stringBuilder.append("FEEDBACK_SPOKEN");
            } else if (numberOfTrailingZeros == 2) {
                stringBuilder.append("FEEDBACK_HAPTIC");
            } else if (numberOfTrailingZeros == 4) {
                stringBuilder.append("FEEDBACK_AUDIBLE");
            } else if (numberOfTrailingZeros == 8) {
                stringBuilder.append("FEEDBACK_VISUAL");
            } else if (numberOfTrailingZeros == 16) {
                stringBuilder.append("FEEDBACK_GENERIC");
            }
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    public static int getCapabilities(@NonNull AccessibilityServiceInfo accessibilityServiceInfo) {
        if (VERSION.SDK_INT >= 18) {
            return accessibilityServiceInfo.getCapabilities();
        }
        return accessibilityServiceInfo.getCanRetrieveWindowContent() ? 1 : 0;
    }
}
