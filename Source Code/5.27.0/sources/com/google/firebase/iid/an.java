package com.google.firebase.iid;

import android.os.Build.VERSION;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.util.Log;

public class an implements Parcelable {
    public static final Creator<an> CREATOR = new am();
    private Messenger acZ;
    private ax aeb;

    public static final class a extends ClassLoader {
        /* Access modifiers changed, original: protected|final */
        public final Class<?> loadClass(String str, boolean z) {
            if (!"com.google.android.gms.iid.MessengerCompat".equals(str)) {
                return super.loadClass(str, z);
            }
            if (FirebaseInstanceId.zzm()) {
                Log.d("FirebaseInstanceId", "Using renamed FirebaseIidMessengerCompat class");
            }
            return an.class;
        }
    }

    public an(IBinder iBinder) {
        if (VERSION.SDK_INT >= 21) {
            this.acZ = new Messenger(iBinder);
        } else {
            this.aeb = new aw(iBinder);
        }
    }

    public int describeContents() {
        return 0;
    }

    public final void send(Message message) {
        Messenger messenger = this.acZ;
        if (messenger != null) {
            messenger.send(message);
        } else {
            this.aeb.send(message);
        }
    }

    private final IBinder getBinder() {
        Messenger messenger = this.acZ;
        return messenger != null ? messenger.getBinder() : this.aeb.asBinder();
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            return getBinder().equals(((an) obj).getBinder());
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public int hashCode() {
        return getBinder().hashCode();
    }

    public void writeToParcel(Parcel parcel, int i) {
        Messenger messenger = this.acZ;
        if (messenger != null) {
            parcel.writeStrongBinder(messenger.getBinder());
        } else {
            parcel.writeStrongBinder(this.aeb.asBinder());
        }
    }
}
