package com.facebook.login;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import androidx.fragment.app.FragmentActivity;
import com.facebook.AccessTokenSource;
import com.facebook.a;
import com.facebook.login.LoginClient.Result;
import java.util.Collection;
import java.util.Date;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* compiled from: DeviceAuthMethodHandler */
class c extends k {
    public static final Creator<c> CREATOR = new Creator() {
        /* renamed from: v */
        public c createFromParcel(Parcel parcel) {
            return new c(parcel);
        }

        /* renamed from: ad */
        public c[] newArray(int i) {
            return new c[i];
        }
    };
    private static ScheduledThreadPoolExecutor vt;

    public int describeContents() {
        return 0;
    }

    /* Access modifiers changed, original: 0000 */
    public String lg() {
        return "device_auth";
    }

    c(LoginClient loginClient) {
        super(loginClient);
    }

    /* Access modifiers changed, original: 0000 */
    public boolean a(com.facebook.login.LoginClient.c cVar) {
        c(cVar);
        return true;
    }

    private void c(com.facebook.login.LoginClient.c cVar) {
        FragmentActivity activity = this.Cm.getActivity();
        if (activity != null && !activity.isFinishing()) {
            b lv = lv();
            lv.show(activity.getSupportFragmentManager(), "login_with_facebook");
            lv.b(cVar);
        }
    }

    /* Access modifiers changed, original: protected */
    public b lv() {
        return new b();
    }

    public void onCancel() {
        this.Cm.a(Result.a(this.Cm.lx(), "User canceled log in."));
    }

    public void a(Exception exception) {
        this.Cm.a(Result.a(this.Cm.lx(), null, exception.getMessage()));
    }

    public void a(String str, String str2, String str3, Collection<String> collection, Collection<String> collection2, Collection<String> collection3, AccessTokenSource accessTokenSource, Date date, Date date2, Date date3) {
        this.Cm.a(Result.a(this.Cm.lx(), new a(str, str2, str3, collection, collection2, collection3, accessTokenSource, date, date2, date3)));
    }

    public static synchronized ScheduledThreadPoolExecutor lw() {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor;
        synchronized (c.class) {
            if (vt == null) {
                vt = new ScheduledThreadPoolExecutor(1);
            }
            scheduledThreadPoolExecutor = vt;
        }
        return scheduledThreadPoolExecutor;
    }

    protected c(Parcel parcel) {
        super(parcel);
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
    }
}
