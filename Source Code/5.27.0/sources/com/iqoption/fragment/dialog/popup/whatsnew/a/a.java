package com.iqoption.fragment.dialog.popup.whatsnew.a;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import com.iqoption.x.R;

/* compiled from: NewIndicator */
public class a extends Fragment {
    public static a aCX() {
        return new a();
    }

    @Nullable
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        return layoutInflater.inflate(R.layout.new_indicator, viewGroup, false);
    }
}
