package androidx.databinding.adapters;

import android.os.Build.VERSION;
import android.widget.TimePicker;
import android.widget.TimePicker.OnTimeChangedListener;
import androidx.annotation.RestrictTo;
import androidx.annotation.RestrictTo.Scope;
import androidx.databinding.BindingAdapter;
import androidx.databinding.InverseBindingAdapter;
import androidx.databinding.InverseBindingListener;

@RestrictTo({Scope.LIBRARY})
public class TimePickerBindingAdapter {
    @BindingAdapter({"android:hour"})
    public static void setHour(TimePicker timePicker, int i) {
        if (VERSION.SDK_INT >= 23) {
            if (timePicker.getHour() != i) {
                timePicker.setHour(i);
            }
        } else if (timePicker.getCurrentHour().intValue() != i) {
            timePicker.setCurrentHour(Integer.valueOf(i));
        }
    }

    @BindingAdapter({"android:minute"})
    public static void setMinute(TimePicker timePicker, int i) {
        if (VERSION.SDK_INT >= 23) {
            if (timePicker.getMinute() != i) {
                timePicker.setMinute(i);
            }
        } else if (timePicker.getCurrentMinute().intValue() != i) {
            timePicker.setCurrentHour(Integer.valueOf(i));
        }
    }

    @InverseBindingAdapter(attribute = "android:hour")
    public static int getHour(TimePicker timePicker) {
        if (VERSION.SDK_INT >= 23) {
            return timePicker.getHour();
        }
        Integer currentHour = timePicker.getCurrentHour();
        if (currentHour == null) {
            return 0;
        }
        return currentHour.intValue();
    }

    @InverseBindingAdapter(attribute = "android:minute")
    public static int getMinute(TimePicker timePicker) {
        if (VERSION.SDK_INT >= 23) {
            return timePicker.getMinute();
        }
        Integer currentMinute = timePicker.getCurrentMinute();
        if (currentMinute == null) {
            return 0;
        }
        return currentMinute.intValue();
    }

    @BindingAdapter(requireAll = false, value = {"android:onTimeChanged", "android:hourAttrChanged", "android:minuteAttrChanged"})
    public static void setListeners(TimePicker timePicker, final OnTimeChangedListener onTimeChangedListener, final InverseBindingListener inverseBindingListener, final InverseBindingListener inverseBindingListener2) {
        if (inverseBindingListener == null && inverseBindingListener2 == null) {
            timePicker.setOnTimeChangedListener(onTimeChangedListener);
        } else {
            timePicker.setOnTimeChangedListener(new OnTimeChangedListener() {
                public void onTimeChanged(TimePicker timePicker, int i, int i2) {
                    OnTimeChangedListener onTimeChangedListener = onTimeChangedListener;
                    if (onTimeChangedListener != null) {
                        onTimeChangedListener.onTimeChanged(timePicker, i, i2);
                    }
                    InverseBindingListener inverseBindingListener = inverseBindingListener;
                    if (inverseBindingListener != null) {
                        inverseBindingListener.onChange();
                    }
                    inverseBindingListener = inverseBindingListener2;
                    if (inverseBindingListener != null) {
                        inverseBindingListener.onChange();
                    }
                }
            });
        }
    }
}
