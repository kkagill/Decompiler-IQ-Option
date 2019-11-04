package com.iqoption.welcome.a;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.databinding.ViewDataBinding;
import com.facebook.login.widget.ProfilePictureView;
import com.iqoption.core.ui.widget.rounded.RoundedFrameLayout;
import com.iqoption.core.ui.widget.rounded.RoundedImageView;

/* compiled from: FragmentWelcomeRegistrationSocialBinding */
public abstract class s extends ViewDataBinding {
    @NonNull
    public final TextView alH;
    @NonNull
    public final ImageView bfR;
    @NonNull
    public final FrameLayout ekN;
    @NonNull
    public final FrameLayout ekO;
    @NonNull
    public final aa elb;
    @NonNull
    public final ac eld;
    @NonNull
    public final ProfilePictureView elf;
    @NonNull
    public final RoundedFrameLayout elg;
    @NonNull
    public final RoundedImageView elh;
    @NonNull
    public final RoundedImageView eli;
    @NonNull
    public final TextView elj;

    protected s(Object obj, View view, int i, ImageView imageView, aa aaVar, FrameLayout frameLayout, FrameLayout frameLayout2, ProfilePictureView profilePictureView, RoundedFrameLayout roundedFrameLayout, RoundedImageView roundedImageView, RoundedImageView roundedImageView2, TextView textView, TextView textView2, ac acVar) {
        super(obj, view, i);
        this.bfR = imageView;
        this.elb = aaVar;
        setContainedBinding(this.elb);
        this.ekN = frameLayout;
        this.ekO = frameLayout2;
        this.elf = profilePictureView;
        this.elg = roundedFrameLayout;
        this.elh = roundedImageView;
        this.eli = roundedImageView2;
        this.elj = textView;
        this.alH = textView2;
        this.eld = acVar;
        setContainedBinding(this.eld);
    }
}
