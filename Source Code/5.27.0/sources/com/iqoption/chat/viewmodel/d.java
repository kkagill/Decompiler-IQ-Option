package com.iqoption.chat.viewmodel;

import com.iqoption.chat.component.aa;
import com.iqoption.chat.component.u;
import com.iqoption.chat.component.w;
import com.iqoption.chat.component.y;
import com.iqoption.core.microservices.chat.response.e;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.i;
import kotlin.jvm.a.a;
import kotlin.jvm.a.b;

@i(bne = {1, 1, 15}, bnf = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u00002\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00020\u0001j\u0002`\u0005B!\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\u0010\nJ\u001a\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003H\u0002J,\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u00022\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00022\u0006\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J$\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00032\b\u0010\u0018\u001a\u0004\u0018\u00010\u00032\b\u0010\u0019\u001a\u0004\u0018\u00010\u0003H\u0002J\u001d\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00040\u00022\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, bng = {"Lcom/iqoption/chat/viewmodel/CommonMessagesConverter;", "Lkotlin/Function1;", "", "Lcom/iqoption/core/microservices/chat/response/ChatMessage;", "Lcom/iqoption/chat/component/MessageAdapterItem;", "Lcom/iqoption/chat/viewmodel/MessagesConverter;", "canLoadMore", "Lkotlin/Function0;", "", "isLoading", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "dateComparator", "Lcom/iqoption/chat/util/DateComparator;", "compareSenderAndDate", "m1", "m2", "convertAttachments", "attachments", "Lcom/iqoption/core/microservices/chat/response/ChatAttachment;", "msg", "bubble", "", "getBubble", "currentMsg", "prevMsg", "nextMsg", "invoke", "messages", "chat_release"})
/* compiled from: CommonMessagesConverter.kt */
public final class d implements b<List<? extends e>, List<? extends y>> {
    private final com.iqoption.chat.e.b aSO = new com.iqoption.chat.e.b();
    private final a<Boolean> aWP;
    private final a<Boolean> aWQ;

    public d(a<Boolean> aVar, a<Boolean> aVar2) {
        kotlin.jvm.internal.i.f(aVar, "canLoadMore");
        kotlin.jvm.internal.i.f(aVar2, "isLoading");
        this.aWP = aVar;
        this.aWQ = aVar2;
    }

    /* renamed from: t */
    public List<y> invoke(List<e> list) {
        kotlin.jvm.internal.i.f(list, "messages");
        List arrayList = new ArrayList();
        e eVar = (e) null;
        int i = 0;
        for (Object next : list) {
            int i2 = i + 1;
            if (i < 0) {
                m.bno();
            }
            e eVar2 = (e) next;
            int a = a(eVar2, eVar, (e) u.h(list, i2));
            List ack = eVar2.ack();
            if (ack == null) {
                ack = m.emptyList();
            }
            if (ack.isEmpty()) {
                arrayList.add(new aa(eVar2, a));
            } else {
                arrayList.addAll(a(ack, eVar2, a));
            }
            eVar = eVar2;
            i = i2;
        }
        if (((Boolean) this.aWP.invoke()).booleanValue()) {
            arrayList.add(new u());
        }
        if (arrayList.isEmpty()) {
            if (((Boolean) this.aWQ.invoke()).booleanValue()) {
                arrayList.add(new w());
            } else {
                arrayList.add(new com.iqoption.chat.component.e());
            }
        }
        return arrayList;
    }

    private final int a(e eVar, e eVar2, e eVar3) {
        return a(eVar, eVar2) ? a(eVar, eVar3) ? 2 : 1 : a(eVar, eVar3) ? 3 : 0;
    }

    private final boolean a(e eVar, e eVar2) {
        return eVar2 != null && eVar.acc() == eVar2.acc() && this.aSO.n(eVar.getDate(), eVar2.getDate());
    }

    private final List<y> a(List<com.iqoption.core.microservices.chat.response.a> list, e eVar, int i) {
        List arrayList = new ArrayList();
        int i2 = 0;
        int i3 = 1;
        CharSequence text;
        Iterable iterable;
        Collection arrayList2;
        Iterable<com.iqoption.core.microservices.chat.response.a> iterable2;
        if (i == 0) {
            CharSequence text2 = eVar.getText();
            Object obj = (text2 == null || text2.length() == 0) ? 1 : null;
            if (obj == null) {
                arrayList.add(new aa(eVar, 1));
                if (list.size() > 1) {
                    i = list.size() - 1;
                    while (i2 < i) {
                        arrayList.add(new com.iqoption.chat.component.a(eVar, (com.iqoption.core.microservices.chat.response.a) list.get(i2), 2));
                        i2++;
                    }
                }
                arrayList.add(new com.iqoption.chat.component.a(eVar, (com.iqoption.core.microservices.chat.response.a) u.bW(list), 3));
            } else if (list.size() == 1) {
                arrayList.add(new com.iqoption.chat.component.a(eVar, (com.iqoption.core.microservices.chat.response.a) u.bU(list), 0));
            } else {
                arrayList.add(new com.iqoption.chat.component.a(eVar, (com.iqoption.core.microservices.chat.response.a) u.bU(list), 1));
                if (list.size() > 2) {
                    i = list.size() - 1;
                    while (i3 < i) {
                        arrayList.add(new com.iqoption.chat.component.a(eVar, (com.iqoption.core.microservices.chat.response.a) list.get(i3), 2));
                        i3++;
                    }
                }
                arrayList.add(new com.iqoption.chat.component.a(eVar, (com.iqoption.core.microservices.chat.response.a) u.bW(list), 3));
            }
        } else if (i == 1) {
            text = eVar.getText();
            if (!(text == null || text.length() == 0)) {
                i3 = 0;
            }
            if (i3 != 0) {
                iterable = list;
                arrayList2 = new ArrayList(n.e(iterable, 10));
                for (Object next : iterable) {
                    int i4 = i2 + 1;
                    if (i2 < 0) {
                        m.bno();
                    }
                    arrayList2.add(new com.iqoption.chat.component.a(eVar, (com.iqoption.core.microservices.chat.response.a) next, i2 == 0 ? i : 2));
                    i2 = i4;
                }
                arrayList.addAll((List) arrayList2);
            } else {
                arrayList.add(new aa(eVar, i));
                iterable2 = list;
                Collection arrayList3 = new ArrayList(n.e(iterable2, 10));
                for (com.iqoption.core.microservices.chat.response.a aVar : iterable2) {
                    arrayList3.add(new com.iqoption.chat.component.a(eVar, aVar, 2));
                }
                arrayList.addAll((List) arrayList3);
            }
        } else if (i == 2) {
            text = eVar.getText();
            if (text == null || text.length() == 0) {
                i2 = 1;
            }
            if (i2 == 0) {
                arrayList.add(new aa(eVar, i));
            }
            iterable2 = list;
            arrayList2 = new ArrayList(n.e(iterable2, 10));
            for (com.iqoption.core.microservices.chat.response.a aVar2 : iterable2) {
                arrayList2.add(new com.iqoption.chat.component.a(eVar, aVar2, i));
            }
            arrayList.addAll((List) arrayList2);
        } else if (i == 3) {
            text = eVar.getText();
            if (!(text == null || text.length() == 0)) {
                i3 = 0;
            }
            if (i3 == 0) {
                arrayList.add(new aa(eVar, 2));
            }
            int bQ = m.bQ(list);
            iterable = list;
            Collection arrayList4 = new ArrayList(n.e(iterable, 10));
            for (Object next2 : iterable) {
                int i5 = i2 + 1;
                if (i2 < 0) {
                    m.bno();
                }
                arrayList4.add(new com.iqoption.chat.component.a(eVar, (com.iqoption.core.microservices.chat.response.a) next2, i2 == bQ ? i : 2));
                i2 = i5;
            }
            arrayList.addAll((List) arrayList4);
        }
        return s.bT(arrayList);
    }
}
