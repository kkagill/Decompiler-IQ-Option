package com.iqoption.qrcode;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.vision.Detector.Detections;
import com.google.android.gms.vision.MultiProcessor;
import com.google.android.gms.vision.MultiProcessor.Factory;
import com.google.android.gms.vision.Tracker;
import com.google.android.gms.vision.barcode.Barcode;
import com.google.android.gms.vision.barcode.BarcodeDetector;
import com.google.android.gms.vision.barcode.BarcodeDetector.Builder;
import com.iqoption.qrcode.camera.CameraSourcePreview;
import java.io.IOException;
import kotlin.TypeCastException;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0007\u0018\u0000 )2\u00020\u0001:\u0002)*B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004H\u0003J\u0012\u0010\u000e\u001a\u00020\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\u0012\u0010\u0011\u001a\u00020\r2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J&\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\b\u0010\u001a\u001a\u00020\rH\u0016J\b\u0010\u001b\u001a\u00020\rH\u0016J\b\u0010\u001c\u001a\u00020\rH\u0016J+\u0010\u001d\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\u001f2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\"0!2\u0006\u0010#\u001a\u00020$H\u0016¢\u0006\u0002\u0010%J\b\u0010&\u001a\u00020\rH\u0016J\b\u0010'\u001a\u00020\rH\u0002J\b\u0010(\u001a\u00020\rH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006+"}, bng = {"Lcom/iqoption/qrcode/BarcodeCaptureFragment;", "Landroidx/fragment/app/Fragment;", "()V", "autoFocus", "", "listener", "Lcom/iqoption/qrcode/BarcodeCaptureFragment$OnFragmentInteractionListener;", "mCameraSource", "Lcom/iqoption/qrcode/camera/CameraSource;", "mPreview", "Lcom/iqoption/qrcode/camera/CameraSourcePreview;", "useFlash", "createCameraSource", "", "onAttach", "context", "Landroid/content/Context;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDestroy", "onDetach", "onPause", "onRequestPermissionsResult", "requestCode", "", "permissions", "", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "onResume", "requestCameraPermission", "startCameraSource", "Companion", "OnFragmentInteractionListener", "qrcode_release"})
/* compiled from: BarcodeCaptureFragment.kt */
public final class a extends Fragment {
    private static final String TAG;
    public static final a dQV = new a();
    private com.iqoption.qrcode.camera.a dQQ;
    private CameraSourcePreview dQR;
    private boolean dQS = true;
    private boolean dQT;
    private b dQU;

    @i(bne = {1, 1, 15}, bnf = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000R\u0011\u0010\t\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0011"}, bng = {"Lcom/iqoption/qrcode/BarcodeCaptureFragment$Companion;", "", "()V", "ARG_AUTO_FOCUS", "", "ARG_USE_FLASH", "RC_HANDLE_CAMERA_PERM", "", "RC_HANDLE_GMS", "TAG", "getTAG", "()Ljava/lang/String;", "createNavigatorEntry", "Lcom/iqoption/core/ui/navigation/NavigatorEntry;", "isAutoFocus", "", "isUseFlash", "qrcode_release"})
    /* compiled from: BarcodeCaptureFragment.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final String Bx() {
            return a.TAG;
        }

        public final com.iqoption.core.ui.d.c m(boolean z, boolean z2) {
            Bundle bundle = new Bundle();
            bundle.putBoolean("ARG_AUTO_FOCUS", z);
            bundle.putBoolean("ARG_USE_FLASH", z2);
            return new com.iqoption.core.ui.d.c(Bx(), a.class, bundle, 0, 0, 0, 0, null, null, null, null, 2040, null);
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&¨\u0006\u0006"}, bng = {"Lcom/iqoption/qrcode/BarcodeCaptureFragment$OnFragmentInteractionListener;", "", "onBarcodeDetected", "", "barcode", "Lcom/google/android/gms/vision/barcode/Barcode;", "qrcode_release"})
    /* compiled from: BarcodeCaptureFragment.kt */
    public interface b {
        void a(Barcode barcode);
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0011\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0001\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, bng = {"<anonymous>", "com/iqoption/qrcode/BarcodeCaptureFragment$createCameraSource$1$1", "it", "Lcom/google/android/gms/vision/barcode/Barcode;", "kotlin.jvm.PlatformType", "create", "(Lcom/google/android/gms/vision/barcode/Barcode;)Lcom/iqoption/qrcode/BarcodeCaptureFragment$createCameraSource$1$1;"})
    /* compiled from: BarcodeCaptureFragment.kt */
    static final class c<T> implements Factory<Barcode> {
        final /* synthetic */ a dQW;

        @i(bne = {1, 1, 15}, bnf = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\"\u0010\u0003\u001a\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\b"}, bng = {"com/iqoption/qrcode/BarcodeCaptureFragment$createCameraSource$1$1", "Lcom/google/android/gms/vision/Tracker;", "Lcom/google/android/gms/vision/barcode/Barcode;", "onUpdate", "", "detectionResults", "Lcom/google/android/gms/vision/Detector$Detections;", "item", "qrcode_release"})
        /* compiled from: BarcodeCaptureFragment.kt */
        /* renamed from: com.iqoption.qrcode.a$c$1 */
        public static final class AnonymousClass1 extends Tracker<Barcode> {
            final /* synthetic */ c dQX;

            @i(bne = {1, 1, 15}, bnf = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, bng = {"<anonymous>", "", "run"})
            /* compiled from: BarcodeCaptureFragment.kt */
            static final class a implements Runnable {
                final /* synthetic */ AnonymousClass1 dQY;
                final /* synthetic */ Barcode dQZ;

                a(AnonymousClass1 anonymousClass1, Barcode barcode) {
                    this.dQY = anonymousClass1;
                    this.dQZ = barcode;
                }

                public final void run() {
                    b a = this.dQY.dQX.dQW.dQU;
                    if (a != null) {
                        a.a(this.dQZ);
                    }
                }
            }

            AnonymousClass1(c cVar) {
                this.dQX = cVar;
            }

            /* renamed from: a */
            public void onUpdate(Detections<Barcode> detections, Barcode barcode) {
                com.iqoption.core.rx.i.akj().m(new a(this, barcode));
            }
        }

        c(a aVar) {
            this.dQW = aVar;
        }

        /* renamed from: b */
        public final AnonymousClass1 create(Barcode barcode) {
            return new AnonymousClass1(this);
        }
    }

    static {
        String name = a.class.getName();
        if (name == null) {
            kotlin.jvm.internal.i.bnJ();
        }
        TAG = name;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.dQS = com.iqoption.core.ext.a.s(this).getBoolean("ARG_AUTO_FOCUS");
        this.dQT = com.iqoption.core.ext.a.s(this).getBoolean("ARG_USE_FLASH");
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.i.f(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(com.iqoption.qrcode.c.b.barcode_capture, viewGroup, false);
        View findViewById = inflate.findViewById(com.iqoption.qrcode.c.a.preview);
        if (findViewById != null) {
            this.dQR = (CameraSourcePreview) findViewById;
            if (ContextCompat.checkSelfPermission(com.iqoption.core.ext.a.q(this), "android.permission.CAMERA") == 0) {
                l(this.dQS, this.dQT);
            } else {
                aTe();
            }
            return inflate;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.iqoption.qrcode.camera.CameraSourcePreview");
    }

    private final void aTe() {
        requestPermissions(new String[]{"android.permission.CAMERA"}, 2);
    }

    @SuppressLint({"InlinedApi"})
    private final void l(boolean z, boolean z2) {
        Context context = getContext();
        if (context == null) {
            kotlin.jvm.internal.i.bnJ();
        }
        kotlin.jvm.internal.i.e(context, "context!!");
        BarcodeDetector build = new Builder(context.getApplicationContext()).build();
        build.setProcessor(new MultiProcessor.Builder(new c(this)).build());
        kotlin.jvm.internal.i.e(build, "barcodeDetector");
        String str = null;
        if (!build.isOperational()) {
            IntentFilter intentFilter = new IntentFilter("android.intent.action.DEVICE_STORAGE_LOW");
            FragmentActivity activity = getActivity();
            if (activity == null) {
                kotlin.jvm.internal.i.bnJ();
            }
            if ((activity.registerReceiver(null, intentFilter) != null ? 1 : null) != null) {
                Toast.makeText(getContext(), com.iqoption.qrcode.c.c.low_storage_error, 1).show();
            }
        }
        Context context2 = getContext();
        if (context2 == null) {
            kotlin.jvm.internal.i.bnJ();
        }
        kotlin.jvm.internal.i.e(context2, "getContext()!!");
        com.iqoption.qrcode.camera.a.a ac = new com.iqoption.qrcode.camera.a.a(context2.getApplicationContext(), build).gZ(0).aC(1600, 1024).ac(15.0f);
        if (VERSION.SDK_INT >= 14) {
            ac = ac.jF(z ? "continuous-picture" : null);
        }
        if (z2) {
            str = "torch";
        }
        this.dQQ = ac.jG(str).aTh();
    }

    public void onResume() {
        super.onResume();
        aTf();
    }

    public void onPause() {
        super.onPause();
        CameraSourcePreview cameraSourcePreview = this.dQR;
        if (cameraSourcePreview != null) {
            if (cameraSourcePreview == null) {
                kotlin.jvm.internal.i.bnJ();
            }
            cameraSourcePreview.stop();
        }
    }

    public void onDestroy() {
        super.onDestroy();
        CameraSourcePreview cameraSourcePreview = this.dQR;
        if (cameraSourcePreview != null) {
            if (cameraSourcePreview == null) {
                kotlin.jvm.internal.i.bnJ();
            }
            cameraSourcePreview.release();
        }
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        kotlin.jvm.internal.i.f(strArr, "permissions");
        kotlin.jvm.internal.i.f(iArr, "grantResults");
        if (i != 2) {
            super.onRequestPermissionsResult(i, strArr, iArr);
            return;
        }
        if (iArr.length != 0 && iArr[0] == 0) {
            l(this.dQS, this.dQT);
        }
    }

    private final void aTf() {
        GoogleApiAvailability instance = GoogleApiAvailability.getInstance();
        Context context = getContext();
        if (context == null) {
            kotlin.jvm.internal.i.bnJ();
        }
        kotlin.jvm.internal.i.e(context, "context!!");
        int isGooglePlayServicesAvailable = instance.isGooglePlayServicesAvailable(context.getApplicationContext());
        if (isGooglePlayServicesAvailable != 0) {
            GoogleApiAvailability.getInstance().getErrorDialog(getActivity(), isGooglePlayServicesAvailable, 9001).show();
        }
        if (this.dQQ != null) {
            try {
                CameraSourcePreview cameraSourcePreview = this.dQR;
                if (cameraSourcePreview == null) {
                    kotlin.jvm.internal.i.bnJ();
                }
                cameraSourcePreview.a(this.dQQ, null);
            } catch (IOException unused) {
                com.iqoption.qrcode.camera.a aVar = this.dQQ;
                if (aVar == null) {
                    kotlin.jvm.internal.i.bnJ();
                }
                aVar.release();
                this.dQQ = (com.iqoption.qrcode.camera.a) null;
            }
        }
    }

    public void onAttach(Context context) {
        b bVar;
        super.onAttach(context);
        if (getParentFragment() instanceof b) {
            bVar = (b) getParentFragment();
        } else if (context instanceof b) {
            bVar = (b) context;
        } else {
            StringBuilder stringBuilder = new StringBuilder();
            if (context == null) {
                kotlin.jvm.internal.i.bnJ();
            }
            stringBuilder.append(context.toString());
            stringBuilder.append(" must implement OnFragmentInteractionListener");
            throw new RuntimeException(stringBuilder.toString());
        }
        this.dQU = bVar;
    }

    public void onDetach() {
        super.onDetach();
        this.dQU = (b) null;
    }
}
