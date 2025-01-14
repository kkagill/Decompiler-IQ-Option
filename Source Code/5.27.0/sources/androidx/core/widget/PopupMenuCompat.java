package androidx.core.widget;

import android.os.Build.VERSION;
import android.view.View.OnTouchListener;
import android.widget.PopupMenu;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public final class PopupMenuCompat {
    private PopupMenuCompat() {
    }

    @Nullable
    public static OnTouchListener getDragToOpenListener(@NonNull Object obj) {
        return VERSION.SDK_INT >= 19 ? ((PopupMenu) obj).getDragToOpenListener() : null;
    }
}
