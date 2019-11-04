package com.facebook.login;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.LayoutRes;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.common.a;
import com.facebook.login.LoginClient.Result;
import com.facebook.login.LoginClient.b;
import com.facebook.login.LoginClient.c;

/* compiled from: LoginFragment */
public class h extends Fragment {
    private c Ck;
    private String Cl;
    private LoginClient Cm;

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.Cm = (LoginClient) bundle.getParcelable("loginClient");
            this.Cm.a((Fragment) this);
        } else {
            this.Cm = lU();
        }
        this.Cm.a(new b() {
            public void e(Result result) {
                h.this.f(result);
            }
        });
        FragmentActivity activity = getActivity();
        if (activity != null) {
            g(activity);
            Intent intent = activity.getIntent();
            if (intent != null) {
                bundle = intent.getBundleExtra("com.facebook.LoginFragment:Request");
                if (bundle != null) {
                    this.Ck = (c) bundle.getParcelable("request");
                }
            }
        }
    }

    /* Access modifiers changed, original: protected */
    public LoginClient lU() {
        return new LoginClient((Fragment) this);
    }

    public void onDestroy() {
        this.Cm.lA();
        super.onDestroy();
    }

    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        View inflate = layoutInflater.inflate(lV(), viewGroup, false);
        final View findViewById = inflate.findViewById(a.b.com_facebook_login_fragment_progress_bar);
        this.Cm.a(new a() {
            public void lK() {
                findViewById.setVisibility(0);
            }

            public void lL() {
                findViewById.setVisibility(8);
            }
        });
        return inflate;
    }

    /* Access modifiers changed, original: protected */
    @LayoutRes
    public int lV() {
        return a.c.com_facebook_login_fragment;
    }

    private void f(Result result) {
        this.Ck = null;
        int i = result.Ch == Code.CANCEL ? 0 : -1;
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.facebook.LoginFragment:Result", result);
        Intent intent = new Intent();
        intent.putExtras(bundle);
        if (isAdded()) {
            getActivity().setResult(i, intent);
            getActivity().finish();
        }
    }

    public void onResume() {
        super.onResume();
        if (this.Cl == null) {
            Log.e("LoginFragment", "Cannot call LoginFragment with a null calling package. This can occur if the launchMode of the caller is singleInstance.");
            getActivity().finish();
            return;
        }
        this.Cm.d(this.Ck);
    }

    public void onPause() {
        View view;
        super.onPause();
        if (getView() == null) {
            view = null;
        } else {
            view = getView().findViewById(a.b.com_facebook_login_fragment_progress_bar);
        }
        if (view != null) {
            view.setVisibility(8);
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        this.Cm.onActivityResult(i, i2, intent);
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("loginClient", this.Cm);
    }

    private void g(Activity activity) {
        ComponentName callingActivity = activity.getCallingActivity();
        if (callingActivity != null) {
            this.Cl = callingActivity.getPackageName();
        }
    }

    /* Access modifiers changed, original: 0000 */
    public LoginClient lW() {
        return this.Cm;
    }
}
