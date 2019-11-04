package androidx.databinding.adapters;

import android.widget.Chronometer;
import androidx.annotation.RestrictTo;
import androidx.annotation.RestrictTo.Scope;
import androidx.databinding.BindingMethod;
import androidx.databinding.BindingMethods;

@BindingMethods({@BindingMethod(attribute = "android:onChronometerTick", method = "setOnChronometerTickListener", type = Chronometer.class)})
@RestrictTo({Scope.LIBRARY})
public class ChronometerBindingAdapter {
}
