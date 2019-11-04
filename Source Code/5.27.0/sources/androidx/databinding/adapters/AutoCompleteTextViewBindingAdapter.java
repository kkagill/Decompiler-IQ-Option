package androidx.databinding.adapters;

import android.widget.AutoCompleteTextView;
import android.widget.AutoCompleteTextView.Validator;
import androidx.annotation.RestrictTo;
import androidx.annotation.RestrictTo.Scope;
import androidx.databinding.BindingAdapter;
import androidx.databinding.BindingMethod;
import androidx.databinding.BindingMethods;
import androidx.databinding.adapters.AdapterViewBindingAdapter.OnItemSelected;
import androidx.databinding.adapters.AdapterViewBindingAdapter.OnItemSelectedComponentListener;
import androidx.databinding.adapters.AdapterViewBindingAdapter.OnNothingSelected;

@BindingMethods({@BindingMethod(attribute = "android:completionThreshold", method = "setThreshold", type = AutoCompleteTextView.class), @BindingMethod(attribute = "android:popupBackground", method = "setDropDownBackgroundDrawable", type = AutoCompleteTextView.class), @BindingMethod(attribute = "android:onDismiss", method = "setOnDismissListener", type = AutoCompleteTextView.class), @BindingMethod(attribute = "android:onItemClick", method = "setOnItemClickListener", type = AutoCompleteTextView.class)})
@RestrictTo({Scope.LIBRARY})
public class AutoCompleteTextViewBindingAdapter {

    public interface FixText {
        CharSequence fixText(CharSequence charSequence);
    }

    public interface IsValid {
        boolean isValid(CharSequence charSequence);
    }

    @BindingAdapter(requireAll = false, value = {"android:fixText", "android:isValid"})
    public static void setValidator(AutoCompleteTextView autoCompleteTextView, final FixText fixText, final IsValid isValid) {
        if (fixText == null && isValid == null) {
            autoCompleteTextView.setValidator(null);
        } else {
            autoCompleteTextView.setValidator(new Validator() {
                public boolean isValid(CharSequence charSequence) {
                    IsValid isValid = isValid;
                    return isValid != null ? isValid.isValid(charSequence) : true;
                }

                public CharSequence fixText(CharSequence charSequence) {
                    FixText fixText = fixText;
                    return fixText != null ? fixText.fixText(charSequence) : charSequence;
                }
            });
        }
    }

    @BindingAdapter(requireAll = false, value = {"android:onItemSelected", "android:onNothingSelected"})
    public static void setOnItemSelectedListener(AutoCompleteTextView autoCompleteTextView, OnItemSelected onItemSelected, OnNothingSelected onNothingSelected) {
        if (onItemSelected == null && onNothingSelected == null) {
            autoCompleteTextView.setOnItemSelectedListener(null);
        } else {
            autoCompleteTextView.setOnItemSelectedListener(new OnItemSelectedComponentListener(onItemSelected, onNothingSelected, null));
        }
    }
}
