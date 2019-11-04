package com.iqoption.deposit.card;

import android.content.Intent;
import android.nfc.Tag;
import android.nfc.tech.IsoDep;
import android.nfc.tech.NfcA;
import android.nfc.tech.NfcB;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import io.reactivex.b.f;
import io.reactivex.p;
import java.util.concurrent.Callable;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0016B\u0005¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0002J\u001a\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u000b0\n2\u0006\u0010\f\u001a\u00020\rJ$\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0012\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u000b0\u0013H\u0002J\u000e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\f\u001a\u00020\r¨\u0006\u0017"}, bng = {"Lcom/iqoption/deposit/card/NfcCardScanner;", "", "()V", "parseCard", "Lcom/iqoption/deposit/card/NfcCardScanner$NfcCard;", "isoDep", "Landroid/nfc/tech/IsoDep;", "failCounter", "", "scanCardByNfc", "Landroidx/lifecycle/LiveData;", "Lcom/iqoption/core/ui/Resource;", "intent", "Landroid/content/Intent;", "tryScan", "", "nfcTag", "Landroid/nfc/Tag;", "data", "Landroidx/lifecycle/MutableLiveData;", "validNfcIntent", "", "NfcCard", "deposit_release"})
/* compiled from: NfcCardScanner.kt */
public final class e {

    @i(bne = {1, 1, 15}, bnf = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J7\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0018"}, bng = {"Lcom/iqoption/deposit/card/NfcCardScanner$NfcCard;", "", "cardNumber", "", "expireMonth", "expireYear", "cardHolderName", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCardHolderName", "()Ljava/lang/String;", "getCardNumber", "getExpireMonth", "getExpireYear", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "deposit_release"})
    /* compiled from: NfcCardScanner.kt */
    public static final class a {
        private final String cardNumber;
        private final String cxF;
        private final String cxG;
        private final String cxH;

        /* JADX WARNING: Missing block: B:10:0x002e, code skipped:
            if (kotlin.jvm.internal.i.y(r2.cxH, r3.cxH) != false) goto L_0x0033;
     */
        public boolean equals(java.lang.Object r3) {
            /*
            r2 = this;
            if (r2 == r3) goto L_0x0033;
        L_0x0002:
            r0 = r3 instanceof com.iqoption.deposit.card.e.a;
            if (r0 == 0) goto L_0x0031;
        L_0x0006:
            r3 = (com.iqoption.deposit.card.e.a) r3;
            r0 = r2.cardNumber;
            r1 = r3.cardNumber;
            r0 = kotlin.jvm.internal.i.y(r0, r1);
            if (r0 == 0) goto L_0x0031;
        L_0x0012:
            r0 = r2.cxF;
            r1 = r3.cxF;
            r0 = kotlin.jvm.internal.i.y(r0, r1);
            if (r0 == 0) goto L_0x0031;
        L_0x001c:
            r0 = r2.cxG;
            r1 = r3.cxG;
            r0 = kotlin.jvm.internal.i.y(r0, r1);
            if (r0 == 0) goto L_0x0031;
        L_0x0026:
            r0 = r2.cxH;
            r3 = r3.cxH;
            r3 = kotlin.jvm.internal.i.y(r0, r3);
            if (r3 == 0) goto L_0x0031;
        L_0x0030:
            goto L_0x0033;
        L_0x0031:
            r3 = 0;
            return r3;
        L_0x0033:
            r3 = 1;
            return r3;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.iqoption.deposit.card.e$a.equals(java.lang.Object):boolean");
        }

        public int hashCode() {
            String str = this.cardNumber;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.cxF;
            hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            str2 = this.cxG;
            hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            str2 = this.cxH;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("NfcCard(cardNumber=");
            stringBuilder.append(this.cardNumber);
            stringBuilder.append(", expireMonth=");
            stringBuilder.append(this.cxF);
            stringBuilder.append(", expireYear=");
            stringBuilder.append(this.cxG);
            stringBuilder.append(", cardHolderName=");
            stringBuilder.append(this.cxH);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public a(String str, String str2, String str3, String str4) {
            kotlin.jvm.internal.i.f(str, "cardNumber");
            this.cardNumber = str;
            this.cxF = str2;
            this.cxG = str3;
            this.cxH = str4;
        }

        public final String aps() {
            return this.cxF;
        }

        public final String apt() {
            return this.cxG;
        }

        public final String apu() {
            return this.cxH;
        }

        public final String getCardNumber() {
            return this.cardNumber;
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, bng = {"<anonymous>", "Lcom/iqoption/deposit/card/NfcCardScanner$NfcCard;", "call"})
    /* compiled from: NfcCardScanner.kt */
    static final class c<V> implements Callable<T> {
        final /* synthetic */ e cxJ;
        final /* synthetic */ IsoDep cxK;

        c(e eVar, IsoDep isoDep) {
            this.cxJ = eVar;
            this.cxK = isoDep;
        }

        /* renamed from: apv */
        public final a call() {
            return e.a(this.cxJ, this.cxK, 0, 2, null);
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\n\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0004"}, bng = {"<anonymous>", "", "kotlin.jvm.PlatformType", "pCommand", "transceive"})
    /* compiled from: NfcCardScanner.kt */
    static final class b implements com.pro100svitlo.creditCardNfcReader.parser.b {
        final /* synthetic */ IsoDep cxI;

        b(IsoDep isoDep) {
            this.cxI = isoDep;
        }

        public final byte[] transceive(byte[] bArr) {
            return this.cxI.transceive(bArr);
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "result", "Lcom/iqoption/deposit/card/NfcCardScanner$NfcCard;", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: NfcCardScanner.kt */
    static final class d<T> implements f<a> {
        final /* synthetic */ MutableLiveData cxL;

        d(MutableLiveData mutableLiveData) {
            this.cxL = mutableLiveData;
        }

        /* renamed from: c */
        public final void accept(a aVar) {
            this.cxL.setValue(com.iqoption.core.ui.d.bHb.bS(aVar));
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "error", "", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: NfcCardScanner.kt */
    static final class e<T> implements f<Throwable> {
        final /* synthetic */ MutableLiveData cxL;

        e(MutableLiveData mutableLiveData) {
            this.cxL = mutableLiveData;
        }

        /* renamed from: o */
        public final void accept(Throwable th) {
            this.cxL.setValue(com.iqoption.core.ui.d.a.a(com.iqoption.core.ui.d.bHb, th, th != null ? th.getMessage() : null, null, 4, null));
        }
    }

    public final boolean p(Intent intent) {
        kotlin.jvm.internal.i.f(intent, "intent");
        Tag tag = (Tag) intent.getParcelableExtra("android.nfc.extra.TAG");
        if (tag == null) {
            return false;
        }
        String[] techList = tag.getTechList();
        kotlin.jvm.internal.i.e(techList, "techs");
        boolean contains = i.contains((Object[]) techList, (Object) IsoDep.class.getName());
        boolean contains2 = i.contains((Object[]) techList, (Object) NfcA.class.getName());
        boolean contains3 = i.contains((Object[]) techList, (Object) NfcB.class.getName());
        if (!contains) {
            return false;
        }
        if (contains2 || contains3) {
            return true;
        }
        return false;
    }

    public final LiveData<com.iqoption.core.ui.d<a>> q(Intent intent) {
        kotlin.jvm.internal.i.f(intent, "intent");
        MutableLiveData mutableLiveData = new MutableLiveData();
        Tag tag = (Tag) intent.getParcelableExtra("android.nfc.extra.TAG");
        if (tag == null) {
            mutableLiveData.setValue(com.iqoption.core.ui.d.a.a(com.iqoption.core.ui.d.bHb, null, null, null, 7, null));
        } else {
            a(tag, mutableLiveData);
        }
        return mutableLiveData;
    }

    private final void a(Tag tag, MutableLiveData<com.iqoption.core.ui.d<a>> mutableLiveData) {
        IsoDep isoDep = IsoDep.get(tag);
        if (isoDep == null) {
            mutableLiveData.setValue(com.iqoption.core.ui.d.a.a(com.iqoption.core.ui.d.bHb, null, null, null, 7, null));
            return;
        }
        mutableLiveData.setValue(com.iqoption.core.ui.d.a.b(com.iqoption.core.ui.d.bHb, null, 1, null));
        p.j(new c(this, isoDep)).h(com.iqoption.core.rx.i.aki()).g(com.iqoption.core.rx.i.akj()).a((f) new d(mutableLiveData), (f) new e(mutableLiveData));
    }

    static /* synthetic */ a a(e eVar, IsoDep isoDep, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return eVar.a(isoDep, i);
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing block: B:41:0x00ed, code skipped:
            r0 = th;
     */
    /* JADX WARNING: Missing block: B:42:0x00ee, code skipped:
            r1 = r18;
     */
    /* JADX WARNING: Missing block: B:43:0x00f0, code skipped:
            r3 = r0;
     */
    /* JADX WARNING: Missing block: B:45:?, code skipped:
            throw r3;
     */
    /* JADX WARNING: Missing block: B:46:0x00f2, code skipped:
            r0 = th;
     */
    private final com.iqoption.deposit.card.e.a a(android.nfc.tech.IsoDep r19, int r20) {
        /*
        r18 = this;
        r1 = r20;
        r2 = r19;
        r2 = (java.io.Closeable) r2;
        r0 = 0;
        r3 = r0;
        r3 = (java.lang.Throwable) r3;
        r4 = r2;
        r4 = (android.nfc.tech.IsoDep) r4;	 Catch:{ Throwable -> 0x00ed, all -> 0x00e9 }
        r5 = 1;
        r4.connect();	 Catch:{ all -> 0x00e9 }
        r6 = r4.getTimeout();	 Catch:{ all -> 0x00e9 }
        r7 = 2000; // 0x7d0 float:2.803E-42 double:9.88E-321;
        r6 = java.lang.Math.max(r6, r7);	 Catch:{ all -> 0x00e9 }
        r4.setTimeout(r6);	 Catch:{ all -> 0x00e9 }
        r6 = new com.pro100svitlo.creditCardNfcReader.parser.a;	 Catch:{ all -> 0x00e9 }
        r7 = new com.iqoption.deposit.card.e$b;	 Catch:{ all -> 0x00e9 }
        r7.<init>(r4);	 Catch:{ all -> 0x00e9 }
        r7 = (com.pro100svitlo.creditCardNfcReader.parser.b) r7;	 Catch:{ all -> 0x00e9 }
        r6.<init>(r7, r5);	 Catch:{ all -> 0x00e9 }
        r6 = r6.bgJ();	 Catch:{ all -> 0x00e9 }
        r7 = "card";
        kotlin.jvm.internal.i.e(r6, r7);	 Catch:{ all -> 0x00e9 }
        r7 = r6.getCardNumber();	 Catch:{ all -> 0x00e9 }
        r8 = r7;
        r8 = (java.lang.CharSequence) r8;	 Catch:{ all -> 0x00e9 }
        r8 = android.text.TextUtils.isEmpty(r8);	 Catch:{ all -> 0x00e9 }
        if (r8 != 0) goto L_0x00c5;
    L_0x0040:
        r8 = r0;
        r8 = (java.lang.String) r8;	 Catch:{ all -> 0x00e9 }
        r9 = r0;
        r9 = (java.lang.String) r9;	 Catch:{ all -> 0x00e9 }
        r10 = r6.aba();	 Catch:{ all -> 0x00e9 }
        r10 = (java.lang.CharSequence) r10;	 Catch:{ all -> 0x00e9 }
        r10 = android.text.TextUtils.isEmpty(r10);	 Catch:{ all -> 0x00e9 }
        if (r10 != 0) goto L_0x0081;
    L_0x0052:
        r10 = r6.aba();	 Catch:{ all -> 0x00e9 }
        r11 = "card.expireDate";
        kotlin.jvm.internal.i.e(r10, r11);	 Catch:{ all -> 0x00e9 }
        r12 = r10;
        r12 = (java.lang.CharSequence) r12;	 Catch:{ all -> 0x00e9 }
        r13 = new char[r5];	 Catch:{ all -> 0x00e9 }
        r10 = 47;
        r11 = 0;
        r13[r11] = r10;	 Catch:{ all -> 0x00e9 }
        r14 = 0;
        r15 = 0;
        r16 = 6;
        r17 = 0;
        r10 = kotlin.text.v.b(r12, r13, r14, r15, r16, r17);	 Catch:{ all -> 0x00e9 }
        r12 = r10.size();	 Catch:{ all -> 0x00e9 }
        if (r12 <= r5) goto L_0x0081;
    L_0x0075:
        r8 = r10.get(r11);	 Catch:{ all -> 0x00e9 }
        r8 = (java.lang.String) r8;	 Catch:{ all -> 0x00e9 }
        r9 = r10.get(r5);	 Catch:{ all -> 0x00e9 }
        r9 = (java.lang.String) r9;	 Catch:{ all -> 0x00e9 }
    L_0x0081:
        r0 = (java.lang.String) r0;	 Catch:{ all -> 0x00e9 }
        r10 = r6.bgG();	 Catch:{ all -> 0x00e9 }
        r10 = (java.lang.CharSequence) r10;	 Catch:{ all -> 0x00e9 }
        r10 = android.text.TextUtils.isEmpty(r10);	 Catch:{ all -> 0x00e9 }
        if (r10 != 0) goto L_0x00b7;
    L_0x008f:
        r10 = r6.bgF();	 Catch:{ all -> 0x00e9 }
        r10 = (java.lang.CharSequence) r10;	 Catch:{ all -> 0x00e9 }
        r10 = android.text.TextUtils.isEmpty(r10);	 Catch:{ all -> 0x00e9 }
        if (r10 != 0) goto L_0x00b7;
    L_0x009b:
        r0 = new java.lang.StringBuilder;	 Catch:{ all -> 0x00e9 }
        r0.<init>();	 Catch:{ all -> 0x00e9 }
        r10 = r6.bgG();	 Catch:{ all -> 0x00e9 }
        r0.append(r10);	 Catch:{ all -> 0x00e9 }
        r10 = " ";
        r0.append(r10);	 Catch:{ all -> 0x00e9 }
        r6 = r6.bgF();	 Catch:{ all -> 0x00e9 }
        r0.append(r6);	 Catch:{ all -> 0x00e9 }
        r0 = r0.toString();	 Catch:{ all -> 0x00e9 }
    L_0x00b7:
        r6 = new com.iqoption.deposit.card.e$a;	 Catch:{ all -> 0x00e9 }
        r10 = "cardNumber";
        kotlin.jvm.internal.i.e(r7, r10);	 Catch:{ all -> 0x00e9 }
        r6.<init>(r7, r8, r9, r0);	 Catch:{ all -> 0x00e9 }
        kotlin.d.b.a(r2, r3);	 Catch:{ Throwable -> 0x00cf }
        return r6;
    L_0x00c5:
        r0 = new java.io.IOException;	 Catch:{ all -> 0x00e9 }
        r6 = "Can't read card";
        r0.<init>(r6);	 Catch:{ all -> 0x00e9 }
        r0 = (java.lang.Throwable) r0;	 Catch:{ all -> 0x00e9 }
        throw r0;	 Catch:{ all -> 0x00e9 }
    L_0x00cf:
        r0 = move-exception;
        r6 = 3;
        if (r1 >= r6) goto L_0x00e4;
    L_0x00d3:
        r6 = 2000; // 0x7d0 float:2.803E-42 double:9.88E-321;
        java.lang.Thread.sleep(r6);	 Catch:{ Throwable -> 0x00ed, all -> 0x00e9 }
        r0 = r1 + 1;
        r1 = r18;
        r0 = r1.a(r4, r0);	 Catch:{ Throwable -> 0x00e7 }
        kotlin.d.b.a(r2, r3);
        return r0;
    L_0x00e4:
        r1 = r18;
        throw r0;	 Catch:{ Throwable -> 0x00e7 }
    L_0x00e7:
        r0 = move-exception;
        goto L_0x00f0;
    L_0x00e9:
        r0 = move-exception;
        r1 = r18;
        goto L_0x00f3;
    L_0x00ed:
        r0 = move-exception;
        r1 = r18;
    L_0x00f0:
        r3 = r0;
        throw r3;	 Catch:{ all -> 0x00f2 }
    L_0x00f2:
        r0 = move-exception;
    L_0x00f3:
        kotlin.d.b.a(r2, r3);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iqoption.deposit.card.e.a(android.nfc.tech.IsoDep, int):com.iqoption.deposit.card.e$a");
    }
}
