package com.iqoption.core.ui.widget.recyclerview.adapter.a;

import androidx.recyclerview.widget.DiffUtil.DiffResult;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000*\f\b\u0000\u0010\u0001*\u0006\u0012\u0002\b\u00030\u00022\u00020\u0003B\u001b\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, bng = {"Lcom/iqoption/core/ui/widget/recyclerview/adapter/diff/DiffResult;", "T", "Lcom/iqoption/core/ui/widget/recyclerview/adapter/diff/Identifiable;", "", "request", "Lcom/iqoption/core/ui/widget/recyclerview/adapter/diff/DiffRequest;", "diff", "Landroidx/recyclerview/widget/DiffUtil$DiffResult;", "(Lcom/iqoption/core/ui/widget/recyclerview/adapter/diff/DiffRequest;Landroidx/recyclerview/widget/DiffUtil$DiffResult;)V", "getDiff", "()Landroidx/recyclerview/widget/DiffUtil$DiffResult;", "getRequest", "()Lcom/iqoption/core/ui/widget/recyclerview/adapter/diff/DiffRequest;", "core_release"})
/* compiled from: DiffResult.kt */
public final class c<T extends d<?>> {
    private final b<T> bPt;
    private final DiffResult bPu;

    public c(b<T> bVar, DiffResult diffResult) {
        kotlin.jvm.internal.i.f(bVar, "request");
        kotlin.jvm.internal.i.f(diffResult, "diff");
        this.bPt = bVar;
        this.bPu = diffResult;
    }

    public final b<T> ana() {
        return this.bPt;
    }

    public final DiffResult anb() {
        return this.bPu;
    }
}
