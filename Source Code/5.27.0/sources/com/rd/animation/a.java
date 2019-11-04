package com.rd.animation;

import androidx.annotation.NonNull;

/* compiled from: AnimationManager */
public class a {
    private com.rd.animation.a.a eHo;

    public a(@NonNull com.rd.draw.data.a aVar, @NonNull com.rd.animation.a.b.a aVar2) {
        this.eHo = new com.rd.animation.a.a(aVar, aVar2);
    }

    public void bhn() {
        com.rd.animation.a.a aVar = this.eHo;
        if (aVar != null) {
            aVar.end();
            this.eHo.bhn();
        }
    }

    public void al(float f) {
        com.rd.animation.a.a aVar = this.eHo;
        if (aVar != null) {
            aVar.al(f);
        }
    }

    public void end() {
        com.rd.animation.a.a aVar = this.eHo;
        if (aVar != null) {
            aVar.end();
        }
    }
}
