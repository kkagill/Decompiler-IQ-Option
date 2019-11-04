package com.iqoption.feed;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.library.baseAdapters.DataBinderMapperImpl;
import com.iqoption.core.c;
import com.iqoption.feed.a.ab;
import com.iqoption.feed.a.ad;
import com.iqoption.feed.a.af;
import com.iqoption.feed.a.d;
import com.iqoption.feed.a.h;
import com.iqoption.feed.a.j;
import com.iqoption.feed.a.l;
import com.iqoption.feed.a.n;
import com.iqoption.feed.a.p;
import com.iqoption.feed.a.r;
import com.iqoption.feed.a.t;
import com.iqoption.feed.a.v;
import com.iqoption.feed.a.x;
import com.iqoption.feed.a.z;
import com.iqoption.feed.i.f;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* compiled from: DataBinderMapperImpl */
public class b extends DataBinderMapper {
    private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(16);

    /* compiled from: DataBinderMapperImpl */
    private static class a {
        static final SparseArray<String> sKeys = new SparseArray(2);

        static {
            sKeys.put(0, "_all");
        }
    }

    /* compiled from: DataBinderMapperImpl */
    private static class b {
        static final HashMap<String, Integer> sKeys = new HashMap(16);

        static {
            sKeys.put("layout/feed_bottom_panel_0", Integer.valueOf(f.feed_bottom_panel));
            sKeys.put("layout/feed_options_0", Integer.valueOf(f.feed_options));
            sKeys.put("layout/feed_title_0", Integer.valueOf(f.feed_title));
            sKeys.put("layout/feed_web_0", Integer.valueOf(f.feed_web));
            sKeys.put("layout/macro_article_feed_0", Integer.valueOf(f.macro_article_feed));
            sKeys.put("layout/macro_feed_options_0", Integer.valueOf(f.macro_feed_options));
            sKeys.put("layout/macro_smart_feed_0", Integer.valueOf(f.macro_smart_feed));
            sKeys.put("layout/macro_tweet_feed_0", Integer.valueOf(f.macro_tweet_feed));
            sKeys.put("layout/macro_video_feed_0", Integer.valueOf(f.macro_video_feed));
            sKeys.put("layout/micro_article_feed_0", Integer.valueOf(f.micro_article_feed));
            sKeys.put("layout/micro_bottom_panel_0", Integer.valueOf(f.micro_bottom_panel));
            sKeys.put("layout/micro_feed_title_0", Integer.valueOf(f.micro_feed_title));
            sKeys.put("layout/micro_other_video_feed_0", Integer.valueOf(f.micro_other_video_feed));
            sKeys.put("layout/micro_smart_feed_0", Integer.valueOf(f.micro_smart_feed));
            sKeys.put("layout/micro_tweet_feed_0", Integer.valueOf(f.micro_tweet_feed));
            sKeys.put("layout/smart_feed_fragment_0", Integer.valueOf(f.smart_feed_fragment));
        }
    }

    static {
        INTERNAL_LAYOUT_ID_LOOKUP.put(f.feed_bottom_panel, 1);
        INTERNAL_LAYOUT_ID_LOOKUP.put(f.feed_options, 2);
        INTERNAL_LAYOUT_ID_LOOKUP.put(f.feed_title, 3);
        INTERNAL_LAYOUT_ID_LOOKUP.put(f.feed_web, 4);
        INTERNAL_LAYOUT_ID_LOOKUP.put(f.macro_article_feed, 5);
        INTERNAL_LAYOUT_ID_LOOKUP.put(f.macro_feed_options, 6);
        INTERNAL_LAYOUT_ID_LOOKUP.put(f.macro_smart_feed, 7);
        INTERNAL_LAYOUT_ID_LOOKUP.put(f.macro_tweet_feed, 8);
        INTERNAL_LAYOUT_ID_LOOKUP.put(f.macro_video_feed, 9);
        INTERNAL_LAYOUT_ID_LOOKUP.put(f.micro_article_feed, 10);
        INTERNAL_LAYOUT_ID_LOOKUP.put(f.micro_bottom_panel, 11);
        INTERNAL_LAYOUT_ID_LOOKUP.put(f.micro_feed_title, 12);
        INTERNAL_LAYOUT_ID_LOOKUP.put(f.micro_other_video_feed, 13);
        INTERNAL_LAYOUT_ID_LOOKUP.put(f.micro_smart_feed, 14);
        INTERNAL_LAYOUT_ID_LOOKUP.put(f.micro_tweet_feed, 15);
        INTERNAL_LAYOUT_ID_LOOKUP.put(f.smart_feed_fragment, 16);
    }

    public ViewDataBinding getDataBinder(DataBindingComponent dataBindingComponent, View view, int i) {
        i = INTERNAL_LAYOUT_ID_LOOKUP.get(i);
        if (i > 0) {
            Object tag = view.getTag();
            if (tag != null) {
                StringBuilder stringBuilder;
                switch (i) {
                    case 1:
                        if ("layout/feed_bottom_panel_0".equals(tag)) {
                            return new com.iqoption.feed.a.b(dataBindingComponent, new View[]{view});
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("The tag for feed_bottom_panel is invalid. Received: ");
                        stringBuilder.append(tag);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    case 2:
                        if ("layout/feed_options_0".equals(tag)) {
                            return new d(dataBindingComponent, view);
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("The tag for feed_options is invalid. Received: ");
                        stringBuilder.append(tag);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    case 3:
                        if ("layout/feed_title_0".equals(tag)) {
                            return new com.iqoption.feed.a.f(dataBindingComponent, new View[]{view});
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("The tag for feed_title is invalid. Received: ");
                        stringBuilder.append(tag);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    case 4:
                        if ("layout/feed_web_0".equals(tag)) {
                            return new h(dataBindingComponent, view);
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("The tag for feed_web is invalid. Received: ");
                        stringBuilder.append(tag);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    case 5:
                        if ("layout/macro_article_feed_0".equals(tag)) {
                            return new j(dataBindingComponent, view);
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("The tag for macro_article_feed is invalid. Received: ");
                        stringBuilder.append(tag);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    case 6:
                        if ("layout/macro_feed_options_0".equals(tag)) {
                            return new l(dataBindingComponent, view);
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("The tag for macro_feed_options is invalid. Received: ");
                        stringBuilder.append(tag);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    case 7:
                        if ("layout/macro_smart_feed_0".equals(tag)) {
                            return new n(dataBindingComponent, view);
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("The tag for macro_smart_feed is invalid. Received: ");
                        stringBuilder.append(tag);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    case 8:
                        if ("layout/macro_tweet_feed_0".equals(tag)) {
                            return new p(dataBindingComponent, view);
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("The tag for macro_tweet_feed is invalid. Received: ");
                        stringBuilder.append(tag);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    case 9:
                        if ("layout/macro_video_feed_0".equals(tag)) {
                            return new r(dataBindingComponent, view);
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("The tag for macro_video_feed is invalid. Received: ");
                        stringBuilder.append(tag);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    case 10:
                        if ("layout/micro_article_feed_0".equals(tag)) {
                            return new t(dataBindingComponent, view);
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("The tag for micro_article_feed is invalid. Received: ");
                        stringBuilder.append(tag);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    case 11:
                        if ("layout/micro_bottom_panel_0".equals(tag)) {
                            return new v(dataBindingComponent, view);
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("The tag for micro_bottom_panel is invalid. Received: ");
                        stringBuilder.append(tag);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    case 12:
                        if ("layout/micro_feed_title_0".equals(tag)) {
                            return new x(dataBindingComponent, view);
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("The tag for micro_feed_title is invalid. Received: ");
                        stringBuilder.append(tag);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    case 13:
                        if ("layout/micro_other_video_feed_0".equals(tag)) {
                            return new z(dataBindingComponent, view);
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("The tag for micro_other_video_feed is invalid. Received: ");
                        stringBuilder.append(tag);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    case 14:
                        if ("layout/micro_smart_feed_0".equals(tag)) {
                            return new ab(dataBindingComponent, view);
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("The tag for micro_smart_feed is invalid. Received: ");
                        stringBuilder.append(tag);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    case 15:
                        if ("layout/micro_tweet_feed_0".equals(tag)) {
                            return new ad(dataBindingComponent, view);
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("The tag for micro_tweet_feed is invalid. Received: ");
                        stringBuilder.append(tag);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    case 16:
                        if ("layout/smart_feed_fragment_0".equals(tag)) {
                            return new af(dataBindingComponent, view);
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("The tag for smart_feed_fragment is invalid. Received: ");
                        stringBuilder.append(tag);
                        throw new IllegalArgumentException(stringBuilder.toString());
                }
            }
            throw new RuntimeException("view must have a tag");
        }
        return null;
    }

    public ViewDataBinding getDataBinder(DataBindingComponent dataBindingComponent, View[] viewArr, int i) {
        if (!(viewArr == null || viewArr.length == 0)) {
            i = INTERNAL_LAYOUT_ID_LOOKUP.get(i);
            if (i > 0) {
                Object tag = viewArr[0].getTag();
                StringBuilder stringBuilder;
                if (tag == null) {
                    throw new RuntimeException("view must have a tag");
                } else if (i != 1) {
                    if (i == 3) {
                        if ("layout/feed_title_0".equals(tag)) {
                            return new com.iqoption.feed.a.f(dataBindingComponent, viewArr);
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("The tag for feed_title is invalid. Received: ");
                        stringBuilder.append(tag);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    }
                } else if ("layout/feed_bottom_panel_0".equals(tag)) {
                    return new com.iqoption.feed.a.b(dataBindingComponent, viewArr);
                } else {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("The tag for feed_bottom_panel is invalid. Received: ");
                    stringBuilder.append(tag);
                    throw new IllegalArgumentException(stringBuilder.toString());
                }
            }
        }
        return null;
    }

    public int getLayoutId(String str) {
        int i = 0;
        if (str == null) {
            return 0;
        }
        Integer num = (Integer) b.sKeys.get(str);
        if (num != null) {
            i = num.intValue();
        }
        return i;
    }

    public String convertBrIdToString(int i) {
        return (String) a.sKeys.get(i);
    }

    public List<DataBinderMapper> collectDependencies() {
        ArrayList arrayList = new ArrayList(8);
        arrayList.add(new DataBinderMapperImpl());
        arrayList.add(new com.iqoption.asset.a());
        arrayList.add(new com.iqoption.config.b());
        arrayList.add(new c());
        arrayList.add(new com.iqoption.debugmenu.a());
        arrayList.add(new com.iqoption.dialogs.c());
        arrayList.add(new com.iqoption.i.a());
        arrayList.add(new com.iqoption.k.a());
        return arrayList;
    }
}
