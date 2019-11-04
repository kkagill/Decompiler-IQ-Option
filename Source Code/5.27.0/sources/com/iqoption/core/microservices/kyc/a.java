package com.iqoption.core.microservices.kyc;

import com.google.gson.reflect.TypeToken;
import com.iqoption.core.connect.k;
import com.iqoption.core.d;
import com.iqoption.core.microservices.kyc.response.VerificationType;
import com.iqoption.core.microservices.kyc.response.document.c;
import com.iqoption.core.microservices.kyc.response.document.e;
import com.iqoption.core.microservices.kyc.response.document.f;
import com.iqoption.core.microservices.kyc.response.document.j;
import io.reactivex.p;
import java.lang.reflect.Type;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0014\u001a\u00020\u0015H\u0007J\u001c\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00170\u00122\u0006\u0010\u0014\u001a\u00020\u0015H\u0007J\u000e\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0012H\u0007J\u000e\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0012H\u0007J\u000e\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0012H\u0007J7\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020 0\u00122\u0006\u0010!\u001a\u00020\u00042\b\u0010\"\u001a\u0004\u0018\u00010\u00042\u0006\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010&H\u0007¢\u0006\u0002\u0010'R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\n \f*\u0004\u0018\u00010\u000b0\u000bX\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006("}, bng = {"Lcom/iqoption/core/microservices/kyc/KycDocumentRequests;", "", "()V", "CMD_CREATE_VERIFICATION_DOCUMENT", "", "CMD_GET_KYC_DOCUMENTS", "CMD_GET_KYC_DOCUMENTS_HISTORY", "CMD_GET_NETVERIFY_CONFIG", "CMD_GET_POA_DOCUMENTS_TYPES", "CMD_SET_DOCUMENT_UPLOADED", "TYPE_DOCUMENTS_HISTORY", "Ljava/lang/reflect/Type;", "kotlin.jvm.PlatformType", "dateFormat", "Ljava/text/DateFormat;", "getDateFormat", "()Ljava/text/DateFormat;", "createVerificationDocument", "Lio/reactivex/Single;", "Lcom/iqoption/core/microservices/kyc/response/VerificationDocument;", "type", "Lcom/iqoption/core/microservices/kyc/response/VerificationType;", "getDocumentsHistory", "", "Lcom/iqoption/core/microservices/kyc/response/document/KycDocumentHistory;", "getGetNetverifyConfig", "Lcom/iqoption/core/microservices/kyc/response/document/NetverifyConfig;", "getKycDocuments", "Lcom/iqoption/core/microservices/kyc/response/document/KycDocumentsResult;", "getPoaDocumentTypes", "Lcom/iqoption/core/microservices/kyc/response/document/PoaDocumentTypesResult;", "setDocumentsUploaded", "Lcom/iqoption/core/microservices/kyc/response/document/DocumentUploadedResult;", "merchantScanReference", "jumioScanReference", "isFailed", "", "errorCode", "", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Integer;)Lio/reactivex/Single;", "core_release"})
/* compiled from: KycDocumentRequests.kt */
public final class a {
    private static final Type bun = new a().getType();
    private static final DateFormat buo = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault());
    public static final a bup = new a();

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001¨\u0006\u0004"}, bng = {"com/iqoption/core/microservices/kyc/KycDocumentRequests$TYPE_DOCUMENTS_HISTORY$1", "Lcom/google/gson/reflect/TypeToken;", "", "Lcom/iqoption/core/microservices/kyc/response/document/KycDocumentHistory;", "core_release"})
    /* compiled from: KycDocumentRequests.kt */
    public static final class a extends TypeToken<List<? extends c>> {
        a() {
        }
    }

    static {
        buo.setTimeZone(TimeZone.getTimeZone("UTC"));
    }

    private a() {
    }

    public final DateFormat aes() {
        return buo;
    }

    public static final p<e> aet() {
        return d.EV().a("get-kyc-documents", e.class).fp("2.0").UB();
    }

    public static final p<j> aeu() {
        return d.EV().a("get-poa-documents-types", j.class).fp("1.0").UB();
    }

    public static final p<f> aev() {
        return d.EV().a("get-netverify-config", f.class).fp("2.0").UB();
    }

    public static final p<com.iqoption.core.microservices.kyc.response.i> b(VerificationType verificationType) {
        kotlin.jvm.internal.i.f(verificationType, "type");
        return d.EV().a("create-verification-document", com.iqoption.core.microservices.kyc.response.i.class).k("verification_type", verificationType.getServerValue()).fp("1.0").UB();
    }

    public static final p<com.iqoption.core.microservices.kyc.response.document.a> a(String str, String str2, boolean z, Integer num) {
        kotlin.jvm.internal.i.f(str, "merchantScanReference");
        return d.EV().a("set-document-uploaded", com.iqoption.core.microservices.kyc.response.document.a.class).k("merchant_scan_reference", str).k("jumio_scan_reference", str2).k("is_failed", Boolean.valueOf(z)).k("error_code", num).fp("1.0").UB();
    }

    public static final p<List<c>> c(VerificationType verificationType) {
        kotlin.jvm.internal.i.f(verificationType, "type");
        k EV = d.EV();
        Type type = bun;
        kotlin.jvm.internal.i.e(type, "TYPE_DOCUMENTS_HISTORY");
        return EV.a("get-kyc-documents-history", type).k("verification_type", verificationType.getServerValue()).fp("1.0").UB();
    }
}
