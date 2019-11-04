package com.iqoption.videoeducation;

import androidx.annotation.MainThread;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.iqoption.analytics.q;
import io.reactivex.b.l;
import io.reactivex.processors.PublishProcessor;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import kotlin.TypeCastException;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\r\n\u0002\b\u0006\u0018\u0000 )2\u00020\u0001:\u0002)*B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u001f\u001a\u00020 H\u0016J\b\u0010!\u001a\u00020 H\u0007J\b\u0010\"\u001a\u00020\tH\u0016J\u0010\u0010#\u001a\u00020 2\u0006\u0010$\u001a\u00020%H\u0007J\b\u0010&\u001a\u00020 H\u0007J\u0010\u0010'\u001a\u00020 2\u0006\u0010(\u001a\u00020\u0017H\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\nR\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\nR\u001a\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u0014X\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0015\u001a\u0010\u0012\f\u0012\n \u0018*\u0004\u0018\u00010\u00170\u00170\u0016X\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0019\u001a\u0010\u0012\f\u0012\n \u0018*\u0004\u0018\u00010\u001a0\u001a0\u0016X\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u00100\b¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\nR\u001a\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u00100\u0014X\u0004¢\u0006\u0002\n\u0000¨\u0006+"}, bng = {"Lcom/iqoption/videoeducation/VideosHelper;", "Lio/reactivex/disposables/Disposable;", "categoryId", "", "(J)V", "disposable", "Lio/reactivex/disposables/CompositeDisposable;", "isSearchShown", "Landroidx/lifecycle/LiveData;", "", "()Landroidx/lifecycle/LiveData;", "isSearchShownData", "Lcom/iqoption/core/data/livedata/IQMutableLiveData;", "searchDebouncer", "Lcom/iqoption/videoeducation/SearchDebouncer;", "tagItems", "", "Lcom/iqoption/videoeducation/VideoTagItem;", "getTagItems", "tagItemsData", "Landroidx/lifecycle/MutableLiveData;", "tagQueryProcessor", "Lio/reactivex/processors/PublishProcessor;", "Lcom/iqoption/core/microservices/videoeducation/response/Tag;", "kotlin.jvm.PlatformType", "textQueryProcessor", "", "videoItems", "Lcom/iqoption/videoeducation/VideoAdapterItem;", "getVideoItems", "videoItemsData", "dispose", "", "hideSearch", "isDisposed", "search", "constraint", "", "showSearch", "toggleTag", "tag", "Companion", "Update", "app_optionXRelease"})
/* compiled from: VideosHelper.kt */
public final class o implements io.reactivex.disposables.b {
    private static final String TAG = o.class.getSimpleName();
    public static final a ecX = new a();
    private final io.reactivex.disposables.a bJT;
    private final long dHh;
    private final LiveData<Boolean> dbo = this.ecP;
    private final com.iqoption.core.data.b.c<Boolean> ecP = new com.iqoption.core.data.b.c(Boolean.valueOf(false));
    private final MutableLiveData<List<c>> ecQ = new MutableLiveData();
    private final LiveData<List<c>> ecR = this.ecQ;
    private final MutableLiveData<List<n>> ecS = new MutableLiveData();
    private final LiveData<List<n>> ecT = this.ecS;
    private final b ecU = new b(new f(this));
    private final PublishProcessor<String> ecV;
    private final PublishProcessor<com.iqoption.core.microservices.videoeducation.response.f> ecW;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, bng = {"Lcom/iqoption/videoeducation/VideosHelper$Companion;", "", "()V", "TAG", "", "kotlin.jvm.PlatformType", "app_optionXRelease"})
    /* compiled from: VideosHelper.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\f\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\b\u0018\u0000 )2\u00020\u0001:\u0001)Bi\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012*\b\u0002\u0010\n\u001a$\u0012\u0004\u0012\u00020\u0004\u0012\u0018\u0012\u0016\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00030\u000b\u0018\u00010\u000b¢\u0006\u0002\u0010\rJ\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0004HÆ\u0003J+\u0010\u001b\u001a$\u0012\u0004\u0012\u00020\u0004\u0012\u0018\u0012\u0016\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00030\u000b\u0018\u00010\u000bHÆ\u0003Jm\u0010\u001c\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042*\b\u0002\u0010\n\u001a$\u0012\u0004\u0012\u00020\u0004\u0012\u0018\u0012\u0016\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00030\u000b\u0018\u00010\u000bHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\u0010\u0010\"\u001a\u0004\u0018\u00010\u00002\u0006\u0010#\u001a\u00020\bJ\t\u0010$\u001a\u00020\bHÖ\u0001J\u0010\u0010%\u001a\u0004\u0018\u00010\u00002\u0006\u0010&\u001a\u00020\u0004J\u000e\u0010'\u001a\u00020\u00002\u0006\u0010(\u001a\u00020\u0000R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR3\u0010\n\u001a$\u0012\u0004\u0012\u00020\u0004\u0012\u0018\u0012\u0016\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00030\u000b\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015¨\u0006*"}, bng = {"Lcom/iqoption/videoeducation/VideosHelper$Update;", "", "tags", "", "Lcom/iqoption/core/microservices/videoeducation/response/Tag;", "videos", "Lcom/iqoption/core/microservices/videoeducation/response/Video;", "constraint", "", "tag", "index", "", "", "(Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lcom/iqoption/core/microservices/videoeducation/response/Tag;Ljava/util/Map;)V", "getConstraint", "()Ljava/lang/String;", "getIndex", "()Ljava/util/Map;", "getTag", "()Lcom/iqoption/core/microservices/videoeducation/response/Tag;", "getTags", "()Ljava/util/List;", "getVideos", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "search", "text", "toString", "toggleTag", "newTag", "update", "new", "Companion", "app_optionXRelease"})
    /* compiled from: VideosHelper.kt */
    private static final class b {
        public static final a edd = new a();
        private final com.iqoption.core.microservices.videoeducation.response.f ecO;
        private final List<com.iqoption.core.microservices.videoeducation.response.g> ecy;
        private final String edb;
        private final Map<com.iqoption.core.microservices.videoeducation.response.f, Map<Character, List<com.iqoption.core.microservices.videoeducation.response.g>>> edc;
        private final List<com.iqoption.core.microservices.videoeducation.response.f> tags;

        @i(bne = {1, 1, 15}, bnf = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J*\u0010\u0003\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\tH\u0002J6\u0010\n\u001a\"\u0012\u0004\u0012\u00020\u000b\u0012\u0018\u0012\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00040\u00042\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002JH\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062&\u0010\u000e\u001a\"\u0012\u0004\u0012\u00020\u000b\u0012\u0018\u0012\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00040\u00042\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u000bH\u0002¨\u0006\u0012"}, bng = {"Lcom/iqoption/videoeducation/VideosHelper$Update$Companion;", "", "()V", "buildCharIndex", "", "", "", "Lcom/iqoption/core/microservices/videoeducation/response/Video;", "videos", "", "createIndex", "Lcom/iqoption/core/microservices/videoeducation/response/Tag;", "data", "search", "index", "searchText", "", "searchTag", "app_optionXRelease"})
        /* compiled from: VideosHelper.kt */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(f fVar) {
                this();
            }

            private final Map<com.iqoption.core.microservices.videoeducation.response.f, Map<Character, List<com.iqoption.core.microservices.videoeducation.response.g>>> bx(List<com.iqoption.core.microservices.videoeducation.response.g> list) {
                com.iqoption.core.microservices.videoeducation.response.f fVar;
                HashMap uk = Maps.uk();
                for (com.iqoption.core.microservices.videoeducation.response.g gVar : list) {
                    for (com.iqoption.core.microservices.videoeducation.response.f fVar2 : gVar.ajs()) {
                        List list2 = (List) uk.get(fVar2);
                        if (list2 == null) {
                            list2 = Lists.newArrayList();
                            kotlin.jvm.internal.i.e(uk, "tagVideoMap");
                            uk.put(fVar2, list2);
                        }
                        if (list2 != null) {
                            list2.add(gVar);
                        }
                    }
                }
                HashMap uk2 = Maps.uk();
                Set entrySet = uk.entrySet();
                kotlin.jvm.internal.i.e(entrySet, "tagVideoMap.entries");
                Iterator it = entrySet.iterator();
                while (true) {
                    String str = "index";
                    if (it.hasNext()) {
                        Entry entry = (Entry) it.next();
                        fVar2 = (com.iqoption.core.microservices.videoeducation.response.f) entry.getKey();
                        List list3 = (List) entry.getValue();
                        kotlin.jvm.internal.i.e(uk2, str);
                        Map map = uk2;
                        a aVar = b.edd;
                        kotlin.jvm.internal.i.e(list3, "videos");
                        map.put(fVar2, aVar.by(list3));
                    } else {
                        kotlin.jvm.internal.i.e(uk2, str);
                        Map map2 = uk2;
                        map2.put(null, by(u.I(list)));
                        return map2;
                    }
                }
            }

            private final Map<Character, List<com.iqoption.core.microservices.videoeducation.response.g>> by(List<com.iqoption.core.microservices.videoeducation.response.g> list) {
                HashMap uk = Maps.uk();
                Iterator it = list.iterator();
                while (true) {
                    String str = "index";
                    if (it.hasNext()) {
                        com.iqoption.core.microservices.videoeducation.response.g gVar = (com.iqoption.core.microservices.videoeducation.response.g) it.next();
                        List b = v.b((CharSequence) gVar.On(), new char[]{' '}, false, 0, 6, null);
                        if (!b.isEmpty()) {
                            ListIterator listIterator = b.listIterator(b.size());
                            while (listIterator.hasPrevious()) {
                                Object obj;
                                if (((String) listIterator.previous()).length() == 0) {
                                    obj = 1;
                                    continue;
                                } else {
                                    obj = null;
                                    continue;
                                }
                                if (obj == null) {
                                    b = u.g(b, listIterator.nextIndex() + 1);
                                    break;
                                }
                            }
                        }
                        b = m.emptyList();
                        for (String charAt : r5) {
                            char toLowerCase = Character.toLowerCase(charAt.charAt(0));
                            List list2 = (List) uk.get(Character.valueOf(toLowerCase));
                            if (list2 == null) {
                                list2 = Lists.newArrayList();
                                kotlin.jvm.internal.i.e(uk, str);
                                uk.put(Character.valueOf(toLowerCase), list2);
                            }
                            if (list2 != null) {
                                int i = 0;
                                for (com.iqoption.core.microservices.videoeducation.response.g id : list2) {
                                    if ((id.getId() == gVar.getId() ? 1 : null) != null) {
                                        break;
                                    }
                                    i++;
                                }
                                i = -1;
                                if (i == -1) {
                                    list2.add(gVar);
                                }
                            }
                        }
                    } else {
                        kotlin.jvm.internal.i.e(uk, str);
                        Map map = uk;
                        map.put(null, list);
                        return map;
                    }
                }
            }

            private final List<com.iqoption.core.microservices.videoeducation.response.g> a(Map<com.iqoption.core.microservices.videoeducation.response.f, ? extends Map<Character, ? extends List<com.iqoption.core.microservices.videoeducation.response.g>>> map, String str, com.iqoption.core.microservices.videoeducation.response.f fVar) {
                Map map2 = (Map) map.get(fVar);
                if (map2 == null) {
                    return m.emptyList();
                }
                CharSequence charSequence = str;
                if ((charSequence.length() == 0 ? 1 : null) != null) {
                    List<com.iqoption.core.microservices.videoeducation.response.g> list = (List) map2.get(null);
                    if (list == null) {
                        list = m.emptyList();
                    }
                    return list;
                }
                List list2 = (List) map2.get(Character.valueOf(str.charAt(0)));
                if (list2 == null) {
                    return m.emptyList();
                }
                Collection arrayList = new ArrayList();
                for (Object next : list2) {
                    if (v.b((CharSequence) ((com.iqoption.core.microservices.videoeducation.response.g) next).On(), charSequence, true)) {
                        arrayList.add(next);
                    }
                }
                return (List) arrayList;
            }
        }

        public b() {
            this(null, null, null, null, null, 31, null);
        }

        public static /* synthetic */ b a(b bVar, List list, List list2, String str, com.iqoption.core.microservices.videoeducation.response.f fVar, Map map, int i, Object obj) {
            if ((i & 1) != 0) {
                list = bVar.tags;
            }
            if ((i & 2) != 0) {
                list2 = bVar.ecy;
            }
            List list3 = list2;
            if ((i & 4) != 0) {
                str = bVar.edb;
            }
            String str2 = str;
            if ((i & 8) != 0) {
                fVar = bVar.ecO;
            }
            com.iqoption.core.microservices.videoeducation.response.f fVar2 = fVar;
            if ((i & 16) != 0) {
                map = bVar.edc;
            }
            return bVar.a(list, list3, str2, fVar2, map);
        }

        public final b a(List<com.iqoption.core.microservices.videoeducation.response.f> list, List<com.iqoption.core.microservices.videoeducation.response.g> list2, String str, com.iqoption.core.microservices.videoeducation.response.f fVar, Map<com.iqoption.core.microservices.videoeducation.response.f, ? extends Map<Character, ? extends List<com.iqoption.core.microservices.videoeducation.response.g>>> map) {
            kotlin.jvm.internal.i.f(list, "tags");
            kotlin.jvm.internal.i.f(list2, "videos");
            return new b(list, list2, str, fVar, map);
        }

        /* JADX WARNING: Missing block: B:12:0x0038, code skipped:
            if (kotlin.jvm.internal.i.y(r2.edc, r3.edc) != false) goto L_0x003d;
     */
        public boolean equals(java.lang.Object r3) {
            /*
            r2 = this;
            if (r2 == r3) goto L_0x003d;
        L_0x0002:
            r0 = r3 instanceof com.iqoption.videoeducation.o.b;
            if (r0 == 0) goto L_0x003b;
        L_0x0006:
            r3 = (com.iqoption.videoeducation.o.b) r3;
            r0 = r2.tags;
            r1 = r3.tags;
            r0 = kotlin.jvm.internal.i.y(r0, r1);
            if (r0 == 0) goto L_0x003b;
        L_0x0012:
            r0 = r2.ecy;
            r1 = r3.ecy;
            r0 = kotlin.jvm.internal.i.y(r0, r1);
            if (r0 == 0) goto L_0x003b;
        L_0x001c:
            r0 = r2.edb;
            r1 = r3.edb;
            r0 = kotlin.jvm.internal.i.y(r0, r1);
            if (r0 == 0) goto L_0x003b;
        L_0x0026:
            r0 = r2.ecO;
            r1 = r3.ecO;
            r0 = kotlin.jvm.internal.i.y(r0, r1);
            if (r0 == 0) goto L_0x003b;
        L_0x0030:
            r0 = r2.edc;
            r3 = r3.edc;
            r3 = kotlin.jvm.internal.i.y(r0, r3);
            if (r3 == 0) goto L_0x003b;
        L_0x003a:
            goto L_0x003d;
        L_0x003b:
            r3 = 0;
            return r3;
        L_0x003d:
            r3 = 1;
            return r3;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.iqoption.videoeducation.o$b.equals(java.lang.Object):boolean");
        }

        public int hashCode() {
            List list = this.tags;
            int i = 0;
            int hashCode = (list != null ? list.hashCode() : 0) * 31;
            List list2 = this.ecy;
            hashCode = (hashCode + (list2 != null ? list2.hashCode() : 0)) * 31;
            String str = this.edb;
            hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
            com.iqoption.core.microservices.videoeducation.response.f fVar = this.ecO;
            hashCode = (hashCode + (fVar != null ? fVar.hashCode() : 0)) * 31;
            Map map = this.edc;
            if (map != null) {
                i = map.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Update(tags=");
            stringBuilder.append(this.tags);
            stringBuilder.append(", videos=");
            stringBuilder.append(this.ecy);
            stringBuilder.append(", constraint=");
            stringBuilder.append(this.edb);
            stringBuilder.append(", tag=");
            stringBuilder.append(this.ecO);
            stringBuilder.append(", index=");
            stringBuilder.append(this.edc);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public b(List<com.iqoption.core.microservices.videoeducation.response.f> list, List<com.iqoption.core.microservices.videoeducation.response.g> list2, String str, com.iqoption.core.microservices.videoeducation.response.f fVar, Map<com.iqoption.core.microservices.videoeducation.response.f, ? extends Map<Character, ? extends List<com.iqoption.core.microservices.videoeducation.response.g>>> map) {
            kotlin.jvm.internal.i.f(list, "tags");
            kotlin.jvm.internal.i.f(list2, "videos");
            this.tags = list;
            this.ecy = list2;
            this.edb = str;
            this.ecO = fVar;
            this.edc = map;
        }

        public /* synthetic */ b(List list, List list2, String str, com.iqoption.core.microservices.videoeducation.response.f fVar, Map map, int i, f fVar2) {
            if ((i & 1) != 0) {
                list = m.emptyList();
            }
            if ((i & 2) != 0) {
                list2 = m.emptyList();
            }
            List list3 = list2;
            if ((i & 4) != 0) {
                str = (String) null;
            }
            String str2 = str;
            if ((i & 8) != 0) {
                fVar = (com.iqoption.core.microservices.videoeducation.response.f) null;
            }
            com.iqoption.core.microservices.videoeducation.response.f fVar3 = fVar;
            if ((i & 16) != 0) {
                map = (((Collection) list3).isEmpty() ^ 1) != 0 ? edd.bx(list3) : null;
            }
            this(list, list3, str2, fVar3, map);
        }

        public final List<com.iqoption.core.microservices.videoeducation.response.f> ajs() {
            return this.tags;
        }

        public final List<com.iqoption.core.microservices.videoeducation.response.g> aXm() {
            return this.ecy;
        }

        public final com.iqoption.core.microservices.videoeducation.response.f aXw() {
            return this.ecO;
        }

        public final b b(b bVar) {
            kotlin.jvm.internal.i.f(bVar, "new");
            String str = bVar.edb;
            b jR;
            if (str != null) {
                jR = jR(str);
                if (jR != null) {
                    return jR;
                }
            }
            com.iqoption.core.microservices.videoeducation.response.f fVar = bVar.ecO;
            if (fVar != null) {
                jR = b(fVar);
                if (jR != null) {
                    return jR;
                }
            }
            return bVar;
        }

        public final b jR(String str) {
            kotlin.jvm.internal.i.f(str, "text");
            Map map = this.edc;
            if (map == null) {
                return null;
            }
            b bVar;
            if (kotlin.jvm.internal.i.y(str, this.edb)) {
                bVar = this;
            } else {
                bVar = a(this, null, edd.a(map, str, this.ecO), str, null, null, 25, null);
            }
            return bVar;
        }

        public final b b(com.iqoption.core.microservices.videoeducation.response.f fVar) {
            kotlin.jvm.internal.i.f(fVar, "newTag");
            Map map = this.edc;
            if (map == null) {
                return null;
            }
            com.iqoption.core.microservices.videoeducation.response.f fVar2 = (kotlin.jvm.internal.i.y(fVar, this.ecO) ^ 1) != 0 ? fVar : null;
            a aVar = edd;
            String str = this.edb;
            if (str == null) {
                str = "";
            }
            return a(this, null, aVar.a(map, str, fVar2), null, fVar2, null, 21, null);
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "update", "Lcom/iqoption/videoeducation/VideosHelper$Update;", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: VideosHelper.kt */
    /* renamed from: com.iqoption.videoeducation.o$2 */
    static final class AnonymousClass2<T> implements io.reactivex.b.f<b> {
        final /* synthetic */ o ecZ;

        AnonymousClass2(o oVar) {
            this.ecZ = oVar;
        }

        /* renamed from: a */
        public final void accept(b bVar) {
            MutableLiveData c;
            Collection arrayList;
            if ((bVar.aXm().isEmpty() ^ 1) != 0) {
                c = this.ecZ.ecQ;
                Iterable<com.iqoption.core.microservices.videoeducation.response.g> aXm = bVar.aXm();
                arrayList = new ArrayList(n.e(aXm, 10));
                for (com.iqoption.core.microservices.videoeducation.response.g mVar : aXm) {
                    arrayList.add(new m(mVar));
                }
                c.postValue((List) arrayList);
            } else {
                this.ecZ.ecQ.postValue(l.listOf(new l()));
            }
            c = this.ecZ.ecS;
            Iterable<com.iqoption.core.microservices.videoeducation.response.f> ajs = bVar.ajs();
            arrayList = new ArrayList(n.e(ajs, 10));
            for (com.iqoption.core.microservices.videoeducation.response.f fVar : ajs) {
                arrayList.add(new n(fVar, kotlin.jvm.internal.i.y(fVar, bVar.aXw())));
            }
            c.postValue((List) arrayList);
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, bng = {"<anonymous>", "Lcom/iqoption/videoeducation/VideosHelper$Update;", "it", "Lcom/iqoption/videoeducation/model/VideoCatalog;", "apply"})
    /* compiled from: VideosHelper.kt */
    static final class c<T, R> implements io.reactivex.b.g<T, R> {
        public static final c ede = new c();

        c() {
        }

        /* renamed from: b */
        public final b apply(com.iqoption.videoeducation.c.a aVar) {
            kotlin.jvm.internal.i.f(aVar, "it");
            return new b(aVar.ajs(), aVar.aXm(), null, null, null, 28, null);
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, bng = {"<anonymous>", "", "it", "Lcom/iqoption/videoeducation/VideoEducationEvent;", "test"})
    /* compiled from: VideosHelper.kt */
    static final class d<T> implements l<h> {
        final /* synthetic */ o ecZ;

        d(o oVar) {
            this.ecZ = oVar;
        }

        /* renamed from: c */
        public final boolean test(h hVar) {
            kotlin.jvm.internal.i.f(hVar, "it");
            if (hVar instanceof k) {
                int i = 0;
                for (com.iqoption.core.microservices.videoeducation.response.a id : ((k) hVar).aXu().Mk()) {
                    if ((id.getId() == this.ecZ.dHh ? 1 : null) != null) {
                        break;
                    }
                    i++;
                }
                i = -1;
                if (i != -1) {
                    return true;
                }
            }
            return false;
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, bng = {"<anonymous>", "Lcom/iqoption/videoeducation/VideosHelper$Update;", "it", "Lcom/iqoption/videoeducation/VideoEducationEvent;", "apply"})
    /* compiled from: VideosHelper.kt */
    static final class e<T, R> implements io.reactivex.b.g<T, R> {
        final /* synthetic */ o ecZ;

        e(o oVar) {
            this.ecZ = oVar;
        }

        /* renamed from: d */
        public final b apply(h hVar) {
            kotlin.jvm.internal.i.f(hVar, "it");
            for (Object next : hVar.aXi()) {
                Object obj;
                if (((com.iqoption.videoeducation.c.a) next).aXE().getId() == this.ecZ.dHh) {
                    obj = 1;
                    continue;
                } else {
                    obj = null;
                    continue;
                }
                if (obj != null) {
                    break;
                }
            }
            Object next2 = null;
            com.iqoption.videoeducation.c.a aVar = (com.iqoption.videoeducation.c.a) next2;
            if (aVar != null) {
                return new b(aVar.ajs(), aVar.aXm(), null, null, null, 28, null);
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Catalog with category ID ");
            stringBuilder.append(this.ecZ.dHh);
            stringBuilder.append(" is not found");
            throw new NullPointerException(stringBuilder.toString());
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "onPerformSearch"})
    /* compiled from: VideosHelper.kt */
    static final class f implements com.iqoption.videoeducation.b.a {
        final /* synthetic */ o ecZ;

        f(o oVar) {
            this.ecZ = oVar;
        }

        public final void onPerformSearch(CharSequence charSequence) {
            PublishProcessor a = this.ecZ.ecV;
            String obj = charSequence.toString();
            if (obj != null) {
                obj = v.trim(obj).toString();
                if (obj != null) {
                    obj = obj.toLowerCase();
                    kotlin.jvm.internal.i.e(obj, "(this as java.lang.String).toLowerCase()");
                    a.onNext(obj);
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, bng = {"<anonymous>", "Lcom/iqoption/videoeducation/VideosHelper$Update;", "it", "Lcom/iqoption/core/microservices/videoeducation/response/Tag;", "apply"})
    /* compiled from: VideosHelper.kt */
    static final class g<T, R> implements io.reactivex.b.g<T, R> {
        public static final g edf = new g();

        g() {
        }

        /* renamed from: c */
        public final b apply(com.iqoption.core.microservices.videoeducation.response.f fVar) {
            kotlin.jvm.internal.i.f(fVar, "it");
            return new b(null, null, null, fVar, null, 23, null);
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, bng = {"<anonymous>", "Lcom/iqoption/videoeducation/VideosHelper$Update;", "it", "", "apply"})
    /* compiled from: VideosHelper.kt */
    static final class h<T, R> implements io.reactivex.b.g<T, R> {
        public static final h edg = new h();

        h() {
        }

        /* renamed from: jS */
        public final b apply(String str) {
            kotlin.jvm.internal.i.f(str, "it");
            return new b(null, null, str, null, null, 27, null);
        }
    }

    public o(long j) {
        this.dHh = j;
        PublishProcessor bmK = PublishProcessor.bmK();
        kotlin.jvm.internal.i.e(bmK, "PublishProcessor.create<String>()");
        this.ecV = bmK;
        bmK = PublishProcessor.bmK();
        kotlin.jvm.internal.i.e(bmK, "PublishProcessor.create<Tag>()");
        this.ecW = bmK;
        this.bJT = new io.reactivex.disposables.a();
        io.reactivex.e bkO = i.ecx.cr(this.dHh).t(c.ede).bkO();
        io.reactivex.e g = this.ecV.g(h.edg);
        kotlin.jvm.internal.i.e(g, "textQueryProcessor\n     …t = it)\n                }");
        io.reactivex.e g2 = this.ecW.g(g.edf);
        kotlin.jvm.internal.i.e(g2, "tagQueryProcessor\n      …g = it)\n                }");
        io.reactivex.e g3 = i.ecx.aTz().b((l) new d(this)).g(new e(this));
        kotlin.jvm.internal.i.e(g3, "VideoEducationManager.ge…videos)\n                }");
        this.bJT.e(bkO.c((org.a.b) io.reactivex.e.a((org.a.b) g, (org.a.b) g2, (org.a.b) g3)).a((io.reactivex.b.c) AnonymousClass1.ecY).d(com.iqoption.core.rx.i.aki()).a((io.reactivex.b.f) new AnonymousClass2(this), (io.reactivex.b.f) AnonymousClass3.eda));
    }

    public final LiveData<Boolean> aAz() {
        return this.dbo;
    }

    public final LiveData<List<c>> aXq() {
        return this.ecR;
    }

    public final LiveData<List<n>> aXr() {
        return this.ecT;
    }

    public boolean isDisposed() {
        return this.bJT.isDisposed();
    }

    public void dispose() {
        this.bJT.clear();
    }

    @MainThread
    public final void aXx() {
        this.ecP.setValue(Boolean.valueOf(true));
        q.Q(this.dHh);
    }

    @MainThread
    public final void aXt() {
        this.ecP.setValue(Boolean.valueOf(false));
    }

    @MainThread
    public final void A(CharSequence charSequence) {
        kotlin.jvm.internal.i.f(charSequence, "constraint");
        this.ecU.a(charSequence, 250);
    }

    @MainThread
    public final void a(com.iqoption.core.microservices.videoeducation.response.f fVar) {
        kotlin.jvm.internal.i.f(fVar, "tag");
        this.ecW.onNext(fVar);
        List list = (List) this.ecT.getValue();
        if (list != null) {
            for (Object next : list) {
                Object obj;
                if (((n) next).aXw().getId() == fVar.getId()) {
                    obj = 1;
                    continue;
                } else {
                    obj = null;
                    continue;
                }
                if (obj != null) {
                    break;
                }
            }
            Object next2 = null;
            n nVar = (n) next2;
            if (nVar != null && !nVar.isSelected()) {
                q.P(fVar.getId());
            }
        }
    }
}
