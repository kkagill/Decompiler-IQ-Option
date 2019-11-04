package com.google.android.gms.dynamic;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.common.zzb;
import com.google.android.gms.internal.common.zzc;

public interface IFragmentWrapper extends IInterface {

    public static abstract class Stub extends zzb implements IFragmentWrapper {

        public static class zza extends com.google.android.gms.internal.common.zza implements IFragmentWrapper {
            zza(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.dynamic.IFragmentWrapper");
            }

            public final IObjectWrapper zzae() {
                Parcel zza = zza(2, zza());
                IObjectWrapper asInterface = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(zza.readStrongBinder());
                zza.recycle();
                return asInterface;
            }

            public final Bundle getArguments() {
                Parcel zza = zza(3, zza());
                Bundle bundle = (Bundle) zzc.zza(zza, Bundle.CREATOR);
                zza.recycle();
                return bundle;
            }

            public final int getId() {
                Parcel zza = zza(4, zza());
                int readInt = zza.readInt();
                zza.recycle();
                return readInt;
            }

            public final IFragmentWrapper zzaf() {
                Parcel zza = zza(5, zza());
                IFragmentWrapper asInterface = Stub.asInterface(zza.readStrongBinder());
                zza.recycle();
                return asInterface;
            }

            public final IObjectWrapper zzag() {
                Parcel zza = zza(6, zza());
                IObjectWrapper asInterface = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(zza.readStrongBinder());
                zza.recycle();
                return asInterface;
            }

            public final boolean getRetainInstance() {
                Parcel zza = zza(7, zza());
                boolean zza2 = zzc.zza(zza);
                zza.recycle();
                return zza2;
            }

            public final String getTag() {
                Parcel zza = zza(8, zza());
                String readString = zza.readString();
                zza.recycle();
                return readString;
            }

            public final IFragmentWrapper zzah() {
                Parcel zza = zza(9, zza());
                IFragmentWrapper asInterface = Stub.asInterface(zza.readStrongBinder());
                zza.recycle();
                return asInterface;
            }

            public final int getTargetRequestCode() {
                Parcel zza = zza(10, zza());
                int readInt = zza.readInt();
                zza.recycle();
                return readInt;
            }

            public final boolean getUserVisibleHint() {
                Parcel zza = zza(11, zza());
                boolean zza2 = zzc.zza(zza);
                zza.recycle();
                return zza2;
            }

            public final IObjectWrapper zzai() {
                Parcel zza = zza(12, zza());
                IObjectWrapper asInterface = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(zza.readStrongBinder());
                zza.recycle();
                return asInterface;
            }

            public final boolean isAdded() {
                Parcel zza = zza(13, zza());
                boolean zza2 = zzc.zza(zza);
                zza.recycle();
                return zza2;
            }

            public final boolean isDetached() {
                Parcel zza = zza(14, zza());
                boolean zza2 = zzc.zza(zza);
                zza.recycle();
                return zza2;
            }

            public final boolean isHidden() {
                Parcel zza = zza(15, zza());
                boolean zza2 = zzc.zza(zza);
                zza.recycle();
                return zza2;
            }

            public final boolean isInLayout() {
                Parcel zza = zza(16, zza());
                boolean zza2 = zzc.zza(zza);
                zza.recycle();
                return zza2;
            }

            public final boolean isRemoving() {
                Parcel zza = zza(17, zza());
                boolean zza2 = zzc.zza(zza);
                zza.recycle();
                return zza2;
            }

            public final boolean isResumed() {
                Parcel zza = zza(18, zza());
                boolean zza2 = zzc.zza(zza);
                zza.recycle();
                return zza2;
            }

            public final boolean isVisible() {
                Parcel zza = zza(19, zza());
                boolean zza2 = zzc.zza(zza);
                zza.recycle();
                return zza2;
            }

            public final void zza(IObjectWrapper iObjectWrapper) {
                Parcel zza = zza();
                zzc.zza(zza, (IInterface) iObjectWrapper);
                zzb(20, zza);
            }

            public final void setHasOptionsMenu(boolean z) {
                Parcel zza = zza();
                zzc.writeBoolean(zza, z);
                zzb(21, zza);
            }

            public final void setMenuVisibility(boolean z) {
                Parcel zza = zza();
                zzc.writeBoolean(zza, z);
                zzb(22, zza);
            }

            public final void setRetainInstance(boolean z) {
                Parcel zza = zza();
                zzc.writeBoolean(zza, z);
                zzb(23, zza);
            }

            public final void setUserVisibleHint(boolean z) {
                Parcel zza = zza();
                zzc.writeBoolean(zza, z);
                zzb(24, zza);
            }

            public final void startActivity(Intent intent) {
                Parcel zza = zza();
                zzc.zza(zza, (Parcelable) intent);
                zzb(25, zza);
            }

            public final void startActivityForResult(Intent intent, int i) {
                Parcel zza = zza();
                zzc.zza(zza, (Parcelable) intent);
                zza.writeInt(i);
                zzb(26, zza);
            }

            public final void zzb(IObjectWrapper iObjectWrapper) {
                Parcel zza = zza();
                zzc.zza(zza, (IInterface) iObjectWrapper);
                zzb(27, zza);
            }
        }

        public Stub() {
            super("com.google.android.gms.dynamic.IFragmentWrapper");
        }

        public static IFragmentWrapper asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IFragmentWrapper");
            if (queryLocalInterface instanceof IFragmentWrapper) {
                return (IFragmentWrapper) queryLocalInterface;
            }
            return new zza(iBinder);
        }

        /* Access modifiers changed, original: protected|final */
        public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) {
            IInterface zzae;
            boolean retainInstance;
            switch (i) {
                case 2:
                    zzae = zzae();
                    parcel2.writeNoException();
                    zzc.zza(parcel2, zzae);
                    break;
                case 3:
                    Bundle arguments = getArguments();
                    parcel2.writeNoException();
                    zzc.zzb(parcel2, arguments);
                    break;
                case 4:
                    i = getId();
                    parcel2.writeNoException();
                    parcel2.writeInt(i);
                    break;
                case 5:
                    zzae = zzaf();
                    parcel2.writeNoException();
                    zzc.zza(parcel2, zzae);
                    break;
                case 6:
                    zzae = zzag();
                    parcel2.writeNoException();
                    zzc.zza(parcel2, zzae);
                    break;
                case 7:
                    retainInstance = getRetainInstance();
                    parcel2.writeNoException();
                    zzc.writeBoolean(parcel2, retainInstance);
                    break;
                case 8:
                    String tag = getTag();
                    parcel2.writeNoException();
                    parcel2.writeString(tag);
                    break;
                case 9:
                    zzae = zzah();
                    parcel2.writeNoException();
                    zzc.zza(parcel2, zzae);
                    break;
                case 10:
                    i = getTargetRequestCode();
                    parcel2.writeNoException();
                    parcel2.writeInt(i);
                    break;
                case 11:
                    retainInstance = getUserVisibleHint();
                    parcel2.writeNoException();
                    zzc.writeBoolean(parcel2, retainInstance);
                    break;
                case 12:
                    zzae = zzai();
                    parcel2.writeNoException();
                    zzc.zza(parcel2, zzae);
                    break;
                case 13:
                    retainInstance = isAdded();
                    parcel2.writeNoException();
                    zzc.writeBoolean(parcel2, retainInstance);
                    break;
                case 14:
                    retainInstance = isDetached();
                    parcel2.writeNoException();
                    zzc.writeBoolean(parcel2, retainInstance);
                    break;
                case 15:
                    retainInstance = isHidden();
                    parcel2.writeNoException();
                    zzc.writeBoolean(parcel2, retainInstance);
                    break;
                case 16:
                    retainInstance = isInLayout();
                    parcel2.writeNoException();
                    zzc.writeBoolean(parcel2, retainInstance);
                    break;
                case 17:
                    retainInstance = isRemoving();
                    parcel2.writeNoException();
                    zzc.writeBoolean(parcel2, retainInstance);
                    break;
                case 18:
                    retainInstance = isResumed();
                    parcel2.writeNoException();
                    zzc.writeBoolean(parcel2, retainInstance);
                    break;
                case 19:
                    retainInstance = isVisible();
                    parcel2.writeNoException();
                    zzc.writeBoolean(parcel2, retainInstance);
                    break;
                case 20:
                    zza(com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    break;
                case 21:
                    setHasOptionsMenu(zzc.zza(parcel));
                    parcel2.writeNoException();
                    break;
                case 22:
                    setMenuVisibility(zzc.zza(parcel));
                    parcel2.writeNoException();
                    break;
                case 23:
                    setRetainInstance(zzc.zza(parcel));
                    parcel2.writeNoException();
                    break;
                case 24:
                    setUserVisibleHint(zzc.zza(parcel));
                    parcel2.writeNoException();
                    break;
                case 25:
                    startActivity((Intent) zzc.zza(parcel, Intent.CREATOR));
                    parcel2.writeNoException();
                    break;
                case 26:
                    startActivityForResult((Intent) zzc.zza(parcel, Intent.CREATOR), parcel.readInt());
                    parcel2.writeNoException();
                    break;
                case 27:
                    zzb(com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    break;
                default:
                    return false;
            }
            return true;
        }
    }

    Bundle getArguments();

    int getId();

    boolean getRetainInstance();

    String getTag();

    int getTargetRequestCode();

    boolean getUserVisibleHint();

    boolean isAdded();

    boolean isDetached();

    boolean isHidden();

    boolean isInLayout();

    boolean isRemoving();

    boolean isResumed();

    boolean isVisible();

    void setHasOptionsMenu(boolean z);

    void setMenuVisibility(boolean z);

    void setRetainInstance(boolean z);

    void setUserVisibleHint(boolean z);

    void startActivity(Intent intent);

    void startActivityForResult(Intent intent, int i);

    void zza(IObjectWrapper iObjectWrapper);

    IObjectWrapper zzae();

    IFragmentWrapper zzaf();

    IObjectWrapper zzag();

    IFragmentWrapper zzah();

    IObjectWrapper zzai();

    void zzb(IObjectWrapper iObjectWrapper);
}
