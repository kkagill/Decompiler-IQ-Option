package com.iqoption.core.ui.widget.recyclerview;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.OnScrollListener;
import com.iqoption.core.util.v;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, bng = {"Lcom/iqoption/core/ui/widget/recyclerview/HideKeyboardScrollListener;", "Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;", "focusedView", "Landroid/view/View;", "(Landroid/view/View;)V", "onScrollStateChanged", "", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "newState", "", "core_release"})
/* compiled from: HideKeyboardScrollListener.kt */
public final class b extends OnScrollListener {
    private final View bPh;

    public b() {
        this(null, 1, null);
    }

    public b(View view) {
        this.bPh = view;
    }

    public /* synthetic */ b(View view, int i, f fVar) {
        if ((i & 1) != 0) {
            view = (View) null;
        }
        this(view);
    }

    public void onScrollStateChanged(RecyclerView recyclerView, int i) {
        kotlin.jvm.internal.i.f(recyclerView, "recyclerView");
        if (i == 1) {
            View view = this.bPh;
            if (view == null) {
                view = recyclerView.getFocusedChild();
            }
            if (view != null) {
                view.clearFocus();
                v.az(view);
            }
        }
    }
}
