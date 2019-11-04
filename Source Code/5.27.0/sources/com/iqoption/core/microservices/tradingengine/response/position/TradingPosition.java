package com.iqoption.core.microservices.tradingengine.response.position;

import androidx.core.app.NotificationCompat;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.iqoption.core.Platform;
import com.iqoption.core.data.model.Direction;
import com.iqoption.core.data.model.InstrumentType;
import com.iqoption.core.microservices.tradingengine.response.order.TradingOrder;
import com.iqoption.dto.entity.position.Position;
import java.util.List;
import kotlin.TypeCastException;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000u\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0003\b\u0001\n\u0002\u0010\u000b\n\u0002\b\u0007\b\b\u0018\u0000 Õ\u00012\u00020\u0001:\u0006Õ\u0001Ö\u0001×\u0001B\u0007\b\u0016¢\u0006\u0002\u0010\u0002Bç\u0004\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\b\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0015\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0017\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0019\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u001c\u001a\u00020\b\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u0012\u0012\b\b\u0002\u0010 \u001a\u00020\u0012\u0012\b\b\u0002\u0010!\u001a\u00020\u0012\u0012\b\b\u0002\u0010\"\u001a\u00020\u0012\u0012\b\b\u0002\u0010#\u001a\u00020\u0012\u0012\b\b\u0002\u0010$\u001a\u00020\u0012\u0012\b\b\u0002\u0010%\u001a\u00020\u0012\u0012\b\b\u0002\u0010&\u001a\u00020\u0012\u0012\b\b\u0002\u0010'\u001a\u00020(\u0012\b\b\u0002\u0010)\u001a\u00020*\u0012\b\b\u0002\u0010+\u001a\u00020\u0012\u0012\b\b\u0002\u0010,\u001a\u00020\u0012\u0012\b\b\u0002\u0010-\u001a\u00020\u0012\u0012\b\b\u0002\u0010.\u001a\u00020\u0012\u0012\b\b\u0002\u0010/\u001a\u00020\u0012\u0012\b\b\u0002\u00100\u001a\u00020\u0012\u0012\b\b\u0002\u00101\u001a\u00020\u0004\u0012\b\b\u0002\u00102\u001a\u00020\u0004\u0012\b\b\u0002\u00103\u001a\u00020\u0004\u0012\b\b\u0002\u00104\u001a\u00020\u0004\u0012\b\b\u0002\u00105\u001a\u00020\u0004\u0012\b\b\u0002\u00106\u001a\u00020\u0012\u0012\b\b\u0002\u00107\u001a\u00020\u0012\u0012\b\b\u0002\u00108\u001a\u00020\u0012\u0012\b\b\u0002\u00109\u001a\u00020\u0012\u0012\b\b\u0002\u0010:\u001a\u00020\b\u0012\b\b\u0002\u0010;\u001a\u00020\u0012\u0012\b\b\u0002\u0010<\u001a\u00020\u0012\u0012\b\b\u0002\u0010=\u001a\u00020\u0012\u0012\b\b\u0002\u0010>\u001a\u00020\u0012\u0012\b\b\u0002\u0010?\u001a\u00020\u0012\u0012\b\b\u0002\u0010@\u001a\u00020\u0012\u0012\b\b\u0002\u0010A\u001a\u00020\u0012\u0012\n\b\u0002\u0010B\u001a\u0004\u0018\u00010C\u0012\u000e\b\u0002\u0010D\u001a\b\u0012\u0004\u0012\u00020F0E\u0012\u000e\b\u0002\u0010G\u001a\b\u0012\u0004\u0012\u00020\u00040E\u0012\u000e\b\u0002\u0010H\u001a\b\u0012\u0004\u0012\u00020I0E\u0012\b\b\u0002\u0010J\u001a\u00020\u0004\u0012\b\b\u0002\u0010K\u001a\u00020\u0004¢\u0006\u0002\u0010LJ\n\u0010\u0001\u001a\u00020\u0004HÆ\u0003J\n\u0010\u0001\u001a\u00020\u0004HÆ\u0003J\n\u0010\u0001\u001a\u00020\u0012HÆ\u0003J\n\u0010\u0001\u001a\u00020\u0004HÆ\u0003J\n\u0010\u0001\u001a\u00020\u0015HÆ\u0003J\n\u0010\u0001\u001a\u00020\u0017HÆ\u0003J\n\u0010\u0001\u001a\u00020\u0019HÆ\u0003J\n\u0010\u0001\u001a\u00020\u0012HÆ\u0003J\n\u0010\u0001\u001a\u00020\u0012HÆ\u0003J\n\u0010\u0001\u001a\u00020\bHÆ\u0003J\n\u0010\u0001\u001a\u00020\u0012HÆ\u0003J\n\u0010\u0001\u001a\u00020\u0004HÆ\u0003J\n\u0010 \u0001\u001a\u00020\u0012HÆ\u0003J\n\u0010¡\u0001\u001a\u00020\u0012HÆ\u0003J\n\u0010¢\u0001\u001a\u00020\u0012HÆ\u0003J\n\u0010£\u0001\u001a\u00020\u0012HÆ\u0003J\n\u0010¤\u0001\u001a\u00020\u0012HÆ\u0003J\n\u0010¥\u0001\u001a\u00020\u0012HÆ\u0003J\n\u0010¦\u0001\u001a\u00020\u0012HÆ\u0003J\n\u0010§\u0001\u001a\u00020\u0012HÆ\u0003J\n\u0010¨\u0001\u001a\u00020\u0012HÆ\u0003J\n\u0010©\u0001\u001a\u00020(HÆ\u0003J\n\u0010ª\u0001\u001a\u00020\u0004HÆ\u0003J\n\u0010«\u0001\u001a\u00020*HÆ\u0003J\n\u0010¬\u0001\u001a\u00020\u0012HÆ\u0003J\n\u0010­\u0001\u001a\u00020\u0012HÆ\u0003J\n\u0010®\u0001\u001a\u00020\u0012HÆ\u0003J\n\u0010¯\u0001\u001a\u00020\u0012HÆ\u0003J\n\u0010°\u0001\u001a\u00020\u0012HÆ\u0003J\n\u0010±\u0001\u001a\u00020\u0012HÆ\u0003J\n\u0010²\u0001\u001a\u00020\u0004HÆ\u0003J\n\u0010³\u0001\u001a\u00020\u0004HÆ\u0003J\n\u0010´\u0001\u001a\u00020\u0004HÆ\u0003J\n\u0010µ\u0001\u001a\u00020\bHÆ\u0003J\n\u0010¶\u0001\u001a\u00020\u0004HÆ\u0003J\n\u0010·\u0001\u001a\u00020\u0004HÆ\u0003J\n\u0010¸\u0001\u001a\u00020\u0012HÆ\u0003J\n\u0010¹\u0001\u001a\u00020\u0012HÆ\u0003J\n\u0010º\u0001\u001a\u00020\u0012HÆ\u0003J\n\u0010»\u0001\u001a\u00020\u0012HÆ\u0003J\n\u0010¼\u0001\u001a\u00020\bHÆ\u0003J\n\u0010½\u0001\u001a\u00020\u0012HÆ\u0003J\n\u0010¾\u0001\u001a\u00020\u0012HÆ\u0003J\n\u0010¿\u0001\u001a\u00020\u0012HÆ\u0003J\n\u0010À\u0001\u001a\u00020\nHÆ\u0003J\n\u0010Á\u0001\u001a\u00020\u0012HÆ\u0003J\n\u0010Â\u0001\u001a\u00020\u0012HÆ\u0003J\n\u0010Ã\u0001\u001a\u00020\u0012HÆ\u0003J\n\u0010Ä\u0001\u001a\u00020\u0012HÆ\u0003J\f\u0010Å\u0001\u001a\u0004\u0018\u00010CHÆ\u0003J\u0010\u0010Æ\u0001\u001a\b\u0012\u0004\u0012\u00020F0EHÆ\u0003J\u0010\u0010Ç\u0001\u001a\b\u0012\u0004\u0012\u00020\u00040EHÆ\u0003J\u0010\u0010È\u0001\u001a\b\u0012\u0004\u0012\u00020I0EHÆ\u0003J\n\u0010É\u0001\u001a\u00020\u0004HÆ\u0003J\n\u0010Ê\u0001\u001a\u00020\u0004HÆ\u0003J\n\u0010Ë\u0001\u001a\u00020\fHÆ\u0003J\n\u0010Ì\u0001\u001a\u00020\fHÆ\u0003J\n\u0010Í\u0001\u001a\u00020\bHÆ\u0003J\n\u0010Î\u0001\u001a\u00020\u0004HÆ\u0003Jì\u0004\u0010Ï\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\b2\b\b\u0002\u0010\u000f\u001a\u00020\u00042\b\b\u0002\u0010\u0010\u001a\u00020\u00042\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00042\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u00122\b\b\u0002\u0010\u001b\u001a\u00020\u00122\b\b\u0002\u0010\u001c\u001a\u00020\b2\b\b\u0002\u0010\u001d\u001a\u00020\u00122\b\b\u0002\u0010\u001e\u001a\u00020\u00122\b\b\u0002\u0010\u001f\u001a\u00020\u00122\b\b\u0002\u0010 \u001a\u00020\u00122\b\b\u0002\u0010!\u001a\u00020\u00122\b\b\u0002\u0010\"\u001a\u00020\u00122\b\b\u0002\u0010#\u001a\u00020\u00122\b\b\u0002\u0010$\u001a\u00020\u00122\b\b\u0002\u0010%\u001a\u00020\u00122\b\b\u0002\u0010&\u001a\u00020\u00122\b\b\u0002\u0010'\u001a\u00020(2\b\b\u0002\u0010)\u001a\u00020*2\b\b\u0002\u0010+\u001a\u00020\u00122\b\b\u0002\u0010,\u001a\u00020\u00122\b\b\u0002\u0010-\u001a\u00020\u00122\b\b\u0002\u0010.\u001a\u00020\u00122\b\b\u0002\u0010/\u001a\u00020\u00122\b\b\u0002\u00100\u001a\u00020\u00122\b\b\u0002\u00101\u001a\u00020\u00042\b\b\u0002\u00102\u001a\u00020\u00042\b\b\u0002\u00103\u001a\u00020\u00042\b\b\u0002\u00104\u001a\u00020\u00042\b\b\u0002\u00105\u001a\u00020\u00042\b\b\u0002\u00106\u001a\u00020\u00122\b\b\u0002\u00107\u001a\u00020\u00122\b\b\u0002\u00108\u001a\u00020\u00122\b\b\u0002\u00109\u001a\u00020\u00122\b\b\u0002\u0010:\u001a\u00020\b2\b\b\u0002\u0010;\u001a\u00020\u00122\b\b\u0002\u0010<\u001a\u00020\u00122\b\b\u0002\u0010=\u001a\u00020\u00122\b\b\u0002\u0010>\u001a\u00020\u00122\b\b\u0002\u0010?\u001a\u00020\u00122\b\b\u0002\u0010@\u001a\u00020\u00122\b\b\u0002\u0010A\u001a\u00020\u00122\n\b\u0002\u0010B\u001a\u0004\u0018\u00010C2\u000e\b\u0002\u0010D\u001a\b\u0012\u0004\u0012\u00020F0E2\u000e\b\u0002\u0010G\u001a\b\u0012\u0004\u0012\u00020\u00040E2\u000e\b\u0002\u0010H\u001a\b\u0012\u0004\u0012\u00020I0E2\b\b\u0002\u0010J\u001a\u00020\u00042\b\b\u0002\u0010K\u001a\u00020\u0004HÆ\u0001J\u0016\u0010Ð\u0001\u001a\u00030Ñ\u00012\t\u0010Ò\u0001\u001a\u0004\u0018\u00010\u0001H\u0002J\t\u0010Ó\u0001\u001a\u00020\bH\u0016J\t\u0010Ô\u0001\u001a\u00020\fH\u0016R\u0016\u0010\u001d\u001a\u00020\u00128\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\bM\u0010NR\u0016\u0010\u001e\u001a\u00020\u00128\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\bO\u0010NR\u0016\u0010+\u001a\u00020\u00128\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\bP\u0010NR\u0016\u0010,\u001a\u00020\u00128\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\bQ\u0010NR\u0016\u0010;\u001a\u00020\u00128\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\bR\u0010NR\u0016\u0010<\u001a\u00020\u00128\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\bS\u0010NR\u0016\u00103\u001a\u00020\u00048\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\bT\u0010UR\u0016\u0010#\u001a\u00020\u00128\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\bV\u0010NR\u0016\u0010$\u001a\u00020\u00128\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\bW\u0010NR\u0016\u0010)\u001a\u00020*8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\bX\u0010YR\u0016\u0010%\u001a\u00020\u00128\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\bZ\u0010NR\u0016\u0010!\u001a\u00020\u00128\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b[\u0010NR\u0016\u0010\"\u001a\u00020\u00128\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\\\u0010NR\u0016\u0010\u001a\u001a\u00020\u00128\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b]\u0010NR\u0016\u0010\u001b\u001a\u00020\u00128\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b^\u0010NR\u0016\u00101\u001a\u00020\u00048\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b_\u0010UR\u0016\u0010A\u001a\u00020\u00128\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b`\u0010NR\u0016\u0010@\u001a\u00020\u00128\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\ba\u0010NR\u0016\u00108\u001a\u00020\u00128\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\bb\u0010NR\u0016\u00109\u001a\u00020\u00128\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\bc\u0010NR\u0016\u0010:\u001a\u00020\b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\bd\u0010eR\u0018\u0010B\u001a\u0004\u0018\u00010C8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\bf\u0010gR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\bh\u0010UR\u0016\u0010J\u001a\u00020\u00048\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\bi\u0010UR\u0016\u0010\u000e\u001a\u00020\b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\bj\u0010eR\u0016\u0010\u0014\u001a\u00020\u00158\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\bk\u0010lR\u0016\u0010\u000f\u001a\u00020\u00048\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\bm\u0010UR\u0016\u0010\u000b\u001a\u00020\f8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\bn\u0010oR\u0016\u0010\u0010\u001a\u00020\u00048\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\bp\u0010UR\u0016\u0010\u0011\u001a\u00020\u00128\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\bq\u0010NR\u0016\u0010\u0013\u001a\u00020\u00048\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\br\u0010UR\u0016\u0010\t\u001a\u00020\n8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\bs\u0010tR\u0016\u0010\r\u001a\u00020\f8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\bu\u0010oR\u001c\u0010H\u001a\b\u0012\u0004\u0012\u00020I0E8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\bv\u0010wR\u0016\u0010K\u001a\u00020\u00048\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\bx\u0010UR\u0016\u0010\u001c\u001a\u00020\b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\by\u0010eR\u0016\u0010=\u001a\u00020\u00128\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\bz\u0010NR\u0016\u0010>\u001a\u00020\u00128\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b{\u0010NR\u0016\u0010?\u001a\u00020\u00128\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b|\u0010NR\u0016\u0010'\u001a\u00020(8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b}\u0010~R\u0016\u0010&\u001a\u00020\u00128\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010NR\u001d\u0010D\u001a\b\u0012\u0004\u0012\u00020F0E8\u0006X\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0001\u0010wR\u001d\u0010G\u001a\b\u0012\u0004\u0012\u00020\u00040E8\u0006X\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0001\u0010wR\u0017\u0010/\u001a\u00020\u00128\u0006X\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0001\u0010NR\u0017\u00100\u001a\u00020\u00128\u0006X\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0001\u0010NR\u0017\u0010\u001f\u001a\u00020\u00128\u0006X\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0001\u0010NR\u0017\u0010 \u001a\u00020\u00128\u0006X\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0001\u0010NR\u0017\u0010-\u001a\u00020\u00128\u0006X\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0001\u0010NR\u0017\u0010.\u001a\u00020\u00128\u0006X\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0001\u0010NR\u0018\u0010\u0016\u001a\u00020\u00178\u0006X\u0004¢\u0006\n\n\u0000\u001a\u0006\b\u0001\u0010\u0001R\u0017\u00104\u001a\u00020\u00048\u0006X\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0001\u0010UR\u0017\u00106\u001a\u00020\u00128\u0006X\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0001\u0010NR\u0017\u00107\u001a\u00020\u00128\u0006X\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0001\u0010NR\u0017\u00105\u001a\u00020\u00048\u0006X\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0001\u0010UR\u0018\u0010\u0018\u001a\u00020\u00198\u0006X\u0004¢\u0006\n\n\u0000\u001a\u0006\b\u0001\u0010\u0001R\u0017\u00102\u001a\u00020\u00048\u0006X\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0001\u0010UR\u0017\u0010\u0006\u001a\u00020\u00048\u0006X\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0001\u0010UR\u0017\u0010\u0007\u001a\u00020\b8\u0006X\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0001\u0010eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006X\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0001\u0010U¨\u0006Ø\u0001"}, bng = {"Lcom/iqoption/core/microservices/tradingengine/response/position/TradingPosition;", "", "()V", "id", "", "userId", "userBalanceId", "userBalanceType", "", "instrumentType", "Lcom/iqoption/core/data/model/InstrumentType;", "instrumentId", "", "instrumentUnderlying", "instrumentActiveId", "instrumentExpiration", "instrumentPeriod", "instrumentStrike", "", "instrumentStrikeValue", "instrumentDir", "Lcom/iqoption/core/data/model/Direction;", "status", "Lcom/iqoption/core/microservices/tradingengine/response/position/TradingPosition$Status;", "type", "Lcom/iqoption/core/microservices/tradingengine/response/position/TradingPosition$Type;", "count", "countRealized", "leverage", "buyAmount", "buyAmountEnrolled", "sellAmount", "sellAmountEnrolled", "commission", "commissionEnrolled", "closeEffectAmount", "closeEffectAmountEnrolled", "closeUnderlyingPrice", "openUnderlyingPrice", "openClientPlatform", "Lcom/iqoption/core/Platform;", "closeReason", "Lcom/iqoption/core/microservices/tradingengine/response/position/CloseReason;", "buyAvgPrice", "buyAvgPriceEnrolled", "sellAvgPrice", "sellAvgPriceEnrolled", "pnlRealized", "pnlRealizedEnrolled", "createAt", "updateAt", "closeAt", "stopLoseOrderId", "takeProfitOrderId", "swap", "swapEnrolled", "custodial", "custodialEnrolled", "custodialLastAge", "charge", "chargeEnrolled", "margin", "marginCall", "marginCallEnrolled", "currencyUnit", "currencyRate", "extraData", "Lcom/iqoption/core/microservices/tradingengine/response/position/ExtraData;", "orders", "", "Lcom/iqoption/core/microservices/tradingengine/response/order/TradingOrder;", "ordersIds", "items", "Lcom/iqoption/core/microservices/tradingengine/response/position/MultiPositionItem;", "index", "lastIndex", "(JJJILcom/iqoption/core/data/model/InstrumentType;Ljava/lang/String;Ljava/lang/String;IJJDJLcom/iqoption/core/data/model/Direction;Lcom/iqoption/core/microservices/tradingengine/response/position/TradingPosition$Status;Lcom/iqoption/core/microservices/tradingengine/response/position/TradingPosition$Type;DDIDDDDDDDDDDLcom/iqoption/core/Platform;Lcom/iqoption/core/microservices/tradingengine/response/position/CloseReason;DDDDDDJJJJJDDDDIDDDDDDDLcom/iqoption/core/microservices/tradingengine/response/position/ExtraData;Ljava/util/List;Ljava/util/List;Ljava/util/List;JJ)V", "getBuyAmount", "()D", "getBuyAmountEnrolled", "getBuyAvgPrice", "getBuyAvgPriceEnrolled", "getCharge", "getChargeEnrolled", "getCloseAt", "()J", "getCloseEffectAmount", "getCloseEffectAmountEnrolled", "getCloseReason", "()Lcom/iqoption/core/microservices/tradingengine/response/position/CloseReason;", "getCloseUnderlyingPrice", "getCommission", "getCommissionEnrolled", "getCount", "getCountRealized", "getCreateAt", "getCurrencyRate", "getCurrencyUnit", "getCustodial", "getCustodialEnrolled", "getCustodialLastAge", "()I", "getExtraData", "()Lcom/iqoption/core/microservices/tradingengine/response/position/ExtraData;", "getId", "getIndex", "getInstrumentActiveId", "getInstrumentDir", "()Lcom/iqoption/core/data/model/Direction;", "getInstrumentExpiration", "getInstrumentId", "()Ljava/lang/String;", "getInstrumentPeriod", "getInstrumentStrike", "getInstrumentStrikeValue", "getInstrumentType", "()Lcom/iqoption/core/data/model/InstrumentType;", "getInstrumentUnderlying", "getItems", "()Ljava/util/List;", "getLastIndex", "getLeverage", "getMargin", "getMarginCall", "getMarginCallEnrolled", "getOpenClientPlatform", "()Lcom/iqoption/core/Platform;", "getOpenUnderlyingPrice", "getOrders", "getOrdersIds", "getPnlRealized", "getPnlRealizedEnrolled", "getSellAmount", "getSellAmountEnrolled", "getSellAvgPrice", "getSellAvgPriceEnrolled", "getStatus", "()Lcom/iqoption/core/microservices/tradingengine/response/position/TradingPosition$Status;", "getStopLoseOrderId", "getSwap", "getSwapEnrolled", "getTakeProfitOrderId", "getType", "()Lcom/iqoption/core/microservices/tradingengine/response/position/TradingPosition$Type;", "getUpdateAt", "getUserBalanceId", "getUserBalanceType", "getUserId", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "component39", "component4", "component40", "component41", "component42", "component43", "component44", "component45", "component46", "component47", "component48", "component49", "component5", "component50", "component51", "component52", "component53", "component54", "component55", "component56", "component57", "component58", "component59", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "Companion", "Status", "Type", "core_release"})
/* compiled from: TradingPosition.kt */
public final class TradingPosition {
    public static final a bCQ = new a();
    @SerializedName("margin")
    private final double aui;
    @SerializedName("instrument_underlying")
    private final String bBA;
    @SerializedName("instrument_active_id")
    private final int bBB;
    @SerializedName("instrument_expiration")
    private final long bBC;
    @SerializedName("instrument_strike")
    private final double bBD;
    @SerializedName("instrument_strike_value")
    private final long bBE;
    @SerializedName("instrument_dir")
    private final Direction bBF;
    @SerializedName("orders")
    private final List<TradingOrder> bBq;
    @SerializedName("user_balance_type")
    private final int bBr;
    @SerializedName("create_at")
    private final long bBt;
    @SerializedName("update_at")
    private final long bBu;
    @SerializedName("count")
    private final double bBx;
    @SerializedName("stop_lose_order_id")
    private final long bCA;
    @SerializedName("take_profit_order_id")
    private final long bCB;
    @SerializedName("swap")
    private final double bCC;
    @SerializedName("swap_enrolled")
    private final double bCD;
    @SerializedName("custodial")
    private final double bCE;
    @SerializedName("custodial_enrolled")
    private final double bCF;
    @SerializedName("custodial_last_age")
    private final int bCG;
    @SerializedName("charge")
    private final double bCH;
    @SerializedName("charge_enrolled")
    private final double bCI;
    @SerializedName("margin_call")
    private final double bCJ;
    @SerializedName("margin_call_enrolled")
    private final double bCK;
    @SerializedName("currency_unit")
    private final double bCL;
    @SerializedName("currency_rate")
    private final double bCM;
    @SerializedName("extra_data")
    private final a bCN;
    @SerializedName("order_ids")
    private final List<Long> bCO;
    @SerializedName("last_index")
    private final long bCP;
    @SerializedName("close_underlying_price")
    private final double bCc;
    @SerializedName("open_underlying_price")
    private final double bCd;
    @SerializedName("buy_avg_price")
    private final double bCe;
    @SerializedName("buy_avg_price_enrolled")
    private final double bCf;
    @SerializedName("sell_avg_price")
    private final double bCg;
    @SerializedName("instrument_period")
    private final long bCj;
    @SerializedName("status")
    private final Status bCk;
    @SerializedName("type")
    private final Type bCl;
    @SerializedName("count_realized")
    private final double bCm;
    @SerializedName("buy_amount")
    private final double bCn;
    @SerializedName("buy_amount_enrolled")
    private final double bCo;
    @SerializedName("sell_amount")
    private final double bCp;
    @SerializedName("sell_amount_enrolled")
    private final double bCq;
    @SerializedName("commission")
    private final double bCr;
    @SerializedName("commission_enrolled")
    private final double bCs;
    @SerializedName("close_effect_amount")
    private final double bCt;
    @SerializedName("close_effect_amount_enrolled")
    private final double bCu;
    @SerializedName("open_client_platform_id")
    private final Platform bCv;
    @SerializedName("sell_avg_price_enrolled")
    private final double bCw;
    @SerializedName("pnl_realized")
    private final double bCx;
    @SerializedName("pnl_realized_enrolled")
    private final double bCy;
    @SerializedName("close_at")
    private final long bCz;
    @SerializedName("user_balance_id")
    private final long bwR;
    @SerializedName("close_reason")
    private final CloseReason bxb;
    @SerializedName("items")
    private final List<MultiPositionItem> iA;
    @SerializedName("id")
    private final long id;
    @SerializedName("index")
    private final long index;
    @SerializedName("instrument_id")
    private final String instrumentId;
    @SerializedName("instrument_type")
    private final InstrumentType instrumentType;
    @SerializedName("leverage")
    private final int leverage;
    @SerializedName("user_id")
    private final long userId;

    @JsonAdapter(nullSafe = false, value = b.class)
    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002\n\u000bB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\f"}, bng = {"Lcom/iqoption/core/microservices/tradingengine/response/position/TradingPosition$Status;", "", "serverValue", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getServerValue", "()Ljava/lang/String;", "UNKNOWN", "OPEN", "CLOSED", "Companion", "JsonAdapter", "core_release"})
    /* compiled from: TradingPosition.kt */
    public enum Status {
        UNKNOWN("_unknown"),
        OPEN(Position.STATUS_OPEN),
        CLOSED(Position.STATUS_CLOSED);
        
        public static final a Companion = null;
        private final String serverValue;

        @i(bne = {1, 1, 15}, bnf = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007¨\u0006\u0007"}, bng = {"Lcom/iqoption/core/microservices/tradingengine/response/position/TradingPosition$Status$Companion;", "", "()V", "fromServerValue", "Lcom/iqoption/core/microservices/tradingengine/response/position/TradingPosition$Status;", "value", "", "core_release"})
        /* compiled from: TradingPosition.kt */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(f fVar) {
                this();
            }

            public final Status fromServerValue(String str) {
                if (str == null) {
                    return Status.UNKNOWN;
                }
                Enum enumR = Status.UNKNOWN;
                for (Status status : Status.values()) {
                    if (kotlin.jvm.internal.i.y(status.getServerValue(), str)) {
                        break;
                    }
                }
                Status status2 = null;
                Enum enumR2 = status2;
                if (enumR2 == null) {
                    enumR2 = enumR;
                }
                return (Status) enumR2;
            }
        }

        @i(bne = {1, 1, 15}, bnf = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001a\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\f"}, bng = {"Lcom/iqoption/core/microservices/tradingengine/response/position/TradingPosition$Status$JsonAdapter;", "Lcom/google/gson/TypeAdapter;", "Lcom/iqoption/core/microservices/tradingengine/response/position/TradingPosition$Status;", "()V", "read", "reader", "Lcom/google/gson/stream/JsonReader;", "write", "", "out", "Lcom/google/gson/stream/JsonWriter;", "value", "core_release"})
        /* compiled from: TradingPosition.kt */
        public static final class b extends TypeAdapter<Status> {
            /* renamed from: a */
            public void write(JsonWriter jsonWriter, Status status) {
                kotlin.jvm.internal.i.f(jsonWriter, "out");
                if (status == null) {
                    jsonWriter.nullValue();
                } else {
                    jsonWriter.value(status.getServerValue());
                }
            }

            /* renamed from: ae */
            public Status read(JsonReader jsonReader) {
                kotlin.jvm.internal.i.f(jsonReader, "reader");
                if (jsonReader.peek() != JsonToken.NULL) {
                    return Status.Companion.fromServerValue(jsonReader.nextString());
                }
                jsonReader.skipValue();
                return Status.UNKNOWN;
            }
        }

        public static final Status fromServerValue(String str) {
            return Companion.fromServerValue(str);
        }

        private Status(String str) {
            this.serverValue = str;
        }

        public final String getServerValue() {
            return this.serverValue;
        }

        static {
            Companion = new a();
        }
    }

    @JsonAdapter(nullSafe = false, value = b.class)
    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002\n\u000bB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\f"}, bng = {"Lcom/iqoption/core/microservices/tradingengine/response/position/TradingPosition$Type;", "", "serverValue", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getServerValue", "()Ljava/lang/String;", "UNKNOWN", "LONG", "SHORT", "Companion", "JsonAdapter", "core_release"})
    /* compiled from: TradingPosition.kt */
    public enum Type {
        UNKNOWN("_unknown"),
        LONG(Position.TYPE_LONG),
        SHORT(Position.TYPE_SHORT);
        
        public static final a Companion = null;
        private final String serverValue;

        @i(bne = {1, 1, 15}, bnf = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007¨\u0006\u0007"}, bng = {"Lcom/iqoption/core/microservices/tradingengine/response/position/TradingPosition$Type$Companion;", "", "()V", "fromServerValue", "Lcom/iqoption/core/microservices/tradingengine/response/position/TradingPosition$Type;", "value", "", "core_release"})
        /* compiled from: TradingPosition.kt */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(f fVar) {
                this();
            }

            public final Type fromServerValue(String str) {
                if (str == null) {
                    return Type.UNKNOWN;
                }
                Enum enumR = Type.UNKNOWN;
                for (Type type : Type.values()) {
                    if (kotlin.jvm.internal.i.y(type.getServerValue(), str)) {
                        break;
                    }
                }
                Type type2 = null;
                Enum enumR2 = type2;
                if (enumR2 == null) {
                    enumR2 = enumR;
                }
                return (Type) enumR2;
            }
        }

        @i(bne = {1, 1, 15}, bnf = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001a\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\f"}, bng = {"Lcom/iqoption/core/microservices/tradingengine/response/position/TradingPosition$Type$JsonAdapter;", "Lcom/google/gson/TypeAdapter;", "Lcom/iqoption/core/microservices/tradingengine/response/position/TradingPosition$Type;", "()V", "read", "reader", "Lcom/google/gson/stream/JsonReader;", "write", "", "out", "Lcom/google/gson/stream/JsonWriter;", "value", "core_release"})
        /* compiled from: TradingPosition.kt */
        public static final class b extends TypeAdapter<Type> {
            /* renamed from: a */
            public void write(JsonWriter jsonWriter, Type type) {
                kotlin.jvm.internal.i.f(jsonWriter, "out");
                if (type == null) {
                    jsonWriter.nullValue();
                } else {
                    jsonWriter.value(type.getServerValue());
                }
            }

            /* renamed from: af */
            public Type read(JsonReader jsonReader) {
                kotlin.jvm.internal.i.f(jsonReader, "reader");
                if (jsonReader.peek() != JsonToken.NULL) {
                    return Type.Companion.fromServerValue(jsonReader.nextString());
                }
                jsonReader.skipValue();
                return Type.UNKNOWN;
            }
        }

        public static final Type fromServerValue(String str) {
            return Companion.fromServerValue(str);
        }

        private Type(String str) {
            this.serverValue = str;
        }

        public final String getServerValue() {
            return this.serverValue;
        }

        static {
            Companion = new a();
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, bng = {"Lcom/iqoption/core/microservices/tradingengine/response/position/TradingPosition$Companion;", "", "()V", "MAX_STOP_LOSS", "", "core_release"})
    /* compiled from: TradingPosition.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }
    }

    public TradingPosition(long j, long j2, long j3, int i, InstrumentType instrumentType, String str, String str2, int i2, long j4, long j5, double d, long j6, Direction direction, Status status, Type type, double d2, double d3, int i3, double d4, double d5, double d6, double d7, double d8, double d9, double d10, double d11, double d12, double d13, Platform platform, CloseReason closeReason, double d14, double d15, double d16, double d17, double d18, double d19, long j7, long j8, long j9, long j10, long j11, double d20, double d21, double d22, double d23, int i4, double d24, double d25, double d26, double d27, double d28, double d29, double d30, a aVar, List<TradingOrder> list, List<Long> list2, List<MultiPositionItem> list3, long j12, long j13) {
        InstrumentType instrumentType2 = instrumentType;
        String str3 = str;
        String str4 = str2;
        Direction direction2 = direction;
        Status status2 = status;
        Type type2 = type;
        Platform platform2 = platform;
        CloseReason closeReason2 = closeReason;
        List<TradingOrder> list4 = list;
        List<Long> list5 = list2;
        List<MultiPositionItem> list6 = list3;
        kotlin.jvm.internal.i.f(instrumentType2, "instrumentType");
        kotlin.jvm.internal.i.f(str3, "instrumentId");
        kotlin.jvm.internal.i.f(str4, "instrumentUnderlying");
        kotlin.jvm.internal.i.f(direction2, "instrumentDir");
        kotlin.jvm.internal.i.f(status2, NotificationCompat.CATEGORY_STATUS);
        kotlin.jvm.internal.i.f(type2, "type");
        kotlin.jvm.internal.i.f(platform2, "openClientPlatform");
        kotlin.jvm.internal.i.f(closeReason2, "closeReason");
        kotlin.jvm.internal.i.f(list4, "orders");
        kotlin.jvm.internal.i.f(list5, "ordersIds");
        kotlin.jvm.internal.i.f(list6, "items");
        this.id = j;
        this.userId = j2;
        this.bwR = j3;
        this.bBr = i;
        this.instrumentType = instrumentType2;
        this.instrumentId = str3;
        this.bBA = str4;
        this.bBB = i2;
        this.bBC = j4;
        this.bCj = j5;
        this.bBD = d;
        this.bBE = j6;
        this.bBF = direction2;
        this.bCk = status2;
        this.bCl = type2;
        this.bBx = d2;
        this.bCm = d3;
        this.leverage = i3;
        this.bCn = d4;
        this.bCo = d5;
        this.bCp = d6;
        this.bCq = d7;
        this.bCr = d8;
        this.bCs = d9;
        this.bCt = d10;
        this.bCu = d11;
        this.bCc = d12;
        this.bCd = d13;
        this.bCv = platform2;
        this.bxb = closeReason2;
        this.bCe = d14;
        this.bCf = d15;
        this.bCg = d16;
        this.bCw = d17;
        this.bCx = d18;
        this.bCy = d19;
        this.bBt = j7;
        this.bBu = j8;
        this.bCz = j9;
        this.bCA = j10;
        this.bCB = j11;
        this.bCC = d20;
        this.bCD = d21;
        this.bCE = d22;
        this.bCF = d23;
        this.bCG = i4;
        this.bCH = d24;
        this.bCI = d25;
        this.aui = d26;
        this.bCJ = d27;
        this.bCK = d28;
        this.bCL = d29;
        this.bCM = d30;
        this.bCN = aVar;
        this.bBq = list4;
        this.bCO = list5;
        this.iA = list6;
        this.index = j12;
        this.bCP = j13;
    }

    public final long getId() {
        return this.id;
    }

    public /* synthetic */ TradingPosition(long j, long j2, long j3, int i, InstrumentType instrumentType, String str, String str2, int i2, long j4, long j5, double d, long j6, Direction direction, Status status, Type type, double d2, double d3, int i3, double d4, double d5, double d6, double d7, double d8, double d9, double d10, double d11, double d12, double d13, Platform platform, CloseReason closeReason, double d14, double d15, double d16, double d17, double d18, double d19, long j7, long j8, long j9, long j10, long j11, double d20, double d21, double d22, double d23, int i4, double d24, double d25, double d26, double d27, double d28, double d29, double d30, a aVar, List list, List list2, List list3, long j12, long j13, int i5, int i6, f fVar) {
        Type type2;
        CloseReason closeReason2;
        int i7 = i5;
        int i8 = i6;
        long j14 = (i7 & 1) != 0 ? -1 : j;
        long j15 = (i7 & 2) != 0 ? -1 : j2;
        long j16 = (i7 & 4) != 0 ? -1 : j3;
        int i9 = (i7 & 8) != 0 ? 0 : i;
        InstrumentType instrumentType2 = (i7 & 16) != 0 ? InstrumentType.UNKNOWN : instrumentType;
        String str3 = "";
        String str4 = (i7 & 32) != 0 ? str3 : str;
        if ((i7 & 64) == 0) {
            str3 = str2;
        }
        int i10 = (i7 & 128) != 0 ? -1 : i2;
        long j17 = 0;
        long j18 = (i7 & 256) != 0 ? 0 : j4;
        long j19 = (i7 & 512) != 0 ? 0 : j5;
        double d31 = 0.0d;
        double d32 = (i7 & 1024) != 0 ? 0.0d : d;
        long j20 = (i7 & 2048) != 0 ? 0 : j6;
        Direction direction2 = (i7 & 4096) != 0 ? Direction.UNKNOWN : direction;
        Status status2 = (i7 & 8192) != 0 ? Status.UNKNOWN : status;
        if ((i7 & 16384) != 0) {
            type2 = Type.UNKNOWN;
        } else {
            type2 = type;
        }
        double d33 = (i7 & 32768) != 0 ? 0.0d : d2;
        double d34 = (i7 & 65536) != 0 ? 0.0d : d3;
        int i11 = (i7 & 131072) != 0 ? 1 : i3;
        double d35 = (i7 & 262144) != 0 ? 0.0d : d4;
        double d36 = (i7 & 524288) != 0 ? 0.0d : d5;
        double d37 = (i7 & 1048576) != 0 ? 0.0d : d6;
        double d38 = (i7 & 2097152) != 0 ? 0.0d : d7;
        double d39 = (i7 & 4194304) != 0 ? 0.0d : d8;
        double d40 = (i7 & 8388608) != 0 ? 0.0d : d9;
        double d41 = (i7 & 16777216) != 0 ? 0.0d : d10;
        double d42 = (i7 & 33554432) != 0 ? 0.0d : d11;
        double d43 = (i7 & 67108864) != 0 ? 0.0d : d12;
        double d44 = (i7 & 134217728) != 0 ? 0.0d : d13;
        Platform platform2 = (i7 & 268435456) != 0 ? Platform.UNKNOWN : platform;
        if ((i7 & 536870912) != 0) {
            closeReason2 = CloseReason.UNKNOWN;
        } else {
            closeReason2 = closeReason;
        }
        double d45 = (i7 & 1073741824) != 0 ? 0.0d : d14;
        double d46 = (i7 & Integer.MIN_VALUE) != 0 ? 0.0d : d15;
        double d47 = (i8 & 1) != 0 ? 0.0d : d16;
        double d48 = (i8 & 2) != 0 ? 0.0d : d17;
        double d49 = (i8 & 4) != 0 ? 0.0d : d18;
        double d50 = (i8 & 8) != 0 ? 0.0d : d19;
        long j21 = (i8 & 16) != 0 ? 0 : j7;
        long j22 = (i8 & 32) != 0 ? 0 : j8;
        long j23 = (i8 & 64) != 0 ? 0 : j9;
        long j24 = (i8 & 128) != 0 ? -1 : j10;
        long j25 = (i8 & 256) != 0 ? -1 : j11;
        double d51 = (i8 & 512) != 0 ? 0.0d : d20;
        double d52 = (i8 & 1024) != 0 ? 0.0d : d21;
        double d53 = (i8 & 2048) != 0 ? 0.0d : d22;
        double d54 = (i8 & 4096) != 0 ? 0.0d : d23;
        i5 = (i8 & 8192) != 0 ? 0 : i4;
        double d55 = (i8 & 16384) != 0 ? 0.0d : d24;
        double d56 = (32768 & i8) != 0 ? 0.0d : d25;
        double d57 = (65536 & i8) != 0 ? 0.0d : d26;
        double d58 = (131072 & i8) != 0 ? 0.0d : d27;
        if ((262144 & i8) == 0) {
            d31 = d28;
        }
        double d59 = (524288 & i8) != 0 ? 1.0d : d29;
        double d60 = (1048576 & i8) != 0 ? 1.0d : d30;
        a aVar2 = (2097152 & i8) != 0 ? (a) null : aVar;
        List emptyList = (i8 & 4194304) != 0 ? m.emptyList() : list;
        List emptyList2 = (i8 & 8388608) != 0 ? m.emptyList() : list2;
        List emptyList3 = (i8 & 16777216) != 0 ? m.emptyList() : list3;
        long j26 = (i8 & 33554432) != 0 ? 0 : j12;
        if ((i8 & 67108864) == 0) {
            j17 = j13;
        }
        this(j14, j15, j16, i9, instrumentType2, str4, str3, i10, j18, j19, d32, j20, direction2, status2, type2, d33, d34, i11, d35, d36, d37, d38, d39, d40, d41, d42, d43, d44, platform2, closeReason2, d45, d46, d47, d48, d49, d50, j21, j22, j23, j24, j25, d51, d52, d53, d54, i5, d55, d56, d57, d58, d31, d59, d60, aVar2, emptyList, emptyList2, emptyList3, j26, j17);
    }

    public final InstrumentType getInstrumentType() {
        return this.instrumentType;
    }

    public final Direction aiP() {
        return this.bBF;
    }

    public final Status aiQ() {
        return this.bCk;
    }

    public final Type aiR() {
        return this.bCl;
    }

    public final int getLeverage() {
        return this.leverage;
    }

    public final long aiS() {
        return this.bCA;
    }

    public final long aiT() {
        return this.bCB;
    }

    public final double aiU() {
        return this.bCC;
    }

    public final double getCustodial() {
        return this.bCE;
    }

    public final double aiV() {
        return this.bCH;
    }

    public final List<TradingOrder> getOrders() {
        return this.bBq;
    }

    public final List<MultiPositionItem> getItems() {
        return this.iA;
    }

    public final long getIndex() {
        return this.index;
    }

    public final long aiW() {
        return this.bCP;
    }

    public TradingPosition() {
        this(-1, 0, 0, 0, null, null, null, 0, 0, 0, 0.0d, 0, null, null, null, 0.0d, 0.0d, 0, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, null, null, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0, 0, 0, 0, 0, 0.0d, 0.0d, 0.0d, 0.0d, 0, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, null, null, null, null, 0, 0, -2, 134217727, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((kotlin.jvm.internal.i.y(getClass(), obj != null ? obj.getClass() : null) ^ 1) != 0) {
            return false;
        }
        if (obj != null) {
            TradingPosition tradingPosition = (TradingPosition) obj;
            if (this.id == tradingPosition.id && this.userId == tradingPosition.userId && this.bwR == tradingPosition.bwR && this.bBr == tradingPosition.bBr && this.instrumentType == tradingPosition.instrumentType && (kotlin.jvm.internal.i.y(this.instrumentId, tradingPosition.instrumentId) ^ 1) == 0 && (kotlin.jvm.internal.i.y(this.bBA, tradingPosition.bBA) ^ 1) == 0 && this.bBB == tradingPosition.bBB && this.bBC == tradingPosition.bBC && this.bCj == tradingPosition.bCj && this.bBD == tradingPosition.bBD && this.bBE == tradingPosition.bBE && this.bBF == tradingPosition.bBF && this.bCk == tradingPosition.bCk && this.bCl == tradingPosition.bCl && this.bBx == tradingPosition.bBx && this.bCm == tradingPosition.bCm && this.leverage == tradingPosition.leverage && this.bCn == tradingPosition.bCn && this.bCo == tradingPosition.bCo && this.bCp == tradingPosition.bCp && this.bCq == tradingPosition.bCq && this.bCr == tradingPosition.bCr && this.bCs == tradingPosition.bCs && this.bCt == tradingPosition.bCt && this.bCu == tradingPosition.bCu && this.bCc == tradingPosition.bCc && this.bCd == tradingPosition.bCd && this.bCv == tradingPosition.bCv && this.bxb == tradingPosition.bxb && this.bCe == tradingPosition.bCe && this.bCf == tradingPosition.bCf && this.bCg == tradingPosition.bCg && this.bCw == tradingPosition.bCw && this.bCx == tradingPosition.bCx && this.bCy == tradingPosition.bCy && this.bBt == tradingPosition.bBt && this.bBu == tradingPosition.bBu && this.bCz == tradingPosition.bCz && this.bCA == tradingPosition.bCA && this.bCB == tradingPosition.bCB && this.bCC == tradingPosition.bCC && this.bCD == tradingPosition.bCD && this.bCH == tradingPosition.bCH && this.bCI == tradingPosition.bCI && this.aui == tradingPosition.aui && this.bCJ == tradingPosition.bCJ && this.bCK == tradingPosition.bCK && this.bCL == tradingPosition.bCL && this.bCM == tradingPosition.bCM && (kotlin.jvm.internal.i.y(this.bCN, tradingPosition.bCN) ^ 1) == 0 && (kotlin.jvm.internal.i.y(this.bBq, tradingPosition.bBq) ^ 1) == 0 && (kotlin.jvm.internal.i.y(this.bCO, tradingPosition.bCO) ^ 1) == 0 && (kotlin.jvm.internal.i.y(this.iA, tradingPosition.iA) ^ 1) == 0) {
                return true;
            }
            return false;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.iqoption.core.microservices.tradingengine.response.position.TradingPosition");
    }

    public int hashCode() {
        int hashCode = ((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((Long.valueOf(this.id).hashCode() * 31) + Long.valueOf(this.userId).hashCode()) * 31) + Long.valueOf(this.bwR).hashCode()) * 31) + this.bBr) * 31) + this.instrumentType.hashCode()) * 31) + this.instrumentId.hashCode()) * 31) + this.bBA.hashCode()) * 31) + this.bBB) * 31) + Long.valueOf(this.bBC).hashCode()) * 31) + Long.valueOf(this.bCj).hashCode()) * 31) + Double.valueOf(this.bBD).hashCode()) * 31) + Long.valueOf(this.bBE).hashCode()) * 31) + this.bBF.hashCode()) * 31) + this.bCk.hashCode()) * 31) + this.bCl.hashCode()) * 31) + Double.valueOf(this.bBx).hashCode()) * 31) + Double.valueOf(this.bCm).hashCode()) * 31) + this.leverage) * 31) + Double.valueOf(this.bCn).hashCode()) * 31) + Double.valueOf(this.bCo).hashCode()) * 31) + Double.valueOf(this.bCp).hashCode()) * 31) + Double.valueOf(this.bCq).hashCode()) * 31) + Double.valueOf(this.bCr).hashCode()) * 31) + Double.valueOf(this.bCs).hashCode()) * 31) + Double.valueOf(this.bCt).hashCode()) * 31) + Double.valueOf(this.bCu).hashCode()) * 31) + Double.valueOf(this.bCc).hashCode()) * 31) + Double.valueOf(this.bCd).hashCode()) * 31) + this.bCv.hashCode()) * 31) + this.bxb.hashCode()) * 31) + Double.valueOf(this.bCe).hashCode()) * 31) + Double.valueOf(this.bCf).hashCode()) * 31) + Double.valueOf(this.bCg).hashCode()) * 31) + Double.valueOf(this.bCw).hashCode()) * 31) + Double.valueOf(this.bCx).hashCode()) * 31) + Double.valueOf(this.bCy).hashCode()) * 31) + Long.valueOf(this.bBt).hashCode()) * 31) + Long.valueOf(this.bBu).hashCode()) * 31) + Long.valueOf(this.bCz).hashCode()) * 31) + Long.valueOf(this.bCA).hashCode()) * 31) + Long.valueOf(this.bCB).hashCode()) * 31) + Double.valueOf(this.bCC).hashCode()) * 31) + Double.valueOf(this.bCD).hashCode()) * 31) + Double.valueOf(this.bCH).hashCode()) * 31) + Double.valueOf(this.bCI).hashCode()) * 31) + Double.valueOf(this.aui).hashCode()) * 31) + Double.valueOf(this.bCJ).hashCode()) * 31) + Double.valueOf(this.bCK).hashCode()) * 31) + Double.valueOf(this.bCL).hashCode()) * 31) + Double.valueOf(this.bCM).hashCode()) * 31;
        a aVar = this.bCN;
        return ((((((hashCode + (aVar != null ? aVar.hashCode() : 0)) * 31) + this.bBq.hashCode()) * 31) + this.bCO.hashCode()) * 31) + this.iA.hashCode();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("TradingPosition(");
        stringBuilder.append("id=");
        stringBuilder.append(this.id);
        String str = ", ";
        stringBuilder.append(str);
        stringBuilder.append("userId=");
        stringBuilder.append(this.userId);
        stringBuilder.append(str);
        stringBuilder.append("userBalanceId=");
        stringBuilder.append(this.bwR);
        stringBuilder.append(str);
        stringBuilder.append("userBalanceType=");
        stringBuilder.append(this.bBr);
        stringBuilder.append(str);
        stringBuilder.append("instrumentType=");
        stringBuilder.append(this.instrumentType);
        stringBuilder.append(str);
        stringBuilder.append("instrumentId='");
        stringBuilder.append(this.instrumentId);
        String str2 = "', ";
        stringBuilder.append(str2);
        stringBuilder.append("instrumentUnderlying='");
        stringBuilder.append(this.bBA);
        stringBuilder.append(str2);
        stringBuilder.append("instrumentActiveId=");
        stringBuilder.append(this.bBB);
        stringBuilder.append(str);
        stringBuilder.append("instrumentExpiration=");
        stringBuilder.append(this.bBC);
        stringBuilder.append(str);
        stringBuilder.append("instrumentPeriod=");
        stringBuilder.append(this.bCj);
        stringBuilder.append(str);
        stringBuilder.append("instrumentStrike=");
        stringBuilder.append(this.bBD);
        stringBuilder.append(str);
        stringBuilder.append("instrumentStrikeValue=");
        stringBuilder.append(this.bBE);
        stringBuilder.append(str);
        stringBuilder.append("instrumentDir=");
        stringBuilder.append(this.bBF);
        stringBuilder.append(str);
        stringBuilder.append("status=");
        stringBuilder.append(this.bCk);
        stringBuilder.append(str);
        stringBuilder.append("type=");
        stringBuilder.append(this.bCl);
        stringBuilder.append(str);
        stringBuilder.append("count=");
        stringBuilder.append(this.bBx);
        stringBuilder.append(str);
        stringBuilder.append("countRealized=");
        stringBuilder.append(this.bCm);
        stringBuilder.append(str);
        stringBuilder.append("leverage=");
        stringBuilder.append(this.leverage);
        stringBuilder.append(str);
        stringBuilder.append("buyAmount=");
        stringBuilder.append(this.bCn);
        stringBuilder.append(str);
        stringBuilder.append("buyAmountEnrolled=");
        stringBuilder.append(this.bCo);
        stringBuilder.append(str);
        stringBuilder.append("sellAmount=");
        stringBuilder.append(this.bCp);
        stringBuilder.append(str);
        stringBuilder.append("sellAmountEnrolled=");
        stringBuilder.append(this.bCq);
        stringBuilder.append(str);
        stringBuilder.append("commission=");
        stringBuilder.append(this.bCr);
        stringBuilder.append(str);
        stringBuilder.append("commissionEnrolled=");
        stringBuilder.append(this.bCs);
        stringBuilder.append(str);
        stringBuilder.append("closeEffectAmount=");
        stringBuilder.append(this.bCt);
        stringBuilder.append(str);
        stringBuilder.append("closeEffectAmountEnrolled=");
        stringBuilder.append(this.bCu);
        stringBuilder.append(str);
        stringBuilder.append("closeUnderlyingPrice=");
        stringBuilder.append(this.bCc);
        stringBuilder.append(str);
        stringBuilder.append("openUnderlyingPrice=");
        stringBuilder.append(this.bCd);
        stringBuilder.append(str);
        stringBuilder.append("openClientPlatform=");
        stringBuilder.append(this.bCv);
        stringBuilder.append(str);
        stringBuilder.append("closeReason=");
        stringBuilder.append(this.bxb);
        stringBuilder.append(str);
        stringBuilder.append("buyAvgPrice=");
        stringBuilder.append(this.bCe);
        stringBuilder.append(str);
        stringBuilder.append("buyAvgPriceEnrolled=");
        stringBuilder.append(this.bCf);
        stringBuilder.append(str);
        stringBuilder.append("sellAvgPrice=");
        stringBuilder.append(this.bCg);
        stringBuilder.append(str);
        stringBuilder.append("sellAvgPriceEnrolled=");
        stringBuilder.append(this.bCw);
        stringBuilder.append(str);
        stringBuilder.append("pnlRealized=");
        stringBuilder.append(this.bCx);
        stringBuilder.append(str);
        stringBuilder.append("pnlRealizedEnrolled=");
        stringBuilder.append(this.bCy);
        stringBuilder.append(str);
        stringBuilder.append("createAt=");
        stringBuilder.append(this.bBt);
        stringBuilder.append(str);
        stringBuilder.append("updateAt=");
        stringBuilder.append(this.bBu);
        stringBuilder.append(str);
        stringBuilder.append("closeAt=");
        stringBuilder.append(this.bCz);
        stringBuilder.append(str);
        stringBuilder.append("stopLoseOrderId=");
        stringBuilder.append(this.bCA);
        stringBuilder.append(str);
        stringBuilder.append("takeProfitOrderId=");
        stringBuilder.append(this.bCB);
        stringBuilder.append(str);
        stringBuilder.append("swap=");
        stringBuilder.append(this.bCC);
        stringBuilder.append(str);
        stringBuilder.append("swapEnrolled=");
        stringBuilder.append(this.bCD);
        stringBuilder.append(str);
        stringBuilder.append("charge=");
        stringBuilder.append(this.bCH);
        stringBuilder.append(str);
        stringBuilder.append("chargeEnrolled=");
        stringBuilder.append(this.bCI);
        stringBuilder.append(str);
        stringBuilder.append("margin=");
        stringBuilder.append(this.aui);
        stringBuilder.append(str);
        stringBuilder.append("marginCall=");
        stringBuilder.append(this.bCJ);
        stringBuilder.append(str);
        stringBuilder.append("marginCallEnrolled=");
        stringBuilder.append(this.bCK);
        stringBuilder.append(str);
        stringBuilder.append("currencyUnit=");
        stringBuilder.append(this.bCL);
        stringBuilder.append(str);
        stringBuilder.append("currencyRate=");
        stringBuilder.append(this.bCM);
        stringBuilder.append(str);
        stringBuilder.append("extraData=");
        stringBuilder.append(this.bCN);
        stringBuilder.append(str);
        stringBuilder.append("orders=");
        stringBuilder.append(this.bBq);
        stringBuilder.append(str);
        stringBuilder.append("ordersIds=");
        stringBuilder.append(this.bCO);
        stringBuilder.append(str);
        stringBuilder.append("items=");
        stringBuilder.append(this.iA);
        stringBuilder.append(str);
        stringBuilder.append("index=");
        stringBuilder.append(this.index);
        stringBuilder.append(str);
        stringBuilder.append("lastIndex=");
        stringBuilder.append(this.bCP);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
