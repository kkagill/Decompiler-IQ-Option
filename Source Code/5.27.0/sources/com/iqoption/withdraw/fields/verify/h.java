package com.iqoption.withdraw.fields.verify;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.PagerAdapter;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs;
import com.iqoption.core.ext.a;
import com.iqoption.withdraw.a.m;
import com.iqoption.withdraw.d.e;
import java.util.List;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J \u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0011H\u0016J\u0010\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0018\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0018\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0014\u0010\u001b\u001a\u00020\r2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u000b0\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, bng = {"Lcom/iqoption/withdraw/fields/verify/WithdrawVerifyWarningAdapter;", "Landroidx/viewpager/widget/PagerAdapter;", "context", "Landroid/content/Context;", "listener", "Lcom/iqoption/withdraw/fields/verify/WarningListener;", "(Landroid/content/Context;Lcom/iqoption/withdraw/fields/verify/WarningListener;)V", "getContext", "()Landroid/content/Context;", "items", "", "Lcom/iqoption/withdraw/fields/verify/VerificationWarning;", "destroyItem", "", "container", "Landroid/view/ViewGroup;", "position", "", "object", "", "getCount", "getItemPosition", "instantiateItem", "isViewFromObject", "", "view", "Landroid/view/View;", "setData", "cards", "withdraw_release"})
/* compiled from: WithdrawVerifyWarningAdapter.kt */
public final class h extends PagerAdapter {
    private final Context context;
    private final e esy;
    private List<? extends c> iA = m.emptyList();

    public int getItemPosition(Object obj) {
        kotlin.jvm.internal.i.f(obj, "object");
        return -2;
    }

    public boolean isViewFromObject(View view, Object obj) {
        kotlin.jvm.internal.i.f(view, Promotion.ACTION_VIEW);
        kotlin.jvm.internal.i.f(obj, "object");
        return view == obj;
    }

    public h(Context context, e eVar) {
        kotlin.jvm.internal.i.f(context, "context");
        kotlin.jvm.internal.i.f(eVar, CastExtraArgs.LISTENER);
        this.context = context;
        this.esy = eVar;
    }

    public final void L(List<? extends c> list) {
        kotlin.jvm.internal.i.f(list, "cards");
        this.iA = list;
        notifyDataSetChanged();
    }

    public int getCount() {
        return this.iA.size();
    }

    public Object instantiateItem(ViewGroup viewGroup, int i) {
        kotlin.jvm.internal.i.f(viewGroup, "container");
        m mVar = (m) a.a(viewGroup, e.fragment_withdraw_verify_page, viewGroup, false, 4, null);
        View root = mVar.getRoot();
        kotlin.jvm.internal.i.e(root, "binding.root");
        viewGroup.addView(root);
        new i(mVar, this.esy).b((c) this.iA.get(i));
        return root;
    }

    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        kotlin.jvm.internal.i.f(viewGroup, "container");
        kotlin.jvm.internal.i.f(obj, "object");
        viewGroup.removeView((View) obj);
    }
}
