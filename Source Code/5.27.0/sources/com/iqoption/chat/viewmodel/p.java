package com.iqoption.chat.viewmodel;

import com.iqoption.chat.component.aa;
import com.iqoption.chat.component.am;
import com.iqoption.chat.component.u;
import com.iqoption.chat.component.w;
import com.iqoption.chat.component.y;
import com.iqoption.core.microservices.chat.response.ChatMessageType;
import com.iqoption.core.microservices.chat.response.e;
import com.iqoption.core.microservices.chat.response.m;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.i;
import kotlin.jvm.a.b;

@i(bne = {1, 1, 15}, bnf = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\u0018\u0000 %2\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00020\u0001j\u0002`\u0005:\u0001%B/\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0002\u0010\fJ\u001a\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u00032\b\u0010\u0015\u001a\u0004\u0018\u00010\u0003H\u0002J,\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00040\u00022\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u00022\u0006\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J$\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u00032\b\u0010\u001e\u001a\u0004\u0018\u00010\u00032\b\u0010\u001f\u001a\u0004\u0018\u00010\u0003H\u0002J\u001c\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00070\u00022\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002J\u001d\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00040\u00022\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002J\u0010\u0010#\u001a\u00020\n2\u0006\u0010$\u001a\u00020\u0003H\u0002R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u0012X\u0004¢\u0006\u0002\n\u0000¨\u0006&"}, bng = {"Lcom/iqoption/chat/viewmodel/SupportMessagesConverter;", "Lkotlin/Function1;", "", "Lcom/iqoption/core/microservices/chat/response/ChatMessage;", "Lcom/iqoption/chat/component/MessageAdapterItem;", "Lcom/iqoption/chat/viewmodel/MessagesConverter;", "s", "Lcom/iqoption/core/microservices/chat/response/ChatSuggestion;", "canLoadMore", "Lkotlin/Function0;", "", "isLoading", "(Ljava/util/List;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "dateComparator", "Lcom/iqoption/chat/util/DateComparator;", "suggestionTime", "", "suggestions", "", "compareSenderAndDate", "m1", "m2", "convertAttachments", "attachments", "Lcom/iqoption/core/microservices/chat/response/ChatAttachment;", "msg", "bubble", "", "getBubble", "currentMsg", "prevMsg", "nextMsg", "grabSuggestions", "messages", "invoke", "shouldStopGrabbingSuggestions", "message", "Companion", "chat_release"})
/* compiled from: SupportMessagesConverter.kt */
public final class p implements b<List<? extends e>, List<? extends y>> {
    public static final a aYT = new a();
    private final com.iqoption.chat.e.b aSO;
    private final kotlin.jvm.a.a<Boolean> aWP;
    private final kotlin.jvm.a.a<Boolean> aWQ;
    private long aYR = -1;
    private final List<m> aYS;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, bng = {"Lcom/iqoption/chat/viewmodel/SupportMessagesConverter$Companion;", "", "()V", "DEPTH_MAX", "", "chat_release"})
    /* compiled from: SupportMessagesConverter.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }
    }

    public p(List<m> list, kotlin.jvm.a.a<Boolean> aVar, kotlin.jvm.a.a<Boolean> aVar2) {
        kotlin.jvm.internal.i.f(list, "s");
        kotlin.jvm.internal.i.f(aVar, "canLoadMore");
        kotlin.jvm.internal.i.f(aVar2, "isLoading");
        this.aWP = aVar;
        this.aWQ = aVar2;
        this.aYS = u.I(list);
        this.aSO = new com.iqoption.chat.e.b();
    }

    /* renamed from: t */
    public synchronized List<y> invoke(List<e> list) {
        List arrayList;
        kotlin.jvm.internal.i.f(list, "messages");
        arrayList = new ArrayList();
        e eVar = (e) null;
        e eVar2 = eVar;
        int i = 0;
        for (Object next : list) {
            int i2 = i + 1;
            if (i < 0) {
                m.bno();
            }
            eVar = (e) next;
            int a = a(eVar, eVar2, (e) u.h(list, i2));
            List ack = eVar.ack();
            if (ack == null) {
                ack = m.emptyList();
            }
            if (ack.isEmpty()) {
                arrayList.add(new aa(eVar, a));
            } else {
                arrayList.addAll(a(ack, eVar, a));
            }
            eVar2 = eVar;
            i = i2;
        }
        if (((Boolean) this.aWP.invoke()).booleanValue()) {
            arrayList.add(new u());
        }
        if (arrayList.isEmpty() && this.aYS.isEmpty()) {
            if (((Boolean) this.aWQ.invoke()).booleanValue()) {
                arrayList.add(new w());
            } else {
                arrayList.add(new com.iqoption.chat.component.e());
            }
        } else if ((arrayList.isEmpty() ^ 1) != 0) {
            List ai = ai(list);
            if ((ai.isEmpty() ^ 1) != 0) {
                Iterable<m> iterable = ai;
                Collection arrayList2 = new ArrayList(n.e(iterable, 10));
                for (m amVar : iterable) {
                    arrayList2.add(new am(amVar));
                }
                arrayList.addAll(0, s.bS((List) arrayList2));
                this.aYS.clear();
            }
        }
        if ((this.aYS.isEmpty() ^ 1) != 0) {
            e eVar3 = (e) u.bV(list);
            long j = 0;
            if (this.aYR == -1) {
                if (eVar3 != null) {
                    j = eVar3.getDate();
                }
                this.aYR = j;
                Iterable<m> iterable2 = this.aYS;
                Collection arrayList3 = new ArrayList(n.e(iterable2, 10));
                for (m amVar2 : iterable2) {
                    arrayList3.add(new am(amVar2));
                }
                arrayList.addAll(0, s.bS((List) arrayList3));
            } else {
                long j2 = this.aYR;
                if (eVar3 != null) {
                    j = eVar3.getDate();
                }
                if (j2 < j) {
                    this.aYS.clear();
                }
            }
        }
        return arrayList;
    }

    private final List<m> ai(List<e> list) {
        List<m> list2 = (List) null;
        int min = Math.min(3, list.size());
        List<m> list3 = list2;
        for (int i = 0; i < min; i++) {
            e eVar = (e) list.get(i);
            if (i(eVar)) {
                break;
            }
            List acv = eVar.abW().acv();
            if (acv != null) {
                if (list3 == null) {
                    list3 = new ArrayList();
                }
                list3.addAll(0, acv);
            }
        }
        return list3 != null ? list3 : m.emptyList();
    }

    private final boolean i(e eVar) {
        return eVar.abU() || !(!eVar.ach() || eVar.abZ() == ChatMessageType.CLOSE_DIALOG || eVar.abZ() == ChatMessageType.TRANSFER);
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
