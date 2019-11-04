package com.iqoption.core.microservices.kyc.response.document;

import android.text.TextUtils;
import com.iqoption.core.d;
import com.iqoption.core.util.ac;
import com.iqoption.core.util.af;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u0018\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0001H\u0002\u001a\f\u0010\u0006\u001a\u0004\u0018\u00010\u0004*\u00020\u0007\"\u000e\u0010\u0000\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000¨\u0006\b"}, bng = {"PRIVATE_KEY", "", "PRIVATE_KEY_DEBUG", "fromJson", "Lcom/iqoption/core/microservices/kyc/response/document/NetverifyConfigData;", "jsonString", "decrypt", "Lcom/iqoption/core/microservices/kyc/response/document/NetverifyConfig;", "core_release"})
/* compiled from: NetverifyConfigUtils.kt */
public final class h {
    public static final g a(f fVar) {
        kotlin.jvm.internal.i.f(fVar, "$this$decrypt");
        String ar = ac.ar(fVar.aeU(), d.EE().UW() ? "MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQDOpv11Zf9p4RYm\nn6m+2EelndfXDFRNsnYEVIa0EbalmWw1YA9ibgj5uhixo0vC5MSYvwSL7kfhjnpT\nD1S2W/cW22I+U0bk7NF2Kkyj8wtktx/GvmWqpv9ffVSaBD2H4MENH2zdfN6ay4ec\nDD077KiJJB0Z/hDJzDrmaHXpaGdMb0AIB34U2dm8/i//Hytw4t4guSYYDgbhSFin\nStHwt3CbKFQBsu0b4HxC+m9ZaVK11ZMuxlyibu++toUqTxEz9okDnsd4XgDWmQC3\nwMKXpjfasAPrJ4eRWApQQaVqrMNR+eKW4+KZxPF/O7CPxeE2WfZE3w6y6rBLdQFJ\n/4eoBZmzAgMBAAECggEBAIpKY9k5bagcMeec90o4kBG7xGIr5Qqtv558NjywkerV\n9fzuEL2M50K/D6Fopt2AnDOfuNovljjSUPfejZEPkBXisCcHMa0m8bFC81DP57L5\nfTFR3tVJtiHfzErZRZf1hxtSCVdbJdivFUwPQLcmU06bNUJcrD1vB4eDJk0RSfdy\nU6tavGnonHlUD7ZbPpFT8XOAP7yL6hNRiuXdaKTbIjObOlubhCePYwn9HzLvlpgg\nd4OdBvMEcomIDUXw/9mH1Ayz1eh6ls8pyZbZSmdeyRAF3GAbxSLc8A9IbtMpj4sn\ncQ3ZxRVjsT0I7Gg01MMbKq6kxzZ+6p+zG6Mr7dYxz+ECgYEA6BP+dlt3768PJWld\njJOxyI+Jx8YqeF+zZSFaE3Lz7HBEPWzeYgPruda1E4rBuvMJ4Fpnva4oI4MPOUY8\nMyo6pcUbeKyKVvjTBvHGhvoXeseuyqy7ANWich8h8czsdnBPbbRCtEqL+rDX8vhM\ngeA/F751FhuahllPJ2sKsCsrE+MCgYEA4/QRY+yOgIZf2xLvL5HNSyfKiTxejbME\n16X/CssAkpM9Pr3vq4M+4ciklzYsBeXh6Tg9eWpLriSC95c+VnwM9N0LeSwOIfMc\nSQbIQPJey6aWASSlbmf4GP5DCIUcPLhYQDEMBMh0pTLVmnUFl7k+WsIel0W/9k6N\nMiUBOOi4a/ECgYB2NUDmPj6/ybX4Q0vP/6aNVndCVzBosa4pc6xyvZl6s9A+TUaU\nPBUESlVfB80XkRVVvhabKaruM6I8dQbStM68gsI0XAX2uLScE+gf9iChfDYOq55w\nlWAxqqPaipti1F/QrAFR3aqg3RSRgGFPwc3BJVR0F0lE5xaHKGGAS+ycKwKBgQC0\nn/7vqNA580AdPWGd1fBQLxWDrPxXV5Tss7HmAXlQq68J+kLhKrw2+F/DGb/EZKWf\nwVqkzJ9vO6szOPrCWMWDeWvP9iK0sAinrOIc5HBM+pE+EqWrWGL0mvTO2XrIemIj\naznUyGn1RNSQ8U0fLj/EdrD6uOAk8ZVcOIpBZ9ZKYQKBgEbke+9SQ9s2QEzRGoxc\nTWamO3U6MA2w2Q+w2nlBVBSPREiJ8BrLYJHmqhTAW36HgX83cGmVm0tEYXmnfjRU\nDyFYcCV74tzE21NkJYy5ioZCzzP2vlk37WHgUTsWHWmJTLMP3YILpgIk4+Zv5Xee\nxUe0xIZavLpuwDck9GeRX6Rl" : "MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQDk4yaOyBvpENj6\n64E2+ihWyTT92YmeKVhA/miExUB91YuOkqr+HaJHTvrpKKp6sRY+O6ddkpkI7ybW\n7U5UIVKhiN+r6O3MtV6GrlUAlcoJqOFUnseNtWydWK7A/DCXX49F/Iq2JDvMPrI+\nK89PGTqw+40+jdrwncog0iv2AHEioZRchwD3KwG47iPOT0Hd7zbWfSceWd2mvSGo\nvSLcQ/M9DO0EVkRt39+A0TlsOrfNfw+VqBRJPFzDu/oZEEqLfcj+0rjIcizcAycK\n3tWCLdV1vqhJMzKbSPdzm0RycrFbcPZzuLb10DK3gajRNlGAW1PBooDYKYC/JswE\nYU+K8mPjAgMBAAECggEBAKGNVpy2z0RcuNm6OfTE8o327Gk0DvdMdVdCeiEkXJW0\nkRErondEEVNFgsHpCxMYRPvd/Q6Ft3Bf5EkVLBEjiAAt7LmY6adwaGylRafpEbZp\ntcmVXIJACI6yln3uQpnFQAoE6x8OSgqqQgKxx1wsEYnzs0jwtRTaOl2aGp9CxpfK\noFW+EJl7wjzRb0R7W/slBPm1v6fWUhea3RwfDYHeRMN82TWx6LuFkVgQ5yHgxHNf\n5mCuRQCEKIDsVhdQ/eLwRwlqMYQUfjlKCfKMjS0MDIIbgkRHqrtph4ipPnu4C2i0\n6D9H4q2QaRSFBUq98hAGaq8J0N3ycZUSk6+BFaiQS1ECgYEA+mtnIpIGxsqzKAzo\nm7dkmPkjuzBU5sgRXR9dG+xw/nFgsq2BMvY1DmV33tljMQ6KDw6/szYLqm5KGpFQ\nUca+AvdQmPAdQs5zwWbytyGXf2TN8j53KB5kwrqGgECGqXmQ7cBj4hbnls5xxHf8\n6IA7iYwYpCmCmW3vt9cUcV7bTAkCgYEA6fzpC0lJEWolJ9pscN0RcUr8OkArrsOM\nMMsIegA2XBsNp8QOeR9ZaeCq4kxE40XnRdisY6ChHscjA888Z13IWKgeLOS2PR5S\nc7jLga5xR++t1o6eAZrY3dEcvZIWq/4Cfw5TV9C1BptEEgTUl8sKxbDNGUdQWCAh\nbhNcvq8cA4sCgYBTkO/T24MjZ5UtslEVVbfeTJWd690JPo580vCRVu/GGTO5rKjG\nxt6htT6xQT4WqtFrgPJ77XcrIq7b+s4g2/+gocNlpgs9tgNu8NniPvV9b7hCNJIy\n8yGQ0gn8VowZlhXFIUSzuA0EiFPyyk+9jr1Pg07dyXRpmwQ6By4tPwhTcQKBgCLh\nyzQdhsEL2+InE8d3jWQgU52zd0+kYz/a5LabVX9BoTWDaszvuXqpPZBi4lonT6T/\n+iMYDSzzburgeBbIylc9KNJ0fh56aLxLrjr08HpS5s13kWKX3QCkbe5s2uhlA6ZB\nUndi67nCZ9Fv2umOIVr7UngUQ4v/rjwksszSehClAoGAFE2b3xtkyjnnQuYjU8Xz\nWJ/uWVskoCSg1ewwDZGczCW3Sn/hRsvO68Bc7MQKj2GXnXiA99T/E/YE763GdnN0\nV5Zi1/B1RiluqPp+tnjb9hC6gKn21d99Jzh9Rvq2+5lQFxK36Z5N4RKMKn2QlYpK\n3HPcXBouSKXAHvorIZ+2T+g=");
        g gVar = null;
        if (TextUtils.isEmpty(ar)) {
            return null;
        }
        kotlin.jvm.internal.i.e(ar, "decryptedConfig");
        ar = af.as(ar, "{\"token\"");
        if (!TextUtils.isEmpty(ar)) {
            gVar = gN(ar);
        }
        return gVar;
    }

    private static final g gN(String str) {
        try {
            return (g) d.Ez().fromJson(str, g.class);
        } catch (Exception unused) {
            return null;
        }
    }
}
