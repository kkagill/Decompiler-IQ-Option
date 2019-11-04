package com.rd.animation.a;

import androidx.annotation.NonNull;
import com.rd.animation.type.DropAnimation;
import com.rd.animation.type.i;
import com.rd.draw.data.Orientation;

/* compiled from: AnimationController */
public class a {
    private float di;
    private b eHp;
    private com.rd.animation.a.b.a eHq;
    private com.rd.animation.type.a eHr;
    private com.rd.draw.data.a eHs;
    private boolean eHt;

    public a(@NonNull com.rd.draw.data.a aVar, @NonNull com.rd.animation.a.b.a aVar2) {
        this.eHp = new b(aVar2);
        this.eHq = aVar2;
        this.eHs = aVar;
    }

    public void al(float f) {
        this.eHt = true;
        this.di = f;
        bho();
    }

    public void bhn() {
        this.eHt = false;
        this.di = 0.0f;
        bho();
    }

    public void end() {
        com.rd.animation.type.a aVar = this.eHr;
        if (aVar != null) {
            aVar.end();
        }
    }

    private void bho() {
        switch (this.eHs.bhZ()) {
            case NONE:
                this.eHq.a(null);
                return;
            case COLOR:
                bhp();
                return;
            case SCALE:
                bhq();
                return;
            case WORM:
                bhr();
                return;
            case FILL:
                bht();
                return;
            case SLIDE:
                bhs();
                return;
            case THIN_WORM:
                bhu();
                return;
            case DROP:
                bhv();
                return;
            case SWAP:
                bhw();
                return;
            case SCALE_DOWN:
                bhx();
                return;
            default:
                return;
        }
    }

    private void bhp() {
        int selectedColor = this.eHs.getSelectedColor();
        int unselectedColor = this.eHs.getUnselectedColor();
        com.rd.animation.type.a cJ = this.eHp.bhy().aM(unselectedColor, selectedColor).cJ(this.eHs.getAnimationDuration());
        if (this.eHt) {
            cJ.am(this.di);
        } else {
            cJ.start();
        }
        this.eHr = cJ;
    }

    private void bhq() {
        int selectedColor = this.eHs.getSelectedColor();
        int unselectedColor = this.eHs.getUnselectedColor();
        int radius = this.eHs.getRadius();
        float scaleFactor = this.eHs.getScaleFactor();
        com.rd.animation.type.a cJ = this.eHp.bhz().a(unselectedColor, selectedColor, radius, scaleFactor).cJ(this.eHs.getAnimationDuration());
        if (this.eHt) {
            cJ.am(this.di);
        } else {
            cJ.start();
        }
        this.eHr = cJ;
    }

    private void bhr() {
        int bhV = this.eHs.bhS() ? this.eHs.bhV() : this.eHs.bhX();
        int bhW = this.eHs.bhS() ? this.eHs.bhW() : this.eHs.bhV();
        i cM = this.eHp.bhA().a(com.rd.b.a.a(this.eHs, bhV), com.rd.b.a.a(this.eHs, bhW), this.eHs.getRadius(), bhW > bhV).cJ(this.eHs.getAnimationDuration());
        if (this.eHt) {
            cM.am(this.di);
        } else {
            cM.start();
        }
        this.eHr = cM;
    }

    private void bhs() {
        com.rd.animation.type.a cJ = this.eHp.bhB().aO(com.rd.b.a.a(this.eHs, this.eHs.bhS() ? this.eHs.bhV() : this.eHs.bhX()), com.rd.b.a.a(this.eHs, this.eHs.bhS() ? this.eHs.bhW() : this.eHs.bhV())).cJ(this.eHs.getAnimationDuration());
        if (this.eHt) {
            cJ.am(this.di);
        } else {
            cJ.start();
        }
        this.eHr = cJ;
    }

    private void bht() {
        int selectedColor = this.eHs.getSelectedColor();
        int unselectedColor = this.eHs.getUnselectedColor();
        int radius = this.eHs.getRadius();
        int bhJ = this.eHs.bhJ();
        com.rd.animation.type.a cJ = this.eHp.bhC().j(unselectedColor, selectedColor, radius, bhJ).cJ(this.eHs.getAnimationDuration());
        if (this.eHt) {
            cJ.am(this.di);
        } else {
            cJ.start();
        }
        this.eHr = cJ;
    }

    private void bhu() {
        int bhV = this.eHs.bhS() ? this.eHs.bhV() : this.eHs.bhX();
        int bhW = this.eHs.bhS() ? this.eHs.bhW() : this.eHs.bhV();
        i cM = this.eHp.bhD().a(com.rd.b.a.a(this.eHs, bhV), com.rd.b.a.a(this.eHs, bhW), this.eHs.getRadius(), bhW > bhV).cJ(this.eHs.getAnimationDuration());
        if (this.eHt) {
            cM.am(this.di);
        } else {
            cM.start();
        }
        this.eHr = cM;
    }

    private void bhv() {
        int bhV = this.eHs.bhS() ? this.eHs.bhV() : this.eHs.bhX();
        int bhW = this.eHs.bhS() ? this.eHs.bhW() : this.eHs.bhV();
        int a = com.rd.b.a.a(this.eHs, bhV);
        int a2 = com.rd.b.a.a(this.eHs, bhW);
        bhV = this.eHs.getPaddingTop();
        bhW = this.eHs.getPaddingLeft();
        if (this.eHs.bhY() != Orientation.HORIZONTAL) {
            bhV = bhW;
        }
        int radius = this.eHs.getRadius();
        DropAnimation c = this.eHp.bhE().cJ(this.eHs.getAnimationDuration()).c(a, a2, (radius * 3) + bhV, radius + bhV, radius);
        if (this.eHt) {
            c.am(this.di);
        } else {
            c.start();
        }
        this.eHr = c;
    }

    private void bhw() {
        com.rd.animation.type.a cJ = this.eHp.bhF().aP(com.rd.b.a.a(this.eHs, this.eHs.bhS() ? this.eHs.bhV() : this.eHs.bhX()), com.rd.b.a.a(this.eHs, this.eHs.bhS() ? this.eHs.bhW() : this.eHs.bhV())).cJ(this.eHs.getAnimationDuration());
        if (this.eHt) {
            cJ.am(this.di);
        } else {
            cJ.start();
        }
        this.eHr = cJ;
    }

    private void bhx() {
        int selectedColor = this.eHs.getSelectedColor();
        int unselectedColor = this.eHs.getUnselectedColor();
        int radius = this.eHs.getRadius();
        float scaleFactor = this.eHs.getScaleFactor();
        com.rd.animation.type.a cJ = this.eHp.bhG().a(unselectedColor, selectedColor, radius, scaleFactor).cJ(this.eHs.getAnimationDuration());
        if (this.eHt) {
            cJ.am(this.di);
        } else {
            cJ.start();
        }
        this.eHr = cJ;
    }
}
