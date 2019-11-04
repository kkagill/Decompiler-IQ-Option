package com.iqoption.mobbtech.connect.response.options;

import android.util.Pair;
import com.google.common.collect.ImmutableList;
import com.iqoption.dto.entity.position.Order;
import com.iqoption.dto.entity.position.Position;

public interface OptionEvents {
    public static final String TAG = "com.iqoption.mobbtech.connect.response.options.OptionEvents";

    public enum TYPE_REMOVE_GROUP {
        EXPIRED,
        SELL,
        HOVERING
    }

    public static class b {
    }

    public static class c {
    }

    public interface l {
    }

    public static class q {
    }

    public static class a implements OptionEvents {
        public ImmutableList<a> dJn;
        public final a dJo;
        public final Long dJp;

        public a(ImmutableList<a> immutableList, a aVar, Long l) {
            this.dJn = immutableList;
            this.dJo = aVar;
            this.dJp = l;
        }

        public boolean a(ImmutableList<a> immutableList, ImmutableList<b> immutableList2) {
            this.dJn = immutableList;
            int indexOf = immutableList.indexOf(this.dJo);
            return indexOf != -1 ? ((a) immutableList.get(indexOf)).B(this.dJp) : false;
        }
    }

    public static class h implements OptionEvents, l {
        public ImmutableList<b> dJq;
        public final b dJr;

        public h(ImmutableList<b> immutableList, b bVar) {
            this.dJq = immutableList;
            this.dJr = bVar;
        }

        public boolean a(ImmutableList<a> immutableList, ImmutableList<b> immutableList2) {
            this.dJq = immutableList2;
            return immutableList2.contains(this.dJr);
        }
    }

    public static class i implements OptionEvents {
        public ImmutableList<b> dJq;
        public b dJs;
        public final c dJt;

        public i(ImmutableList<b> immutableList, b bVar, c cVar) {
            this.dJq = immutableList;
            this.dJs = bVar;
            this.dJt = cVar;
        }

        public boolean a(ImmutableList<a> immutableList, ImmutableList<b> immutableList2) {
            this.dJq = immutableList2;
            int indexOf = immutableList2.indexOf(this.dJs);
            if (indexOf == -1) {
                return false;
            }
            this.dJs = (b) immutableList2.get(indexOf);
            return this.dJs.aPX().contains(this.dJt);
        }
    }

    public static class j implements OptionEvents, l {
        public ImmutableList<b> dJq;
        public final c dJu;
        public final b doc;

        public j(ImmutableList<b> immutableList, b bVar, c cVar) {
            this.dJq = immutableList;
            this.doc = bVar;
            this.dJu = cVar;
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof j) && com.google.common.base.f.equal(this.dJu, ((j) obj).dJu));
        }

        public int hashCode() {
            return com.google.common.base.f.hashCode(this.dJu);
        }

        public boolean a(ImmutableList<a> immutableList, ImmutableList<b> immutableList2) {
            this.dJq = immutableList2;
            return immutableList2.contains(this.doc);
        }
    }

    public static class k implements OptionEvents, l {
        public ImmutableList<b> dJq;
        public final b dJv;
        public final TYPE_REMOVE_GROUP dJw;

        public k(ImmutableList<b> immutableList, b bVar, TYPE_REMOVE_GROUP type_remove_group) {
            this.dJq = immutableList;
            this.dJv = bVar;
            this.dJw = type_remove_group;
        }

        public boolean a(ImmutableList<a> immutableList, ImmutableList<b> immutableList2) {
            this.dJq = immutableList2;
            return true;
        }
    }

    public static class m implements l {
    }

    public static class d extends com.iqoption.system.a.c<Order> {
    }

    public static class e extends com.iqoption.system.a.c<Order> {
    }

    public static class f extends com.iqoption.system.a.c<Order> {
        public f(Order order) {
            setValue(order);
        }
    }

    public static class g extends com.iqoption.system.a.c<Pair<ImmutableList<a>, a>> implements OptionEvents {
        public boolean a(ImmutableList<a> immutableList, ImmutableList<b> immutableList2) {
            if (!immutableList.contains(((Pair) getValue()).second)) {
                return false;
            }
            setValue(Pair.create(immutableList, ((Pair) getValue()).second));
            return true;
        }
    }

    public static class n extends com.iqoption.system.a.c<Position> implements OptionEvents {
        public boolean a(ImmutableList<a> immutableList, ImmutableList<b> immutableList2) {
            return true;
        }

        public n(Position position) {
            setValue(position);
        }
    }

    public static class o extends com.iqoption.system.a.c<Pair<ImmutableList<a>, a>> implements OptionEvents {
        public boolean a(ImmutableList<a> immutableList, ImmutableList<b> immutableList2) {
            if (!immutableList.contains(((Pair) getValue()).second)) {
                return false;
            }
            setValue(Pair.create(immutableList, ((Pair) getValue()).second));
            return true;
        }
    }

    public static class p extends com.iqoption.system.a.c<Boolean> implements OptionEvents {
        public boolean a(ImmutableList<a> immutableList, ImmutableList<b> immutableList2) {
            return true;
        }
    }

    boolean a(ImmutableList<a> immutableList, ImmutableList<b> immutableList2);
}
