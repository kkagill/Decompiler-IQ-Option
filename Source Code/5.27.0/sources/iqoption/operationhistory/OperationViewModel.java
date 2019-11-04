package iqoption.operationhistory;

import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.LiveDataReactiveStreams;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProviders;
import com.iqoption.core.microservices.transaction.Transaction;
import io.reactivex.p;
import io.reactivex.processors.BehaviorProcessor;
import io.reactivex.t;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.TypeCastException;

@kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000y\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b*\u0003\b\u000b\u0011\u0018\u0000 -2\u00020\u0001:\u0005-./01B\u0005¢\u0006\u0002\u0010\u0002J\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00050\u0014J\u000e\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0005J\u0014\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020 0\u001f2\u0006\u0010!\u001a\u00020\u001cJ\u000e\u0010\"\u001a\u00020#2\u0006\u0010\u001d\u001a\u00020\u0005J\u0010\u0010$\u001a\u00020%2\b\b\u0002\u0010&\u001a\u00020'J\u001e\u0010(\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150*0)2\b\b\u0002\u0010&\u001a\u00020'H\u0002J\u0016\u0010+\u001a\u00020%2\u0006\u0010,\u001a\u00020 2\u0006\u0010\u001d\u001a\u00020\u0005R\u001c\u0010\u0003\u001a\u0010\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u00050\u0004X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0004\n\u0002\u0010\tR\u0010\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0004\n\u0002\u0010\fR\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u00020\u0011X\u0004¢\u0006\u0004\n\u0002\u0010\u0012R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00150\u0019X\u0004¢\u0006\u0002\n\u0000¨\u00062"}, bng = {"Liqoption/operationhistory/OperationViewModel;", "Lcom/iqoption/core/ui/viewmodel/DisposableViewModel;", "()V", "changedFilterProcessor", "Lio/reactivex/processors/FlowableProcessor;", "Liqoption/operationhistory/OperationViewModel$FilterType;", "kotlin.jvm.PlatformType", "dateFilterGroup", "iqoption/operationhistory/OperationViewModel$dateFilterGroup$1", "Liqoption/operationhistory/OperationViewModel$dateFilterGroup$1;", "operationFilterGroup", "iqoption/operationhistory/OperationViewModel$operationFilterGroup$1", "Liqoption/operationhistory/OperationViewModel$operationFilterGroup$1;", "searchResultDataSource", "", "Lcom/iqoption/core/microservices/transaction/Transaction;", "statusFilterGroup", "iqoption/operationhistory/OperationViewModel$statusFilterGroup$1", "Liqoption/operationhistory/OperationViewModel$statusFilterGroup$1;", "transactions", "Landroidx/lifecycle/LiveData;", "Liqoption/operationhistory/OperationViewModel$OperationsResult;", "getTransactions", "()Landroidx/lifecycle/LiveData;", "transactionsLiveData", "Landroidx/lifecycle/MutableLiveData;", "changedFilterLiveData", "filterGroupByFilterType", "Liqoption/operationhistory/OperationViewModel$FilterGroup;", "filterType", "getFilterItems", "", "Liqoption/operationhistory/OperationViewModel$FilterItem;", "filterGroup", "getSelectionFilterString", "", "performSearch", "", "startFrom", "", "performSearchRx", "Lio/reactivex/Single;", "Lcom/iqoption/core/ui/Resource;", "toggleSelection", "filterItem", "Companion", "FilterGroup", "FilterItem", "FilterType", "OperationsResult", "operationhistory_release"})
/* compiled from: OperationViewModel.kt */
public final class OperationViewModel extends com.iqoption.core.ui.f.d {
    private static final Calendar calendar = GregorianCalendar.getInstance();
    public static final a eUW = new a();
    private final io.reactivex.processors.a<FilterType> eUP;
    private final List<Transaction> eUQ = new ArrayList();
    private final MutableLiveData<d> eUR = new MutableLiveData();
    private final LiveData<d> eUS = this.eUR;
    private final e eUT = new e(FilterType.DATE, m.listOf(new c(com.iqoption.j.c.f.all_time, true), new c(com.iqoption.j.c.f.today, false), new c(com.iqoption.j.c.f.yesterday, false), new c(com.iqoption.j.c.f.last_7_days, false), new c(com.iqoption.j.c.f.month_1, false), new c(com.iqoption.j.c.f.month_3, false)));
    private final f eUU;
    private final l eUV;

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, bng = {"Liqoption/operationhistory/OperationViewModel$FilterType;", "", "(Ljava/lang/String;I)V", "DATE", "STATUS", "OPERATION", "operationhistory_release"})
    /* compiled from: OperationViewModel.kt */
    public enum FilterType {
        DATE,
        STATUS,
        OPERATION
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\tH\u0002R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, bng = {"Liqoption/operationhistory/OperationViewModel$Companion;", "", "()V", "calendar", "Ljava/util/Calendar;", "kotlin.jvm.PlatformType", "get", "Liqoption/operationhistory/OperationViewModel;", "fragment", "Landroidx/fragment/app/Fragment;", "getHost", "operationhistory_release"})
    /* compiled from: OperationViewModel.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final OperationViewModel bG(Fragment fragment) {
            kotlin.jvm.internal.i.f(fragment, "fragment");
            ViewModel viewModel = ViewModelProviders.of(aj(fragment)).get(OperationViewModel.class);
            kotlin.jvm.internal.i.e(viewModel, "ViewModelProviders.of(ge…ionViewModel::class.java)");
            return (OperationViewModel) viewModel;
        }

        private final Fragment aj(Fragment fragment) {
            return fragment instanceof iqoption.operationhistory.a.a ? fragment : com.iqoption.core.ext.a.a(fragment, iqoption.operationhistory.a.a.class);
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\u001c\u0010\f\u001a\u00020\r2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00010\u000fH&J\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u0010\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u0006H\u0016R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, bng = {"Liqoption/operationhistory/OperationViewModel$FilterGroup;", "", "filterType", "Liqoption/operationhistory/OperationViewModel$FilterType;", "filterItems", "", "Liqoption/operationhistory/OperationViewModel$FilterItem;", "(Liqoption/operationhistory/OperationViewModel$FilterType;Ljava/util/List;)V", "getFilterItems", "()Ljava/util/List;", "getFilterType", "()Liqoption/operationhistory/OperationViewModel$FilterType;", "applyFilterParams", "", "params", "", "", "getSelectedItems", "multiSelection", "", "toggleSelection", "filterItem", "operationhistory_release"})
    /* compiled from: OperationViewModel.kt */
    public static abstract class b {
        private final FilterType eUX;
        private final List<c> eUY;

        public boolean bmW() {
            return true;
        }

        public b(FilterType filterType, List<c> list) {
            kotlin.jvm.internal.i.f(filterType, "filterType");
            kotlin.jvm.internal.i.f(list, "filterItems");
            this.eUX = filterType;
            this.eUY = list;
        }

        public final List<c> bmY() {
            return this.eUY;
        }

        public void a(c cVar) {
            kotlin.jvm.internal.i.f(cVar, "filterItem");
            Object obj;
            c cVar2;
            if (cVar.bmZ() != com.iqoption.j.c.f.all) {
                c cVar3;
                Object obj2;
                String str;
                cVar.setSelected(cVar.asM() ^ 1);
                Collection arrayList = new ArrayList();
                for (Object obj22 : this.eUY) {
                    cVar3 = (c) obj22;
                    obj = (cVar3.bmZ() == com.iqoption.j.c.f.all || !cVar3.asM()) ? null : 1;
                    if (obj != null) {
                        arrayList.add(obj22);
                    }
                }
                List list = (List) arrayList;
                Iterator it = this.eUY.iterator();
                Object obj3;
                do {
                    str = "Collection contains no element matching the predicate.";
                    if (it.hasNext()) {
                        cVar2 = (c) it.next();
                        if (cVar2.bmZ() == com.iqoption.j.c.f.all) {
                            obj3 = 1;
                            continue;
                        } else {
                            obj3 = null;
                            continue;
                        }
                    } else {
                        throw new NoSuchElementException(str);
                    }
                } while (obj3 == null);
                cVar2.setSelected(list.isEmpty());
                if (list.size() == this.eUY.size() - 1) {
                    for (c cVar4 : this.eUY) {
                        if (cVar4.bmZ() == com.iqoption.j.c.f.all) {
                            obj22 = 1;
                            continue;
                        } else {
                            obj22 = null;
                            continue;
                        }
                        if (obj22 != null) {
                            cVar4.setSelected(true);
                            arrayList = new ArrayList();
                            for (Object obj222 : this.eUY) {
                                cVar3 = (c) obj222;
                                obj = (cVar3.bmZ() == com.iqoption.j.c.f.all || !cVar3.asM()) ? null : 1;
                                if (obj != null) {
                                    arrayList.add(obj222);
                                }
                            }
                            for (c cVar42 : (List) arrayList) {
                                cVar42.setSelected(false);
                            }
                            return;
                        }
                    }
                    throw new NoSuchElementException(str);
                }
            } else if (!cVar.asM()) {
                Collection arrayList2 = new ArrayList();
                for (Object obj4 : this.eUY) {
                    if ((((c) obj4).bmZ() != com.iqoption.j.c.f.all ? 1 : null) != null) {
                        arrayList2.add(obj4);
                    }
                }
                for (c cVar22 : (List) arrayList2) {
                    cVar22.setSelected(false);
                }
                cVar.setSelected(true);
            }
        }

        public final List<c> bmX() {
            Collection arrayList = new ArrayList();
            Iterator it = this.eUY.iterator();
            while (true) {
                int i = 1;
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                c cVar = (c) next;
                if (!cVar.asM() || cVar.bmZ() == com.iqoption.j.c.f.all) {
                    i = 0;
                }
                if (i != 0) {
                    arrayList.add(next);
                }
            }
            List list = (List) arrayList;
            List singletonList;
            if (list.isEmpty() || list.size() == this.eUY.size() - 1) {
                singletonList = Collections.singletonList(u.bU(this.eUY));
                kotlin.jvm.internal.i.e(singletonList, "Collections.singletonList(filterItems.first())");
                return singletonList;
            } else if (bmW()) {
                return list;
            } else {
                singletonList = Collections.singletonList(u.bU(list));
                kotlin.jvm.internal.i.e(singletonList, "Collections.singletonList(selected.first())");
                return singletonList;
            }
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u0002J\b\u0010\u0012\u001a\u00020\u0003H\u0016J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0015"}, bng = {"Liqoption/operationhistory/OperationViewModel$FilterItem;", "", "stringRes", "", "selected", "", "(IZ)V", "getSelected", "()Z", "setSelected", "(Z)V", "getStringRes", "()I", "component1", "component2", "copy", "equals", "other", "hashCode", "toString", "", "operationhistory_release"})
    /* compiled from: OperationViewModel.kt */
    public static final class c {
        private boolean cFW;
        private final int eUZ;

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("FilterItem(stringRes=");
            stringBuilder.append(this.eUZ);
            stringBuilder.append(", selected=");
            stringBuilder.append(this.cFW);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public c(int i, boolean z) {
            this.eUZ = i;
            this.cFW = z;
        }

        public final boolean asM() {
            return this.cFW;
        }

        public final int bmZ() {
            return this.eUZ;
        }

        public final void setSelected(boolean z) {
            this.cFW = z;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((kotlin.jvm.internal.i.y(getClass(), obj != null ? obj.getClass() : null) ^ 1) != 0) {
                return false;
            }
            if (obj != null) {
                if (this.eUZ != ((c) obj).eUZ) {
                    return false;
                }
                return true;
            }
            throw new TypeCastException("null cannot be cast to non-null type iqoption.operationhistory.OperationViewModel.FilterItem");
        }

        public int hashCode() {
            return this.eUZ;
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B3\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0018\u001a\u00020\bHÆ\u0003J\t\u0010\u0019\u001a\u00020\bHÆ\u0003J\t\u0010\u001a\u001a\u00020\u000bHÆ\u0003JA\u0010\u001b\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u00062\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\bHÖ\u0001J\t\u0010\u001f\u001a\u00020 HÖ\u0001R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000e¨\u0006!"}, bng = {"Liqoption/operationhistory/OperationViewModel$OperationsResult;", "", "items", "", "Lcom/iqoption/core/microservices/transaction/Transaction;", "hasMore", "", "lastOffset", "", "allCount", "currency", "Lcom/iqoption/core/microservices/configuration/response/Currency;", "(Ljava/util/List;ZIILcom/iqoption/core/microservices/configuration/response/Currency;)V", "getAllCount", "()I", "getCurrency", "()Lcom/iqoption/core/microservices/configuration/response/Currency;", "getHasMore", "()Z", "getItems", "()Ljava/util/List;", "getLastOffset", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "toString", "", "operationhistory_release"})
    /* compiled from: OperationViewModel.kt */
    public static final class d {
        private final com.iqoption.core.microservices.configuration.a.d bcN;
        private final boolean btw;
        private final int dYP;
        private final int eVa;
        private final List<Transaction> iA;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof d) {
                    d dVar = (d) obj;
                    if (kotlin.jvm.internal.i.y(this.iA, dVar.iA)) {
                        if ((this.btw == dVar.btw ? 1 : null) != null) {
                            if ((this.dYP == dVar.dYP ? 1 : null) != null) {
                                if ((this.eVa == dVar.eVa ? 1 : null) == null || !kotlin.jvm.internal.i.y(this.bcN, dVar.bcN)) {
                                    return false;
                                }
                            }
                        }
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            List list = this.iA;
            int i = 0;
            int hashCode = (list != null ? list.hashCode() : 0) * 31;
            int i2 = this.btw;
            if (i2 != 0) {
                i2 = 1;
            }
            hashCode = (((((hashCode + i2) * 31) + this.dYP) * 31) + this.eVa) * 31;
            com.iqoption.core.microservices.configuration.a.d dVar = this.bcN;
            if (dVar != null) {
                i = dVar.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("OperationsResult(items=");
            stringBuilder.append(this.iA);
            stringBuilder.append(", hasMore=");
            stringBuilder.append(this.btw);
            stringBuilder.append(", lastOffset=");
            stringBuilder.append(this.dYP);
            stringBuilder.append(", allCount=");
            stringBuilder.append(this.eVa);
            stringBuilder.append(", currency=");
            stringBuilder.append(this.bcN);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public d(List<Transaction> list, boolean z, int i, int i2, com.iqoption.core.microservices.configuration.a.d dVar) {
            kotlin.jvm.internal.i.f(list, "items");
            kotlin.jvm.internal.i.f(dVar, "currency");
            this.iA = list;
            this.btw = z;
            this.dYP = i;
            this.eVa = i2;
            this.bcN = dVar;
        }

        public final List<Transaction> getItems() {
            return this.iA;
        }

        public final boolean adP() {
            return this.btw;
        }

        public final int bna() {
            return this.dYP;
        }

        public final com.iqoption.core.microservices.configuration.a.d VM() {
            return this.bcN;
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0016J\b\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\fH\u0016¨\u0006\r"}, bng = {"iqoption/operationhistory/OperationViewModel$dateFilterGroup$1", "Liqoption/operationhistory/OperationViewModel$FilterGroup;", "applyFilterParams", "", "params", "", "", "", "multiSelection", "", "toggleSelection", "filterItem", "Liqoption/operationhistory/OperationViewModel$FilterItem;", "operationhistory_release"})
    /* compiled from: OperationViewModel.kt */
    public static final class e extends b {
        public boolean bmW() {
            return false;
        }

        e(FilterType filterType, List list) {
            super(filterType, list);
        }

        /* JADX WARNING: Removed duplicated region for block: B:30:0x00e8  */
        /* JADX WARNING: Removed duplicated region for block: B:32:0x00f3  */
        /* JADX WARNING: Removed duplicated region for block: B:30:0x00e8  */
        /* JADX WARNING: Removed duplicated region for block: B:32:0x00f3  */
        public void T(java.util.Map<java.lang.String, java.lang.Object> r9) {
            /*
            r8 = this;
            r0 = "params";
            kotlin.jvm.internal.i.f(r9, r0);
            r0 = r8.bmY();
            r0 = (java.lang.Iterable) r0;
            r0 = r0.iterator();
        L_0x000f:
            r1 = r0.hasNext();
            if (r1 == 0) goto L_0x0023;
        L_0x0015:
            r1 = r0.next();
            r2 = r1;
            r2 = (iqoption.operationhistory.OperationViewModel.c) r2;
            r2 = r2.asM();
            if (r2 == 0) goto L_0x000f;
        L_0x0022:
            goto L_0x0024;
        L_0x0023:
            r1 = 0;
        L_0x0024:
            r1 = (iqoption.operationhistory.OperationViewModel.c) r1;
            if (r1 == 0) goto L_0x00fc;
        L_0x0028:
            r0 = r1.bmZ();
            r2 = com.iqoption.j.c.f.all_time;
            if (r0 != r2) goto L_0x0031;
        L_0x0030:
            return;
        L_0x0031:
            r0 = iqoption.operationhistory.OperationViewModel.calendar;
            r2 = "calendar";
            kotlin.jvm.internal.i.e(r0, r2);
            r3 = java.lang.System.currentTimeMillis();
            r0.setTimeInMillis(r3);
            r0 = r1.bmZ();
            r1 = com.iqoption.j.c.f.today;
            r3 = 5;
            r4 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
            r5 = -1;
            if (r0 != r1) goto L_0x0066;
        L_0x004d:
            r0 = iqoption.operationhistory.OperationViewModel.calendar;
            r0.add(r3, r5);
            r0 = iqoption.operationhistory.OperationViewModel.calendar;
            kotlin.jvm.internal.i.e(r0, r2);
            r0 = r0.getTimeInMillis();
            r2 = (long) r4;
            r0 = r0 / r2;
        L_0x0061:
            r1 = (int) r0;
            r0 = r1;
        L_0x0063:
            r1 = -1;
            goto L_0x00e6;
        L_0x0066:
            r1 = com.iqoption.j.c.f.yesterday;
            if (r0 != r1) goto L_0x0094;
        L_0x006a:
            r0 = iqoption.operationhistory.OperationViewModel.calendar;
            r0.add(r3, r5);
            r0 = iqoption.operationhistory.OperationViewModel.calendar;
            kotlin.jvm.internal.i.e(r0, r2);
            r0 = r0.getTimeInMillis();
            r6 = (long) r4;
            r0 = r0 / r6;
            r1 = (int) r0;
            r0 = iqoption.operationhistory.OperationViewModel.calendar;
            r0.add(r3, r5);
            r0 = iqoption.operationhistory.OperationViewModel.calendar;
            kotlin.jvm.internal.i.e(r0, r2);
            r2 = r0.getTimeInMillis();
            r2 = r2 / r6;
            r0 = (int) r2;
            goto L_0x00e6;
        L_0x0094:
            r1 = com.iqoption.j.c.f.last_7_days;
            if (r0 != r1) goto L_0x00ae;
        L_0x0098:
            r0 = iqoption.operationhistory.OperationViewModel.calendar;
            r1 = -7;
            r0.add(r3, r1);
            r0 = iqoption.operationhistory.OperationViewModel.calendar;
            kotlin.jvm.internal.i.e(r0, r2);
            r0 = r0.getTimeInMillis();
            r2 = (long) r4;
            r0 = r0 / r2;
            goto L_0x0061;
        L_0x00ae:
            r1 = com.iqoption.j.c.f.month_1;
            r3 = 2;
            if (r0 != r1) goto L_0x00c8;
        L_0x00b3:
            r0 = iqoption.operationhistory.OperationViewModel.calendar;
            r0.add(r3, r5);
            r0 = iqoption.operationhistory.OperationViewModel.calendar;
            kotlin.jvm.internal.i.e(r0, r2);
            r0 = r0.getTimeInMillis();
            r2 = (long) r4;
            r0 = r0 / r2;
            goto L_0x0061;
        L_0x00c8:
            r1 = com.iqoption.j.c.f.month_3;
            if (r0 != r1) goto L_0x00e3;
        L_0x00cc:
            r0 = iqoption.operationhistory.OperationViewModel.calendar;
            r1 = -3;
            r0.add(r3, r1);
            r0 = iqoption.operationhistory.OperationViewModel.calendar;
            kotlin.jvm.internal.i.e(r0, r2);
            r0 = r0.getTimeInMillis();
            r2 = (long) r4;
            r0 = r0 / r2;
            goto L_0x0061;
        L_0x00e3:
            r0 = -1;
            goto L_0x0063;
        L_0x00e6:
            if (r1 == r5) goto L_0x00f1;
        L_0x00e8:
            r1 = java.lang.Integer.valueOf(r1);
            r2 = "to";
            r9.put(r2, r1);
        L_0x00f1:
            if (r0 == r5) goto L_0x00fc;
        L_0x00f3:
            r0 = java.lang.Integer.valueOf(r0);
            r1 = "from";
            r9.put(r1, r0);
        L_0x00fc:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: iqoption.operationhistory.OperationViewModel$e.T(java.util.Map):void");
        }

        public void a(c cVar) {
            kotlin.jvm.internal.i.f(cVar, "filterItem");
            for (c selected : bmY()) {
                selected.setSelected(false);
            }
            cVar.setSelected(true);
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0016¨\u0006\b"}, bng = {"iqoption/operationhistory/OperationViewModel$operationFilterGroup$1", "Liqoption/operationhistory/OperationViewModel$FilterGroup;", "applyFilterParams", "", "params", "", "", "", "operationhistory_release"})
    /* compiled from: OperationViewModel.kt */
    public static final class f extends b {
        f(FilterType filterType, List list) {
            super(filterType, list);
        }

        public void T(Map<String, Object> map) {
            kotlin.jvm.internal.i.f(map, "params");
            Collection arrayList = new ArrayList();
            for (Object next : bmY()) {
                if (((c) next).asM()) {
                    arrayList.add(next);
                }
            }
            List list = (List) arrayList;
            List arrayList2 = new ArrayList();
            if (list.size() == 1 && ((c) list.get(0)).bmZ() == com.iqoption.j.c.f.all) {
                Collection arrayList3 = new ArrayList();
                for (Object next2 : bmY()) {
                    if ((((c) next2).bmZ() != com.iqoption.j.c.f.all ? 1 : null) != null) {
                        arrayList3.add(next2);
                    }
                }
                list = (List) arrayList3;
            }
            for (c bmZ : list) {
                int bmZ2 = bmZ.bmZ();
                if (bmZ2 == com.iqoption.j.c.f.refill) {
                    arrayList2.add("deposit");
                } else if (bmZ2 == com.iqoption.j.c.f.withdrawal) {
                    arrayList2.add("withdrawal");
                } else if (bmZ2 == com.iqoption.j.c.f.tournament_rebuy) {
                    arrayList2.add("tournament_rebuy");
                } else if (bmZ2 == com.iqoption.j.c.f.tournament_reward) {
                    arrayList2.add("tournament_reward");
                }
            }
            map.put("types", arrayList2);
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, bng = {"<anonymous>", "", "it", "Lcom/iqoption/core/ui/Resource;", "Liqoption/operationhistory/OperationViewModel$OperationsResult;", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: OperationViewModel.kt */
    static final class g<T> implements io.reactivex.b.f<com.iqoption.core.ui.d<d>> {
        final /* synthetic */ OperationViewModel eVb;

        g(OperationViewModel operationViewModel) {
            this.eVb = operationViewModel;
        }

        /* renamed from: b */
        public final void accept(com.iqoption.core.ui.d<d> dVar) {
            this.eVb.eUR.postValue(dVar != null ? (d) dVar.getData() : null);
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "error", "", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: OperationViewModel.kt */
    static final class h<T> implements io.reactivex.b.f<Throwable> {
        public static final h eVc = new h();

        h() {
        }

        /* renamed from: o */
        public final void accept(Throwable th) {
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a4\u00120\u0012.\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004 \u0006*\u0016\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u00020\u00020\u00012\u0006\u0010\u0007\u001a\u00020\bH\n¢\u0006\u0002\b\t"}, bng = {"<anonymous>", "Lio/reactivex/Single;", "Lkotlin/Pair;", "Lcom/iqoption/core/microservices/configuration/response/Currency;", "", "Lcom/iqoption/core/microservices/transaction/Transaction;", "kotlin.jvm.PlatformType", "balance", "Lcom/iqoption/core/data/mediators/BalanceData;", "apply"})
    /* compiled from: OperationViewModel.kt */
    static final class i<T, R> implements io.reactivex.b.g<T, t<? extends R>> {
        final /* synthetic */ Map eVd;
        final /* synthetic */ int eVe;

        i(Map map, int i) {
            this.eVd = map;
            this.eVe = i;
        }

        /* renamed from: e */
        public final p<Pair<com.iqoption.core.microservices.configuration.a.d, List<Transaction>>> apply(final com.iqoption.core.data.c.a aVar) {
            kotlin.jvm.internal.i.f(aVar, "balance");
            return com.iqoption.core.microservices.transaction.b.a(com.iqoption.core.microservices.transaction.b.bCV, this.eVd, this.eVe, 0, 4, null).t(new io.reactivex.b.g<T, R>() {
                /* renamed from: aP */
                public final Pair<com.iqoption.core.microservices.configuration.a.d, List<Transaction>> apply(List<Transaction> list) {
                    kotlin.jvm.internal.i.f(list, "it");
                    return new Pair(aVar.VM(), list);
                }
            });
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0018\u0010\u0003\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0004H\n¢\u0006\u0002\b\b"}, bng = {"<anonymous>", "Lcom/iqoption/core/ui/Resource;", "Liqoption/operationhistory/OperationViewModel$OperationsResult;", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "Lcom/iqoption/core/microservices/configuration/response/Currency;", "", "Lcom/iqoption/core/microservices/transaction/Transaction;", "apply"})
    /* compiled from: OperationViewModel.kt */
    static final class j<T, R> implements io.reactivex.b.g<T, R> {
        final /* synthetic */ OperationViewModel eVb;
        final /* synthetic */ int eVe;

        j(OperationViewModel operationViewModel, int i) {
            this.eVb = operationViewModel;
            this.eVe = i;
        }

        /* renamed from: l */
        public final com.iqoption.core.ui.d<d> apply(Pair<com.iqoption.core.microservices.configuration.a.d, ? extends List<Transaction>> pair) {
            kotlin.jvm.internal.i.f(pair, "<name for destructuring parameter 0>");
            com.iqoption.core.microservices.configuration.a.d dVar = (com.iqoption.core.microservices.configuration.a.d) pair.bnj();
            List list = (List) pair.bnk();
            if (this.eVe == 0) {
                this.eVb.eUQ.clear();
            }
            List b = this.eVb.eUQ;
            kotlin.jvm.internal.i.e(list, "transactions");
            b.addAll(list);
            int size = this.eVb.eUQ.size();
            return com.iqoption.core.ui.d.bHb.bS(new d(this.eVb.eUQ, size == this.eVe + 100, this.eVe, size, dVar));
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "Lcom/iqoption/core/ui/Resource;", "Liqoption/operationhistory/OperationViewModel$OperationsResult;", "it", "", "apply"})
    /* compiled from: OperationViewModel.kt */
    static final class k<T, R> implements io.reactivex.b.g<Throwable, com.iqoption.core.ui.d<d>> {
        public static final k eVg = new k();

        k() {
        }

        /* renamed from: w */
        public final com.iqoption.core.ui.d<d> apply(Throwable th) {
            kotlin.jvm.internal.i.f(th, "it");
            return com.iqoption.core.ui.d.a.a(com.iqoption.core.ui.d.bHb, th, null, null, 6, null);
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0016¨\u0006\b"}, bng = {"iqoption/operationhistory/OperationViewModel$statusFilterGroup$1", "Liqoption/operationhistory/OperationViewModel$FilterGroup;", "applyFilterParams", "", "params", "", "", "", "operationhistory_release"})
    /* compiled from: OperationViewModel.kt */
    public static final class l extends b {
        l(FilterType filterType, List list) {
            super(filterType, list);
        }

        public void T(Map<String, Object> map) {
            kotlin.jvm.internal.i.f(map, "params");
            Collection arrayList = new ArrayList();
            for (Object next : bmY()) {
                if (((c) next).asM()) {
                    arrayList.add(next);
                }
            }
            List<c> list = (List) arrayList;
            if (list.size() != 1 || ((c) list.get(0)).bmZ() != com.iqoption.j.c.f.all) {
                List arrayList2 = new ArrayList();
                for (c bmZ : list) {
                    int bmZ2 = bmZ.bmZ();
                    if (bmZ2 == com.iqoption.j.c.f.completed) {
                        arrayList2.add("completed");
                    } else if (bmZ2 == com.iqoption.j.c.f.in_process) {
                        arrayList2.add("in_process");
                    } else if (bmZ2 == com.iqoption.j.c.f.canceled) {
                        arrayList2.add("canceled");
                    } else if (bmZ2 == com.iqoption.j.c.f.failed) {
                        arrayList2.add("failed");
                    }
                }
                map.put("statuses", arrayList2);
            }
        }
    }

    public OperationViewModel() {
        io.reactivex.processors.a bmJ = BehaviorProcessor.bmG().bmJ();
        kotlin.jvm.internal.i.e(bmJ, "BehaviorProcessor.create…terType>().toSerialized()");
        this.eUP = bmJ;
        FilterType filterType = FilterType.OPERATION;
        List arrayList = new ArrayList();
        arrayList.add(new c(com.iqoption.j.c.f.all, true));
        arrayList.add(new c(com.iqoption.j.c.f.refill, false));
        arrayList.add(new c(com.iqoption.j.c.f.withdrawal, false));
        if (!com.iqoption.core.d.Un().Dq()) {
            arrayList.add(new c(com.iqoption.j.c.f.tournament_rebuy, false));
            arrayList.add(new c(com.iqoption.j.c.f.tournament_reward, false));
        }
        this.eUU = new f(filterType, arrayList);
        this.eUV = new l(FilterType.STATUS, m.listOf(new c(com.iqoption.j.c.f.all, true), new c(com.iqoption.j.c.f.completed, false), new c(com.iqoption.j.c.f.in_process, false), new c(com.iqoption.j.c.f.canceled, false), new c(com.iqoption.j.c.f.failed, false)));
    }

    public final LiveData<d> bmT() {
        return this.eUS;
    }

    public final void jH(int i) {
        io.reactivex.disposables.b a = jI(i).h(com.iqoption.core.rx.i.aki()).g(com.iqoption.core.rx.i.akj()).a((io.reactivex.b.f) new g(this), (io.reactivex.b.f) h.eVc);
        kotlin.jvm.internal.i.e(a, "performSearchRx(startFro…      }\n                )");
        b(a);
    }

    private final p<com.iqoption.core.ui.d<d>> jI(int i) {
        Map linkedHashMap = new LinkedHashMap();
        this.eUT.T(linkedHashMap);
        this.eUU.T(linkedHashMap);
        this.eUV.T(linkedHashMap);
        p u = com.iqoption.core.data.c.b.bcS.VT().bkV().q(new i(linkedHashMap, i)).t(new j(this, i)).u(k.eVg);
        kotlin.jvm.internal.i.e(u, "BalanceMediator.observeR…rn { Resource.error(it) }");
        return u;
    }

    public final String d(FilterType filterType) {
        kotlin.jvm.internal.i.f(filterType, "filterType");
        CharSequence charSequence = ", ";
        Iterable<c> bmX = e(filterType).bmX();
        Collection arrayList = new ArrayList(n.e(bmX, 10));
        for (c bmZ : bmX) {
            arrayList.add(com.iqoption.core.d.getString(bmZ.bmZ()));
        }
        String join = TextUtils.join(charSequence, (List) arrayList);
        kotlin.jvm.internal.i.e(join, "TextUtils.join(\", \", sel…etString(it.stringRes) })");
        return join;
    }

    public final b e(FilterType filterType) {
        kotlin.jvm.internal.i.f(filterType, "filterType");
        int i = c.aob[filterType.ordinal()];
        if (i == 1) {
            return this.eUT;
        }
        if (i == 2) {
            return this.eUV;
        }
        if (i == 3) {
            return this.eUU;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final void a(c cVar, FilterType filterType) {
        kotlin.jvm.internal.i.f(cVar, "filterItem");
        kotlin.jvm.internal.i.f(filterType, "filterType");
        e(filterType).a(cVar);
        this.eUP.onNext(filterType);
    }

    public final List<c> a(b bVar) {
        kotlin.jvm.internal.i.f(bVar, "filterGroup");
        return bVar.bmY();
    }

    public final LiveData<FilterType> bmU() {
        LiveData fromPublisher = LiveDataReactiveStreams.fromPublisher(this.eUP.c(com.iqoption.core.rx.i.akj()));
        kotlin.jvm.internal.i.e(fromPublisher, "LiveDataReactiveStreams.…rProcessor.observeOn(ui))");
        return fromPublisher;
    }
}
