package com.iqoption.portfolio.component.a;

import android.content.Context;
import android.widget.ImageView;
import com.squareup.picasso.Picasso;

/* compiled from: IconBinder */
public class e {
    private final Picasso picasso;

    public e(Context context) {
        this.picasso = Picasso.with(context);
    }

    public void d(ImageView imageView, String str) {
        this.picasso.load(str).into(imageView);
    }
}
