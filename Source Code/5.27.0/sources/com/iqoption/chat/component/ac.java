package com.iqoption.chat.component;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.drawable.Drawable;
import android.text.style.TextAppearanceSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.ColorRes;
import androidx.annotation.DimenRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.PluralsRes;
import androidx.annotation.StringRes;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.DiffUtil.DiffResult;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.iqoption.chat.a.ak;
import com.iqoption.chat.a.am;
import com.iqoption.chat.a.ao;
import com.iqoption.chat.a.aq;
import com.iqoption.chat.a.au;
import com.iqoption.chat.a.aw;
import com.iqoption.chat.a.ay;
import com.iqoption.chat.a.bc;
import com.iqoption.chat.a.bq;
import com.iqoption.chat.a.bs;
import com.iqoption.chat.a.bu;
import com.iqoption.chat.a.bw;
import com.iqoption.chat.a.by;
import com.iqoption.chat.a.ca;
import com.iqoption.chat.a.cc;
import com.iqoption.chat.a.ce;
import com.iqoption.chat.a.cg;
import com.iqoption.chat.fragment.MessageView;
import com.iqoption.core.data.config.ApiConfig;
import com.iqoption.core.microservices.chat.response.ChatMessageType;
import com.iqoption.core.ui.widget.StarBar;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.RequestCreator;
import com.squareup.picasso.Transformation;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;
import kotlin.TypeCastException;

@kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000ú\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 °\u00012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u00012\u00020\u0003:\u0006°\u0001±\u0001²\u0001B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\u0018\u0010X\u001a\u00020\f2\u0006\u0010Y\u001a\u00020\n2\u0006\u0010Z\u001a\u00020[H\u0002J(\u0010\\\u001a\u00020\f2\u0006\u0010Y\u001a\u00020\n2\u0006\u0010]\u001a\u00020\u001c2\u0006\u0010^\u001a\u00020_2\u0006\u0010Z\u001a\u00020[H\u0002J\u0018\u0010`\u001a\u00020\f2\u0006\u0010Y\u001a\u00020\n2\u0006\u0010a\u001a\u00020bH\u0002J\u0018\u0010c\u001a\u00020\f2\u0006\u0010d\u001a\u00020\u000b2\u0006\u0010e\u001a\u00020[H\u0002J\u0013\u0010f\u001a\u00020\u001c2\b\b\u0001\u0010g\u001a\u00020\u001cH\u0001J\u0015\u0010h\u001a\u0004\u0018\u00010\u001a2\b\b\u0001\u0010g\u001a\u00020\u001cH\u0001J\b\u0010i\u001a\u00020\u001cH\u0016J\u0010\u0010j\u001a\u00020k2\u0006\u0010l\u001a\u00020\u001cH\u0016J\u0010\u0010m\u001a\u00020\u001c2\u0006\u0010l\u001a\u00020\u001cH\u0016J\u0010\u0010n\u001a\u0004\u0018\u00010\n2\u0006\u0010o\u001a\u00020\u001cJ%\u0010p\u001a\u00020q2\b\b\u0001\u0010g\u001a\u00020\u001c2\u0006\u0010r\u001a\u00020\u001c2\b\b\u0002\u0010s\u001a\u000200H\u0001J<\u0010t\u001a\n u*\u0004\u0018\u00010&0&2\b\b\u0001\u0010g\u001a\u00020\u001c2\u0006\u0010r\u001a\u00020\u001c2\u0012\u0010v\u001a\n\u0012\u0006\b\u0001\u0012\u00020x0w\"\u00020xH\u0001¢\u0006\u0002\u0010yJ\u0013\u0010z\u001a\u00020{2\b\b\u0001\u0010g\u001a\u00020\u001cH\u0001J\u0013\u0010|\u001a\u00020\u001c2\b\b\u0001\u0010g\u001a\u00020\u001cH\u0001J0\u0010}\u001a\u00020&2\b\b\u0001\u0010g\u001a\u00020\u001c2\u0016\u0010v\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010x0w\"\u0004\u0018\u00010xH\u0001¢\u0006\u0002\u0010~J\u0010\u0010\u001a\u0004\u0018\u00010L2\u0006\u0010o\u001a\u00020\u001cJ2\u0010\u0001\u001a\u0003H\u0001\"\f\b\u0000\u0010\u0001\u0018\u0001*\u00030\u00012\u0007\u0010\u0001\u001a\u00020\u001c2\b\u0010\u0001\u001a\u00030\u0001H\b¢\u0006\u0003\u0010\u0001J\u0013\u0010\u0001\u001a\u00020\f2\b\u0010\u0001\u001a\u00030\u0001H\u0016J\u001e\u0010\u0001\u001a\u00020\f2\u000b\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010l\u001a\u00020\u001cH\u0016J#\u0010\u0001\u001a\t\u0012\u0005\u0012\u00030\u00010\u00022\b\u0010\u0001\u001a\u00030\u00012\u0007\u0010\u0001\u001a\u00020\u001cH\u0016J%\u0010\u0001\u001a\u00020\f2\u0010\u0010\u0001\u001a\u000b\u0012\u0004\u0012\u000206\u0018\u00010\u00012\n\u0010\u0001\u001a\u0005\u0018\u00010\u0001J\u0010\u0010\u0001\u001a\u00020\f2\u0007\u0010\u0001\u001a\u00020&J\u001e\u0010\u0001\u001a\u00020\f*\u00030\u00012\u0006\u0010d\u001a\u00020\u000b2\u0006\u0010Y\u001a\u00020\nH\u0002J\u001e\u0010\u0001\u001a\u00020\f*\u00030\u00012\u0006\u0010d\u001a\u00020\u000b2\u0006\u0010Y\u001a\u00020\nH\u0002J\u001e\u0010\u0001\u001a\u00020\f*\u00030\u00012\u0006\u0010d\u001a\u00020\u000b2\u0006\u0010Y\u001a\u00020\nH\u0002J\u001e\u0010\u0001\u001a\u00020\f*\u00030\u00012\u0006\u0010d\u001a\u00020\u000b2\u0006\u0010Y\u001a\u00020\nH\u0002J\u001e\u0010\u0001\u001a\u00020\f*\u00030\u00012\u0006\u0010d\u001a\u00020\u000b2\u0006\u0010Y\u001a\u00020\nH\u0002J\u001e\u0010\u0001\u001a\u00020\f*\u00030\u00012\u0006\u0010d\u001a\u00020\u000b2\u0006\u0010Y\u001a\u00020\nH\u0002J\u001e\u0010\u0001\u001a\u00020\f*\u00030\u00012\u0006\u0010d\u001a\u00020\u000b2\u0006\u0010Y\u001a\u00020\nH\u0002J\u001e\u0010\u0001\u001a\u00020\f*\u00030\u00012\u0006\u0010d\u001a\u00020\u000b2\u0006\u0010Y\u001a\u00020\nH\u0002J\u001e\u0010\u0001\u001a\u00020\f*\u00030\u00012\u0006\u0010Y\u001a\u00020\n2\u0006\u0010]\u001a\u00020\u001cH\u0002J\u001e\u0010\u0001\u001a\u00020\f*\u00030\u00012\u0006\u0010Y\u001a\u00020\n2\u0006\u0010]\u001a\u00020\u001cH\u0002J\u0017\u0010\u0001\u001a\u00020\f*\u00030 \u00012\u0007\u0010¡\u0001\u001a\u00020LH\u0002J\u0016\u0010\u0001\u001a\u00020\f*\u00030¢\u00012\u0006\u0010Y\u001a\u00020\nH\u0002J\u0016\u0010\u0001\u001a\u00020\f*\u00030£\u00012\u0006\u0010Y\u001a\u00020\nH\u0002J\u0016\u0010\u0001\u001a\u00020\f*\u00030¤\u00012\u0006\u0010Y\u001a\u00020\nH\u0002J\u0016\u0010\u0001\u001a\u00020\f*\u00030¥\u00012\u0006\u0010Y\u001a\u00020\nH\u0002J\u001e\u0010\u0001\u001a\u00020\f*\u00030¦\u00012\u0006\u0010Y\u001a\u00020\n2\u0006\u0010]\u001a\u00020\u001cH\u0002J&\u0010\u0001\u001a\u00020\f*\u00030§\u00012\u0006\u0010Y\u001a\u00020\n2\u0006\u0010d\u001a\u00020\u000b2\u0006\u0010]\u001a\u00020\u001cH\u0002J\u001e\u0010\u0001\u001a\u00020\f*\u00030¨\u00012\u0006\u0010Y\u001a\u00020\n2\u0006\u0010d\u001a\u00020\u000bH\u0002J\u001e\u0010\u0001\u001a\u00020\f*\u00030©\u00012\u0006\u0010Y\u001a\u00020\n2\u0006\u0010]\u001a\u00020\u001cH\u0002J\u000f\u0010ª\u0001\u001a\u0004\u0018\u00010&*\u00020\u000bH\u0002J \u0010«\u0001\u001a\u00020\f*\u00030\u00012\u0007\u0010¬\u0001\u001a\u0002002\u0007\u0010­\u0001\u001a\u000200H\u0002J\u0017\u0010®\u0001\u001a\u00020\f*\u00030\u00012\u0007\u0010¯\u0001\u001a\u000200H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X.¢\u0006\u0002\n\u0000R4\u0010\b\u001a\u001c\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\tj\u0004\u0018\u0001`\rX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R.\u0010\u0012\u001a\u0016\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0013j\u0004\u0018\u0001`\u0014X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u000e\u0010\u0019\u001a\u00020\u001aX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001eX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020 X.¢\u0006\u0002\n\u0000R\u0012\u0010!\u001a\u00020\"X\u0005¢\u0006\u0006\u001a\u0004\b#\u0010$R\u001a\u0010%\u001a\u00020&X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u000e\u0010+\u001a\u00020,X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020.X.¢\u0006\u0002\n\u0000R\u001a\u0010/\u001a\u000200X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u00101\"\u0004\b2\u00103R\u0014\u00104\u001a\b\u0012\u0004\u0012\u00020605X\u0004¢\u0006\u0002\n\u0000R4\u00107\u001a\u001c\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00020\f\u0018\u00010\tj\u0004\u0018\u0001`8X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b9\u0010\u000f\"\u0004\b:\u0010\u0011R.\u0010;\u001a\u0016\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0013j\u0004\u0018\u0001`\u0014X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b<\u0010\u0016\"\u0004\b=\u0010\u0018R\u000e\u0010>\u001a\u00020 X.¢\u0006\u0002\n\u0000R\u000e\u0010?\u001a\u00020@X.¢\u0006\u0002\n\u0000R\u000e\u0010A\u001a\u00020\u001cX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010B\u001a\u00020CX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010D\u001a\u00020\u001cX\u0004¢\u0006\u0002\n\u0000R\u001c\u0010E\u001a\u0004\u0018\u00010FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR.\u0010K\u001a\u0016\u0012\u0004\u0012\u00020L\u0012\u0004\u0012\u00020\f\u0018\u00010\u0013j\u0004\u0018\u0001`MX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bN\u0010\u0016\"\u0004\bO\u0010\u0018R\u000e\u0010P\u001a\u00020QX\u0004¢\u0006\u0002\n\u0000R.\u0010R\u001a\u0016\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0013j\u0004\u0018\u0001`SX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bT\u0010\u0016\"\u0004\bU\u0010\u0018R\u0012\u0010V\u001a\u00060WR\u00020\u0000X\u0004¢\u0006\u0002\n\u0000¨\u0006³\u0001"}, bng = {"Lcom/iqoption/chat/component/MessagesAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/iqoption/chat/component/ViewHolder;", "Lcom/iqoption/chat/Resourcer;", "resourcer", "(Lcom/iqoption/chat/Resourcer;)V", "assetManager", "Landroid/content/res/AssetManager;", "attachmentClickListener", "Lkotlin/Function2;", "Lcom/iqoption/core/microservices/chat/response/ChatMessage;", "Lcom/iqoption/core/microservices/chat/response/ChatAttachment;", "", "Lcom/iqoption/chat/component/AttachmentClickListener;", "getAttachmentClickListener", "()Lkotlin/jvm/functions/Function2;", "setAttachmentClickListener", "(Lkotlin/jvm/functions/Function2;)V", "avatarClickListener", "Lkotlin/Function1;", "Lcom/iqoption/chat/component/MessageClickListener;", "getAvatarClickListener", "()Lkotlin/jvm/functions/Function1;", "setAvatarClickListener", "(Lkotlin/jvm/functions/Function1;)V", "avatarPlaceholder", "Landroid/graphics/drawable/Drawable;", "avatarSize", "", "avatarTransformation", "Lcom/iqoption/core/ui/picasso/CircleTransformation;", "boldDateSpan", "Landroid/text/style/TextAppearanceSpan;", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "emptyText", "", "getEmptyText", "()Ljava/lang/String;", "setEmptyText", "(Ljava/lang/String;)V", "idSupplier", "Lcom/iqoption/chat/component/MessageIdSupplier;", "inflater", "Landroid/view/LayoutInflater;", "isLoading", "", "()Z", "setLoading", "(Z)V", "items", "", "Lcom/iqoption/chat/component/MessageAdapterItem;", "likeDislikeClickListener", "Lcom/iqoption/chat/component/LikeDislikeClickListener;", "getLikeDislikeClickListener", "setLikeDislikeClickListener", "messageClickListener", "getMessageClickListener", "setMessageClickListener", "normalDateSpan", "picasso", "Lcom/squareup/picasso/Picasso;", "previewHeight", "previewRectTransformation", "Lcom/iqoption/core/ui/picasso/RoundedRectTransformation;", "previewWidth", "ratingChangeListener", "Lcom/iqoption/chat/component/MessagesAdapter$RatingChangeListener;", "getRatingChangeListener", "()Lcom/iqoption/chat/component/MessagesAdapter$RatingChangeListener;", "setRatingChangeListener", "(Lcom/iqoption/chat/component/MessagesAdapter$RatingChangeListener;)V", "suggestionClickListener", "Lcom/iqoption/core/microservices/chat/response/ChatSuggestion;", "Lcom/iqoption/chat/component/SuggestionClickListener;", "getSuggestionClickListener", "setSuggestionClickListener", "timeFormat", "Ljava/text/SimpleDateFormat;", "transferDialogClickListener", "Lcom/iqoption/chat/component/TransferDialogClickListener;", "getTransferDialogClickListener", "setTransferDialogClickListener", "viewTypeSupplier", "Lcom/iqoption/chat/component/MessagesAdapter$ViewTypeSupplier;", "bindAvatar", "msg", "avatar", "Landroid/widget/ImageView;", "bindBubble", "bubble", "author", "Landroid/widget/TextView;", "bindMessage", "message", "Lcom/iqoption/chat/fragment/MessageView;", "bindPreview", "att", "preview", "getColor", "id", "getDrawable", "getItemCount", "getItemId", "", "position", "getItemViewType", "getMsg", "pos", "getPlural", "", "quantity", "formatQuantity", "getPluralFormat", "kotlin.jvm.PlatformType", "formatArgs", "", "", "(II[Ljava/lang/Object;)Ljava/lang/String;", "getPxFloat", "", "getPxInt", "getString", "(I[Ljava/lang/Object;)Ljava/lang/String;", "getSuggest", "inflate", "T", "Landroidx/databinding/ViewDataBinding;", "layoutRes", "parent", "Landroid/view/ViewGroup;", "(ILandroid/view/ViewGroup;)Landroidx/databinding/ViewDataBinding;", "onAttachedToRecyclerView", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "onBindViewHolder", "holder", "onCreateViewHolder", "viewType", "setItems", "list", "", "diffResult", "Landroidx/recyclerview/widget/DiffUtil$DiffResult;", "updateMessage", "messageId", "bind", "Lcom/iqoption/chat/component/FileMessageBodyViewHolder;", "Lcom/iqoption/chat/component/FileMessageFullViewHolder;", "Lcom/iqoption/chat/component/FileMessageHeadViewHolder;", "Lcom/iqoption/chat/component/FileMessageTailViewHolder;", "Lcom/iqoption/chat/component/ImageMessageBodyViewHolder;", "Lcom/iqoption/chat/component/ImageMessageFullViewHolder;", "Lcom/iqoption/chat/component/ImageMessageHeadViewHolder;", "Lcom/iqoption/chat/component/ImageMessageTailViewHolder;", "Lcom/iqoption/chat/component/LikeDislikeViewHolder;", "Lcom/iqoption/chat/component/RateMessageViewHolder;", "Lcom/iqoption/chat/component/SuggestionViewHolder;", "sugg", "Lcom/iqoption/chat/component/TextMessageBodyViewHolder;", "Lcom/iqoption/chat/component/TextMessageFullViewHolder;", "Lcom/iqoption/chat/component/TextMessageHeadViewHolder;", "Lcom/iqoption/chat/component/TextMessageTailViewHolder;", "Lcom/iqoption/chat/component/TransferDialogViewHolder;", "Lcom/iqoption/chat/component/UserFileMessageViewHolder;", "Lcom/iqoption/chat/component/UserImageMessageViewHolder;", "Lcom/iqoption/chat/component/UserTextMessageViewHolder;", "formatFileName", "setActivated", "isLikeActive", "isDislikeActive", "setEnabled", "isEnabled", "Companion", "RatingChangeListener", "ViewTypeSupplier", "chat_release"})
/* compiled from: MessagesAdapter.kt */
public final class ac extends Adapter<ax<?>> implements com.iqoption.chat.f {
    private static final String TAG = ac.class.getSimpleName();
    public static final a aPv = new a();
    private String aPb = "";
    private final z aPc = new z();
    private final c aPd = new c();
    private final Drawable aPe;
    private final com.iqoption.core.ui.picasso.a aPf;
    private final int aPg;
    private final com.iqoption.core.ui.picasso.c aPh;
    private final int aPi;
    private final int aPj;
    private final SimpleDateFormat aPk;
    private LayoutInflater aPl;
    private TextAppearanceSpan aPm;
    private TextAppearanceSpan aPn;
    private kotlin.jvm.a.b<? super com.iqoption.core.microservices.chat.response.e, kotlin.l> aPo;
    private kotlin.jvm.a.b<? super com.iqoption.core.microservices.chat.response.e, kotlin.l> aPp;
    private b aPq;
    private kotlin.jvm.a.m<? super com.iqoption.core.microservices.chat.response.e, ? super com.iqoption.core.microservices.chat.response.a, kotlin.l> aPr;
    private kotlin.jvm.a.m<? super com.iqoption.core.microservices.chat.response.e, ? super Boolean, kotlin.l> aPs;
    private kotlin.jvm.a.b<? super com.iqoption.core.microservices.chat.response.e, kotlin.l> aPt;
    private kotlin.jvm.a.b<? super com.iqoption.core.microservices.chat.response.m, kotlin.l> aPu;
    private final /* synthetic */ com.iqoption.chat.f aPw;
    private boolean anr = true;
    private AssetManager assetManager;
    private final List<y> iA = new ArrayList();
    private Picasso picasso;

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0016\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000¨\u0006\u001d"}, bng = {"Lcom/iqoption/chat/component/MessagesAdapter$Companion;", "", "()V", "TAG", "", "kotlin.jvm.PlatformType", "VIEW_TYPE_EMPTY", "", "VIEW_TYPE_FILE_MESSAGE_BODY", "VIEW_TYPE_FILE_MESSAGE_FULL", "VIEW_TYPE_FILE_MESSAGE_HEAD", "VIEW_TYPE_FILE_MESSAGE_TAIL", "VIEW_TYPE_IMAGE_MESSAGE_BODY", "VIEW_TYPE_IMAGE_MESSAGE_FULL", "VIEW_TYPE_IMAGE_MESSAGE_HEAD", "VIEW_TYPE_IMAGE_MESSAGE_TAIL", "VIEW_TYPE_LIKE_DISLIKE", "VIEW_TYPE_LOADING", "VIEW_TYPE_LOAD_MORE", "VIEW_TYPE_RATE_MESSAGE", "VIEW_TYPE_SUGGESTION", "VIEW_TYPE_TEXT_MESSAGE_BODY", "VIEW_TYPE_TEXT_MESSAGE_FULL", "VIEW_TYPE_TEXT_MESSAGE_HEAD", "VIEW_TYPE_TEXT_MESSAGE_TAIL", "VIEW_TYPE_TRANSFER_DIALOG", "VIEW_TYPE_USER_FILE_MESSAGE", "VIEW_TYPE_USER_IMAGE_MESSAGE", "VIEW_TYPE_USER_TEXT_MESSAGE", "chat_release"})
    /* compiled from: MessagesAdapter.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, bng = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/iqoption/chat/component/MessagesAdapter$onCreateViewHolder$5$2"})
    /* compiled from: MessagesAdapter.kt */
    static final class aa implements OnClickListener {
        final /* synthetic */ o aPP;
        final /* synthetic */ ac aPx;

        aa(o oVar, ac acVar) {
            this.aPP = oVar;
            this.aPx = acVar;
        }

        public final void onClick(View view) {
            kotlin.jvm.a.b Rp = this.aPx.Rp();
            if (Rp != null) {
                kotlin.l lVar = (kotlin.l) Rp.invoke(this.aPP.Rn());
            }
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, bng = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/iqoption/chat/component/MessagesAdapter$onCreateViewHolder$6$1"})
    /* compiled from: MessagesAdapter.kt */
    static final class ab implements OnClickListener {
        final /* synthetic */ p aPQ;
        final /* synthetic */ ac aPx;

        ab(p pVar, ac acVar) {
            this.aPQ = pVar;
            this.aPx = acVar;
        }

        public final void onClick(View view) {
            kotlin.jvm.a.m Rr = this.aPx.Rr();
            if (Rr != null) {
                kotlin.l lVar = (kotlin.l) Rr.w(this.aPQ.Rn(), this.aPQ.QU());
            }
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, bng = {"Lcom/iqoption/chat/component/MessagesAdapter$RatingChangeListener;", "", "onRatingChanged", "", "rating", "", "message", "Lcom/iqoption/core/microservices/chat/response/ChatMessage;", "chat_release"})
    /* compiled from: MessagesAdapter.kt */
    public interface b {
        void a(int i, com.iqoption.core.microservices.chat.response.e eVar);
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006\u0006"}, bng = {"Lcom/iqoption/chat/component/MessagesAdapter$ViewTypeSupplier;", "", "(Lcom/iqoption/chat/component/MessagesAdapter;)V", "get", "", "position", "chat_release"})
    /* compiled from: MessagesAdapter.kt */
    private final class c {
        public final int get(int i) {
            y yVar = (y) ac.this.iA.get(i);
            if (yVar instanceof w) {
                return 1;
            }
            if (yVar instanceof e) {
                return 2;
            }
            if (yVar instanceof u) {
                return 3;
            }
            if (yVar instanceof aa) {
                aa aaVar = (aa) yVar;
                if (aaVar.QT().abZ() == ChatMessageType.RATE) {
                    return 18;
                }
                if (aaVar.QT().abZ() == ChatMessageType.CLOSE_DIALOG) {
                    return 22;
                }
                if (aaVar.QT().abZ() == ChatMessageType.TRANSFER) {
                    return 23;
                }
                if (aaVar.QT().abU()) {
                    return 19;
                }
                i = aaVar.QV();
                if (i == 1) {
                    return 7;
                }
                if (i != 2) {
                    return i != 3 ? 6 : 9;
                } else {
                    return 8;
                }
            } else if (yVar instanceof a) {
                a aVar = (a) yVar;
                if (aVar.QT().abU()) {
                    return aVar.QU().abS() ? 20 : 21;
                } else {
                    if (aVar.QU().abS()) {
                        i = aVar.QV();
                        if (i == 1) {
                            return 11;
                        }
                        if (i != 2) {
                            return i != 3 ? 10 : 13;
                        } else {
                            return 12;
                        }
                    }
                    i = aVar.QV();
                    if (i == 1) {
                        return 15;
                    }
                    if (i != 2) {
                        return i != 3 ? 14 : 17;
                    } else {
                        return 16;
                    }
                }
            } else if (yVar instanceof am) {
                return 24;
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, bng = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/iqoption/chat/component/MessagesAdapter$onCreateViewHolder$1$1"})
    /* compiled from: MessagesAdapter.kt */
    static final class d implements OnClickListener {
        final /* synthetic */ ac aPx;
        final /* synthetic */ ap aPy;

        d(ap apVar, ac acVar) {
            this.aPy = apVar;
            this.aPx = acVar;
        }

        public final void onClick(View view) {
            kotlin.jvm.a.b Ro = this.aPx.Ro();
            if (Ro != null) {
                kotlin.l lVar = (kotlin.l) Ro.invoke(this.aPy.Rn());
            }
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, bng = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/iqoption/chat/component/MessagesAdapter$onCreateViewHolder$7$1"})
    /* compiled from: MessagesAdapter.kt */
    static final class e implements OnClickListener {
        final /* synthetic */ ac aPx;
        final /* synthetic */ n aPz;

        e(n nVar, ac acVar) {
            this.aPz = nVar;
            this.aPx = acVar;
        }

        public final void onClick(View view) {
            kotlin.jvm.a.m Rr = this.aPx.Rr();
            if (Rr != null) {
                kotlin.l lVar = (kotlin.l) Rr.w(this.aPz.Rn(), this.aPz.QU());
            }
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, bng = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/iqoption/chat/component/MessagesAdapter$onCreateViewHolder$8$1"})
    /* compiled from: MessagesAdapter.kt */
    static final class f implements OnClickListener {
        final /* synthetic */ q aPA;
        final /* synthetic */ ac aPx;

        f(q qVar, ac acVar) {
            this.aPA = qVar;
            this.aPx = acVar;
        }

        public final void onClick(View view) {
            kotlin.jvm.a.m Rr = this.aPx.Rr();
            if (Rr != null) {
                kotlin.l lVar = (kotlin.l) Rr.w(this.aPA.Rn(), this.aPA.QU());
            }
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, bng = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/iqoption/chat/component/MessagesAdapter$onCreateViewHolder$8$2"})
    /* compiled from: MessagesAdapter.kt */
    static final class g implements OnClickListener {
        final /* synthetic */ q aPA;
        final /* synthetic */ ac aPx;

        g(q qVar, ac acVar) {
            this.aPA = qVar;
            this.aPx = acVar;
        }

        public final void onClick(View view) {
            kotlin.jvm.a.b Rp = this.aPx.Rp();
            if (Rp != null) {
                kotlin.l lVar = (kotlin.l) Rp.invoke(this.aPA.Rn());
            }
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, bng = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/iqoption/chat/component/MessagesAdapter$onCreateViewHolder$9$1"})
    /* compiled from: MessagesAdapter.kt */
    static final class h implements OnClickListener {
        final /* synthetic */ k aPB;
        final /* synthetic */ ac aPx;

        h(k kVar, ac acVar) {
            this.aPB = kVar;
            this.aPx = acVar;
        }

        public final void onClick(View view) {
            kotlin.jvm.a.m Rr = this.aPx.Rr();
            if (Rr != null) {
                kotlin.l lVar = (kotlin.l) Rr.w(this.aPB.Rn(), this.aPB.QU());
            }
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, bng = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/iqoption/chat/component/MessagesAdapter$onCreateViewHolder$9$2"})
    /* compiled from: MessagesAdapter.kt */
    static final class i implements OnClickListener {
        final /* synthetic */ k aPB;
        final /* synthetic */ ac aPx;

        i(k kVar, ac acVar) {
            this.aPB = kVar;
            this.aPx = acVar;
        }

        public final void onClick(View view) {
            kotlin.jvm.a.b Rp = this.aPx.Rp();
            if (Rp != null) {
                kotlin.l lVar = (kotlin.l) Rp.invoke(this.aPB.Rn());
            }
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, bng = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/iqoption/chat/component/MessagesAdapter$onCreateViewHolder$10$1"})
    /* compiled from: MessagesAdapter.kt */
    static final class j implements OnClickListener {
        final /* synthetic */ l aPC;
        final /* synthetic */ ac aPx;

        j(l lVar, ac acVar) {
            this.aPC = lVar;
            this.aPx = acVar;
        }

        public final void onClick(View view) {
            kotlin.jvm.a.m Rr = this.aPx.Rr();
            if (Rr != null) {
                kotlin.l lVar = (kotlin.l) Rr.w(this.aPC.Rn(), this.aPC.QU());
            }
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, bng = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/iqoption/chat/component/MessagesAdapter$onCreateViewHolder$11$1"})
    /* compiled from: MessagesAdapter.kt */
    static final class k implements OnClickListener {
        final /* synthetic */ j aPD;
        final /* synthetic */ ac aPx;

        k(j jVar, ac acVar) {
            this.aPD = jVar;
            this.aPx = acVar;
        }

        public final void onClick(View view) {
            kotlin.jvm.a.m Rr = this.aPx.Rr();
            if (Rr != null) {
                kotlin.l lVar = (kotlin.l) Rr.w(this.aPD.Rn(), this.aPD.QU());
            }
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, bng = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/iqoption/chat/component/MessagesAdapter$onCreateViewHolder$12$1"})
    /* compiled from: MessagesAdapter.kt */
    static final class l implements OnClickListener {
        final /* synthetic */ m aPE;
        final /* synthetic */ ac aPx;

        l(m mVar, ac acVar) {
            this.aPE = mVar;
            this.aPx = acVar;
        }

        public final void onClick(View view) {
            kotlin.jvm.a.m Rr = this.aPx.Rr();
            if (Rr != null) {
                kotlin.l lVar = (kotlin.l) Rr.w(this.aPE.Rn(), this.aPE.QU());
            }
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, bng = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/iqoption/chat/component/MessagesAdapter$onCreateViewHolder$12$2"})
    /* compiled from: MessagesAdapter.kt */
    static final class m implements OnClickListener {
        final /* synthetic */ m aPE;
        final /* synthetic */ ac aPx;

        m(m mVar, ac acVar) {
            this.aPE = mVar;
            this.aPx = acVar;
        }

        public final void onClick(View view) {
            kotlin.jvm.a.b Rp = this.aPx.Rp();
            if (Rp != null) {
                kotlin.l lVar = (kotlin.l) Rp.invoke(this.aPE.Rn());
            }
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, bng = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/iqoption/chat/component/MessagesAdapter$onCreateViewHolder$1$2"})
    /* compiled from: MessagesAdapter.kt */
    static final class o implements OnClickListener {
        final /* synthetic */ ac aPx;
        final /* synthetic */ ap aPy;

        o(ap apVar, ac acVar) {
            this.aPy = apVar;
            this.aPx = acVar;
        }

        public final void onClick(View view) {
            kotlin.jvm.a.b Rp = this.aPx.Rp();
            if (Rp != null) {
                kotlin.l lVar = (kotlin.l) Rp.invoke(this.aPy.Rn());
            }
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, bng = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/iqoption/chat/component/MessagesAdapter$onCreateViewHolder$14$1"})
    /* compiled from: MessagesAdapter.kt */
    static final class p implements OnClickListener {
        final /* synthetic */ av aPG;
        final /* synthetic */ ac aPx;

        p(av avVar, ac acVar) {
            this.aPG = avVar;
            this.aPx = acVar;
        }

        public final void onClick(View view) {
            kotlin.jvm.a.b Ro = this.aPx.Ro();
            if (Ro != null) {
                kotlin.l lVar = (kotlin.l) Ro.invoke(this.aPG.Rn());
            }
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, bng = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/iqoption/chat/component/MessagesAdapter$onCreateViewHolder$15$1"})
    /* compiled from: MessagesAdapter.kt */
    static final class q implements OnClickListener {
        final /* synthetic */ au aPH;
        final /* synthetic */ ac aPx;

        q(au auVar, ac acVar) {
            this.aPH = auVar;
            this.aPx = acVar;
        }

        public final void onClick(View view) {
            kotlin.jvm.a.m Rr = this.aPx.Rr();
            if (Rr != null) {
                kotlin.l lVar = (kotlin.l) Rr.w(this.aPH.Rn(), this.aPH.QU());
            }
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, bng = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/iqoption/chat/component/MessagesAdapter$onCreateViewHolder$16$1"})
    /* compiled from: MessagesAdapter.kt */
    static final class r implements OnClickListener {
        final /* synthetic */ at aPI;
        final /* synthetic */ ac aPx;

        r(at atVar, ac acVar) {
            this.aPI = atVar;
            this.aPx = acVar;
        }

        public final void onClick(View view) {
            kotlin.jvm.a.m Rr = this.aPx.Rr();
            if (Rr != null) {
                kotlin.l lVar = (kotlin.l) Rr.w(this.aPI.Rn(), this.aPI.QU());
            }
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, bng = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/iqoption/chat/component/MessagesAdapter$onCreateViewHolder$2$1"})
    /* compiled from: MessagesAdapter.kt */
    static final class v implements OnClickListener {
        final /* synthetic */ aq aPM;
        final /* synthetic */ ac aPx;

        v(aq aqVar, ac acVar) {
            this.aPM = aqVar;
            this.aPx = acVar;
        }

        public final void onClick(View view) {
            kotlin.jvm.a.b Ro = this.aPx.Ro();
            if (Ro != null) {
                kotlin.l lVar = (kotlin.l) Ro.invoke(this.aPM.Rn());
            }
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, bng = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/iqoption/chat/component/MessagesAdapter$onCreateViewHolder$3$1"})
    /* compiled from: MessagesAdapter.kt */
    static final class w implements OnClickListener {
        final /* synthetic */ ao aPN;
        final /* synthetic */ ac aPx;

        w(ao aoVar, ac acVar) {
            this.aPN = aoVar;
            this.aPx = acVar;
        }

        public final void onClick(View view) {
            kotlin.jvm.a.b Ro = this.aPx.Ro();
            if (Ro != null) {
                kotlin.l lVar = (kotlin.l) Ro.invoke(this.aPN.Rn());
            }
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, bng = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/iqoption/chat/component/MessagesAdapter$onCreateViewHolder$4$1"})
    /* compiled from: MessagesAdapter.kt */
    static final class x implements OnClickListener {
        final /* synthetic */ ar aPO;
        final /* synthetic */ ac aPx;

        x(ar arVar, ac acVar) {
            this.aPO = arVar;
            this.aPx = acVar;
        }

        public final void onClick(View view) {
            kotlin.jvm.a.b Ro = this.aPx.Ro();
            if (Ro != null) {
                kotlin.l lVar = (kotlin.l) Ro.invoke(this.aPO.Rn());
            }
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, bng = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/iqoption/chat/component/MessagesAdapter$onCreateViewHolder$4$2"})
    /* compiled from: MessagesAdapter.kt */
    static final class y implements OnClickListener {
        final /* synthetic */ ar aPO;
        final /* synthetic */ ac aPx;

        y(ar arVar, ac acVar) {
            this.aPO = arVar;
            this.aPx = acVar;
        }

        public final void onClick(View view) {
            kotlin.jvm.a.b Rp = this.aPx.Rp();
            if (Rp != null) {
                kotlin.l lVar = (kotlin.l) Rp.invoke(this.aPO.Rn());
            }
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, bng = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/iqoption/chat/component/MessagesAdapter$onCreateViewHolder$5$1"})
    /* compiled from: MessagesAdapter.kt */
    static final class z implements OnClickListener {
        final /* synthetic */ o aPP;
        final /* synthetic */ ac aPx;

        z(o oVar, ac acVar) {
            this.aPP = oVar;
            this.aPx = acVar;
        }

        public final void onClick(View view) {
            kotlin.jvm.a.m Rr = this.aPx.Rr();
            if (Rr != null) {
                kotlin.l lVar = (kotlin.l) Rr.w(this.aPP.Rn(), this.aPP.QU());
            }
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, bng = {"<anonymous>", "", "rating", "", "onStarsChanged", "com/iqoption/chat/component/MessagesAdapter$onCreateViewHolder$13$1"})
    /* compiled from: MessagesAdapter.kt */
    static final class n implements com.iqoption.core.ui.widget.StarBar.b {
        final /* synthetic */ ae aPF;
        final /* synthetic */ ac aPx;

        n(ae aeVar, ac acVar) {
            this.aPF = aeVar;
            this.aPx = acVar;
        }

        public final void ev(int i) {
            b Rq = this.aPx.Rq();
            if (Rq != null) {
                Rq.a(i, this.aPF.Rn());
            }
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006¸\u0006\u0000"}, bng = {"com/iqoption/chat/component/MessagesAdapter$onCreateViewHolder$17$clickListener$1", "Lcom/iqoption/core/ext/OnDelayClickListener;", "onDelayClick", "", "v", "Landroid/view/View;", "chat_release"})
    /* compiled from: MessagesAdapter.kt */
    public static final class s extends com.iqoption.core.ext.g {
        final /* synthetic */ t aPJ;
        final /* synthetic */ ac aPx;

        s(t tVar, ac acVar) {
            this.aPJ = tVar;
            this.aPx = acVar;
            super(0, 1, null);
        }

        public void M(View view) {
            kotlin.jvm.internal.i.f(view, "v");
            int id = view.getId();
            kotlin.jvm.a.m Rs;
            kotlin.l lVar;
            if (id == com.iqoption.chat.e.g.like) {
                Rs = this.aPx.Rs();
                if (Rs != null) {
                    lVar = (kotlin.l) Rs.w(this.aPJ.Rn(), Boolean.valueOf(true));
                }
            } else if (id == com.iqoption.chat.e.g.dislike) {
                Rs = this.aPx.Rs();
                if (Rs != null) {
                    lVar = (kotlin.l) Rs.w(this.aPJ.Rn(), Boolean.valueOf(false));
                }
            }
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006¸\u0006\u0007"}, bng = {"com/iqoption/core/ext/AndroidExt$setOnDelayedClickListener$1", "Lcom/iqoption/core/ext/OnDelayClickListener;", "onDelayClick", "", "v", "Landroid/view/View;", "core_release", "com/iqoption/chat/component/MessagesAdapter$$special$$inlined$setOnDelayedClickListener$1"})
    /* compiled from: AndroidExtensions.kt */
    public static final class t extends com.iqoption.core.ext.g {
        final /* synthetic */ as aPK;
        final /* synthetic */ ac aPx;

        public t(as asVar, ac acVar) {
            this.aPK = asVar;
            this.aPx = acVar;
            super(0, 1, null);
        }

        public void M(View view) {
            kotlin.jvm.internal.i.f(view, "v");
            kotlin.jvm.a.b Rt = this.aPx.Rt();
            if (Rt != null) {
                kotlin.l lVar = (kotlin.l) Rt.invoke(this.aPK.Rn());
            }
            TextView textView = ((ca) this.aPK.getBinding()).aRV;
            textView.setEnabled(false);
            textView.animate().alpha(0.5f).setDuration(150).start();
        }
    }

    @kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006¸\u0006\u0007"}, bng = {"com/iqoption/core/ext/AndroidExt$setOnDelayedClickListener$1", "Lcom/iqoption/core/ext/OnDelayClickListener;", "onDelayClick", "", "v", "Landroid/view/View;", "core_release", "com/iqoption/chat/component/MessagesAdapter$$special$$inlined$setOnDelayedClickListener$2"})
    /* compiled from: AndroidExtensions.kt */
    public static final class u extends com.iqoption.core.ext.g {
        final /* synthetic */ an aPL;
        final /* synthetic */ ac aPx;

        public u(an anVar, ac acVar) {
            this.aPL = anVar;
            this.aPx = acVar;
            super(0, 1, null);
        }

        public void M(View view) {
            kotlin.jvm.internal.i.f(view, "v");
            kotlin.jvm.a.b Ru = this.aPx.Ru();
            if (Ru != null) {
                kotlin.l lVar = (kotlin.l) Ru.invoke(this.aPL.RQ());
            }
        }
    }

    public String a(@PluralsRes int i, int i2, Object... objArr) {
        kotlin.jvm.internal.i.f(objArr, "formatArgs");
        return this.aPw.a(i, i2, objArr);
    }

    public int er(@DimenRes int i) {
        return this.aPw.er(i);
    }

    public float es(@DimenRes int i) {
        return this.aPw.es(i);
    }

    public int getColor(@ColorRes int i) {
        return this.aPw.getColor(i);
    }

    public Context getContext() {
        return this.aPw.getContext();
    }

    public Drawable getDrawable(@DrawableRes int i) {
        return this.aPw.getDrawable(i);
    }

    public String getString(@StringRes int i, Object... objArr) {
        kotlin.jvm.internal.i.f(objArr, "formatArgs");
        return this.aPw.getString(i, objArr);
    }

    public ac(com.iqoption.chat.f fVar) {
        kotlin.jvm.internal.i.f(fVar, "resourcer");
        this.aPw = fVar;
        Drawable drawable = getDrawable(com.iqoption.chat.e.e.chat_message_avatar_placeholder);
        if (drawable == null) {
            kotlin.jvm.internal.i.bnJ();
        }
        this.aPe = drawable;
        this.aPf = new com.iqoption.core.ui.picasso.a();
        this.aPg = er(com.iqoption.chat.e.d.dp36);
        this.aPh = new com.iqoption.core.ui.picasso.c(er(com.iqoption.chat.e.d.dp12));
        this.aPi = er(com.iqoption.chat.e.d.dp200);
        this.aPj = er(com.iqoption.chat.e.d.dp150);
        this.aPk = new SimpleDateFormat("HH:mm", Locale.getDefault());
        setHasStableIds(true);
    }

    public final void eV(String str) {
        kotlin.jvm.internal.i.f(str, "<set-?>");
        this.aPb = str;
    }

    public final void setLoading(boolean z) {
        this.anr = z;
    }

    public final com.iqoption.core.microservices.chat.response.e et(int i) {
        Object h = u.h(this.iA, i);
        if (!(h instanceof aa)) {
            h = null;
        }
        aa aaVar = (aa) h;
        if (aaVar != null) {
            com.iqoption.core.microservices.chat.response.e QT = aaVar.QT();
            if (QT != null) {
                return QT;
            }
        }
        Object h2 = u.h(this.iA, i);
        if (!(h2 instanceof a)) {
            h2 = null;
        }
        a aVar = (a) h2;
        return aVar != null ? aVar.QT() : null;
    }

    public final com.iqoption.core.microservices.chat.response.m eu(int i) {
        Object h = u.h(this.iA, i);
        if (!(h instanceof am)) {
            h = null;
        }
        am amVar = (am) h;
        return amVar != null ? amVar.RP() : null;
    }

    public final kotlin.jvm.a.b<com.iqoption.core.microservices.chat.response.e, kotlin.l> Ro() {
        return this.aPo;
    }

    public final void c(kotlin.jvm.a.b<? super com.iqoption.core.microservices.chat.response.e, kotlin.l> bVar) {
        this.aPo = bVar;
    }

    public final kotlin.jvm.a.b<com.iqoption.core.microservices.chat.response.e, kotlin.l> Rp() {
        return this.aPp;
    }

    public final void d(kotlin.jvm.a.b<? super com.iqoption.core.microservices.chat.response.e, kotlin.l> bVar) {
        this.aPp = bVar;
    }

    public final b Rq() {
        return this.aPq;
    }

    public final void a(b bVar) {
        this.aPq = bVar;
    }

    public final kotlin.jvm.a.m<com.iqoption.core.microservices.chat.response.e, com.iqoption.core.microservices.chat.response.a, kotlin.l> Rr() {
        return this.aPr;
    }

    public final void a(kotlin.jvm.a.m<? super com.iqoption.core.microservices.chat.response.e, ? super com.iqoption.core.microservices.chat.response.a, kotlin.l> mVar) {
        this.aPr = mVar;
    }

    public final kotlin.jvm.a.m<com.iqoption.core.microservices.chat.response.e, Boolean, kotlin.l> Rs() {
        return this.aPs;
    }

    public final void b(kotlin.jvm.a.m<? super com.iqoption.core.microservices.chat.response.e, ? super Boolean, kotlin.l> mVar) {
        this.aPs = mVar;
    }

    public final kotlin.jvm.a.b<com.iqoption.core.microservices.chat.response.e, kotlin.l> Rt() {
        return this.aPt;
    }

    public final void e(kotlin.jvm.a.b<? super com.iqoption.core.microservices.chat.response.e, kotlin.l> bVar) {
        this.aPt = bVar;
    }

    public final kotlin.jvm.a.b<com.iqoption.core.microservices.chat.response.m, kotlin.l> Ru() {
        return this.aPu;
    }

    public final void f(kotlin.jvm.a.b<? super com.iqoption.core.microservices.chat.response.m, kotlin.l> bVar) {
        this.aPu = bVar;
    }

    public int getItemCount() {
        return this.iA.size();
    }

    /* renamed from: p */
    public ax<ViewDataBinding> onCreateViewHolder(ViewGroup viewGroup, int i) {
        kotlin.jvm.internal.i.f(viewGroup, "parent");
        String str = "DataBindingUtil.inflate(…layoutRes, parent, false)";
        ViewDataBinding inflate;
        kotlin.l lVar;
        TextView textView;
        switch (i) {
            case 1:
                inflate = DataBindingUtil.inflate(b(this), com.iqoption.chat.e.h.chat_loading_item, viewGroup, false);
                kotlin.jvm.internal.i.e(inflate, str);
                return new x((ay) inflate);
            case 2:
                inflate = DataBindingUtil.inflate(b(this), com.iqoption.chat.e.h.chat_empty_item, viewGroup, false);
                kotlin.jvm.internal.i.e(inflate, str);
                return new f((com.iqoption.chat.a.m) inflate);
            case 3:
                inflate = DataBindingUtil.inflate(b(this), com.iqoption.chat.e.h.chat_load_more_item, viewGroup, false);
                kotlin.jvm.internal.i.e(inflate, str);
                return new v((aw) inflate);
            case 6:
                inflate = DataBindingUtil.inflate(b(this), com.iqoption.chat.e.h.chat_text_message_full_item, viewGroup, false);
                kotlin.jvm.internal.i.e(inflate, str);
                ap apVar = new ap((bu) inflate);
                ((bu) apVar.getBinding()).aRf.setOnClickListener(new d(apVar, this));
                ((bu) apVar.getBinding()).aQW.setOnClickListener(new o(apVar, this));
                lVar = kotlin.l.eVB;
                return apVar;
            case 7:
                inflate = DataBindingUtil.inflate(b(this), com.iqoption.chat.e.h.chat_text_message_head_item, viewGroup, false);
                kotlin.jvm.internal.i.e(inflate, str);
                aq aqVar = new aq((bw) inflate);
                ((bw) aqVar.getBinding()).aRf.setOnClickListener(new v(aqVar, this));
                lVar = kotlin.l.eVB;
                return aqVar;
            case 8:
                inflate = DataBindingUtil.inflate(b(this), com.iqoption.chat.e.h.chat_text_message_body_item, viewGroup, false);
                kotlin.jvm.internal.i.e(inflate, str);
                ao aoVar = new ao((bs) inflate);
                ((bs) aoVar.getBinding()).aRK.setOnClickListener(new w(aoVar, this));
                lVar = kotlin.l.eVB;
                return aoVar;
            case 9:
                inflate = DataBindingUtil.inflate(b(this), com.iqoption.chat.e.h.chat_text_message_tail_item, viewGroup, false);
                kotlin.jvm.internal.i.e(inflate, str);
                ar arVar = new ar((by) inflate);
                ((by) arVar.getBinding()).aRf.setOnClickListener(new x(arVar, this));
                ((by) arVar.getBinding()).aQW.setOnClickListener(new y(arVar, this));
                lVar = kotlin.l.eVB;
                return arVar;
            case 10:
                inflate = DataBindingUtil.inflate(b(this), com.iqoption.chat.e.h.chat_image_message_full_item, viewGroup, false);
                kotlin.jvm.internal.i.e(inflate, str);
                o oVar = new o((am) inflate);
                ((am) oVar.getBinding()).aRf.setOnClickListener(new z(oVar, this));
                ((am) oVar.getBinding()).aQW.setOnClickListener(new aa(oVar, this));
                lVar = kotlin.l.eVB;
                return oVar;
            case 11:
                inflate = DataBindingUtil.inflate(b(this), com.iqoption.chat.e.h.chat_image_message_head_item, viewGroup, false);
                kotlin.jvm.internal.i.e(inflate, str);
                p pVar = new p((ao) inflate);
                ((ao) pVar.getBinding()).aRf.setOnClickListener(new ab(pVar, this));
                lVar = kotlin.l.eVB;
                return pVar;
            case 12:
                inflate = DataBindingUtil.inflate(b(this), com.iqoption.chat.e.h.chat_image_message_body_item, viewGroup, false);
                kotlin.jvm.internal.i.e(inflate, str);
                n nVar = new n((ak) inflate);
                ((ak) nVar.getBinding()).aQK.setOnClickListener(new e(nVar, this));
                lVar = kotlin.l.eVB;
                return nVar;
            case 13:
                inflate = DataBindingUtil.inflate(b(this), com.iqoption.chat.e.h.chat_image_message_tail_item, viewGroup, false);
                kotlin.jvm.internal.i.e(inflate, str);
                q qVar = new q((aq) inflate);
                ((aq) qVar.getBinding()).aQK.setOnClickListener(new f(qVar, this));
                ((aq) qVar.getBinding()).aQW.setOnClickListener(new g(qVar, this));
                lVar = kotlin.l.eVB;
                return qVar;
            case 14:
                inflate = DataBindingUtil.inflate(b(this), com.iqoption.chat.e.h.chat_file_message_full_item, viewGroup, false);
                kotlin.jvm.internal.i.e(inflate, str);
                k kVar = new k((com.iqoption.chat.a.q) inflate);
                ((com.iqoption.chat.a.q) kVar.getBinding()).aRf.setOnClickListener(new h(kVar, this));
                ((com.iqoption.chat.a.q) kVar.getBinding()).aQW.setOnClickListener(new i(kVar, this));
                lVar = kotlin.l.eVB;
                return kVar;
            case 15:
                inflate = DataBindingUtil.inflate(b(this), com.iqoption.chat.e.h.chat_file_message_head_item, viewGroup, false);
                kotlin.jvm.internal.i.e(inflate, str);
                l lVar2 = new l((com.iqoption.chat.a.s) inflate);
                ((com.iqoption.chat.a.s) lVar2.getBinding()).aRf.setOnClickListener(new j(lVar2, this));
                lVar = kotlin.l.eVB;
                return lVar2;
            case 16:
                inflate = DataBindingUtil.inflate(b(this), com.iqoption.chat.e.h.chat_file_message_body_item, viewGroup, false);
                kotlin.jvm.internal.i.e(inflate, str);
                j jVar = new j((com.iqoption.chat.a.o) inflate);
                ((com.iqoption.chat.a.o) jVar.getBinding()).amZ.setOnClickListener(new k(jVar, this));
                lVar = kotlin.l.eVB;
                return jVar;
            case 17:
                inflate = DataBindingUtil.inflate(b(this), com.iqoption.chat.e.h.chat_file_message_tail_item, viewGroup, false);
                kotlin.jvm.internal.i.e(inflate, str);
                m mVar = new m((com.iqoption.chat.a.u) inflate);
                ((com.iqoption.chat.a.u) mVar.getBinding()).amZ.setOnClickListener(new l(mVar, this));
                ((com.iqoption.chat.a.u) mVar.getBinding()).aQW.setOnClickListener(new m(mVar, this));
                lVar = kotlin.l.eVB;
                return mVar;
            case 18:
                inflate = DataBindingUtil.inflate(b(this), com.iqoption.chat.e.h.chat_rate_message_item, viewGroup, false);
                kotlin.jvm.internal.i.e(inflate, str);
                ae aeVar = new ae((bc) inflate);
                ((bc) aeVar.getBinding()).aRL.setOnStarsChangedListener(new n(aeVar, this));
                lVar = kotlin.l.eVB;
                return aeVar;
            case 19:
                inflate = DataBindingUtil.inflate(b(this), com.iqoption.chat.e.h.chat_user_text_message_item, viewGroup, false);
                kotlin.jvm.internal.i.e(inflate, str);
                av avVar = new av((cg) inflate);
                ((cg) avVar.getBinding()).aRK.setOnClickListener(new p(avVar, this));
                lVar = kotlin.l.eVB;
                return avVar;
            case 20:
                inflate = DataBindingUtil.inflate(b(this), com.iqoption.chat.e.h.chat_user_image_message_item, viewGroup, false);
                kotlin.jvm.internal.i.e(inflate, str);
                au auVar = new au((ce) inflate);
                ((ce) auVar.getBinding()).aQK.setOnClickListener(new q(auVar, this));
                lVar = kotlin.l.eVB;
                return auVar;
            case 21:
                inflate = DataBindingUtil.inflate(b(this), com.iqoption.chat.e.h.chat_user_file_message_item, viewGroup, false);
                kotlin.jvm.internal.i.e(inflate, str);
                at atVar = new at((cc) inflate);
                ((cc) atVar.getBinding()).amZ.setOnClickListener(new r(atVar, this));
                lVar = kotlin.l.eVB;
                return atVar;
            case 22:
                inflate = DataBindingUtil.inflate(b(this), com.iqoption.chat.e.h.chat_like_dislike_message_item, viewGroup, false);
                kotlin.jvm.internal.i.e(inflate, str);
                t tVar = new t((au) inflate);
                OnClickListener sVar = new s(tVar, this);
                ((au) tVar.getBinding()).aRJ.setOnClickListener(sVar);
                ((au) tVar.getBinding()).aRI.setOnClickListener(sVar);
                lVar = kotlin.l.eVB;
                return tVar;
            case 23:
                inflate = DataBindingUtil.inflate(b(this), com.iqoption.chat.e.h.chat_transfer_dialog_message_item, viewGroup, false);
                kotlin.jvm.internal.i.e(inflate, str);
                as asVar = new as((ca) inflate);
                textView = ((ca) asVar.getBinding()).aRV;
                kotlin.jvm.internal.i.e(textView, "binding.button");
                textView.setOnClickListener(new t(asVar, this));
                lVar = kotlin.l.eVB;
                return asVar;
            case 24:
                inflate = DataBindingUtil.inflate(b(this), com.iqoption.chat.e.h.chat_suggestion_message_item, viewGroup, false);
                kotlin.jvm.internal.i.e(inflate, str);
                an anVar = new an((bq) inflate);
                textView = ((bq) anVar.getBinding()).aRU;
                kotlin.jvm.internal.i.e(textView, "binding.suggestion");
                textView.setOnClickListener(new u(anVar, this));
                lVar = kotlin.l.eVB;
                return anVar;
            default:
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("unknown viewType ");
                stringBuilder.append(i);
                throw new IllegalArgumentException(stringBuilder.toString());
        }
    }

    /* renamed from: a */
    public void onBindViewHolder(ax<?> axVar, int i) {
        kotlin.jvm.internal.i.f(axVar, "holder");
        int itemViewType = axVar.getItemViewType();
        if (itemViewType != 2) {
            String str = "null cannot be cast to non-null type com.iqoption.chat.component.MessageItem";
            String str2 = "null cannot be cast to non-null type com.iqoption.chat.component.AttachmentItem";
            Object obj;
            a aVar;
            aa aaVar;
            switch (itemViewType) {
                case 6:
                    ap apVar = (ap) axVar;
                    obj = this.iA.get(i);
                    if (obj != null) {
                        a(apVar, ((aa) obj).QT());
                        return;
                    }
                    throw new TypeCastException(str);
                case 7:
                    aq aqVar = (aq) axVar;
                    obj = this.iA.get(i);
                    if (obj != null) {
                        a(aqVar, ((aa) obj).QT());
                        return;
                    }
                    throw new TypeCastException(str);
                case 8:
                    ao aoVar = (ao) axVar;
                    obj = this.iA.get(i);
                    if (obj != null) {
                        a(aoVar, ((aa) obj).QT());
                        return;
                    }
                    throw new TypeCastException(str);
                case 9:
                    ar arVar = (ar) axVar;
                    obj = this.iA.get(i);
                    if (obj != null) {
                        a(arVar, ((aa) obj).QT());
                        return;
                    }
                    throw new TypeCastException(str);
                case 10:
                    obj = this.iA.get(i);
                    if (obj != null) {
                        aVar = (a) obj;
                        a((o) axVar, aVar.QU(), aVar.QT());
                        return;
                    }
                    throw new TypeCastException(str2);
                case 11:
                    obj = this.iA.get(i);
                    if (obj != null) {
                        aVar = (a) obj;
                        a((p) axVar, aVar.QU(), aVar.QT());
                        return;
                    }
                    throw new TypeCastException(str2);
                case 12:
                    obj = this.iA.get(i);
                    if (obj != null) {
                        aVar = (a) obj;
                        a((n) axVar, aVar.QU(), aVar.QT());
                        return;
                    }
                    throw new TypeCastException(str2);
                case 13:
                    obj = this.iA.get(i);
                    if (obj != null) {
                        aVar = (a) obj;
                        a((q) axVar, aVar.QU(), aVar.QT());
                        return;
                    }
                    throw new TypeCastException(str2);
                case 14:
                    obj = this.iA.get(i);
                    if (obj != null) {
                        aVar = (a) obj;
                        a((k) axVar, aVar.QU(), aVar.QT());
                        return;
                    }
                    throw new TypeCastException(str2);
                case 15:
                    obj = this.iA.get(i);
                    if (obj != null) {
                        aVar = (a) obj;
                        a((l) axVar, aVar.QU(), aVar.QT());
                        return;
                    }
                    throw new TypeCastException(str2);
                case 16:
                    obj = this.iA.get(i);
                    if (obj != null) {
                        aVar = (a) obj;
                        a((j) axVar, aVar.QU(), aVar.QT());
                        return;
                    }
                    throw new TypeCastException(str2);
                case 17:
                    obj = this.iA.get(i);
                    if (obj != null) {
                        aVar = (a) obj;
                        a((m) axVar, aVar.QU(), aVar.QT());
                        return;
                    }
                    throw new TypeCastException(str2);
                case 18:
                    obj = this.iA.get(i);
                    if (obj != null) {
                        aaVar = (aa) obj;
                        a((ae) axVar, aaVar.QT(), aaVar.QV());
                        return;
                    }
                    throw new TypeCastException(str);
                case 19:
                    obj = this.iA.get(i);
                    if (obj != null) {
                        aaVar = (aa) obj;
                        a((av) axVar, aaVar.QT(), aaVar.QV());
                        return;
                    }
                    throw new TypeCastException(str);
                case 20:
                    obj = this.iA.get(i);
                    if (obj != null) {
                        aVar = (a) obj;
                        a((au) axVar, aVar.QT(), aVar.QU());
                        return;
                    }
                    throw new TypeCastException(str2);
                case 21:
                    obj = this.iA.get(i);
                    if (obj != null) {
                        aVar = (a) obj;
                        a((at) axVar, aVar.QT(), aVar.QU(), aVar.QV());
                        return;
                    }
                    throw new TypeCastException(str2);
                case 22:
                    obj = this.iA.get(i);
                    if (obj != null) {
                        aaVar = (aa) obj;
                        a((t) axVar, aaVar.QT(), aaVar.QV());
                        return;
                    }
                    throw new TypeCastException(str);
                case 23:
                    obj = this.iA.get(i);
                    if (obj != null) {
                        aaVar = (aa) obj;
                        a((as) axVar, aaVar.QT(), aaVar.QV());
                        return;
                    }
                    throw new TypeCastException(str);
                case 24:
                    obj = this.iA.get(i);
                    if (obj != null) {
                        a((an) axVar, ((am) obj).RP());
                        return;
                    }
                    throw new TypeCastException("null cannot be cast to non-null type com.iqoption.chat.component.SuggestionItem");
                default:
                    return;
            }
        }
        TextView textView = ((com.iqoption.chat.a.m) ((f) axVar).getBinding()).aRd;
        kotlin.jvm.internal.i.e(textView, "binding.emptyText");
        textView.setText(this.aPb);
    }

    private final void a(ap apVar, com.iqoption.core.microservices.chat.response.e eVar) {
        apVar.a(eVar);
        TextView textView = ((bu) apVar.getBinding()).aRe;
        kotlin.jvm.internal.i.e(textView, "binding.author");
        textView.setText(eVar.acb());
        MessageView messageView = ((bu) apVar.getBinding()).aRK;
        kotlin.jvm.internal.i.e(messageView, "binding.message");
        a(eVar, messageView);
        ImageView imageView = ((bu) apVar.getBinding()).aQW;
        kotlin.jvm.internal.i.e(imageView, "binding.avatar");
        a(eVar, imageView);
    }

    private final void a(com.iqoption.core.microservices.chat.response.e eVar, MessageView messageView) {
        messageView.setText(eVar.getText());
        messageView.setTime(this.aPk.format(Long.valueOf(eVar.getDate())));
    }

    private final void a(aq aqVar, com.iqoption.core.microservices.chat.response.e eVar) {
        aqVar.a(eVar);
        MessageView messageView = ((bw) aqVar.getBinding()).aRK;
        kotlin.jvm.internal.i.e(messageView, "binding.message");
        a(eVar, messageView);
        TextView textView = ((bw) aqVar.getBinding()).aRe;
        kotlin.jvm.internal.i.e(textView, "binding.author");
        textView.setText(eVar.acb());
    }

    private final void a(ao aoVar, com.iqoption.core.microservices.chat.response.e eVar) {
        aoVar.a(eVar);
        MessageView messageView = ((bs) aoVar.getBinding()).aRK;
        kotlin.jvm.internal.i.e(messageView, "binding.message");
        a(eVar, messageView);
    }

    private final void a(ar arVar, com.iqoption.core.microservices.chat.response.e eVar) {
        arVar.a(eVar);
        MessageView messageView = ((by) arVar.getBinding()).aRK;
        kotlin.jvm.internal.i.e(messageView, "binding.message");
        a(eVar, messageView);
        ImageView imageView = ((by) arVar.getBinding()).aQW;
        kotlin.jvm.internal.i.e(imageView, "binding.avatar");
        a(eVar, imageView);
    }

    private final void a(o oVar, com.iqoption.core.microservices.chat.response.a aVar, com.iqoption.core.microservices.chat.response.e eVar) {
        oVar.a(aVar);
        oVar.a(eVar);
        TextView textView = ((am) oVar.getBinding()).aRe;
        kotlin.jvm.internal.i.e(textView, "binding.author");
        textView.setText(eVar.acb());
        textView = ((am) oVar.getBinding()).anj;
        kotlin.jvm.internal.i.e(textView, "binding.time");
        textView.setText(this.aPk.format(Long.valueOf(eVar.getDate())));
        ImageView imageView = ((am) oVar.getBinding()).aQK;
        kotlin.jvm.internal.i.e(imageView, "binding.preview");
        a(aVar, imageView);
        ImageView imageView2 = ((am) oVar.getBinding()).aQW;
        kotlin.jvm.internal.i.e(imageView2, "binding.avatar");
        a(eVar, imageView2);
    }

    private final void a(p pVar, com.iqoption.core.microservices.chat.response.a aVar, com.iqoption.core.microservices.chat.response.e eVar) {
        pVar.a(aVar);
        pVar.a(eVar);
        TextView textView = ((ao) pVar.getBinding()).aRe;
        kotlin.jvm.internal.i.e(textView, "binding.author");
        textView.setText(eVar.acb());
        textView = ((ao) pVar.getBinding()).anj;
        kotlin.jvm.internal.i.e(textView, "binding.time");
        textView.setText(this.aPk.format(Long.valueOf(eVar.getDate())));
        ImageView imageView = ((ao) pVar.getBinding()).aQK;
        kotlin.jvm.internal.i.e(imageView, "binding.preview");
        a(aVar, imageView);
    }

    private final void a(n nVar, com.iqoption.core.microservices.chat.response.a aVar, com.iqoption.core.microservices.chat.response.e eVar) {
        nVar.a(aVar);
        nVar.a(eVar);
        TextView textView = ((ak) nVar.getBinding()).anj;
        kotlin.jvm.internal.i.e(textView, "binding.time");
        textView.setText(this.aPk.format(Long.valueOf(eVar.getDate())));
        ImageView imageView = ((ak) nVar.getBinding()).aQK;
        kotlin.jvm.internal.i.e(imageView, "binding.preview");
        a(aVar, imageView);
    }

    private final void a(q qVar, com.iqoption.core.microservices.chat.response.a aVar, com.iqoption.core.microservices.chat.response.e eVar) {
        qVar.a(aVar);
        qVar.a(eVar);
        TextView textView = ((aq) qVar.getBinding()).anj;
        kotlin.jvm.internal.i.e(textView, "binding.time");
        textView.setText(this.aPk.format(Long.valueOf(eVar.getDate())));
        ImageView imageView = ((aq) qVar.getBinding()).aQK;
        kotlin.jvm.internal.i.e(imageView, "binding.preview");
        a(aVar, imageView);
        ImageView imageView2 = ((aq) qVar.getBinding()).aQW;
        kotlin.jvm.internal.i.e(imageView2, "binding.avatar");
        a(eVar, imageView2);
    }

    private final void a(k kVar, com.iqoption.core.microservices.chat.response.a aVar, com.iqoption.core.microservices.chat.response.e eVar) {
        kVar.a(aVar);
        kVar.a(eVar);
        TextView textView = ((com.iqoption.chat.a.q) kVar.getBinding()).aRe;
        kotlin.jvm.internal.i.e(textView, "binding.author");
        textView.setText(eVar.acb());
        textView = ((com.iqoption.chat.a.q) kVar.getBinding()).amZ;
        kotlin.jvm.internal.i.e(textView, "binding.name");
        textView.setText(b(aVar));
        TextView textView2 = ((com.iqoption.chat.a.q) kVar.getBinding()).anj;
        kotlin.jvm.internal.i.e(textView2, "binding.time");
        textView2.setText(this.aPk.format(Long.valueOf(eVar.getDate())));
        ImageView imageView = ((com.iqoption.chat.a.q) kVar.getBinding()).aQW;
        kotlin.jvm.internal.i.e(imageView, "binding.avatar");
        a(eVar, imageView);
    }

    private final void a(l lVar, com.iqoption.core.microservices.chat.response.a aVar, com.iqoption.core.microservices.chat.response.e eVar) {
        lVar.a(aVar);
        lVar.a(eVar);
        TextView textView = ((com.iqoption.chat.a.s) lVar.getBinding()).aRe;
        kotlin.jvm.internal.i.e(textView, "binding.author");
        textView.setText(eVar.acb());
        textView = ((com.iqoption.chat.a.s) lVar.getBinding()).amZ;
        kotlin.jvm.internal.i.e(textView, "binding.name");
        textView.setText(b(aVar));
        TextView textView2 = ((com.iqoption.chat.a.s) lVar.getBinding()).anj;
        kotlin.jvm.internal.i.e(textView2, "binding.time");
        textView2.setText(this.aPk.format(Long.valueOf(eVar.getDate())));
    }

    private final void a(j jVar, com.iqoption.core.microservices.chat.response.a aVar, com.iqoption.core.microservices.chat.response.e eVar) {
        jVar.a(aVar);
        jVar.a(eVar);
        TextView textView = ((com.iqoption.chat.a.o) jVar.getBinding()).amZ;
        kotlin.jvm.internal.i.e(textView, "binding.name");
        textView.setText(b(aVar));
        TextView textView2 = ((com.iqoption.chat.a.o) jVar.getBinding()).anj;
        kotlin.jvm.internal.i.e(textView2, "binding.time");
        textView2.setText(this.aPk.format(Long.valueOf(eVar.getDate())));
    }

    private final void a(m mVar, com.iqoption.core.microservices.chat.response.a aVar, com.iqoption.core.microservices.chat.response.e eVar) {
        mVar.a(aVar);
        mVar.a(eVar);
        TextView textView = ((com.iqoption.chat.a.u) mVar.getBinding()).amZ;
        kotlin.jvm.internal.i.e(textView, "binding.name");
        textView.setText(b(aVar));
        TextView textView2 = ((com.iqoption.chat.a.u) mVar.getBinding()).anj;
        kotlin.jvm.internal.i.e(textView2, "binding.time");
        textView2.setText(this.aPk.format(Long.valueOf(eVar.getDate())));
        ImageView imageView = ((com.iqoption.chat.a.u) mVar.getBinding()).aQW;
        kotlin.jvm.internal.i.e(imageView, "binding.avatar");
        a(eVar, imageView);
    }

    private final void a(com.iqoption.core.microservices.chat.response.e eVar, ImageView imageView) {
        Picasso picasso = this.picasso;
        String str = "picasso";
        if (picasso == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        picasso.cancelRequest(imageView);
        CharSequence acf = eVar.acf();
        Object obj = (acf == null || acf.length() == 0) ? 1 : null;
        String Y;
        if (obj != null) {
            Y = com.iqoption.core.util.m.bQG.Y(eVar.acd());
            if (Y == null) {
                imageView.setImageDrawable(this.aPe);
                return;
            }
            picasso = this.picasso;
            if (picasso == null) {
                kotlin.jvm.internal.i.lG(str);
            }
            RequestCreator placeholder = picasso.load(Y).placeholder(this.aPe);
            int i = this.aPg;
            placeholder.resize(i, i).into(imageView);
            return;
        }
        picasso = this.picasso;
        if (picasso == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        ApiConfig EE = com.iqoption.core.d.EE();
        Y = eVar.acf();
        if (Y == null) {
            kotlin.jvm.internal.i.bnJ();
        }
        picasso.load(EE.fz(Y)).placeholder(this.aPe).transform((Transformation) this.aPf).into(imageView);
    }

    private final void a(com.iqoption.core.microservices.chat.response.a aVar, ImageView imageView) {
        imageView.setImageDrawable(null);
        Picasso picasso = this.picasso;
        String str = "picasso";
        if (picasso == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        picasso.cancelRequest(imageView);
        picasso = this.picasso;
        if (picasso == null) {
            kotlin.jvm.internal.i.lG(str);
        }
        picasso.load(com.iqoption.core.microservices.chat.response.b.c(aVar)).resize(this.aPi, this.aPj).centerCrop().transform((Transformation) this.aPh).into(imageView);
    }

    private final void a(ae aeVar, com.iqoption.core.microservices.chat.response.e eVar, int i) {
        aeVar.a(eVar);
        MessageView messageView = ((bc) aeVar.getBinding()).aRK;
        kotlin.jvm.internal.i.e(messageView, "binding.message");
        a(eVar, messageView);
        TextView textView = ((bc) aeVar.getBinding()).aRe;
        kotlin.jvm.internal.i.e(textView, "binding.author");
        ImageView imageView = ((bc) aeVar.getBinding()).aQW;
        kotlin.jvm.internal.i.e(imageView, "binding.avatar");
        a(eVar, i, textView, imageView);
        if (i == 2 || i == 3) {
            ((bc) aeVar.getBinding()).aRf.setBackgroundResource(com.iqoption.chat.e.e.chat_message_bubble_left_body);
        } else {
            ((bc) aeVar.getBinding()).aRf.setBackgroundResource(com.iqoption.chat.e.e.chat_message_bubble_left_head);
        }
        com.iqoption.core.microservices.chat.response.g abV = eVar.abV();
        boolean acu = abV.acu();
        StarBar starBar = ((bc) aeVar.getBinding()).aRL;
        String str = "binding.starBar";
        kotlin.jvm.internal.i.e(starBar, str);
        starBar.setEnabled(acu);
        String str2 = "binding.thanksLayout";
        StarBar starBar2;
        FrameLayout frameLayout;
        if (acu) {
            starBar2 = ((bc) aeVar.getBinding()).aRL;
            kotlin.jvm.internal.i.e(starBar2, str);
            com.iqoption.core.ext.a.ak(starBar2);
            frameLayout = ((bc) aeVar.getBinding()).aRN;
            kotlin.jvm.internal.i.e(frameLayout, str2);
            com.iqoption.core.ext.a.hide(frameLayout);
        } else {
            starBar2 = ((bc) aeVar.getBinding()).aRL;
            kotlin.jvm.internal.i.e(starBar2, str);
            com.iqoption.core.ext.a.al(starBar2);
            frameLayout = ((bc) aeVar.getBinding()).aRN;
            kotlin.jvm.internal.i.e(frameLayout, str2);
            com.iqoption.core.ext.a.ak(frameLayout);
            ((bc) aeVar.getBinding()).aRM.setText(getString(com.iqoption.chat.e.j.your_rating_is_n1_out_of_5, Integer.valueOf(abV.acs())));
            ((bc) aeVar.getBinding()).aRM.setTime(this.aPk.format(Long.valueOf(abV.act())));
        }
        StarBar starBar3 = ((bc) aeVar.getBinding()).aRL;
        kotlin.jvm.internal.i.e(starBar3, str);
        starBar3.setStars(abV.acs());
    }

    private final void a(av avVar, com.iqoption.core.microservices.chat.response.e eVar, int i) {
        Drawable e;
        avVar.a(eVar);
        MessageView messageView = ((cg) avVar.getBinding()).aRK;
        String str = "binding.message";
        kotlin.jvm.internal.i.e(messageView, str);
        a(eVar, messageView);
        MessageView messageView2 = ((cg) avVar.getBinding()).aRK;
        kotlin.jvm.internal.i.e(messageView2, str);
        if (i == 1) {
            e = com.iqoption.core.ext.a.e((ViewHolder) avVar, com.iqoption.chat.e.e.bg_message_bubble_right_head);
        } else if (i == 2) {
            e = com.iqoption.core.ext.a.e((ViewHolder) avVar, com.iqoption.chat.e.e.bg_message_bubble_right_body);
        } else if (i != 3) {
            e = com.iqoption.core.ext.a.e((ViewHolder) avVar, com.iqoption.chat.e.e.bg_message_bubble_right);
        } else {
            e = com.iqoption.core.ext.a.e((ViewHolder) avVar, com.iqoption.chat.e.e.bg_message_bubble_right_tail);
        }
        messageView2.setBackground(e);
    }

    private final void a(au auVar, com.iqoption.core.microservices.chat.response.e eVar, com.iqoption.core.microservices.chat.response.a aVar) {
        auVar.a(eVar);
        auVar.a(aVar);
        TextView textView = ((ce) auVar.getBinding()).anj;
        kotlin.jvm.internal.i.e(textView, "binding.time");
        textView.setText(this.aPk.format(Long.valueOf(eVar.getDate())));
        ImageView imageView = ((ce) auVar.getBinding()).aQK;
        kotlin.jvm.internal.i.e(imageView, "binding.preview");
        a(aVar, imageView);
    }

    private final void a(at atVar, com.iqoption.core.microservices.chat.response.e eVar, com.iqoption.core.microservices.chat.response.a aVar, int i) {
        Drawable e;
        atVar.a(eVar);
        atVar.a(aVar);
        TextView textView = ((cc) atVar.getBinding()).anj;
        kotlin.jvm.internal.i.e(textView, "binding.time");
        textView.setText(this.aPk.format(Long.valueOf(eVar.getDate())));
        TextView textView2 = ((cc) atVar.getBinding()).amZ;
        String str = "binding.name";
        kotlin.jvm.internal.i.e(textView2, str);
        textView2.setText(b(aVar));
        textView2 = ((cc) atVar.getBinding()).amZ;
        kotlin.jvm.internal.i.e(textView2, str);
        if (i == 1) {
            e = com.iqoption.core.ext.a.e((ViewHolder) atVar, com.iqoption.chat.e.e.bg_message_bubble_right_head);
        } else if (i == 2) {
            e = com.iqoption.core.ext.a.e((ViewHolder) atVar, com.iqoption.chat.e.e.bg_message_bubble_right_body);
        } else if (i != 3) {
            e = com.iqoption.core.ext.a.e((ViewHolder) atVar, com.iqoption.chat.e.e.bg_message_bubble_right);
        } else {
            e = com.iqoption.core.ext.a.e((ViewHolder) atVar, com.iqoption.chat.e.e.bg_message_bubble_right_tail);
        }
        textView2.setBackground(e);
    }

    private final String b(com.iqoption.core.microservices.chat.response.a aVar) {
        String path = aVar.getPath();
        if (path == null) {
            return null;
        }
        path = v.c(path, "/", null, 2, null);
        if (path == null) {
            return null;
        }
        List b = v.b((CharSequence) path, new String[]{"."}, false, 0, 6, null);
        if (b.size() > 1) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(x.Y(path, ((String) b.get(b.size() - 1)).length()));
            path = (String) b.get(b.size() - 1);
            if (path != null) {
                path = path.toUpperCase();
                kotlin.jvm.internal.i.e(path, "(this as java.lang.String).toUpperCase()");
                stringBuilder.append(path);
                path = stringBuilder.toString();
            } else {
                throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
            }
        }
        return path;
    }

    private final void a(t tVar, com.iqoption.core.microservices.chat.response.e eVar, int i) {
        tVar.a(eVar);
        MessageView messageView = ((au) tVar.getBinding()).aRK;
        kotlin.jvm.internal.i.e(messageView, "binding.message");
        a(eVar, messageView);
        TextView textView = ((au) tVar.getBinding()).aRe;
        kotlin.jvm.internal.i.e(textView, "binding.author");
        ImageView imageView = ((au) tVar.getBinding()).aQW;
        kotlin.jvm.internal.i.e(imageView, "binding.avatar");
        a(eVar, i, textView, imageView);
        if (i == 0) {
            ((au) tVar.getBinding()).aRf.setBackgroundResource(com.iqoption.chat.e.e.chat_message_bubble_left_head);
            ((au) tVar.getBinding()).aRH.setBackgroundResource(com.iqoption.chat.e.e.chat_message_bubble_left_tail);
        } else if (i == 1) {
            ((au) tVar.getBinding()).aRf.setBackgroundResource(com.iqoption.chat.e.e.chat_message_bubble_left_head);
            ((au) tVar.getBinding()).aRH.setBackgroundResource(com.iqoption.chat.e.e.chat_message_bubble_left_body);
        } else if (i == 2) {
            ((au) tVar.getBinding()).aRf.setBackgroundResource(com.iqoption.chat.e.e.chat_message_bubble_left_body);
            ((au) tVar.getBinding()).aRH.setBackgroundResource(com.iqoption.chat.e.e.chat_message_bubble_left_body);
        } else if (i == 3) {
            ((au) tVar.getBinding()).aRf.setBackgroundResource(com.iqoption.chat.e.e.chat_message_bubble_left_body);
            ((au) tVar.getBinding()).aRH.setBackgroundResource(com.iqoption.chat.e.e.chat_message_bubble_left_tail);
        }
        Boolean acr = eVar.abX().acr();
        if (acr == null) {
            a(tVar, true);
            a(tVar, false, false);
        } else if (kotlin.jvm.internal.i.y(acr, Boolean.valueOf(true))) {
            a(tVar, false);
            a(tVar, true, false);
        } else if (kotlin.jvm.internal.i.y(acr, Boolean.valueOf(false))) {
            a(tVar, false);
            a(tVar, false, true);
        }
    }

    private final void a(t tVar, boolean z) {
        ImageView imageView = ((au) tVar.getBinding()).aRJ;
        kotlin.jvm.internal.i.e(imageView, "binding.like");
        imageView.setEnabled(z);
        ImageView imageView2 = ((au) tVar.getBinding()).aRI;
        kotlin.jvm.internal.i.e(imageView2, "binding.dislike");
        imageView2.setEnabled(z);
    }

    private final void a(t tVar, boolean z, boolean z2) {
        ImageView imageView = ((au) tVar.getBinding()).aRJ;
        kotlin.jvm.internal.i.e(imageView, "binding.like");
        imageView.setActivated(z);
        ImageView imageView2 = ((au) tVar.getBinding()).aRI;
        kotlin.jvm.internal.i.e(imageView2, "binding.dislike");
        imageView2.setActivated(z2);
    }

    private final void a(as asVar, com.iqoption.core.microservices.chat.response.e eVar, int i) {
        asVar.a(eVar);
        MessageView messageView = ((ca) asVar.getBinding()).aRK;
        kotlin.jvm.internal.i.e(messageView, "binding.message");
        a(eVar, messageView);
        TextView textView = ((ca) asVar.getBinding()).aRe;
        kotlin.jvm.internal.i.e(textView, "binding.author");
        ImageView imageView = ((ca) asVar.getBinding()).aQW;
        kotlin.jvm.internal.i.e(imageView, "binding.avatar");
        a(eVar, i, textView, imageView);
        if (i == 2) {
            ((ca) asVar.getBinding()).aRf.setBackgroundResource(com.iqoption.chat.e.e.chat_message_bubble_left_body);
        } else if (i != 3) {
            ((ca) asVar.getBinding()).aRf.setBackgroundResource(com.iqoption.chat.e.e.chat_message_bubble_left_head);
        } else {
            ((ca) asVar.getBinding()).aRf.setBackgroundResource(com.iqoption.chat.e.e.chat_message_bubble_left_tail);
        }
        TextView textView2 = ((ca) asVar.getBinding()).aRV;
        if (eVar.abY().acw()) {
            textView2.setEnabled(false);
            textView2.setAlpha(0.5f);
            return;
        }
        textView2.setEnabled(true);
        textView2.setAlpha(1.0f);
    }

    private final void a(com.iqoption.core.microservices.chat.response.e eVar, int i, TextView textView, ImageView imageView) {
        if (i == 0) {
            com.iqoption.core.ext.a.ak(textView);
            textView.setText(eVar.acb());
            com.iqoption.core.ext.a.ak(imageView);
            a(eVar, imageView);
        } else if (i == 1) {
            com.iqoption.core.ext.a.ak(textView);
            textView.setText(eVar.acb());
            com.iqoption.core.ext.a.al(imageView);
        } else if (i == 2) {
            com.iqoption.core.ext.a.al(textView);
            com.iqoption.core.ext.a.al(imageView);
        } else if (i == 3) {
            com.iqoption.core.ext.a.al(textView);
            com.iqoption.core.ext.a.ak(imageView);
            a(eVar, imageView);
        }
    }

    private final void a(an anVar, com.iqoption.core.microservices.chat.response.m mVar) {
        anVar.a(mVar);
        TextView textView = ((bq) anVar.getBinding()).aRU;
        kotlin.jvm.internal.i.e(textView, "binding.suggestion");
        textView.setText(anVar.RQ().getName());
    }

    public int getItemViewType(int i) {
        return this.aPd.get(i);
    }

    public long getItemId(int i) {
        return this.aPc.a((y) this.iA.get(i));
    }

    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        kotlin.jvm.internal.i.f(recyclerView, "recyclerView");
        super.onAttachedToRecyclerView(recyclerView);
        Context context = recyclerView.getContext();
        Picasso with = Picasso.with(context);
        kotlin.jvm.internal.i.e(with, "Picasso.with(this)");
        this.picasso = with;
        AssetManager assets = context.getAssets();
        kotlin.jvm.internal.i.e(assets, "assets");
        this.assetManager = assets;
        LayoutInflater from = LayoutInflater.from(context);
        kotlin.jvm.internal.i.e(from, "LayoutInflater.from(this)");
        this.aPl = from;
        this.aPm = new TextAppearanceSpan(context, com.iqoption.chat.e.k.ChatMessageDateTextAppearance_Bold);
        this.aPn = new TextAppearanceSpan(context, com.iqoption.chat.e.k.ChatMessageDateTextAppearance);
    }

    public final void b(List<? extends y> list, DiffResult diffResult) {
        this.iA.clear();
        if (list != null) {
            this.iA.addAll(list);
        }
        if (diffResult != null) {
            diffResult.dispatchUpdatesTo((Adapter) this);
        } else {
            notifyDataSetChanged();
        }
    }

    public final void eW(String str) {
        kotlin.jvm.internal.i.f(str, "messageId");
        Object obj = null;
        int i = 0;
        for (y yVar : this.iA) {
            Object obj2 = ((yVar instanceof aa) && kotlin.jvm.internal.i.y(((aa) yVar).QT().getId(), str)) ? 1 : null;
            if (obj2 != null) {
                break;
            }
            i++;
        }
        i = -1;
        Integer valueOf = Integer.valueOf(i);
        if (valueOf.intValue() != -1) {
            obj = 1;
        }
        if (obj == null) {
            valueOf = null;
        }
        if (valueOf != null) {
            notifyItemChanged(valueOf.intValue());
        }
    }
}
