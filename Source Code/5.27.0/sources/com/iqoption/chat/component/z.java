package com.iqoption.chat.component;

import com.iqoption.core.ui.widget.recyclerview.adapter.b;
import kotlin.NoWhenBranchMatchedException;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\b"}, bng = {"Lcom/iqoption/chat/component/MessageIdSupplier;", "", "()V", "get", "", "item", "Lcom/iqoption/chat/component/MessageAdapterItem;", "Companion", "chat_release"})
/* compiled from: MessageIdSupplier.kt */
public final class z {
    private static final b aOY = new b();
    public static final a aOZ = new a();

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, bng = {"Lcom/iqoption/chat/component/MessageIdSupplier$Companion;", "", "()V", "STABLE_ID_STORE", "Lcom/iqoption/core/ui/widget/recyclerview/adapter/StableIdStore;", "getSTABLE_ID_STORE$chat_release", "()Lcom/iqoption/core/ui/widget/recyclerview/adapter/StableIdStore;", "chat_release"})
    /* compiled from: MessageIdSupplier.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }
    }

    public final long a(y yVar) {
        String str;
        kotlin.jvm.internal.i.f(yVar, "item");
        b bVar = aOY;
        if (yVar instanceof e) {
            str = "empty";
        } else if (yVar instanceof w) {
            str = "loading";
        } else if (yVar instanceof u) {
            str = "loadMore";
        } else {
            String str2 = "msg:";
            StringBuilder stringBuilder;
            if (yVar instanceof aa) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str2);
                stringBuilder.append(((aa) yVar).QT().getId());
                str = stringBuilder.toString();
            } else if (yVar instanceof a) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str2);
                a aVar = (a) yVar;
                stringBuilder.append(aVar.QT().getId());
                stringBuilder.append("|att:");
                stringBuilder.append(aVar.QU().getId());
                str = stringBuilder.toString();
            } else if (yVar instanceof am) {
                stringBuilder = new StringBuilder();
                stringBuilder.append("suggestion:");
                stringBuilder.append(((am) yVar).RP().getId());
                str = stringBuilder.toString();
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
        return bVar.de(str);
    }
}
