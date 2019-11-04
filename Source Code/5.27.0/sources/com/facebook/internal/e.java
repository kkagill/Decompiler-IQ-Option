package com.facebook.internal;

import android.app.Dialog;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.FacebookException;
import com.facebook.f;
import com.facebook.internal.ab.a;
import com.facebook.internal.ab.c;

/* compiled from: FacebookDialogFragment */
public class e extends DialogFragment {
    private Dialog xI;

    public void a(Dialog dialog) {
        this.xI = dialog;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (this.xI == null) {
            Dialog c;
            FragmentActivity activity = getActivity();
            Bundle f = u.f(activity.getIntent());
            String str = "FacebookDialogFragment";
            if (f.getBoolean("is_fallback", false)) {
                String string = f.getString("url");
                if (z.aB(string)) {
                    z.G(str, "Cannot start a fallback WebDialog with an empty/missing 'url'");
                    activity.finish();
                    return;
                }
                c = h.c(activity, string, String.format("fb%s://bridge/", new Object[]{f.go()}));
                c.a(new c() {
                    public void b(Bundle bundle, FacebookException facebookException) {
                        e.this.k(bundle);
                    }
                });
            } else {
                String string2 = f.getString("action");
                f = f.getBundle("params");
                if (z.aB(string2)) {
                    z.G(str, "Cannot start a WebDialog with an empty/missing 'actionName'");
                    activity.finish();
                    return;
                }
                c = new a(activity, string2, f).b(new c() {
                    public void b(Bundle bundle, FacebookException facebookException) {
                        e.this.a(bundle, facebookException);
                    }
                }).ld();
            }
            this.xI = c;
        }
    }

    @NonNull
    public Dialog onCreateDialog(Bundle bundle) {
        if (this.xI == null) {
            a(null, null);
            setShowsDialog(false);
        }
        return this.xI;
    }

    public void onResume() {
        super.onResume();
        Dialog dialog = this.xI;
        if (dialog instanceof ab) {
            ((ab) dialog).lb();
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if ((this.xI instanceof ab) && isResumed()) {
            ((ab) this.xI).lb();
        }
    }

    public void onDestroyView() {
        if (getDialog() != null && getRetainInstance()) {
            getDialog().setDismissMessage(null);
        }
        super.onDestroyView();
    }

    private void a(Bundle bundle, FacebookException facebookException) {
        FragmentActivity activity = getActivity();
        activity.setResult(facebookException == null ? -1 : 0, u.a(activity.getIntent(), bundle, facebookException));
        activity.finish();
    }

    private void k(Bundle bundle) {
        FragmentActivity activity = getActivity();
        Intent intent = new Intent();
        if (bundle == null) {
            bundle = new Bundle();
        }
        intent.putExtras(bundle);
        activity.setResult(-1, intent);
        activity.finish();
    }
}
