package com.iqoption.core.util;

import android.os.Bundle;
import android.widget.Filter;
import android.widget.Filter.FilterResults;
import androidx.annotation.NonNull;
import androidx.arch.core.util.Function;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: IndexedFilter */
public class s<T, I> extends Filter {
    private Bundle args = new Bundle();
    private final ImmutableList<T> bQJ;
    private final b bQK;
    private final d<T, I> bQL;
    private final c<T, I> bQM;
    private I index;

    /* compiled from: IndexedFilter */
    public static final class a<T, I> {
        private final ImmutableList<T> bQJ;
        private b<T> bQK;
        private d<T, I> bQL;
        private c<T, I> bQM;

        private a(ImmutableList<T> immutableList) {
            this.bQJ = immutableList;
        }

        public a<T, I> a(b<T> bVar) {
            this.bQK = bVar;
            return this;
        }

        public a<T, I> a(d<T, I> dVar) {
            this.bQL = dVar;
            return this;
        }

        public a<T, I> a(c<T, I> cVar) {
            this.bQM = cVar;
            return this;
        }

        public s<T, I> ano() {
            return new s(this);
        }
    }

    /* compiled from: IndexedFilter */
    public interface b<T> {
        void a(CharSequence charSequence, ImmutableList<T> immutableList);
    }

    /* compiled from: IndexedFilter */
    public interface c<T, I> {
        ImmutableList<T> d(I i, CharSequence charSequence);
    }

    /* compiled from: IndexedFilter */
    public interface d<T, I> {
        I f(ImmutableList<T> immutableList);
    }

    public static <T, I> a<T, I> z(@NonNull Collection<T> collection) {
        return new a(ImmutableList.m(collection));
    }

    public static <T> Map<Character, List<T>> a(List<T> list, Function<T, String> function) {
        HashMap uk = Maps.uk();
        for (Object next : list) {
            for (String charAt : ((String) function.apply(next)).split(" ")) {
                Character valueOf = Character.valueOf(Character.toLowerCase(charAt.charAt(0)));
                List list2 = (List) uk.get(valueOf);
                if (list2 == null) {
                    list2 = Lists.newArrayList();
                    uk.put(valueOf, list2);
                }
                if (!list2.contains(next)) {
                    list2.add(next);
                }
            }
        }
        uk.put(null, list);
        return uk;
    }

    public s(@NonNull a<T, I> aVar) {
        this.bQJ = aVar.bQJ;
        this.bQK = aVar.bQK;
        this.bQL = aVar.bQL;
        this.bQM = aVar.bQM;
    }

    /* Access modifiers changed, original: protected */
    public FilterResults performFiltering(CharSequence charSequence) {
        ImmutableList hp = hp(F(charSequence));
        FilterResults filterResults = new FilterResults();
        filterResults.values = hp;
        filterResults.count = hp.size();
        return filterResults;
    }

    private ImmutableList<T> hp(String str) {
        if (this.index == null) {
            this.index = this.bQL.f(ImmutableList.m(this.bQJ));
        }
        return this.bQM.d(this.index, str);
    }

    /* Access modifiers changed, original: protected */
    public void publishResults(CharSequence charSequence, FilterResults filterResults) {
        this.bQK.a(F(charSequence), (ImmutableList) filterResults.values);
    }

    private static String F(CharSequence charSequence) {
        return charSequence != null ? charSequence.toString() : "";
    }
}
