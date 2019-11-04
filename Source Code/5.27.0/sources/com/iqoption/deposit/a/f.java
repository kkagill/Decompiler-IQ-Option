package com.iqoption.deposit.a;

import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs;
import com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty;
import com.iqoption.core.ext.g;
import com.iqoption.core.microservices.billing.response.extraparams.ExtraParamProperty;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\r\u001a\u00020\u000eH&J\b\u0010\u000f\u001a\u00020\u0010H&J\b\u0010\u0011\u001a\u00020\u0012H&J\u0010\u0010\u0013\u001a\u00020\u00142\b\u0010\t\u001a\u0004\u0018\u00010\u0003J\u0012\u0010\u0015\u001a\u00020\u00142\b\u0010\u0016\u001a\u0004\u0018\u00010\u0003H&J\u0012\u0010\u0017\u001a\u00020\u00142\b\u0010\u0018\u001a\u0004\u0018\u00010\u0003H&J\b\u0010\u0019\u001a\u00020\u0014H\u0004J\b\u0010\u001a\u001a\u00020\u0003H&J\b\u0010\u001b\u001a\u00020\u001cH&R\u0010\u0010\t\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\nR\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u001d"}, bng = {"Lcom/iqoption/deposit/constructor/FieldHolder;", "", "name", "", "isRequired", "", "listener", "Lcom/iqoption/deposit/constructor/InfoClickListener;", "(Ljava/lang/String;ZLcom/iqoption/deposit/constructor/InfoClickListener;)V", "hint", "()Z", "getName", "()Ljava/lang/String;", "editText", "Landroid/widget/EditText;", "infoButton", "Landroid/widget/ImageView;", "property", "Lcom/iqoption/core/microservices/billing/response/extraparams/ExtraParamProperty;", "setHint", "", "setTitle", "title", "showError", "message", "updateHintVisibility", "value", "view", "Landroid/view/View;", "deposit_release"})
/* compiled from: FieldHolders.kt */
public abstract class f {
    private final boolean bvs;
    private final g cyN;
    private final String name;
    private String wv;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006¸\u0006\u0000"}, bng = {"com/iqoption/core/ext/AndroidExt$setOnDelayedClickListener$1", "Lcom/iqoption/core/ext/OnDelayClickListener;", "onDelayClick", "", "v", "Landroid/view/View;", "core_release"})
    /* compiled from: AndroidExtensions.kt */
    public static final class a extends g {
        final /* synthetic */ f cyO;
        final /* synthetic */ ImageView cyP;
        final /* synthetic */ String cyQ;

        public a(f fVar, ImageView imageView, String str) {
            this.cyO = fVar;
            this.cyP = imageView;
            this.cyQ = str;
            super(0, 1, null);
        }

        public void M(View view) {
            kotlin.jvm.internal.i.f(view, "v");
            this.cyO.cyN.a(this.cyP, this.cyQ);
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006¸\u0006\u0000"}, bng = {"com/iqoption/core/ext/AndroidExt$setOnDelayedClickListener$1", "Lcom/iqoption/core/ext/OnDelayClickListener;", "onDelayClick", "", "v", "Landroid/view/View;", "core_release"})
    /* compiled from: AndroidExtensions.kt */
    public static final class b extends g {
        final /* synthetic */ f cyO;
        final /* synthetic */ ImageView cyP;
        final /* synthetic */ String cyR;

        public b(f fVar, ImageView imageView, String str) {
            this.cyO = fVar;
            this.cyP = imageView;
            this.cyR = str;
            super(0, 1, null);
        }

        public void M(View view) {
            kotlin.jvm.internal.i.f(view, "v");
            this.cyO.cyN.a(this.cyP, this.cyR);
        }
    }

    public abstract ExtraParamProperty aqg();

    public abstract View aqm();

    public abstract EditText aqn();

    public abstract ImageView aqo();

    public abstract void hH(String str);

    public abstract void setTitle(String str);

    public abstract String value();

    public f(String str, boolean z, g gVar) {
        kotlin.jvm.internal.i.f(str, ConditionalUserProperty.NAME);
        kotlin.jvm.internal.i.f(gVar, CastExtraArgs.LISTENER);
        this.name = str;
        this.bvs = z;
        this.cyN = gVar;
    }

    public final String getName() {
        return this.name;
    }

    public final boolean wo() {
        return this.bvs;
    }

    public final void hI(String str) {
        ImageView aqo = aqo();
        if (str != null) {
            aqo.setOnClickListener(new a(this, aqo, str));
        }
        this.wv = str;
        aqp();
    }

    /* Access modifiers changed, original: protected|final */
    public final void aqp() {
        ImageView aqo = aqo();
        String str = this.wv;
        CharSequence charSequence = str;
        Object obj = null;
        Object obj2 = (charSequence == null || u.Y(charSequence)) ? 1 : null;
        if (obj2 == null) {
            charSequence = aqn().getError();
            if (charSequence == null || charSequence.length() == 0) {
                obj = 1;
            }
            if (obj != null) {
                View view = aqo;
                com.iqoption.core.ext.a.ak(view);
                view.setOnClickListener(new b(this, aqo, str));
                return;
            }
        }
        com.iqoption.core.ext.a.al(aqo);
    }
}
