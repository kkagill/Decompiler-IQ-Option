package com.google.android.gms.tagmanager;

import android.content.Context;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.gtm.zzb;
import com.google.android.gms.internal.gtm.zzc.zzc;
import com.google.android.gms.internal.gtm.zzj;
import com.google.android.gms.internal.gtm.zzl;
import com.google.android.gms.internal.gtm.zzor;
import com.google.android.gms.internal.gtm.zzot;
import com.google.android.gms.internal.gtm.zzov;
import com.google.android.gms.internal.gtm.zzox;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

@VisibleForTesting
final class zzfb {
    private static final zzdz<zzl> zzajp = new zzdz(zzgj.zzkc(), true);
    private final DataLayer zzaed;
    private final zzov zzajq;
    private final zzbo zzajr;
    private final Map<String, zzbq> zzajs;
    private final Map<String, zzbq> zzajt;
    private final Map<String, zzbq> zzaju;
    private final zzp<zzot, zzdz<zzl>> zzajv;
    private final zzp<String, zzfh> zzajw;
    private final Set<zzox> zzajx;
    private final Map<String, zzfi> zzajy;
    private volatile String zzajz;
    private int zzaka;

    public zzfb(Context context, zzov zzov, DataLayer dataLayer, zzan zzan, zzan zzan2, zzbo zzbo) {
        if (zzov != null) {
            zzot zzot;
            this.zzajq = zzov;
            this.zzajx = new HashSet(zzov.zzls());
            this.zzaed = dataLayer;
            this.zzajr = zzbo;
            zzfc zzfc = new zzfc(this);
            zzq zzq = new zzq();
            this.zzajv = zzq.zza(1048576, zzfc);
            zzfd zzfd = new zzfd(this);
            zzq zzq2 = new zzq();
            this.zzajw = zzq.zza(1048576, zzfd);
            this.zzajs = new HashMap();
            zzb(new zzm(context));
            zzb(new zzam(zzan2));
            zzb(new zzaz(dataLayer));
            zzb(new zzgk(context, dataLayer));
            this.zzajt = new HashMap();
            zzc(new zzak());
            zzc(new zzbl());
            zzc(new zzbm());
            zzc(new zzbs());
            zzc(new zzbt());
            zzc(new zzde());
            zzc(new zzdf());
            zzc(new zzel());
            zzc(new zzfy());
            this.zzaju = new HashMap();
            zza(new zze(context));
            zza(new zzf(context));
            zza(new zzh(context));
            zza(new zzi(context));
            zza(new zzj(context));
            zza(new zzk(context));
            zza(new zzl(context));
            zza(new zzt());
            zza(new zzaj(this.zzajq.getVersion()));
            zza(new zzam(zzan));
            zza(new zzas(dataLayer));
            zza(new zzbc(context));
            zza(new zzbd());
            zza(new zzbk());
            zza(new zzbp(this));
            zza(new zzbu());
            zza(new zzbv());
            zza(new zzcv(context));
            zza(new zzcx());
            zza(new zzdd());
            zza(new zzdk());
            zza(new zzdm(context));
            zza(new zzea());
            zza(new zzee());
            zza(new zzei());
            zza(new zzek());
            zza(new zzem(context));
            zza(new zzfj());
            zza(new zzfk());
            zza(new zzge());
            zza(new zzgl());
            this.zzajy = new HashMap();
            for (zzox zzox : this.zzajx) {
                String str;
                int i = 0;
                while (true) {
                    str = "Unknown";
                    if (i >= zzox.zzmq().size()) {
                        break;
                    }
                    zzot zzot2 = (zzot) zzox.zzmq().get(i);
                    zzfi zzb = zzb(this.zzajy, zza(zzot2));
                    zzb.zza(zzox);
                    zzb.zza(zzox, zzot2);
                    zzb.zza(zzox, str);
                    i++;
                }
                for (int i2 = 0; i2 < zzox.zzmr().size(); i2++) {
                    zzot = (zzot) zzox.zzmr().get(i2);
                    zzfi zzb2 = zzb(this.zzajy, zza(zzot));
                    zzb2.zza(zzox);
                    zzb2.zzb(zzox, zzot);
                    zzb2.zzb(zzox, str);
                }
            }
            for (Entry entry : this.zzajq.zzmo().entrySet()) {
                for (zzot zzot3 : (List) entry.getValue()) {
                    if (!zzgj.zzg((zzl) zzot3.zzlu().get(zzb.NOT_DEFAULT_MACRO.toString())).booleanValue()) {
                        zzb(this.zzajy, (String) entry.getKey()).zzb(zzot3);
                    }
                }
            }
            return;
        }
        throw new NullPointerException("resource cannot be null");
    }

    public final synchronized void zze(List<zzj> list) {
        synchronized (this) {
            for (zzj zzj : list) {
                if (zzj.name != null) {
                    if (zzj.name.startsWith("gaExperiment:")) {
                        DataLayer dataLayer = this.zzaed;
                        if (zzj.zzqi == null) {
                            zzdi.zzac("supplemental missing experimentSupplemental");
                        } else {
                            Object zzh;
                            for (zzl zzc : zzj.zzqi.zzpf) {
                                dataLayer.zzaq(zzgj.zzc(zzc));
                            }
                            zzl[] zzlArr = zzj.zzqi.zzpe;
                            int length = zzlArr.length;
                            int i = 0;
                            while (true) {
                                Map map = null;
                                if (i >= length) {
                                    break;
                                }
                                zzh = zzgj.zzh(zzlArr[i]);
                                if (zzh instanceof Map) {
                                    map = (Map) zzh;
                                } else {
                                    String valueOf = String.valueOf(zzh);
                                    StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 36);
                                    stringBuilder.append("value: ");
                                    stringBuilder.append(valueOf);
                                    stringBuilder.append(" is not a map value, ignored.");
                                    zzdi.zzac(stringBuilder.toString());
                                }
                                if (map != null) {
                                    dataLayer.push(map);
                                }
                                i++;
                            }
                            for (zzc zzc2 : zzj.zzqi.zzpg) {
                                if (zzc2.hasKey()) {
                                    zzh = dataLayer.get(zzc2.getKey());
                                    Long valueOf2;
                                    if (zzh instanceof Number) {
                                        valueOf2 = Long.valueOf(((Number) zzh).longValue());
                                    } else {
                                        valueOf2 = null;
                                    }
                                    long zzg = zzc2.zzg();
                                    long zzh2 = zzc2.zzh();
                                    if (!zzc2.zzi() || valueOf2 == null || valueOf2.longValue() < zzg || valueOf2.longValue() > zzh2) {
                                        if (zzg <= zzh2) {
                                            double random = Math.random();
                                            double d = (double) (zzh2 - zzg);
                                            Double.isNaN(d);
                                            random *= d;
                                            double d2 = (double) zzg;
                                            Double.isNaN(d2);
                                            zzh = Long.valueOf(Math.round(random + d2));
                                        } else {
                                            zzdi.zzac("GaExperimentRandom: random range invalid");
                                        }
                                    }
                                    dataLayer.zzaq(zzc2.getKey());
                                    Map zzg2 = DataLayer.zzg(zzc2.getKey(), zzh);
                                    if (zzc2.zzj() > 0) {
                                        if (zzg2.containsKey("gtm")) {
                                            Object obj = zzg2.get("gtm");
                                            if (obj instanceof Map) {
                                                ((Map) obj).put("lifetime", Long.valueOf(zzc2.zzj()));
                                            } else {
                                                zzdi.zzac("GaExperimentRandom: gtm not a map");
                                            }
                                        } else {
                                            zzg2.put("gtm", DataLayer.mapOf("lifetime", Long.valueOf(zzc2.zzj())));
                                        }
                                    }
                                    dataLayer.push(zzg2);
                                } else {
                                    zzdi.zzac("GaExperimentRandom: No key");
                                }
                            }
                            continue;
                        }
                    }
                }
                String valueOf3 = String.valueOf(zzj);
                StringBuilder stringBuilder2 = new StringBuilder(String.valueOf(valueOf3).length() + 22);
                stringBuilder2.append("Ignored supplemental: ");
                stringBuilder2.append(valueOf3);
                zzdi.zzab(stringBuilder2.toString());
            }
        }
    }

    public final synchronized void zzan(String str) {
        zzbk(str);
        zzar zzid = this.zzajr.zzba(str).zzid();
        for (zzot zza : (Set) zza(this.zzajx, new HashSet(), new zzff(this), zzid.zzhs()).getObject()) {
            zza(this.zzajs, zza, new HashSet(), zzid.zzhr());
        }
        zzbk(null);
    }

    public final zzdz<zzl> zzbj(String str) {
        this.zzaka = 0;
        return zza(str, new HashSet(), this.zzajr.zzaz(str).zzic());
    }

    @VisibleForTesting
    private final synchronized void zzbk(String str) {
        this.zzajz = str;
    }

    /* Access modifiers changed, original: final|declared_synchronized */
    public final synchronized String zzjf() {
        return this.zzajz;
    }

    private static zzfi zzb(Map<String, zzfi> map, String str) {
        zzfi zzfi = (zzfi) map.get(str);
        if (zzfi != null) {
            return zzfi;
        }
        zzfi = new zzfi();
        map.put(str, zzfi);
        return zzfi;
    }

    private final zzdz<Set<zzot>> zza(Set<zzox> set, Set<String> set2, zzfg zzfg, zzfa zzfa) {
        Set set3 = set2;
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        Boolean valueOf = Boolean.valueOf(true);
        while (true) {
            boolean z = true;
            for (zzox zzox : set) {
                zzdz zzdz;
                zzeq zzis = zzfa.zzis();
                while (true) {
                    zzdz zza;
                    boolean z2 = true;
                    for (zzot zza2 : zzox.zzlx()) {
                        zza = zza(zza2, set3, zzis.zzim());
                        if (((Boolean) zza.getObject()).booleanValue()) {
                            zzgj.zzi(Boolean.valueOf(false));
                            zzdz = new zzdz(Boolean.valueOf(false), zza.zziu());
                            break;
                        } else if (!z2 || !zza.zziu()) {
                            z2 = false;
                        }
                    }
                    for (zzot zza22 : zzox.zzlw()) {
                        zza = zza(zza22, set3, zzis.zzin());
                        if (!((Boolean) zza.getObject()).booleanValue()) {
                            zzgj.zzi(Boolean.valueOf(false));
                            zzdz = new zzdz(Boolean.valueOf(false), zza.zziu());
                            break;
                        }
                        z2 = z2 && zza.zziu();
                    }
                    zzgj.zzi(valueOf);
                    zzdz = new zzdz(valueOf, z2);
                }
                if (((Boolean) zzdz.getObject()).booleanValue()) {
                    zzfg.zza(zzox, hashSet, hashSet2, zzis);
                } else {
                    zzfg zzfg2 = zzfg;
                }
                if (!z || !zzdz.zziu()) {
                    z = false;
                }
            }
            hashSet.removeAll(hashSet2);
            zzfa.zzb(hashSet);
            return new zzdz(hashSet, z);
        }
    }

    private static String zza(zzot zzot) {
        return zzgj.zzc((zzl) zzot.zzlu().get(zzb.INSTANCE_NAME.toString()));
    }

    private static void zza(Map<String, zzbq> map, zzbq zzbq) {
        if (map.containsKey(zzbq.zzif())) {
            String str = "Duplicate function type name: ";
            String valueOf = String.valueOf(zzbq.zzif());
            throw new IllegalArgumentException(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
        }
        map.put(zzbq.zzif(), zzbq);
    }

    @VisibleForTesting
    private final void zza(zzbq zzbq) {
        zza(this.zzaju, zzbq);
    }

    @VisibleForTesting
    private final void zzb(zzbq zzbq) {
        zza(this.zzajs, zzbq);
    }

    @VisibleForTesting
    private final void zzc(zzbq zzbq) {
        zza(this.zzajt, zzbq);
    }

    @VisibleForTesting
    private final zzdz<Boolean> zza(zzot zzot, Set<String> set, zzen zzen) {
        zzdz zza = zza(this.zzajt, zzot, (Set) set, zzen);
        Boolean zzg = zzgj.zzg((zzl) zza.getObject());
        zzen.zza(zzgj.zzi(zzg));
        return new zzdz(zzg, zza.zziu());
    }

    private final String zzjg() {
        if (this.zzaka <= 1) {
            return "";
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(Integer.toString(this.zzaka));
        for (int i = 2; i < this.zzaka; i++) {
            stringBuilder.append(' ');
        }
        stringBuilder.append(": ");
        return stringBuilder.toString();
    }

    private final zzdz<zzl> zza(String str, Set<String> set, zzdl zzdl) {
        this.zzaka++;
        zzfh zzfh = (zzfh) this.zzajw.get(str);
        if (zzfh != null) {
            this.zzajr.zzie();
            zza(zzfh.zzji(), (Set) set);
            this.zzaka--;
            return zzfh.zzjh();
        }
        zzfi zzfi = (zzfi) this.zzajy.get(str);
        if (zzfi == null) {
            String zzjg = zzjg();
            StringBuilder stringBuilder = new StringBuilder((String.valueOf(zzjg).length() + 15) + String.valueOf(str).length());
            stringBuilder.append(zzjg);
            stringBuilder.append("Invalid macro: ");
            stringBuilder.append(str);
            zzdi.zzav(stringBuilder.toString());
            this.zzaka--;
            return zzajp;
        }
        zzot zzjo;
        zzdz zza = zza(zzfi.zzjj(), (Set) set, new zzfe(this, zzfi.zzjk(), zzfi.zzjl(), zzfi.zzjn(), zzfi.zzjm()), zzdl.zzhs());
        if (((Set) zza.getObject()).isEmpty()) {
            zzjo = zzfi.zzjo();
        } else {
            if (((Set) zza.getObject()).size() > 1) {
                String zzjg2 = zzjg();
                StringBuilder stringBuilder2 = new StringBuilder((String.valueOf(zzjg2).length() + 37) + String.valueOf(str).length());
                stringBuilder2.append(zzjg2);
                stringBuilder2.append("Multiple macros active for macroName ");
                stringBuilder2.append(str);
                zzdi.zzac(stringBuilder2.toString());
            }
            zzjo = (zzot) ((Set) zza.getObject()).iterator().next();
        }
        if (zzjo == null) {
            this.zzaka--;
            return zzajp;
        }
        zzdz zza2 = zza(this.zzaju, zzjo, (Set) set, zzdl.zzil());
        boolean z = zza.zziu() && zza2.zziu();
        zzdz zzdz = zzajp;
        if (zza2 != zzdz) {
            zzdz = new zzdz((zzl) zza2.getObject(), z);
        }
        zzl zzji = zzjo.zzji();
        if (zzdz.zziu()) {
            this.zzajw.zza(str, new zzfh(zzdz, zzji));
        }
        zza(zzji, (Set) set);
        this.zzaka--;
        return zzdz;
    }

    private final void zza(zzl zzl, Set<String> set) {
        if (zzl != null) {
            zzdz zza = zza(zzl, (Set) set, new zzdx());
            if (zza != zzajp) {
                Object zzh = zzgj.zzh((zzl) zza.getObject());
                if (zzh instanceof Map) {
                    this.zzaed.push((Map) zzh);
                } else if (zzh instanceof List) {
                    for (Object next : (List) zzh) {
                        if (next instanceof Map) {
                            this.zzaed.push((Map) next);
                        } else {
                            zzdi.zzac("pushAfterEvaluate: value not a Map");
                        }
                    }
                } else {
                    zzdi.zzac("pushAfterEvaluate: value not a Map or List");
                }
            }
        }
    }

    private final zzdz<zzl> zza(zzl zzl, Set<String> set, zzgm zzgm) {
        if (!zzl.zzqw) {
            return new zzdz(zzl, true);
        }
        int i = zzl.type;
        zzl zzk;
        int i2;
        zzdz zza;
        zzdz zzdz;
        String str;
        String valueOf;
        if (i == 2) {
            zzk = zzor.zzk(zzl);
            zzk.zzqn = new zzl[zzl.zzqn.length];
            for (i2 = 0; i2 < zzl.zzqn.length; i2++) {
                zza = zza(zzl.zzqn[i2], (Set) set, zzgm.zzv(i2));
                zzdz = zzajp;
                if (zza == zzdz) {
                    return zzdz;
                }
                zzk.zzqn[i2] = (zzl) zza.getObject();
            }
            return new zzdz(zzk, false);
        } else if (i == 3) {
            zzk = zzor.zzk(zzl);
            if (zzl.zzqo.length != zzl.zzqp.length) {
                str = "Invalid serving value: ";
                valueOf = String.valueOf(zzl.toString());
                zzdi.zzav(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
                return zzajp;
            }
            zzk.zzqo = new zzl[zzl.zzqo.length];
            zzk.zzqp = new zzl[zzl.zzqo.length];
            for (i2 = 0; i2 < zzl.zzqo.length; i2++) {
                zza = zza(zzl.zzqo[i2], (Set) set, zzgm.zzw(i2));
                zzdz = zza(zzl.zzqp[i2], (Set) set, zzgm.zzx(i2));
                zzdz zzdz2 = zzajp;
                if (zza == zzdz2 || zzdz == zzdz2) {
                    return zzajp;
                }
                zzk.zzqo[i2] = (zzl) zza.getObject();
                zzk.zzqp[i2] = (zzl) zzdz.getObject();
            }
            return new zzdz(zzk, false);
        } else if (i != 4) {
            if (i != 7) {
                int i3 = zzl.type;
                StringBuilder stringBuilder = new StringBuilder(25);
                stringBuilder.append("Unknown type: ");
                stringBuilder.append(i3);
                zzdi.zzav(stringBuilder.toString());
                return zzajp;
            }
            zzk = zzor.zzk(zzl);
            zzk.zzqu = new zzl[zzl.zzqu.length];
            for (i2 = 0; i2 < zzl.zzqu.length; i2++) {
                zza = zza(zzl.zzqu[i2], (Set) set, zzgm.zzy(i2));
                zzdz = zzajp;
                if (zza == zzdz) {
                    return zzdz;
                }
                zzk.zzqu[i2] = (zzl) zza.getObject();
            }
            return new zzdz(zzk, false);
        } else if (set.contains(zzl.zzqq)) {
            valueOf = zzl.zzqq;
            str = set.toString();
            StringBuilder stringBuilder2 = new StringBuilder((String.valueOf(valueOf).length() + 79) + String.valueOf(str).length());
            stringBuilder2.append("Macro cycle detected.  Current macro reference: ");
            stringBuilder2.append(valueOf);
            stringBuilder2.append(".  Previous macro references: ");
            stringBuilder2.append(str);
            stringBuilder2.append(".");
            zzdi.zzav(stringBuilder2.toString());
            return zzajp;
        } else {
            set.add(zzl.zzqq);
            zzdz zza2 = zzgn.zza(zza(zzl.zzqq, (Set) set, zzgm.zzit()), zzl.zzqv);
            set.remove(zzl.zzqq);
            return zza2;
        }
    }

    private final zzdz<zzl> zza(Map<String, zzbq> map, zzot zzot, Set<String> set, zzen zzen) {
        zzl zzl = (zzl) zzot.zzlu().get(zzb.FUNCTION.toString());
        if (zzl == null) {
            zzdi.zzav("No function id in properties");
            return zzajp;
        }
        String str = zzl.zzqr;
        zzbq zzbq = (zzbq) map.get(str);
        if (zzbq == null) {
            zzdi.zzav(String.valueOf(str).concat(" has no backing implementation."));
            return zzajp;
        }
        zzdz zzdz = (zzdz) this.zzajv.get(zzot);
        if (zzdz != null) {
            this.zzajr.zzie();
            return zzdz;
        }
        HashMap hashMap = new HashMap();
        boolean z = true;
        Object obj = 1;
        for (Entry entry : zzot.zzlu().entrySet()) {
            zzdz zza = zza((zzl) entry.getValue(), (Set) set, zzen.zzbg((String) entry.getKey()).zzb((zzl) entry.getValue()));
            zzdz zzdz2 = zzajp;
            if (zza == zzdz2) {
                return zzdz2;
            }
            if (zza.zziu()) {
                zzot.zza((String) entry.getKey(), (zzl) zza.getObject());
            } else {
                obj = null;
            }
            hashMap.put((String) entry.getKey(), (zzl) zza.getObject());
        }
        if (zzbq.zza(hashMap.keySet())) {
            if (obj == null || !zzbq.zzgw()) {
                z = false;
            }
            zzdz zzdz3 = new zzdz(zzbq.zzb(hashMap), z);
            if (z) {
                this.zzajv.zza(zzot, zzdz3);
            }
            zzen.zza((zzl) zzdz3.getObject());
            return zzdz3;
        }
        String valueOf = String.valueOf(zzbq.zzig());
        String valueOf2 = String.valueOf(hashMap.keySet());
        StringBuilder stringBuilder = new StringBuilder(((String.valueOf(str).length() + 43) + String.valueOf(valueOf).length()) + String.valueOf(valueOf2).length());
        stringBuilder.append("Incorrect keys for function ");
        stringBuilder.append(str);
        stringBuilder.append(" required ");
        stringBuilder.append(valueOf);
        stringBuilder.append(" had ");
        stringBuilder.append(valueOf2);
        zzdi.zzav(stringBuilder.toString());
        return zzajp;
    }
}
