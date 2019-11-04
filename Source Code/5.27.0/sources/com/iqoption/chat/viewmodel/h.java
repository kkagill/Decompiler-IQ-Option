package com.iqoption.chat.viewmodel;

import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProviders;
import kotlin.Pair;
import kotlin.i;
import kotlin.j;

@i(bne = {1, 1, 15}, bnf = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0011\u001a\u00020\u0010J\u0006\u0010\u0012\u001a\u00020\u0010J\u0006\u0010\u000b\u001a\u00020\u0010J\u000e\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\nJ\u0006\u0010\u0015\u001a\u00020\u0010R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0006R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0006R#\u0010\b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n0\t0\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\fX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\fX\u0004¢\u0006\u0002\n\u0000R \u0010\u000e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n0\t0\fX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, bng = {"Lcom/iqoption/chat/viewmodel/InteractionViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "isRoomOpened", "Landroidx/lifecycle/LiveData;", "", "()Landroidx/lifecycle/LiveData;", "isUpdateChatListRequested", "isUpdateChatRequested", "Lkotlin/Pair;", "", "openRoom", "Landroidx/lifecycle/MutableLiveData;", "updateChatListRequested", "updateChatRequested", "closeRoom", "", "notifyUpdateChatCompleted", "notifyUpdateChatListCompleted", "requestUpdateChat", "roomId", "requestUpdateChatList", "Companion", "chat_release"})
/* compiled from: InteractionViewModel.kt */
public final class h extends ViewModel {
    public static final a aXm = new a();
    private final MutableLiveData<Boolean> aXg = new MutableLiveData();
    private final MutableLiveData<Pair<Boolean, String>> aXh = new MutableLiveData();
    private final MutableLiveData<Boolean> aXi = new MutableLiveData();
    private final LiveData<Boolean> aXj = this.aXg;
    private final LiveData<Pair<Boolean, String>> aXk = this.aXh;
    private final LiveData<Boolean> aXl = this.aXi;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\b¨\u0006\t"}, bng = {"Lcom/iqoption/chat/viewmodel/InteractionViewModel$Companion;", "", "()V", "get", "Lcom/iqoption/chat/viewmodel/InteractionViewModel;", "f", "Landroidx/fragment/app/Fragment;", "a", "Landroidx/fragment/app/FragmentActivity;", "chat_release"})
    /* compiled from: InteractionViewModel.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final h h(FragmentActivity fragmentActivity) {
            kotlin.jvm.internal.i.f(fragmentActivity, "a");
            ViewModel viewModel = ViewModelProviders.of(fragmentActivity).get(h.class);
            kotlin.jvm.internal.i.e(viewModel, "ViewModelProviders.of(a)…ionViewModel::class.java]");
            return (h) viewModel;
        }
    }

    public final LiveData<Boolean> Tt() {
        return this.aXj;
    }

    public final LiveData<Pair<Boolean, String>> Tu() {
        return this.aXk;
    }

    public final LiveData<Boolean> Tv() {
        return this.aXl;
    }

    public final void Tw() {
        this.aXg.setValue(Boolean.valueOf(false));
    }

    public final void fe(String str) {
        kotlin.jvm.internal.i.f(str, "roomId");
        this.aXh.setValue(j.x(Boolean.valueOf(true), str));
    }

    /* JADX WARNING: Missing block: B:3:0x0015, code skipped:
            if (r2 != null) goto L_0x001a;
     */
    public final void Tx() {
        /*
        r3 = this;
        r0 = r3.aXh;
        r1 = 0;
        r1 = java.lang.Boolean.valueOf(r1);
        r2 = r0.getValue();
        r2 = (kotlin.Pair) r2;
        if (r2 == 0) goto L_0x0018;
    L_0x000f:
        r2 = r2.bni();
        r2 = (java.lang.String) r2;
        if (r2 == 0) goto L_0x0018;
    L_0x0017:
        goto L_0x001a;
    L_0x0018:
        r2 = "";
    L_0x001a:
        r1 = kotlin.j.x(r1, r2);
        r0.setValue(r1);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iqoption.chat.viewmodel.h.Tx():void");
    }

    public final void Ty() {
        this.aXi.setValue(Boolean.valueOf(true));
    }

    public final void Tz() {
        this.aXi.setValue(Boolean.valueOf(false));
    }
}
