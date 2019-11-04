package com.iqoption.view.drawable;

import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;

/* compiled from: RemoteAnimationDrawable */
final class c extends AnimationDrawable {
    private final int ehf;
    private boolean ehh;

    public c(int i) {
        this.ehf = i;
        setOneShot(true);
    }

    /* renamed from: hM */
    public BitmapDrawable getFrame(int i) {
        return (BitmapDrawable) super.getFrame(i);
    }

    public void addFrame(@NonNull Drawable drawable, int i) {
        aYz();
        if (drawable instanceof BitmapDrawable) {
            super.addFrame(drawable, i);
            return;
        }
        throw new IllegalArgumentException("Only BitmapDrawable supported as frame");
    }

    /* Access modifiers changed, original: 0000 */
    public void recycle() {
        if (!this.ehh) {
            int i = 0;
            if (isRunning()) {
                stop();
                i = 1;
            }
            int numberOfFrames = getNumberOfFrames();
            for (i = 
/*
Method generation error in method: com.iqoption.view.drawable.c.recycle():void, dex: classes3.dex
jadx.core.utils.exceptions.CodegenException: Error generate insn: PHI: (r0_3 'i' int) = (r0_1 'i' int), (r0_2 'i' int) binds: {(r0_1 'i' int)=B:4:0x000b, (r0_2 'i' int)=B:5:0x000d} in method: com.iqoption.view.drawable.c.recycle():void, dex: classes3.dex
	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:228)
	at jadx.core.codegen.RegionGen.makeLoop(RegionGen.java:185)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:89)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:95)
	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:120)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:89)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:89)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:183)
	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:321)
	at jadx.core.codegen.ClassGen.addMethods(ClassGen.java:259)
	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:221)
	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:111)
	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:77)
	at jadx.core.codegen.CodeGen.visit(CodeGen.java:10)
	at jadx.core.ProcessClass.process(ProcessClass.java:38)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
Caused by: jadx.core.utils.exceptions.CodegenException: PHI can be used only in fallback mode
	at jadx.core.codegen.InsnGen.fallbackOnlyInsn(InsnGen.java:539)
	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:511)
	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:222)
	... 22 more

*/

    /* Access modifiers changed, original: 0000 */
    public boolean isRecycled() {
        return this.ehh;
    }

    /* Access modifiers changed, original: 0000 */
    public boolean isCompleted() {
        return this.ehf == getNumberOfFrames();
    }

    private void aYz() {
        if (this.ehh) {
            throw new IllegalStateException("Drawable is recycled");
        }
    }
}
