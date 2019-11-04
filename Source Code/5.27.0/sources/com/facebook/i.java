package com.facebook;

import android.os.Handler;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: GraphRequestBatch */
public class i extends AbstractList<g> {
    private static AtomicInteger ur = new AtomicInteger();
    private List<a> callbacks;
    private final String id;
    private Handler us;
    private List<g> ut;
    private int uu;
    private String uv;

    /* compiled from: GraphRequestBatch */
    public interface a {
        void a(i iVar);
    }

    /* compiled from: GraphRequestBatch */
    public interface b extends a {
        void a(i iVar, long j, long j2);
    }

    public i() {
        this.ut = new ArrayList();
        this.uu = 0;
        this.id = Integer.valueOf(ur.incrementAndGet()).toString();
        this.callbacks = new ArrayList();
        this.ut = new ArrayList();
    }

    public i(Collection<g> collection) {
        this.ut = new ArrayList();
        this.uu = 0;
        this.id = Integer.valueOf(ur.incrementAndGet()).toString();
        this.callbacks = new ArrayList();
        this.ut = new ArrayList(collection);
    }

    public i(g... gVarArr) {
        this.ut = new ArrayList();
        this.uu = 0;
        this.id = Integer.valueOf(ur.incrementAndGet()).toString();
        this.callbacks = new ArrayList();
        this.ut = Arrays.asList(gVarArr);
    }

    public int getTimeout() {
        return this.uu;
    }

    public void a(a aVar) {
        if (!this.callbacks.contains(aVar)) {
            this.callbacks.add(aVar);
        }
    }

    /* renamed from: c */
    public final boolean add(g gVar) {
        return this.ut.add(gVar);
    }

    /* renamed from: a */
    public final void add(int i, g gVar) {
        this.ut.add(i, gVar);
    }

    public final void clear() {
        this.ut.clear();
    }

    /* renamed from: T */
    public final g get(int i) {
        return (g) this.ut.get(i);
    }

    /* renamed from: U */
    public final g remove(int i) {
        return (g) this.ut.remove(i);
    }

    /* renamed from: b */
    public final g set(int i, g gVar) {
        return (g) this.ut.set(i, gVar);
    }

    public final int size() {
        return this.ut.size();
    }

    /* Access modifiers changed, original: final */
    public final String getId() {
        return this.id;
    }

    /* Access modifiers changed, original: final */
    public final Handler hA() {
        return this.us;
    }

    /* Access modifiers changed, original: final */
    public final void a(Handler handler) {
        this.us = handler;
    }

    /* Access modifiers changed, original: final */
    public final List<g> hB() {
        return this.ut;
    }

    /* Access modifiers changed, original: final */
    public final List<a> u() {
        return this.callbacks;
    }

    public final String hC() {
        return this.uv;
    }

    public final List<j> hD() {
        return hE();
    }

    public final h ho() {
        return hF();
    }

    /* Access modifiers changed, original: 0000 */
    public List<j> hE() {
        return g.c(this);
    }

    /* Access modifiers changed, original: 0000 */
    public h hF() {
        return g.d(this);
    }
}
