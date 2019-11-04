package com.umoove.all;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.graphics.Point;
import android.preference.PreferenceManager;
import android.util.DisplayMetrics;
import android.view.Display;
import androidx.core.app.NotificationCompat;
import com.iqoption.dto.entity.position.Position;

/* compiled from: DeviceCompatibility */
class b {
    private String a = "";
    private boolean b = false;
    private int c = 0;
    private int d = 0;
    private float e;
    private Context eJa;
    private float f;
    private int g;
    private int h;
    private float i;
    private float j;
    private float k = 0.0f;
    private boolean l = false;

    b(Context context, Display display, int i, int i2, int i3, int i4, float f, float f2) {
        this.eJa = context;
        PreferenceManager.getDefaultSharedPreferences(context);
        String str = "false";
        if (str == str) {
            a(display, i, i2, i3, i4, f, f2);
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void a() {
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this.eJa);
        this.a = defaultSharedPreferences.getString(NotificationCompat.CATEGORY_STATUS, "no values");
        String str = "0";
        this.c = Integer.valueOf(defaultSharedPreferences.getString("Gyroscope_Rotation", str)).intValue();
        this.d = Integer.valueOf(defaultSharedPreferences.getString("Front_Camera_Rotation", str)).intValue();
        this.e = Float.parseFloat(defaultSharedPreferences.getString("Front_Camera_Position_Horizontal_CM", str));
        this.f = Float.parseFloat(defaultSharedPreferences.getString("Front_Camera_Position_Verical_CM", "-5"));
        this.g = 1280;
        this.h = 720;
        this.i = Float.parseFloat(defaultSharedPreferences.getString("Front_Camera_FOV_Horizontal", "42.5"));
        this.j = Float.parseFloat(defaultSharedPreferences.getString("Front_Camera_FOV_Vertical", "54.8"));
        this.k = Float.parseFloat(defaultSharedPreferences.getString("screen_density_cm", "0.011339286"));
        this.l = defaultSharedPreferences.getBoolean("SetRecordingFlag", false);
    }

    private void a(Display display, int i, int i2, int i3, int i4, float f, float f2) {
        float f3;
        float f4;
        Display display2 = display;
        int rotation = display.getRotation();
        Point point = new Point();
        display2.getSize(point);
        int i5 = 0;
        if (rotation == 0 || rotation == 2 ? point.x >= point.y : point.x < point.y) {
            i5 = 1;
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        display2.getMetrics(displayMetrics);
        float f5 = 1.0f / (((displayMetrics.xdpi + displayMetrics.ydpi) / 2.0f) / 2.54f);
        float f6 = (float) i2;
        Math.sqrt(Math.pow((double) (((float) i) / displayMetrics.xdpi), 2.0d) + Math.pow((double) (f6 / displayMetrics.ydpi), 2.0d));
        double d = (double) (f6 / displayMetrics.ydpi);
        Double.isNaN(d);
        d = -(((d * 2.54d) / 2.0d) + 0.75d);
        double d2 = 0.0d;
        if (i5 % 2 != 0) {
            d = -d;
        } else {
            double d3 = d;
            d = 0.0d;
            d2 = d3;
        }
        if (f <= 30.0f || f >= 65.0f || f2 <= 30.0f || f2 >= 65.0f) {
            f3 = 42.5f;
            f4 = 54.8f;
        } else {
            float f7 = f == f2 ? 0.75f * f2 : f;
            if (f7 > f2) {
                f3 = f2;
                f4 = f7;
            } else {
                f4 = f2;
                f3 = f7;
            }
        }
        Editor edit = PreferenceManager.getDefaultSharedPreferences(this.eJa).edit();
        String str = Position.CLOSE_REASON_DEFAULT;
        edit.putString("compatabilityInfoSaved", str);
        edit.putString(NotificationCompat.CATEGORY_STATUS, str);
        StringBuilder stringBuilder = new StringBuilder();
        String str2 = "";
        stringBuilder.append(str2);
        stringBuilder.append(i5);
        edit.putString("Gyroscope_Rotation", stringBuilder.toString());
        stringBuilder = new StringBuilder();
        stringBuilder.append(str2);
        stringBuilder.append(i5);
        edit.putString("Front_Camera_Rotation", stringBuilder.toString());
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append(str2);
        stringBuilder2.append(d);
        edit.putString("Front_Camera_Position_Horizontal_CM", stringBuilder2.toString());
        StringBuilder stringBuilder3 = new StringBuilder();
        stringBuilder3.append(str2);
        stringBuilder3.append(d2);
        edit.putString("Front_Camera_Position_Verical_CM", stringBuilder3.toString());
        edit.putString("Front_Camera_Default_Frame_Width_Pixels", "320");
        edit.putString("Front_Camera_Default_Frame_Height_Pixels", "240");
        stringBuilder3 = new StringBuilder();
        stringBuilder3.append(str2);
        stringBuilder3.append(i3);
        edit.putString("Front_Camera_Default_Eye_Frame_Width_Pixels", stringBuilder3.toString());
        stringBuilder3 = new StringBuilder();
        stringBuilder3.append(str2);
        stringBuilder3.append(i4);
        edit.putString("Front_Camera_Default_Eye_Frame_Height_Pixels", stringBuilder3.toString());
        stringBuilder3 = new StringBuilder();
        stringBuilder3.append(str2);
        stringBuilder3.append(f3);
        edit.putString("Front_Camera_FOV_Horizontal", stringBuilder3.toString());
        stringBuilder3 = new StringBuilder();
        stringBuilder3.append(str2);
        stringBuilder3.append(f4);
        edit.putString("Front_Camera_FOV_Vertical", stringBuilder3.toString());
        stringBuilder3 = new StringBuilder();
        stringBuilder3.append(str2);
        stringBuilder3.append(f5);
        edit.putString("screen_density_cm", stringBuilder3.toString());
        edit.commit();
    }

    public int b() {
        return this.c;
    }

    public int c() {
        return this.d;
    }

    public void a(int i) {
        this.d = i;
    }

    public float bid() {
        return this.e;
    }

    public float bie() {
        return this.f;
    }

    public float f() {
        return this.i;
    }

    public float g() {
        return this.j;
    }

    public float bif() {
        return this.k;
    }
}
