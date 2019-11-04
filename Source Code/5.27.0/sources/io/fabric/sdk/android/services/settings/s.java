package io.fabric.sdk.android.services.settings;

/* compiled from: SettingsData */
public class s {
    public final e ePV;
    public final p ePW;
    public final m ePX;
    public final f ePY;
    public final long ePZ;
    public final int eQa;
    public final int eQb;
    public final b oL;
    public final o qJ;

    public s(long j, e eVar, p pVar, o oVar, m mVar, b bVar, f fVar, int i, int i2) {
        this.ePZ = j;
        this.ePV = eVar;
        this.ePW = pVar;
        this.qJ = oVar;
        this.ePX = mVar;
        this.eQa = i;
        this.eQb = i2;
        this.oL = bVar;
        this.ePY = fVar;
    }

    public boolean cN(long j) {
        return this.ePZ < j;
    }
}
