package com.iqoption.newsandupdates;

import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import androidx.appcompat.widget.SwitchCompat;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs;
import com.iqoption.e.tb;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, bng = {"Lcom/iqoption/newsandupdates/Holder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/iqoption/databinding/NewsAndUpdatesItemBinding;", "listener", "Lcom/iqoption/newsandupdates/Listener;", "(Lcom/iqoption/databinding/NewsAndUpdatesItemBinding;Lcom/iqoption/newsandupdates/Listener;)V", "getBinding", "()Lcom/iqoption/databinding/NewsAndUpdatesItemBinding;", "bind", "", "item", "Lcom/iqoption/newsandupdates/NewsAndUpdatesItem;", "app_optionXRelease"})
/* compiled from: NewsAndUpdatesAdapter.kt */
public final class a extends ViewHolder {
    private final tb dJE;
    private final b dJF;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007¨\u0006\b"}, bng = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/widget/CompoundButton;", "kotlin.jvm.PlatformType", "checked", "", "onCheckedChanged", "com/iqoption/newsandupdates/Holder$bind$1$1"})
    /* compiled from: NewsAndUpdatesAdapter.kt */
    static final class a implements OnCheckedChangeListener {
        final /* synthetic */ a dJG;
        final /* synthetic */ f dJH;

        a(a aVar, f fVar) {
            this.dJG = aVar;
            this.dJH = fVar;
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            this.dJG.dJF.a(this.dJH, z);
        }
    }

    public a(tb tbVar, b bVar) {
        kotlin.jvm.internal.i.f(tbVar, "binding");
        kotlin.jvm.internal.i.f(bVar, CastExtraArgs.LISTENER);
        super(tbVar.getRoot());
        this.dJE = tbVar;
        this.dJF = bVar;
    }

    public final void a(f fVar) {
        kotlin.jvm.internal.i.f(fVar, "item");
        tb tbVar = this.dJE;
        tbVar.coA.setText(fVar.aQf());
        tbVar.coy.setText(fVar.aQg());
        SwitchCompat switchCompat = tbVar.coz;
        kotlin.jvm.internal.i.e(switchCompat, "newsAndUpdatesSwitch");
        switchCompat.setChecked(fVar.aQh());
        tbVar.coz.setOnCheckedChangeListener(new a(this, fVar));
    }
}
