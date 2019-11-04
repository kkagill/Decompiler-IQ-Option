package com.iqoption.chat.fragment;

import android.animation.LayoutTransition;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.google.gson.JsonObject;
import com.iqoption.chat.a.bl;
import com.iqoption.chat.component.aw;
import com.iqoption.chat.e.h;
import com.iqoption.chat.e.j;
import com.iqoption.chat.viewmodel.k;
import com.iqoption.core.ext.g;
import com.iqoption.core.microservices.chat.response.ChatRoomType;
import com.iqoption.core.microservices.chat.response.l;
import com.iqoption.core.util.ah;
import com.iqoption.core.util.ai;
import kotlin.TypeCastException;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u0000 \u001a2\u00020\u00012\u00020\u0002:\u0001\u001aB\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\t\u0010\f\u001a\u00020\rH\u0001J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u000fH\u0016J\u0012\u0010\u0015\u001a\u00020\u00012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\n\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, bng = {"Lcom/iqoption/chat/fragment/SendDelegate;", "Lcom/iqoption/chat/fragment/RoomBottomBarDelegate;", "Landroidx/lifecycle/LifecycleOwner;", "params", "Lcom/iqoption/chat/fragment/RoomBottomBarDelegate$Params;", "(Lcom/iqoption/chat/fragment/RoomBottomBarDelegate$Params;)V", "binding", "Lcom/iqoption/chat/databinding/ChatRoomSendLayoutBinding;", "lastHandledTime", "", "viewModel", "Lcom/iqoption/chat/viewmodel/RoomViewModel;", "getLifecycle", "Landroidx/lifecycle/Lifecycle;", "isMessageInteractionsAvailable", "", "onReplyMessage", "", "message", "Lcom/iqoption/core/microservices/chat/response/ChatMessage;", "withText", "onStateChanged", "state", "Lcom/iqoption/core/microservices/chat/response/ChatState;", "save", "Landroid/os/Bundle;", "Companion", "chat_release"})
/* compiled from: RoomBottomBarDelegates.kt */
final class ab extends s implements LifecycleOwner {
    public static final f aVt = new f();
    private final /* synthetic */ g aUC;
    private final k aUJ = SC().Sf();
    private final bl aVr = ((bl) com.iqoption.core.ext.a.a(SC().Se(), h.chat_room_send_layout, null, false, 6, null));
    private long aVs;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, bng = {"Lcom/iqoption/chat/fragment/SendDelegate$Companion;", "", "()V", "KEY_LAST_HANDLED_TIME", "", "chat_release"})
    /* compiled from: RoomBottomBarDelegates.kt */
    public static final class f {
        private f() {
        }

        public /* synthetic */ f(f fVar) {
            this();
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006¸\u0006\u0000"}, bng = {"com/iqoption/chat/fragment/SendDelegate$2$5", "Lcom/iqoption/core/util/TextWatcherAdapter;", "afterTextChanged", "", "s", "Landroid/text/Editable;", "chat_release"})
    /* compiled from: RoomBottomBarDelegates.kt */
    public static final class a extends ah {
        final /* synthetic */ ab $lifecycleOwner$inlined;
        final /* synthetic */ com.iqoption.chat.fragment.s.b $params$inlined;
        final /* synthetic */ ab this$0;

        a(ab abVar, ab abVar2, com.iqoption.chat.fragment.s.b bVar) {
            this.this$0 = abVar;
            this.$lifecycleOwner$inlined = abVar2;
            this.$params$inlined = bVar;
        }

        public void afterTextChanged(Editable editable) {
            kotlin.jvm.internal.i.f(editable, "s");
            super.afterTextChanged(editable);
            this.this$0.aUJ.fl(editable.toString());
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006¸\u0006\u0000"}, bng = {"com/iqoption/chat/fragment/SendDelegate$2$6", "Lcom/iqoption/core/util/TextWatcherAdapter;", "afterTextChanged", "", "s", "Landroid/text/Editable;", "chat_release"})
    /* compiled from: RoomBottomBarDelegates.kt */
    public static final class b extends ah {
        final /* synthetic */ ab $lifecycleOwner$inlined;
        final /* synthetic */ com.iqoption.chat.fragment.s.b $params$inlined;
        final /* synthetic */ ab this$0;

        b(ab abVar, ab abVar2, com.iqoption.chat.fragment.s.b bVar) {
            this.this$0 = abVar;
            this.$lifecycleOwner$inlined = abVar2;
            this.$params$inlined = bVar;
        }

        public void afterTextChanged(Editable editable) {
            kotlin.jvm.internal.i.f(editable, "s");
            super.afterTextChanged(editable);
            this.this$0.aUJ.TO();
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006¸\u0006\u0007"}, bng = {"com/iqoption/core/ext/AndroidExt$setOnDelayedClickListener$1", "Lcom/iqoption/core/ext/OnDelayClickListener;", "onDelayClick", "", "v", "Landroid/view/View;", "core_release", "com/iqoption/chat/fragment/SendDelegate$$special$$inlined$setOnDelayedClickListener$1"})
    /* compiled from: AndroidExtensions.kt */
    public static final class c extends g {
        final /* synthetic */ ab $lifecycleOwner$inlined;
        final /* synthetic */ com.iqoption.chat.fragment.s.b $params$inlined;
        final /* synthetic */ ab this$0;

        public c(ab abVar, ab abVar2, com.iqoption.chat.fragment.s.b bVar) {
            this.this$0 = abVar;
            this.$lifecycleOwner$inlined = abVar2;
            this.$params$inlined = bVar;
            super(0, 1, null);
        }

        public void M(View view) {
            kotlin.jvm.internal.i.f(view, "v");
            this.this$0.SC().Sh();
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006¸\u0006\u0007"}, bng = {"com/iqoption/core/ext/AndroidExt$setOnDelayedClickListener$1", "Lcom/iqoption/core/ext/OnDelayClickListener;", "onDelayClick", "", "v", "Landroid/view/View;", "core_release", "com/iqoption/chat/fragment/SendDelegate$$special$$inlined$setOnDelayedClickListener$2"})
    /* compiled from: AndroidExtensions.kt */
    public static final class d extends g {
        final /* synthetic */ ab $lifecycleOwner$inlined;
        final /* synthetic */ com.iqoption.chat.fragment.s.b $params$inlined;
        final /* synthetic */ bl aVu;
        final /* synthetic */ ab this$0;

        public d(bl blVar, ab abVar, ab abVar2, com.iqoption.chat.fragment.s.b bVar) {
            this.aVu = blVar;
            this.this$0 = abVar;
            this.$lifecycleOwner$inlined = abVar2;
            this.$params$inlined = bVar;
            super(0, 1, null);
        }

        public void M(View view) {
            kotlin.jvm.internal.i.f(view, "v");
            com.iqoption.core.microservices.chat.response.k kVar = (com.iqoption.core.microservices.chat.response.k) this.this$0.aUJ.TD().getValue();
            if (kVar != null) {
                com.iqoption.core.analytics.d EC = com.iqoption.core.d.EC();
                JsonObject jsonObject = new JsonObject();
                jsonObject.addProperty("room_id", kVar.getId());
                jsonObject.addProperty("room_locale", kVar.getLocale());
                jsonObject.addProperty("room_is_regulated", Boolean.valueOf(kVar.Er()));
                jsonObject.addProperty("room_is_public", Boolean.valueOf(kVar.isPublic()));
                jsonObject.addProperty("room_type", kVar.SG().name());
                EC.a("chat_send-message", jsonObject);
            }
            ProgressBar progressBar = this.aVu.aRR;
            kotlin.jvm.internal.i.e(progressBar, "pbSend");
            com.iqoption.core.ext.a.ak(progressBar);
            ImageView imageView = this.aVu.aRw;
            String str = "btnSend";
            kotlin.jvm.internal.i.e(imageView, str);
            com.iqoption.core.ext.a.hide(imageView);
            k b = this.this$0.aUJ;
            EditText editText = this.aVu.aRQ;
            kotlin.jvm.internal.i.e(editText, "messageInput");
            String obj = editText.getText().toString();
            if (obj != null) {
                b.fk(v.trim(obj).toString());
                imageView = this.aVu.aRw;
                kotlin.jvm.internal.i.e(imageView, str);
                imageView.setEnabled(false);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, bng = {"com/iqoption/chat/fragment/SendDelegate$2$4", "Lcom/iqoption/core/util/TextWatcherAdapter;", "afterTextChanged", "", "s", "Landroid/text/Editable;", "chat_release"})
    /* compiled from: RoomBottomBarDelegates.kt */
    public static final class e extends ah {
        final /* synthetic */ kotlin.jvm.a.b aVv;

        e(kotlin.jvm.a.b bVar) {
            this.aVv = bVar;
        }

        public void afterTextChanged(Editable editable) {
            kotlin.jvm.internal.i.f(editable, "s");
            super.afterTextChanged(editable);
            this.aVv.invoke(editable);
        }
    }

    public boolean SE() {
        return true;
    }

    @NonNull
    public Lifecycle getLifecycle() {
        return this.aUC.getLifecycle();
    }

    public ab(com.iqoption.chat.fragment.s.b bVar) {
        ImageView imageView;
        kotlin.jvm.internal.i.f(bVar, "params");
        super(bVar);
        this.aUC = bVar.SC();
        ViewGroup Se = SC().Se();
        Se.removeAllViews();
        Se.addView(this.aVr.getRoot());
        Bundle SI = bVar.SI();
        if (SI != null) {
            this.aVs = SI.getLong("key.lastHandledTime");
        }
        ab abVar = this;
        bl blVar = this.aVr;
        this.aUJ.TF().observe(abVar, new aw(new SendDelegate$$special$$inlined$apply$lambda$1(this, abVar, bVar), new SendDelegate$$special$$inlined$apply$lambda$2(blVar, this, abVar, bVar)));
        LinearLayout linearLayout = blVar.aRl;
        kotlin.jvm.internal.i.e(linearLayout, "contentLayout");
        LayoutTransition anP = ai.bRN.anP();
        anP.setDuration(200);
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(blVar.aRw, new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(View.ALPHA, new float[]{0.0f, 1.0f}), PropertyValuesHolder.ofFloat(View.SCALE_X, new float[]{0.05f, 1.0f}), PropertyValuesHolder.ofFloat(View.SCALE_Y, new float[]{0.05f, 1.0f})});
        anP.setAnimator(2, ofPropertyValuesHolder);
        anP.setDuration(2, 200);
        anP.setStartDelay(2, 150);
        anP.setInterpolator(2, new FastOutSlowInInterpolator());
        ofPropertyValuesHolder = ofPropertyValuesHolder.clone();
        kotlin.jvm.internal.i.e(ofPropertyValuesHolder, "appearing.clone()");
        ofPropertyValuesHolder.setTarget(blVar.aRw);
        anP.setAnimator(3, ofPropertyValuesHolder);
        anP.setStartDelay(3, 0);
        anP.setInterpolator(3, new com.iqoption.core.ui.animation.d(null, 1, null));
        anP.setStartDelay(1, 150);
        linearLayout.setLayoutTransition(anP);
        String str = "btnAttach";
        if (com.iqoption.core.ext.c.b(bVar.SG(), ChatRoomType.SUPPORT, ChatRoomType.VIP)) {
            imageView = blVar.aRP;
            kotlin.jvm.internal.i.e(imageView, str);
            imageView.setVisibility(0);
        } else {
            imageView = blVar.aRP;
            kotlin.jvm.internal.i.e(imageView, str);
            imageView.setVisibility(8);
        }
        kotlin.jvm.a.b sendDelegate$2$updateSendButton$1 = new SendDelegate$2$updateSendButton$1(blVar);
        sendDelegate$2$updateSendButton$1.invoke("");
        blVar.aRQ.addTextChangedListener(new e(sendDelegate$2$updateSendButton$1));
        if (bVar.SG() == ChatRoomType.SUPPORT || bVar.SG() == ChatRoomType.VIP) {
            blVar.aRQ.addTextChangedListener(new a(this, abVar, bVar));
        } else if (bVar.SG() == ChatRoomType.GLOBAL) {
            blVar.aRQ.addTextChangedListener(new b(this, abVar, bVar));
        }
        imageView = blVar.aRP;
        kotlin.jvm.internal.i.e(imageView, str);
        imageView.setOnClickListener(new c(this, abVar, bVar));
        imageView = blVar.aRw;
        kotlin.jvm.internal.i.e(imageView, "btnSend");
        imageView.setOnClickListener(new d(blVar, this, abVar, bVar));
    }

    public s a(l lVar) {
        if (lVar == null) {
            SC().Sg();
            return new h(SF());
        }
        s sVar;
        int i = ac.aob[SF().SG().ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3 || i == 4 || i == 5) {
                    sVar = this;
                } else {
                    sVar = new h(SF());
                }
            } else if (lVar.acC()) {
                SC().Sg();
                sVar = new b(SF(), getString(j.you_have_been_banned, new Object[0]));
            } else {
                sVar = this;
            }
        } else if (lVar.acC()) {
            SC().Sg();
            sVar = new b(SF(), getString(j.you_have_been_banned, new Object[0]));
        } else if (lVar.acD() < lVar.acE()) {
            SC().Sg();
            sVar = new b(SF(), u.a(this, lVar));
        } else {
            sVar = this;
        }
        return sVar;
    }

    public Bundle SD() {
        Bundle bundle = new Bundle();
        bundle.putLong("key.lastHandledTime", this.aVs);
        return bundle;
    }

    public void a(com.iqoption.core.microservices.chat.response.e eVar, boolean z) {
        String stringBuilder;
        kotlin.jvm.internal.i.f(eVar, "message");
        StringBuilder stringBuilder2;
        if (z) {
            stringBuilder2 = new StringBuilder();
            stringBuilder2.append(getString(j.sender_wrote_message, eVar.acb(), eVar.getText()));
            stringBuilder2.append(10);
            stringBuilder = stringBuilder2.toString();
        } else {
            stringBuilder2 = new StringBuilder();
            stringBuilder2.append(eVar.acb());
            stringBuilder2.append(", ");
            stringBuilder = stringBuilder2.toString();
        }
        this.aVr.aRQ.setText(stringBuilder);
        this.aVr.aRQ.setSelection(stringBuilder.length());
        this.aVr.aRQ.requestFocus();
        g SC = SC();
        EditText editText = this.aVr.aRQ;
        kotlin.jvm.internal.i.e(editText, "binding.messageInput");
        SC.ad(editText);
    }
}
