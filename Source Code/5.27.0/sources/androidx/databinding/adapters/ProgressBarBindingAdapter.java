package androidx.databinding.adapters;

import android.widget.ProgressBar;
import androidx.annotation.RestrictTo;
import androidx.annotation.RestrictTo.Scope;
import androidx.databinding.BindingMethod;
import androidx.databinding.BindingMethods;

@BindingMethods({@BindingMethod(attribute = "android:indeterminateTint", method = "setIndeterminateTintList", type = ProgressBar.class), @BindingMethod(attribute = "android:progressTint", method = "setProgressTintList", type = ProgressBar.class), @BindingMethod(attribute = "android:secondaryProgressTint", method = "setSecondaryProgressTintList", type = ProgressBar.class)})
@RestrictTo({Scope.LIBRARY})
public class ProgressBarBindingAdapter {
}
