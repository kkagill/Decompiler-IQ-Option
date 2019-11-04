package com.iqoption.chat.component;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.iqoption.chat.a.as;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\nX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\nX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0014\u0010\u000f\u001a\u00020\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\bR\u0014\u0010\u0011\u001a\u00020\u0012X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\nX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\f¨\u0006\u0017"}, bng = {"Lcom/iqoption/chat/component/SimpleRoomBinding;", "Lcom/iqoption/chat/component/RoomBinding;", "binding", "Lcom/iqoption/chat/databinding/ChatItemBinding;", "(Lcom/iqoption/chat/databinding/ChatItemBinding;)V", "image", "Landroid/widget/ImageView;", "getImage", "()Landroid/widget/ImageView;", "lastMessage", "Landroid/widget/TextView;", "getLastMessage", "()Landroid/widget/TextView;", "lastMessageDate", "getLastMessageDate", "lastMessageUnreadIndicator", "getLastMessageUnreadIndicator", "root", "Landroid/view/View;", "getRoot", "()Landroid/view/View;", "title", "getTitle", "chat_release"})
/* compiled from: RoomBindings.kt */
public final class al implements ah {
    private final ImageView De;
    private final View aGn;
    private final TextView aPR;
    private final TextView aPS;
    private final ImageView aPT;
    private final TextView alH;

    public al(as asVar) {
        kotlin.jvm.internal.i.f(asVar, "binding");
        View root = asVar.getRoot();
        kotlin.jvm.internal.i.e(root, "binding.root");
        this.aGn = root;
        ImageView imageView = asVar.De;
        kotlin.jvm.internal.i.e(imageView, "binding.image");
        this.De = imageView;
        TextView textView = asVar.alH;
        kotlin.jvm.internal.i.e(textView, "binding.title");
        this.alH = textView;
        textView = asVar.aPR;
        kotlin.jvm.internal.i.e(textView, "binding.lastMessage");
        this.aPR = textView;
        textView = asVar.aPS;
        kotlin.jvm.internal.i.e(textView, "binding.lastMessageDate");
        this.aPS = textView;
        ImageView imageView2 = asVar.aRE;
        kotlin.jvm.internal.i.e(imageView2, "binding.lastMessageStateIndicator");
        this.aPT = imageView2;
    }

    public View getRoot() {
        return this.aGn;
    }

    public ImageView Rv() {
        return this.De;
    }

    public TextView Rw() {
        return this.alH;
    }

    public TextView Rx() {
        return this.aPR;
    }

    public TextView Ry() {
        return this.aPS;
    }

    public ImageView Rz() {
        return this.aPT;
    }
}
