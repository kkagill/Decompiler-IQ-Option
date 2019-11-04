package com.iqoption.charttools.tools.delegate;

import android.app.Activity;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView.ItemDecoration;
import com.iqoption.charttools.tools.delegate.a.b;
import com.iqoption.charttools.tools.h;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0001\u0016R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0012\u0010\n\u001a\u00020\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0012\u0010\u000e\u001a\u00020\u000fX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0012\u0010\u0012\u001a\u00020\u0013X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, bng = {"Lcom/iqoption/charttools/tools/delegate/DelegateContext;", "Landroidx/lifecycle/LifecycleOwner;", "activity", "Landroid/app/Activity;", "getActivity", "()Landroid/app/Activity;", "callbacks", "Lcom/iqoption/charttools/tools/delegate/DelegateContext$Callbacks;", "getCallbacks", "()Lcom/iqoption/charttools/tools/delegate/DelegateContext$Callbacks;", "commonDecoration", "Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;", "getCommonDecoration", "()Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;", "parentView", "Landroid/view/ViewGroup;", "getParentView", "()Landroid/view/ViewGroup;", "viewModel", "Lcom/iqoption/charttools/tools/ToolsViewModel;", "getViewModel", "()Lcom/iqoption/charttools/tools/ToolsViewModel;", "Callbacks", "app_optionXRelease"})
/* compiled from: DelegateContext.kt */
public interface c extends LifecycleOwner {

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003J\b\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, bng = {"Lcom/iqoption/charttools/tools/delegate/DelegateContext$Callbacks;", "Lcom/iqoption/charttools/tools/delegate/ActiveToolsDelegate$Callback;", "Lcom/iqoption/charttools/tools/delegate/TemplatesDelegate$Callback;", "Lcom/iqoption/charttools/tools/delegate/IndicatorsDelegate$Callback;", "onClose", "", "app_optionXRelease"})
    /* compiled from: DelegateContext.kt */
    public interface a extends b, com.iqoption.charttools.tools.delegate.d.a, f.b {
        boolean onClose();
    }

    h PL();

    ItemDecoration PO();

    ViewGroup PP();

    a PQ();

    Activity getActivity();
}
