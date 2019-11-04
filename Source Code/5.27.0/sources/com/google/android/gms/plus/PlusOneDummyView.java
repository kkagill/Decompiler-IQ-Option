package com.google.android.gms.plus;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;

@Deprecated
public class PlusOneDummyView extends FrameLayout {
    @Deprecated
    public static final String TAG = "PlusOneDummyView";

    private interface zzd {
        Drawable getDrawable(int i);

        boolean isValid();
    }

    private static class zza implements zzd {
        private Context mContext;

        private zza(Context context) {
            this.mContext = context;
        }

        /* synthetic */ zza(Context context, zzd zzd) {
            this(context);
        }

        public final Drawable getDrawable(int i) {
            return this.mContext.getResources().getDrawable(17301508);
        }

        public final boolean isValid() {
            return true;
        }
    }

    private static class zzb implements zzd {
        private Context mContext;

        private zzb(Context context) {
            this.mContext = context;
        }

        /* synthetic */ zzb(Context context, zzd zzd) {
            this(context);
        }

        public final Drawable getDrawable(int i) {
            String str = "com.google.android.gms";
            try {
                Resources resources = this.mContext.createPackageContext(str, 4).getResources();
                String str2 = i != 0 ? i != 1 ? i != 2 ? "ic_plusone_standard" : "ic_plusone_tall" : "ic_plusone_medium" : "ic_plusone_small";
                return resources.getDrawable(resources.getIdentifier(str2, "drawable", str));
            } catch (NameNotFoundException unused) {
                return null;
            }
        }

        public final boolean isValid() {
            try {
                this.mContext.createPackageContext("com.google.android.gms", 4).getResources();
                return true;
            } catch (NameNotFoundException unused) {
                return false;
            }
        }
    }

    private static class zzc implements zzd {
        private Context mContext;

        private zzc(Context context) {
            this.mContext = context;
        }

        /* synthetic */ zzc(Context context, zzd zzd) {
            this(context);
        }

        public final Drawable getDrawable(int i) {
            String str = i != 0 ? i != 1 ? i != 2 ? "ic_plusone_standard_off_client" : "ic_plusone_tall_off_client" : "ic_plusone_medium_off_client" : "ic_plusone_small_off_client";
            return this.mContext.getResources().getDrawable(this.mContext.getResources().getIdentifier(str, "drawable", this.mContext.getPackageName()));
        }

        public final boolean isValid() {
            String str = "drawable";
            return (this.mContext.getResources().getIdentifier("ic_plusone_small_off_client", str, this.mContext.getPackageName()) == 0 || this.mContext.getResources().getIdentifier("ic_plusone_medium_off_client", str, this.mContext.getPackageName()) == 0 || this.mContext.getResources().getIdentifier("ic_plusone_tall_off_client", str, this.mContext.getPackageName()) == 0 || this.mContext.getResources().getIdentifier("ic_plusone_standard_off_client", str, this.mContext.getPackageName()) == 0) ? false : true;
        }
    }

    @Deprecated
    public PlusOneDummyView(Context context, int i) {
        super(context);
        Button button = new Button(context);
        button.setEnabled(false);
        zzd zzb = new zzb(getContext(), null);
        if (!zzb.isValid()) {
            zzb = new zzc(getContext(), null);
        }
        if (!zzb.isValid()) {
            zzb = new zza(getContext(), null);
        }
        button.setBackgroundDrawable(zzb.getDrawable(i));
        Point point = new Point();
        int i2 = 20;
        int i3 = 24;
        if (i == 0) {
            i2 = 14;
        } else if (i == 1) {
            i3 = 32;
        } else if (i != 2) {
            i2 = 24;
            i3 = 38;
        } else {
            i3 = 50;
        }
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        float applyDimension = TypedValue.applyDimension(1, (float) i3, displayMetrics);
        float applyDimension2 = TypedValue.applyDimension(1, (float) i2, displayMetrics);
        double d = (double) applyDimension;
        Double.isNaN(d);
        point.x = (int) (d + 0.5d);
        d = (double) applyDimension2;
        Double.isNaN(d);
        point.y = (int) (d + 0.5d);
        addView(button, new LayoutParams(point.x, point.y, 17));
    }
}
