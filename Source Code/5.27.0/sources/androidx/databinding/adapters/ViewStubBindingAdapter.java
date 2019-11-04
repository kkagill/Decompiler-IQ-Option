package androidx.databinding.adapters;

import android.view.ViewStub;
import android.view.ViewStub.OnInflateListener;
import androidx.annotation.RestrictTo;
import androidx.annotation.RestrictTo.Scope;
import androidx.databinding.BindingAdapter;
import androidx.databinding.BindingMethod;
import androidx.databinding.BindingMethods;
import androidx.databinding.Untaggable;
import androidx.databinding.ViewStubProxy;

@BindingMethods({@BindingMethod(attribute = "android:layout", method = "setLayoutResource", type = ViewStub.class)})
@RestrictTo({Scope.LIBRARY})
@Untaggable({"android.view.ViewStub"})
public class ViewStubBindingAdapter {
    @BindingAdapter({"android:onInflate"})
    public static void setOnInflateListener(ViewStubProxy viewStubProxy, OnInflateListener onInflateListener) {
        viewStubProxy.setOnInflateListener(onInflateListener);
    }
}
