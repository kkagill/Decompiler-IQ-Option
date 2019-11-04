package com.iqoption.charttools.tools.delegate;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.Lifecycle;
import androidx.recyclerview.widget.RecyclerView.ItemDecoration;
import com.iqoption.charttools.tools.delegate.c.a;
import com.iqoption.charttools.tools.h;
import kotlin.d;
import kotlin.i;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.k;
import kotlin.reflect.j;

@i(bne = {1, 1, 15}, bnf = {"\u0000N\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010%\u001a\u00020&H\u0001R\u0012\u0010\b\u001a\u00020\tX\u0005¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u001b\u0010\f\u001a\u00028\u00008DX\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u0012\u0010\u0011\u001a\u00020\u0012X\u0005¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0012\u0010\u0015\u001a\u00020\u0016X\u0005¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0019\u001a\u00020\u001a8F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0012\u0010\u001d\u001a\u00020\u001eX\u0005¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0012\u0010!\u001a\u00020\"X\u0005¢\u0006\u0006\u001a\u0004\b#\u0010$¨\u0006'"}, bng = {"Lcom/iqoption/charttools/tools/delegate/ContentDelegate;", "Binding", "Landroidx/databinding/ViewDataBinding;", "Lcom/iqoption/charttools/tools/delegate/DelegateContext;", "layout", "", "context", "(ILcom/iqoption/charttools/tools/delegate/DelegateContext;)V", "activity", "Landroid/app/Activity;", "getActivity", "()Landroid/app/Activity;", "binding", "getBinding", "()Landroidx/databinding/ViewDataBinding;", "binding$delegate", "Lkotlin/Lazy;", "callbacks", "Lcom/iqoption/charttools/tools/delegate/DelegateContext$Callbacks;", "getCallbacks", "()Lcom/iqoption/charttools/tools/delegate/DelegateContext$Callbacks;", "commonDecoration", "Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;", "getCommonDecoration", "()Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;", "contentView", "Landroid/view/View;", "getContentView", "()Landroid/view/View;", "parentView", "Landroid/view/ViewGroup;", "getParentView", "()Landroid/view/ViewGroup;", "viewModel", "Lcom/iqoption/charttools/tools/ToolsViewModel;", "getViewModel", "()Lcom/iqoption/charttools/tools/ToolsViewModel;", "getLifecycle", "Landroidx/lifecycle/Lifecycle;", "app_optionXRelease"})
/* compiled from: ContentDelegate.kt */
public abstract class b<Binding extends ViewDataBinding> implements c {
    static final /* synthetic */ j[] anY = new j[]{k.a(new PropertyReference1Impl(k.G(b.class), "binding", "getBinding()Landroidx/databinding/ViewDataBinding;"))};
    private final d aNk;
    private final /* synthetic */ c aNl;

    public h PL() {
        return this.aNl.PL();
    }

    public ItemDecoration PO() {
        return this.aNl.PO();
    }

    public ViewGroup PP() {
        return this.aNl.PP();
    }

    public a PQ() {
        return this.aNl.PQ();
    }

    public Activity getActivity() {
        return this.aNl.getActivity();
    }

    /* Access modifiers changed, original: protected|final */
    public final Binding getBinding() {
        d dVar = this.aNk;
        j jVar = anY[0];
        return (ViewDataBinding) dVar.getValue();
    }

    @NonNull
    public Lifecycle getLifecycle() {
        return this.aNl.getLifecycle();
    }

    public b(int i, c cVar) {
        kotlin.jvm.internal.i.f(cVar, "context");
        this.aNl = cVar;
        this.aNk = g.c(new ContentDelegate$binding$2(this, i));
    }

    public final View getContentView() {
        View root = getBinding().getRoot();
        kotlin.jvm.internal.i.e(root, "binding.root");
        return root;
    }
}
