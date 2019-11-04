package androidx.databinding.adapters;

import android.widget.AbsSeekBar;
import androidx.annotation.RestrictTo;
import androidx.annotation.RestrictTo.Scope;
import androidx.databinding.BindingMethod;
import androidx.databinding.BindingMethods;

@BindingMethods({@BindingMethod(attribute = "android:thumbTint", method = "setThumbTintList", type = AbsSeekBar.class)})
@RestrictTo({Scope.LIBRARY})
public class AbsSeekBarBindingAdapter {
}
