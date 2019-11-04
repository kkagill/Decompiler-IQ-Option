package com.iqoption.core.ext;

import android.text.format.DateUtils;
import com.iqoption.core.util.LocalizationUtil;
import com.iqoption.core.util.TimeUtil;
import com.iqoption.core.util.TimeUtil.Duration;
import com.iqoption.dto.entity.position.Position;
import io.reactivex.p;
import io.reactivex.t;
import java.lang.ref.WeakReference;
import java.math.BigDecimal;
import java.math.MathContext;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import kotlin.d;
import kotlin.i;
import kotlin.jvm.internal.PropertyReference0Impl;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.n;
import kotlin.reflect.j;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u0002\n\u0000\n\u0002\u0010\u0013\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u0016\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0019\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0010 \n\u0002\b\u000f\n\u0002\u0010\u001e\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010\u001c\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0004\n\u0002\b\t\n\u0002\u0010\r\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u001f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0010\u00100\u001a\u00020\u000f2\u0006\u00101\u001a\u000202H\u0002\u001a/\u00103\u001a\u00020&\"\u0010\b\u0000\u00104\u0018\u0001*\b\u0012\u0004\u0012\u0002H4052\u0012\u00106\u001a\u000e\u0012\u0004\u0012\u0002H4\u0012\u0004\u0012\u00020&07H\b\u001a*\u00108\u001a\u0002H4\"\u0004\b\u0000\u001042\u0006\u00109\u001a\u00020:2\f\u00106\u001a\b\u0012\u0004\u0012\u0002H40;H\b¢\u0006\u0002\u0010<\u001a6\u0010=\u001a\u0004\u0018\u0001H4\"\u0010\b\u0000\u00104\u0018\u0001*\b\u0012\u0004\u0012\u0002H4052\u0012\u00106\u001a\u000e\u0012\u0004\u0012\u0002H4\u0012\u0004\u0012\u00020&07H\b¢\u0006\u0002\u0010>\u001a<\u0010?\u001a\u0002H4\"\u0010\b\u0000\u00104\u0018\u0001*\b\u0012\u0004\u0012\u0002H4052\u0006\u0010@\u001a\u0002H42\u0012\u00106\u001a\u000e\u0012\u0004\u0012\u0002H4\u0012\u0004\u0012\u00020&07H\b¢\u0006\u0002\u0010A\u001a4\u0010B\u001a\u0002H4\"\u0010\b\u0000\u00104\u0018\u0001*\b\u0012\u0004\u0012\u0002H4052\u0012\u00106\u001a\u000e\u0012\u0004\u0012\u0002H4\u0012\u0004\u0012\u00020&07H\b¢\u0006\u0002\u0010>\u001a&\u0010C\u001a\b\u0012\u0004\u0012\u0002H40D\"\u0004\b\u0000\u001042\u0012\u00106\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H40E0;\u001a\u0018\u0010F\u001a\u00020G2\u0006\u0010H\u001a\u00020\u000f2\b\b\u0002\u0010I\u001a\u00020\u000f\u001a&\u0010J\u001a\b\u0012\u0004\u0012\u0002H40K\"\u0004\b\u0000\u001042\u0012\u00106\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H40E0;\u001a0\u0010L\u001a&\u0012\f\u0012\n \u0019*\u0004\u0018\u0001H4H4 \u0019*\u0012\u0012\f\u0012\n \u0019*\u0004\u0018\u0001H4H4\u0018\u00010N0M\"\u0004\b\u0000\u00104\u001a,\u0010O\u001a\u0004\u0018\u0001H4\"\u0010\b\u0000\u00104\u0018\u0001*\b\u0012\u0004\u0012\u0002H4052\b\u0010P\u001a\u0004\u0018\u00010\bH\b¢\u0006\u0002\u0010Q\u001a2\u0010R\u001a\u0002H4\"\u0010\b\u0000\u00104\u0018\u0001*\b\u0012\u0004\u0012\u0002H4052\b\u0010P\u001a\u0004\u0018\u00010\b2\u0006\u0010@\u001a\u0002H4H\b¢\u0006\u0002\u0010S\u001a*\u0010T\u001a\u0002H4\"\u0010\b\u0000\u00104\u0018\u0001*\b\u0012\u0004\u0012\u0002H4052\b\u0010P\u001a\u0004\u0018\u00010\bH\b¢\u0006\u0002\u0010Q\u001a*\u0010U\u001a\u0004\u0018\u0001H4\"\u0010\b\u0000\u00104\u0018\u0001*\b\u0012\u0004\u0012\u0002H4052\u0006\u0010V\u001a\u00020\u000fH\b¢\u0006\u0002\u0010W\u001a0\u0010X\u001a\u0002H4\"\u0010\b\u0000\u00104\u0018\u0001*\b\u0012\u0004\u0012\u0002H4052\u0006\u0010V\u001a\u00020\u000f2\u0006\u0010@\u001a\u0002H4H\b¢\u0006\u0002\u0010Y\u001a(\u0010Z\u001a\u0002H4\"\u0010\b\u0000\u00104\u0018\u0001*\b\u0012\u0004\u0012\u0002H4052\u0006\u0010V\u001a\u00020\u000fH\b¢\u0006\u0002\u0010W\u001a2\u0010[\u001a\b\u0012\u0004\u0012\u0002H40N\"\u0004\b\u0000\u00104*\b\u0012\u0004\u0012\u0002H40N2\u0006\u0010\\\u001a\u00020\u000f2\f\u0010]\u001a\b\u0012\u0004\u0012\u0002H40^\u001a3\u0010_\u001a\b\u0012\u0004\u0012\u0002H40N\"\u0004\b\u0000\u00104*\b\u0012\u0004\u0012\u0002H40N2\u0006\u0010]\u001a\u0002H42\b\b\u0002\u0010\\\u001a\u00020\u000f¢\u0006\u0002\u0010`\u001a4\u00103\u001a\u00020&\"\u0004\b\u0000\u00104*\n\u0012\u0006\b\u0001\u0012\u0002H40\u00072\u0012\u0010a\u001a\u000e\u0012\u0004\u0012\u0002H4\u0012\u0004\u0012\u00020&07H\b¢\u0006\u0002\u0010b\u001a\u0015\u0010c\u001a\u00020\u000f*\u00020\u000f2\u0006\u0010d\u001a\u00020\u000fH\u0004\u001a\n\u0010e\u001a\u00020f*\u00020f\u001a\u0015\u0010g\u001a\u00020\u000f*\u00020\u000f2\u0006\u0010d\u001a\u00020\u000fH\u0004\u001a\n\u0010h\u001a\u00020\b*\u00020f\u001a\n\u0010i\u001a\u00020\b*\u00020f\u001a\u0012\u0010j\u001a\u00020\b*\u00020f2\u0006\u0010k\u001a\u00020\b\u001a\u0014\u0010l\u001a\u0004\u0018\u00010\b*\u00020\b2\u0006\u0010m\u001a\u00020\b\u001a\u0011\u0010n\u001a\u0004\u0018\u00010**\u00020\b¢\u0006\u0002\u0010o\u001a4\u0010p\u001a\u0004\u0018\u00010\u000f\"\u0004\b\u0000\u00104*\b\u0012\u0004\u0012\u0002H40\u00072\u0012\u0010a\u001a\u000e\u0012\u0004\u0012\u0002H4\u0012\u0004\u0012\u00020&07H\b¢\u0006\u0002\u0010q\u001a4\u0010p\u001a\u0004\u0018\u00010\u000f\"\u0004\b\u0000\u00104*\b\u0012\u0004\u0012\u0002H40r2\u0012\u0010a\u001a\u000e\u0012\u0004\u0012\u0002H4\u0012\u0004\u0012\u00020&07H\b¢\u0006\u0002\u0010s\u001a\u0012\u0010k\u001a\u00020\b*\u00020*2\u0006\u0010t\u001a\u00020\u000f\u001a\u0012\u0010k\u001a\u00020\b*\u00020u2\u0006\u0010t\u001a\u00020\u000f\u001a\u0014\u0010v\u001a\u00020\b*\u00020f2\b\b\u0002\u0010w\u001a\u00020x\u001a\n\u0010y\u001a\u00020\b*\u00020f\u001a\u001a\u0010z\u001a\u00020\u000f*\u00020*2\u0006\u0010{\u001a\u00020*2\u0006\u0010|\u001a\u00020*\u001a\u001a\u0010z\u001a\u00020\u000f*\u00020*2\u0006\u0010{\u001a\u00020*2\u0006\u0010}\u001a\u00020\u000f\u001a\u001a\u0010~\u001a\u00020&*\u00020*2\u0006\u0010{\u001a\u00020*2\u0006\u0010|\u001a\u00020*\u001a\u001a\u0010~\u001a\u00020&*\u00020*2\u0006\u0010{\u001a\u00020*2\u0006\u0010}\u001a\u00020\u000f\u001a+\u0010\u001a\u00020&\"\u0004\b\u0000\u00104*\u0002H42\u0013\u0010\u0001\u001a\n\u0012\u0006\b\u0001\u0012\u0002H40\u0007\"\u0002H4¢\u0006\u0003\u0010\u0001\u001a\u000b\u0010\u0001\u001a\u00020&*\u00020f\u001a\u0013\u0010\u0001\u001a\u00020&*\u00020f2\u0006\u0010{\u001a\u00020f\u001a\u000b\u0010\u0001\u001a\u00020&*\u00020f\u001a\u000b\u0010\u0001\u001a\u00020&*\u00020f\u001a\u000b\u0010\u0001\u001a\u00020&*\u00020f\u001a\u000b\u0010\u0001\u001a\u00020&*\u00020f\u001a\u000b\u0010\u0001\u001a\u00020**\u00020*\u001a\u000b\u0010\u0001\u001a\u00020u*\u00020u\u001a\u000b\u0010\u0001\u001a\u00020\u000f*\u00020\u000f\u001a\u001f\u0010\u0001\u001a\u00020u*\u00020u2\u0007\u0010\u0001\u001a\u00020u2\t\b\u0002\u0010\u0001\u001a\u00020u\u001a\u001f\u0010\u0001\u001a\u00020u*\u00020\u000f2\u0007\u0010\u0001\u001a\u00020\u000f2\t\b\u0002\u0010\u0001\u001a\u00020\u000f\u001a\u000e\u0010\u0001\u001a\u00020\b*\u0005\u0018\u00010\u0001\u001a&\u0010\u0001\u001a\u0002H4\"\t\b\u0000\u00104*\u00030\u0001*\u0004\u0018\u0001H42\u0006\u0010]\u001a\u0002H4¢\u0006\u0003\u0010\u0001\u001a\r\u0010\u0001\u001a\u00020\b*\u0004\u0018\u00010\b\u001a\u0013\u0010\u0001\u001a\u00020&*\u0004\u0018\u00010&¢\u0006\u0003\u0010\u0001\u001a\u0015\u0010\u0001\u001a\n \u0019*\u0004\u0018\u00010\u000b0\u000b*\u0004\u0018\u00010\u000b\u001a\u0013\u0010\u0001\u001a\u00020**\u0004\u0018\u00010*¢\u0006\u0003\u0010\u0001\u001a\u0013\u0010\u0001\u001a\u00020\u000f*\u0004\u0018\u00010\u000f¢\u0006\u0003\u0010\u0001\u001a\u0013\u0010\u0001\u001a\u00020f*\u0004\u0018\u00010f¢\u0006\u0003\u0010\u0001\u001a\u0016\u0010\u0001\u001a\u00020**\u00030\u00012\u0006\u0010H\u001a\u00020\u000fH\u0002\u001a\u0016\u0010\u0001\u001a\u00020\u000f*\u00030\u00012\u0006\u0010H\u001a\u00020\u000fH\u0002\u001a\u0014\u0010\u0001\u001a\u00020\u000b*\u00020\u000b2\u0007\u0010\u0001\u001a\u00020\u000b\u001a\u001f\u0010\u0001\u001a\u00030\u0001*\u00030\u00012\r\u00106\u001a\t\u0012\u0005\u0012\u00030\u00010;H\b\u001a,\u0010 \u0001\u001a\b\u0012\u0004\u0012\u0002H40N\"\u0004\b\u0000\u00104*\b\u0012\u0004\u0012\u0002H40N2\u0007\u0010¡\u0001\u001a\u0002H4¢\u0006\u0003\u0010¢\u0001\u001a,\u0010£\u0001\u001a\b\u0012\u0004\u0012\u0002H40N\"\u0004\b\u0000\u00104*\b\u0012\u0004\u0012\u0002H40N2\r\u0010¤\u0001\u001a\b\u0012\u0004\u0012\u0002H40^\u001a%\u0010¥\u0001\u001a\b\u0012\u0004\u0012\u0002H40N\"\u0004\b\u0000\u00104*\b\u0012\u0004\u0012\u0002H40N2\u0006\u0010\\\u001a\u00020\u000f\u001a!\u0010¦\u0001\u001a\u00030\u0001\"\u0004\b\u0000\u00104*\b\u0012\u0004\u0012\u0002H40M2\u0007\u0010§\u0001\u001a\u00020\u000f\u001a!\u0010¨\u0001\u001a\u00030\u0001\"\u0004\b\u0000\u00104*\b\u0012\u0004\u0012\u0002H40M2\u0007\u0010§\u0001\u001a\u00020\u000f\u001a)\u0010©\u0001\u001a\u00030\u0001\"\u0004\b\u0000\u00104*\b\u0012\u0004\u0012\u0002H40M2\u0006\u0010H\u001a\u00020\u000f2\u0007\u0010§\u0001\u001a\u00020\u000f\u001a.\u0010ª\u0001\u001a\b\u0012\u0004\u0012\u0002H40N\"\u0004\b\u0000\u00104*\b\u0012\u0004\u0012\u0002H40N2\u0006\u0010H\u001a\u00020\u000f2\u0007\u0010§\u0001\u001a\u00020\u000f\u001a5\u0010«\u0001\u001a\u0014\u0012\u0004\u0012\u0002H40¬\u0001j\t\u0012\u0004\u0012\u0002H4`­\u0001\"\u0004\b\u0000\u00104*\u0014\u0012\u0004\u0012\u0002H40¬\u0001j\t\u0012\u0004\u0012\u0002H4`­\u0001\u001a5\u0010®\u0001\u001a\b\u0012\u0004\u0012\u0002H40N\"\u0004\b\u0000\u00104*\b\u0012\u0004\u0012\u0002H40N2\u0006\u0010\\\u001a\u00020\u000f2\u0006\u0010]\u001a\u0002H4H\u0007¢\u0006\u0003\u0010¯\u0001\u001a3\u0010°\u0001\u001a\b\u0012\u0004\u0012\u0002H40N\"\u0004\b\u0000\u00104*\b\u0012\u0004\u0012\u0002H40N2\u0006\u0010\\\u001a\u00020\u000f2\u0006\u0010]\u001a\u0002H4¢\u0006\u0003\u0010¯\u0001\u001a\f\u0010±\u0001\u001a\u00030\u0001*\u00020\u0018\u001a\u0017\u0010²\u0001\u001a\u00020**\u00020*2\u0007\u0010³\u0001\u001a\u00020\u000fH\u0004\u001a\u0017\u0010´\u0001\u001a\u00020**\u00020*2\u0007\u0010³\u0001\u001a\u00020\u000fH\u0004\u001a'\u0010µ\u0001\u001a\u00030\u0001\"\u0004\b\u0000\u00104*\t\u0012\u0004\u0012\u0002H40¶\u00012\f\u00101\u001a\b\u0012\u0004\u0012\u0002H40^\u001a\u0018\u0010·\u0001\u001a\u00020\u000b*\u00030\u00012\n\b\u0002\u0010¸\u0001\u001a\u00030¹\u0001\u001a\u0017\u0010·\u0001\u001a\u00020\u000b*\u00020\b2\n\b\u0002\u0010¸\u0001\u001a\u00030¹\u0001\u001a\f\u0010º\u0001\u001a\u00020**\u00030\u0001\u001a\u000b\u0010»\u0001\u001a\u00020**\u00020\b\u001a\f\u0010¼\u0001\u001a\u00020\u000f*\u00030\u0001\u001a\u000b\u0010½\u0001\u001a\u00020f*\u00020\u000f\u001a\u0014\u0010¾\u0001\u001a\u00020\b*\u00020\u000f2\u0007\u0010¿\u0001\u001a\u00020\u000f\u001a\u0017\u0010À\u0001\u001a\u00020\b*\u0004\u0018\u00010\b2\b\b\u0002\u0010@\u001a\u00020\b\u001a\r\u0010Á\u0001\u001a\u00020\b*\u0004\u0018\u00010\b\u001a\u000f\u0010Â\u0001\u001a\u0004\u0018\u00010\b*\u0004\u0018\u00010\b\u001a<\u0010Ã\u0001\u001a\u0003HÄ\u0001\"\t\b\u0000\u00104*\u00030Å\u0001\"\u0005\b\u0001\u0010Ä\u0001*\u0002H42\u0013\u00106\u001a\u000f\u0012\u0004\u0012\u0002H4\u0012\u0005\u0012\u0003HÄ\u000107H\b¢\u0006\u0003\u0010Æ\u0001\u001a&\u0010Ç\u0001\u001a\u0011\u0012\f\u0012\n \u0019*\u0004\u0018\u0001H4H40È\u0001\"\u0004\b\u0000\u00104*\u0002H4¢\u0006\u0003\u0010É\u0001\u001a\u001f\u0010Ê\u0001\u001a\u00030\u0001*\u00030\u00012\r\u00106\u001a\t\u0012\u0005\u0012\u00030\u00010;H\b\"\u0010\u0010\u0000\u001a\u00020\u00018\u0006X\u0004¢\u0006\u0002\n\u0000\"\u0010\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\u0002\n\u0000\"\u0010\u0010\u0004\u001a\u00020\u00058\u0006X\u0004¢\u0006\u0002\n\u0000\"\u0018\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0004¢\u0006\u0004\n\u0002\u0010\t\"\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r\"\u000e\u0010\u000e\u001a\u00020\u000fXT¢\u0006\u0002\n\u0000\"\u0011\u0010\u0010\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\r\"\u0011\u0010\u0012\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\r\"\u000e\u0010\u0014\u001a\u00020\u0015X\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0016\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000\"\u001e\u0010\u0017\u001a\n \u0019*\u0004\u0018\u00010\u00180\u00188BX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u001b\u0010\u001c\u001a\u00020\u001d8FX\u0002¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\u001e\u0010\u001f\"\u0011\u0010\"\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\r\"\u0016\u0010$\u001a\u00020%*\u00020&8Æ\u0002¢\u0006\u0006\u001a\u0004\b'\u0010(\"\u0016\u0010)\u001a\u00020**\u00020&8Æ\u0002¢\u0006\u0006\u001a\u0004\b+\u0010,\"\u0016\u0010-\u001a\u00020\u000f*\u00020&8Æ\u0002¢\u0006\u0006\u001a\u0004\b.\u0010/¨\u0006Ë\u0001"}, bng = {"EMPTY_DOUBLE_ARRAY", "", "EMPTY_INT_ARRAY", "", "EMPTY_LONG_ARRAY", "", "EMPTY_STRING_ARRAY", "", "", "[Ljava/lang/String;", "HUNDRED", "Ljava/math/BigDecimal;", "getHUNDRED", "()Ljava/math/BigDecimal;", "INT_BITS", "", "MICRON", "getMICRON", "MINUS_ONE", "getMINUS_ONE", "NUM_CHARS", "", "NUM_INTS", "REUSABLE_CALENDAR", "Ljava/util/Calendar;", "kotlin.jvm.PlatformType", "getREUSABLE_CALENDAR", "()Ljava/util/Calendar;", "TIME_FORMAT", "Ljava/text/SimpleDateFormat;", "getTIME_FORMAT", "()Ljava/text/SimpleDateFormat;", "TIME_FORMAT$delegate", "Lkotlin/Lazy;", "TWO", "getTWO", "asByte", "", "", "getAsByte", "(Z)B", "asDouble", "", "getAsDouble", "(Z)D", "asInt", "getAsInt", "(Z)I", "charNumToInt", "c", "", "contains", "T", "", "block", "Lkotlin/Function1;", "doLocking", "lock", "Ljava/util/concurrent/locks/Lock;", "Lkotlin/Function0;", "(Ljava/util/concurrent/locks/Lock;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "find", "(Lkotlin/jvm/functions/Function1;)Ljava/lang/Enum;", "findOrDefault", "default", "(Ljava/lang/Enum;Lkotlin/jvm/functions/Function1;)Ljava/lang/Enum;", "findOrFirst", "fromFutureSupplier", "Lio/reactivex/Flowable;", "Ljava/util/concurrent/Future;", "intRange", "Lkotlin/ranges/IntRange;", "start", "end", "singleFromFutureSupplier", "Lio/reactivex/Single;", "synchronizedList", "", "", "withName", "name", "(Ljava/lang/String;)Ljava/lang/Enum;", "withNameOrDefault", "(Ljava/lang/String;Ljava/lang/Enum;)Ljava/lang/Enum;", "withNameOrFirst", "withOrdinal", "ordinal", "(I)Ljava/lang/Enum;", "withOrdinalOrDefault", "(ILjava/lang/Enum;)Ljava/lang/Enum;", "withOrdinalOrFirst", "addAllAt", "index", "value", "", "addAt", "(Ljava/util/List;Ljava/lang/Object;I)Ljava/util/List;", "predicate", "([Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Z", "cshl", "bits", "currentTimeDiff", "", "cushr", "durationFormatHHMMSS", "durationFormatMMSS", "durationFormatSeconds", "format", "extractByPattern", "regex", "extractDouble", "(Ljava/lang/String;)Ljava/lang/Double;", "firstIndexOrNull", "([Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ljava/lang/Integer;", "", "(Ljava/lang/Iterable;Lkotlin/jvm/functions/Function1;)Ljava/lang/Integer;", "digits", "", "formatDuration", "precision", "Lcom/iqoption/core/util/TimeUtil$Duration;", "formatTime", "fuzzyCompare", "another", "tolerance", "minorUnits", "fuzzyEquals", "isOneOf", "objects", "(Ljava/lang/Object;[Ljava/lang/Object;)Z", "isPastTime", "isTheSameDay", "isThisDay", "isThisWeek", "isThisYear", "isYesterday", "negateIfPositive", "norm", "max", "min", "optString", "", "or", "", "(Ljava/lang/Number;Ljava/lang/Number;)Ljava/lang/Number;", "orEmpty", "orFalse", "(Ljava/lang/Boolean;)Z", "orZero", "(Ljava/lang/Double;)D", "(Ljava/lang/Integer;)I", "(Ljava/lang/Long;)J", "parseUnsignedDouble", "", "parseUnsignedInt", "percentOf", "b", "readBlock", "", "Ljava/util/concurrent/locks/ReentrantReadWriteLock;", "remove", "item", "(Ljava/util/List;Ljava/lang/Object;)Ljava/util/List;", "removeAll", "items", "removeAt", "removeFirst", "count", "removeLast", "removeRange", "removeRangeAt", "reverse", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "set", "(Ljava/util/List;ILjava/lang/Object;)Ljava/util/List;", "setAt", "setDayStartTime", "shlPoint", "n", "shrPoint", "swapBy", "", "toBigDecimal", "mc", "Ljava/math/MathContext;", "toDouble", "toDoubleOrZero", "toInt", "toUnsignedLong", "toUnsignedString", "radix", "translate", "translateOrKey", "translateOrNull", "using", "R", "Lcom/iqoption/core/util/Recyclable;", "(Lcom/iqoption/core/util/Recyclable;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "weak", "Ljava/lang/ref/WeakReference;", "(Ljava/lang/Object;)Ljava/lang/ref/WeakReference;", "writeBlock", "core_release"})
/* compiled from: CoreExtensions.kt */
public final class c {
    public static final String[] EMPTY_STRING_ARRAY = new String[0];
    static final /* synthetic */ j[] anY = new j[]{k.a(new PropertyReference0Impl(k.d(c.class, "core_release"), "TIME_FORMAT", "getTIME_FORMAT()Ljava/text/SimpleDateFormat;"))};
    private static final BigDecimal bgM = new BigDecimal("100");
    private static final BigDecimal bgN = new BigDecimal("2");
    private static final BigDecimal bgO = new BigDecimal("-1");
    private static final BigDecimal bgP = new BigDecimal("0.000001");
    private static final d bgQ = g.c(CoreExt$TIME_FORMAT$2.bgX);
    private static final Calendar bgR = Calendar.getInstance();
    public static final double[] bgS = new double[0];
    public static final long[] bgT = new long[0];
    public static final int[] bgU = new int[0];
    private static final char[] bgV = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
    private static final int[] bgW = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

    @i(bne = {1, 1, 15}, bnf = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u00022\u0006\u0010\u0004\u001a\u0002H\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, bng = {"<anonymous>", "", "T", "o1", "o2", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I"})
    /* compiled from: CoreExtensions.kt */
    static final class a<T> implements Comparator<T> {
        final /* synthetic */ Comparator bgY;

        a(Comparator comparator) {
            this.bgY = comparator;
        }

        public final int compare(T t, T t2) {
            return this.bgY.compare(t2, t);
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u0001H\u0002H\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u0001H\u0002H\u0002\u0018\u00010\u00010\u0001\"\u0004\b\u0000\u0010\u0002H\n¢\u0006\u0002\b\u0004"}, bng = {"<anonymous>", "Lio/reactivex/Single;", "T", "kotlin.jvm.PlatformType", "call"})
    /* compiled from: CoreExtensions.kt */
    static final class b<V> implements Callable<t<? extends T>> {
        final /* synthetic */ kotlin.jvm.a.a bgZ;

        b(kotlin.jvm.a.a aVar) {
            this.bgZ = aVar;
        }

        /* renamed from: Xj */
        public final p<T> call() {
            return p.d((Future) this.bgZ.invoke());
        }
    }

    public static final SimpleDateFormat Xg() {
        d dVar = bgQ;
        j jVar = anY[0];
        return (SimpleDateFormat) dVar.getValue();
    }

    public static final int ah(int i, int i2) {
        return (i >>> (32 - i2)) | (i << i2);
    }

    public static final int ai(int i, int i2) {
        return (i << (32 - i2)) | (i >>> i2);
    }

    public static final String fS(String str) {
        return str != null ? str : "";
    }

    public static final float g(float f, float f2, float f3) {
        return f < f3 ? 0.0f : f < f2 ? (f - f3) / (f2 - f3) : 1.0f;
    }

    public static final long toUnsignedLong(int i) {
        return i < 0 ? ((long) (i & Integer.MAX_VALUE)) | 2147483648L : (long) i;
    }

    public static final double c(Double d) {
        return d != null ? d.doubleValue() : 0.0d;
    }

    public static final long n(Long l) {
        return l != null ? l.longValue() : 0;
    }

    public static final int e(Integer num) {
        return num != null ? num.intValue() : 0;
    }

    public static final String d(double d, int i) {
        n nVar = n.eWf;
        Locale locale = Locale.US;
        kotlin.jvm.internal.i.e(locale, "Locale.US");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("%.");
        stringBuilder.append(i);
        stringBuilder.append('f');
        String stringBuilder2 = stringBuilder.toString();
        Object[] objArr = new Object[]{Double.valueOf(d)};
        String format = String.format(locale, stringBuilder2, Arrays.copyOf(objArr, objArr.length));
        kotlin.jvm.internal.i.e(format, "java.lang.String.format(locale, format, *args)");
        return format;
    }

    public static final <T> void b(Collection<T> collection, Collection<? extends T> collection2) {
        kotlin.jvm.internal.i.f(collection, "$this$swapBy");
        kotlin.jvm.internal.i.f(collection2, "c");
        collection.clear();
        collection.addAll(collection2);
    }

    public static final <T> boolean b(T t, T... tArr) {
        kotlin.jvm.internal.i.f(tArr, "objects");
        for (Object obj : tArr) {
            if (kotlin.jvm.internal.i.y(t, obj)) {
                break;
            }
        }
        Object obj2 = null;
        return obj2 != null;
    }

    public static final <T> WeakReference<T> bJ(T t) {
        return new WeakReference(t);
    }

    private static final Calendar Xh() {
        Calendar calendar = bgR;
        kotlin.jvm.internal.i.e(calendar, "field");
        calendar.setTimeInMillis(System.currentTimeMillis());
        return bgR;
    }

    public static final boolean aP(long j) {
        return DateUtils.isToday(j);
    }

    public static final boolean aB(long j) {
        Calendar Xh = Xh();
        Xh.set(6, 1);
        Xh.set(11, 0);
        Xh.clear(12);
        Xh.clear(13);
        Xh.clear(14);
        kotlin.jvm.internal.i.e(Xh, "c");
        long timeInMillis = Xh.getTimeInMillis();
        Xh.add(1, 1);
        long timeInMillis2 = Xh.getTimeInMillis() - 1;
        if (timeInMillis <= j && timeInMillis2 >= j) {
            return true;
        }
        return false;
    }

    public static final boolean aA(long j) {
        boolean z = false;
        if (aP(j)) {
            return false;
        }
        Calendar Xh = Xh();
        Xh.set(11, 0);
        Xh.clear(12);
        Xh.clear(13);
        Xh.clear(14);
        Xh.add(6, -1);
        kotlin.jvm.internal.i.e(Xh, "c");
        if (j >= Xh.getTimeInMillis()) {
            z = true;
        }
        return z;
    }

    public static final String aQ(long j) {
        String format = Xg().format(Long.valueOf(j));
        kotlin.jvm.internal.i.e(format, "TIME_FORMAT.format(this)");
        return format;
    }

    public static final String a(long j, Duration duration) {
        kotlin.jvm.internal.i.f(duration, "precision");
        return TimeUtil.bRM.a(j, duration);
    }

    public static final boolean n(long j, long j2) {
        Calendar Xh = Xh();
        kotlin.jvm.internal.i.e(Xh, "c1");
        Xh.setTimeInMillis(j);
        a(Xh);
        int i = Xh.get(1);
        int i2 = Xh.get(6);
        Calendar Xh2 = Xh();
        kotlin.jvm.internal.i.e(Xh2, "c2");
        Xh2.setTimeInMillis(j2);
        a(Xh2);
        int i3 = Xh2.get(1);
        int i4 = Xh2.get(6);
        if (i == i3 && i2 == i4) {
            return true;
        }
        return false;
    }

    public static final void a(Calendar calendar) {
        kotlin.jvm.internal.i.f(calendar, "$this$setDayStartTime");
        calendar.set(11, 0);
        calendar.clear(12);
        calendar.clear(13);
        calendar.clear(14);
    }

    public static final <T> p<T> b(kotlin.jvm.a.a<? extends Future<T>> aVar) {
        kotlin.jvm.internal.i.f(aVar, "block");
        p h = p.h((Callable) new b(aVar));
        kotlin.jvm.internal.i.e(h, "Single.defer {\n        S…fromFuture(block())\n    }");
        return h;
    }

    public static final <T> List<T> a(List<? extends T> list, int i, T t) {
        kotlin.jvm.internal.i.f(list, "$this$setAt");
        List I = u.I(list);
        I.set(i, t);
        return I;
    }

    public static final <T> List<T> b(List<? extends T> list, int i) {
        kotlin.jvm.internal.i.f(list, "$this$removeAt");
        List I = u.I(list);
        I.remove(i);
        return I;
    }

    public static final <T> List<T> h(List<? extends T> list, T t) {
        kotlin.jvm.internal.i.f(list, "$this$remove");
        List I = u.I(list);
        I.remove(t);
        return I;
    }

    public static final <T> List<T> a(List<? extends T> list, T t, int i) {
        kotlin.jvm.internal.i.f(list, "$this$addAt");
        List I = u.I(list);
        if (i == -1) {
            I.add(t);
        } else {
            I.add(i, t);
        }
        return I;
    }

    public static final int B(CharSequence charSequence) {
        kotlin.jvm.internal.i.f(charSequence, "$this$toInt");
        if (charSequence.length() != 0) {
            char charAt = charSequence.charAt(0);
            if (charAt == '+') {
                return h(charSequence, 1);
            }
            if (charAt != '-') {
                return h(charSequence, 0);
            }
            return -h(charSequence, 1);
        }
        throw new NumberFormatException("CharSequence is empty");
    }

    public static final double C(CharSequence charSequence) {
        kotlin.jvm.internal.i.f(charSequence, "$this$toDouble");
        if (charSequence.length() != 0) {
            char charAt = charSequence.charAt(0);
            if (charAt == '+') {
                return i(charSequence, 1);
            }
            if (charAt != '-') {
                return i(charSequence, 0);
            }
            return -i(charSequence, 1);
        }
        throw new NumberFormatException("CharSequence is empty");
    }

    private static final int A(char c) {
        return bgW[i.b(bgV, c)];
    }

    private static final int h(CharSequence charSequence, int i) {
        int length = charSequence.length();
        int i2 = 0;
        while (i < length) {
            char charAt = charSequence.charAt(i);
            if (Character.isDigit(charAt)) {
                if (i2 != 0) {
                    i2 *= 10;
                }
                i2 += A(charAt);
                i++;
            } else {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Wrong char sequence: ");
                stringBuilder.append(charSequence);
                throw new NumberFormatException(stringBuilder.toString());
            }
        }
        return i2;
    }

    private static final double i(CharSequence charSequence, int i) {
        double pow;
        CharSequence charSequence2 = charSequence;
        int length = charSequence.length();
        Object obj = 1;
        int i2 = 0;
        double d = 0.0d;
        double d2 = 0.0d;
        double d3 = 0.0d;
        int i3 = 0;
        Object obj2 = null;
        for (int i4 = i; i4 != length; i4++) {
            char charAt = charSequence2.charAt(i4);
            String str = "Wrong char sequence: ";
            double d4;
            StringBuilder stringBuilder;
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 != 2) {
                        continue;
                    } else if (Character.isDigit(charAt)) {
                        if (d != 0.0d) {
                            d4 = (double) 10;
                            Double.isNaN(d4);
                            d *= d4;
                        }
                        d4 = (double) A(charAt);
                        Double.isNaN(d4);
                        d += d4;
                    } else {
                        if (charAt == '-' && obj2 == null) {
                            obj = null;
                        } else if (!(charAt == '+' && obj2 == null)) {
                            stringBuilder = new StringBuilder();
                            stringBuilder.append(str);
                            stringBuilder.append(charSequence2);
                            throw new NumberFormatException(stringBuilder.toString());
                        }
                        obj2 = 1;
                    }
                } else if (Character.isDigit(charAt)) {
                    if (d2 != 0.0d) {
                        d4 = (double) 10;
                        Double.isNaN(d4);
                        d2 *= d4;
                    }
                    d4 = (double) A(charAt);
                    Double.isNaN(d4);
                    d2 += d4;
                    i3++;
                } else if (!(charAt == 'E' || charAt == 'e')) {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append(str);
                    stringBuilder.append(charSequence2);
                    throw new NumberFormatException(stringBuilder.toString());
                }
            } else {
                if (Character.isDigit(charAt)) {
                    if (d3 != 0.0d) {
                        d4 = (double) 10;
                        Double.isNaN(d4);
                        d3 *= d4;
                    }
                    d4 = (double) A(charAt);
                    Double.isNaN(d4);
                    d3 += d4;
                } else if (charAt == '.') {
                    i2 = 1;
                } else if (!(charAt == 'E' || charAt == 'e')) {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append(str);
                    stringBuilder.append(charSequence2);
                    throw new NumberFormatException(stringBuilder.toString());
                }
            }
            i2 = 2;
        }
        if (obj == null) {
            d = -d;
        }
        double d5 = 0.0d;
        if (d2 != 0.0d) {
            if (d == 0.0d) {
                d5 = 0.0d;
            } else if (d > ((double) 0)) {
                d3 += d2 / Math.pow(10.0d, (double) i3);
                pow = Math.pow(10.0d, d);
                return d3 * pow;
            } else {
                d3 += d2 / Math.pow(10.0d, (double) i3);
                pow = Math.pow(10.0d, -d);
                return d3 / pow;
            }
        }
        if (d2 != d5 && d == d5) {
            return d3 + (d2 / Math.pow(10.0d, (double) i3));
        }
        if (d2 != d5 || d == d5) {
            return d3;
        }
        if (d > ((double) 0)) {
            pow = Math.pow(10.0d, d);
            return d3 * pow;
        }
        pow = Math.pow(10.0d, -d);
        return d3 / pow;
    }

    public static final String fT(String str) {
        return str != null ? LocalizationUtil.hq(str) : null;
    }

    public static final String af(String str, String str2) {
        kotlin.jvm.internal.i.f(str2, Position.CLOSE_REASON_DEFAULT);
        str = fT(str);
        return str != null ? str : str2;
    }

    public static final String fU(String str) {
        String fT = fT(str);
        return fT != null ? fT : fS(str);
    }

    public static final BigDecimal a(CharSequence charSequence, MathContext mathContext) {
        kotlin.jvm.internal.i.f(charSequence, "$this$toBigDecimal");
        kotlin.jvm.internal.i.f(mathContext, "mc");
        return new BigDecimal(C(charSequence), mathContext);
    }

    public static final boolean b(double d, double d2, double d3) {
        if (d3 < ((double) null)) {
            throw new IllegalArgumentException("Tolerance could not be negative");
        } else if (Math.copySign(d - d2, 1.0d) < d3 || d == d2 || (Double.isNaN(d) && Double.isNaN(d2))) {
            return true;
        } else {
            return false;
        }
    }

    public static final int c(double d, double d2, double d3) {
        if (b(d, d2, d3)) {
            return 0;
        }
        if (d < d2) {
            return -1;
        }
        if (d > d2) {
            return 1;
        }
        return com.google.common.primitives.a.compare(Double.isNaN(d), Double.isNaN(d2));
    }

    public static final int a(double d, double d2, int i) {
        return c(d, d2, e(1.0d, i));
    }

    public static final double e(double d, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            double d2 = (double) 10;
            Double.isNaN(d2);
            d /= d2;
        }
        return d;
    }

    public static final <T> Comparator<T> e(Comparator<T> comparator) {
        kotlin.jvm.internal.i.f(comparator, "$this$reverse");
        return new a(comparator);
    }
}
