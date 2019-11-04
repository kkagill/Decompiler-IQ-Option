package com.iqoption.microservice.vip;

import com.iqoption.vip.WeekDay;
import com.iqoption.vip.k;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Map;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b8\b\b\u0018\u00002\u00020\u0001B\u0007\b\u0016¢\u0006\u0002\u0010\u0002Bë\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\n\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\n\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\n0\u0012\u0012\u0006\u0010\u0013\u001a\u00020\n\u0012\u0006\u0010\u0014\u001a\u00020\n\u0012\u0006\u0010\u0015\u001a\u00020\n\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\n0\u0012\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u0012\u0012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0012\u0012\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0012\u0012\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0012\u0012\u0006\u0010\u001f\u001a\u00020\f\u0012\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\n0\u0012\u0012\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020$0\"¢\u0006\u0002\u0010%J\t\u0010A\u001a\u00020\u0004HÆ\u0003J\t\u0010B\u001a\u00020\nHÆ\u0003J\u000f\u0010C\u001a\b\u0012\u0004\u0012\u00020\n0\u0012HÆ\u0003J\t\u0010D\u001a\u00020\nHÆ\u0003J\t\u0010E\u001a\u00020\nHÆ\u0003J\t\u0010F\u001a\u00020\nHÆ\u0003J\u000f\u0010G\u001a\b\u0012\u0004\u0012\u00020\n0\u0012HÆ\u0003J\u000f\u0010H\u001a\b\u0012\u0004\u0012\u00020\u00180\u0012HÆ\u0003J\u000f\u0010I\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0012HÆ\u0003J\u000f\u0010J\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0012HÆ\u0003J\u000f\u0010K\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0012HÆ\u0003J\t\u0010L\u001a\u00020\u0004HÆ\u0003J\t\u0010M\u001a\u00020\fHÆ\u0003J\u000f\u0010N\u001a\b\u0012\u0004\u0012\u00020\n0\u0012HÆ\u0003J\u0015\u0010O\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020$0\"HÆ\u0003J\t\u0010P\u001a\u00020\u0004HÆ\u0003J\t\u0010Q\u001a\u00020\u0004HÆ\u0003J\t\u0010R\u001a\u00020\u0004HÆ\u0003J\t\u0010S\u001a\u00020\nHÆ\u0003J\t\u0010T\u001a\u00020\fHÆ\u0003J\t\u0010U\u001a\u00020\nHÆ\u0003J\t\u0010V\u001a\u00020\u000fHÆ\u0003J\u0002\u0010W\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\n2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\n2\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\n0\u00122\b\b\u0002\u0010\u0013\u001a\u00020\n2\b\b\u0002\u0010\u0014\u001a\u00020\n2\b\b\u0002\u0010\u0015\u001a\u00020\n2\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\n0\u00122\u000e\b\u0002\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u00122\u000e\b\u0002\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00122\u000e\b\u0002\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00122\u000e\b\u0002\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00122\b\b\u0002\u0010\u001f\u001a\u00020\f2\u000e\b\u0002\u0010 \u001a\b\u0012\u0004\u0012\u00020\n0\u00122\u0014\b\u0002\u0010!\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020$0\"HÆ\u0001J\u0013\u0010X\u001a\u00020\u00042\b\u0010Y\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010Z\u001a\u00020\u000fHÖ\u0001J\t\u0010[\u001a\u00020\nHÖ\u0001R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010'R\u0011\u0010\u0006\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010'R\u0017\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0012¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0017\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0012¢\u0006\b\n\u0000\u001a\u0004\b,\u0010+R\u0011\u0010\u0007\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010'R\u0011\u0010\b\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010'R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u0011\u0010\r\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b2\u0010/R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u0011\u0010\u0010\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b5\u0010/R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\n0\u0012¢\u0006\b\n\u0000\u001a\u0004\b6\u0010+R\u0011\u0010\u0013\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b7\u0010/R\u0011\u0010\u0014\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b8\u0010/R\u0011\u0010\u0015\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b9\u0010/R\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\n0\u0012¢\u0006\b\n\u0000\u001a\u0004\b:\u0010+R\u001d\u0010!\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020$0\"¢\u0006\b\n\u0000\u001a\u0004\b;\u0010<R\u0011\u0010\u001f\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b=\u00101R\u0017\u0010 \u001a\b\u0012\u0004\u0012\u00020\n0\u0012¢\u0006\b\n\u0000\u001a\u0004\b>\u0010+R\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0012¢\u0006\b\n\u0000\u001a\u0004\b?\u0010+R\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u0012¢\u0006\b\n\u0000\u001a\u0004\b@\u0010+¨\u0006\\"}, bng = {"Lcom/iqoption/microservice/vip/VipManager;", "", "()V", "canBeRated", "", "canOrderCallBack", "canOrderVipSupportCallback", "hasVipManager", "isOnline", "managerBirthCountry", "", "managerBirthday", "Ljava/util/Date;", "managerDescription", "managerGender", "", "managerId", "managerLanguages", "", "managerName", "managerPhone", "managerPhoto", "managerPhotosList", "trainingSessionsCategories", "Lcom/iqoption/microservice/vip/TrainingSessionCategory;", "trainingSessions", "Lcom/iqoption/microservice/vip/TrainingSession;", "certificates", "Lcom/iqoption/microservice/vip/Certificate;", "educationMaterials", "Lcom/iqoption/microservice/vip/EducationMaterial;", "managerWorkStartDate", "managerWorkTimeUTC", "managerWorkPeriodUtc", "", "Lcom/iqoption/vip/WeekDay;", "Lcom/iqoption/vip/WorkingPeriod;", "(ZZZZZLjava/lang/String;Ljava/util/Date;Ljava/lang/String;ILjava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/Date;Ljava/util/List;Ljava/util/Map;)V", "getCanBeRated", "()Z", "getCanOrderCallBack", "getCanOrderVipSupportCallback", "getCertificates", "()Ljava/util/List;", "getEducationMaterials", "getHasVipManager", "getManagerBirthCountry", "()Ljava/lang/String;", "getManagerBirthday", "()Ljava/util/Date;", "getManagerDescription", "getManagerGender", "()I", "getManagerId", "getManagerLanguages", "getManagerName", "getManagerPhone", "getManagerPhoto", "getManagerPhotosList", "getManagerWorkPeriodUtc", "()Ljava/util/Map;", "getManagerWorkStartDate", "getManagerWorkTimeUTC", "getTrainingSessions", "getTrainingSessionsCategories", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "app_optionXRelease"})
/* compiled from: VipManagerResposnses.kt */
public final class d {
    private final boolean asB;
    private final boolean canBeRated;
    private final boolean dHi;
    private final boolean dHj;
    private final boolean dHk;
    private final String dHl;
    private final Date dHm;
    private final String dHn;
    private final int dHo;
    private final String dHp;
    private final List<String> dHq;
    private final String dHr;
    private final List<String> dHs;
    private final List<c> dHt;
    private final List<b> dHu;
    private final List<Object> dHv;
    private final List<Object> dHw;
    private final Date dHx;
    private final List<String> dHy;
    private final Map<WeekDay, k> dHz;
    private final String managerName;
    private final String managerPhone;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof d) {
                d dVar = (d) obj;
                if ((this.canBeRated == dVar.canBeRated ? 1 : null) != null) {
                    if ((this.dHi == dVar.dHi ? 1 : null) != null) {
                        if ((this.dHj == dVar.dHj ? 1 : null) != null) {
                            if ((this.dHk == dVar.dHk ? 1 : null) != null) {
                                if ((this.asB == dVar.asB ? 1 : null) != null && kotlin.jvm.internal.i.y(this.dHl, dVar.dHl) && kotlin.jvm.internal.i.y(this.dHm, dVar.dHm) && kotlin.jvm.internal.i.y(this.dHn, dVar.dHn)) {
                                    if (!((this.dHo == dVar.dHo ? 1 : null) != null && kotlin.jvm.internal.i.y(this.dHp, dVar.dHp) && kotlin.jvm.internal.i.y(this.dHq, dVar.dHq) && kotlin.jvm.internal.i.y(this.managerName, dVar.managerName) && kotlin.jvm.internal.i.y(this.managerPhone, dVar.managerPhone) && kotlin.jvm.internal.i.y(this.dHr, dVar.dHr) && kotlin.jvm.internal.i.y(this.dHs, dVar.dHs) && kotlin.jvm.internal.i.y(this.dHt, dVar.dHt) && kotlin.jvm.internal.i.y(this.dHu, dVar.dHu) && kotlin.jvm.internal.i.y(this.dHv, dVar.dHv) && kotlin.jvm.internal.i.y(this.dHw, dVar.dHw) && kotlin.jvm.internal.i.y(this.dHx, dVar.dHx) && kotlin.jvm.internal.i.y(this.dHy, dVar.dHy) && kotlin.jvm.internal.i.y(this.dHz, dVar.dHz))) {
                                        return false;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i = this.canBeRated;
        int i2 = 1;
        if (i != 0) {
            i = 1;
        }
        i *= 31;
        int i3 = this.dHi;
        if (i3 != 0) {
            i3 = 1;
        }
        i = (i + i3) * 31;
        i3 = this.dHj;
        if (i3 != 0) {
            i3 = 1;
        }
        i = (i + i3) * 31;
        i3 = this.dHk;
        if (i3 != 0) {
            i3 = 1;
        }
        i = (i + i3) * 31;
        boolean z = this.asB;
        if (!z) {
            i2 = z;
        }
        i = (i + i2) * 31;
        String str = this.dHl;
        i3 = 0;
        i = (i + (str != null ? str.hashCode() : 0)) * 31;
        Date date = this.dHm;
        i = (i + (date != null ? date.hashCode() : 0)) * 31;
        str = this.dHn;
        i = (((i + (str != null ? str.hashCode() : 0)) * 31) + this.dHo) * 31;
        str = this.dHp;
        i = (i + (str != null ? str.hashCode() : 0)) * 31;
        List list = this.dHq;
        i = (i + (list != null ? list.hashCode() : 0)) * 31;
        str = this.managerName;
        i = (i + (str != null ? str.hashCode() : 0)) * 31;
        str = this.managerPhone;
        i = (i + (str != null ? str.hashCode() : 0)) * 31;
        str = this.dHr;
        i = (i + (str != null ? str.hashCode() : 0)) * 31;
        list = this.dHs;
        i = (i + (list != null ? list.hashCode() : 0)) * 31;
        list = this.dHt;
        i = (i + (list != null ? list.hashCode() : 0)) * 31;
        list = this.dHu;
        i = (i + (list != null ? list.hashCode() : 0)) * 31;
        list = this.dHv;
        i = (i + (list != null ? list.hashCode() : 0)) * 31;
        list = this.dHw;
        i = (i + (list != null ? list.hashCode() : 0)) * 31;
        date = this.dHx;
        i = (i + (date != null ? date.hashCode() : 0)) * 31;
        list = this.dHy;
        i = (i + (list != null ? list.hashCode() : 0)) * 31;
        Map map = this.dHz;
        if (map != null) {
            i3 = map.hashCode();
        }
        return i + i3;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("VipManager(canBeRated=");
        stringBuilder.append(this.canBeRated);
        stringBuilder.append(", canOrderCallBack=");
        stringBuilder.append(this.dHi);
        stringBuilder.append(", canOrderVipSupportCallback=");
        stringBuilder.append(this.dHj);
        stringBuilder.append(", hasVipManager=");
        stringBuilder.append(this.dHk);
        stringBuilder.append(", isOnline=");
        stringBuilder.append(this.asB);
        stringBuilder.append(", managerBirthCountry=");
        stringBuilder.append(this.dHl);
        stringBuilder.append(", managerBirthday=");
        stringBuilder.append(this.dHm);
        stringBuilder.append(", managerDescription=");
        stringBuilder.append(this.dHn);
        stringBuilder.append(", managerGender=");
        stringBuilder.append(this.dHo);
        stringBuilder.append(", managerId=");
        stringBuilder.append(this.dHp);
        stringBuilder.append(", managerLanguages=");
        stringBuilder.append(this.dHq);
        stringBuilder.append(", managerName=");
        stringBuilder.append(this.managerName);
        stringBuilder.append(", managerPhone=");
        stringBuilder.append(this.managerPhone);
        stringBuilder.append(", managerPhoto=");
        stringBuilder.append(this.dHr);
        stringBuilder.append(", managerPhotosList=");
        stringBuilder.append(this.dHs);
        stringBuilder.append(", trainingSessionsCategories=");
        stringBuilder.append(this.dHt);
        stringBuilder.append(", trainingSessions=");
        stringBuilder.append(this.dHu);
        stringBuilder.append(", certificates=");
        stringBuilder.append(this.dHv);
        stringBuilder.append(", educationMaterials=");
        stringBuilder.append(this.dHw);
        stringBuilder.append(", managerWorkStartDate=");
        stringBuilder.append(this.dHx);
        stringBuilder.append(", managerWorkTimeUTC=");
        stringBuilder.append(this.dHy);
        stringBuilder.append(", managerWorkPeriodUtc=");
        stringBuilder.append(this.dHz);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public d(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, String str, Date date, String str2, int i, String str3, List<String> list, String str4, String str5, String str6, List<String> list2, List<c> list3, List<b> list4, List<Object> list5, List<Object> list6, Date date2, List<String> list7, Map<WeekDay, k> map) {
        String str7 = str;
        Date date3 = date;
        String str8 = str2;
        String str9 = str3;
        List<String> list8 = list;
        String str10 = str4;
        String str11 = str5;
        String str12 = str6;
        List<String> list9 = list2;
        List<c> list10 = list3;
        List<b> list11 = list4;
        List<Object> list12 = list5;
        List<Object> list13 = list6;
        Date date4 = date2;
        List<String> list14 = list7;
        kotlin.jvm.internal.i.f(str7, "managerBirthCountry");
        kotlin.jvm.internal.i.f(date3, "managerBirthday");
        kotlin.jvm.internal.i.f(str8, "managerDescription");
        kotlin.jvm.internal.i.f(str9, "managerId");
        kotlin.jvm.internal.i.f(list8, "managerLanguages");
        kotlin.jvm.internal.i.f(str10, "managerName");
        kotlin.jvm.internal.i.f(str11, "managerPhone");
        kotlin.jvm.internal.i.f(str12, "managerPhoto");
        kotlin.jvm.internal.i.f(list9, "managerPhotosList");
        kotlin.jvm.internal.i.f(list10, "trainingSessionsCategories");
        kotlin.jvm.internal.i.f(list11, "trainingSessions");
        kotlin.jvm.internal.i.f(list12, "certificates");
        kotlin.jvm.internal.i.f(list13, "educationMaterials");
        kotlin.jvm.internal.i.f(date4, "managerWorkStartDate");
        kotlin.jvm.internal.i.f(list14, "managerWorkTimeUTC");
        kotlin.jvm.internal.i.f(map, "managerWorkPeriodUtc");
        this.canBeRated = z;
        this.dHi = z2;
        this.dHj = z3;
        this.dHk = z4;
        this.asB = z5;
        this.dHl = str7;
        this.dHm = date3;
        this.dHn = str8;
        this.dHo = i;
        this.dHp = str9;
        this.dHq = list8;
        this.managerName = str10;
        this.managerPhone = str11;
        this.dHr = str12;
        this.dHs = list9;
        this.dHt = list10;
        this.dHu = list11;
        this.dHv = list12;
        this.dHw = list13;
        this.dHx = date4;
        this.dHy = list7;
        this.dHz = map;
    }

    public final boolean aOC() {
        return this.dHi;
    }

    public final Date aOD() {
        return this.dHm;
    }

    public final String aOE() {
        return this.dHn;
    }

    public final List<String> aOF() {
        return this.dHq;
    }

    public final String aOG() {
        return this.managerName;
    }

    public final String aOH() {
        return this.managerPhone;
    }

    public final String aOI() {
        return this.dHr;
    }

    public final List<String> aOJ() {
        return this.dHs;
    }

    public final List<c> aOK() {
        return this.dHt;
    }

    public final List<b> aOL() {
        return this.dHu;
    }

    public final Date aOM() {
        return this.dHx;
    }

    public final List<String> aON() {
        return this.dHy;
    }

    public final Map<WeekDay, k> aOO() {
        return this.dHz;
    }

    public d() {
        Date date = r1;
        Date date2 = new Date();
        List emptyList = Collections.emptyList();
        List list = emptyList;
        String str = "Collections.emptyList<String>()";
        kotlin.jvm.internal.i.e(emptyList, str);
        emptyList = Collections.emptyList();
        List list2 = emptyList;
        kotlin.jvm.internal.i.e(emptyList, str);
        emptyList = Collections.emptyList();
        List list3 = emptyList;
        kotlin.jvm.internal.i.e(emptyList, "Collections.emptyList<TrainingSessionCategory>()");
        emptyList = Collections.emptyList();
        List list4 = emptyList;
        kotlin.jvm.internal.i.e(emptyList, "Collections.emptyList<TrainingSession>()");
        emptyList = Collections.emptyList();
        List list5 = emptyList;
        kotlin.jvm.internal.i.e(emptyList, "Collections.emptyList<Certificate>()");
        emptyList = Collections.emptyList();
        List list6 = emptyList;
        kotlin.jvm.internal.i.e(emptyList, "Collections.emptyList<EducationMaterial>()");
        Date date3 = date2;
        date2 = new Date();
        emptyList = Collections.emptyList();
        List list7 = emptyList;
        kotlin.jvm.internal.i.e(emptyList, str);
        Map emptyMap = Collections.emptyMap();
        Map map = emptyMap;
        kotlin.jvm.internal.i.e(emptyMap, "Collections.emptyMap()");
        this(false, false, false, false, false, "", date, "", 0, "", list, "", "", "", list2, list3, list4, list5, list6, date3, list7, map);
    }
}
