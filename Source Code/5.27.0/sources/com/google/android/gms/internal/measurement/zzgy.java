package com.google.android.gms.internal.measurement;

import java.util.List;
import java.util.Map;

interface zzgy {
    int getTag();

    double readDouble();

    float readFloat();

    String readString();

    void readStringList(List<String> list);

    <T> T zza(zzgx<T> zzgx, zzel zzel);

    <T> void zza(List<T> list, zzgx<T> zzgx, zzel zzel);

    <K, V> void zza(Map<K, V> map, zzfz<K, V> zzfz, zzel zzel);

    @Deprecated
    <T> T zzb(zzgx<T> zzgx, zzel zzel);

    @Deprecated
    <T> void zzb(List<T> list, zzgx<T> zzgx, zzel zzel);

    void zze(List<Double> list);

    void zzf(List<Float> list);

    void zzg(List<Long> list);

    void zzh(List<Long> list);

    void zzi(List<Integer> list);

    void zzj(List<Long> list);

    void zzk(List<Integer> list);

    void zzl(List<Boolean> list);

    void zzm(List<String> list);

    void zzn(List<zzdp> list);

    void zzo(List<Integer> list);

    void zzp(List<Integer> list);

    void zzq(List<Integer> list);

    void zzr(List<Long> list);

    void zzs(List<Integer> list);

    long zzsh();

    long zzsi();

    int zzsj();

    long zzsk();

    int zzsl();

    boolean zzsm();

    String zzsn();

    zzdp zzso();

    int zzsp();

    int zzsq();

    int zzsr();

    long zzss();

    int zzst();

    long zzsu();

    int zzsy();

    boolean zzsz();

    void zzt(List<Long> list);
}
