package com.facebook.login;

import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.Html;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;
import com.facebook.AccessTokenSource;
import com.facebook.FacebookActivity;
import com.facebook.FacebookException;
import com.facebook.FacebookRequestError;
import com.facebook.HttpMethod;
import com.facebook.common.a.d;
import com.facebook.common.a.e;
import com.facebook.f;
import com.facebook.g;
import com.facebook.h;
import com.facebook.internal.FetchedAppSettingsManager;
import com.facebook.internal.SmartLoginOption;
import com.facebook.internal.aa;
import com.facebook.internal.z;
import com.facebook.j;
import com.facebook.login.LoginClient.c;
import com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: DeviceAuthDialog */
public class b extends DialogFragment {
    private View AP;
    private TextView AV;
    private TextView AY;
    private c Ba;
    private AtomicBoolean Bb = new AtomicBoolean();
    private volatile h Bc;
    private volatile ScheduledFuture Bd;
    private volatile a Be;
    private boolean Bf = false;
    private boolean Bg = false;
    private c Bh = null;
    private Dialog xI;

    /* compiled from: DeviceAuthDialog */
    private static class a implements Parcelable {
        public static final Creator<a> CREATOR = new Creator<a>() {
            /* renamed from: u */
            public a createFromParcel(Parcel parcel) {
                return new a(parcel);
            }

            /* renamed from: ac */
            public a[] newArray(int i) {
                return new a[i];
            }
        };
        private String Bn;
        private String Bo;
        private String Bp;
        private long Bq;
        private long Br;

        public int describeContents() {
            return 0;
        }

        a() {
        }

        public String lq() {
            return this.Bn;
        }

        public String lr() {
            return this.Bo;
        }

        public void bu(String str) {
            this.Bo = str;
            this.Bn = String.format(Locale.ENGLISH, "https://facebook.com/device?user_code=%1$s&qr=1", new Object[]{str});
        }

        public String ls() {
            return this.Bp;
        }

        public void bv(String str) {
            this.Bp = str;
        }

        public long lt() {
            return this.Bq;
        }

        public void r(long j) {
            this.Bq = j;
        }

        public void s(long j) {
            this.Br = j;
        }

        protected a(Parcel parcel) {
            this.Bn = parcel.readString();
            this.Bo = parcel.readString();
            this.Bp = parcel.readString();
            this.Bq = parcel.readLong();
            this.Br = parcel.readLong();
        }

        public boolean lu() {
            boolean z = false;
            if (this.Br == 0) {
                return false;
            }
            if ((new Date().getTime() - this.Br) - (this.Bq * 1000) < 0) {
                z = true;
            }
            return z;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.Bn);
            parcel.writeString(this.Bo);
            parcel.writeString(this.Bp);
            parcel.writeLong(this.Bq);
            parcel.writeLong(this.Br);
        }
    }

    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        this.Ba = (c) ((h) ((FacebookActivity) getActivity()).gI()).lW().lB();
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
        boolean z = com.facebook.a.a.a.isAvailable() && !this.Bg;
        this.xI.setContentView(I(z));
        return this.xI;
    }

    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        if (!this.Bf) {
            onCancel();
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (this.Be != null) {
            bundle.putParcelable("request_state", this.Be);
        }
    }

    public void onDestroy() {
        this.Bf = true;
        this.Bb.set(true);
        super.onDestroy();
        if (this.Bc != null) {
            this.Bc.cancel(true);
        }
        if (this.Bd != null) {
            this.Bd.cancel(true);
        }
    }

    public void b(c cVar) {
        this.Bh = cVar;
        Bundle bundle = new Bundle();
        bundle.putString("scope", TextUtils.join(",", cVar.gj()));
        String lQ = cVar.lQ();
        if (lQ != null) {
            bundle.putString("redirect_uri", lQ);
        }
        String lR = cVar.lR();
        if (lR != null) {
            bundle.putString("target_user_id", lR);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(aa.kW());
        stringBuilder.append("|");
        stringBuilder.append(aa.kX());
        bundle.putString("access_token", stringBuilder.toString());
        bundle.putString("device_info", com.facebook.a.a.a.jC());
        new g(null, "device/login", bundle, HttpMethod.POST, new com.facebook.g.b() {
            public void a(j jVar) {
                if (!b.this.Bf) {
                    if (jVar.hG() != null) {
                        b.this.b(jVar.hG().gO());
                        return;
                    }
                    JSONObject hH = jVar.hH();
                    a aVar = new a();
                    try {
                        aVar.bu(hH.getString("user_code"));
                        aVar.bv(hH.getString("code"));
                        aVar.r(hH.getLong("interval"));
                        b.this.a(aVar);
                    } catch (JSONException e) {
                        b.this.b(new FacebookException(e));
                    }
                }
            }
        }).ho();
    }

    private void a(a aVar) {
        this.Be = aVar;
        this.AV.setText(aVar.lr());
        this.AY.setCompoundDrawablesWithIntrinsicBounds(null, new BitmapDrawable(getResources(), com.facebook.a.a.a.aZ(aVar.lq())), null, null);
        this.AV.setVisibility(0);
        this.AP.setVisibility(8);
        if (!this.Bg && com.facebook.a.a.a.aY(aVar.lr())) {
            new com.facebook.appevents.g(getContext()).aR("fb_smart_login_service");
        }
        if (aVar.lu()) {
            lo();
        } else {
            ln();
        }
    }

    /* Access modifiers changed, original: protected */
    public View I(boolean z) {
        View inflate = getActivity().getLayoutInflater().inflate(J(z), null);
        this.AP = inflate.findViewById(com.facebook.common.a.b.progress_bar);
        this.AV = (TextView) inflate.findViewById(com.facebook.common.a.b.confirmation_code);
        ((Button) inflate.findViewById(com.facebook.common.a.b.cancel_button)).setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                b.this.onCancel();
            }
        });
        this.AY = (TextView) inflate.findViewById(com.facebook.common.a.b.com_facebook_device_auth_instructions);
        this.AY.setText(Html.fromHtml(getString(d.com_facebook_device_auth_instructions)));
        return inflate;
    }

    /* Access modifiers changed, original: protected */
    @LayoutRes
    public int J(boolean z) {
        return z ? com.facebook.common.a.c.com_facebook_smart_device_dialog_fragment : com.facebook.common.a.c.com_facebook_device_auth_dialog_fragment;
    }

    private void ln() {
        this.Be.s(new Date().getTime());
        this.Bc = lp().ho();
    }

    private void lo() {
        this.Bd = c.lw().schedule(new Runnable() {
            public void run() {
                b.this.ln();
            }
        }, this.Be.lt(), TimeUnit.SECONDS);
    }

    private g lp() {
        Bundle bundle = new Bundle();
        bundle.putString("code", this.Be.ls());
        return new g(null, "device/login_status", bundle, HttpMethod.POST, new com.facebook.g.b() {
            public void a(j jVar) {
                if (!b.this.Bb.get()) {
                    FacebookRequestError hG = jVar.hG();
                    if (hG != null) {
                        int gM = hG.gM();
                        if (gM != 1349152) {
                            switch (gM) {
                                case 1349172:
                                case 1349174:
                                    b.this.lo();
                                    break;
                                case 1349173:
                                    b.this.onCancel();
                                    break;
                                default:
                                    b.this.b(jVar.hG().gO());
                                    break;
                            }
                        }
                        if (b.this.Be != null) {
                            com.facebook.a.a.a.ba(b.this.Be.lr());
                        }
                        if (b.this.Bh != null) {
                            b bVar = b.this;
                            bVar.b(bVar.Bh);
                        } else {
                            b.this.onCancel();
                        }
                        return;
                    }
                    try {
                        JSONObject hH = jVar.hH();
                        b.this.a(hH.getString("access_token"), Long.valueOf(hH.getLong("expires_in")), Long.valueOf(hH.optLong("data_access_expiration_time")));
                    } catch (JSONException e) {
                        b.this.b(new FacebookException(e));
                    }
                }
            }
        });
    }

    private void a(String str, com.facebook.internal.z.b bVar, String str2, String str3, Date date, Date date2) {
        String string = getResources().getString(d.com_facebook_smart_login_confirmation_title);
        String string2 = getResources().getString(d.com_facebook_smart_login_confirmation_continue_as);
        String string3 = getResources().getString(d.com_facebook_smart_login_confirmation_cancel);
        string2 = String.format(string2, new Object[]{str3});
        Builder builder = new Builder(getContext());
        final String str4 = str;
        final com.facebook.internal.z.b bVar2 = bVar;
        final String str5 = str2;
        final Date date3 = date;
        final Date date4 = date2;
        builder.setMessage(string).setCancelable(true).setNegativeButton(string2, new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
                b.this.a(str4, bVar2, str5, date3, date4);
            }
        }).setPositiveButton(string3, new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
                b.this.xI.setContentView(b.this.I(false));
                b bVar = b.this;
                bVar.b(bVar.Bh);
            }
        });
        builder.create().show();
    }

    private void a(String str, Long l, Long l2) {
        Bundle bundle = new Bundle();
        bundle.putString("fields", "id,permissions,name");
        Date date = null;
        final Date date2 = l.longValue() != 0 ? new Date(new Date().getTime() + (l.longValue() * 1000)) : null;
        if (!(l2.longValue() == 0 || l2 == null)) {
            date = new Date(l2.longValue() * 1000);
        }
        final String str2 = str;
        new g(new com.facebook.a(str, f.go(), "0", null, null, null, null, date2, null, date), "me", bundle, HttpMethod.GET, new com.facebook.g.b() {
            public void a(j jVar) {
                if (!b.this.Bb.get()) {
                    if (jVar.hG() != null) {
                        b.this.b(jVar.hG().gO());
                        return;
                    }
                    try {
                        JSONObject hH = jVar.hH();
                        String string = hH.getString("id");
                        com.facebook.internal.z.b k = z.k(hH);
                        String string2 = hH.getString(ConditionalUserProperty.NAME);
                        com.facebook.a.a.a.ba(b.this.Be.lr());
                        if (!FetchedAppSettingsManager.bg(f.go()).jP().contains(SmartLoginOption.RequireConfirm) || b.this.Bg) {
                            b.this.a(string, k, str2, date2, date);
                            return;
                        }
                        b.this.Bg = true;
                        b.this.a(string, k, str2, string2, date2, date);
                    } catch (JSONException e) {
                        b.this.b(new FacebookException(e));
                    }
                }
            }
        }).ho();
    }

    private void a(String str, com.facebook.internal.z.b bVar, String str2, Date date, Date date2) {
        this.Ba.a(str2, f.go(), str, bVar.kS(), bVar.kT(), bVar.kU(), AccessTokenSource.DEVICE_AUTH, date, null, date2);
        this.xI.dismiss();
    }

    /* Access modifiers changed, original: protected */
    public void b(FacebookException facebookException) {
        if (this.Bb.compareAndSet(false, true)) {
            if (this.Be != null) {
                com.facebook.a.a.a.ba(this.Be.lr());
            }
            this.Ba.a((Exception) facebookException);
            this.xI.dismiss();
        }
    }

    /* Access modifiers changed, original: protected */
    public void onCancel() {
        if (this.Bb.compareAndSet(false, true)) {
            if (this.Be != null) {
                com.facebook.a.a.a.ba(this.Be.lr());
            }
            c cVar = this.Ba;
            if (cVar != null) {
                cVar.onCancel();
            }
            this.xI.dismiss();
        }
    }
}
