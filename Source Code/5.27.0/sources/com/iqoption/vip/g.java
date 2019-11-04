package com.iqoption.vip;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.iqoption.e.aar;
import com.iqoption.microservice.vip.d;
import com.iqoption.x.R;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.Transformation;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import kotlin.TypeCastException;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0011\u0012\u0013B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0016J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0007H\u0016J\u0018\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0007H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, bng = {"Lcom/iqoption/vip/VipAboutAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "vipManager", "Lcom/iqoption/microservice/vip/VipManager;", "(Lcom/iqoption/microservice/vip/VipManager;)V", "getItemCount", "", "getItemViewType", "position", "onBindViewHolder", "", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "Companion", "MainInfoViewHolder", "PhotoViewHolder", "app_optionXRelease"})
/* compiled from: VipAboutAdapter.kt */
public final class g extends Adapter<ViewHolder> {
    public static final a ejF = new a();
    private final d ejE;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, bng = {"Lcom/iqoption/vip/VipAboutAdapter$Companion;", "", "()V", "VIEW_TYPE_MAIN", "", "VIEW_TYPE_PHOTO", "app_optionXRelease"})
    /* compiled from: VipAboutAdapter.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u000eH\u0002J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u000eH\u0002J\u0010\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u000eH\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0018"}, bng = {"Lcom/iqoption/vip/VipAboutAdapter$MainInfoViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/iqoption/databinding/VipAboutInfoBinding;", "(Lcom/iqoption/databinding/VipAboutInfoBinding;)V", "getBinding", "()Lcom/iqoption/databinding/VipAboutInfoBinding;", "bind", "", "vipManager", "Lcom/iqoption/microservice/vip/VipManager;", "getCalendar", "Ljava/util/Calendar;", "date", "Ljava/util/Date;", "getDiffYears", "", "first", "last", "workDurationFromDate", "", "managerWorkStartDate", "yearsOldFromDate", "managerBirthday", "app_optionXRelease"})
    /* compiled from: VipAboutAdapter.kt */
    public static final class b extends ViewHolder {
        private final aar ejG;

        public b(aar aar) {
            kotlin.jvm.internal.i.f(aar, "binding");
            super(aar.getRoot());
            this.ejG = aar;
        }

        public final void a(d dVar) {
            String stringBuilder;
            kotlin.jvm.internal.i.f(dVar, "vipManager");
            TextView textView = this.ejG.amZ;
            kotlin.jvm.internal.i.e(textView, "binding.name");
            textView.setText(dVar.aOG());
            String str = "binding.information";
            if (TextUtils.isEmpty(dVar.aOE())) {
                textView = this.ejG.cuI;
                kotlin.jvm.internal.i.e(textView, str);
                textView.setVisibility(8);
                textView = this.ejG.cuJ;
                kotlin.jvm.internal.i.e(textView, "binding.informationTitle");
                textView.setVisibility(8);
            } else {
                textView = this.ejG.cuI;
                kotlin.jvm.internal.i.e(textView, str);
                textView.setText(dVar.aOE());
            }
            textView = this.ejG.cuM;
            kotlin.jvm.internal.i.e(textView, "binding.languages");
            textView.setText(TextUtils.join(", ", dVar.aOF()));
            textView = this.ejG.cuK;
            kotlin.jvm.internal.i.e(textView, "binding.iqWorkDuration");
            textView.setText(e(dVar.aOM()));
            textView = this.ejG.cuP;
            kotlin.jvm.internal.i.e(textView, "binding.years");
            textView.setText(d(dVar.aOD()));
            int anj = com.iqoption.core.util.i.anj();
            TextView textView2 = this.ejG.ckW;
            kotlin.jvm.internal.i.e(textView2, "binding.workingHoursTitle");
            View view = this.itemView;
            String str2 = "itemView";
            kotlin.jvm.internal.i.e(view, str2);
            Context context = view.getContext();
            Object[] objArr = new Object[1];
            if (anj >= 0) {
                StringBuilder stringBuilder2 = new StringBuilder();
                stringBuilder2.append('+');
                stringBuilder2.append(anj);
                stringBuilder = stringBuilder2.toString();
            } else {
                stringBuilder = String.valueOf(anj);
            }
            objArr[0] = stringBuilder;
            textView2.setText(context.getString(R.string.working_hours_n1, objArr));
            textView = this.ejG.ckV;
            kotlin.jvm.internal.i.e(textView, "binding.workingHours");
            textView.setText(TextUtils.join("; ", dVar.aON()));
            if (TextUtils.isEmpty(dVar.aOI())) {
                this.ejG.aQW.setImageResource(R.drawable.ic_avatar_placeholder);
                return;
            }
            View view2 = this.itemView;
            kotlin.jvm.internal.i.e(view2, str2);
            Picasso.with(view2.getContext()).load(dVar.aOI()).transform((Transformation) new com.iqoption.core.ui.picasso.a()).into(this.ejG.aQW);
        }

        private final String d(Date date) {
            int a = a(date, new Date());
            View view = this.itemView;
            kotlin.jvm.internal.i.e(view, "itemView");
            Context context = view.getContext();
            kotlin.jvm.internal.i.e(context, "itemView.context");
            String quantityString = context.getResources().getQuantityString(R.plurals.years_old, a, new Object[]{Integer.valueOf(a)});
            kotlin.jvm.internal.i.e(quantityString, "itemView.context.resourc…ld, diffYears, diffYears)");
            return quantityString;
        }

        private final String e(Date date) {
            int a = a(date, new Date());
            View view = this.itemView;
            kotlin.jvm.internal.i.e(view, "itemView");
            Context context = view.getContext();
            kotlin.jvm.internal.i.e(context, "itemView.context");
            String quantityString = context.getResources().getQuantityString(R.plurals.years_with_iq, a, new Object[]{Integer.valueOf(a)});
            kotlin.jvm.internal.i.e(quantityString, "itemView.context.resourc…iq, diffYears, diffYears)");
            return quantityString;
        }

        private final int a(Date date, Date date2) {
            Calendar f = f(date);
            Calendar f2 = f(date2);
            int i = f2.get(1) - f.get(1);
            return (f.get(2) > f2.get(2) || (f.get(2) == f2.get(2) && f.get(5) > f2.get(5))) ? i - 1 : i;
        }

        private final Calendar f(Date date) {
            Calendar instance = Calendar.getInstance(Locale.US);
            kotlin.jvm.internal.i.e(instance, "calendar");
            instance.setTime(date);
            return instance;
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, bng = {"Lcom/iqoption/vip/VipAboutAdapter$PhotoViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "image", "Landroid/widget/ImageView;", "(Landroid/widget/ImageView;)V", "getImage", "()Landroid/widget/ImageView;", "bind", "", "imageUrl", "", "app_optionXRelease"})
    /* compiled from: VipAboutAdapter.kt */
    public static final class c extends ViewHolder {
        private final ImageView De;

        public c(ImageView imageView) {
            kotlin.jvm.internal.i.f(imageView, "image");
            super(imageView);
            this.De = imageView;
        }

        public final void eK(String str) {
            kotlin.jvm.internal.i.f(str, "imageUrl");
            View view = this.itemView;
            kotlin.jvm.internal.i.e(view, "itemView");
            Picasso.with(view.getContext()).load(str).into(this.De);
        }
    }

    public int getItemViewType(int i) {
        return i == 0 ? 1 : 2;
    }

    public g(d dVar) {
        kotlin.jvm.internal.i.f(dVar, "vipManager");
        this.ejE = dVar;
    }

    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        kotlin.jvm.internal.i.f(viewGroup, "parent");
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        if (i == 1) {
            ViewDataBinding inflate = DataBindingUtil.inflate(from, R.layout.vip_about_info, viewGroup, false);
            kotlin.jvm.internal.i.e(inflate, "DataBindingUtil.inflate(…bout_info, parent, false)");
            return new b((aar) inflate);
        } else if (i == 2) {
            View inflate2 = from.inflate(R.layout.vip_image, viewGroup, false);
            if (inflate2 != null) {
                return new c((ImageView) inflate2);
            }
            throw new TypeCastException("null cannot be cast to non-null type android.widget.ImageView");
        } else {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Unimplemented view type ");
            stringBuilder.append(i);
            throw new IllegalStateException(stringBuilder.toString());
        }
    }

    public int getItemCount() {
        return this.ejE.aOJ().size() + 1;
    }

    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        kotlin.jvm.internal.i.f(viewHolder, "holder");
        if (i != 0) {
            ((c) viewHolder).eK((String) this.ejE.aOJ().get(i - 1));
        } else {
            ((b) viewHolder).a(this.ejE);
        }
    }
}
