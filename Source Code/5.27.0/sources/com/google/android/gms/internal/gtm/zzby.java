package com.google.android.gms.internal.gtm;

import com.google.android.gms.auth.api.credentials.CredentialsApi;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.util.VisibleForTesting;
import com.iqoption.dto.ChartTimeInterval;

@ShowFirstParty
@VisibleForTesting
public final class zzby {
    public static zzbz<String> zzaaa;
    public static zzbz<Integer> zzaab = zzbz.zza("analytics.batch_retry_interval.seconds.k", (int) ChartTimeInterval.CANDLE_1H, (int) ChartTimeInterval.CANDLE_1H);
    private static zzbz<Long> zzaac = zzbz.zza("analytics.service_monitor_interval", 86400000, 86400000);
    public static zzbz<Integer> zzaad = zzbz.zza("analytics.http_connection.connect_timeout_millis", 60000, 60000);
    public static zzbz<Integer> zzaae = zzbz.zza("analytics.http_connection.read_timeout_millis", 61000, 61000);
    public static zzbz<Long> zzaaf = zzbz.zza("analytics.campaigns.time_limit", 86400000, 86400000);
    private static zzbz<String> zzaag;
    private static zzbz<Integer> zzaah = zzbz.zza("analytics.first_party_experiment_variant", 0, 0);
    public static zzbz<Boolean> zzaai = zzbz.zza("analytics.test.disable_receiver", false, false);
    public static zzbz<Long> zzaaj = zzbz.zza("analytics.service_client.idle_disconnect_millis", 10000, 10000);
    public static zzbz<Long> zzaak = zzbz.zza("analytics.service_client.connect_timeout_millis", 5000, 5000);
    private static zzbz<Long> zzaal = zzbz.zza("analytics.service_client.second_connect_delay_millis", 5000, 5000);
    private static zzbz<Long> zzaam = zzbz.zza("analytics.service_client.unexpected_reconnect_millis", 60000, 60000);
    public static zzbz<Long> zzaan = zzbz.zza("analytics.service_client.reconnect_throttle_millis", 1800000, 1800000);
    public static zzbz<Long> zzaao = zzbz.zza("analytics.monitoring.sample_period_millis", 86400000, 86400000);
    public static zzbz<Long> zzaap = zzbz.zza("analytics.initialization_warning_threshold", 5000, 5000);
    public static zzbz<Boolean> zzaaq = zzbz.zza("analytics.gcm_task_service", false, false);
    private static zzbz<Boolean> zzyz = zzbz.zza("analytics.service_enabled", false, false);
    public static zzbz<Boolean> zzza = zzbz.zza("analytics.service_client_enabled", true, true);
    public static zzbz<String> zzzb = zzbz.zza("analytics.log_tag", "GAv4", "GAv4-SVC");
    private static zzbz<Long> zzzc = zzbz.zza("analytics.max_tokens", 60, 60);
    private static zzbz<Float> zzzd = zzbz.zza("analytics.tokens_per_sec", 0.5f, 0.5f);
    public static zzbz<Integer> zzze = zzbz.zza("analytics.max_stored_hits", (int) CredentialsApi.CREDENTIAL_PICKER_REQUEST_CODE, 20000);
    private static zzbz<Integer> zzzf = zzbz.zza("analytics.max_stored_hits_per_app", (int) CredentialsApi.CREDENTIAL_PICKER_REQUEST_CODE, (int) CredentialsApi.CREDENTIAL_PICKER_REQUEST_CODE);
    public static zzbz<Integer> zzzg = zzbz.zza("analytics.max_stored_properties_per_app", 100, 100);
    public static zzbz<Long> zzzh = zzbz.zza("analytics.local_dispatch_millis", 1800000, 120000);
    public static zzbz<Long> zzzi = zzbz.zza("analytics.initial_local_dispatch_millis", 5000, 5000);
    private static zzbz<Long> zzzj = zzbz.zza("analytics.min_local_dispatch_millis", 120000, 120000);
    private static zzbz<Long> zzzk = zzbz.zza("analytics.max_local_dispatch_millis", 7200000, 7200000);
    public static zzbz<Long> zzzl = zzbz.zza("analytics.dispatch_alarm_millis", 7200000, 7200000);
    public static zzbz<Long> zzzm = zzbz.zza("analytics.max_dispatch_alarm_millis", 32400000, 32400000);
    public static zzbz<Integer> zzzn = zzbz.zza("analytics.max_hits_per_dispatch", 20, 20);
    public static zzbz<Integer> zzzo = zzbz.zza("analytics.max_hits_per_batch", 20, 20);
    public static zzbz<String> zzzp;
    public static zzbz<String> zzzq;
    public static zzbz<String> zzzr;
    public static zzbz<String> zzzs;
    public static zzbz<Integer> zzzt = zzbz.zza("analytics.max_get_length", 2036, 2036);
    public static zzbz<String> zzzu = zzbz.zza("analytics.batching_strategy.k", zzbg.BATCH_BY_COUNT.name(), zzbg.BATCH_BY_COUNT.name());
    public static zzbz<String> zzzv;
    private static zzbz<Integer> zzzw = zzbz.zza("analytics.max_hits_per_request.k", 20, 20);
    public static zzbz<Integer> zzzx = zzbz.zza("analytics.max_hit_length.k", 8192, 8192);
    public static zzbz<Integer> zzzy = zzbz.zza("analytics.max_post_length.k", 8192, 8192);
    public static zzbz<Integer> zzzz = zzbz.zza("analytics.max_batch_post_length", 8192, 8192);

    static {
        String str = "http://www.google-analytics.com";
        zzzp = zzbz.zza("analytics.insecure_host", str, str);
        str = "https://ssl.google-analytics.com";
        zzzq = zzbz.zza("analytics.secure_host", str, str);
        str = "/collect";
        zzzr = zzbz.zza("analytics.simple_endpoint", str, str);
        str = "/batch";
        zzzs = zzbz.zza("analytics.batching_endpoint", str, str);
        String name = zzbm.GZIP.name();
        zzzv = zzbz.zza("analytics.compression_strategy.k", name, name);
        name = "404,502";
        zzaaa = zzbz.zza("analytics.fallback_responses.k", name, name);
        String str2 = "";
        zzaag = zzbz.zza("analytics.first_party_experiment_id", str2, str2);
    }
}
