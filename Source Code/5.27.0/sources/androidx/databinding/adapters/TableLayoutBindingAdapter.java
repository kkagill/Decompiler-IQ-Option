package androidx.databinding.adapters;

import android.util.SparseBooleanArray;
import android.widget.TableLayout;
import androidx.annotation.RestrictTo;
import androidx.annotation.RestrictTo.Scope;
import androidx.databinding.BindingAdapter;
import java.util.regex.Pattern;

@RestrictTo({Scope.LIBRARY})
public class TableLayoutBindingAdapter {
    private static final int MAX_COLUMNS = 20;
    private static Pattern sColumnPattern = Pattern.compile("\\s*,\\s*");

    @BindingAdapter({"android:collapseColumns"})
    public static void setCollapseColumns(TableLayout tableLayout, CharSequence charSequence) {
        SparseBooleanArray parseColumns = parseColumns(charSequence);
        for (int i = 0; i < 20; i++) {
            boolean z = parseColumns.get(i, false);
            if (z != tableLayout.isColumnCollapsed(i)) {
                tableLayout.setColumnCollapsed(i, z);
            }
        }
    }

    @BindingAdapter({"android:shrinkColumns"})
    public static void setShrinkColumns(TableLayout tableLayout, CharSequence charSequence) {
        int i = 0;
        if (charSequence == null || charSequence.length() <= 0 || charSequence.charAt(0) != '*') {
            tableLayout.setShrinkAllColumns(false);
            SparseBooleanArray parseColumns = parseColumns(charSequence);
            int size = parseColumns.size();
            while (i < size) {
                int keyAt = parseColumns.keyAt(i);
                boolean valueAt = parseColumns.valueAt(i);
                if (valueAt) {
                    tableLayout.setColumnShrinkable(keyAt, valueAt);
                }
                i++;
            }
            return;
        }
        tableLayout.setShrinkAllColumns(true);
    }

    @BindingAdapter({"android:stretchColumns"})
    public static void setStretchColumns(TableLayout tableLayout, CharSequence charSequence) {
        int i = 0;
        if (charSequence == null || charSequence.length() <= 0 || charSequence.charAt(0) != '*') {
            tableLayout.setStretchAllColumns(false);
            SparseBooleanArray parseColumns = parseColumns(charSequence);
            int size = parseColumns.size();
            while (i < size) {
                int keyAt = parseColumns.keyAt(i);
                boolean valueAt = parseColumns.valueAt(i);
                if (valueAt) {
                    tableLayout.setColumnStretchable(keyAt, valueAt);
                }
                i++;
            }
            return;
        }
        tableLayout.setStretchAllColumns(true);
    }

    private static SparseBooleanArray parseColumns(CharSequence charSequence) {
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        if (charSequence == null) {
            return sparseBooleanArray;
        }
        for (String parseInt : sColumnPattern.split(charSequence)) {
            try {
                int parseInt2 = Integer.parseInt(parseInt);
                if (parseInt2 >= 0) {
                    sparseBooleanArray.put(parseInt2, true);
                }
            } catch (NumberFormatException unused) {
            }
        }
        return sparseBooleanArray;
    }
}
