package com.iqoption;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.core.view.InputDeviceCompat;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.library.baseAdapters.DataBinderMapperImpl;
import androidx.recyclerview.widget.ItemTouchHelper.Callback;
import com.iqoption.billing.g;
import com.iqoption.cardsverification.e;
import com.iqoption.core.c;
import com.iqoption.e.aa;
import com.iqoption.e.aaa;
import com.iqoption.e.aac;
import com.iqoption.e.aae;
import com.iqoption.e.aag;
import com.iqoption.e.aai;
import com.iqoption.e.aak;
import com.iqoption.e.aam;
import com.iqoption.e.aao;
import com.iqoption.e.aaq;
import com.iqoption.e.aas;
import com.iqoption.e.aau;
import com.iqoption.e.aaw;
import com.iqoption.e.aay;
import com.iqoption.e.aba;
import com.iqoption.e.abc;
import com.iqoption.e.abe;
import com.iqoption.e.abg;
import com.iqoption.e.ac;
import com.iqoption.e.ae;
import com.iqoption.e.ag;
import com.iqoption.e.ai;
import com.iqoption.e.ak;
import com.iqoption.e.am;
import com.iqoption.e.ao;
import com.iqoption.e.aq;
import com.iqoption.e.as;
import com.iqoption.e.au;
import com.iqoption.e.aw;
import com.iqoption.e.ay;
import com.iqoption.e.ba;
import com.iqoption.e.bc;
import com.iqoption.e.be;
import com.iqoption.e.bg;
import com.iqoption.e.bi;
import com.iqoption.e.bk;
import com.iqoption.e.bm;
import com.iqoption.e.bo;
import com.iqoption.e.bq;
import com.iqoption.e.bs;
import com.iqoption.e.bu;
import com.iqoption.e.bw;
import com.iqoption.e.by;
import com.iqoption.e.ca;
import com.iqoption.e.cc;
import com.iqoption.e.ce;
import com.iqoption.e.cg;
import com.iqoption.e.ci;
import com.iqoption.e.ck;
import com.iqoption.e.cm;
import com.iqoption.e.co;
import com.iqoption.e.cq;
import com.iqoption.e.cs;
import com.iqoption.e.cu;
import com.iqoption.e.cw;
import com.iqoption.e.cy;
import com.iqoption.e.d;
import com.iqoption.e.da;
import com.iqoption.e.dc;
import com.iqoption.e.de;
import com.iqoption.e.dg;
import com.iqoption.e.di;
import com.iqoption.e.dj;
import com.iqoption.e.dl;
import com.iqoption.e.dn;
import com.iqoption.e.dp;
import com.iqoption.e.dr;
import com.iqoption.e.dt;
import com.iqoption.e.dv;
import com.iqoption.e.dx;
import com.iqoption.e.dz;
import com.iqoption.e.eb;
import com.iqoption.e.ed;
import com.iqoption.e.ef;
import com.iqoption.e.eh;
import com.iqoption.e.ej;
import com.iqoption.e.el;
import com.iqoption.e.en;
import com.iqoption.e.ep;
import com.iqoption.e.er;
import com.iqoption.e.et;
import com.iqoption.e.ev;
import com.iqoption.e.ex;
import com.iqoption.e.ez;
import com.iqoption.e.f;
import com.iqoption.e.fb;
import com.iqoption.e.fd;
import com.iqoption.e.ff;
import com.iqoption.e.fh;
import com.iqoption.e.fj;
import com.iqoption.e.fl;
import com.iqoption.e.fn;
import com.iqoption.e.fp;
import com.iqoption.e.fr;
import com.iqoption.e.ft;
import com.iqoption.e.fv;
import com.iqoption.e.fx;
import com.iqoption.e.fz;
import com.iqoption.e.gb;
import com.iqoption.e.gd;
import com.iqoption.e.gf;
import com.iqoption.e.gh;
import com.iqoption.e.gj;
import com.iqoption.e.gl;
import com.iqoption.e.gn;
import com.iqoption.e.gp;
import com.iqoption.e.gr;
import com.iqoption.e.gt;
import com.iqoption.e.gv;
import com.iqoption.e.gx;
import com.iqoption.e.gz;
import com.iqoption.e.h;
import com.iqoption.e.hb;
import com.iqoption.e.hd;
import com.iqoption.e.hf;
import com.iqoption.e.hh;
import com.iqoption.e.hj;
import com.iqoption.e.hl;
import com.iqoption.e.hn;
import com.iqoption.e.hp;
import com.iqoption.e.hr;
import com.iqoption.e.ht;
import com.iqoption.e.hv;
import com.iqoption.e.hx;
import com.iqoption.e.hz;
import com.iqoption.e.ib;
import com.iqoption.e.id;
import com.iqoption.e.if;
import com.iqoption.e.ih;
import com.iqoption.e.ij;
import com.iqoption.e.il;
import com.iqoption.e.in;
import com.iqoption.e.ip;
import com.iqoption.e.ir;
import com.iqoption.e.it;
import com.iqoption.e.iv;
import com.iqoption.e.ix;
import com.iqoption.e.iz;
import com.iqoption.e.j;
import com.iqoption.e.jb;
import com.iqoption.e.jd;
import com.iqoption.e.jf;
import com.iqoption.e.jh;
import com.iqoption.e.jj;
import com.iqoption.e.jl;
import com.iqoption.e.jn;
import com.iqoption.e.jp;
import com.iqoption.e.jr;
import com.iqoption.e.jt;
import com.iqoption.e.jv;
import com.iqoption.e.jx;
import com.iqoption.e.jz;
import com.iqoption.e.kb;
import com.iqoption.e.kd;
import com.iqoption.e.kf;
import com.iqoption.e.kh;
import com.iqoption.e.kj;
import com.iqoption.e.kl;
import com.iqoption.e.kn;
import com.iqoption.e.kp;
import com.iqoption.e.kr;
import com.iqoption.e.kt;
import com.iqoption.e.kv;
import com.iqoption.e.kx;
import com.iqoption.e.kz;
import com.iqoption.e.l;
import com.iqoption.e.lb;
import com.iqoption.e.ld;
import com.iqoption.e.lf;
import com.iqoption.e.lh;
import com.iqoption.e.lj;
import com.iqoption.e.ll;
import com.iqoption.e.ln;
import com.iqoption.e.lp;
import com.iqoption.e.lq;
import com.iqoption.e.ls;
import com.iqoption.e.lu;
import com.iqoption.e.lw;
import com.iqoption.e.ly;
import com.iqoption.e.ma;
import com.iqoption.e.mc;
import com.iqoption.e.me;
import com.iqoption.e.mg;
import com.iqoption.e.mi;
import com.iqoption.e.mk;
import com.iqoption.e.mm;
import com.iqoption.e.mo;
import com.iqoption.e.mq;
import com.iqoption.e.ms;
import com.iqoption.e.mu;
import com.iqoption.e.mw;
import com.iqoption.e.my;
import com.iqoption.e.n;
import com.iqoption.e.na;
import com.iqoption.e.nc;
import com.iqoption.e.ne;
import com.iqoption.e.ng;
import com.iqoption.e.ni;
import com.iqoption.e.nk;
import com.iqoption.e.nm;
import com.iqoption.e.no;
import com.iqoption.e.nq;
import com.iqoption.e.ns;
import com.iqoption.e.nu;
import com.iqoption.e.nw;
import com.iqoption.e.ny;
import com.iqoption.e.oa;
import com.iqoption.e.oc;
import com.iqoption.e.oe;
import com.iqoption.e.og;
import com.iqoption.e.oi;
import com.iqoption.e.ok;
import com.iqoption.e.om;
import com.iqoption.e.oo;
import com.iqoption.e.oq;
import com.iqoption.e.os;
import com.iqoption.e.ou;
import com.iqoption.e.ow;
import com.iqoption.e.oy;
import com.iqoption.e.p;
import com.iqoption.e.pa;
import com.iqoption.e.pc;
import com.iqoption.e.pe;
import com.iqoption.e.pg;
import com.iqoption.e.pi;
import com.iqoption.e.pk;
import com.iqoption.e.pm;
import com.iqoption.e.po;
import com.iqoption.e.pq;
import com.iqoption.e.ps;
import com.iqoption.e.pu;
import com.iqoption.e.pw;
import com.iqoption.e.py;
import com.iqoption.e.qa;
import com.iqoption.e.qc;
import com.iqoption.e.qe;
import com.iqoption.e.qg;
import com.iqoption.e.qi;
import com.iqoption.e.qk;
import com.iqoption.e.qm;
import com.iqoption.e.qo;
import com.iqoption.e.qq;
import com.iqoption.e.qs;
import com.iqoption.e.qu;
import com.iqoption.e.qw;
import com.iqoption.e.qy;
import com.iqoption.e.r;
import com.iqoption.e.ra;
import com.iqoption.e.rc;
import com.iqoption.e.re;
import com.iqoption.e.rg;
import com.iqoption.e.ri;
import com.iqoption.e.rk;
import com.iqoption.e.rm;
import com.iqoption.e.ro;
import com.iqoption.e.rq;
import com.iqoption.e.rs;
import com.iqoption.e.ru;
import com.iqoption.e.rw;
import com.iqoption.e.ry;
import com.iqoption.e.sa;
import com.iqoption.e.sc;
import com.iqoption.e.se;
import com.iqoption.e.sg;
import com.iqoption.e.si;
import com.iqoption.e.sk;
import com.iqoption.e.sm;
import com.iqoption.e.so;
import com.iqoption.e.sq;
import com.iqoption.e.ss;
import com.iqoption.e.su;
import com.iqoption.e.sw;
import com.iqoption.e.sy;
import com.iqoption.e.t;
import com.iqoption.e.ta;
import com.iqoption.e.tc;
import com.iqoption.e.te;
import com.iqoption.e.tg;
import com.iqoption.e.ti;
import com.iqoption.e.tk;
import com.iqoption.e.tm;
import com.iqoption.e.to;
import com.iqoption.e.tq;
import com.iqoption.e.ts;
import com.iqoption.e.tu;
import com.iqoption.e.tw;
import com.iqoption.e.ty;
import com.iqoption.e.ua;
import com.iqoption.e.uc;
import com.iqoption.e.ue;
import com.iqoption.e.ug;
import com.iqoption.e.ui;
import com.iqoption.e.uk;
import com.iqoption.e.um;
import com.iqoption.e.uo;
import com.iqoption.e.uq;
import com.iqoption.e.us;
import com.iqoption.e.uu;
import com.iqoption.e.uw;
import com.iqoption.e.uy;
import com.iqoption.e.v;
import com.iqoption.e.va;
import com.iqoption.e.vc;
import com.iqoption.e.ve;
import com.iqoption.e.vg;
import com.iqoption.e.vi;
import com.iqoption.e.vk;
import com.iqoption.e.vm;
import com.iqoption.e.vo;
import com.iqoption.e.vq;
import com.iqoption.e.vs;
import com.iqoption.e.vu;
import com.iqoption.e.vw;
import com.iqoption.e.vy;
import com.iqoption.e.wa;
import com.iqoption.e.wc;
import com.iqoption.e.we;
import com.iqoption.e.wg;
import com.iqoption.e.wi;
import com.iqoption.e.wk;
import com.iqoption.e.wm;
import com.iqoption.e.wo;
import com.iqoption.e.wq;
import com.iqoption.e.ws;
import com.iqoption.e.wu;
import com.iqoption.e.ww;
import com.iqoption.e.wy;
import com.iqoption.e.x;
import com.iqoption.e.xa;
import com.iqoption.e.xc;
import com.iqoption.e.xe;
import com.iqoption.e.xg;
import com.iqoption.e.xi;
import com.iqoption.e.xk;
import com.iqoption.e.xm;
import com.iqoption.e.xo;
import com.iqoption.e.xq;
import com.iqoption.e.xs;
import com.iqoption.e.xu;
import com.iqoption.e.xw;
import com.iqoption.e.xy;
import com.iqoption.e.y;
import com.iqoption.e.ya;
import com.iqoption.e.yc;
import com.iqoption.e.ye;
import com.iqoption.e.yg;
import com.iqoption.e.yi;
import com.iqoption.e.yk;
import com.iqoption.e.ym;
import com.iqoption.e.yo;
import com.iqoption.e.yq;
import com.iqoption.e.ys;
import com.iqoption.e.yu;
import com.iqoption.e.yw;
import com.iqoption.e.yy;
import com.iqoption.e.za;
import com.iqoption.e.zc;
import com.iqoption.e.ze;
import com.iqoption.e.zg;
import com.iqoption.e.zi;
import com.iqoption.e.zk;
import com.iqoption.e.zm;
import com.iqoption.e.zo;
import com.iqoption.e.zq;
import com.iqoption.e.zs;
import com.iqoption.e.zu;
import com.iqoption.e.zw;
import com.iqoption.e.zy;
import com.iqoption.x.R;
import com.jumio.analytics.MobileEvents;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* compiled from: DataBinderMapperImpl */
public class b extends DataBinderMapper {
    private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(366);

    /* compiled from: DataBinderMapperImpl */
    private static class a {
        static final SparseArray<String> sKeys = new SparseArray(8);

        static {
            sKeys.put(0, "_all");
            sKeys.put(1, "dialog");
            sKeys.put(2, "handler");
            sKeys.put(3, "toast");
            sKeys.put(4, "fragment");
            sKeys.put(5, "viewHelper");
            sKeys.put(6, "holder");
        }
    }

    /* compiled from: DataBinderMapperImpl */
    private static class b {
        static final HashMap<String, Integer> sKeys = new HashMap(369);

        static {
            sKeys.put("layout/account_security_confirm_code_expired_fragment_0", Integer.valueOf(R.layout.account_security_confirm_code_expired_fragment));
            sKeys.put("layout/account_security_confirm_code_fragment_0", Integer.valueOf(R.layout.account_security_confirm_code_fragment));
            sKeys.put("layout/account_security_confirm_phone_2step_auth_fragment_0", Integer.valueOf(R.layout.account_security_confirm_phone_2step_auth_fragment));
            sKeys.put("layout/account_security_confirm_phone_fragment_0", Integer.valueOf(R.layout.account_security_confirm_phone_fragment));
            sKeys.put("layout/account_security_confirmed_email_fragment_0", Integer.valueOf(R.layout.account_security_confirmed_email_fragment));
            sKeys.put("layout/account_security_confirmed_phone_fragment_0", Integer.valueOf(R.layout.account_security_confirmed_phone_fragment));
            sKeys.put("layout/account_security_email_confirm_fragment_0", Integer.valueOf(R.layout.account_security_email_confirm_fragment));
            sKeys.put("layout/account_security_phone_number_fragment_0", Integer.valueOf(R.layout.account_security_phone_number_fragment));
            sKeys.put("layout/account_security_resend_email_fragment_0", Integer.valueOf(R.layout.account_security_resend_email_fragment));
            sKeys.put("layout/account_security_turn_on_2step_auth_fragment_0", Integer.valueOf(R.layout.account_security_turn_on_2step_auth_fragment));
            sKeys.put("layout/account_security_turn_on_touch_id_fragment_0", Integer.valueOf(R.layout.account_security_turn_on_touch_id_fragment));
            HashMap hashMap = sKeys;
            Integer valueOf = Integer.valueOf(R.layout.active_sessions_fragment);
            hashMap.put("layout-land/active_sessions_fragment_0", valueOf);
            sKeys.put("layout/active_sessions_fragment_0", valueOf);
            sKeys.put("layout/active_tools_item_0", Integer.valueOf(R.layout.active_tools_item));
            sKeys.put("layout/activity_pending_removal_0", Integer.valueOf(R.layout.activity_pending_removal));
            sKeys.put("layout/activity_pro_deposit_0", Integer.valueOf(R.layout.activity_pro_deposit));
            sKeys.put("layout/activity_pro_kyc_0", Integer.valueOf(R.layout.activity_pro_kyc));
            sKeys.put("layout/activity_pro_trader_web_0", Integer.valueOf(R.layout.activity_pro_trader_web));
            sKeys.put("layout/activity_verify_cards_0", Integer.valueOf(R.layout.activity_verify_cards));
            sKeys.put("layout/activity_welcome_onboarding_0", Integer.valueOf(R.layout.activity_welcome_onboarding));
            sKeys.put("layout/activity_withdraw_0", Integer.valueOf(R.layout.activity_withdraw));
            sKeys.put("layout/asset_base_cfd_item_0", Integer.valueOf(R.layout.asset_base_cfd_item));
            sKeys.put("layout/asset_base_options_item_0", Integer.valueOf(R.layout.asset_base_options_item));
            sKeys.put("layout/asset_fragment_0", Integer.valueOf(R.layout.asset_fragment));
            sKeys.put("layout/asset_info_info_item_0", Integer.valueOf(R.layout.asset_info_info_item));
            sKeys.put("layout/asset_info_price_crypto_item_0", Integer.valueOf(R.layout.asset_info_price_crypto_item));
            sKeys.put("layout/asset_info_price_full_item_0", Integer.valueOf(R.layout.asset_info_price_full_item));
            sKeys.put("layout/asset_info_price_item_0", Integer.valueOf(R.layout.asset_info_price_item));
            sKeys.put("layout/asset_info_statistics_full_item_0", Integer.valueOf(R.layout.asset_info_statistics_full_item));
            sKeys.put("layout/asset_info_statistics_item_0", Integer.valueOf(R.layout.asset_info_statistics_item));
            sKeys.put("layout/asset_info_statistics_more_item_0", Integer.valueOf(R.layout.asset_info_statistics_more_item));
            sKeys.put("layout/asset_info_title_item_0", Integer.valueOf(R.layout.asset_info_title_item));
            sKeys.put("layout/asset_info_traders_pulse_item_0", Integer.valueOf(R.layout.asset_info_traders_pulse_item));
            sKeys.put("layout/asset_overnight_info_item_0", Integer.valueOf(R.layout.asset_overnight_info_item));
            sKeys.put("layout/asset_overnight_item_item_0", Integer.valueOf(R.layout.asset_overnight_item_item));
            sKeys.put("layout/asset_overnight_title_item_0", Integer.valueOf(R.layout.asset_overnight_title_item));
            sKeys.put("layout/asset_overnight_today_item_0", Integer.valueOf(R.layout.asset_overnight_today_item));
            sKeys.put("layout/asset_schedule_item_item_0", Integer.valueOf(R.layout.asset_schedule_item_item));
            sKeys.put("layout/asset_schedule_title_item_0", Integer.valueOf(R.layout.asset_schedule_title_item));
            sKeys.put("layout/asset_spinner_handle_0", Integer.valueOf(R.layout.asset_spinner_handle));
            sKeys.put("layout/assets_bo_item_0", Integer.valueOf(R.layout.assets_bo_item));
            sKeys.put("layout/assets_category_item_0", Integer.valueOf(R.layout.assets_category_item));
            sKeys.put("layout/assets_cfd_item_0", Integer.valueOf(R.layout.assets_cfd_item));
            sKeys.put("layout/assets_closed_item_0", Integer.valueOf(R.layout.assets_closed_item));
            sKeys.put("layout/assets_do_item_0", Integer.valueOf(R.layout.assets_do_item));
            sKeys.put("layout/assets_fx_item_0", Integer.valueOf(R.layout.assets_fx_item));
            sKeys.put("layout/assets_header_bo_0", Integer.valueOf(R.layout.assets_header_bo));
            sKeys.put("layout/assets_header_cfd_0", Integer.valueOf(R.layout.assets_header_cfd));
            sKeys.put("layout/assets_header_do_0", Integer.valueOf(R.layout.assets_header_do));
            sKeys.put("layout/assets_header_fx_0", Integer.valueOf(R.layout.assets_header_fx));
            sKeys.put("layout/assets_item_actions_0", Integer.valueOf(R.layout.assets_item_actions));
            sKeys.put("layout/assets_multi_item_0", Integer.valueOf(R.layout.assets_multi_item));
            sKeys.put("layout/assets_multi_warning_item_0", Integer.valueOf(R.layout.assets_multi_warning_item));
            sKeys.put("layout/balance_cell_0", Integer.valueOf(R.layout.balance_cell));
            sKeys.put("layout/base_menu_fragment_0", Integer.valueOf(R.layout.base_menu_fragment));
            sKeys.put("layout/base_smart_dialog_fragment_0", Integer.valueOf(R.layout.base_smart_dialog_fragment));
            hashMap = sKeys;
            valueOf = Integer.valueOf(R.layout.base_smart_fragment);
            hashMap.put("layout/base_smart_fragment_0", valueOf);
            sKeys.put("layout-sw720dp/base_smart_fragment_0", valueOf);
            sKeys.put("layout/bottom_sheet_chooser_0", Integer.valueOf(R.layout.bottom_sheet_chooser));
            sKeys.put("layout/bottom_sheet_commission_0", Integer.valueOf(R.layout.bottom_sheet_commission));
            sKeys.put("layout/bottom_sheet_item_0", Integer.valueOf(R.layout.bottom_sheet_item));
            sKeys.put("layout/bottom_sheet_message_0", Integer.valueOf(R.layout.bottom_sheet_message));
            sKeys.put("layout/bottom_sheet_otn_emission_history_0", Integer.valueOf(R.layout.bottom_sheet_otn_emission_history));
            sKeys.put("layout/bottom_sheet_portfolio_filter_chooser_0", Integer.valueOf(R.layout.bottom_sheet_portfolio_filter_chooser));
            sKeys.put("layout/bottom_sheet_portfolio_tpsl_chooser_0", Integer.valueOf(R.layout.bottom_sheet_portfolio_tpsl_chooser));
            sKeys.put("layout/buy_new_dialog_view_0", Integer.valueOf(R.layout.buy_new_dialog_view));
            sKeys.put("layout/cfd_expiration_fragment_0", Integer.valueOf(R.layout.cfd_expiration_fragment));
            sKeys.put("layout/close_crypto_position_delegate_0", Integer.valueOf(R.layout.close_crypto_position_delegate));
            sKeys.put("layout/close_delegate_0", Integer.valueOf(R.layout.close_delegate));
            sKeys.put("layout/close_position_delegate_0", Integer.valueOf(R.layout.close_position_delegate));
            sKeys.put("layout/closed_portfolio_item_0", Integer.valueOf(R.layout.closed_portfolio_item));
            sKeys.put("layout/commission_view_0", Integer.valueOf(R.layout.commission_view));
            sKeys.put("layout/confirm_dialog_view_0", Integer.valueOf(R.layout.confirm_dialog_view));
            sKeys.put("layout/crypto_confirm_dialog_view_0", Integer.valueOf(R.layout.crypto_confirm_dialog_view));
            sKeys.put("layout/dialog_closed_deals_0", Integer.valueOf(R.layout.dialog_closed_deals));
            sKeys.put("layout/dialog_closed_deals_bottom_multi_0", Integer.valueOf(R.layout.dialog_closed_deals_bottom_multi));
            sKeys.put("layout/dialog_closed_deals_bottom_option_by_tick_0", Integer.valueOf(R.layout.dialog_closed_deals_bottom_option_by_tick));
            sKeys.put("layout/dialog_closed_deals_header_cfd_0", Integer.valueOf(R.layout.dialog_closed_deals_header_cfd));
            sKeys.put("layout/dialog_closed_deals_header_do_0", Integer.valueOf(R.layout.dialog_closed_deals_header_do));
            sKeys.put("layout/dialog_closed_deals_header_list_cfd_0", Integer.valueOf(R.layout.dialog_closed_deals_header_list_cfd));
            sKeys.put("layout/dialog_closed_deals_header_list_do_0", Integer.valueOf(R.layout.dialog_closed_deals_header_list_do));
            sKeys.put("layout/dialog_closed_deals_header_list_multi_0", Integer.valueOf(R.layout.dialog_closed_deals_header_list_multi));
            sKeys.put("layout/dialog_closed_deals_header_multi_0", Integer.valueOf(R.layout.dialog_closed_deals_header_multi));
            sKeys.put("layout/dialog_closed_deals_item_cfd_0", Integer.valueOf(R.layout.dialog_closed_deals_item_cfd));
            sKeys.put("layout/dialog_closed_deals_item_cfd_aggregated_0", Integer.valueOf(R.layout.dialog_closed_deals_item_cfd_aggregated));
            sKeys.put("layout/dialog_closed_deals_item_do_0", Integer.valueOf(R.layout.dialog_closed_deals_item_do));
            sKeys.put("layout/dialog_closed_deals_item_do_aggregated_0", Integer.valueOf(R.layout.dialog_closed_deals_item_do_aggregated));
            sKeys.put("layout/dialog_closed_deals_item_multi_0", Integer.valueOf(R.layout.dialog_closed_deals_item_multi));
            sKeys.put("layout/dialog_commision_info_0", Integer.valueOf(R.layout.dialog_commision_info));
            sKeys.put("layout/dialog_congrat_otn_emission_executed_0", Integer.valueOf(R.layout.dialog_congrat_otn_emission_executed));
            sKeys.put("layout/dialog_fragment_etfs_0", Integer.valueOf(R.layout.dialog_fragment_etfs));
            sKeys.put("layout/dialog_gdpr_warning_0", Integer.valueOf(R.layout.dialog_gdpr_warning));
            sKeys.put("layout/dialog_margin_add_on_info_0", Integer.valueOf(R.layout.dialog_margin_add_on_info));
            sKeys.put("layout/dialog_margin_add_on_position_0", Integer.valueOf(R.layout.dialog_margin_add_on_position));
            sKeys.put("layout/dialog_multiplier_confirm_0", Integer.valueOf(R.layout.dialog_multiplier_confirm));
            sKeys.put("layout/dialog_otn_commision_changed_0", Integer.valueOf(R.layout.dialog_otn_commision_changed));
            sKeys.put("layout/dialog_otn_expectation_0", Integer.valueOf(R.layout.dialog_otn_expectation));
            sKeys.put("layout/dialog_otn_reward_info_0", Integer.valueOf(R.layout.dialog_otn_reward_info));
            sKeys.put("layout/dialog_overnight_fee_info_0", Integer.valueOf(R.layout.dialog_overnight_fee_info));
            sKeys.put("layout/dialog_portfolio_invest_info_0", Integer.valueOf(R.layout.dialog_portfolio_invest_info));
            sKeys.put("layout/dialog_pro_application_status_0", Integer.valueOf(R.layout.dialog_pro_application_status));
            sKeys.put("layout/dialog_pro_trader_benefits_0", Integer.valueOf(R.layout.dialog_pro_trader_benefits));
            sKeys.put("layout/dialog_pro_trader_selected_0", Integer.valueOf(R.layout.dialog_pro_trader_selected));
            sKeys.put("layout/dialog_reload_practice_0", Integer.valueOf(R.layout.dialog_reload_practice));
            sKeys.put("layout/dialog_tpsl_0", Integer.valueOf(R.layout.dialog_tpsl));
            sKeys.put("layout/dialog_trade_on_practice_0", Integer.valueOf(R.layout.dialog_trade_on_practice));
            sKeys.put("layout/dialog_trailing_info_0", Integer.valueOf(R.layout.dialog_trailing_info));
            sKeys.put("layout/dialog_warning_0", Integer.valueOf(R.layout.dialog_warning));
            sKeys.put("layout/dialog_whats_new_0", Integer.valueOf(R.layout.dialog_whats_new));
            sKeys.put("layout/dialog_whats_new_video_autoplay_delegate_0", Integer.valueOf(R.layout.dialog_whats_new_video_autoplay_delegate));
            sKeys.put("layout/dialog_whats_new_video_delegate_0", Integer.valueOf(R.layout.dialog_whats_new_video_delegate));
            sKeys.put("layout/dialog_whats_new_without_btn_0", Integer.valueOf(R.layout.dialog_whats_new_without_btn));
            sKeys.put("layout/dialpad_0", Integer.valueOf(R.layout.dialpad));
            sKeys.put("layout/dialpad_dot_0", Integer.valueOf(R.layout.dialpad_dot));
            sKeys.put("layout/dialpad_key_0", Integer.valueOf(R.layout.dialpad_key));
            sKeys.put("layout/dialpad_key_back_0", Integer.valueOf(R.layout.dialpad_key_back));
            sKeys.put("layout/dialpad_key_touchid_0", Integer.valueOf(R.layout.dialpad_key_touchid));
            sKeys.put("layout/dialpad_key_zero_0", Integer.valueOf(R.layout.dialpad_key_zero));
            sKeys.put("layout/digital_expiration_fragment_0", Integer.valueOf(R.layout.digital_expiration_fragment));
            sKeys.put("layout/expiration_fragment_0", Integer.valueOf(R.layout.expiration_fragment));
            sKeys.put("layout/fee_history_item_0", Integer.valueOf(R.layout.fee_history_item));
            sKeys.put("layout/fragment_account_security_0", Integer.valueOf(R.layout.fragment_account_security));
            sKeys.put("layout/fragment_account_security_page_0", Integer.valueOf(R.layout.fragment_account_security_page));
            sKeys.put("layout/fragment_account_security_passcode_0", Integer.valueOf(R.layout.fragment_account_security_passcode));
            sKeys.put("layout/fragment_account_security_passcode_error_0", Integer.valueOf(R.layout.fragment_account_security_passcode_error));
            sKeys.put("layout/fragment_active_phase_notification_0", Integer.valueOf(R.layout.fragment_active_phase_notification));
            sKeys.put("layout/fragment_assets_0", Integer.valueOf(R.layout.fragment_assets));
            sKeys.put("layout/fragment_commission_change_0", Integer.valueOf(R.layout.fragment_commission_change));
            sKeys.put("layout/fragment_info_asset_0", Integer.valueOf(R.layout.fragment_info_asset));
            sKeys.put("layout/fragment_info_asset_conditions_0", Integer.valueOf(R.layout.fragment_info_asset_conditions));
            sKeys.put("layout/fragment_info_asset_main_info_0", Integer.valueOf(R.layout.fragment_info_asset_main_info));
            sKeys.put("layout/fragment_kyc_acceptable_documents_0", Integer.valueOf(R.layout.fragment_kyc_acceptable_documents));
            sKeys.put("layout/fragment_kyc_address_declined_0", Integer.valueOf(R.layout.fragment_kyc_address_declined));
            sKeys.put("layout/fragment_kyc_address_old_0", Integer.valueOf(R.layout.fragment_kyc_address_old));
            sKeys.put("layout/fragment_kyc_check_box_0", Integer.valueOf(R.layout.fragment_kyc_check_box));
            sKeys.put("layout/fragment_kyc_country_old_0", Integer.valueOf(R.layout.fragment_kyc_country_old));
            sKeys.put("layout/fragment_kyc_cysec_0", Integer.valueOf(R.layout.fragment_kyc_cysec));
            sKeys.put("layout/fragment_kyc_date_of_birth_old_0", Integer.valueOf(R.layout.fragment_kyc_date_of_birth_old));
            sKeys.put("layout/fragment_kyc_document_address_0", Integer.valueOf(R.layout.fragment_kyc_document_address));
            sKeys.put("layout/fragment_kyc_documents_intro_0", Integer.valueOf(R.layout.fragment_kyc_documents_intro));
            sKeys.put("layout/fragment_kyc_documents_upload_0", Integer.valueOf(R.layout.fragment_kyc_documents_upload));
            sKeys.put("layout/fragment_kyc_email_0", Integer.valueOf(R.layout.fragment_kyc_email));
            sKeys.put("layout/fragment_kyc_email_confirm_0", Integer.valueOf(R.layout.fragment_kyc_email_confirm));
            sKeys.put("layout/fragment_kyc_email_confirmed_0", Integer.valueOf(R.layout.fragment_kyc_email_confirmed));
            sKeys.put("layout/fragment_kyc_finish_old_0", Integer.valueOf(R.layout.fragment_kyc_finish_old));
            sKeys.put("layout/fragment_kyc_gdpr_old_0", Integer.valueOf(R.layout.fragment_kyc_gdpr_old));
            sKeys.put("layout/fragment_kyc_id_declined_0", Integer.valueOf(R.layout.fragment_kyc_id_declined));
            sKeys.put("layout/fragment_kyc_phone_0", Integer.valueOf(R.layout.fragment_kyc_phone));
            sKeys.put("layout/fragment_kyc_phone_confirm_old_0", Integer.valueOf(R.layout.fragment_kyc_phone_confirm_old));
            sKeys.put("layout/fragment_kyc_phone_confirmed_0", Integer.valueOf(R.layout.fragment_kyc_phone_confirmed));
            sKeys.put("layout/fragment_kyc_question_multi_choice_old_0", Integer.valueOf(R.layout.fragment_kyc_question_multi_choice_old));
            sKeys.put("layout/fragment_kyc_question_single_choice_old_0", Integer.valueOf(R.layout.fragment_kyc_question_single_choice_old));
            sKeys.put("layout/fragment_kyc_question_text_old_0", Integer.valueOf(R.layout.fragment_kyc_question_text_old));
            sKeys.put("layout/fragment_kyc_question_warning2_0", Integer.valueOf(R.layout.fragment_kyc_question_warning2));
            sKeys.put("layout/fragment_kyc_question_yes_no_0", Integer.valueOf(R.layout.fragment_kyc_question_yes_no));
            sKeys.put("layout/fragment_kyc_radio_button_0", Integer.valueOf(R.layout.fragment_kyc_radio_button));
            sKeys.put("layout/fragment_kyc_reportable_error_old_0", Integer.valueOf(R.layout.fragment_kyc_reportable_error_old));
            sKeys.put("layout/fragment_kyc_reportable_old_0", Integer.valueOf(R.layout.fragment_kyc_reportable_old));
            sKeys.put("layout/fragment_kyc_risks_old_0", Integer.valueOf(R.layout.fragment_kyc_risks_old));
            sKeys.put("layout/fragment_kyc_sex_old_0", Integer.valueOf(R.layout.fragment_kyc_sex_old));
            sKeys.put("layout/fragment_kyc_start_non_regulated_0", Integer.valueOf(R.layout.fragment_kyc_start_non_regulated));
            sKeys.put("layout/fragment_left_panel_0", Integer.valueOf(R.layout.fragment_left_panel));
            sKeys.put("layout/fragment_locale_asset_search_country_0", Integer.valueOf(R.layout.fragment_locale_asset_search_country));
            sKeys.put("layout/fragment_margin_not_added_0", Integer.valueOf(R.layout.fragment_margin_not_added));
            hashMap = sKeys;
            valueOf = Integer.valueOf(R.layout.fragment_market_analysis);
            hashMap.put("layout-land/fragment_market_analysis_0", valueOf);
            sKeys.put("layout/fragment_market_analysis_0", valueOf);
            sKeys.put("layout/fragment_market_is_open_0", Integer.valueOf(R.layout.fragment_market_is_open));
            sKeys.put("layout/fragment_mkt_on_open_created_0", Integer.valueOf(R.layout.fragment_mkt_on_open_created));
            sKeys.put("layout/fragment_multiplier_chooser_0", Integer.valueOf(R.layout.fragment_multiplier_chooser));
            sKeys.put("layout/fragment_news_and_updates_0", Integer.valueOf(R.layout.fragment_news_and_updates));
            sKeys.put("layout/fragment_old_kyc_legal_name_0", Integer.valueOf(R.layout.fragment_old_kyc_legal_name));
            sKeys.put("layout/fragment_otn_leading_board_profile_0", Integer.valueOf(R.layout.fragment_otn_leading_board_profile));
            sKeys.put("layout/fragment_otn_leading_board_user_board_commission_0", Integer.valueOf(R.layout.fragment_otn_leading_board_user_board_commission));
            sKeys.put("layout/fragment_otn_leading_board_user_board_date_0", Integer.valueOf(R.layout.fragment_otn_leading_board_user_board_date));
            sKeys.put("layout/fragment_otn_leading_board_user_board_place_0", Integer.valueOf(R.layout.fragment_otn_leading_board_user_board_place));
            sKeys.put("layout/fragment_otn_leading_board_user_board_trading_0", Integer.valueOf(R.layout.fragment_otn_leading_board_user_board_trading));
            sKeys.put("layout/fragment_otn_leading_board_user_board_user_0", Integer.valueOf(R.layout.fragment_otn_leading_board_user_board_user));
            sKeys.put("layout/fragment_pending_chooser_0", Integer.valueOf(R.layout.fragment_pending_chooser));
            sKeys.put("layout/fragment_pending_order_executed_0", Integer.valueOf(R.layout.fragment_pending_order_executed));
            sKeys.put("layout/fragment_pro_trader_active_0", Integer.valueOf(R.layout.fragment_pro_trader_active));
            sKeys.put("layout/fragment_pro_trader_more_0", Integer.valueOf(R.layout.fragment_pro_trader_more));
            sKeys.put("layout/fragment_pro_trader_web_0", Integer.valueOf(R.layout.fragment_pro_trader_web));
            sKeys.put("layout/fragment_promo_video_0", Integer.valueOf(R.layout.fragment_promo_video));
            sKeys.put("layout/fragment_push_settings_0", Integer.valueOf(R.layout.fragment_push_settings));
            sKeys.put("layout/fragment_right_panel_0", Integer.valueOf(R.layout.fragment_right_panel));
            sKeys.put("layout/fragment_scrollable_dialog_0", Integer.valueOf(R.layout.fragment_scrollable_dialog));
            sKeys.put("layout/fragment_signals_and_alerts_0", Integer.valueOf(R.layout.fragment_signals_and_alerts));
            sKeys.put("layout/fragment_token_balance_0", Integer.valueOf(R.layout.fragment_token_balance));
            sKeys.put("layout/fragment_tools_0", Integer.valueOf(R.layout.fragment_tools));
            sKeys.put("layout/fragment_traderoom_restriction_0", Integer.valueOf(R.layout.fragment_traderoom_restriction));
            sKeys.put("layout/fragment_traderoom_settings_0", Integer.valueOf(R.layout.fragment_traderoom_settings));
            sKeys.put("layout/fragment_trending_today_0", Integer.valueOf(R.layout.fragment_trending_today));
            sKeys.put("layout/fragment_video_education_categories_0", Integer.valueOf(R.layout.fragment_video_education_categories));
            sKeys.put("layout/fragment_video_education_videos_0", Integer.valueOf(R.layout.fragment_video_education_videos));
            sKeys.put("layout/fragment_vip_about_0", Integer.valueOf(R.layout.fragment_vip_about));
            sKeys.put("layout/fragment_vip_choose_time_0", Integer.valueOf(R.layout.fragment_vip_choose_time));
            sKeys.put("layout/fragment_vip_education_0", Integer.valueOf(R.layout.fragment_vip_education));
            sKeys.put("layout/fragment_vip_request_call_0", Integer.valueOf(R.layout.fragment_vip_request_call));
            sKeys.put("layout/fx_expiration_fragment_0", Integer.valueOf(R.layout.fx_expiration_fragment));
            sKeys.put("layout/fx_strike_item_0", Integer.valueOf(R.layout.fx_strike_item));
            sKeys.put("layout/fx_whats_new_dialog_0", Integer.valueOf(R.layout.fx_whats_new_dialog));
            sKeys.put("layout/gif_whats_new_dialog_0", Integer.valueOf(R.layout.gif_whats_new_dialog));
            sKeys.put("layout/how_to_trade_multi_fragment_0", Integer.valueOf(R.layout.how_to_trade_multi_fragment));
            sKeys.put("layout/indicator_info_item_0", Integer.valueOf(R.layout.indicator_info_item));
            sKeys.put("layout/indicator_title_item_0", Integer.valueOf(R.layout.indicator_title_item));
            sKeys.put("layout/instrument_type_bottom_sheet_item_0", Integer.valueOf(R.layout.instrument_type_bottom_sheet_item));
            sKeys.put("layout/iqkeyboard_fragment_0", Integer.valueOf(R.layout.iqkeyboard_fragment));
            sKeys.put("layout/item_crypto_asset_0", Integer.valueOf(R.layout.item_crypto_asset));
            sKeys.put("layout/item_locale_asset_country_suggest_0", Integer.valueOf(R.layout.item_locale_asset_country_suggest));
            sKeys.put("layout/item_overnight_fee_schedule_0", Integer.valueOf(R.layout.item_overnight_fee_schedule));
            sKeys.put("layout/item_trending_today_0", Integer.valueOf(R.layout.item_trending_today));
            sKeys.put("layout/keyboard_tpsl_0", Integer.valueOf(R.layout.keyboard_tpsl));
            sKeys.put("layout/kyc_continue_button_0", Integer.valueOf(R.layout.kyc_continue_button));
            sKeys.put("layout/layout_dialog_toolbar_0", Integer.valueOf(R.layout.layout_dialog_toolbar));
            sKeys.put("layout/layout_kyc_toolbar_old_0", Integer.valueOf(R.layout.layout_kyc_toolbar_old));
            sKeys.put("layout/layout_pro_trader_benefits_bottom_row_0", Integer.valueOf(R.layout.layout_pro_trader_benefits_bottom_row));
            sKeys.put("layout/layout_pro_trader_benefits_top_row_0", Integer.valueOf(R.layout.layout_pro_trader_benefits_top_row));
            sKeys.put("layout/left_menu_item_0", Integer.valueOf(R.layout.left_menu_item));
            sKeys.put("layout/left_menu_item_child_0", Integer.valueOf(R.layout.left_menu_item_child));
            sKeys.put("layout/left_menu_item_counter_0", Integer.valueOf(R.layout.left_menu_item_counter));
            sKeys.put("layout/left_menu_item_drop_down_0", Integer.valueOf(R.layout.left_menu_item_drop_down));
            sKeys.put("layout/left_menu_item_list_0", Integer.valueOf(R.layout.left_menu_item_list));
            sKeys.put("layout/left_menu_item_notification_0", Integer.valueOf(R.layout.left_menu_item_notification));
            sKeys.put("layout/left_menu_item_pro_trader_0", Integer.valueOf(R.layout.left_menu_item_pro_trader));
            sKeys.put("layout/left_menu_item_profile_0", Integer.valueOf(R.layout.left_menu_item_profile));
            sKeys.put("layout/left_menu_item_terms_and_conditions_0", Integer.valueOf(R.layout.left_menu_item_terms_and_conditions));
            sKeys.put("layout/left_menu_item_with_progress_0", Integer.valueOf(R.layout.left_menu_item_with_progress));
            sKeys.put("layout/left_panel_item_0", Integer.valueOf(R.layout.left_panel_item));
            sKeys.put("layout/left_panel_item_btn_0", Integer.valueOf(R.layout.left_panel_item_btn));
            sKeys.put("layout/legal_update_0", Integer.valueOf(R.layout.legal_update));
            sKeys.put("layout/local_toast_layout_0", Integer.valueOf(R.layout.local_toast_layout));
            sKeys.put("layout/menu_fragment_0", Integer.valueOf(R.layout.menu_fragment));
            sKeys.put("layout/micro_portfolio_cfd_group_item_0", Integer.valueOf(R.layout.micro_portfolio_cfd_group_item));
            sKeys.put("layout/micro_portfolio_cfd_info_0", Integer.valueOf(R.layout.micro_portfolio_cfd_info));
            sKeys.put("layout/micro_portfolio_cfd_item_0", Integer.valueOf(R.layout.micro_portfolio_cfd_item));
            sKeys.put("layout/micro_portfolio_cfd_single_group_item_0", Integer.valueOf(R.layout.micro_portfolio_cfd_single_group_item));
            sKeys.put("layout/micro_portfolio_closed_empty_item_0", Integer.valueOf(R.layout.micro_portfolio_closed_empty_item));
            sKeys.put("layout/micro_portfolio_closed_item_0", Integer.valueOf(R.layout.micro_portfolio_closed_item));
            sKeys.put("layout/micro_portfolio_exp_group_item_0", Integer.valueOf(R.layout.micro_portfolio_exp_group_item));
            sKeys.put("layout/micro_portfolio_exp_header_item_0", Integer.valueOf(R.layout.micro_portfolio_exp_header_item));
            sKeys.put("layout/micro_portfolio_exp_info_0", Integer.valueOf(R.layout.micro_portfolio_exp_info));
            sKeys.put("layout/micro_portfolio_exp_item_0", Integer.valueOf(R.layout.micro_portfolio_exp_item));
            sKeys.put("layout/micro_portfolio_exp_multi_group_item_0", Integer.valueOf(R.layout.micro_portfolio_exp_multi_group_item));
            sKeys.put("layout/micro_portfolio_exp_single_group_item_0", Integer.valueOf(R.layout.micro_portfolio_exp_single_group_item));
            sKeys.put("layout/micro_portfolio_mkt_on_open_item_0", Integer.valueOf(R.layout.micro_portfolio_mkt_on_open_item));
            sKeys.put("layout/micro_portfolio_mkt_on_open_single_group_item_0", Integer.valueOf(R.layout.micro_portfolio_mkt_on_open_single_group_item));
            sKeys.put("layout/micro_portfolio_open_empty_item_0", Integer.valueOf(R.layout.micro_portfolio_open_empty_item));
            sKeys.put("layout/micro_portfolio_open_header_item_0", Integer.valueOf(R.layout.micro_portfolio_open_header_item));
            sKeys.put("layout/micro_portfolio_page_closed_positions_0", Integer.valueOf(R.layout.micro_portfolio_page_closed_positions));
            sKeys.put("layout/micro_portfolio_page_open_positions_0", Integer.valueOf(R.layout.micro_portfolio_page_open_positions));
            sKeys.put("layout/micro_portfolio_page_pending_positions_0", Integer.valueOf(R.layout.micro_portfolio_page_pending_positions));
            sKeys.put("layout/micro_portfolio_pending_empty_item_0", Integer.valueOf(R.layout.micro_portfolio_pending_empty_item));
            sKeys.put("layout/micro_portfolio_pending_group_item_0", Integer.valueOf(R.layout.micro_portfolio_pending_group_item));
            sKeys.put("layout/micro_portfolio_pending_info_0", Integer.valueOf(R.layout.micro_portfolio_pending_info));
            sKeys.put("layout/micro_portfolio_pending_item_0", Integer.valueOf(R.layout.micro_portfolio_pending_item));
            sKeys.put("layout/micro_portfolio_pending_single_group_item_0", Integer.valueOf(R.layout.micro_portfolio_pending_single_group_item));
            sKeys.put("layout/micro_portfolio_total_pager_page_0", Integer.valueOf(R.layout.micro_portfolio_total_pager_page));
            sKeys.put("layout/more_trading_opportunities_0", Integer.valueOf(R.layout.more_trading_opportunities));
            sKeys.put("layout/multi_active_item_0", Integer.valueOf(R.layout.multi_active_item));
            sKeys.put("layout/multi_asset_view_0", Integer.valueOf(R.layout.multi_asset_view));
            sKeys.put("layout/multi_expiration_fragment_0", Integer.valueOf(R.layout.multi_expiration_fragment));
            sKeys.put("layout/multi_position_item_0", Integer.valueOf(R.layout.multi_position_item));
            sKeys.put("layout/news_and_updates_item_0", Integer.valueOf(R.layout.news_and_updates_item));
            sKeys.put("layout/nps_completed_fragment_0", Integer.valueOf(R.layout.nps_completed_fragment));
            sKeys.put("layout/nps_feedback_fragment_0", Integer.valueOf(R.layout.nps_feedback_fragment));
            sKeys.put("layout/nps_score_fragment_0", Integer.valueOf(R.layout.nps_score_fragment));
            sKeys.put("layout/numpad_0", Integer.valueOf(R.layout.numpad));
            sKeys.put("layout/otn_history_item_0", Integer.valueOf(R.layout.otn_history_item));
            sKeys.put("layout/otn_leader_board_current_user_item_0", Integer.valueOf(R.layout.otn_leader_board_current_user_item));
            sKeys.put("layout/otn_leader_board_first_item_0", Integer.valueOf(R.layout.otn_leader_board_first_item));
            sKeys.put("layout/otn_leader_board_item_0", Integer.valueOf(R.layout.otn_leader_board_item));
            sKeys.put("layout/otn_leader_board_select_country_item_0", Integer.valueOf(R.layout.otn_leader_board_select_country_item));
            sKeys.put("layout/overnight_fee_item_0", Integer.valueOf(R.layout.overnight_fee_item));
            sKeys.put("layout/personal_info_dialog_0", Integer.valueOf(R.layout.personal_info_dialog));
            sKeys.put("layout/personal_info_page_0", Integer.valueOf(R.layout.personal_info_page));
            sKeys.put("layout/popup_window_otn_leader_board_user_details_0", Integer.valueOf(R.layout.popup_window_otn_leader_board_user_details));
            sKeys.put("layout/portfolio_cfd_group_item_0", Integer.valueOf(R.layout.portfolio_cfd_group_item));
            sKeys.put("layout/portfolio_cfd_info_0", Integer.valueOf(R.layout.portfolio_cfd_info));
            sKeys.put("layout/portfolio_cfd_item_0", Integer.valueOf(R.layout.portfolio_cfd_item));
            sKeys.put("layout/portfolio_cfd_single_group_item_0", Integer.valueOf(R.layout.portfolio_cfd_single_group_item));
            sKeys.put("layout/portfolio_delegate_macro_0", Integer.valueOf(R.layout.portfolio_delegate_macro));
            sKeys.put("layout/portfolio_delegate_micro_0", Integer.valueOf(R.layout.portfolio_delegate_micro));
            sKeys.put("layout/portfolio_exp_group_item_0", Integer.valueOf(R.layout.portfolio_exp_group_item));
            sKeys.put("layout/portfolio_exp_header_item_0", Integer.valueOf(R.layout.portfolio_exp_header_item));
            sKeys.put("layout/portfolio_exp_info_0", Integer.valueOf(R.layout.portfolio_exp_info));
            sKeys.put("layout/portfolio_exp_item_0", Integer.valueOf(R.layout.portfolio_exp_item));
            sKeys.put("layout/portfolio_exp_multi_group_item_0", Integer.valueOf(R.layout.portfolio_exp_multi_group_item));
            sKeys.put("layout/portfolio_exp_single_group_item_0", Integer.valueOf(R.layout.portfolio_exp_single_group_item));
            sKeys.put("layout/portfolio_filter_options_0", Integer.valueOf(R.layout.portfolio_filter_options));
            sKeys.put("layout/portfolio_macro_filter_item_0", Integer.valueOf(R.layout.portfolio_macro_filter_item));
            sKeys.put("layout/portfolio_micro_filter_item_0", Integer.valueOf(R.layout.portfolio_micro_filter_item));
            sKeys.put("layout/portfolio_mkt_on_open_item_0", Integer.valueOf(R.layout.portfolio_mkt_on_open_item));
            sKeys.put("layout/portfolio_mkt_on_open_single_group_item_0", Integer.valueOf(R.layout.portfolio_mkt_on_open_single_group_item));
            sKeys.put("layout/portfolio_open_empty_item_0", Integer.valueOf(R.layout.portfolio_open_empty_item));
            sKeys.put("layout/portfolio_open_header_item_0", Integer.valueOf(R.layout.portfolio_open_header_item));
            sKeys.put("layout/portfolio_page_open_positions_0", Integer.valueOf(R.layout.portfolio_page_open_positions));
            sKeys.put("layout/portfolio_page_pending_positions_0", Integer.valueOf(R.layout.portfolio_page_pending_positions));
            sKeys.put("layout/portfolio_pending_empty_item_0", Integer.valueOf(R.layout.portfolio_pending_empty_item));
            sKeys.put("layout/portfolio_pending_group_item_0", Integer.valueOf(R.layout.portfolio_pending_group_item));
            sKeys.put("layout/portfolio_pending_header_item_0", Integer.valueOf(R.layout.portfolio_pending_header_item));
            sKeys.put("layout/portfolio_pending_info_0", Integer.valueOf(R.layout.portfolio_pending_info));
            sKeys.put("layout/portfolio_pending_item_0", Integer.valueOf(R.layout.portfolio_pending_item));
            sKeys.put("layout/portfolio_pending_single_group_item_0", Integer.valueOf(R.layout.portfolio_pending_single_group_item));
            sKeys.put("layout/price_movements_attention_0", Integer.valueOf(R.layout.price_movements_attention));
            sKeys.put("layout/price_movements_fragment_0", Integer.valueOf(R.layout.price_movements_fragment));
            sKeys.put("layout/price_movements_high_frequecy_item_0", Integer.valueOf(R.layout.price_movements_high_frequecy_item));
            sKeys.put("layout/price_movements_high_frequency_layout_0", Integer.valueOf(R.layout.price_movements_high_frequency_layout));
            sKeys.put("layout/price_movements_item_0", Integer.valueOf(R.layout.price_movements_item));
            sKeys.put("layout/price_movements_progress_0", Integer.valueOf(R.layout.price_movements_progress));
            sKeys.put("layout/price_movements_tittle_item_0", Integer.valueOf(R.layout.price_movements_tittle_item));
            sKeys.put("layout/push_settings_category_item_0", Integer.valueOf(R.layout.push_settings_category_item));
            sKeys.put("layout/push_settings_group_item_0", Integer.valueOf(R.layout.push_settings_group_item));
            sKeys.put("layout/rate_us_dialog_0", Integer.valueOf(R.layout.rate_us_dialog));
            sKeys.put("layout/right_panel_closed_0", Integer.valueOf(R.layout.right_panel_closed));
            sKeys.put("layout/right_panel_delegate_cfd_0", Integer.valueOf(R.layout.right_panel_delegate_cfd));
            sKeys.put("layout/right_panel_delegate_cfd_confirmation_0", Integer.valueOf(R.layout.right_panel_delegate_cfd_confirmation));
            sKeys.put("layout/right_panel_delegate_cfd_main_0", Integer.valueOf(R.layout.right_panel_delegate_cfd_main));
            sKeys.put("layout/right_panel_delegate_cfd_on_open_confirmation_0", Integer.valueOf(R.layout.right_panel_delegate_cfd_on_open_confirmation));
            sKeys.put("layout/right_panel_delegate_cfd_on_open_main_0", Integer.valueOf(R.layout.right_panel_delegate_cfd_on_open_main));
            sKeys.put("layout/right_panel_delegate_crypto_0", Integer.valueOf(R.layout.right_panel_delegate_crypto));
            sKeys.put("layout/right_panel_delegate_crypto_closed_0", Integer.valueOf(R.layout.right_panel_delegate_crypto_closed));
            sKeys.put("layout/right_panel_delegate_crypto_confirmation_0", Integer.valueOf(R.layout.right_panel_delegate_crypto_confirmation));
            sKeys.put("layout/right_panel_delegate_crypto_loading_0", Integer.valueOf(R.layout.right_panel_delegate_crypto_loading));
            sKeys.put("layout/right_panel_delegate_crypto_main_0", Integer.valueOf(R.layout.right_panel_delegate_crypto_main));
            sKeys.put("layout/right_panel_delegate_crypto_success_0", Integer.valueOf(R.layout.right_panel_delegate_crypto_success));
            sKeys.put("layout/right_panel_delegate_digital_0", Integer.valueOf(R.layout.right_panel_delegate_digital));
            sKeys.put("layout/right_panel_delegate_digital_call_put_0", Integer.valueOf(R.layout.right_panel_delegate_digital_call_put));
            sKeys.put("layout/right_panel_delegate_multi_0", Integer.valueOf(R.layout.right_panel_delegate_multi));
            sKeys.put("layout/right_panel_delegate_multi_spot_0", Integer.valueOf(R.layout.right_panel_delegate_multi_spot));
            sKeys.put("layout/right_panel_delegate_on_open_cfd_0", Integer.valueOf(R.layout.right_panel_delegate_on_open_cfd));
            sKeys.put("layout/right_panel_delegate_spot_0", Integer.valueOf(R.layout.right_panel_delegate_spot));
            sKeys.put("layout/right_panel_delegate_turbo_binary_0", Integer.valueOf(R.layout.right_panel_delegate_turbo_binary));
            sKeys.put("layout/right_panel_delegate_turbo_binary_call_put_0", Integer.valueOf(R.layout.right_panel_delegate_turbo_binary_call_put));
            sKeys.put("layout/right_panel_fx_delegate_0", Integer.valueOf(R.layout.right_panel_fx_delegate));
            sKeys.put("layout/right_panel_price_alert_0", Integer.valueOf(R.layout.right_panel_price_alert));
            sKeys.put("layout/sell_delegate_0", Integer.valueOf(R.layout.sell_delegate));
            sKeys.put("layout/session_main_item_0", Integer.valueOf(R.layout.session_main_item));
            sKeys.put("layout/session_other_item_0", Integer.valueOf(R.layout.session_other_item));
            sKeys.put("layout/session_title_0", Integer.valueOf(R.layout.session_title));
            sKeys.put("layout/small_numpad_0", Integer.valueOf(R.layout.small_numpad));
            sKeys.put("layout/strike_item_0", Integer.valueOf(R.layout.strike_item));
            sKeys.put("layout/string_basket_empty_item_0", Integer.valueOf(R.layout.string_basket_empty_item));
            sKeys.put("layout/string_basket_item_0", Integer.valueOf(R.layout.string_basket_item));
            sKeys.put("layout/string_basket_switch_item_0", Integer.valueOf(R.layout.string_basket_switch_item));
            sKeys.put("layout/template_item_0", Integer.valueOf(R.layout.template_item));
            sKeys.put("layout/template_toast_0", Integer.valueOf(R.layout.template_toast));
            sKeys.put("layout/toast_fx_next_expiration_0", Integer.valueOf(R.layout.toast_fx_next_expiration));
            sKeys.put("layout/toolbar_black_layout_0", Integer.valueOf(R.layout.toolbar_black_layout));
            sKeys.put("layout/tools_content_active_tools_0", Integer.valueOf(R.layout.tools_content_active_tools));
            sKeys.put("layout/tools_content_indicators_0", Integer.valueOf(R.layout.tools_content_indicators));
            sKeys.put("layout/tools_content_indicators_common_0", Integer.valueOf(R.layout.tools_content_indicators_common));
            sKeys.put("layout/tools_content_indicators_search_0", Integer.valueOf(R.layout.tools_content_indicators_search));
            sKeys.put("layout/tools_content_settings_0", Integer.valueOf(R.layout.tools_content_settings));
            sKeys.put("layout/tools_content_templates_0", Integer.valueOf(R.layout.tools_content_templates));
            sKeys.put("layout/top_panel_0", Integer.valueOf(R.layout.top_panel));
            sKeys.put("layout/trailing_whats_new_dialog_0", Integer.valueOf(R.layout.trailing_whats_new_dialog));
            sKeys.put("layout/video_education_search_suggestion_item_0", Integer.valueOf(R.layout.video_education_search_suggestion_item));
            sKeys.put("layout/video_education_simple_category_item_0", Integer.valueOf(R.layout.video_education_simple_category_item));
            sKeys.put("layout/video_education_tag_item_0", Integer.valueOf(R.layout.video_education_tag_item));
            sKeys.put("layout/video_education_video_item_0", Integer.valueOf(R.layout.video_education_video_item));
            sKeys.put("layout/view_pager_whats_new_dialog_0", Integer.valueOf(R.layout.view_pager_whats_new_dialog));
            sKeys.put("layout/vip_about_info_0", Integer.valueOf(R.layout.vip_about_info));
            sKeys.put("layout/vip_education_item_view_0", Integer.valueOf(R.layout.vip_education_item_view));
            sKeys.put("layout/vip_education_session_item_0", Integer.valueOf(R.layout.vip_education_session_item));
            sKeys.put("layout/whats_new_deposit_item_0", Integer.valueOf(R.layout.whats_new_deposit_item));
            sKeys.put("layout/whats_new_dialog_0", Integer.valueOf(R.layout.whats_new_dialog));
            sKeys.put("layout/whats_new_dialog_experimental_deposit_page_0", Integer.valueOf(R.layout.whats_new_dialog_experimental_deposit_page));
            sKeys.put("layout/whats_new_dialog_spot_0", Integer.valueOf(R.layout.whats_new_dialog_spot));
            sKeys.put("layout/whats_new_dialog_templates_0", Integer.valueOf(R.layout.whats_new_dialog_templates));
        }
    }

    static {
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.account_security_confirm_code_expired_fragment, 1);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.account_security_confirm_code_fragment, 2);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.account_security_confirm_phone_2step_auth_fragment, 3);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.account_security_confirm_phone_fragment, 4);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.account_security_confirmed_email_fragment, 5);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.account_security_confirmed_phone_fragment, 6);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.account_security_email_confirm_fragment, 7);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.account_security_phone_number_fragment, 8);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.account_security_resend_email_fragment, 9);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.account_security_turn_on_2step_auth_fragment, 10);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.account_security_turn_on_touch_id_fragment, 11);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.active_sessions_fragment, 12);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.active_tools_item, 13);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.activity_pending_removal, 14);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.activity_pro_deposit, 15);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.activity_pro_kyc, 16);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.activity_pro_trader_web, 17);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.activity_verify_cards, 18);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.activity_welcome_onboarding, 19);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.activity_withdraw, 20);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.asset_base_cfd_item, 21);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.asset_base_options_item, 22);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.asset_fragment, 23);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.asset_info_info_item, 24);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.asset_info_price_crypto_item, 25);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.asset_info_price_full_item, 26);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.asset_info_price_item, 27);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.asset_info_statistics_full_item, 28);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.asset_info_statistics_item, 29);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.asset_info_statistics_more_item, 30);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.asset_info_title_item, 31);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.asset_info_traders_pulse_item, 32);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.asset_overnight_info_item, 33);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.asset_overnight_item_item, 34);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.asset_overnight_title_item, 35);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.asset_overnight_today_item, 36);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.asset_schedule_item_item, 37);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.asset_schedule_title_item, 38);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.asset_spinner_handle, 39);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.assets_bo_item, 40);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.assets_category_item, 41);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.assets_cfd_item, 42);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.assets_closed_item, 43);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.assets_do_item, 44);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.assets_fx_item, 45);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.assets_header_bo, 46);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.assets_header_cfd, 47);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.assets_header_do, 48);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.assets_header_fx, 49);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.assets_item_actions, 50);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.assets_multi_item, 51);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.assets_multi_warning_item, 52);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.balance_cell, 53);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.base_menu_fragment, 54);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.base_smart_dialog_fragment, 55);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.base_smart_fragment, 56);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.bottom_sheet_chooser, 57);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.bottom_sheet_commission, 58);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.bottom_sheet_item, 59);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.bottom_sheet_message, 60);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.bottom_sheet_otn_emission_history, 61);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.bottom_sheet_portfolio_filter_chooser, 62);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.bottom_sheet_portfolio_tpsl_chooser, 63);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.buy_new_dialog_view, 64);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.cfd_expiration_fragment, 65);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.close_crypto_position_delegate, 66);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.close_delegate, 67);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.close_position_delegate, 68);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.closed_portfolio_item, 69);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.commission_view, 70);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.confirm_dialog_view, 71);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.crypto_confirm_dialog_view, 72);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.dialog_closed_deals, 73);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.dialog_closed_deals_bottom_multi, 74);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.dialog_closed_deals_bottom_option_by_tick, 75);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.dialog_closed_deals_header_cfd, 76);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.dialog_closed_deals_header_do, 77);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.dialog_closed_deals_header_list_cfd, 78);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.dialog_closed_deals_header_list_do, 79);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.dialog_closed_deals_header_list_multi, 80);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.dialog_closed_deals_header_multi, 81);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.dialog_closed_deals_item_cfd, 82);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.dialog_closed_deals_item_cfd_aggregated, 83);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.dialog_closed_deals_item_do, 84);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.dialog_closed_deals_item_do_aggregated, 85);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.dialog_closed_deals_item_multi, 86);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.dialog_commision_info, 87);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.dialog_congrat_otn_emission_executed, 88);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.dialog_fragment_etfs, 89);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.dialog_gdpr_warning, 90);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.dialog_margin_add_on_info, 91);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.dialog_margin_add_on_position, 92);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.dialog_multiplier_confirm, 93);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.dialog_otn_commision_changed, 94);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.dialog_otn_expectation, 95);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.dialog_otn_reward_info, 96);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.dialog_overnight_fee_info, 97);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.dialog_portfolio_invest_info, 98);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.dialog_pro_application_status, 99);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.dialog_pro_trader_benefits, 100);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.dialog_pro_trader_selected, 101);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.dialog_reload_practice, 102);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.dialog_tpsl, 103);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.dialog_trade_on_practice, 104);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.dialog_trailing_info, 105);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.dialog_warning, 106);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.dialog_whats_new, 107);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.dialog_whats_new_video_autoplay_delegate, 108);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.dialog_whats_new_video_delegate, 109);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.dialog_whats_new_without_btn, 110);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.dialpad, 111);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.dialpad_dot, 112);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.dialpad_key, 113);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.dialpad_key_back, 114);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.dialpad_key_touchid, 115);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.dialpad_key_zero, 116);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.digital_expiration_fragment, 117);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.expiration_fragment, 118);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.fee_history_item, 119);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.fragment_account_security, 120);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.fragment_account_security_page, 121);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.fragment_account_security_passcode, 122);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.fragment_account_security_passcode_error, 123);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.fragment_active_phase_notification, 124);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.fragment_assets, 125);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.fragment_commission_change, 126);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.fragment_info_asset, 127);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.fragment_info_asset_conditions, 128);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.fragment_info_asset_main_info, 129);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.fragment_kyc_acceptable_documents, 130);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.fragment_kyc_address_declined, 131);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.fragment_kyc_address_old, 132);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.fragment_kyc_check_box, 133);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.fragment_kyc_country_old, 134);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.fragment_kyc_cysec, 135);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.fragment_kyc_date_of_birth_old, 136);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.fragment_kyc_document_address, 137);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.fragment_kyc_documents_intro, 138);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.fragment_kyc_documents_upload, 139);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.fragment_kyc_email, 140);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.fragment_kyc_email_confirm, 141);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.fragment_kyc_email_confirmed, 142);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.fragment_kyc_finish_old, 143);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.fragment_kyc_gdpr_old, 144);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.fragment_kyc_id_declined, 145);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.fragment_kyc_phone, 146);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.fragment_kyc_phone_confirm_old, 147);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.fragment_kyc_phone_confirmed, 148);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.fragment_kyc_question_multi_choice_old, 149);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.fragment_kyc_question_single_choice_old, 150);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.fragment_kyc_question_text_old, 151);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.fragment_kyc_question_warning2, 152);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.fragment_kyc_question_yes_no, 153);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.fragment_kyc_radio_button, 154);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.fragment_kyc_reportable_error_old, 155);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.fragment_kyc_reportable_old, 156);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.fragment_kyc_risks_old, 157);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.fragment_kyc_sex_old, 158);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.fragment_kyc_start_non_regulated, 159);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.fragment_left_panel, 160);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.fragment_locale_asset_search_country, 161);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.fragment_margin_not_added, 162);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.fragment_market_analysis, 163);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.fragment_market_is_open, 164);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.fragment_mkt_on_open_created, 165);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.fragment_multiplier_chooser, 166);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.fragment_news_and_updates, 167);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.fragment_old_kyc_legal_name, 168);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.fragment_otn_leading_board_profile, 169);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.fragment_otn_leading_board_user_board_commission, 170);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.fragment_otn_leading_board_user_board_date, 171);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.fragment_otn_leading_board_user_board_place, 172);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.fragment_otn_leading_board_user_board_trading, 173);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.fragment_otn_leading_board_user_board_user, 174);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.fragment_pending_chooser, 175);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.fragment_pending_order_executed, 176);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.fragment_pro_trader_active, 177);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.fragment_pro_trader_more, 178);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.fragment_pro_trader_web, 179);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.fragment_promo_video, 180);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.fragment_push_settings, 181);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.fragment_right_panel, 182);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.fragment_scrollable_dialog, 183);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.fragment_signals_and_alerts, 184);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.fragment_token_balance, 185);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.fragment_tools, 186);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.fragment_traderoom_restriction, 187);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.fragment_traderoom_settings, 188);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.fragment_trending_today, 189);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.fragment_video_education_categories, 190);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.fragment_video_education_videos, 191);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.fragment_vip_about, 192);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.fragment_vip_choose_time, 193);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.fragment_vip_education, 194);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.fragment_vip_request_call, 195);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.fx_expiration_fragment, 196);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.fx_strike_item, 197);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.fx_whats_new_dialog, 198);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.gif_whats_new_dialog, 199);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.how_to_trade_multi_fragment, 200);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.indicator_info_item, 201);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.indicator_title_item, 202);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.instrument_type_bottom_sheet_item, 203);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.iqkeyboard_fragment, 204);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.item_crypto_asset, 205);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.item_locale_asset_country_suggest, 206);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.item_overnight_fee_schedule, 207);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.item_trending_today, 208);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.keyboard_tpsl, 209);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.kyc_continue_button, 210);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.layout_dialog_toolbar, 211);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.layout_kyc_toolbar_old, 212);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.layout_pro_trader_benefits_bottom_row, 213);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.layout_pro_trader_benefits_top_row, 214);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.left_menu_item, 215);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.left_menu_item_child, 216);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.left_menu_item_counter, 217);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.left_menu_item_drop_down, 218);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.left_menu_item_list, 219);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.left_menu_item_notification, 220);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.left_menu_item_pro_trader, 221);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.left_menu_item_profile, 222);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.left_menu_item_terms_and_conditions, 223);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.left_menu_item_with_progress, 224);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.left_panel_item, 225);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.left_panel_item_btn, 226);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.legal_update, 227);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.local_toast_layout, 228);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.menu_fragment, 229);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.micro_portfolio_cfd_group_item, 230);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.micro_portfolio_cfd_info, 231);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.micro_portfolio_cfd_item, 232);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.micro_portfolio_cfd_single_group_item, 233);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.micro_portfolio_closed_empty_item, 234);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.micro_portfolio_closed_item, 235);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.micro_portfolio_exp_group_item, 236);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.micro_portfolio_exp_header_item, 237);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.micro_portfolio_exp_info, 238);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.micro_portfolio_exp_item, 239);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.micro_portfolio_exp_multi_group_item, 240);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.micro_portfolio_exp_single_group_item, 241);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.micro_portfolio_mkt_on_open_item, 242);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.micro_portfolio_mkt_on_open_single_group_item, 243);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.micro_portfolio_open_empty_item, 244);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.micro_portfolio_open_header_item, 245);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.micro_portfolio_page_closed_positions, 246);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.micro_portfolio_page_open_positions, 247);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.micro_portfolio_page_pending_positions, 248);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.micro_portfolio_pending_empty_item, 249);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.micro_portfolio_pending_group_item, Callback.DEFAULT_SWIPE_ANIMATION_DURATION);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.micro_portfolio_pending_info, 251);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.micro_portfolio_pending_item, 252);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.micro_portfolio_pending_single_group_item, 253);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.micro_portfolio_total_pager_page, 254);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.more_trading_opportunities, 255);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.multi_active_item, 256);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.multi_asset_view, InputDeviceCompat.SOURCE_KEYBOARD);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.multi_expiration_fragment, 258);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.multi_position_item, 259);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.news_and_updates_item, 260);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.nps_completed_fragment, 261);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.nps_feedback_fragment, 262);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.nps_score_fragment, 263);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.numpad, 264);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.otn_history_item, 265);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.otn_leader_board_current_user_item, 266);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.otn_leader_board_first_item, 267);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.otn_leader_board_item, 268);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.otn_leader_board_select_country_item, 269);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.overnight_fee_item, 270);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.personal_info_dialog, 271);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.personal_info_page, 272);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.popup_window_otn_leader_board_user_details, 273);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.portfolio_cfd_group_item, 274);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.portfolio_cfd_info, 275);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.portfolio_cfd_item, 276);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.portfolio_cfd_single_group_item, 277);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.portfolio_delegate_macro, 278);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.portfolio_delegate_micro, 279);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.portfolio_exp_group_item, 280);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.portfolio_exp_header_item, 281);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.portfolio_exp_info, 282);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.portfolio_exp_item, 283);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.portfolio_exp_multi_group_item, 284);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.portfolio_exp_single_group_item, 285);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.portfolio_filter_options, 286);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.portfolio_macro_filter_item, 287);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.portfolio_micro_filter_item, 288);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.portfolio_mkt_on_open_item, 289);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.portfolio_mkt_on_open_single_group_item, 290);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.portfolio_open_empty_item, 291);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.portfolio_open_header_item, 292);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.portfolio_page_open_positions, 293);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.portfolio_page_pending_positions, 294);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.portfolio_pending_empty_item, 295);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.portfolio_pending_group_item, 296);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.portfolio_pending_header_item, 297);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.portfolio_pending_info, 298);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.portfolio_pending_item, 299);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.portfolio_pending_single_group_item, 300);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.price_movements_attention, MobileEvents.EVENTTYPE_USERACTION);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.price_movements_fragment, MobileEvents.EVENTTYPE_SDKLIFECYCLE);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.price_movements_high_frequecy_item, MobileEvents.EVENTTYPE_ANDROID_LIFECYCLE);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.price_movements_high_frequency_layout, MobileEvents.EVENTTYPE_RAW_TOUCH);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.price_movements_item, MobileEvents.EVENTTYPE_EXCEPTION);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.price_movements_progress, MobileEvents.EVENTTYPE_SDKPARAMETERS);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.price_movements_tittle_item, 307);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.push_settings_category_item, 308);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.push_settings_group_item, MobileEvents.EVENTTYPE_NETWORKCALL);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.rate_us_dialog, 310);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.right_panel_closed, MobileEvents.EVENTTYPE_CUSTOMALERT);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.right_panel_delegate_cfd, MobileEvents.EVENTTYPE_LIFENESS_INFO);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.right_panel_delegate_cfd_confirmation, MobileEvents.EVENTTYPE_ADDITIONAL_DATAPOINTS);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.right_panel_delegate_cfd_main, MobileEvents.EVENTTYPE_BENCHMARK);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.right_panel_delegate_cfd_on_open_confirmation, 315);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.right_panel_delegate_cfd_on_open_main, 316);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.right_panel_delegate_crypto, 317);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.right_panel_delegate_crypto_closed, 318);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.right_panel_delegate_crypto_confirmation, 319);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.right_panel_delegate_crypto_loading, 320);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.right_panel_delegate_crypto_main, 321);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.right_panel_delegate_crypto_success, 322);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.right_panel_delegate_digital, 323);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.right_panel_delegate_digital_call_put, 324);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.right_panel_delegate_multi, 325);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.right_panel_delegate_multi_spot, 326);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.right_panel_delegate_on_open_cfd, 327);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.right_panel_delegate_spot, 328);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.right_panel_delegate_turbo_binary, 329);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.right_panel_delegate_turbo_binary_call_put, 330);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.right_panel_fx_delegate, 331);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.right_panel_price_alert, 332);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.sell_delegate, 333);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.session_main_item, 334);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.session_other_item, 335);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.session_title, 336);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.small_numpad, 337);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.strike_item, 338);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.string_basket_empty_item, 339);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.string_basket_item, 340);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.string_basket_switch_item, 341);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.template_item, 342);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.template_toast, 343);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.toast_fx_next_expiration, 344);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.toolbar_black_layout, 345);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.tools_content_active_tools, 346);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.tools_content_indicators, 347);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.tools_content_indicators_common, 348);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.tools_content_indicators_search, 349);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.tools_content_settings, 350);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.tools_content_templates, 351);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.top_panel, 352);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.trailing_whats_new_dialog, 353);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.video_education_search_suggestion_item, 354);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.video_education_simple_category_item, 355);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.video_education_tag_item, 356);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.video_education_video_item, 357);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.view_pager_whats_new_dialog, 358);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.vip_about_info, 359);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.vip_education_item_view, 360);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.vip_education_session_item, 361);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.whats_new_deposit_item, 362);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.whats_new_dialog, 363);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.whats_new_dialog_experimental_deposit_page, 364);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.whats_new_dialog_spot, 365);
        INTERNAL_LAYOUT_ID_LOOKUP.put(R.layout.whats_new_dialog_templates, 366);
    }

    private final ViewDataBinding a(DataBindingComponent dataBindingComponent, View view, int i, Object obj) {
        StringBuilder stringBuilder;
        switch (i) {
            case 1:
                if ("layout/account_security_confirm_code_expired_fragment_0".equals(obj)) {
                    return new com.iqoption.e.b(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for account_security_confirm_code_expired_fragment is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 2:
                if ("layout/account_security_confirm_code_fragment_0".equals(obj)) {
                    return new d(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for account_security_confirm_code_fragment is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 3:
                if ("layout/account_security_confirm_phone_2step_auth_fragment_0".equals(obj)) {
                    return new f(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for account_security_confirm_phone_2step_auth_fragment is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 4:
                if ("layout/account_security_confirm_phone_fragment_0".equals(obj)) {
                    return new h(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for account_security_confirm_phone_fragment is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 5:
                if ("layout/account_security_confirmed_email_fragment_0".equals(obj)) {
                    return new j(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for account_security_confirmed_email_fragment is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 6:
                if ("layout/account_security_confirmed_phone_fragment_0".equals(obj)) {
                    return new l(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for account_security_confirmed_phone_fragment is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 7:
                if ("layout/account_security_email_confirm_fragment_0".equals(obj)) {
                    return new n(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for account_security_email_confirm_fragment is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 8:
                if ("layout/account_security_phone_number_fragment_0".equals(obj)) {
                    return new p(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for account_security_phone_number_fragment is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 9:
                if ("layout/account_security_resend_email_fragment_0".equals(obj)) {
                    return new r(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for account_security_resend_email_fragment is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 10:
                if ("layout/account_security_turn_on_2step_auth_fragment_0".equals(obj)) {
                    return new t(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for account_security_turn_on_2step_auth_fragment is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 11:
                if ("layout/account_security_turn_on_touch_id_fragment_0".equals(obj)) {
                    return new v(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for account_security_turn_on_touch_id_fragment is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 12:
                if ("layout-land/active_sessions_fragment_0".equals(obj)) {
                    return new y(dataBindingComponent, view);
                }
                if ("layout/active_sessions_fragment_0".equals(obj)) {
                    return new x(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for active_sessions_fragment is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 13:
                if ("layout/active_tools_item_0".equals(obj)) {
                    return new aa(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for active_tools_item is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 14:
                if ("layout/activity_pending_removal_0".equals(obj)) {
                    return new ac(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for activity_pending_removal is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 15:
                if ("layout/activity_pro_deposit_0".equals(obj)) {
                    return new ae(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for activity_pro_deposit is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 16:
                if ("layout/activity_pro_kyc_0".equals(obj)) {
                    return new ag(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for activity_pro_kyc is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 17:
                if ("layout/activity_pro_trader_web_0".equals(obj)) {
                    return new ai(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for activity_pro_trader_web is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 18:
                if ("layout/activity_verify_cards_0".equals(obj)) {
                    return new ak(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for activity_verify_cards is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 19:
                if ("layout/activity_welcome_onboarding_0".equals(obj)) {
                    return new am(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for activity_welcome_onboarding is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 20:
                if ("layout/activity_withdraw_0".equals(obj)) {
                    return new ao(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for activity_withdraw is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 21:
                if ("layout/asset_base_cfd_item_0".equals(obj)) {
                    return new aq(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for asset_base_cfd_item is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 22:
                if ("layout/asset_base_options_item_0".equals(obj)) {
                    return new as(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for asset_base_options_item is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 23:
                if ("layout/asset_fragment_0".equals(obj)) {
                    return new au(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for asset_fragment is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 24:
                if ("layout/asset_info_info_item_0".equals(obj)) {
                    return new aw(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for asset_info_info_item is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 25:
                if ("layout/asset_info_price_crypto_item_0".equals(obj)) {
                    return new ay(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for asset_info_price_crypto_item is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 26:
                if ("layout/asset_info_price_full_item_0".equals(obj)) {
                    return new ba(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for asset_info_price_full_item is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 27:
                if ("layout/asset_info_price_item_0".equals(obj)) {
                    return new bc(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for asset_info_price_item is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 28:
                if ("layout/asset_info_statistics_full_item_0".equals(obj)) {
                    return new be(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for asset_info_statistics_full_item is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 29:
                if ("layout/asset_info_statistics_item_0".equals(obj)) {
                    return new bg(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for asset_info_statistics_item is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 30:
                if ("layout/asset_info_statistics_more_item_0".equals(obj)) {
                    return new bi(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for asset_info_statistics_more_item is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 31:
                if ("layout/asset_info_title_item_0".equals(obj)) {
                    return new bk(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for asset_info_title_item is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 32:
                if ("layout/asset_info_traders_pulse_item_0".equals(obj)) {
                    return new bm(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for asset_info_traders_pulse_item is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 33:
                if ("layout/asset_overnight_info_item_0".equals(obj)) {
                    return new bo(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for asset_overnight_info_item is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 34:
                if ("layout/asset_overnight_item_item_0".equals(obj)) {
                    return new bq(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for asset_overnight_item_item is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 35:
                if ("layout/asset_overnight_title_item_0".equals(obj)) {
                    return new bs(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for asset_overnight_title_item is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 36:
                if ("layout/asset_overnight_today_item_0".equals(obj)) {
                    return new bu(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for asset_overnight_today_item is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 37:
                if ("layout/asset_schedule_item_item_0".equals(obj)) {
                    return new bw(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for asset_schedule_item_item is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 38:
                if ("layout/asset_schedule_title_item_0".equals(obj)) {
                    return new by(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for asset_schedule_title_item is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 39:
                if ("layout/asset_spinner_handle_0".equals(obj)) {
                    return new ca(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for asset_spinner_handle is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 40:
                if ("layout/assets_bo_item_0".equals(obj)) {
                    return new cc(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for assets_bo_item is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 41:
                if ("layout/assets_category_item_0".equals(obj)) {
                    return new ce(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for assets_category_item is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 42:
                if ("layout/assets_cfd_item_0".equals(obj)) {
                    return new cg(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for assets_cfd_item is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 43:
                if ("layout/assets_closed_item_0".equals(obj)) {
                    return new ci(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for assets_closed_item is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 44:
                if ("layout/assets_do_item_0".equals(obj)) {
                    return new ck(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for assets_do_item is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 45:
                if ("layout/assets_fx_item_0".equals(obj)) {
                    return new cm(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for assets_fx_item is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 46:
                if ("layout/assets_header_bo_0".equals(obj)) {
                    return new co(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for assets_header_bo is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 47:
                if ("layout/assets_header_cfd_0".equals(obj)) {
                    return new cq(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for assets_header_cfd is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 48:
                if ("layout/assets_header_do_0".equals(obj)) {
                    return new cs(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for assets_header_do is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 49:
                if ("layout/assets_header_fx_0".equals(obj)) {
                    return new cu(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for assets_header_fx is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 50:
                if ("layout/assets_item_actions_0".equals(obj)) {
                    return new cw(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for assets_item_actions is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            default:
                return null;
        }
    }

    private final ViewDataBinding b(DataBindingComponent dataBindingComponent, View view, int i, Object obj) {
        StringBuilder stringBuilder;
        switch (i) {
            case 51:
                if ("layout/assets_multi_item_0".equals(obj)) {
                    return new cy(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for assets_multi_item is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 52:
                if ("layout/assets_multi_warning_item_0".equals(obj)) {
                    return new da(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for assets_multi_warning_item is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 53:
                if ("layout/balance_cell_0".equals(obj)) {
                    return new dc(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for balance_cell is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 54:
                if ("layout/base_menu_fragment_0".equals(obj)) {
                    return new de(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for base_menu_fragment is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 55:
                if ("layout/base_smart_dialog_fragment_0".equals(obj)) {
                    return new dg(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for base_smart_dialog_fragment is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 56:
                if ("layout/base_smart_fragment_0".equals(obj)) {
                    return new di(dataBindingComponent, view);
                }
                if ("layout-sw720dp/base_smart_fragment_0".equals(obj)) {
                    return new dj(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for base_smart_fragment is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 57:
                if ("layout/bottom_sheet_chooser_0".equals(obj)) {
                    return new dl(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for bottom_sheet_chooser is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 58:
                if ("layout/bottom_sheet_commission_0".equals(obj)) {
                    return new dn(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for bottom_sheet_commission is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 59:
                if ("layout/bottom_sheet_item_0".equals(obj)) {
                    return new dp(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for bottom_sheet_item is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 60:
                if ("layout/bottom_sheet_message_0".equals(obj)) {
                    return new dr(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for bottom_sheet_message is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 61:
                if ("layout/bottom_sheet_otn_emission_history_0".equals(obj)) {
                    return new dt(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for bottom_sheet_otn_emission_history is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 62:
                if ("layout/bottom_sheet_portfolio_filter_chooser_0".equals(obj)) {
                    return new dv(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for bottom_sheet_portfolio_filter_chooser is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 63:
                if ("layout/bottom_sheet_portfolio_tpsl_chooser_0".equals(obj)) {
                    return new dx(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for bottom_sheet_portfolio_tpsl_chooser is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 64:
                if ("layout/buy_new_dialog_view_0".equals(obj)) {
                    return new dz(dataBindingComponent, new View[]{view});
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for buy_new_dialog_view is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 65:
                if ("layout/cfd_expiration_fragment_0".equals(obj)) {
                    return new eb(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for cfd_expiration_fragment is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 66:
                if ("layout/close_crypto_position_delegate_0".equals(obj)) {
                    return new ed(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for close_crypto_position_delegate is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 67:
                if ("layout/close_delegate_0".equals(obj)) {
                    return new ef(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for close_delegate is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 68:
                if ("layout/close_position_delegate_0".equals(obj)) {
                    return new eh(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for close_position_delegate is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 69:
                if ("layout/closed_portfolio_item_0".equals(obj)) {
                    return new ej(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for closed_portfolio_item is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 70:
                if ("layout/commission_view_0".equals(obj)) {
                    return new el(dataBindingComponent, new View[]{view});
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for commission_view is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 71:
                if ("layout/confirm_dialog_view_0".equals(obj)) {
                    return new en(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for confirm_dialog_view is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 72:
                if ("layout/crypto_confirm_dialog_view_0".equals(obj)) {
                    return new ep(dataBindingComponent, new View[]{view});
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for crypto_confirm_dialog_view is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 73:
                if ("layout/dialog_closed_deals_0".equals(obj)) {
                    return new er(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for dialog_closed_deals is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 74:
                if ("layout/dialog_closed_deals_bottom_multi_0".equals(obj)) {
                    return new et(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for dialog_closed_deals_bottom_multi is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 75:
                if ("layout/dialog_closed_deals_bottom_option_by_tick_0".equals(obj)) {
                    return new ev(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for dialog_closed_deals_bottom_option_by_tick is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 76:
                if ("layout/dialog_closed_deals_header_cfd_0".equals(obj)) {
                    return new ex(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for dialog_closed_deals_header_cfd is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 77:
                if ("layout/dialog_closed_deals_header_do_0".equals(obj)) {
                    return new ez(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for dialog_closed_deals_header_do is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 78:
                if ("layout/dialog_closed_deals_header_list_cfd_0".equals(obj)) {
                    return new fb(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for dialog_closed_deals_header_list_cfd is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 79:
                if ("layout/dialog_closed_deals_header_list_do_0".equals(obj)) {
                    return new fd(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for dialog_closed_deals_header_list_do is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 80:
                if ("layout/dialog_closed_deals_header_list_multi_0".equals(obj)) {
                    return new ff(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for dialog_closed_deals_header_list_multi is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 81:
                if ("layout/dialog_closed_deals_header_multi_0".equals(obj)) {
                    return new fh(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for dialog_closed_deals_header_multi is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 82:
                if ("layout/dialog_closed_deals_item_cfd_0".equals(obj)) {
                    return new fl(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for dialog_closed_deals_item_cfd is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 83:
                if ("layout/dialog_closed_deals_item_cfd_aggregated_0".equals(obj)) {
                    return new fj(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for dialog_closed_deals_item_cfd_aggregated is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 84:
                if ("layout/dialog_closed_deals_item_do_0".equals(obj)) {
                    return new fp(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for dialog_closed_deals_item_do is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 85:
                if ("layout/dialog_closed_deals_item_do_aggregated_0".equals(obj)) {
                    return new fn(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for dialog_closed_deals_item_do_aggregated is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 86:
                if ("layout/dialog_closed_deals_item_multi_0".equals(obj)) {
                    return new fr(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for dialog_closed_deals_item_multi is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 87:
                if ("layout/dialog_commision_info_0".equals(obj)) {
                    return new ft(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for dialog_commision_info is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 88:
                if ("layout/dialog_congrat_otn_emission_executed_0".equals(obj)) {
                    return new fv(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for dialog_congrat_otn_emission_executed is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 89:
                if ("layout/dialog_fragment_etfs_0".equals(obj)) {
                    return new fx(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for dialog_fragment_etfs is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 90:
                if ("layout/dialog_gdpr_warning_0".equals(obj)) {
                    return new fz(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for dialog_gdpr_warning is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 91:
                if ("layout/dialog_margin_add_on_info_0".equals(obj)) {
                    return new gb(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for dialog_margin_add_on_info is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 92:
                if ("layout/dialog_margin_add_on_position_0".equals(obj)) {
                    return new gd(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for dialog_margin_add_on_position is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 93:
                if ("layout/dialog_multiplier_confirm_0".equals(obj)) {
                    return new gf(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for dialog_multiplier_confirm is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 94:
                if ("layout/dialog_otn_commision_changed_0".equals(obj)) {
                    return new gh(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for dialog_otn_commision_changed is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 95:
                if ("layout/dialog_otn_expectation_0".equals(obj)) {
                    return new gj(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for dialog_otn_expectation is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 96:
                if ("layout/dialog_otn_reward_info_0".equals(obj)) {
                    return new gl(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for dialog_otn_reward_info is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 97:
                if ("layout/dialog_overnight_fee_info_0".equals(obj)) {
                    return new gn(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for dialog_overnight_fee_info is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 98:
                if ("layout/dialog_portfolio_invest_info_0".equals(obj)) {
                    return new gp(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for dialog_portfolio_invest_info is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 99:
                if ("layout/dialog_pro_application_status_0".equals(obj)) {
                    return new gr(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for dialog_pro_application_status is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 100:
                if ("layout/dialog_pro_trader_benefits_0".equals(obj)) {
                    return new gt(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for dialog_pro_trader_benefits is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            default:
                return null;
        }
    }

    private final ViewDataBinding c(DataBindingComponent dataBindingComponent, View view, int i, Object obj) {
        StringBuilder stringBuilder;
        switch (i) {
            case 101:
                if ("layout/dialog_pro_trader_selected_0".equals(obj)) {
                    return new gv(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for dialog_pro_trader_selected is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 102:
                if ("layout/dialog_reload_practice_0".equals(obj)) {
                    return new gx(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for dialog_reload_practice is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 103:
                if ("layout/dialog_tpsl_0".equals(obj)) {
                    return new gz(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for dialog_tpsl is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 104:
                if ("layout/dialog_trade_on_practice_0".equals(obj)) {
                    return new hb(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for dialog_trade_on_practice is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 105:
                if ("layout/dialog_trailing_info_0".equals(obj)) {
                    return new hd(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for dialog_trailing_info is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 106:
                if ("layout/dialog_warning_0".equals(obj)) {
                    return new hf(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for dialog_warning is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 107:
                if ("layout/dialog_whats_new_0".equals(obj)) {
                    return new hh(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for dialog_whats_new is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 108:
                if ("layout/dialog_whats_new_video_autoplay_delegate_0".equals(obj)) {
                    return new hj(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for dialog_whats_new_video_autoplay_delegate is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 109:
                if ("layout/dialog_whats_new_video_delegate_0".equals(obj)) {
                    return new hl(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for dialog_whats_new_video_delegate is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 110:
                if ("layout/dialog_whats_new_without_btn_0".equals(obj)) {
                    return new hn(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for dialog_whats_new_without_btn is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 111:
                if ("layout/dialpad_0".equals(obj)) {
                    return new hp(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for dialpad is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 112:
                if ("layout/dialpad_dot_0".equals(obj)) {
                    return new hr(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for dialpad_dot is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 113:
                if ("layout/dialpad_key_0".equals(obj)) {
                    return new hv(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for dialpad_key is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 114:
                if ("layout/dialpad_key_back_0".equals(obj)) {
                    return new ht(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for dialpad_key_back is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 115:
                if ("layout/dialpad_key_touchid_0".equals(obj)) {
                    return new hx(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for dialpad_key_touchid is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 116:
                if ("layout/dialpad_key_zero_0".equals(obj)) {
                    return new hz(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for dialpad_key_zero is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 117:
                if ("layout/digital_expiration_fragment_0".equals(obj)) {
                    return new ib(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for digital_expiration_fragment is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 118:
                if ("layout/expiration_fragment_0".equals(obj)) {
                    return new id(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for expiration_fragment is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 119:
                if ("layout/fee_history_item_0".equals(obj)) {
                    return new if(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for fee_history_item is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 120:
                if ("layout/fragment_account_security_0".equals(obj)) {
                    return new ih(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for fragment_account_security is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 121:
                if ("layout/fragment_account_security_page_0".equals(obj)) {
                    return new ij(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for fragment_account_security_page is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 122:
                if ("layout/fragment_account_security_passcode_0".equals(obj)) {
                    return new il(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for fragment_account_security_passcode is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 123:
                if ("layout/fragment_account_security_passcode_error_0".equals(obj)) {
                    return new in(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for fragment_account_security_passcode_error is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 124:
                if ("layout/fragment_active_phase_notification_0".equals(obj)) {
                    return new ip(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for fragment_active_phase_notification is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 125:
                if ("layout/fragment_assets_0".equals(obj)) {
                    return new ir(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for fragment_assets is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 126:
                if ("layout/fragment_commission_change_0".equals(obj)) {
                    return new it(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for fragment_commission_change is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 127:
                if ("layout/fragment_info_asset_0".equals(obj)) {
                    return new iv(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for fragment_info_asset is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 128:
                if ("layout/fragment_info_asset_conditions_0".equals(obj)) {
                    return new ix(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for fragment_info_asset_conditions is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 129:
                if ("layout/fragment_info_asset_main_info_0".equals(obj)) {
                    return new iz(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for fragment_info_asset_main_info is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 130:
                if ("layout/fragment_kyc_acceptable_documents_0".equals(obj)) {
                    return new jb(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for fragment_kyc_acceptable_documents is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 131:
                if ("layout/fragment_kyc_address_declined_0".equals(obj)) {
                    return new jd(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for fragment_kyc_address_declined is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 132:
                if ("layout/fragment_kyc_address_old_0".equals(obj)) {
                    return new jf(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for fragment_kyc_address_old is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 133:
                if ("layout/fragment_kyc_check_box_0".equals(obj)) {
                    return new jh(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for fragment_kyc_check_box is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 134:
                if ("layout/fragment_kyc_country_old_0".equals(obj)) {
                    return new jj(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for fragment_kyc_country_old is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 135:
                if ("layout/fragment_kyc_cysec_0".equals(obj)) {
                    return new jl(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for fragment_kyc_cysec is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 136:
                if ("layout/fragment_kyc_date_of_birth_old_0".equals(obj)) {
                    return new jn(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for fragment_kyc_date_of_birth_old is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 137:
                if ("layout/fragment_kyc_document_address_0".equals(obj)) {
                    return new jp(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for fragment_kyc_document_address is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 138:
                if ("layout/fragment_kyc_documents_intro_0".equals(obj)) {
                    return new jr(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for fragment_kyc_documents_intro is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 139:
                if ("layout/fragment_kyc_documents_upload_0".equals(obj)) {
                    return new jt(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for fragment_kyc_documents_upload is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 140:
                if ("layout/fragment_kyc_email_0".equals(obj)) {
                    return new jv(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for fragment_kyc_email is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 141:
                if ("layout/fragment_kyc_email_confirm_0".equals(obj)) {
                    return new jx(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for fragment_kyc_email_confirm is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 142:
                if ("layout/fragment_kyc_email_confirmed_0".equals(obj)) {
                    return new jz(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for fragment_kyc_email_confirmed is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 143:
                if ("layout/fragment_kyc_finish_old_0".equals(obj)) {
                    return new kb(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for fragment_kyc_finish_old is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 144:
                if ("layout/fragment_kyc_gdpr_old_0".equals(obj)) {
                    return new kd(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for fragment_kyc_gdpr_old is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 145:
                if ("layout/fragment_kyc_id_declined_0".equals(obj)) {
                    return new kf(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for fragment_kyc_id_declined is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 146:
                if ("layout/fragment_kyc_phone_0".equals(obj)) {
                    return new kh(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for fragment_kyc_phone is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 147:
                if ("layout/fragment_kyc_phone_confirm_old_0".equals(obj)) {
                    return new kj(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for fragment_kyc_phone_confirm_old is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 148:
                if ("layout/fragment_kyc_phone_confirmed_0".equals(obj)) {
                    return new kl(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for fragment_kyc_phone_confirmed is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 149:
                if ("layout/fragment_kyc_question_multi_choice_old_0".equals(obj)) {
                    return new kn(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for fragment_kyc_question_multi_choice_old is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 150:
                if ("layout/fragment_kyc_question_single_choice_old_0".equals(obj)) {
                    return new kp(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for fragment_kyc_question_single_choice_old is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            default:
                return null;
        }
    }

    private final ViewDataBinding d(DataBindingComponent dataBindingComponent, View view, int i, Object obj) {
        StringBuilder stringBuilder;
        switch (i) {
            case 151:
                if ("layout/fragment_kyc_question_text_old_0".equals(obj)) {
                    return new kr(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for fragment_kyc_question_text_old is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 152:
                if ("layout/fragment_kyc_question_warning2_0".equals(obj)) {
                    return new kt(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for fragment_kyc_question_warning2 is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 153:
                if ("layout/fragment_kyc_question_yes_no_0".equals(obj)) {
                    return new kv(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for fragment_kyc_question_yes_no is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 154:
                if ("layout/fragment_kyc_radio_button_0".equals(obj)) {
                    return new kx(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for fragment_kyc_radio_button is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 155:
                if ("layout/fragment_kyc_reportable_error_old_0".equals(obj)) {
                    return new kz(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for fragment_kyc_reportable_error_old is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 156:
                if ("layout/fragment_kyc_reportable_old_0".equals(obj)) {
                    return new lb(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for fragment_kyc_reportable_old is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 157:
                if ("layout/fragment_kyc_risks_old_0".equals(obj)) {
                    return new ld(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for fragment_kyc_risks_old is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 158:
                if ("layout/fragment_kyc_sex_old_0".equals(obj)) {
                    return new lf(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for fragment_kyc_sex_old is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 159:
                if ("layout/fragment_kyc_start_non_regulated_0".equals(obj)) {
                    return new lh(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for fragment_kyc_start_non_regulated is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 160:
                if ("layout/fragment_left_panel_0".equals(obj)) {
                    return new lj(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for fragment_left_panel is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 161:
                if ("layout/fragment_locale_asset_search_country_0".equals(obj)) {
                    return new ll(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for fragment_locale_asset_search_country is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 162:
                if ("layout/fragment_margin_not_added_0".equals(obj)) {
                    return new ln(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for fragment_margin_not_added is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 163:
                if ("layout-land/fragment_market_analysis_0".equals(obj)) {
                    return new lq(dataBindingComponent, view);
                }
                if ("layout/fragment_market_analysis_0".equals(obj)) {
                    return new lp(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for fragment_market_analysis is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 164:
                if ("layout/fragment_market_is_open_0".equals(obj)) {
                    return new ls(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for fragment_market_is_open is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 165:
                if ("layout/fragment_mkt_on_open_created_0".equals(obj)) {
                    return new lu(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for fragment_mkt_on_open_created is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 166:
                if ("layout/fragment_multiplier_chooser_0".equals(obj)) {
                    return new lw(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for fragment_multiplier_chooser is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 167:
                if ("layout/fragment_news_and_updates_0".equals(obj)) {
                    return new ly(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for fragment_news_and_updates is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 168:
                if ("layout/fragment_old_kyc_legal_name_0".equals(obj)) {
                    return new ma(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for fragment_old_kyc_legal_name is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 169:
                if ("layout/fragment_otn_leading_board_profile_0".equals(obj)) {
                    return new mc(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for fragment_otn_leading_board_profile is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 170:
                if ("layout/fragment_otn_leading_board_user_board_commission_0".equals(obj)) {
                    return new me(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for fragment_otn_leading_board_user_board_commission is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 171:
                if ("layout/fragment_otn_leading_board_user_board_date_0".equals(obj)) {
                    return new mg(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for fragment_otn_leading_board_user_board_date is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 172:
                if ("layout/fragment_otn_leading_board_user_board_place_0".equals(obj)) {
                    return new mi(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for fragment_otn_leading_board_user_board_place is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 173:
                if ("layout/fragment_otn_leading_board_user_board_trading_0".equals(obj)) {
                    return new mk(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for fragment_otn_leading_board_user_board_trading is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 174:
                if ("layout/fragment_otn_leading_board_user_board_user_0".equals(obj)) {
                    return new mm(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for fragment_otn_leading_board_user_board_user is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 175:
                if ("layout/fragment_pending_chooser_0".equals(obj)) {
                    return new mo(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for fragment_pending_chooser is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 176:
                if ("layout/fragment_pending_order_executed_0".equals(obj)) {
                    return new mq(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for fragment_pending_order_executed is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 177:
                if ("layout/fragment_pro_trader_active_0".equals(obj)) {
                    return new ms(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for fragment_pro_trader_active is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 178:
                if ("layout/fragment_pro_trader_more_0".equals(obj)) {
                    return new mu(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for fragment_pro_trader_more is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 179:
                if ("layout/fragment_pro_trader_web_0".equals(obj)) {
                    return new mw(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for fragment_pro_trader_web is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 180:
                if ("layout/fragment_promo_video_0".equals(obj)) {
                    return new my(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for fragment_promo_video is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 181:
                if ("layout/fragment_push_settings_0".equals(obj)) {
                    return new na(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for fragment_push_settings is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 182:
                if ("layout/fragment_right_panel_0".equals(obj)) {
                    return new nc(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for fragment_right_panel is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 183:
                if ("layout/fragment_scrollable_dialog_0".equals(obj)) {
                    return new ne(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for fragment_scrollable_dialog is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 184:
                if ("layout/fragment_signals_and_alerts_0".equals(obj)) {
                    return new ng(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for fragment_signals_and_alerts is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 185:
                if ("layout/fragment_token_balance_0".equals(obj)) {
                    return new ni(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for fragment_token_balance is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 186:
                if ("layout/fragment_tools_0".equals(obj)) {
                    return new nk(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for fragment_tools is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 187:
                if ("layout/fragment_traderoom_restriction_0".equals(obj)) {
                    return new nm(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for fragment_traderoom_restriction is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 188:
                if ("layout/fragment_traderoom_settings_0".equals(obj)) {
                    return new no(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for fragment_traderoom_settings is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 189:
                if ("layout/fragment_trending_today_0".equals(obj)) {
                    return new nq(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for fragment_trending_today is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 190:
                if ("layout/fragment_video_education_categories_0".equals(obj)) {
                    return new ns(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for fragment_video_education_categories is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 191:
                if ("layout/fragment_video_education_videos_0".equals(obj)) {
                    return new nu(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for fragment_video_education_videos is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 192:
                if ("layout/fragment_vip_about_0".equals(obj)) {
                    return new nw(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for fragment_vip_about is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 193:
                if ("layout/fragment_vip_choose_time_0".equals(obj)) {
                    return new ny(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for fragment_vip_choose_time is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 194:
                if ("layout/fragment_vip_education_0".equals(obj)) {
                    return new oa(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for fragment_vip_education is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 195:
                if ("layout/fragment_vip_request_call_0".equals(obj)) {
                    return new oc(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for fragment_vip_request_call is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 196:
                if ("layout/fx_expiration_fragment_0".equals(obj)) {
                    return new oe(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for fx_expiration_fragment is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 197:
                if ("layout/fx_strike_item_0".equals(obj)) {
                    return new og(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for fx_strike_item is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 198:
                if ("layout/fx_whats_new_dialog_0".equals(obj)) {
                    return new oi(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for fx_whats_new_dialog is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 199:
                if ("layout/gif_whats_new_dialog_0".equals(obj)) {
                    return new ok(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for gif_whats_new_dialog is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 200:
                if ("layout/how_to_trade_multi_fragment_0".equals(obj)) {
                    return new om(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for how_to_trade_multi_fragment is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            default:
                return null;
        }
    }

    private final ViewDataBinding e(DataBindingComponent dataBindingComponent, View view, int i, Object obj) {
        StringBuilder stringBuilder;
        switch (i) {
            case 201:
                if ("layout/indicator_info_item_0".equals(obj)) {
                    return new oo(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for indicator_info_item is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 202:
                if ("layout/indicator_title_item_0".equals(obj)) {
                    return new oq(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for indicator_title_item is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 203:
                if ("layout/instrument_type_bottom_sheet_item_0".equals(obj)) {
                    return new os(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for instrument_type_bottom_sheet_item is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 204:
                if ("layout/iqkeyboard_fragment_0".equals(obj)) {
                    return new ou(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for iqkeyboard_fragment is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 205:
                if ("layout/item_crypto_asset_0".equals(obj)) {
                    return new ow(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for item_crypto_asset is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 206:
                if ("layout/item_locale_asset_country_suggest_0".equals(obj)) {
                    return new oy(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for item_locale_asset_country_suggest is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 207:
                if ("layout/item_overnight_fee_schedule_0".equals(obj)) {
                    return new pa(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for item_overnight_fee_schedule is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 208:
                if ("layout/item_trending_today_0".equals(obj)) {
                    return new pc(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for item_trending_today is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 209:
                if ("layout/keyboard_tpsl_0".equals(obj)) {
                    return new pe(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for keyboard_tpsl is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 210:
                if ("layout/kyc_continue_button_0".equals(obj)) {
                    return new pg(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for kyc_continue_button is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 211:
                if ("layout/layout_dialog_toolbar_0".equals(obj)) {
                    return new pi(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for layout_dialog_toolbar is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 212:
                if ("layout/layout_kyc_toolbar_old_0".equals(obj)) {
                    return new pk(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for layout_kyc_toolbar_old is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 213:
                if ("layout/layout_pro_trader_benefits_bottom_row_0".equals(obj)) {
                    return new pm(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for layout_pro_trader_benefits_bottom_row is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 214:
                if ("layout/layout_pro_trader_benefits_top_row_0".equals(obj)) {
                    return new po(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for layout_pro_trader_benefits_top_row is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 215:
                if ("layout/left_menu_item_0".equals(obj)) {
                    return new pq(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for left_menu_item is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 216:
                if ("layout/left_menu_item_child_0".equals(obj)) {
                    return new ps(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for left_menu_item_child is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 217:
                if ("layout/left_menu_item_counter_0".equals(obj)) {
                    return new pu(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for left_menu_item_counter is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 218:
                if ("layout/left_menu_item_drop_down_0".equals(obj)) {
                    return new pw(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for left_menu_item_drop_down is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 219:
                if ("layout/left_menu_item_list_0".equals(obj)) {
                    return new py(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for left_menu_item_list is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 220:
                if ("layout/left_menu_item_notification_0".equals(obj)) {
                    return new qa(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for left_menu_item_notification is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 221:
                if ("layout/left_menu_item_pro_trader_0".equals(obj)) {
                    return new qc(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for left_menu_item_pro_trader is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 222:
                if ("layout/left_menu_item_profile_0".equals(obj)) {
                    return new qe(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for left_menu_item_profile is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 223:
                if ("layout/left_menu_item_terms_and_conditions_0".equals(obj)) {
                    return new qg(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for left_menu_item_terms_and_conditions is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 224:
                if ("layout/left_menu_item_with_progress_0".equals(obj)) {
                    return new qi(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for left_menu_item_with_progress is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 225:
                if ("layout/left_panel_item_0".equals(obj)) {
                    return new qk(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for left_panel_item is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 226:
                if ("layout/left_panel_item_btn_0".equals(obj)) {
                    return new qm(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for left_panel_item_btn is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 227:
                if ("layout/legal_update_0".equals(obj)) {
                    return new qo(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for legal_update is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 228:
                if ("layout/local_toast_layout_0".equals(obj)) {
                    return new qq(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for local_toast_layout is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 229:
                if ("layout/menu_fragment_0".equals(obj)) {
                    return new qs(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for menu_fragment is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 230:
                if ("layout/micro_portfolio_cfd_group_item_0".equals(obj)) {
                    return new qu(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for micro_portfolio_cfd_group_item is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 231:
                if ("layout/micro_portfolio_cfd_info_0".equals(obj)) {
                    return new qw(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for micro_portfolio_cfd_info is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 232:
                if ("layout/micro_portfolio_cfd_item_0".equals(obj)) {
                    return new qy(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for micro_portfolio_cfd_item is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 233:
                if ("layout/micro_portfolio_cfd_single_group_item_0".equals(obj)) {
                    return new ra(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for micro_portfolio_cfd_single_group_item is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 234:
                if ("layout/micro_portfolio_closed_empty_item_0".equals(obj)) {
                    return new rc(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for micro_portfolio_closed_empty_item is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 235:
                if ("layout/micro_portfolio_closed_item_0".equals(obj)) {
                    return new re(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for micro_portfolio_closed_item is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 236:
                if ("layout/micro_portfolio_exp_group_item_0".equals(obj)) {
                    return new rg(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for micro_portfolio_exp_group_item is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 237:
                if ("layout/micro_portfolio_exp_header_item_0".equals(obj)) {
                    return new ri(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for micro_portfolio_exp_header_item is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 238:
                if ("layout/micro_portfolio_exp_info_0".equals(obj)) {
                    return new rk(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for micro_portfolio_exp_info is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 239:
                if ("layout/micro_portfolio_exp_item_0".equals(obj)) {
                    return new rm(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for micro_portfolio_exp_item is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 240:
                if ("layout/micro_portfolio_exp_multi_group_item_0".equals(obj)) {
                    return new ro(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for micro_portfolio_exp_multi_group_item is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 241:
                if ("layout/micro_portfolio_exp_single_group_item_0".equals(obj)) {
                    return new rq(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for micro_portfolio_exp_single_group_item is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 242:
                if ("layout/micro_portfolio_mkt_on_open_item_0".equals(obj)) {
                    return new rs(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for micro_portfolio_mkt_on_open_item is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 243:
                if ("layout/micro_portfolio_mkt_on_open_single_group_item_0".equals(obj)) {
                    return new ru(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for micro_portfolio_mkt_on_open_single_group_item is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 244:
                if ("layout/micro_portfolio_open_empty_item_0".equals(obj)) {
                    return new rw(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for micro_portfolio_open_empty_item is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 245:
                if ("layout/micro_portfolio_open_header_item_0".equals(obj)) {
                    return new ry(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for micro_portfolio_open_header_item is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 246:
                if ("layout/micro_portfolio_page_closed_positions_0".equals(obj)) {
                    return new sa(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for micro_portfolio_page_closed_positions is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 247:
                if ("layout/micro_portfolio_page_open_positions_0".equals(obj)) {
                    return new sc(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for micro_portfolio_page_open_positions is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 248:
                if ("layout/micro_portfolio_page_pending_positions_0".equals(obj)) {
                    return new se(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for micro_portfolio_page_pending_positions is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 249:
                if ("layout/micro_portfolio_pending_empty_item_0".equals(obj)) {
                    return new sg(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for micro_portfolio_pending_empty_item is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case Callback.DEFAULT_SWIPE_ANIMATION_DURATION /*250*/:
                if ("layout/micro_portfolio_pending_group_item_0".equals(obj)) {
                    return new si(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for micro_portfolio_pending_group_item is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            default:
                return null;
        }
    }

    private final ViewDataBinding f(DataBindingComponent dataBindingComponent, View view, int i, Object obj) {
        StringBuilder stringBuilder;
        switch (i) {
            case 251:
                if ("layout/micro_portfolio_pending_info_0".equals(obj)) {
                    return new sk(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for micro_portfolio_pending_info is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 252:
                if ("layout/micro_portfolio_pending_item_0".equals(obj)) {
                    return new sm(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for micro_portfolio_pending_item is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 253:
                if ("layout/micro_portfolio_pending_single_group_item_0".equals(obj)) {
                    return new so(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for micro_portfolio_pending_single_group_item is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 254:
                if ("layout/micro_portfolio_total_pager_page_0".equals(obj)) {
                    return new sq(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for micro_portfolio_total_pager_page is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 255:
                if ("layout/more_trading_opportunities_0".equals(obj)) {
                    return new ss(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for more_trading_opportunities is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 256:
                if ("layout/multi_active_item_0".equals(obj)) {
                    return new su(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for multi_active_item is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case InputDeviceCompat.SOURCE_KEYBOARD /*257*/:
                if ("layout/multi_asset_view_0".equals(obj)) {
                    return new sw(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for multi_asset_view is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 258:
                if ("layout/multi_expiration_fragment_0".equals(obj)) {
                    return new sy(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for multi_expiration_fragment is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 259:
                if ("layout/multi_position_item_0".equals(obj)) {
                    return new ta(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for multi_position_item is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 260:
                if ("layout/news_and_updates_item_0".equals(obj)) {
                    return new tc(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for news_and_updates_item is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 261:
                if ("layout/nps_completed_fragment_0".equals(obj)) {
                    return new te(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for nps_completed_fragment is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 262:
                if ("layout/nps_feedback_fragment_0".equals(obj)) {
                    return new tg(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for nps_feedback_fragment is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 263:
                if ("layout/nps_score_fragment_0".equals(obj)) {
                    return new ti(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for nps_score_fragment is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 264:
                if ("layout/numpad_0".equals(obj)) {
                    return new tk(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for numpad is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 265:
                if ("layout/otn_history_item_0".equals(obj)) {
                    return new tm(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for otn_history_item is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 266:
                if ("layout/otn_leader_board_current_user_item_0".equals(obj)) {
                    return new to(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for otn_leader_board_current_user_item is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 267:
                if ("layout/otn_leader_board_first_item_0".equals(obj)) {
                    return new tq(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for otn_leader_board_first_item is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 268:
                if ("layout/otn_leader_board_item_0".equals(obj)) {
                    return new ts(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for otn_leader_board_item is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 269:
                if ("layout/otn_leader_board_select_country_item_0".equals(obj)) {
                    return new tu(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for otn_leader_board_select_country_item is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 270:
                if ("layout/overnight_fee_item_0".equals(obj)) {
                    return new tw(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for overnight_fee_item is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 271:
                if ("layout/personal_info_dialog_0".equals(obj)) {
                    return new ty(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for personal_info_dialog is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 272:
                if ("layout/personal_info_page_0".equals(obj)) {
                    return new ua(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for personal_info_page is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 273:
                if ("layout/popup_window_otn_leader_board_user_details_0".equals(obj)) {
                    return new uc(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for popup_window_otn_leader_board_user_details is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 274:
                if ("layout/portfolio_cfd_group_item_0".equals(obj)) {
                    return new ue(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for portfolio_cfd_group_item is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 275:
                if ("layout/portfolio_cfd_info_0".equals(obj)) {
                    return new ug(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for portfolio_cfd_info is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 276:
                if ("layout/portfolio_cfd_item_0".equals(obj)) {
                    return new ui(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for portfolio_cfd_item is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 277:
                if ("layout/portfolio_cfd_single_group_item_0".equals(obj)) {
                    return new uk(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for portfolio_cfd_single_group_item is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 278:
                if ("layout/portfolio_delegate_macro_0".equals(obj)) {
                    return new um(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for portfolio_delegate_macro is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 279:
                if ("layout/portfolio_delegate_micro_0".equals(obj)) {
                    return new uo(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for portfolio_delegate_micro is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 280:
                if ("layout/portfolio_exp_group_item_0".equals(obj)) {
                    return new uq(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for portfolio_exp_group_item is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 281:
                if ("layout/portfolio_exp_header_item_0".equals(obj)) {
                    return new us(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for portfolio_exp_header_item is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 282:
                if ("layout/portfolio_exp_info_0".equals(obj)) {
                    return new uu(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for portfolio_exp_info is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 283:
                if ("layout/portfolio_exp_item_0".equals(obj)) {
                    return new uw(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for portfolio_exp_item is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 284:
                if ("layout/portfolio_exp_multi_group_item_0".equals(obj)) {
                    return new uy(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for portfolio_exp_multi_group_item is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 285:
                if ("layout/portfolio_exp_single_group_item_0".equals(obj)) {
                    return new va(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for portfolio_exp_single_group_item is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 286:
                if ("layout/portfolio_filter_options_0".equals(obj)) {
                    return new vc(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for portfolio_filter_options is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 287:
                if ("layout/portfolio_macro_filter_item_0".equals(obj)) {
                    return new ve(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for portfolio_macro_filter_item is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 288:
                if ("layout/portfolio_micro_filter_item_0".equals(obj)) {
                    return new vg(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for portfolio_micro_filter_item is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 289:
                if ("layout/portfolio_mkt_on_open_item_0".equals(obj)) {
                    return new vi(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for portfolio_mkt_on_open_item is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 290:
                if ("layout/portfolio_mkt_on_open_single_group_item_0".equals(obj)) {
                    return new vk(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for portfolio_mkt_on_open_single_group_item is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 291:
                if ("layout/portfolio_open_empty_item_0".equals(obj)) {
                    return new vm(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for portfolio_open_empty_item is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 292:
                if ("layout/portfolio_open_header_item_0".equals(obj)) {
                    return new vo(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for portfolio_open_header_item is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 293:
                if ("layout/portfolio_page_open_positions_0".equals(obj)) {
                    return new vq(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for portfolio_page_open_positions is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 294:
                if ("layout/portfolio_page_pending_positions_0".equals(obj)) {
                    return new vs(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for portfolio_page_pending_positions is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 295:
                if ("layout/portfolio_pending_empty_item_0".equals(obj)) {
                    return new vu(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for portfolio_pending_empty_item is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 296:
                if ("layout/portfolio_pending_group_item_0".equals(obj)) {
                    return new vw(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for portfolio_pending_group_item is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 297:
                if ("layout/portfolio_pending_header_item_0".equals(obj)) {
                    return new vy(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for portfolio_pending_header_item is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 298:
                if ("layout/portfolio_pending_info_0".equals(obj)) {
                    return new wa(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for portfolio_pending_info is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 299:
                if ("layout/portfolio_pending_item_0".equals(obj)) {
                    return new wc(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for portfolio_pending_item is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 300:
                if ("layout/portfolio_pending_single_group_item_0".equals(obj)) {
                    return new we(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for portfolio_pending_single_group_item is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            default:
                return null;
        }
    }

    private final ViewDataBinding g(DataBindingComponent dataBindingComponent, View view, int i, Object obj) {
        StringBuilder stringBuilder;
        switch (i) {
            case MobileEvents.EVENTTYPE_USERACTION /*301*/:
                if ("layout/price_movements_attention_0".equals(obj)) {
                    return new wg(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for price_movements_attention is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case MobileEvents.EVENTTYPE_SDKLIFECYCLE /*302*/:
                if ("layout/price_movements_fragment_0".equals(obj)) {
                    return new wi(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for price_movements_fragment is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case MobileEvents.EVENTTYPE_ANDROID_LIFECYCLE /*303*/:
                if ("layout/price_movements_high_frequecy_item_0".equals(obj)) {
                    return new wk(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for price_movements_high_frequecy_item is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case MobileEvents.EVENTTYPE_RAW_TOUCH /*304*/:
                if ("layout/price_movements_high_frequency_layout_0".equals(obj)) {
                    return new wm(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for price_movements_high_frequency_layout is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case MobileEvents.EVENTTYPE_EXCEPTION /*305*/:
                if ("layout/price_movements_item_0".equals(obj)) {
                    return new wo(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for price_movements_item is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case MobileEvents.EVENTTYPE_SDKPARAMETERS /*306*/:
                if ("layout/price_movements_progress_0".equals(obj)) {
                    return new wq(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for price_movements_progress is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 307:
                if ("layout/price_movements_tittle_item_0".equals(obj)) {
                    return new ws(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for price_movements_tittle_item is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 308:
                if ("layout/push_settings_category_item_0".equals(obj)) {
                    return new wu(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for push_settings_category_item is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case MobileEvents.EVENTTYPE_NETWORKCALL /*309*/:
                if ("layout/push_settings_group_item_0".equals(obj)) {
                    return new ww(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for push_settings_group_item is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 310:
                if ("layout/rate_us_dialog_0".equals(obj)) {
                    return new wy(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for rate_us_dialog is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case MobileEvents.EVENTTYPE_CUSTOMALERT /*311*/:
                if ("layout/right_panel_closed_0".equals(obj)) {
                    return new xa(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for right_panel_closed is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case MobileEvents.EVENTTYPE_LIFENESS_INFO /*312*/:
                if ("layout/right_panel_delegate_cfd_0".equals(obj)) {
                    return new xc(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for right_panel_delegate_cfd is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case MobileEvents.EVENTTYPE_ADDITIONAL_DATAPOINTS /*313*/:
                if ("layout/right_panel_delegate_cfd_confirmation_0".equals(obj)) {
                    return new xe(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for right_panel_delegate_cfd_confirmation is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case MobileEvents.EVENTTYPE_BENCHMARK /*314*/:
                if ("layout/right_panel_delegate_cfd_main_0".equals(obj)) {
                    return new xg(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for right_panel_delegate_cfd_main is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 315:
                if ("layout/right_panel_delegate_cfd_on_open_confirmation_0".equals(obj)) {
                    return new xi(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for right_panel_delegate_cfd_on_open_confirmation is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 316:
                if ("layout/right_panel_delegate_cfd_on_open_main_0".equals(obj)) {
                    return new xk(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for right_panel_delegate_cfd_on_open_main is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 317:
                if ("layout/right_panel_delegate_crypto_0".equals(obj)) {
                    return new xm(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for right_panel_delegate_crypto is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 318:
                if ("layout/right_panel_delegate_crypto_closed_0".equals(obj)) {
                    return new xo(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for right_panel_delegate_crypto_closed is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 319:
                if ("layout/right_panel_delegate_crypto_confirmation_0".equals(obj)) {
                    return new xq(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for right_panel_delegate_crypto_confirmation is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 320:
                if ("layout/right_panel_delegate_crypto_loading_0".equals(obj)) {
                    return new xs(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for right_panel_delegate_crypto_loading is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 321:
                if ("layout/right_panel_delegate_crypto_main_0".equals(obj)) {
                    return new xu(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for right_panel_delegate_crypto_main is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 322:
                if ("layout/right_panel_delegate_crypto_success_0".equals(obj)) {
                    return new xw(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for right_panel_delegate_crypto_success is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 323:
                if ("layout/right_panel_delegate_digital_0".equals(obj)) {
                    return new xy(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for right_panel_delegate_digital is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 324:
                if ("layout/right_panel_delegate_digital_call_put_0".equals(obj)) {
                    return new ya(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for right_panel_delegate_digital_call_put is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 325:
                if ("layout/right_panel_delegate_multi_0".equals(obj)) {
                    return new yc(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for right_panel_delegate_multi is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 326:
                if ("layout/right_panel_delegate_multi_spot_0".equals(obj)) {
                    return new ye(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for right_panel_delegate_multi_spot is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 327:
                if ("layout/right_panel_delegate_on_open_cfd_0".equals(obj)) {
                    return new yg(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for right_panel_delegate_on_open_cfd is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 328:
                if ("layout/right_panel_delegate_spot_0".equals(obj)) {
                    return new yi(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for right_panel_delegate_spot is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 329:
                if ("layout/right_panel_delegate_turbo_binary_0".equals(obj)) {
                    return new yk(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for right_panel_delegate_turbo_binary is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 330:
                if ("layout/right_panel_delegate_turbo_binary_call_put_0".equals(obj)) {
                    return new ym(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for right_panel_delegate_turbo_binary_call_put is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 331:
                if ("layout/right_panel_fx_delegate_0".equals(obj)) {
                    return new yo(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for right_panel_fx_delegate is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 332:
                if ("layout/right_panel_price_alert_0".equals(obj)) {
                    return new yq(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for right_panel_price_alert is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 333:
                if ("layout/sell_delegate_0".equals(obj)) {
                    return new ys(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for sell_delegate is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 334:
                if ("layout/session_main_item_0".equals(obj)) {
                    return new yu(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for session_main_item is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 335:
                if ("layout/session_other_item_0".equals(obj)) {
                    return new yw(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for session_other_item is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 336:
                if ("layout/session_title_0".equals(obj)) {
                    return new yy(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for session_title is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 337:
                if ("layout/small_numpad_0".equals(obj)) {
                    return new za(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for small_numpad is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 338:
                if ("layout/strike_item_0".equals(obj)) {
                    return new zc(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for strike_item is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 339:
                if ("layout/string_basket_empty_item_0".equals(obj)) {
                    return new ze(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for string_basket_empty_item is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 340:
                if ("layout/string_basket_item_0".equals(obj)) {
                    return new zg(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for string_basket_item is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 341:
                if ("layout/string_basket_switch_item_0".equals(obj)) {
                    return new zi(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for string_basket_switch_item is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 342:
                if ("layout/template_item_0".equals(obj)) {
                    return new zk(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for template_item is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 343:
                if ("layout/template_toast_0".equals(obj)) {
                    return new zm(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for template_toast is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 344:
                if ("layout/toast_fx_next_expiration_0".equals(obj)) {
                    return new zo(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for toast_fx_next_expiration is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 345:
                if ("layout/toolbar_black_layout_0".equals(obj)) {
                    return new zq(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for toolbar_black_layout is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 346:
                if ("layout/tools_content_active_tools_0".equals(obj)) {
                    return new zs(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for tools_content_active_tools is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 347:
                if ("layout/tools_content_indicators_0".equals(obj)) {
                    return new zu(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for tools_content_indicators is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 348:
                if ("layout/tools_content_indicators_common_0".equals(obj)) {
                    return new zw(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for tools_content_indicators_common is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 349:
                if ("layout/tools_content_indicators_search_0".equals(obj)) {
                    return new zy(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for tools_content_indicators_search is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 350:
                if ("layout/tools_content_settings_0".equals(obj)) {
                    return new aaa(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for tools_content_settings is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            default:
                return null;
        }
    }

    private final ViewDataBinding h(DataBindingComponent dataBindingComponent, View view, int i, Object obj) {
        StringBuilder stringBuilder;
        switch (i) {
            case 351:
                if ("layout/tools_content_templates_0".equals(obj)) {
                    return new aac(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for tools_content_templates is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 352:
                if ("layout/top_panel_0".equals(obj)) {
                    return new aae(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for top_panel is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 353:
                if ("layout/trailing_whats_new_dialog_0".equals(obj)) {
                    return new aag(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for trailing_whats_new_dialog is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 354:
                if ("layout/video_education_search_suggestion_item_0".equals(obj)) {
                    return new aai(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for video_education_search_suggestion_item is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 355:
                if ("layout/video_education_simple_category_item_0".equals(obj)) {
                    return new aak(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for video_education_simple_category_item is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 356:
                if ("layout/video_education_tag_item_0".equals(obj)) {
                    return new aam(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for video_education_tag_item is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 357:
                if ("layout/video_education_video_item_0".equals(obj)) {
                    return new aao(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for video_education_video_item is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 358:
                if ("layout/view_pager_whats_new_dialog_0".equals(obj)) {
                    return new aaq(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for view_pager_whats_new_dialog is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 359:
                if ("layout/vip_about_info_0".equals(obj)) {
                    return new aas(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for vip_about_info is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 360:
                if ("layout/vip_education_item_view_0".equals(obj)) {
                    return new aau(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for vip_education_item_view is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 361:
                if ("layout/vip_education_session_item_0".equals(obj)) {
                    return new aaw(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for vip_education_session_item is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 362:
                if ("layout/whats_new_deposit_item_0".equals(obj)) {
                    return new aay(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for whats_new_deposit_item is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 363:
                if ("layout/whats_new_dialog_0".equals(obj)) {
                    return new aba(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for whats_new_dialog is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 364:
                if ("layout/whats_new_dialog_experimental_deposit_page_0".equals(obj)) {
                    return new abc(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for whats_new_dialog_experimental_deposit_page is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 365:
                if ("layout/whats_new_dialog_spot_0".equals(obj)) {
                    return new abe(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for whats_new_dialog_spot is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            case 366:
                if ("layout/whats_new_dialog_templates_0".equals(obj)) {
                    return new abg(dataBindingComponent, view);
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("The tag for whats_new_dialog_templates is invalid. Received: ");
                stringBuilder.append(obj);
                throw new IllegalArgumentException(stringBuilder.toString());
            default:
                return null;
        }
    }

    public ViewDataBinding getDataBinder(DataBindingComponent dataBindingComponent, View view, int i) {
        i = INTERNAL_LAYOUT_ID_LOOKUP.get(i);
        if (i > 0) {
            Object tag = view.getTag();
            if (tag != null) {
                switch ((i - 1) / 50) {
                    case 0:
                        return a(dataBindingComponent, view, i, tag);
                    case 1:
                        return b(dataBindingComponent, view, i, tag);
                    case 2:
                        return c(dataBindingComponent, view, i, tag);
                    case 3:
                        return d(dataBindingComponent, view, i, tag);
                    case 4:
                        return e(dataBindingComponent, view, i, tag);
                    case 5:
                        return f(dataBindingComponent, view, i, tag);
                    case 6:
                        return g(dataBindingComponent, view, i, tag);
                    case 7:
                        return h(dataBindingComponent, view, i, tag);
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
                } else if (i != 64) {
                    if (i != 70) {
                        if (i == 72) {
                            if ("layout/crypto_confirm_dialog_view_0".equals(tag)) {
                                return new ep(dataBindingComponent, viewArr);
                            }
                            stringBuilder = new StringBuilder();
                            stringBuilder.append("The tag for crypto_confirm_dialog_view is invalid. Received: ");
                            stringBuilder.append(tag);
                            throw new IllegalArgumentException(stringBuilder.toString());
                        }
                    } else if ("layout/commission_view_0".equals(tag)) {
                        return new el(dataBindingComponent, viewArr);
                    } else {
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("The tag for commission_view is invalid. Received: ");
                        stringBuilder.append(tag);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    }
                } else if ("layout/buy_new_dialog_view_0".equals(tag)) {
                    return new dz(dataBindingComponent, viewArr);
                } else {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("The tag for buy_new_dialog_view is invalid. Received: ");
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
        ArrayList arrayList = new ArrayList(28);
        arrayList.add(new DataBinderMapperImpl());
        arrayList.add(new com.iqoption.alerts.a());
        arrayList.add(new com.iqoption.asset.a());
        arrayList.add(new g());
        arrayList.add(new com.iqoption.d.a());
        arrayList.add(new e());
        arrayList.add(new com.iqoption.charttools.h());
        arrayList.add(new com.iqoption.chat.b());
        arrayList.add(new com.iqoption.config.b());
        arrayList.add(new c());
        arrayList.add(new com.iqoption.debugmenu.a());
        arrayList.add(new com.iqoption.deposit.e());
        arrayList.add(new com.iqoption.dialogs.c());
        arrayList.add(new com.iqoption.earningscalendar.b());
        arrayList.add(new com.iqoption.feed.b());
        arrayList.add(new com.iqoption.forexcalendar.c());
        arrayList.add(new com.iqoption.instruments.a());
        arrayList.add(new com.iqoption.kyc.d());
        arrayList.add(new com.iqoption.i.a());
        arrayList.add(new com.iqoption.j.b());
        arrayList.add(new com.iqoption.k.a());
        arrayList.add(new com.iqoption.qrcode.b());
        arrayList.add(new com.iqoption.signals.b());
        arrayList.add(new com.iqoption.tradinghistory.c());
        arrayList.add(new com.iqoption.videoeducation.a());
        arrayList.add(new com.iqoption.welcome.b());
        arrayList.add(new com.iqoption.widget.numpad.a());
        arrayList.add(new com.iqoption.withdraw.b());
        return arrayList;
    }
}
