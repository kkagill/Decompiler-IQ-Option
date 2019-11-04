package com.iqoption.chat.component;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.google.android.gms.plus.PlusShare;
import com.iqoption.chat.a.y;
import com.iqoption.chat.viewmodel.e;
import com.iqoption.core.ext.g;
import kotlin.f.d;
import kotlin.i;
import kotlin.jvm.a.b;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.k;
import kotlin.l;
import kotlin.reflect.j;

@i(bne = {1, 1, 15}, bnf = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0002\u0010\bJ\u000e\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0006R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R+\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00068B@BX\u0002¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, bng = {"Lcom/iqoption/chat/component/FileItemViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/iqoption/chat/databinding/ChatFilePickerItemBinding;", "onSelect", "Lkotlin/Function1;", "Lcom/iqoption/chat/viewmodel/FileItem;", "", "(Lcom/iqoption/chat/databinding/ChatFilePickerItemBinding;Lkotlin/jvm/functions/Function1;)V", "<set-?>", "boundItem", "getBoundItem", "()Lcom/iqoption/chat/viewmodel/FileItem;", "setBoundItem", "(Lcom/iqoption/chat/viewmodel/FileItem;)V", "boundItem$delegate", "Lkotlin/properties/ReadWriteProperty;", "bind", "item", "chat_release"})
/* compiled from: FileItemsAdapter.kt */
public final class h extends ViewHolder {
    static final /* synthetic */ j[] anY = new j[]{k.a(new MutablePropertyReference1Impl(k.G(h.class), "boundItem", "getBoundItem()Lcom/iqoption/chat/viewmodel/FileItem;"))};
    private final d aOA = kotlin.f.a.eWg.bnQ();
    private final y aOB;
    private final b<e, l> aOC;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006¸\u0006\u0000"}, bng = {"com/iqoption/core/ext/AndroidExt$setOnDelayedClickListener$1", "Lcom/iqoption/core/ext/OnDelayClickListener;", "onDelayClick", "", "v", "Landroid/view/View;", "core_release"})
    /* compiled from: AndroidExtensions.kt */
    public static final class a extends g {
        final /* synthetic */ h aOD;

        public a(h hVar) {
            this.aOD = hVar;
            super(0, 1, null);
        }

        public void M(View view) {
            kotlin.jvm.internal.i.f(view, "v");
            this.aOD.aOC.invoke(this.aOD.QX());
        }
    }

    private final e QX() {
        return (e) this.aOA.b(this, anY[0]);
    }

    private final void a(e eVar) {
        this.aOA.a(this, anY[0], eVar);
    }

    public h(y yVar, b<? super e, l> bVar) {
        kotlin.jvm.internal.i.f(yVar, "binding");
        kotlin.jvm.internal.i.f(bVar, "onSelect");
        super(yVar.getRoot());
        this.aOB = yVar;
        this.aOC = bVar;
        View root = this.aOB.getRoot();
        kotlin.jvm.internal.i.e(root, "binding.root");
        root.setOnClickListener(new a(this));
    }

    public final void b(e eVar) {
        kotlin.jvm.internal.i.f(eVar, "item");
        a(eVar);
        y yVar = this.aOB;
        if (eVar.fI().isDirectory()) {
            yVar.aRh.setImageResource(com.iqoption.chat.e.e.chat_file_picker_item_folder_icon);
            yVar.aRi.setText(com.iqoption.chat.e.j.folder);
        } else {
            CharSequence stringBuilder;
            yVar.aRh.setImageResource(com.iqoption.chat.e.e.chat_file_picker_item_file_icon);
            String Tl = eVar.Tl();
            String str = "";
            if (Tl == null) {
                Tl = str;
            }
            String Tm = eVar.Tm();
            if (Tm != null) {
                str = Tm;
            }
            TextView textView = yVar.aRi;
            kotlin.jvm.internal.i.e(textView, "snippet");
            CharSequence charSequence = Tl;
            Object obj = 1;
            if ((charSequence.length() > 0 ? 1 : null) != null) {
                if ((((CharSequence) str).length() > 0 ? 1 : null) != null) {
                    StringBuilder stringBuilder2 = new StringBuilder();
                    stringBuilder2.append(Tl);
                    stringBuilder2.append(", ");
                    stringBuilder2.append(str);
                    stringBuilder = stringBuilder2.toString();
                    textView.setText(stringBuilder);
                }
            }
            if (charSequence.length() <= 0) {
                obj = null;
            }
            if (obj == null) {
                Tl = str;
            }
            stringBuilder = Tl;
            textView.setText(stringBuilder);
        }
        TextView textView2 = yVar.alH;
        kotlin.jvm.internal.i.e(textView2, PlusShare.KEY_CONTENT_DEEP_LINK_METADATA_TITLE);
        textView2.setText(eVar.fI().getName());
    }
}
