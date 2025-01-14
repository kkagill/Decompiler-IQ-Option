package com.iqoption.core.microservices.videoeducation.response;

import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\bf\u0018\u0000 \n2\u00020\u0001:\u0001\nR\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0018\u0010\u0006\u001a\u00020\u0003X¦\u0004¢\u0006\f\u0012\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\u0005¨\u0006\u000b"}, bng = {"Lcom/iqoption/core/microservices/videoeducation/response/LocalePlatformLink;", "Landroid/os/Parcelable;", "locale", "", "getLocale", "()Ljava/lang/String;", "platform", "platform$annotations", "()V", "getPlatform", "Companion", "core_release"})
/* compiled from: LocalePlatformLink.kt */
public interface c extends Parcelable {
    public static final a bDA = a.bDB;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J%\u0010\u0003\u001a\u0004\u0018\u0001H\u0004\"\b\b\u0000\u0010\u0004*\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0007¢\u0006\u0002\u0010\b¨\u0006\t"}, bng = {"Lcom/iqoption/core/microservices/videoeducation/response/LocalePlatformLink$Companion;", "", "()V", "findLink", "T", "Lcom/iqoption/core/microservices/videoeducation/response/LocalePlatformLink;", "links", "", "(Ljava/util/List;)Lcom/iqoption/core/microservices/videoeducation/response/LocalePlatformLink;", "core_release"})
    /* compiled from: LocalePlatformLink.kt */
    public static final class a {
        static final /* synthetic */ a bDB = new a();

        private a() {
        }

        public final <T extends c> T aC(List<? extends T> list) {
            kotlin.jvm.internal.i.f(list, "links");
            if (list.isEmpty()) {
                return null;
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                c cVar = (c) it.next();
                if (d.gU(cVar.getLocale()) && e.gW(cVar.ajm())) {
                    return cVar;
                }
            }
            return (c) list.get(0);
        }
    }

    String ajm();

    String getLocale();
}
