package com.iqoption.chat;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.library.baseAdapters.DataBinderMapperImpl;
import com.iqoption.chat.a.ab;
import com.iqoption.chat.a.ad;
import com.iqoption.chat.a.af;
import com.iqoption.chat.a.ah;
import com.iqoption.chat.a.aj;
import com.iqoption.chat.a.al;
import com.iqoption.chat.a.an;
import com.iqoption.chat.a.ap;
import com.iqoption.chat.a.ar;
import com.iqoption.chat.a.at;
import com.iqoption.chat.a.av;
import com.iqoption.chat.a.ax;
import com.iqoption.chat.a.az;
import com.iqoption.chat.a.bb;
import com.iqoption.chat.a.bd;
import com.iqoption.chat.a.bf;
import com.iqoption.chat.a.bh;
import com.iqoption.chat.a.bj;
import com.iqoption.chat.a.bk;
import com.iqoption.chat.a.bm;
import com.iqoption.chat.a.bo;
import com.iqoption.chat.a.bp;
import com.iqoption.chat.a.br;
import com.iqoption.chat.a.bt;
import com.iqoption.chat.a.bv;
import com.iqoption.chat.a.bx;
import com.iqoption.chat.a.bz;
import com.iqoption.chat.a.cb;
import com.iqoption.chat.a.cd;
import com.iqoption.chat.a.cf;
import com.iqoption.chat.a.ch;
import com.iqoption.chat.a.cj;
import com.iqoption.chat.a.cl;
import com.iqoption.chat.a.cn;
import com.iqoption.chat.a.cp;
import com.iqoption.chat.a.d;
import com.iqoption.chat.a.f;
import com.iqoption.chat.a.j;
import com.iqoption.chat.a.l;
import com.iqoption.chat.a.n;
import com.iqoption.chat.a.p;
import com.iqoption.chat.a.r;
import com.iqoption.chat.a.t;
import com.iqoption.chat.a.v;
import com.iqoption.chat.a.x;
import com.iqoption.chat.a.z;
import com.iqoption.chat.e.h;
import com.iqoption.core.c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* compiled from: DataBinderMapperImpl */
public class b extends DataBinderMapper {
    private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(46);

    /* compiled from: DataBinderMapperImpl */
    private static class a {
        static final SparseArray<String> sKeys = new SparseArray(2);

        static {
            sKeys.put(0, "_all");
        }
    }

    /* compiled from: DataBinderMapperImpl */
    private static class b {
        static final HashMap<String, Integer> sKeys = new HashMap(48);

        static {
            sKeys.put("layout/activity_chat_0", Integer.valueOf(h.activity_chat));
            sKeys.put("layout/chat_attachment_image_item_0", Integer.valueOf(h.chat_attachment_image_item));
            sKeys.put("layout/chat_dialog_cant_send_reason_0", Integer.valueOf(h.chat_dialog_cant_send_reason));
            sKeys.put("layout/chat_dialog_feedback_0", Integer.valueOf(h.chat_dialog_feedback));
            sKeys.put("layout/chat_dialog_message_options_0", Integer.valueOf(h.chat_dialog_message_options));
            sKeys.put("layout/chat_dialog_user_info_0", Integer.valueOf(h.chat_dialog_user_info));
            sKeys.put("layout/chat_empty_item_0", Integer.valueOf(h.chat_empty_item));
            sKeys.put("layout/chat_file_message_body_item_0", Integer.valueOf(h.chat_file_message_body_item));
            sKeys.put("layout/chat_file_message_full_item_0", Integer.valueOf(h.chat_file_message_full_item));
            sKeys.put("layout/chat_file_message_head_item_0", Integer.valueOf(h.chat_file_message_head_item));
            sKeys.put("layout/chat_file_message_tail_item_0", Integer.valueOf(h.chat_file_message_tail_item));
            sKeys.put("layout/chat_file_picker_empty_item_0", Integer.valueOf(h.chat_file_picker_empty_item));
            sKeys.put("layout/chat_file_picker_item_0", Integer.valueOf(h.chat_file_picker_item));
            sKeys.put("layout/chat_fragment_attachment_picker_0", Integer.valueOf(h.chat_fragment_attachment_picker));
            sKeys.put("layout/chat_fragment_file_picker_0", Integer.valueOf(h.chat_fragment_file_picker));
            sKeys.put("layout/chat_fragment_image_preview_0", Integer.valueOf(h.chat_fragment_image_preview));
            sKeys.put("layout/chat_fragment_image_preview_slider_0", Integer.valueOf(h.chat_fragment_image_preview_slider));
            sKeys.put("layout/chat_fragment_search_room_0", Integer.valueOf(h.chat_fragment_search_room));
            sKeys.put("layout/chat_image_message_body_item_0", Integer.valueOf(h.chat_image_message_body_item));
            sKeys.put("layout/chat_image_message_full_item_0", Integer.valueOf(h.chat_image_message_full_item));
            sKeys.put("layout/chat_image_message_head_item_0", Integer.valueOf(h.chat_image_message_head_item));
            sKeys.put("layout/chat_image_message_tail_item_0", Integer.valueOf(h.chat_image_message_tail_item));
            sKeys.put("layout/chat_item_0", Integer.valueOf(h.chat_item));
            sKeys.put("layout/chat_like_dislike_message_item_0", Integer.valueOf(h.chat_like_dislike_message_item));
            sKeys.put("layout/chat_load_more_item_0", Integer.valueOf(h.chat_load_more_item));
            sKeys.put("layout/chat_loading_item_0", Integer.valueOf(h.chat_loading_item));
            sKeys.put("layout/chat_micro_item_0", Integer.valueOf(h.chat_micro_item));
            sKeys.put("layout/chat_rate_message_item_0", Integer.valueOf(h.chat_rate_message_item));
            sKeys.put("layout/chat_room_cant_send_layout_0", Integer.valueOf(h.chat_room_cant_send_layout));
            sKeys.put("layout/chat_room_private_toolbar_0", Integer.valueOf(h.chat_room_private_toolbar));
            sKeys.put("layout-land/chat_room_public_toolbar_0", Integer.valueOf(h.chat_room_public_toolbar));
            sKeys.put("layout/chat_room_public_toolbar_0", Integer.valueOf(h.chat_room_public_toolbar));
            sKeys.put("layout/chat_room_send_layout_0", Integer.valueOf(h.chat_room_send_layout));
            sKeys.put("layout-land/chat_room_support_toolbar_0", Integer.valueOf(h.chat_room_support_toolbar));
            sKeys.put("layout/chat_room_support_toolbar_0", Integer.valueOf(h.chat_room_support_toolbar));
            sKeys.put("layout/chat_suggestion_message_item_0", Integer.valueOf(h.chat_suggestion_message_item));
            sKeys.put("layout/chat_text_message_body_item_0", Integer.valueOf(h.chat_text_message_body_item));
            sKeys.put("layout/chat_text_message_full_item_0", Integer.valueOf(h.chat_text_message_full_item));
            sKeys.put("layout/chat_text_message_head_item_0", Integer.valueOf(h.chat_text_message_head_item));
            sKeys.put("layout/chat_text_message_tail_item_0", Integer.valueOf(h.chat_text_message_tail_item));
            sKeys.put("layout/chat_transfer_dialog_message_item_0", Integer.valueOf(h.chat_transfer_dialog_message_item));
            sKeys.put("layout/chat_user_file_message_item_0", Integer.valueOf(h.chat_user_file_message_item));
            sKeys.put("layout/chat_user_image_message_item_0", Integer.valueOf(h.chat_user_image_message_item));
            sKeys.put("layout/chat_user_text_message_item_0", Integer.valueOf(h.chat_user_text_message_item));
            sKeys.put("layout/fragment_chat_0", Integer.valueOf(h.fragment_chat));
            sKeys.put("layout/fragment_micro_room_list_0", Integer.valueOf(h.fragment_micro_room_list));
            sKeys.put("layout/fragment_room_0", Integer.valueOf(h.fragment_room));
            sKeys.put("layout/fragment_room_list_0", Integer.valueOf(h.fragment_room_list));
        }
    }

    static {
        INTERNAL_LAYOUT_ID_LOOKUP.put(h.activity_chat, 1);
        INTERNAL_LAYOUT_ID_LOOKUP.put(h.chat_attachment_image_item, 2);
        INTERNAL_LAYOUT_ID_LOOKUP.put(h.chat_dialog_cant_send_reason, 3);
        INTERNAL_LAYOUT_ID_LOOKUP.put(h.chat_dialog_feedback, 4);
        INTERNAL_LAYOUT_ID_LOOKUP.put(h.chat_dialog_message_options, 5);
        INTERNAL_LAYOUT_ID_LOOKUP.put(h.chat_dialog_user_info, 6);
        INTERNAL_LAYOUT_ID_LOOKUP.put(h.chat_empty_item, 7);
        INTERNAL_LAYOUT_ID_LOOKUP.put(h.chat_file_message_body_item, 8);
        INTERNAL_LAYOUT_ID_LOOKUP.put(h.chat_file_message_full_item, 9);
        INTERNAL_LAYOUT_ID_LOOKUP.put(h.chat_file_message_head_item, 10);
        INTERNAL_LAYOUT_ID_LOOKUP.put(h.chat_file_message_tail_item, 11);
        INTERNAL_LAYOUT_ID_LOOKUP.put(h.chat_file_picker_empty_item, 12);
        INTERNAL_LAYOUT_ID_LOOKUP.put(h.chat_file_picker_item, 13);
        INTERNAL_LAYOUT_ID_LOOKUP.put(h.chat_fragment_attachment_picker, 14);
        INTERNAL_LAYOUT_ID_LOOKUP.put(h.chat_fragment_file_picker, 15);
        INTERNAL_LAYOUT_ID_LOOKUP.put(h.chat_fragment_image_preview, 16);
        INTERNAL_LAYOUT_ID_LOOKUP.put(h.chat_fragment_image_preview_slider, 17);
        INTERNAL_LAYOUT_ID_LOOKUP.put(h.chat_fragment_search_room, 18);
        INTERNAL_LAYOUT_ID_LOOKUP.put(h.chat_image_message_body_item, 19);
        INTERNAL_LAYOUT_ID_LOOKUP.put(h.chat_image_message_full_item, 20);
        INTERNAL_LAYOUT_ID_LOOKUP.put(h.chat_image_message_head_item, 21);
        INTERNAL_LAYOUT_ID_LOOKUP.put(h.chat_image_message_tail_item, 22);
        INTERNAL_LAYOUT_ID_LOOKUP.put(h.chat_item, 23);
        INTERNAL_LAYOUT_ID_LOOKUP.put(h.chat_like_dislike_message_item, 24);
        INTERNAL_LAYOUT_ID_LOOKUP.put(h.chat_load_more_item, 25);
        INTERNAL_LAYOUT_ID_LOOKUP.put(h.chat_loading_item, 26);
        INTERNAL_LAYOUT_ID_LOOKUP.put(h.chat_micro_item, 27);
        INTERNAL_LAYOUT_ID_LOOKUP.put(h.chat_rate_message_item, 28);
        INTERNAL_LAYOUT_ID_LOOKUP.put(h.chat_room_cant_send_layout, 29);
        INTERNAL_LAYOUT_ID_LOOKUP.put(h.chat_room_private_toolbar, 30);
        INTERNAL_LAYOUT_ID_LOOKUP.put(h.chat_room_public_toolbar, 31);
        INTERNAL_LAYOUT_ID_LOOKUP.put(h.chat_room_send_layout, 32);
        INTERNAL_LAYOUT_ID_LOOKUP.put(h.chat_room_support_toolbar, 33);
        INTERNAL_LAYOUT_ID_LOOKUP.put(h.chat_suggestion_message_item, 34);
        INTERNAL_LAYOUT_ID_LOOKUP.put(h.chat_text_message_body_item, 35);
        INTERNAL_LAYOUT_ID_LOOKUP.put(h.chat_text_message_full_item, 36);
        INTERNAL_LAYOUT_ID_LOOKUP.put(h.chat_text_message_head_item, 37);
        INTERNAL_LAYOUT_ID_LOOKUP.put(h.chat_text_message_tail_item, 38);
        INTERNAL_LAYOUT_ID_LOOKUP.put(h.chat_transfer_dialog_message_item, 39);
        INTERNAL_LAYOUT_ID_LOOKUP.put(h.chat_user_file_message_item, 40);
        INTERNAL_LAYOUT_ID_LOOKUP.put(h.chat_user_image_message_item, 41);
        INTERNAL_LAYOUT_ID_LOOKUP.put(h.chat_user_text_message_item, 42);
        INTERNAL_LAYOUT_ID_LOOKUP.put(h.fragment_chat, 43);
        INTERNAL_LAYOUT_ID_LOOKUP.put(h.fragment_micro_room_list, 44);
        INTERNAL_LAYOUT_ID_LOOKUP.put(h.fragment_room, 45);
        INTERNAL_LAYOUT_ID_LOOKUP.put(h.fragment_room_list, 46);
    }

    public ViewDataBinding getDataBinder(DataBindingComponent dataBindingComponent, View view, int i) {
        i = INTERNAL_LAYOUT_ID_LOOKUP.get(i);
        if (i > 0) {
            Object tag = view.getTag();
            if (tag != null) {
                StringBuilder stringBuilder;
                switch (i) {
                    case 1:
                        if ("layout/activity_chat_0".equals(tag)) {
                            return new com.iqoption.chat.a.b(dataBindingComponent, view);
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("The tag for activity_chat is invalid. Received: ");
                        stringBuilder.append(tag);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    case 2:
                        if ("layout/chat_attachment_image_item_0".equals(tag)) {
                            return new d(dataBindingComponent, view);
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("The tag for chat_attachment_image_item is invalid. Received: ");
                        stringBuilder.append(tag);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    case 3:
                        if ("layout/chat_dialog_cant_send_reason_0".equals(tag)) {
                            return new f(dataBindingComponent, view);
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("The tag for chat_dialog_cant_send_reason is invalid. Received: ");
                        stringBuilder.append(tag);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    case 4:
                        if ("layout/chat_dialog_feedback_0".equals(tag)) {
                            return new com.iqoption.chat.a.h(dataBindingComponent, view);
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("The tag for chat_dialog_feedback is invalid. Received: ");
                        stringBuilder.append(tag);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    case 5:
                        if ("layout/chat_dialog_message_options_0".equals(tag)) {
                            return new j(dataBindingComponent, view);
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("The tag for chat_dialog_message_options is invalid. Received: ");
                        stringBuilder.append(tag);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    case 6:
                        if ("layout/chat_dialog_user_info_0".equals(tag)) {
                            return new l(dataBindingComponent, view);
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("The tag for chat_dialog_user_info is invalid. Received: ");
                        stringBuilder.append(tag);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    case 7:
                        if ("layout/chat_empty_item_0".equals(tag)) {
                            return new n(dataBindingComponent, view);
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("The tag for chat_empty_item is invalid. Received: ");
                        stringBuilder.append(tag);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    case 8:
                        if ("layout/chat_file_message_body_item_0".equals(tag)) {
                            return new p(dataBindingComponent, view);
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("The tag for chat_file_message_body_item is invalid. Received: ");
                        stringBuilder.append(tag);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    case 9:
                        if ("layout/chat_file_message_full_item_0".equals(tag)) {
                            return new r(dataBindingComponent, view);
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("The tag for chat_file_message_full_item is invalid. Received: ");
                        stringBuilder.append(tag);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    case 10:
                        if ("layout/chat_file_message_head_item_0".equals(tag)) {
                            return new t(dataBindingComponent, view);
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("The tag for chat_file_message_head_item is invalid. Received: ");
                        stringBuilder.append(tag);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    case 11:
                        if ("layout/chat_file_message_tail_item_0".equals(tag)) {
                            return new v(dataBindingComponent, view);
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("The tag for chat_file_message_tail_item is invalid. Received: ");
                        stringBuilder.append(tag);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    case 12:
                        if ("layout/chat_file_picker_empty_item_0".equals(tag)) {
                            return new x(dataBindingComponent, view);
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("The tag for chat_file_picker_empty_item is invalid. Received: ");
                        stringBuilder.append(tag);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    case 13:
                        if ("layout/chat_file_picker_item_0".equals(tag)) {
                            return new z(dataBindingComponent, view);
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("The tag for chat_file_picker_item is invalid. Received: ");
                        stringBuilder.append(tag);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    case 14:
                        if ("layout/chat_fragment_attachment_picker_0".equals(tag)) {
                            return new ab(dataBindingComponent, view);
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("The tag for chat_fragment_attachment_picker is invalid. Received: ");
                        stringBuilder.append(tag);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    case 15:
                        if ("layout/chat_fragment_file_picker_0".equals(tag)) {
                            return new ad(dataBindingComponent, view);
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("The tag for chat_fragment_file_picker is invalid. Received: ");
                        stringBuilder.append(tag);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    case 16:
                        if ("layout/chat_fragment_image_preview_0".equals(tag)) {
                            return new af(dataBindingComponent, view);
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("The tag for chat_fragment_image_preview is invalid. Received: ");
                        stringBuilder.append(tag);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    case 17:
                        if ("layout/chat_fragment_image_preview_slider_0".equals(tag)) {
                            return new ah(dataBindingComponent, view);
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("The tag for chat_fragment_image_preview_slider is invalid. Received: ");
                        stringBuilder.append(tag);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    case 18:
                        if ("layout/chat_fragment_search_room_0".equals(tag)) {
                            return new aj(dataBindingComponent, view);
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("The tag for chat_fragment_search_room is invalid. Received: ");
                        stringBuilder.append(tag);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    case 19:
                        if ("layout/chat_image_message_body_item_0".equals(tag)) {
                            return new al(dataBindingComponent, view);
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("The tag for chat_image_message_body_item is invalid. Received: ");
                        stringBuilder.append(tag);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    case 20:
                        if ("layout/chat_image_message_full_item_0".equals(tag)) {
                            return new an(dataBindingComponent, view);
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("The tag for chat_image_message_full_item is invalid. Received: ");
                        stringBuilder.append(tag);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    case 21:
                        if ("layout/chat_image_message_head_item_0".equals(tag)) {
                            return new ap(dataBindingComponent, view);
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("The tag for chat_image_message_head_item is invalid. Received: ");
                        stringBuilder.append(tag);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    case 22:
                        if ("layout/chat_image_message_tail_item_0".equals(tag)) {
                            return new ar(dataBindingComponent, view);
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("The tag for chat_image_message_tail_item is invalid. Received: ");
                        stringBuilder.append(tag);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    case 23:
                        if ("layout/chat_item_0".equals(tag)) {
                            return new at(dataBindingComponent, view);
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("The tag for chat_item is invalid. Received: ");
                        stringBuilder.append(tag);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    case 24:
                        if ("layout/chat_like_dislike_message_item_0".equals(tag)) {
                            return new av(dataBindingComponent, view);
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("The tag for chat_like_dislike_message_item is invalid. Received: ");
                        stringBuilder.append(tag);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    case 25:
                        if ("layout/chat_load_more_item_0".equals(tag)) {
                            return new ax(dataBindingComponent, view);
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("The tag for chat_load_more_item is invalid. Received: ");
                        stringBuilder.append(tag);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    case 26:
                        if ("layout/chat_loading_item_0".equals(tag)) {
                            return new az(dataBindingComponent, view);
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("The tag for chat_loading_item is invalid. Received: ");
                        stringBuilder.append(tag);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    case 27:
                        if ("layout/chat_micro_item_0".equals(tag)) {
                            return new bb(dataBindingComponent, view);
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("The tag for chat_micro_item is invalid. Received: ");
                        stringBuilder.append(tag);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    case 28:
                        if ("layout/chat_rate_message_item_0".equals(tag)) {
                            return new bd(dataBindingComponent, view);
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("The tag for chat_rate_message_item is invalid. Received: ");
                        stringBuilder.append(tag);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    case 29:
                        if ("layout/chat_room_cant_send_layout_0".equals(tag)) {
                            return new bf(dataBindingComponent, view);
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("The tag for chat_room_cant_send_layout is invalid. Received: ");
                        stringBuilder.append(tag);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    case 30:
                        if ("layout/chat_room_private_toolbar_0".equals(tag)) {
                            return new bh(dataBindingComponent, view);
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("The tag for chat_room_private_toolbar is invalid. Received: ");
                        stringBuilder.append(tag);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    case 31:
                        if ("layout-land/chat_room_public_toolbar_0".equals(tag)) {
                            return new bk(dataBindingComponent, view);
                        }
                        if ("layout/chat_room_public_toolbar_0".equals(tag)) {
                            return new bj(dataBindingComponent, view);
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("The tag for chat_room_public_toolbar is invalid. Received: ");
                        stringBuilder.append(tag);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    case 32:
                        if ("layout/chat_room_send_layout_0".equals(tag)) {
                            return new bm(dataBindingComponent, view);
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("The tag for chat_room_send_layout is invalid. Received: ");
                        stringBuilder.append(tag);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    case 33:
                        if ("layout-land/chat_room_support_toolbar_0".equals(tag)) {
                            return new bp(dataBindingComponent, view);
                        }
                        if ("layout/chat_room_support_toolbar_0".equals(tag)) {
                            return new bo(dataBindingComponent, view);
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("The tag for chat_room_support_toolbar is invalid. Received: ");
                        stringBuilder.append(tag);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    case 34:
                        if ("layout/chat_suggestion_message_item_0".equals(tag)) {
                            return new br(dataBindingComponent, view);
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("The tag for chat_suggestion_message_item is invalid. Received: ");
                        stringBuilder.append(tag);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    case 35:
                        if ("layout/chat_text_message_body_item_0".equals(tag)) {
                            return new bt(dataBindingComponent, view);
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("The tag for chat_text_message_body_item is invalid. Received: ");
                        stringBuilder.append(tag);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    case 36:
                        if ("layout/chat_text_message_full_item_0".equals(tag)) {
                            return new bv(dataBindingComponent, view);
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("The tag for chat_text_message_full_item is invalid. Received: ");
                        stringBuilder.append(tag);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    case 37:
                        if ("layout/chat_text_message_head_item_0".equals(tag)) {
                            return new bx(dataBindingComponent, view);
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("The tag for chat_text_message_head_item is invalid. Received: ");
                        stringBuilder.append(tag);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    case 38:
                        if ("layout/chat_text_message_tail_item_0".equals(tag)) {
                            return new bz(dataBindingComponent, view);
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("The tag for chat_text_message_tail_item is invalid. Received: ");
                        stringBuilder.append(tag);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    case 39:
                        if ("layout/chat_transfer_dialog_message_item_0".equals(tag)) {
                            return new cb(dataBindingComponent, view);
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("The tag for chat_transfer_dialog_message_item is invalid. Received: ");
                        stringBuilder.append(tag);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    case 40:
                        if ("layout/chat_user_file_message_item_0".equals(tag)) {
                            return new cd(dataBindingComponent, view);
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("The tag for chat_user_file_message_item is invalid. Received: ");
                        stringBuilder.append(tag);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    case 41:
                        if ("layout/chat_user_image_message_item_0".equals(tag)) {
                            return new cf(dataBindingComponent, view);
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("The tag for chat_user_image_message_item is invalid. Received: ");
                        stringBuilder.append(tag);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    case 42:
                        if ("layout/chat_user_text_message_item_0".equals(tag)) {
                            return new ch(dataBindingComponent, view);
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("The tag for chat_user_text_message_item is invalid. Received: ");
                        stringBuilder.append(tag);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    case 43:
                        if ("layout/fragment_chat_0".equals(tag)) {
                            return new cj(dataBindingComponent, view);
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("The tag for fragment_chat is invalid. Received: ");
                        stringBuilder.append(tag);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    case 44:
                        if ("layout/fragment_micro_room_list_0".equals(tag)) {
                            return new cl(dataBindingComponent, view);
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("The tag for fragment_micro_room_list is invalid. Received: ");
                        stringBuilder.append(tag);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    case 45:
                        if ("layout/fragment_room_0".equals(tag)) {
                            return new cn(dataBindingComponent, view);
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("The tag for fragment_room is invalid. Received: ");
                        stringBuilder.append(tag);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    case 46:
                        if ("layout/fragment_room_list_0".equals(tag)) {
                            return new cp(dataBindingComponent, view);
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("The tag for fragment_room_list is invalid. Received: ");
                        stringBuilder.append(tag);
                        throw new IllegalArgumentException(stringBuilder.toString());
                }
            }
            throw new RuntimeException("view must have a tag");
        }
        return null;
    }

    public ViewDataBinding getDataBinder(DataBindingComponent dataBindingComponent, View[] viewArr, int i) {
        if (viewArr == null || viewArr.length == 0 || INTERNAL_LAYOUT_ID_LOOKUP.get(i) <= 0 || viewArr[0].getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
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
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(new DataBinderMapperImpl());
        arrayList.add(new com.iqoption.config.b());
        arrayList.add(new c());
        arrayList.add(new com.iqoption.i.a());
        return arrayList;
    }
}
