package com.iqoption.view;

import android.annotation.TargetApi;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.iqoption.x.R;

public class FavoriteVectorSwitchView extends ImageView {
    private boolean edQ = false;

    public FavoriteVectorSwitchView(Context context) {
        super(context);
    }

    public FavoriteVectorSwitchView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context, attributeSet);
    }

    public FavoriteVectorSwitchView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a(context, attributeSet);
    }

    @TargetApi(21)
    public FavoriteVectorSwitchView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        a(context, attributeSet);
    }

    private void a(Context context, AttributeSet attributeSet) {
        setSwitched(this.edQ);
    }

    public boolean aXF() {
        return this.edQ;
    }

    public void setSwitched(boolean z) {
        this.edQ = z;
        if (this.edQ) {
            setImageResource(R.drawable.ic_asset_favorite_switched);
        } else {
            setImageResource(R.drawable.ic_asset_favorite);
        }
    }
}
