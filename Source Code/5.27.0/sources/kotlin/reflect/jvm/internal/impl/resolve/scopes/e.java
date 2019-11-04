package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import kotlin.jvm.a.b;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.k;
import kotlin.reflect.j;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ae;
import kotlin.reflect.jvm.internal.impl.descriptors.ai;
import kotlin.reflect.jvm.internal.impl.descriptors.d;
import kotlin.reflect.jvm.internal.impl.descriptors.s;
import kotlin.reflect.jvm.internal.impl.name.f;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil;
import kotlin.reflect.jvm.internal.impl.resolve.g;
import kotlin.reflect.jvm.internal.impl.storage.h;
import kotlin.reflect.jvm.internal.impl.types.an;
import kotlin.reflect.jvm.internal.impl.types.w;

/* compiled from: GivenFunctionsMemberScope.kt */
public abstract class e extends i {
    static final /* synthetic */ j[] anY = new j[]{k.a(new PropertyReference1Impl(k.G(e.class), "allDescriptors", "getAllDescriptors()Ljava/util/List;"))};
    private final kotlin.reflect.jvm.internal.impl.storage.e fuv;
    private final d fuw;

    /* compiled from: GivenFunctionsMemberScope.kt */
    public static final class a extends g {
        final /* synthetic */ ArrayList $result;
        final /* synthetic */ e this$0;

        a(e eVar, ArrayList arrayList) {
            this.this$0 = eVar;
            this.$result = arrayList;
        }

        public void g(CallableMemberDescriptor callableMemberDescriptor) {
            i.f(callableMemberDescriptor, "fakeOverride");
            OverridingUtil.a(callableMemberDescriptor, null);
            this.$result.add(callableMemberDescriptor);
        }

        /* Access modifiers changed, original: protected */
        public void a(CallableMemberDescriptor callableMemberDescriptor, CallableMemberDescriptor callableMemberDescriptor2) {
            i.f(callableMemberDescriptor, "fromSuper");
            i.f(callableMemberDescriptor2, "fromCurrent");
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Conflict in scope of ");
            stringBuilder.append(this.this$0.bNL());
            stringBuilder.append(": ");
            stringBuilder.append(callableMemberDescriptor);
            stringBuilder.append(" vs ");
            stringBuilder.append(callableMemberDescriptor2);
            throw new IllegalStateException(stringBuilder.toString().toString());
        }
    }

    private final List<kotlin.reflect.jvm.internal.impl.descriptors.k> bNK() {
        return (List) kotlin.reflect.jvm.internal.impl.storage.g.a(this.fuv, (Object) this, anY[0]);
    }

    public abstract List<s> brU();

    /* Access modifiers changed, original: protected|final */
    public final d bNL() {
        return this.fuw;
    }

    public e(h hVar, d dVar) {
        i.f(hVar, "storageManager");
        i.f(dVar, "containingClass");
        this.fuw = dVar;
        this.fuv = hVar.f(new GivenFunctionsMemberScope$allDescriptors$2(this));
    }

    public Collection<kotlin.reflect.jvm.internal.impl.descriptors.k> a(d dVar, b<? super f, Boolean> bVar) {
        i.f(dVar, "kindFilter");
        i.f(bVar, "nameFilter");
        if (dVar.mr(d.fuj.bNp())) {
            return bNK();
        }
        return m.emptyList();
    }

    public Collection<ai> b(f fVar, kotlin.reflect.jvm.internal.impl.incremental.components.b bVar) {
        i.f(fVar, ConditionalUserProperty.NAME);
        i.f(bVar, "location");
        Collection arrayList = new ArrayList();
        for (Object next : bNK()) {
            if (next instanceof ai) {
                arrayList.add(next);
            }
        }
        Collection arrayList2 = new ArrayList();
        for (Object next2 : (List) arrayList) {
            if (i.y(((ai) next2).bsZ(), fVar)) {
                arrayList2.add(next2);
            }
        }
        return (List) arrayList2;
    }

    public Collection<ae> a(f fVar, kotlin.reflect.jvm.internal.impl.incremental.components.b bVar) {
        i.f(fVar, ConditionalUserProperty.NAME);
        i.f(bVar, "location");
        Collection arrayList = new ArrayList();
        for (Object next : bNK()) {
            if (next instanceof ae) {
                arrayList.add(next);
            }
        }
        Collection arrayList2 = new ArrayList();
        for (Object next2 : (List) arrayList) {
            if (i.y(((ae) next2).bsZ(), fVar)) {
                arrayList2.add(next2);
            }
        }
        return (List) arrayList2;
    }

    private final List<kotlin.reflect.jvm.internal.impl.descriptors.k> cl(List<? extends s> list) {
        ArrayList arrayList = new ArrayList(3);
        an brm = this.fuw.brm();
        i.e(brm, "containingClass.typeConstructor");
        Collection<w> bup = brm.bup();
        i.e(bup, "containingClass.typeConstructor.supertypes");
        Collection arrayList2 = new ArrayList();
        for (w bsF : bup) {
            r.a(arrayList2, (Iterable) kotlin.reflect.jvm.internal.impl.resolve.scopes.j.a.a(bsF.bsF(), null, null, 3, null));
        }
        Collection arrayList3 = new ArrayList();
        for (Object next : (List) arrayList2) {
            if (next instanceof CallableMemberDescriptor) {
                arrayList3.add(next);
            }
        }
        Map linkedHashMap = new LinkedHashMap();
        for (Object next2 : (List) arrayList3) {
            f bsZ = ((CallableMemberDescriptor) next2).bsZ();
            ArrayList arrayList4 = linkedHashMap.get(bsZ);
            if (arrayList4 == null) {
                arrayList4 = new ArrayList();
                linkedHashMap.put(bsZ, arrayList4);
            }
            arrayList4.add(next2);
        }
        for (Entry entry : linkedHashMap.entrySet()) {
            f fVar = (f) entry.getKey();
            Map linkedHashMap2 = new LinkedHashMap();
            for (Object next3 : (List) entry.getValue()) {
                Boolean valueOf = Boolean.valueOf(((CallableMemberDescriptor) next3) instanceof s);
                ArrayList arrayList5 = linkedHashMap2.get(valueOf);
                if (arrayList5 == null) {
                    arrayList5 = new ArrayList();
                    linkedHashMap2.put(valueOf, arrayList5);
                }
                arrayList5.add(next3);
            }
            for (Entry entry2 : linkedHashMap2.entrySet()) {
                List list2;
                boolean booleanValue = ((Boolean) entry2.getKey()).booleanValue();
                Collection collection = (List) entry2.getValue();
                if (booleanValue) {
                    Collection arrayList6 = new ArrayList();
                    for (Object next4 : list) {
                        if (i.y(((s) next4).bsZ(), fVar)) {
                            arrayList6.add(next4);
                        }
                    }
                    list2 = (List) arrayList6;
                } else {
                    list2 = m.emptyList();
                }
                OverridingUtil.a(fVar, collection, list2, this.fuw, new a(this, arrayList));
            }
        }
        return kotlin.reflect.jvm.internal.impl.utils.a.i(arrayList);
    }
}
