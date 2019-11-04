package com.iqoption.fragment.b;

import android.os.Bundle;
import androidx.fragment.app.DialogFragment;

/* compiled from: IQDialogFragment */
public class c extends DialogFragment {
    protected boolean ddo = false;

    public void onSaveInstanceState(Bundle bundle) {
        this.ddo = true;
        bundle.putString("WORKAROUND_FOR_BUG_19917_KEY", "WORKAROUND_FOR_BUG_19917_VALUE");
        super.onSaveInstanceState(bundle);
    }
}
