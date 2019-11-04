package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.IObjectWrapper.Stub;

public abstract class zzn extends zza implements zzk {
    public zzn() {
        super("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    }

    public static zzk asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
        if (queryLocalInterface instanceof zzk) {
            return (zzk) queryLocalInterface;
        }
        return new zzm(iBinder);
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) {
        String str = "com.google.android.gms.measurement.api.internal.IEventHandlerProxy";
        String str2 = "com.google.android.gms.measurement.api.internal.IBundleReceiver";
        zzp zzp = null;
        String readString;
        IInterface queryLocalInterface;
        IBinder readStrongBinder;
        IInterface queryLocalInterface2;
        IBinder readStrongBinder2;
        zzq zzq;
        switch (i) {
            case 1:
                initialize(Stub.asInterface(parcel.readStrongBinder()), (zzx) zzd.zza(parcel, zzx.CREATOR), parcel.readLong());
                break;
            case 2:
                logEvent(parcel.readString(), parcel.readString(), (Bundle) zzd.zza(parcel, Bundle.CREATOR), zzd.zza(parcel), zzd.zza(parcel), parcel.readLong());
                break;
            case 3:
                zzp zzp2;
                str = parcel.readString();
                readString = parcel.readString();
                Bundle bundle = (Bundle) zzd.zza(parcel, Bundle.CREATOR);
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 == null) {
                    zzp2 = null;
                } else {
                    zzp zzp3;
                    queryLocalInterface = readStrongBinder3.queryLocalInterface(str2);
                    if (queryLocalInterface instanceof zzp) {
                        zzp3 = (zzp) queryLocalInterface;
                    } else {
                        zzp3 = new zzr(readStrongBinder3);
                    }
                    zzp2 = zzp3;
                }
                logEventAndBundle(str, readString, bundle, zzp2, parcel.readLong());
                break;
            case 4:
                setUserProperty(parcel.readString(), parcel.readString(), Stub.asInterface(parcel.readStrongBinder()), zzd.zza(parcel), parcel.readLong());
                break;
            case 5:
                str = parcel.readString();
                readString = parcel.readString();
                boolean zza = zzd.zza(parcel);
                readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    queryLocalInterface = readStrongBinder.queryLocalInterface(str2);
                    if (queryLocalInterface instanceof zzp) {
                        zzp = (zzp) queryLocalInterface;
                    } else {
                        zzp = new zzr(readStrongBinder);
                    }
                }
                getUserProperties(str, readString, zza, zzp);
                break;
            case 6:
                str = parcel.readString();
                readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    queryLocalInterface = readStrongBinder.queryLocalInterface(str2);
                    if (queryLocalInterface instanceof zzp) {
                        zzp = (zzp) queryLocalInterface;
                    } else {
                        zzp = new zzr(readStrongBinder);
                    }
                }
                getMaxUserProperties(str, zzp);
                break;
            case 7:
                setUserId(parcel.readString(), parcel.readLong());
                break;
            case 8:
                setConditionalUserProperty((Bundle) zzd.zza(parcel, Bundle.CREATOR), parcel.readLong());
                break;
            case 9:
                clearConditionalUserProperty(parcel.readString(), parcel.readString(), (Bundle) zzd.zza(parcel, Bundle.CREATOR));
                break;
            case 10:
                str = parcel.readString();
                readString = parcel.readString();
                readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    queryLocalInterface = readStrongBinder.queryLocalInterface(str2);
                    if (queryLocalInterface instanceof zzp) {
                        zzp = (zzp) queryLocalInterface;
                    } else {
                        zzp = new zzr(readStrongBinder);
                    }
                }
                getConditionalUserProperties(str, readString, zzp);
                break;
            case 11:
                setMeasurementEnabled(zzd.zza(parcel), parcel.readLong());
                break;
            case 12:
                resetAnalyticsData(parcel.readLong());
                break;
            case 13:
                setMinimumSessionDuration(parcel.readLong());
                break;
            case 14:
                setSessionTimeoutDuration(parcel.readLong());
                break;
            case 15:
                setCurrentScreen(Stub.asInterface(parcel.readStrongBinder()), parcel.readString(), parcel.readString(), parcel.readLong());
                break;
            case 16:
                readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    queryLocalInterface2 = readStrongBinder.queryLocalInterface(str2);
                    if (queryLocalInterface2 instanceof zzp) {
                        zzp = (zzp) queryLocalInterface2;
                    } else {
                        zzp = new zzr(readStrongBinder);
                    }
                }
                getCurrentScreenName(zzp);
                break;
            case 17:
                readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    queryLocalInterface2 = readStrongBinder.queryLocalInterface(str2);
                    if (queryLocalInterface2 instanceof zzp) {
                        zzp = (zzp) queryLocalInterface2;
                    } else {
                        zzp = new zzr(readStrongBinder);
                    }
                }
                getCurrentScreenClass(zzp);
                break;
            case 18:
                zzv zzv;
                readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    queryLocalInterface2 = readStrongBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IStringProvider");
                    if (queryLocalInterface2 instanceof zzv) {
                        zzv = (zzv) queryLocalInterface2;
                    } else {
                        zzv = new zzu(readStrongBinder);
                    }
                }
                setInstanceIdProvider(zzv);
                break;
            case 19:
                readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    queryLocalInterface2 = readStrongBinder.queryLocalInterface(str2);
                    if (queryLocalInterface2 instanceof zzp) {
                        zzp = (zzp) queryLocalInterface2;
                    } else {
                        zzp = new zzr(readStrongBinder);
                    }
                }
                getCachedAppInstanceId(zzp);
                break;
            case 20:
                readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    queryLocalInterface2 = readStrongBinder.queryLocalInterface(str2);
                    if (queryLocalInterface2 instanceof zzp) {
                        zzp = (zzp) queryLocalInterface2;
                    } else {
                        zzp = new zzr(readStrongBinder);
                    }
                }
                getAppInstanceId(zzp);
                break;
            case 21:
                readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    queryLocalInterface2 = readStrongBinder.queryLocalInterface(str2);
                    if (queryLocalInterface2 instanceof zzp) {
                        zzp = (zzp) queryLocalInterface2;
                    } else {
                        zzp = new zzr(readStrongBinder);
                    }
                }
                getGmpAppId(zzp);
                break;
            case 22:
                readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    queryLocalInterface2 = readStrongBinder.queryLocalInterface(str2);
                    if (queryLocalInterface2 instanceof zzp) {
                        zzp = (zzp) queryLocalInterface2;
                    } else {
                        zzp = new zzr(readStrongBinder);
                    }
                }
                generateEventId(zzp);
                break;
            case 23:
                beginAdUnitExposure(parcel.readString(), parcel.readLong());
                break;
            case 24:
                endAdUnitExposure(parcel.readString(), parcel.readLong());
                break;
            case 25:
                onActivityStarted(Stub.asInterface(parcel.readStrongBinder()), parcel.readLong());
                break;
            case 26:
                onActivityStopped(Stub.asInterface(parcel.readStrongBinder()), parcel.readLong());
                break;
            case 27:
                onActivityCreated(Stub.asInterface(parcel.readStrongBinder()), (Bundle) zzd.zza(parcel, Bundle.CREATOR), parcel.readLong());
                break;
            case 28:
                onActivityDestroyed(Stub.asInterface(parcel.readStrongBinder()), parcel.readLong());
                break;
            case 29:
                onActivityPaused(Stub.asInterface(parcel.readStrongBinder()), parcel.readLong());
                break;
            case 30:
                onActivityResumed(Stub.asInterface(parcel.readStrongBinder()), parcel.readLong());
                break;
            case 31:
                IObjectWrapper asInterface = Stub.asInterface(parcel.readStrongBinder());
                readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    queryLocalInterface = readStrongBinder2.queryLocalInterface(str2);
                    if (queryLocalInterface instanceof zzp) {
                        zzp = (zzp) queryLocalInterface;
                    } else {
                        zzp = new zzr(readStrongBinder2);
                    }
                }
                onActivitySaveInstanceState(asInterface, zzp, parcel.readLong());
                break;
            case 32:
                Bundle bundle2 = (Bundle) zzd.zza(parcel, Bundle.CREATOR);
                readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    queryLocalInterface = readStrongBinder2.queryLocalInterface(str2);
                    if (queryLocalInterface instanceof zzp) {
                        zzp = (zzp) queryLocalInterface;
                    } else {
                        zzp = new zzr(readStrongBinder2);
                    }
                }
                performAction(bundle2, zzp, parcel.readLong());
                break;
            case 33:
                logHealthData(parcel.readInt(), parcel.readString(), Stub.asInterface(parcel.readStrongBinder()), Stub.asInterface(parcel.readStrongBinder()), Stub.asInterface(parcel.readStrongBinder()));
                break;
            case 34:
                readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    queryLocalInterface2 = readStrongBinder.queryLocalInterface(str);
                    if (queryLocalInterface2 instanceof zzq) {
                        zzq = (zzq) queryLocalInterface2;
                    } else {
                        zzq = new zzs(readStrongBinder);
                    }
                }
                setEventInterceptor(zzq);
                break;
            case 35:
                readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    queryLocalInterface2 = readStrongBinder.queryLocalInterface(str);
                    if (queryLocalInterface2 instanceof zzq) {
                        zzq = (zzq) queryLocalInterface2;
                    } else {
                        zzq = new zzs(readStrongBinder);
                    }
                }
                registerOnMeasurementEventListener(zzq);
                break;
            case 36:
                readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    queryLocalInterface2 = readStrongBinder.queryLocalInterface(str);
                    if (queryLocalInterface2 instanceof zzq) {
                        zzq = (zzq) queryLocalInterface2;
                    } else {
                        zzq = new zzs(readStrongBinder);
                    }
                }
                unregisterOnMeasurementEventListener(zzq);
                break;
            case 37:
                initForTests(zzd.zzb(parcel));
                break;
            case 38:
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    queryLocalInterface = readStrongBinder4.queryLocalInterface(str2);
                    if (queryLocalInterface instanceof zzp) {
                        zzp = (zzp) queryLocalInterface;
                    } else {
                        zzp = new zzr(readStrongBinder4);
                    }
                }
                getTestFlag(zzp, parcel.readInt());
                break;
            case 39:
                setDataCollectionEnabled(zzd.zza(parcel));
                break;
            case 40:
                readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    queryLocalInterface2 = readStrongBinder.queryLocalInterface(str2);
                    if (queryLocalInterface2 instanceof zzp) {
                        zzp = (zzp) queryLocalInterface2;
                    } else {
                        zzp = new zzr(readStrongBinder);
                    }
                }
                isDataCollectionEnabled(zzp);
                break;
            case 41:
                readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    queryLocalInterface2 = readStrongBinder.queryLocalInterface(str2);
                    if (queryLocalInterface2 instanceof zzp) {
                        zzp = (zzp) queryLocalInterface2;
                    } else {
                        zzp = new zzr(readStrongBinder);
                    }
                }
                getDeepLink(zzp);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
