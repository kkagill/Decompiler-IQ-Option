package com.iqoption.welcome.register;

import android.os.Build.VERSION;
import android.os.Bundle;
import android.telephony.PhoneNumberFormattingTextWatcher;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import androidx.lifecycle.Observer;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty;
import com.google.android.material.textfield.TextInputLayout;
import com.iqoption.core.util.ah;
import com.iqoption.core.util.v;
import com.iqoption.welcome.g.g;
import java.util.HashMap;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0014J\b\u0010\u0006\u001a\u00020\u0007H$J\b\u0010\b\u001a\u00020\tH$J\b\u0010\n\u001a\u00020\u000bH\u0002J\b\u0010\f\u001a\u00020\u000bH\u0002J\u001a\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0007H$J\b\u0010\u0014\u001a\u00020\u000eH\u0014J\u0010\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u0005H\u0014¨\u0006\u0017"}, bng = {"Lcom/iqoption/welcome/register/BaseEmailRegistrationFragment;", "Lcom/iqoption/welcome/register/BaseRegistrationFragment;", "Lcom/iqoption/welcome/register/email/EmailRegistrationViewModel;", "()V", "areFieldsValid", "", "emailEdit", "Landroid/widget/EditText;", "emailLayout", "Lcom/google/android/material/textfield/TextInputLayout;", "inputEmail", "", "inputPassword", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "passwordEdit", "register", "setFieldsEnabled", "enabled", "welcome_release"})
/* compiled from: BaseEmailRegistrationFragment.kt */
public abstract class a extends b<com.iqoption.welcome.register.email.b> {
    private HashMap apm;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u001c\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u000e\u0010\u0007\u001a\n \u0004*\u0004\u0018\u00010\b0\bH\n¢\u0006\u0002\b\t"}, bng = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "actionId", "", "<anonymous parameter 2>", "Landroid/view/KeyEvent;", "onEditorAction"})
    /* compiled from: BaseEmailRegistrationFragment.kt */
    static final class a implements OnEditorActionListener {
        final /* synthetic */ a emf;

        a(a aVar) {
            this.emf = aVar;
        }

        public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            if (i != 6) {
                return false;
            }
            v.j(this.emf.getActivity());
            this.emf.baA().requestFocus();
            return true;
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, bng = {"<anonymous>", "", "run"})
    /* compiled from: BaseEmailRegistrationFragment.kt */
    static final class b implements Runnable {
        final /* synthetic */ a emf;
        final /* synthetic */ d emg;

        b(a aVar, d dVar) {
            this.emf = aVar;
            this.emg = dVar;
        }

        public final void run() {
            d dVar = this.emg;
            Editable text = this.emf.bam().getText();
            kotlin.jvm.internal.i.e(text, "emailEdit().text");
            dVar.afterTextChanged(text);
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, bng = {"<anonymous>", "", "phoneEnabled", "", "kotlin.jvm.PlatformType", "onChanged", "(Ljava/lang/Boolean;)V"})
    /* compiled from: BaseEmailRegistrationFragment.kt */
    static final class c<T> implements Observer<Boolean> {
        final /* synthetic */ a emf;

        c(a aVar) {
            this.emf = aVar;
        }

        /* renamed from: f */
        public final void onChanged(Boolean bool) {
            kotlin.jvm.internal.i.e(bool, "phoneEnabled");
            if (bool.booleanValue()) {
                this.emf.bal().setHint(this.emf.getString(g.your_email_or_phone));
                this.emf.bam().addTextChangedListener(new com.iqoption.core.e.a());
                if (VERSION.SDK_INT >= 21) {
                    this.emf.bam().addTextChangedListener(new PhoneNumberFormattingTextWatcher());
                    return;
                } else {
                    this.emf.bam().addTextChangedListener(new com.iqoption.core.e.d());
                    return;
                }
            }
            this.emf.bal().setHint(this.emf.getString(g.your_email));
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, bng = {"com/iqoption/welcome/register/BaseEmailRegistrationFragment$onViewCreated$watcher$1", "Lcom/iqoption/core/util/TextWatcherAdapter;", "afterTextChanged", "", "s", "Landroid/text/Editable;", "welcome_release"})
    /* compiled from: BaseEmailRegistrationFragment.kt */
    public static final class d extends ah {
        final /* synthetic */ a emf;

        d(a aVar) {
            this.emf = aVar;
        }

        public void afterTextChanged(Editable editable) {
            kotlin.jvm.internal.i.f(editable, "s");
            super.afterTextChanged(editable);
            if (this.emf.baB().getVisibility() != 0) {
                this.emf.aNc();
            }
        }
    }

    public void Bj() {
        HashMap hashMap = this.apm;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public abstract TextInputLayout bal();

    public abstract EditText bam();

    public abstract EditText ban();

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        Bj();
    }

    public void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.i.f(view, Promotion.ACTION_VIEW);
        super.onViewCreated(view, bundle);
        ban().setOnEditorActionListener(new a(this));
        d dVar = new d(this);
        TextWatcher textWatcher = dVar;
        bam().addTextChangedListener(textWatcher);
        ban().addTextChangedListener(textWatcher);
        bam().post(new b(this, dVar));
        ((com.iqoption.welcome.register.email.b) bao()).bae().observe(this, new c(this));
    }

    /* Access modifiers changed, original: protected */
    public void register() {
        String bai = bai();
        String baj = baj();
        String string = com.iqoption.core.ext.a.q(this).getString(g.name);
        String string2 = com.iqoption.core.ext.a.q(this).getString(g.surname);
        com.iqoption.welcome.register.email.b bVar = (com.iqoption.welcome.register.email.b) bao();
        kotlin.jvm.internal.i.e(string, ConditionalUserProperty.NAME);
        kotlin.jvm.internal.i.e(string2, "surname");
        bVar.g(bai, baj, string, string2);
    }

    private final String bai() {
        CharSequence obj = bam().getText().toString();
        int length = obj.length() - 1;
        int i = 0;
        Object obj2 = null;
        while (i <= length) {
            Object obj3 = obj.charAt(obj2 == null ? i : length) <= ' ' ? 1 : null;
            if (obj2 == null) {
                if (obj3 == null) {
                    obj2 = 1;
                } else {
                    i++;
                }
            } else if (obj3 == null) {
                break;
            } else {
                length--;
            }
        }
        return obj.subSequence(i, length + 1).toString();
    }

    private final String baj() {
        return ban().getText().toString();
    }

    /* Access modifiers changed, original: protected */
    public void fx(boolean z) {
        bam().setEnabled(z);
        ban().setEnabled(z);
    }

    /* Access modifiers changed, original: protected */
    public boolean bak() {
        if ((((CharSequence) bai()).length() == 0 ? 1 : null) == null) {
            if ((((CharSequence) baj()).length() == 0 ? 1 : null) == null) {
                return true;
            }
        }
        return false;
    }
}
