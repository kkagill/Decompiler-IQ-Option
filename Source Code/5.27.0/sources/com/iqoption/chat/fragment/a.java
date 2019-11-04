package com.iqoption.chat.fragment;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.provider.MediaStore.Images.Media;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.iqoption.chat.a.aa;
import com.iqoption.chat.component.ReadPermissionTracker;
import com.iqoption.chat.component.aw;
import com.iqoption.chat.viewmodel.r;
import com.iqoption.core.util.v;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.TypeCastException;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.k;
import kotlin.l;

@kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 <2\u00020\u0001:\u0001<B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010 \u001a\u00020\u00152\b\b\u0002\u0010!\u001a\u00020\"H\u0002J \u0010#\u001a\u00020\u00152\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\b\b\u0002\u0010!\u001a\u00020\"H\u0002J\u0012\u0010%\u001a\u0004\u0018\u00010&2\u0006\u0010'\u001a\u00020(H\u0002J\u0012\u0010)\u001a\u0004\u0018\u00010&2\u0006\u0010'\u001a\u00020(H\u0002J\"\u0010*\u001a\u00020\u00152\u0006\u0010+\u001a\u00020\u00172\u0006\u0010,\u001a\u00020\u00172\b\u0010-\u001a\u0004\u0018\u00010.H\u0016J\u0012\u0010/\u001a\u00020\"2\b\u00100\u001a\u0004\u0018\u000101H\u0014J&\u00102\u001a\u0004\u0018\u0001032\u0006\u00104\u001a\u0002052\b\u00106\u001a\u0004\u0018\u0001072\b\u00108\u001a\u0004\u0018\u00010\u0004H\u0016J\b\u00109\u001a\u00020\u0015H\u0016J\b\u0010:\u001a\u00020\u0015H\u0002J\b\u0010;\u001a\u00020\u0015H\u0002R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u0012\u0010\t\u001a\u0006\u0012\u0002\b\u00030\nX.¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX.¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u000e¢\u0006\u0002\n\u0000R\"\u0010\u0011\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u0013\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0012X\u000e¢\u0006\u0002\n\u0000R$\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u00178B@BX\u000e¢\u0006\f\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX.¢\u0006\u0002\n\u0000¨\u0006="}, bng = {"Lcom/iqoption/chat/fragment/AttachmentPickerFragment;", "Lcom/iqoption/core/ui/fragment/IQFragment;", "()V", "args", "Landroid/os/Bundle;", "getArgs", "()Landroid/os/Bundle;", "args$delegate", "Lkotlin/Lazy;", "behavior", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "binding", "Lcom/iqoption/chat/databinding/ChatFragmentAttachmentPickerBinding;", "chatName", "", "consumedSelectEventTime", "", "onSend", "Lkotlin/Function1;", "", "Landroid/net/Uri;", "", "value", "", "savedInputMode", "getSavedInputMode", "()I", "setSavedInputMode", "(I)V", "successResult", "viewModel", "Lcom/iqoption/chat/viewmodel/AttachmentPickerViewModel;", "close", "animate", "", "closeSuccess", "result", "getPreviewView", "Landroid/widget/ImageView;", "preview", "Lcom/iqoption/chat/viewmodel/AttachmentPreview;", "getSelectorView", "onActivityResult", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "onBackPressed", "childFragmentManager", "Landroidx/fragment/app/FragmentManager;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "onDestroyView", "takeFile", "takeImage", "Companion", "chat_release"})
/* compiled from: AttachmentPickerFragment.kt */
public final class a extends com.iqoption.core.ui.fragment.d {
    private static final String TAG = a.class.getName();
    public static final a aSp = new a();
    static final /* synthetic */ kotlin.reflect.j[] anY = new kotlin.reflect.j[]{k.a(new PropertyReference1Impl(k.G(a.class), "args", "getArgs()Landroid/os/Bundle;"))};
    private final kotlin.d aSh = g.c(new AttachmentPickerFragment$args$2(this));
    private com.iqoption.chat.viewmodel.a aSi;
    private aa aSj;
    private BottomSheetBehavior<?> aSk;
    private String aSl = "";
    private kotlin.jvm.a.b<? super List<? extends Uri>, l> aSm;
    private List<? extends Uri> aSn;
    private long aSo;

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J(\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00042\u0018\u0010\u000e\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0004\u0012\u00020\u00120\u000fR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u0019\u0010\u0007\u001a\n \b*\u0004\u0018\u00010\u00040\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, bng = {"Lcom/iqoption/chat/fragment/AttachmentPickerFragment$Companion;", "", "()V", "ARG_SAVED_INPUT_MODE", "", "REQUEST_PICK", "", "TAG", "kotlin.jvm.PlatformType", "getTAG", "()Ljava/lang/String;", "newInstance", "Lcom/iqoption/chat/fragment/AttachmentPickerFragment;", "chatName", "onSend", "Lkotlin/Function1;", "", "Landroid/net/Uri;", "", "chat_release"})
    /* compiled from: AttachmentPickerFragment.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final String Bx() {
            return a.TAG;
        }

        public final a b(String str, kotlin.jvm.a.b<? super List<? extends Uri>, l> bVar) {
            kotlin.jvm.internal.i.f(str, "chatName");
            kotlin.jvm.internal.i.f(bVar, "onSend");
            a aVar = new a();
            aVar.setRetainInstance(true);
            aVar.setArguments(new Bundle());
            aVar.aSl = str;
            aVar.aSm = bVar;
            return aVar;
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, bng = {"<anonymous>", "", "run", "com/iqoption/chat/fragment/AttachmentPickerFragment$onCreateView$1$2"})
    /* compiled from: AttachmentPickerFragment.kt */
    static final class e implements Runnable {
        final /* synthetic */ FragmentActivity $activity$inlined;
        final /* synthetic */ Bundle $savedInstanceState$inlined;
        final /* synthetic */ a this$0;

        e(a aVar, FragmentActivity fragmentActivity, Bundle bundle) {
            this.this$0 = aVar;
            this.$activity$inlined = fragmentActivity;
            this.$savedInstanceState$inlined = bundle;
        }

        public final void run() {
            a.a(this.this$0).setState(3);
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH\u0016¨\u0006\u000b¸\u0006\u0000"}, bng = {"com/iqoption/chat/fragment/AttachmentPickerFragment$onCreateView$1$1", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior$BottomSheetCallback;", "onSlide", "", "bottomSheet", "Landroid/view/View;", "slideOffset", "", "onStateChanged", "newState", "", "chat_release"})
    /* compiled from: AttachmentPickerFragment.kt */
    public static final class b extends com.google.android.material.bottomsheet.BottomSheetBehavior.a {
        final /* synthetic */ FragmentActivity $activity$inlined;
        final /* synthetic */ Bundle $savedInstanceState$inlined;
        final /* synthetic */ com.iqoption.core.graphics.a.e aSq;
        final /* synthetic */ a this$0;

        b(com.iqoption.core.graphics.a.e eVar, a aVar, FragmentActivity fragmentActivity, Bundle bundle) {
            this.aSq = eVar;
            this.this$0 = aVar;
            this.$activity$inlined = fragmentActivity;
            this.$savedInstanceState$inlined = bundle;
        }

        public void d(View view, float f) {
            kotlin.jvm.internal.i.f(view, "bottomSheet");
            this.aSq.eN(c.au(((float) 255) * f));
        }

        public void b(View view, int i) {
            kotlin.jvm.internal.i.f(view, "bottomSheet");
            if (i == 4 && this.this$0.isAdded()) {
                this.this$0.close(false);
            }
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006¸\u0006\u0007"}, bng = {"com/iqoption/core/ext/AndroidExt$setOnDelayedClickListener$1", "Lcom/iqoption/core/ext/OnDelayClickListener;", "onDelayClick", "", "v", "Landroid/view/View;", "core_release", "com/iqoption/chat/fragment/AttachmentPickerFragment$$special$$inlined$setOnDelayedClickListener$3"})
    /* compiled from: AndroidExtensions.kt */
    public static final class c extends com.iqoption.core.ext.g {
        final /* synthetic */ FragmentActivity $activity$inlined;
        final /* synthetic */ Bundle $savedInstanceState$inlined;
        final /* synthetic */ a this$0;

        public c(a aVar, FragmentActivity fragmentActivity, Bundle bundle) {
            this.this$0 = aVar;
            this.$activity$inlined = fragmentActivity;
            this.$savedInstanceState$inlined = bundle;
            super(0, 1, null);
        }

        public void M(View view) {
            kotlin.jvm.internal.i.f(view, "v");
            this.this$0.RU();
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0005¸\u0006\u0000"}, bng = {"com/iqoption/chat/fragment/AttachmentPickerFragment$onCreateView$1$12", "Lcom/iqoption/chat/component/ReadPermissionTracker$Callback;", "onDenied", "", "onGranted", "chat_release"})
    /* compiled from: AttachmentPickerFragment.kt */
    public static final class d implements com.iqoption.chat.component.ReadPermissionTracker.a {
        final /* synthetic */ FragmentActivity $activity$inlined;
        final /* synthetic */ Bundle $savedInstanceState$inlined;
        final /* synthetic */ a this$0;

        d(a aVar, FragmentActivity fragmentActivity, Bundle bundle) {
            this.this$0 = aVar;
            this.$activity$inlined = fragmentActivity;
            this.$savedInstanceState$inlined = bundle;
        }

        public void RB() {
            a.b(this.this$0).Td();
        }

        public void RC() {
            a.a(this.this$0, false, 1, null);
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, bng = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "onChanged", "(Ljava/lang/Integer;)V", "com/iqoption/chat/fragment/AttachmentPickerFragment$onCreateView$1$5"})
    /* compiled from: AttachmentPickerFragment.kt */
    static final class f<T> implements Observer<Integer> {
        final /* synthetic */ FragmentActivity $activity$inlined;
        final /* synthetic */ Bundle $savedInstanceState$inlined;
        final /* synthetic */ aa aSr;
        final /* synthetic */ a this$0;

        f(aa aaVar, a aVar, FragmentActivity fragmentActivity, Bundle bundle) {
            this.aSr = aaVar;
            this.this$0 = aVar;
            this.$activity$inlined = fragmentActivity;
            this.$savedInstanceState$inlined = bundle;
        }

        /* renamed from: b */
        public final void onChanged(Integer num) {
            if (num != null) {
                String str = "labelAddSend";
                if (kotlin.jvm.internal.i.compare(num.intValue(), 0) > 0) {
                    this.aSr.aRm.setImageResource(com.iqoption.chat.e.e.ic_send_crypto_black);
                    TextView textView = this.aSr.aRn;
                    kotlin.jvm.internal.i.e(textView, str);
                    textView.setTypeface(com.iqoption.core.ext.a.d((ViewDataBinding) this.aSr, com.iqoption.chat.e.f.medium));
                    textView = this.aSr.aRn;
                    kotlin.jvm.internal.i.e(textView, str);
                    a aVar = this.this$0;
                    int i = com.iqoption.chat.e.j.send_n1;
                    Object[] objArr = new Object[1];
                    String quantityString = this.this$0.getResources().getQuantityString(com.iqoption.chat.e.i.photos, num.intValue(), new Object[]{num});
                    kotlin.jvm.internal.i.e(quantityString, "resources.getQuantityStr…R.plurals.photos, it, it)");
                    if (quantityString != null) {
                        quantityString = quantityString.toLowerCase();
                        kotlin.jvm.internal.i.e(quantityString, "(this as java.lang.String).toLowerCase()");
                        objArr[0] = quantityString;
                        textView.setText(aVar.getString(i, objArr));
                        return;
                    }
                    throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                }
                this.aSr.aRm.setImageResource(com.iqoption.chat.e.e.ic_library_add_white_24dp);
                TextView textView2 = this.aSr.aRn;
                kotlin.jvm.internal.i.e(textView2, str);
                textView2.setTypeface(com.iqoption.core.ext.a.d((ViewDataBinding) this.aSr, com.iqoption.chat.e.f.regular));
                textView2 = this.aSr.aRn;
                kotlin.jvm.internal.i.e(textView2, str);
                textView2.setText(this.this$0.getString(com.iqoption.chat.e.j.add_photos));
            }
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006¸\u0006\u0007"}, bng = {"com/iqoption/core/ext/AndroidExt$setOnDelayedClickListener$1", "Lcom/iqoption/core/ext/OnDelayClickListener;", "onDelayClick", "", "v", "Landroid/view/View;", "core_release", "com/iqoption/chat/fragment/AttachmentPickerFragment$$special$$inlined$setOnDelayedClickListener$1"})
    /* compiled from: AndroidExtensions.kt */
    public static final class g extends com.iqoption.core.ext.g {
        final /* synthetic */ FragmentActivity $activity$inlined;
        final /* synthetic */ Bundle $savedInstanceState$inlined;
        final /* synthetic */ a this$0;

        public g(a aVar, FragmentActivity fragmentActivity, Bundle bundle) {
            this.this$0 = aVar;
            this.$activity$inlined = fragmentActivity;
            this.$savedInstanceState$inlined = bundle;
            super(0, 1, null);
        }

        public void M(View view) {
            kotlin.jvm.internal.i.f(view, "v");
            a.a(this.this$0, false, 1, null);
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006¸\u0006\u0007"}, bng = {"com/iqoption/core/ext/AndroidExt$setOnDelayedClickListener$1", "Lcom/iqoption/core/ext/OnDelayClickListener;", "onDelayClick", "", "v", "Landroid/view/View;", "core_release", "com/iqoption/chat/fragment/AttachmentPickerFragment$$special$$inlined$setOnDelayedClickListener$2"})
    /* compiled from: AndroidExtensions.kt */
    public static final class h extends com.iqoption.core.ext.g {
        final /* synthetic */ FragmentActivity $activity$inlined;
        final /* synthetic */ Bundle $savedInstanceState$inlined;
        final /* synthetic */ a this$0;

        public h(a aVar, FragmentActivity fragmentActivity, Bundle bundle) {
            this.this$0 = aVar;
            this.$activity$inlined = fragmentActivity;
            this.$savedInstanceState$inlined = bundle;
            super(0, 1, null);
        }

        public void M(View view) {
            kotlin.jvm.internal.i.f(view, "v");
            Integer num = (Integer) a.b(this.this$0).Tb().getValue();
            if (num != null && num.intValue() == 0) {
                this.this$0.RT();
                return;
            }
            List list = (List) a.b(this.this$0).Ta().getValue();
            if (list != null) {
                Collection arrayList = new ArrayList();
                for (Object next : list) {
                    if (((com.iqoption.chat.viewmodel.b) next).isSelected()) {
                        arrayList.add(next);
                    }
                }
                Iterable<com.iqoption.chat.viewmodel.b> iterable = (List) arrayList;
                Collection arrayList2 = new ArrayList(n.e(iterable, 10));
                for (com.iqoption.chat.viewmodel.b fI : iterable) {
                    arrayList2.add(Uri.fromFile(fI.fI()));
                }
                list = (List) arrayList2;
            } else {
                list = null;
            }
            if (list != null) {
                a.a(this.this$0, list, false, 2, null);
            }
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, bng = {"<anonymous>", "", "it", "", "Lcom/iqoption/chat/viewmodel/AttachmentPreview;", "kotlin.jvm.PlatformType", "onChanged"})
    /* compiled from: AttachmentPickerFragment.kt */
    static final class i<T> implements Observer<List<? extends com.iqoption.chat.viewmodel.b>> {
        final /* synthetic */ com.iqoption.chat.component.c $adapter;

        i(com.iqoption.chat.component.c cVar) {
            this.$adapter = cVar;
        }

        /* renamed from: u */
        public final void onChanged(List<com.iqoption.chat.viewmodel.b> list) {
            if (list != null) {
                com.iqoption.chat.component.c.a(this.$adapter, list, null, 2, null);
            }
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "Lcom/iqoption/chat/viewmodel/TransitionViewModel$Event;", "kotlin.jvm.PlatformType", "onChanged"})
    /* compiled from: AttachmentPickerFragment.kt */
    static final class j<T> implements Observer<com.iqoption.chat.viewmodel.r.b> {
        final /* synthetic */ com.iqoption.chat.component.c $adapter;

        j(com.iqoption.chat.component.c cVar) {
            this.$adapter = cVar;
        }

        /* renamed from: a */
        public final void onChanged(com.iqoption.chat.viewmodel.r.b bVar) {
            if (bVar != null) {
                this.$adapter.b(bVar.TW(), bVar.isHidden());
            }
        }
    }

    private final Bundle RR() {
        kotlin.d dVar = this.aSh;
        kotlin.reflect.j jVar = anY[0];
        return (Bundle) dVar.getValue();
    }

    public static final /* synthetic */ com.iqoption.chat.viewmodel.a b(a aVar) {
        com.iqoption.chat.viewmodel.a aVar2 = aVar.aSi;
        if (aVar2 == null) {
            kotlin.jvm.internal.i.lG("viewModel");
        }
        return aVar2;
    }

    private final int RS() {
        return RR().getInt("arg.savedInputMode");
    }

    private final void ew(int i) {
        RR().putInt("arg.savedInputMode", i);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.i.f(layoutInflater, "inflater");
        if (this.aSm == null) {
            close(false);
            return null;
        } else if (com.iqoption.core.ext.a.fP("android.permission.READ_EXTERNAL_STORAGE")) {
            FragmentActivity requireActivity = requireActivity();
            kotlin.jvm.internal.i.e(requireActivity, "requireActivity()");
            Window window = requireActivity.getWindow();
            kotlin.jvm.internal.i.e(window, "activity.window");
            ew(window.getAttributes().softInputMode);
            requireActivity.getWindow().setSoftInputMode(32);
            aa aaVar = (aa) com.iqoption.core.ext.a.a((Fragment) this, com.iqoption.chat.e.h.chat_fragment_attachment_picker, viewGroup, false, 4, null);
            v.j(requireActivity);
            this.aSj = aaVar;
            CoordinatorLayout coordinatorLayout = aaVar.aRp;
            String str = "veil";
            kotlin.jvm.internal.i.e(coordinatorLayout, str);
            Drawable background = coordinatorLayout.getBackground();
            kotlin.jvm.internal.i.e(background, "veil.background");
            com.iqoption.core.graphics.a.e eVar = new com.iqoption.core.graphics.a.e(background);
            coordinatorLayout = aaVar.aRp;
            kotlin.jvm.internal.i.e(coordinatorLayout, str);
            coordinatorLayout.setBackground(eVar);
            LinearLayout linearLayout = aaVar.aRl;
            kotlin.jvm.internal.i.e(linearLayout, "contentLayout");
            LayoutParams layoutParams = linearLayout.getLayoutParams();
            if (layoutParams != null) {
                Behavior behavior = ((CoordinatorLayout.LayoutParams) layoutParams).getBehavior();
                if (behavior != null) {
                    this.aSk = (BottomSheetBehavior) behavior;
                    BottomSheetBehavior bottomSheetBehavior = this.aSk;
                    if (bottomSheetBehavior == null) {
                        kotlin.jvm.internal.i.lG("behavior");
                    }
                    bottomSheetBehavior.a((com.google.android.material.bottomsheet.BottomSheetBehavior.a) new b(eVar, this, requireActivity, bundle));
                    if (bundle == null) {
                        eVar.eN(0);
                        aaVar.aRp.postOnAnimation(new e(this, requireActivity, bundle));
                    }
                    com.iqoption.chat.viewmodel.a Tg = com.iqoption.chat.viewmodel.a.aWz.Tg();
                    Tg.setup();
                    this.aSi = Tg;
                    com.iqoption.chat.component.c cVar = new com.iqoption.chat.component.c(new AttachmentPickerFragment$onCreateView$$inlined$apply$lambda$3(this, requireActivity, bundle), new AttachmentPickerFragment$onCreateView$$inlined$apply$lambda$4(this, requireActivity, bundle));
                    com.iqoption.chat.viewmodel.a aVar = this.aSi;
                    String str2 = "viewModel";
                    if (aVar == null) {
                        kotlin.jvm.internal.i.lG(str2);
                    }
                    a(aVar.Ta(), new i(cVar));
                    aVar = this.aSi;
                    if (aVar == null) {
                        kotlin.jvm.internal.i.lG(str2);
                    }
                    a(aVar.Tb(), new f(aaVar, this, requireActivity, bundle));
                    aVar = this.aSi;
                    if (aVar == null) {
                        kotlin.jvm.internal.i.lG(str2);
                    }
                    a(aVar.Tc(), new aw(new AttachmentPickerFragment$onCreateView$$inlined$apply$lambda$6(this, requireActivity, bundle), new AttachmentPickerFragment$onCreateView$$inlined$apply$lambda$7(cVar, this, requireActivity, bundle)));
                    a(r.aZc.j(requireActivity).Uf(), new j(cVar));
                    CoordinatorLayout coordinatorLayout2 = aaVar.aRp;
                    kotlin.jvm.internal.i.e(coordinatorLayout2, str);
                    coordinatorLayout2.setOnClickListener(new g(this, requireActivity, bundle));
                    LinearLayout linearLayout2 = aaVar.aRk;
                    kotlin.jvm.internal.i.e(linearLayout2, "btnGalleryOrSend");
                    linearLayout2.setOnClickListener(new h(this, requireActivity, bundle));
                    TextView textView = aaVar.aRj;
                    kotlin.jvm.internal.i.e(textView, "btnChooseFile");
                    textView.setOnClickListener(new c(this, requireActivity, bundle));
                    RecyclerView recyclerView = aaVar.aRo;
                    str2 = "previewList";
                    kotlin.jvm.internal.i.e(recyclerView, str2);
                    com.iqoption.core.ext.a.b(recyclerView);
                    aaVar.aRo.addItemDecoration(new com.iqoption.core.ui.widget.e(com.iqoption.core.ext.a.c((ViewDataBinding) aaVar, com.iqoption.chat.e.d.dp8)));
                    recyclerView = aaVar.aRo;
                    kotlin.jvm.internal.i.e(recyclerView, str2);
                    recyclerView.setAdapter(cVar);
                    getLifecycle().addObserver(new ReadPermissionTracker(new d(this, requireActivity, bundle)));
                    return aaVar.getRoot();
                }
                throw new TypeCastException("null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetBehavior<android.view.View!>");
            }
            throw new TypeCastException("null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams");
        } else {
            close(false);
            return null;
        }
    }

    public void onDestroyView() {
        super.onDestroyView();
        if (getView() != null) {
            com.iqoption.core.ext.a.r(this).getWindow().setSoftInputMode(RS());
        }
    }

    private final ImageView c(com.iqoption.chat.viewmodel.b bVar) {
        aa aaVar = this.aSj;
        if (aaVar == null) {
            kotlin.jvm.internal.i.lG("binding");
        }
        View findViewWithTag = aaVar.aRo.findViewWithTag(bVar);
        if (findViewWithTag != null) {
            com.iqoption.chat.a.c cVar = (com.iqoption.chat.a.c) com.iqoption.core.ext.a.findBinding(findViewWithTag);
            if (cVar != null) {
                return cVar.aQK;
            }
        }
        return null;
    }

    private final ImageView d(com.iqoption.chat.viewmodel.b bVar) {
        aa aaVar = this.aSj;
        if (aaVar == null) {
            kotlin.jvm.internal.i.lG("binding");
        }
        View findViewWithTag = aaVar.aRo.findViewWithTag(bVar);
        if (findViewWithTag != null) {
            com.iqoption.chat.a.c cVar = (com.iqoption.chat.a.c) com.iqoption.core.ext.a.findBinding(findViewWithTag);
            if (cVar != null) {
                return cVar.aQL;
            }
        }
        return null;
    }

    /* Access modifiers changed, original: protected */
    public boolean a(FragmentManager fragmentManager) {
        a(this, false, 1, null);
        return true;
    }

    static /* synthetic */ void a(a aVar, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        aVar.close(z);
    }

    private final void close(boolean z) {
        if (z) {
            BottomSheetBehavior bottomSheetBehavior = this.aSk;
            if (bottomSheetBehavior == null) {
                kotlin.jvm.internal.i.lG("behavior");
            }
            bottomSheetBehavior.setState(4);
            return;
        }
        List list = this.aSn;
        if (list != null) {
            kotlin.jvm.a.b bVar = this.aSm;
            if (bVar != null) {
                l lVar = (l) bVar.invoke(list);
            }
        }
        com.iqoption.chat.b.a ST = com.iqoption.chat.b.b.ST();
        Fragment fragment = this;
        String str = TAG;
        kotlin.jvm.internal.i.e(str, "TAG");
        ST.a(fragment, str, true);
    }

    static /* synthetic */ void a(a aVar, List list, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        aVar.a(list, z);
    }

    private final void a(List<? extends Uri> list, boolean z) {
        this.aSn = list;
        close(z);
    }

    private final void RT() {
        Intent intent = new Intent("android.intent.action.GET_CONTENT");
        String str = "image/*";
        intent.setType(str);
        new Intent("android.intent.action.PICK", Media.EXTERNAL_CONTENT_URI).setType(str);
        intent = Intent.createChooser(intent, getString(com.iqoption.chat.e.j.select_image));
        Intent[] intentArr = new Intent[]{r2};
        intent.putExtra("android.intent.extra.INITIAL_INTENTS", (Parcelable[]) intentArr);
        startActivityForResult(intent, 1);
    }

    private final void RU() {
        com.iqoption.chat.b.b.ST().a((Fragment) this, j.aTc.h(new AttachmentPickerFragment$takeFile$1(this)));
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 1 && i2 == -1 && intent != null) {
            Uri data = intent.getData();
            if (data != null) {
                a(this, l.listOf(data), false, 2, null);
            }
        }
    }
}
