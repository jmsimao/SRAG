package br.com.srag.Srag.Model;

import java.util.Date;

public class Srag {
	
	private Object dt_notific;
	private double sem_not;
	private Object dt_sin_pri;
	private double sem_pri;
	private String sg_uf_not;
	private String id_regiona; // 5
	private double co_regiona;
	private String id_municip; // 7
	private double co_mun_note;
	private String id_unidade;
	private double co_uni_note;
	private String cs_sexo;
	private Object dt_nasc;
	private double nu_idade_n;
	private double tp_idade;
	private double cod_idade;
	private double cs_gestant;
	private double cs_raca;
	private double cs_escol_n;
	private String id_pais;
	private double co_pais;
	private String sg_uf;
	private String id_rg_resi;
	private double co_rg_resi;
	private String id_mn_resi;
	private double co_mun_res;
	private double cs_zona;
	private String surto_sg;
	private double nosocomial;
	private double ave_suino;
	private double febre;
	private double tosse;
	private double garganta;
	private double dispneia;
	private double desc_resp;
	private double saturacao;
	private double diarreia;
	private double vomito;
	private double outro_sin;
	private String outro_des;
	private double puerpera;
	private double fator_risc;
	private double cardiopati;
	private double hematologi;
	private double sind_down;
	private double hepatica;
	private double asma;
	private double diabetes;
	private double neurologic;
	private double pneumopati;
	private double imunodepre;
	private double renal;
	private double obsidade;
	private double obes_imc;
	private double out_morbi;
	private String morbi_desc;
	private double vacina;
	private Object dt_ut_dose;
	private double mae_vac;
	private Object dt_vac_mae;
	private double mae_amamenta;
	private Object dt_doseuni;
	private Object dt_1_dose;
	private Object dt_2_dose;
	private double antiviral;
	private double tp_antivir;
	private String out_antiv;
	private Object dt_antivir;
	private double hospital;
	private Object dt_interna;
	private String sg_uf_inte;
	private String id_rg_inte;
	private double co_rg_inte;
	private String id_mn_inte;
	private double co_mu_inte; //BW
	private double uti;
	private Object dt_entuti;
	private Object dt_saidauti;
	private double suport_ven;
	private double raiox_res;
	private String raiox_out;
	private Object dt_raiox; //CD
	private double amostra;
	private Object dt_coleta;
	private double tp_amostra;
	private String out_amost; //CH
	private double pcr_resul;
	private Object dt_pcr;
	private double pos_pcrflu;
	private double tp_flu_pcr;
	private double pcr_fluasu;
	private String fluasu_out;
	private double pcr_flubli;
	private String flubli_out;
	private double pos_pcrout; //CQ
	private double pcr_vsr;
	private double pcr_para1;
	private double pcr_para2;
	private double pcr_para3;
	private double pcr_para4;
	private double pcr_adeno;
	private double pcr_metap;
	private double pcr_boca;
	private double pcr_rino;
	private double pcr_outro;
	private String ds_pcr_out; //DB
	private double classi_fin;
	private String classi_out;
	private double criterio;
	private double evolucao; //DF
	private Object dt_evoluca;
	private Object dt_encerra;
	private Object dt_digita; //DI
	// *VGM // DJ-DO
	private double pcr_sars2; //DP
	private String pac_cocbo;
	private String pac_dscbo; //DR
	private String out_anim;
	private double dor_abd;
	private double fadiga;
	private double perd_olft;
	private double perd_pala;
	private double tomo_res;
	private String tomo_out;
	private Object dt_tomo;
	private double tp_tes_an;
	private Object dt_res_an;
	private double res_an;
	private double pos_an_flu;
	private double tp_flu_an; //EE
	private double pos_an_out;
	private double an_sars2;
	private double an_vsr;
	private double an_para1;
	private double an_para2;
	private double an_para3;
	private double an_adeno;
	private double an_outro;
	private String ds_an_out; //EN
	private double tp_am_sor;
	private String sor_out;
	private Object dt_co_sor;
	private double tp_sor;
	private String out_sor; //ES
	private Object dt_res;
	private double res_igg;
	private double res_igm;
	private double res_iga;
	private double estrang;
	private double vacina_cov;
	private Object dose_1_cov;
	private Object dose_2_cov;
	private Object dose_ref;
	private String fab_cov1;
	private String fab_cov2;
	private String fab_covref;
	private String lote_ref; //EF
	
	private String lab_pr_cov;
	private String lote_1_cov;
	private String lote_2_cov;
	private double fnt_in_cov; //fJ
	
	public Srag(
				Object dt_notific 
				,double sem_not
				,Object dt_sin_pri
				,double sem_pri 
				,String sg_uf_not
				,String id_regiona
				,double co_regiona 
				,String id_municip
				,double co_mun_note
				,String id_unidade
				,double co_uni_note
				,String cs_sexo
				,Object dt_nasc
				,double nu_idade_n
				,double tp_idade
				,double cod_idade
				,double cs_gestant
				,double cs_raca
				,double cs_escol_n
				,String id_pais
				,double co_pais
				,String sg_uf
				,String id_rg_resi
				,double co_rg_resi
				,String id_mn_resi
				,double co_mun_res 
				,double cs_zona
				,String surto_sg
				,double nosocomial
				,double ave_suino
				,double febre
				,double tosse
				,double garganta
				,double dispneia
				,double desc_resp
				,double saturacao
				,double diarreia
				,double vomito
				,double outro_sin
				,String outro_des
				,double puerpera
				,double fator_risc
				,double cardiopati
				,double hematologi
				,double sind_down
				,double hepatica
				,double asma
				,double diabetes
				,double neurologic
				,double pneumopati
				,double imunodepre
				,double renal
				,double obsidade
				,double obes_imc
				,double out_morbi
				,String morbi_desc
				,double vacina
				,Object dt_ut_dose
				,double mae_vac
				,Object dt_vac_mae
				,double mae_amamenta
				,Object dt_doseuni
				,Object dt_1_dose
				,Object dt_2_dose
				,double antiviral
				,double tp_antivir
				,String out_antiv
				,Object dt_antivir
				,double hospital
				,Object dt_interna
				,String sg_uf_inte
				,String id_rg_inte
				,double co_rg_inte
				,String id_mn_inte
				,double co_mu_inte
				,double uti
				,Object dt_entuti
				,Object dt_saidauti
				,double suport_ven
				,double raiox_res
				,String raiox_out
				,Object dt_raiox
				,double amostra
				,Object dt_coleta
				,double tp_amostra
				,String out_amost
				,double pcr_resul
				,Object dt_pcr
				,double pos_pcrflu
				,double tp_flu_pcr
				,double pcr_fluasu
				,String fluasu_out
				,double pcr_flubli
				,String flubli_out
				,double pos_pcrout
				,double pcr_vsr
				,double pcr_para1
				,double pcr_para2
				,double pcr_para3
				,double pcr_para4
				,double pcr_adeno
				,double pcr_metap
				,double pcr_boca
				,double pcr_rino
				,double pcr_outro
				,String ds_pcr_out
				,double classi_fin
				,String classi_out
				,double criterio
				,double evolucao
				,Object dt_evoluca
				,Object dt_encerra
				,Object dt_digita
				// *VGM // DJ-DO
				,double pcr_sars2
				,String pac_cocbo
				,String pac_dscbo
				,String out_anim
				,double dor_abd
				,double fadiga
				,double perd_olft
				,double perd_pala
				,double tomo_res
				,String tomo_out
				,Object dt_tomo
				,double tp_tes_an
				,Object dt_res_an
				,double res_an
				,double pos_an_flu
				,double tp_flu_an
				,double pos_an_out
				,double an_sars2
				,double an_vsr
				,double an_para1
				,double an_para2
				,double an_para3
				,double an_adeno
				,double an_outro
				,String ds_an_out
				,double tp_am_sor
				,String sor_out
				,Object dt_co_sor
				,double tp_sor
				,String out_sor
				,Object dt_res
				,double res_igg
				,double res_igm
				,double res_iga
				,double estrang
				,double vacina_cov
				,Object dose_1_cov
				,Object dose_2_cov
				,Object dose_ref
				,String fab_cov1
				,String fab_cov2
				,String fab_covref
				,String lote_ref
			) 
	{
		super();
		this.dt_notific = dt_notific;
		this.sem_not = sem_not;
		this.dt_sin_pri = dt_sin_pri;
		this.sem_pri = sem_pri;
		this.sg_uf_not = sg_uf_not;
		this.id_regiona = id_regiona;
		this.co_regiona = co_regiona; 
		this.id_municip = id_municip;
		this.co_mun_note = co_mun_note;
		this.id_unidade = id_unidade;
		this.co_uni_note = co_uni_note;
		this.cs_sexo = cs_sexo;
		this.dt_nasc = dt_nasc;
		this.nu_idade_n = nu_idade_n;
		this.tp_idade = tp_idade;
		this.cod_idade = cod_idade;
		this.cs_gestant = cs_gestant;
		this.cs_raca = cs_raca;
		this.cs_escol_n = cs_escol_n;
		this.id_pais = id_pais;
		this.co_pais = co_pais;
		this.sg_uf = sg_uf;
		this.id_rg_resi = id_rg_resi;
		this.co_rg_resi = co_rg_resi;
		this.id_mn_resi = id_mn_resi;
		this.co_mun_res = co_mun_res;
		this.cs_zona = cs_zona;
		this.surto_sg = surto_sg;
		this.nosocomial = nosocomial;
		this.ave_suino = ave_suino;
		this.febre = febre;
		this.tosse = tosse;
		this.garganta = garganta;
		this.dispneia = dispneia;
		this.desc_resp = desc_resp;
		this.saturacao = saturacao;
		this.diarreia = diarreia;
		this.vomito = vomito;
		this.outro_sin = outro_sin;
		this.outro_des = outro_des;
		this.puerpera = puerpera;
		this.fator_risc = fator_risc;
		this.cardiopati = cardiopati;
		this.hematologi = hematologi;
		this.sind_down = sind_down;
		this.hepatica = hepatica;
		this.asma = asma;
		this.diabetes = diabetes;
		this.neurologic = neurologic;
		this.pneumopati = pneumopati;
		this.imunodepre = imunodepre;
		this.renal = renal;
		this.obsidade = obsidade;
		this.obes_imc = obes_imc;
		this.out_morbi = out_morbi;
		this.morbi_desc = morbi_desc;
		this.vacina = vacina;
		this.dt_ut_dose = dt_ut_dose;
		this.mae_vac = mae_vac;
		this.dt_vac_mae = dt_vac_mae;
		this.mae_amamenta = mae_amamenta;
		this.dt_doseuni = dt_doseuni;
		this.dt_1_dose = dt_1_dose;
		this.dt_2_dose = dt_2_dose;
		this.antiviral = antiviral;
		this.tp_antivir = tp_antivir;
		this.out_antiv = out_antiv;
		this.dt_antivir = dt_antivir;
		this.hospital = hospital;
		this.dt_interna = dt_interna;
		this.sg_uf_inte = sg_uf_inte;
		this.id_rg_inte = id_rg_inte;
		this.co_rg_inte = co_rg_inte;
		this.id_mn_inte = id_mn_inte;
		this.co_mu_inte = co_mu_inte;
		this.uti = uti;
		this.dt_entuti = dt_entuti;
		this.dt_saidauti = dt_saidauti;
		this.suport_ven = suport_ven;
		this.raiox_res = raiox_res;
		this.raiox_out = raiox_out;
		this.dt_raiox = dt_raiox;
		this.amostra = amostra;
		this.dt_coleta = dt_coleta;
		this.tp_amostra = tp_amostra;
		this.out_amost = out_amost;
		this.pcr_resul = pcr_resul;
		this.dt_pcr = dt_pcr;
		this.pos_pcrflu = pos_pcrflu;
		this.tp_flu_pcr = tp_flu_pcr;
		this.pcr_fluasu = pcr_fluasu;
		this.fluasu_out = fluasu_out;
		this.pcr_flubli = pcr_flubli;
		this.flubli_out = flubli_out;
		this.pos_pcrout = pos_pcrout; 
		this.pcr_vsr = pcr_vsr;
		this.pcr_para1 = pcr_para1;
		this.pcr_para2 = pcr_para2;
		this.pcr_para3 = pcr_para3;
		this.pcr_para4 = pcr_para4;
		this.pcr_adeno = pcr_adeno;
		this.pcr_metap = pcr_metap;
		this.pcr_boca = pcr_boca;
		this.pcr_rino = pcr_rino;
		this.pcr_outro = pcr_outro;
		this.ds_pcr_out = ds_pcr_out;
		this.classi_fin = classi_fin;
		this.classi_out = classi_out;
		this.criterio = criterio;
		this.evolucao = evolucao;
		this.dt_evoluca = dt_evoluca;
		this.dt_encerra = dt_encerra;
		this.dt_digita = dt_digita;
		// *VGM // DJ-DO
		this.pcr_sars2 = pcr_sars2;
		this.pac_cocbo = pac_cocbo;
		this.pac_dscbo = pac_dscbo;
		this.out_anim = out_anim;
		this.dor_abd = dor_abd;
		this.fadiga = fadiga;
		this.perd_olft = perd_olft;
		this.perd_pala = perd_pala;
		this.tomo_res = tomo_res;
		this.tomo_out = tomo_out;
		this.dt_tomo = dt_tomo;
		this.tp_tes_an = tp_tes_an;
		this.dt_res_an = dt_res_an;
		this.res_an = res_an;
		this.pos_an_flu = pos_an_flu;
		this.tp_flu_an = tp_flu_an;
		this.pos_an_out = pos_an_out;
		this.an_sars2 = an_sars2;
		this.an_vsr = an_vsr;
		this.an_para1 = an_para1;
		this.an_para2 = an_para2;
		this.an_para3 = an_para3;
		this.an_adeno = an_adeno;
		this.an_outro = an_outro;
		this.ds_an_out = ds_an_out;
		this.tp_am_sor = tp_am_sor;
		this.sor_out = sor_out;
		this.dt_co_sor = dt_co_sor;
		this.tp_sor = tp_sor;
		this.out_sor = out_sor;
		this.dt_res = dt_res;
		this.res_igg = res_igg;
		this.res_igm = res_igm;
		this.res_iga = res_iga;
		this.estrang = estrang;
		this.vacina_cov = vacina_cov;
		this.dose_1_cov = dose_1_cov;
		this.dose_2_cov = dose_2_cov;
		this.dose_ref = dose_ref;
		this.fab_cov1 = fab_cov1;
		this.fab_cov2 = fab_cov2;
		this.fab_covref = fab_covref;
		this.lote_ref = lote_ref;
	}
	
	public Srag(
				String lab_pr_cov
				,String lote_1_cov
				,String lote_2_cov
				,double fnt_in_cov
				) 
	{
		this.lab_pr_cov = lab_pr_cov;
		this.lote_1_cov = lote_1_cov;
		this.lote_2_cov = lote_2_cov;
		this.fnt_in_cov = fnt_in_cov;
	}
	
	// Getters...
	public Object getDt_notific() {
		return dt_notific;
	}

	
	public double getSem_not() {
		return sem_not;
	}


	public Object getDt_sin_pri() {
		return dt_sin_pri;
	}


	public double getSem_pri() {
		return sem_pri;
	}


	public String getSg_uf_not() {
		return sg_uf_not;
	}


	public String getId_regiona() {
		return id_regiona;
	}


	public double getCo_regiona() {
		return co_regiona;
	}


	public String getId_municip() {
		return id_municip;
	}


	public double getCo_mun_note() {
		return co_mun_note;
	}


	public String getId_unidade() {
		return id_unidade;
	}


	public double getCo_uni_note() {
		return co_uni_note;
	}


	public String getCs_sexo() {
		return cs_sexo;
	}


	public Object getDt_nasc() {
		return dt_nasc;
	}


	public double getNu_idade_n() {
		return nu_idade_n;
	}


	public double getTp_idade() {
		return tp_idade;
	}


	public double getCod_idade() {
		return cod_idade;
	}


	public double getCs_gestant() {
		return cs_gestant;
	}


	public double getCs_raca() {
		return cs_raca;
	}


	public double getCs_escol_n() {
		return cs_escol_n;
	}


	public String getId_pais() {
		return id_pais;
	}


	public double getCo_pais() {
		return co_pais;
	}


	public String getSg_uf() {
		return sg_uf;
	}


	public String getId_rg_resi() {
		return id_rg_resi;
	}


	public double getCo_rg_resi() {
		return co_rg_resi;
	}


	public String getId_mn_resi() {
		return id_mn_resi;
	}


	public double getCo_mun_res() {
		return co_mun_res;
	}


	public double getCs_zona() {
		return cs_zona;
	}


	public String getSurto_sg() {
		return surto_sg;
	}


	public double getNosocomial() {
		return nosocomial;
	}


	public double getAve_suino() {
		return ave_suino;
	}


	public double getFebre() {
		return febre;
	}


	public double getTosse() {
		return tosse;
	}


	public double getGarganta() {
		return garganta;
	}


	public double getDispneia() {
		return dispneia;
	}


	public double getDesc_resp() {
		return desc_resp;
	}


	public double getSaturacao() {
		return saturacao;
	}


	public double getDiarreia() {
		return diarreia;
	}


	public double getVomito() {
		return vomito;
	}


	public double getOutro_sin() {
		return outro_sin;
	}


	public String getOutro_des() {
		return outro_des;
	}


	public double getPuerpera() {
		return puerpera;
	}


	public double getFator_risc() {
		return fator_risc;
	}


	public double getCardiopati() {
		return cardiopati;
	}


	public double getHematologi() {
		return hematologi;
	}


	public double getSind_down() {
		return sind_down;
	}


	public double getHepatica() {
		return hepatica;
	}


	public double getAsma() {
		return asma;
	}


	public double getDiabetes() {
		return diabetes;
	}


	public double getNeurologic() {
		return neurologic;
	}


	public double getPneumopati() {
		return pneumopati;
	}


	public double getImunodepre() {
		return imunodepre;
	}


	public double getRenal() {
		return renal;
	}


	public double getObsidade() {
		return obsidade;
	}


	public double getObes_imc() {
		return obes_imc;
	}


	public double getOut_morbi() {
		return out_morbi;
	}


	public String getMorbi_desc() {
		return morbi_desc;
	}


	public double getVacina() {
		return vacina;
	}


	public Object getDt_ut_dose() {
		return dt_ut_dose;
	}


	public double getMae_vac() {
		return mae_vac;
	}


	public Object getDt_vac_mae() {
		return dt_vac_mae;
	}


	public double getMae_amamenta() {
		return mae_amamenta;
	}


	public Object getDt_doseuni() {
		return dt_doseuni;
	}


	public Object getDt_1_dose() {
		return dt_1_dose;
	}


	public Object getDt_2_dose() {
		return dt_2_dose;
	}


	public double getAntiviral() {
		return antiviral;
	}


	public double getTp_antivir() {
		return tp_antivir;
	}


	public String getOut_antiv() {
		return out_antiv;
	}


	public Object getDt_antivir() {
		return dt_antivir;
	}


	public double getHospital() {
		return hospital;
	}


	public Object getDt_interna() {
		return dt_interna;
	}


	public String getSg_uf_inte() {
		return sg_uf_inte;
	}


	public String getId_rg_inte() {
		return id_rg_inte;
	}


	public double getCo_rg_inte() {
		return co_rg_inte;
	}


	public String getId_mn_inte() {
		return id_mn_inte;
	}


	public double getCo_mu_inte() {
		return co_mu_inte;
	}


	public double getUti() {
		return uti;
	}


	public Object getDt_entuti() {
		return dt_entuti;
	}


	public Object getDt_saidauti() {
		return dt_saidauti;
	}


	public double getSuport_ven() {
		return suport_ven;
	}


	public double getRaiox_res() {
		return raiox_res;
	}


	public String getRaiox_out() {
		return raiox_out;
	}


	public Object getDt_raiox() {
		return dt_raiox;
	}


	public double getAmostra() {
		return amostra;
	}


	public Object getDt_coleta() {
		return dt_coleta;
	}


	public double getTp_amostra() {
		return tp_amostra;
	}


	public String getOut_amost() {
		return out_amost;
	}


	public double getPcr_resul() {
		return pcr_resul;
	}


	public Object getDt_pcr() {
		return dt_pcr;
	}


	public double getPos_pcrflu() {
		return pos_pcrflu;
	}


	public double getTp_flu_pcr() {
		return tp_flu_pcr;
	}


	public double getPcr_fluasu() {
		return pcr_fluasu;
	}


	public String getFluasu_out() {
		return fluasu_out;
	}


	public double getPcr_flubli() {
		return pcr_flubli;
	}


	public String getFlubli_out() {
		return flubli_out;
	}


	public double getPos_pcrout() {
		return pos_pcrout;
	}


	public double getPcr_vsr() {
		return pcr_vsr;
	}


	public double getPcr_para1() {
		return pcr_para1;
	}


	public double getPcr_para2() {
		return pcr_para2;
	}


	public double getPcr_para3() {
		return pcr_para3;
	}


	public double getPcr_para4() {
		return pcr_para4;
	}


	public double getPcr_adeno() {
		return pcr_adeno;
	}


	public double getPcr_metap() {
		return pcr_metap;
	}


	public double getPcr_boca() {
		return pcr_boca;
	}


	public double getPcr_rino() {
		return pcr_rino;
	}


	public double getPcr_outro() {
		return pcr_outro;
	}


	public String getDs_pcr_out() {
		return ds_pcr_out;
	}


	public double getClassi_fin() {
		return classi_fin;
	}


	public String getClassi_out() {
		return classi_out;
	}


	public double getCriterio() {
		return criterio;
	}


	public double getEvolucao() {
		return evolucao;
	}


	public Object getDt_evoluca() {
		return dt_evoluca;
	}


	public Object getDt_encerra() {
		return dt_encerra;
	}


	public Object getDt_digita() {
		return dt_digita;
	}


	public double getPcr_sars2() {
		return pcr_sars2;
	}


	public String getPac_cocbo() {
		return pac_cocbo;
	}


	public String getPac_dscbo() {
		return pac_dscbo;
	}


	public String getOut_anim() {
		return out_anim;
	}


	public double getDor_abd() {
		return dor_abd;
	}


	public double getFadiga() {
		return fadiga;
	}


	public double getPerd_olft() {
		return perd_olft;
	}


	public double getPerd_pala() {
		return perd_pala;
	}


	public double getTomo_res() {
		return tomo_res;
	}


	public String getTomo_out() {
		return tomo_out;
	}


	public Object getDt_tomo() {
		return dt_tomo;
	}


	public double getTp_tes_an() {
		return tp_tes_an;
	}


	public Object getDt_res_an() {
		return dt_res_an;
	}


	public double getRes_an() {
		return res_an;
	}


	public double getPos_an_flu() {
		return pos_an_flu;
	}


	public double getTp_flu_an() {
		return tp_flu_an;
	}


	public double getPos_an_out() {
		return pos_an_out;
	}


	public double getAn_sars2() {
		return an_sars2;
	}


	public double getAn_vsr() {
		return an_vsr;
	}


	public double getAn_para1() {
		return an_para1;
	}


	public double getAn_para2() {
		return an_para2;
	}


	public double getAn_para3() {
		return an_para3;
	}


	public double getAn_adeno() {
		return an_adeno;
	}


	public double getAn_outro() {
		return an_outro;
	}


	public String getDs_an_out() {
		return ds_an_out;
	}


	public double getTp_am_sor() {
		return tp_am_sor;
	}


	public String getSor_out() {
		return sor_out;
	}


	public Object getDt_co_sor() {
		return dt_co_sor;
	}


	public double getTp_sor() {
		return tp_sor;
	}


	public String getOut_sor() {
		return out_sor;
	}


	public Object getDt_res() {
		return dt_res;
	}


	public double getRes_igg() {
		return res_igg;
	}


	public double getRes_igm() {
		return res_igm;
	}


	public double getRes_iga() {
		return res_iga;
	}


	public double getEstrang() {
		return estrang;
	}


	public double getVacina_cov() {
		return vacina_cov;
	}


	public Object getDose_1_cov() {
		return dose_1_cov;
	}


	public Object getDose_2_cov() {
		return dose_2_cov;
	}


	public Object getDose_ref() {
		return dose_ref;
	}


	public String getFab_cov1() {
		return fab_cov1;
	}


	public String getFab_cov2() {
		return fab_cov2;
	}


	public String getFab_covref() {
		return fab_covref;
	}


	public String getLote_ref() {
		return lote_ref;
	}


	public String getLab_pr_cov() {
		return lab_pr_cov;
	}

	
	public String getLote_1_cov() {
		return lote_1_cov;
	}


	public String getLote_2_cov() {
		return lote_2_cov;
	}

	public double getFnt_in_cov() {
		return fnt_in_cov;
	}

	
	// Setters...
	public void setLab_pr_cov(String lab_pr_cov) {
		this.lab_pr_cov = lab_pr_cov;
	}
	
	public void setLote_1_cov(String lote_1_cov) {
		this.lote_1_cov = lote_1_cov;
	}

	public void setLote_2_cov(String lote_2_cov) {
		this.lote_2_cov = lote_2_cov;
	}

	public void setFnt_in_cov(double fnt_in_cov) {
		this.fnt_in_cov = fnt_in_cov;
	}
	
}
