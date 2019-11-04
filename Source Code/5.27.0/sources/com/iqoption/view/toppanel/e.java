package com.iqoption.view.toppanel;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.iqoption.core.microservices.tradingengine.response.active.a;
import com.iqoption.dto.entity.position.Position;
import com.iqoption.fragment.b.d;
import com.iqoption.mobbtech.connect.response.options.b;
import com.iqoption.util.j;
import com.iqoption.x.R;

/* compiled from: PanelDelegate */
public abstract class e {
    @ColorInt
    protected int amj;
    @ColorInt
    protected int amk;
    protected a anF;
    private final d eiJ;
    protected b eiK;
    @ColorInt
    protected int eiL;
    protected String eiM;
    protected String mask = j.DO();

    public void cy(long j) {
    }

    public void destroy() {
    }

    @NonNull
    public abstract View e(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup);

    public void fu(boolean z) {
    }

    public e(d dVar, b bVar) {
        this.eiJ = dVar;
        this.eiK = bVar;
        this.anF = com.iqoption.app.helpers.a.Gs().b(Integer.valueOf(bVar.activeId), bVar.instrumentType);
        this.amj = ContextCompat.getColor(getContext(), R.color.green);
        this.amk = ContextCompat.getColor(getContext(), R.color.red);
        this.eiL = ContextCompat.getColor(getContext(), R.color.grey_blur_50);
        this.eiM = getContext().getResources().getString(R.string.n_a);
    }

    public void a(b bVar, Position position) {
        this.eiK = bVar;
        this.anF = com.iqoption.app.helpers.a.Gs().b(Integer.valueOf(bVar.activeId), bVar.instrumentType);
    }

    public final d aYQ() {
        return this.eiJ;
    }

    public final Context getContext() {
        return this.eiJ.getContext();
    }

    public final FragmentManager getSupportFragmentManager() {
        return getActivity().getSupportFragmentManager();
    }

    public final FragmentActivity getActivity() {
        return this.eiJ.getActivity();
    }
}
