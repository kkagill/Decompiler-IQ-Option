package com.jumio.commons.utils;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Build.VERSION;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.jumio.commons.enums.Rotation;
import com.jumio.commons.enums.ScreenAngle;

public class DeviceRotationManager {
    private Activity mActivity;
    private ScreenAngle mAngle;
    private int mDefaultOrientation;
    private boolean mIsTablet;
    private int mManifestOrientation;
    private Rotation mRotation;

    /* JADX WARNING: Missing block: B:42:0x00ac, code skipped:
            if (r9.mDefaultOrientation == 2) goto L_0x00ae;
     */
    /* JADX WARNING: Missing block: B:48:0x00b9, code skipped:
            if (r9.mDefaultOrientation == 2) goto L_0x00b0;
     */
    /* JADX WARNING: Missing block: B:53:0x00c5, code skipped:
            if (r9.mDefaultOrientation == 2) goto L_0x00bc;
     */
    /* JADX WARNING: Missing block: B:57:0x00ce, code skipped:
            if (r9.mDefaultOrientation == 2) goto L_0x00d0;
     */
    public DeviceRotationManager(android.app.Activity r10, com.jumio.commons.enums.Rotation r11) {
        /*
        r9 = this;
        r9.<init>();
        r9.mActivity = r10;
        r9.mRotation = r11;
        r11 = isTabletDevice(r10);
        r9.mIsTablet = r11;
        r11 = r9.getDeviceDefaultOrientation(r10);
        r9.mDefaultOrientation = r11;
        r11 = com.jumio.commons.enums.Rotation.NONE;
        r11 = r9.isRotation(r11);
        r0 = 1;
        r1 = 0;
        r2 = 2;
        if (r11 == 0) goto L_0x0030;
    L_0x001e:
        r11 = r9.mActivity;
        r3 = r9.mIsTablet;
        if (r3 == 0) goto L_0x002c;
    L_0x0024:
        r3 = r9.getDefaultOrientation();
        if (r3 != r2) goto L_0x002c;
    L_0x002a:
        r3 = 0;
        goto L_0x002d;
    L_0x002c:
        r3 = 1;
    L_0x002d:
        r11.setRequestedOrientation(r3);
    L_0x0030:
        r11 = r9.getScreenOrientation();
        r9.mAngle = r11;
        r11 = -1;
        r3 = r10.getPackageManager();	 Catch:{ NameNotFoundException -> 0x0048 }
        r10 = r10.getComponentName();	 Catch:{ NameNotFoundException -> 0x0048 }
        r10 = r3.getActivityInfo(r10, r1);	 Catch:{ NameNotFoundException -> 0x0048 }
        r10 = r10.screenOrientation;	 Catch:{ NameNotFoundException -> 0x0048 }
        r9.mManifestOrientation = r10;	 Catch:{ NameNotFoundException -> 0x0048 }
        goto L_0x004a;
    L_0x0048:
        r9.mManifestOrientation = r11;
    L_0x004a:
        r10 = r9.mManifestOrientation;
        r3 = 4;
        r4 = 3;
        if (r10 == r4) goto L_0x00dd;
    L_0x0050:
        r5 = 10;
        if (r10 != r5) goto L_0x0056;
    L_0x0054:
        goto L_0x00dd;
    L_0x0056:
        r6 = 11;
        r7 = 6;
        if (r10 != r6) goto L_0x005f;
    L_0x005b:
        r9.mManifestOrientation = r7;
        goto L_0x00df;
    L_0x005f:
        r6 = 12;
        r8 = 7;
        if (r10 != r6) goto L_0x0068;
    L_0x0064:
        r9.mManifestOrientation = r8;
        goto L_0x00df;
    L_0x0068:
        if (r10 == r11) goto L_0x0079;
    L_0x006a:
        if (r10 != r2) goto L_0x006d;
    L_0x006c:
        goto L_0x0079;
    L_0x006d:
        if (r10 != r8) goto L_0x0073;
    L_0x006f:
        r9.mManifestOrientation = r0;
        goto L_0x00df;
    L_0x0073:
        if (r10 != r7) goto L_0x00df;
    L_0x0075:
        r9.mManifestOrientation = r1;
        goto L_0x00df;
    L_0x0079:
        r10 = r9.mActivity;
        r10 = r10.getContentResolver();
        r11 = "accelerometer_rotation";
        r10 = android.provider.Settings.System.getInt(r10, r11, r1);
        if (r10 != 0) goto L_0x00d3;
    L_0x0087:
        r10 = r9.mActivity;
        r11 = "window";
        r10 = r10.getSystemService(r11);
        r10 = (android.view.WindowManager) r10;
        r10 = r10.getDefaultDisplay();
        r10 = r10.getRotation();
        if (r10 == 0) goto L_0x00c8;
    L_0x009b:
        r11 = 9;
        if (r10 == r0) goto L_0x00bf;
    L_0x009f:
        r3 = 8;
        if (r10 == r2) goto L_0x00b3;
    L_0x00a3:
        if (r10 == r4) goto L_0x00a6;
    L_0x00a5:
        goto L_0x00d0;
    L_0x00a6:
        r10 = r9.mIsTablet;
        if (r10 == 0) goto L_0x00b0;
    L_0x00aa:
        r10 = r9.mDefaultOrientation;
        if (r10 != r2) goto L_0x00b0;
    L_0x00ae:
        r1 = 1;
        goto L_0x00d0;
    L_0x00b0:
        r1 = 8;
        goto L_0x00d0;
    L_0x00b3:
        r10 = r9.mIsTablet;
        if (r10 == 0) goto L_0x00bc;
    L_0x00b7:
        r10 = r9.mDefaultOrientation;
        if (r10 != r2) goto L_0x00bc;
    L_0x00bb:
        goto L_0x00b0;
    L_0x00bc:
        r1 = 9;
        goto L_0x00d0;
    L_0x00bf:
        r10 = r9.mIsTablet;
        if (r10 == 0) goto L_0x00d0;
    L_0x00c3:
        r10 = r9.mDefaultOrientation;
        if (r10 != r2) goto L_0x00d0;
    L_0x00c7:
        goto L_0x00bc;
    L_0x00c8:
        r10 = r9.mIsTablet;
        if (r10 == 0) goto L_0x00ae;
    L_0x00cc:
        r10 = r9.mDefaultOrientation;
        if (r10 != r2) goto L_0x00ae;
    L_0x00d0:
        r9.mManifestOrientation = r1;
        goto L_0x00df;
    L_0x00d3:
        r10 = r9.mIsTablet;
        if (r10 == 0) goto L_0x00da;
    L_0x00d7:
        r9.mManifestOrientation = r5;
        goto L_0x00df;
    L_0x00da:
        r9.mManifestOrientation = r3;
        goto L_0x00df;
    L_0x00dd:
        r9.mManifestOrientation = r3;
    L_0x00df:
        r9.setAngleFromScreen();
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.jumio.commons.utils.DeviceRotationManager.<init>(android.app.Activity, com.jumio.commons.enums.Rotation):void");
    }

    @SuppressLint({"NewApi"})
    public static boolean isTabletDevice(Context context) {
        Object obj = (VERSION.SDK_INT < 13 ? (context.getResources().getConfiguration().screenLayout & 15) != 4 : context.getResources().getConfiguration().smallestScreenWidthDp < 600) ? null : 1;
        if (obj != null) {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            ((Activity) context).getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
            if (displayMetrics.densityDpi == 160 || displayMetrics.densityDpi == 240 || displayMetrics.densityDpi == 160 || displayMetrics.densityDpi == 213 || displayMetrics.densityDpi == 320) {
                return true;
            }
        }
        return false;
    }

    private int getDeviceDefaultOrientation(Activity activity) {
        WindowManager windowManager = (WindowManager) activity.getSystemService("window");
        Configuration configuration = activity.getResources().getConfiguration();
        int rotation = windowManager.getDefaultDisplay().getRotation();
        if (((rotation == 0 || rotation == 2) && configuration.orientation == 2) || ((rotation == 1 || rotation == 3) && configuration.orientation == 1)) {
            return 2;
        }
        return 1;
    }

    public int getDisplayRotation() {
        return ((WindowManager) this.mActivity.getSystemService("window")).getDefaultDisplay().getRotation();
    }

    public ScreenAngle getScreenOrientation() {
        ScreenAngle screenAngle = ScreenAngle.PORTRAIT;
        int rotation = ((WindowManager) this.mActivity.getSystemService("window")).getDefaultDisplay().getRotation();
        if (rotation == 0) {
            return (this.mIsTablet && this.mDefaultOrientation == 2) ? ScreenAngle.LANDSCAPE : ScreenAngle.PORTRAIT;
        } else {
            if (rotation == 1) {
                return (this.mIsTablet && this.mDefaultOrientation == 2) ? ScreenAngle.INVERTED_PORTRAIT : ScreenAngle.LANDSCAPE;
            } else {
                if (rotation == 2) {
                    return (this.mIsTablet && this.mDefaultOrientation == 2) ? ScreenAngle.INVERTED_LANDSCAPE : ScreenAngle.INVERTED_PORTRAIT;
                } else {
                    if (rotation != 3) {
                        return screenAngle;
                    }
                    return (this.mIsTablet && this.mDefaultOrientation == 2) ? ScreenAngle.PORTRAIT : ScreenAngle.INVERTED_LANDSCAPE;
                }
            }
        }
    }

    public Rotation getRotation() {
        return this.mRotation;
    }

    public boolean isRotation(Rotation rotation) {
        return this.mRotation.equals(rotation);
    }

    public boolean isTablet() {
        return this.mIsTablet;
    }

    public ScreenAngle getAngle() {
        return this.mAngle;
    }

    public boolean isAngle(ScreenAngle screenAngle) {
        return this.mAngle.equals(screenAngle);
    }

    public void setAngleFromOrientation(int i) {
        if (isTablet() && getDefaultOrientation() == 2) {
            i = ((i - 90) + 360) % 360;
        }
        if ((i > 355 || i < 5) && this.mAngle != ScreenAngle.PORTRAIT) {
            this.mAngle = ScreenAngle.PORTRAIT;
        } else if (i > 85 && i < 95 && this.mAngle != ScreenAngle.INVERTED_LANDSCAPE) {
            this.mAngle = ScreenAngle.INVERTED_LANDSCAPE;
        } else if (i <= 175 || i >= 185 || this.mAngle == ScreenAngle.INVERTED_PORTRAIT) {
            if (i > 265 && i < 275 && this.mAngle != ScreenAngle.LANDSCAPE) {
                this.mAngle = ScreenAngle.LANDSCAPE;
            }
        } else if (isTablet() || this.mManifestOrientation != 4) {
            this.mAngle = ScreenAngle.INVERTED_PORTRAIT;
        }
    }

    public void setAngleFromScreen() {
        this.mAngle = getScreenOrientation();
    }

    public boolean isPortrait() {
        return this.mAngle == ScreenAngle.PORTRAIT || this.mAngle == ScreenAngle.INVERTED_PORTRAIT;
    }

    public boolean isLandscape() {
        return this.mAngle == ScreenAngle.LANDSCAPE || this.mAngle == ScreenAngle.INVERTED_LANDSCAPE;
    }

    public boolean isScreenPortrait() {
        ScreenAngle screenOrientation = getScreenOrientation();
        return screenOrientation == ScreenAngle.PORTRAIT || screenOrientation == ScreenAngle.INVERTED_PORTRAIT;
    }

    public boolean isScreenLandscape() {
        ScreenAngle screenOrientation = getScreenOrientation();
        return screenOrientation == ScreenAngle.LANDSCAPE || screenOrientation == ScreenAngle.INVERTED_LANDSCAPE;
    }

    public boolean isInverted() {
        return this.mAngle == ScreenAngle.INVERTED_PORTRAIT || this.mAngle == ScreenAngle.INVERTED_LANDSCAPE;
    }

    public void setOrientationFromAngle() {
        if (isRotation(Rotation.NATIVE)) {
            int i = 1;
            if (this.mAngle != ScreenAngle.PORTRAIT) {
                if (this.mAngle == ScreenAngle.INVERTED_PORTRAIT) {
                    if (isTablet()) {
                        i = 9;
                    }
                } else if (this.mAngle == ScreenAngle.LANDSCAPE) {
                    i = 0;
                } else if (this.mAngle == ScreenAngle.INVERTED_LANDSCAPE) {
                    i = 8;
                }
            }
            this.mActivity.setRequestedOrientation(i);
        }
    }

    public void setOrientationFromManifest() {
        this.mActivity.setRequestedOrientation(this.mManifestOrientation);
        setAngleFromScreen();
    }

    public boolean isScreenEqualOrientation() {
        return isAngle(getScreenOrientation());
    }

    public int getDefaultOrientation() {
        return this.mDefaultOrientation;
    }

    public boolean isSensorOrientation() {
        for (int i : new int[]{4, 10, 7, 6}) {
            if (i == this.mManifestOrientation) {
                return true;
            }
        }
        return false;
    }
}
