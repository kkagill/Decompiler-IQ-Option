package com.facebook.share.a;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.FacebookRequestError;
import com.facebook.HttpMethod;
import com.facebook.common.a.b;
import com.facebook.common.a.c;
import com.facebook.common.a.d;
import com.facebook.common.a.e;
import com.facebook.internal.aa;
import com.facebook.j;
import com.facebook.share.b.g;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: DeviceShareDialogFragment */
public class a extends DialogFragment {
    private static ScheduledThreadPoolExecutor vt;
    private TextView AV;
    private ProgressBar Dk;
    private volatile a Dl;
    private volatile ScheduledFuture Dm;
    private com.facebook.share.b.a Dn;
    private Dialog xI;

    /* compiled from: DeviceShareDialogFragment */
    private static class a implements Parcelable {
        public static final Creator<a> CREATOR = new Creator<a>() {
            /* renamed from: D */
            public a createFromParcel(Parcel parcel) {
                return new a(parcel);
            }

            /* renamed from: al */
            public a[] newArray(int i) {
                return new a[i];
            }
        };
        private String Bo;
        private long Dp;

        public int describeContents() {
            return 0;
        }

        a() {
        }

        public String lr() {
            return this.Bo;
        }

        public void bu(String str) {
            this.Bo = str;
        }

        public long mk() {
            return this.Dp;
        }

        public void t(long j) {
            this.Dp = j;
        }

        protected a(Parcel parcel) {
            this.Bo = parcel.readString();
            this.Dp = parcel.readLong();
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.Bo);
            parcel.writeLong(this.Dp);
        }
    }

    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        if (bundle != null) {
            a aVar = (a) bundle.getParcelable("request_state");
            if (aVar != null) {
                a(aVar);
            }
        }
        return onCreateView;
    }

    @NonNull
    public Dialog onCreateDialog(Bundle bundle) {
        this.xI = new Dialog(getActivity(), e.com_facebook_auth_dialog);
        View inflate = getActivity().getLayoutInflater().inflate(c.com_facebook_device_auth_dialog_fragment, null);
        this.Dk = (ProgressBar) inflate.findViewById(b.progress_bar);
        this.AV = (TextView) inflate.findViewById(b.confirmation_code);
        ((Button) inflate.findViewById(b.cancel_button)).setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                a.this.xI.dismiss();
            }
        });
        ((TextView) inflate.findViewById(b.com_facebook_device_auth_instructions)).setText(Html.fromHtml(getString(d.com_facebook_device_auth_instructions)));
        this.xI.setContentView(inflate);
        mj();
        return this.xI;
    }

    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        if (this.Dm != null) {
            this.Dm.cancel(true);
        }
        c(-1, new Intent());
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (this.Dl != null) {
            bundle.putParcelable("request_state", this.Dl);
        }
    }

    private void c(int i, Intent intent) {
        if (this.Dl != null) {
            com.facebook.a.a.a.ba(this.Dl.lr());
        }
        FacebookRequestError facebookRequestError = (FacebookRequestError) intent.getParcelableExtra("error");
        if (facebookRequestError != null) {
            Toast.makeText(getContext(), facebookRequestError.getErrorMessage(), 0).show();
        }
        if (isAdded()) {
            FragmentActivity activity = getActivity();
            activity.setResult(i, intent);
            activity.finish();
        }
    }

    private void detach() {
        if (isAdded()) {
            getFragmentManager().beginTransaction().remove(this).commit();
        }
    }

    public void a(com.facebook.share.b.a aVar) {
        this.Dn = aVar;
    }

    private Bundle mi() {
        com.facebook.share.b.a aVar = this.Dn;
        if (aVar == null) {
            return null;
        }
        if (aVar instanceof com.facebook.share.b.c) {
            return d.a((com.facebook.share.b.c) aVar);
        }
        if (aVar instanceof g) {
            return d.b((g) aVar);
        }
        return null;
    }

    private void mj() {
        Bundle mi = mi();
        if (mi == null || mi.size() == 0) {
            a(new FacebookRequestError(0, "", "Failed to get share content"));
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(aa.kW());
        stringBuilder.append("|");
        stringBuilder.append(aa.kX());
        mi.putString("access_token", stringBuilder.toString());
        mi.putString("device_info", com.facebook.a.a.a.jC());
        new com.facebook.g(null, "device/share", mi, HttpMethod.POST, new com.facebook.g.b() {
            public void a(j jVar) {
                FacebookRequestError hG = jVar.hG();
                if (hG != null) {
                    a.this.a(hG);
                    return;
                }
                JSONObject hH = jVar.hH();
                a aVar = new a();
                try {
                    aVar.bu(hH.getString("user_code"));
                    aVar.t(hH.getLong("expires_in"));
                    a.this.a(aVar);
                } catch (JSONException unused) {
                    a.this.a(new FacebookRequestError(0, "", "Malformed server response"));
                }
            }
        }).ho();
    }

    private void a(FacebookRequestError facebookRequestError) {
        detach();
        Intent intent = new Intent();
        intent.putExtra("error", facebookRequestError);
        c(-1, intent);
    }

    private static synchronized ScheduledThreadPoolExecutor lw() {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor;
        synchronized (a.class) {
            if (vt == null) {
                vt = new ScheduledThreadPoolExecutor(1);
            }
            scheduledThreadPoolExecutor = vt;
        }
        return scheduledThreadPoolExecutor;
    }

    private void a(a aVar) {
        this.Dl = aVar;
        this.AV.setText(aVar.lr());
        this.AV.setVisibility(0);
        this.Dk.setVisibility(8);
        this.Dm = lw().schedule(new Runnable() {
            public void run() {
                a.this.xI.dismiss();
            }
        }, aVar.mk(), TimeUnit.SECONDS);
    }
}
