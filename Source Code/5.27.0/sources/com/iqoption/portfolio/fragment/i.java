package com.iqoption.portfolio.fragment;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import androidx.annotation.DimenRes;
import androidx.annotation.NonNull;
import androidx.annotation.StringRes;
import com.google.common.util.concurrent.t;
import com.iqoption.portfolio.component.a.a;
import com.iqoption.portfolio.component.a.b;
import com.iqoption.portfolio.component.a.c;
import com.iqoption.portfolio.component.a.d;
import com.iqoption.portfolio.component.a.e;
import com.iqoption.portfolio.component.b.g;
import com.iqoption.portfolio.component.b.j;
import com.iqoption.portfolio.component.l;
import com.iqoption.portfolio.component.m;
import com.iqoption.portfolio.f;

/* compiled from: PortfolioDelegate */
abstract class i implements l {
    private final k dPA;

    /* Access modifiers changed, original: 0000 */
    public void T(@NonNull Bundle bundle) {
    }

    public abstract void X(Bundle bundle);

    public abstract void a(String str, com.iqoption.portfolio.component.b.i iVar, boolean z);

    public abstract void a(String str, com.iqoption.portfolio.component.b.l lVar, boolean z);

    public abstract void aQU();

    /* Access modifiers changed, original: 0000 */
    public Bundle aRa() {
        return null;
    }

    public abstract void aSe();

    public abstract void aSf();

    public abstract void aSg();

    public abstract void aSh();

    public abstract void aSi();

    public abstract void aSj();

    public abstract void aSk();

    public abstract void aSl();

    public abstract int aSm();

    public abstract int aSn();

    public abstract void aSo();

    public abstract void aSp();

    public abstract Bundle akF();

    public abstract void destroy();

    public abstract View getView();

    /* Access modifiers changed, original: 0000 */
    public void pause() {
    }

    public abstract void r(String str, String str2, boolean z);

    /* Access modifiers changed, original: 0000 */
    public void resume() {
    }

    public abstract void s(String str, String str2, boolean z);

    i(k kVar) {
        this.dPA = kVar;
    }

    public m aRX() {
        return this.dPA.aRX();
    }

    public b aRY() {
        return this.dPA.aRY();
    }

    public boolean b(com.iqoption.portfolio.component.b.l lVar) {
        return this.dPA.b(lVar);
    }

    public f aQK() {
        return this.dPA.aQK();
    }

    public c aSa() {
        return this.dPA.aSa();
    }

    public d aRZ() {
        return this.dPA.aRZ();
    }

    public boolean c(com.iqoption.portfolio.component.b.i iVar) {
        return this.dPA.c(iVar);
    }

    public boolean c(com.iqoption.portfolio.component.b.l lVar) {
        return this.dPA.c(lVar);
    }

    public com.iqoption.portfolio.component.a.f aSb() {
        return this.dPA.aSb();
    }

    public void c(com.iqoption.portfolio.b bVar) {
        this.dPA.c(bVar);
    }

    public boolean b(com.iqoption.portfolio.component.b.i iVar) {
        return this.dPA.b(iVar);
    }

    public boolean e(com.iqoption.portfolio.component.b.m mVar) {
        return this.dPA.e(mVar);
    }

    public a aSc() {
        return this.dPA.aSc();
    }

    public boolean h(j jVar) {
        return this.dPA.h(jVar);
    }

    public void reload() {
        this.dPA.reload();
    }

    public e aSd() {
        return this.dPA.aSd();
    }

    public boolean f(com.iqoption.portfolio.component.b.m mVar) {
        return this.dPA.f(mVar);
    }

    public boolean g(j jVar) {
        return this.dPA.g(jVar);
    }

    public t<?> g(com.iqoption.portfolio.component.b.m mVar) {
        return this.dPA.g(mVar);
    }

    public t<?> f(j jVar) {
        return this.dPA.f(jVar);
    }

    public boolean h(com.iqoption.portfolio.component.b.m mVar) {
        return this.dPA.h(mVar);
    }

    public boolean e(j jVar) {
        return this.dPA.e(jVar);
    }

    public void i(com.iqoption.portfolio.component.b.m mVar) {
        this.dPA.i(mVar);
    }

    public void d(g gVar) {
        this.dPA.d(gVar);
    }

    public void j(com.iqoption.portfolio.component.b.m mVar) {
        this.dPA.j(mVar);
    }

    public void d(j jVar) {
        this.dPA.d(jVar);
    }

    public void c(g gVar) {
        this.dPA.c(gVar);
    }

    public void b(g gVar) {
        this.dPA.b(gVar);
    }

    public t<?> m(Rect rect) {
        return this.dPA.m(rect);
    }

    public t<?> a(g gVar, Rect rect) {
        return this.dPA.a(gVar, rect);
    }

    /* Access modifiers changed, original: protected|final */
    public final void aSB() {
        this.dPA.close();
    }

    /* Access modifiers changed, original: protected|final */
    public final void aSC() {
        this.dPA.rx();
    }

    /* Access modifiers changed, original: protected|final */
    public final void aSD() {
        this.dPA.aSJ();
    }

    /* Access modifiers changed, original: protected|final */
    public final void bT(@NonNull View view) {
        this.dPA.bU(view);
    }

    /* Access modifiers changed, original: protected|final */
    public final int fA(@DimenRes int i) {
        return this.dPA.getResources().getDimensionPixelSize(i);
    }

    /* Access modifiers changed, original: protected|final */
    public final CharSequence eA(@StringRes int i) {
        return this.dPA.getString(i);
    }
}
