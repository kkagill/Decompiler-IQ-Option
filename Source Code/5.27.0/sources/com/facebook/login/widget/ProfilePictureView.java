package com.facebook.login.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import androidx.annotation.Nullable;
import com.facebook.FacebookException;
import com.facebook.LoggingBehavior;
import com.facebook.internal.m;
import com.facebook.internal.n;
import com.facebook.internal.o;
import com.facebook.internal.s;
import com.facebook.internal.z;
import com.facebook.login.n.b;
import com.facebook.login.n.c;

public class ProfilePictureView extends FrameLayout {
    public static final String TAG = "ProfilePictureView";
    private String CT;
    private int Da = 0;
    private int Db = 0;
    private boolean Dc = true;
    private Bitmap Dd;
    private ImageView De;
    private int Df = -1;
    private n Dg;
    private a Dh;
    private Bitmap Di = null;

    public interface a {
        void b(FacebookException facebookException);
    }

    public ProfilePictureView(Context context) {
        super(context);
        initialize(context);
    }

    public ProfilePictureView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        initialize(context);
        a(attributeSet);
    }

    public ProfilePictureView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        initialize(context);
        a(attributeSet);
    }

    public final int getPresetSize() {
        return this.Df;
    }

    public final void setPresetSize(int i) {
        if (i == -4 || i == -3 || i == -2 || i == -1) {
            this.Df = i;
            requestLayout();
            return;
        }
        throw new IllegalArgumentException("Must use a predefined preset size");
    }

    public final boolean mf() {
        return this.Dc;
    }

    public final void setCropped(boolean z) {
        this.Dc = z;
        N(false);
    }

    public final String getProfileId() {
        return this.CT;
    }

    public final void setProfileId(@Nullable String str) {
        boolean z;
        if (z.aB(this.CT) || !this.CT.equalsIgnoreCase(str)) {
            mg();
            z = true;
        } else {
            z = false;
        }
        this.CT = str;
        N(z);
    }

    public final a getOnErrorListener() {
        return this.Dh;
    }

    public final void setOnErrorListener(a aVar) {
        this.Dh = aVar;
    }

    public final void setDefaultProfilePicture(Bitmap bitmap) {
        this.Di = bitmap;
    }

    /* Access modifiers changed, original: protected */
    public void onMeasure(int i, int i2) {
        Object obj;
        LayoutParams layoutParams = getLayoutParams();
        int size = MeasureSpec.getSize(i2);
        int size2 = MeasureSpec.getSize(i);
        if (MeasureSpec.getMode(i2) == 1073741824 || layoutParams.height != -2) {
            obj = null;
        } else {
            size = P(true);
            i2 = MeasureSpec.makeMeasureSpec(size, 1073741824);
            obj = 1;
        }
        if (MeasureSpec.getMode(i) != 1073741824 && layoutParams.width == -2) {
            size2 = P(true);
            i = MeasureSpec.makeMeasureSpec(size2, 1073741824);
            obj = 1;
        }
        if (obj != null) {
            setMeasuredDimension(size2, size);
            measureChildren(i, i2);
            return;
        }
        super.onMeasure(i, i2);
    }

    /* Access modifiers changed, original: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        N(false);
    }

    /* Access modifiers changed, original: protected */
    public Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        Bundle bundle = new Bundle();
        bundle.putParcelable("ProfilePictureView_superState", onSaveInstanceState);
        bundle.putString("ProfilePictureView_profileId", this.CT);
        bundle.putInt("ProfilePictureView_presetSize", this.Df);
        bundle.putBoolean("ProfilePictureView_isCropped", this.Dc);
        bundle.putInt("ProfilePictureView_width", this.Db);
        bundle.putInt("ProfilePictureView_height", this.Da);
        bundle.putBoolean("ProfilePictureView_refresh", this.Dg != null);
        return bundle;
    }

    /* Access modifiers changed, original: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable.getClass() != Bundle.class) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        Bundle bundle = (Bundle) parcelable;
        super.onRestoreInstanceState(bundle.getParcelable("ProfilePictureView_superState"));
        this.CT = bundle.getString("ProfilePictureView_profileId");
        this.Df = bundle.getInt("ProfilePictureView_presetSize");
        this.Dc = bundle.getBoolean("ProfilePictureView_isCropped");
        this.Db = bundle.getInt("ProfilePictureView_width");
        this.Da = bundle.getInt("ProfilePictureView_height");
        N(true);
    }

    /* Access modifiers changed, original: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.Dg = null;
    }

    private void initialize(Context context) {
        removeAllViews();
        this.De = new ImageView(context);
        this.De.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.De.setScaleType(ScaleType.CENTER_INSIDE);
        addView(this.De);
    }

    private void a(AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, c.com_facebook_profile_picture_view);
        setPresetSize(obtainStyledAttributes.getInt(c.com_facebook_profile_picture_view_com_facebook_preset_size, -1));
        this.Dc = obtainStyledAttributes.getBoolean(c.com_facebook_profile_picture_view_com_facebook_is_cropped, true);
        obtainStyledAttributes.recycle();
    }

    private void N(boolean z) {
        boolean mh = mh();
        String str = this.CT;
        if (str == null || str.length() == 0 || (this.Db == 0 && this.Da == 0)) {
            mg();
        } else if (mh || z) {
            O(true);
        }
    }

    private void mg() {
        n nVar = this.Dg;
        if (nVar != null) {
            m.b(nVar);
        }
        if (this.Di == null) {
            setImageBitmap(BitmapFactory.decodeResource(getResources(), mf() ? b.com_facebook_profile_picture_blank_square : b.com_facebook_profile_picture_blank_portrait));
            return;
        }
        mh();
        setImageBitmap(Bitmap.createScaledBitmap(this.Di, this.Db, this.Da, false));
    }

    private void setImageBitmap(Bitmap bitmap) {
        ImageView imageView = this.De;
        if (imageView != null && bitmap != null) {
            this.Dd = bitmap;
            imageView.setImageBitmap(bitmap);
        }
    }

    private void O(boolean z) {
        n kn = new com.facebook.internal.n.a(getContext(), n.a(this.CT, this.Db, this.Da)).F(z).aa(this).a(new n.b() {
            public void a(o oVar) {
                ProfilePictureView.this.b(oVar);
            }
        }).kn();
        n nVar = this.Dg;
        if (nVar != null) {
            m.b(nVar);
        }
        this.Dg = kn;
        m.a(kn);
    }

    private void b(o oVar) {
        if (oVar.ko() == this.Dg) {
            this.Dg = null;
            Bitmap bitmap = oVar.getBitmap();
            Exception kp = oVar.kp();
            if (kp != null) {
                a aVar = this.Dh;
                if (aVar != null) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Error in downloading profile picture for profileId: ");
                    stringBuilder.append(getProfileId());
                    aVar.b(new FacebookException(stringBuilder.toString(), kp));
                    return;
                }
                s.a(LoggingBehavior.REQUESTS, 6, TAG, kp.toString());
            } else if (bitmap != null) {
                setImageBitmap(bitmap);
                if (oVar.kq()) {
                    O(false);
                }
            }
        }
    }

    private boolean mh() {
        int height = getHeight();
        int width = getWidth();
        boolean z = true;
        if (width < 1 || height < 1) {
            return false;
        }
        int P = P(false);
        if (P != 0) {
            height = P;
            width = height;
        }
        if (width <= height) {
            height = mf() ? width : 0;
        } else {
            width = mf() ? height : 0;
        }
        if (width == this.Db && height == this.Da) {
            z = false;
        }
        this.Db = width;
        this.Da = height;
        return z;
    }

    private int P(boolean z) {
        int i;
        int i2 = this.Df;
        if (i2 == -4) {
            i = com.facebook.login.n.a.com_facebook_profilepictureview_preset_size_large;
        } else if (i2 == -3) {
            i = com.facebook.login.n.a.com_facebook_profilepictureview_preset_size_normal;
        } else if (i2 == -2) {
            i = com.facebook.login.n.a.com_facebook_profilepictureview_preset_size_small;
        } else if (i2 != -1 || !z) {
            return 0;
        } else {
            i = com.facebook.login.n.a.com_facebook_profilepictureview_preset_size_normal;
        }
        return getResources().getDimensionPixelSize(i);
    }
}
