package com.iqoption.util.fragmentstack;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0006\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\u00020\u0003B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0017\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0002\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00018\u0000H&¢\u0006\u0002\u0010\u0011J\b\u0010\u0013\u001a\u00020\u000fH\u0016J\b\u0010\u0014\u001a\u00020\u000fH\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0012\u0010\f\u001a\u0004\u0018\u00018\u0000X\u000e¢\u0006\u0004\n\u0002\u0010\r¨\u0006\u0015"}, bng = {"Lcom/iqoption/util/fragmentstack/FragmentAwareLiveDataObserver;", "T", "Landroidx/lifecycle/Observer;", "Lcom/iqoption/util/fragmentstack/FragmentVisibilityChangeListener;", "fragment", "Landroidx/fragment/app/Fragment;", "(Landroidx/fragment/app/Fragment;)V", "active", "", "dirtyData", "getFragment", "()Landroidx/fragment/app/Fragment;", "lastValue", "Ljava/lang/Object;", "onChanged", "", "t", "(Ljava/lang/Object;)V", "onCustomChange", "onInvisible", "onVisible", "app_optionXRelease"})
/* compiled from: FragmentAwareLiveDataObserver.kt */
public abstract class b<T> implements Observer<T>, c {
    private boolean active = true;
    private boolean eca;
    private T ecb;
    private final Fragment fragment;

    public abstract void cp(T t);

    public b(Fragment fragment) {
        kotlin.jvm.internal.i.f(fragment, "fragment");
        this.fragment = fragment;
    }

    public void onChanged(T t) {
        this.ecb = t;
        if (this.active) {
            this.eca = false;
            cp(t);
            return;
        }
        this.eca = true;
    }

    public void aXa() {
        this.active = true;
        if (this.eca) {
            this.eca = false;
            cp(this.ecb);
        }
    }

    public void aXb() {
        this.active = false;
    }
}
