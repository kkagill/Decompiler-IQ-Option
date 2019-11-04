package com.iqoption.fragment.assets;

import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.ViewDataBinding;
import androidx.transition.Transition;
import com.iqoption.core.ext.a;
import com.iqoption.fragment.assets.model.AssetSortType;
import com.iqoption.fragment.assets.model.p;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000X\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B/\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ\u000b\u0010\u001c\u001a\u00028\u0000¢\u0006\u0002\u0010\u0012J\u000e\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 J\u0014\u0010!\u001a\u00020\"*\u00020 2\u0006\u0010#\u001a\u00020$H\u0004J\u0011\u0010%\u001a\u00020\u001e*\u00028\u0000H$¢\u0006\u0002\u0010&J\u0019\u0010'\u001a\u00020\u001e*\u00028\u00002\u0006\u0010\u001f\u001a\u00020 H$¢\u0006\u0002\u0010(R\u0012\u0010\u000e\u001a\u0004\u0018\u00018\u0000X\u000e¢\u0006\u0004\n\u0002\u0010\u000fR\u0011\u0010\u0010\u001a\u00028\u00008F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b\u0001\u0004)*+,¨\u0006-"}, bng = {"Lcom/iqoption/fragment/assets/HeaderDelegate;", "Binding", "Landroidx/databinding/ViewDataBinding;", "", "layoutResId", "", "container", "Landroid/view/ViewGroup;", "endPadding", "transition", "Landroidx/transition/Transition;", "viewModel", "Lcom/iqoption/fragment/assets/AssetsViewModel;", "(ILandroid/view/ViewGroup;ILandroidx/transition/Transition;Lcom/iqoption/fragment/assets/AssetsViewModel;)V", "_binding", "Landroidx/databinding/ViewDataBinding;", "binding", "getBinding", "()Landroidx/databinding/ViewDataBinding;", "getContainer", "()Landroid/view/ViewGroup;", "getEndPadding", "()I", "getLayoutResId", "getTransition", "()Landroidx/transition/Transition;", "getViewModel", "()Lcom/iqoption/fragment/assets/AssetsViewModel;", "createBinding", "updateState", "", "sorting", "Lcom/iqoption/fragment/assets/model/AssetSorting;", "getRotation", "", "type", "Lcom/iqoption/fragment/assets/model/AssetSortType;", "onCreateBinding", "(Landroidx/databinding/ViewDataBinding;)V", "onUpdateState", "(Landroidx/databinding/ViewDataBinding;Lcom/iqoption/fragment/assets/model/AssetSorting;)V", "Lcom/iqoption/fragment/assets/BoHeaderDelegate;", "Lcom/iqoption/fragment/assets/DoHeaderDelegate;", "Lcom/iqoption/fragment/assets/FxHeaderDelegate;", "Lcom/iqoption/fragment/assets/CfdHeaderBinding;", "app_optionXRelease"})
/* compiled from: HeaderDelegate.kt */
public abstract class n<Binding extends ViewDataBinding> {
    private final e daL;
    private Binding dbA;
    private final int dbB;
    private final ViewGroup dbC;
    private final int dbD;
    private final Transition dbE;

    public abstract void a(Binding binding);

    public abstract void a(Binding binding, p pVar);

    private n(int i, ViewGroup viewGroup, int i2, Transition transition, e eVar) {
        this.dbB = i;
        this.dbC = viewGroup;
        this.dbD = i2;
        this.dbE = transition;
        this.daL = eVar;
    }

    public /* synthetic */ n(int i, ViewGroup viewGroup, int i2, Transition transition, e eVar, f fVar) {
        this(i, viewGroup, i2, transition, eVar);
    }

    public final e aAD() {
        return this.daL;
    }

    public final Binding getBinding() {
        Binding binding = this.dbA;
        return binding != null ? binding : aAC();
    }

    public final Binding aAC() {
        ViewDataBinding a = a.a(this.dbC, this.dbB, null, false, 6, null);
        this.dbA = a;
        View root = a.getRoot();
        kotlin.jvm.internal.i.e(root, "it.root");
        a.l(root, this.dbD);
        a(a);
        return a;
    }

    public final void e(p pVar) {
        kotlin.jvm.internal.i.f(pVar, "sorting");
        a(getBinding(), pVar);
    }

    /* Access modifiers changed, original: protected|final */
    public final float a(p pVar, AssetSortType assetSortType) {
        kotlin.jvm.internal.i.f(pVar, "$this$getRotation");
        kotlin.jvm.internal.i.f(assetSortType, "type");
        return pVar.b(assetSortType) ? 0.0f : 180.0f;
    }
}
