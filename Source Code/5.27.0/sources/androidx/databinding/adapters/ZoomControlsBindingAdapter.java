package androidx.databinding.adapters;

import android.widget.ZoomControls;
import androidx.annotation.RestrictTo;
import androidx.annotation.RestrictTo.Scope;
import androidx.databinding.BindingMethod;
import androidx.databinding.BindingMethods;

@BindingMethods({@BindingMethod(attribute = "android:onZoomIn", method = "setOnZoomInClickListener", type = ZoomControls.class), @BindingMethod(attribute = "android:onZoomOut", method = "setOnZoomOutClickListener", type = ZoomControls.class)})
@RestrictTo({Scope.LIBRARY})
public class ZoomControlsBindingAdapter {
}
