package androidx.databinding.adapters;

import android.widget.FrameLayout;
import androidx.annotation.RestrictTo;
import androidx.annotation.RestrictTo.Scope;
import androidx.databinding.BindingMethod;
import androidx.databinding.BindingMethods;

@BindingMethods({@BindingMethod(attribute = "android:foregroundTint", method = "setForegroundTintList", type = FrameLayout.class)})
@RestrictTo({Scope.LIBRARY})
public class FrameLayoutBindingAdapter {
}
