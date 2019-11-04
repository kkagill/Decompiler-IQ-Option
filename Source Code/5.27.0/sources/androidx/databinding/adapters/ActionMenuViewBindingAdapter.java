package androidx.databinding.adapters;

import android.widget.ActionMenuView;
import androidx.annotation.RestrictTo;
import androidx.annotation.RestrictTo.Scope;
import androidx.databinding.BindingMethod;
import androidx.databinding.BindingMethods;

@BindingMethods({@BindingMethod(attribute = "android:onMenuItemClick", method = "setOnMenuItemClickListener", type = ActionMenuView.class)})
@RestrictTo({Scope.LIBRARY})
public class ActionMenuViewBindingAdapter {
}
