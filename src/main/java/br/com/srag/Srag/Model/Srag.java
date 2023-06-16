package br.com.srag.Srag.Model;

import java.time.LocalDate;
import java.util.Date;

public class Srag {

	//private String nu_notific;
	private Date dt_notific;
	private String sem_not;
	private Date dt_sin_pri;
	private String sem_pri;
	private String sg_uf_not;
	private String id_municip;
	private String id_regiona;
	private String id_unidade;
	private String tem_cpf;
	private String nu_cpf;
	private String estrang;
	private String nu_cns;
	private String nm_pacient;
	private String cs_sexo;
	private LocalDate dt_nasc;
	private String nu_idade_n;
	private String tp_idade;
	private String cs_gestant;
	private String cs_raca;
	private String cs_etnia;
	private String pov_ct;
	private String tp_pov_ct;
	private String cs_escol_n;
	private String pac_cocbo;
	private String nm_mae_pac;
	private String nu_cep;
	private String sg_uf;
	private String id_rg_resi;
	private String id_mn_resi;
	private String nm_bairro;
	private String nm_logrado;
	private String nu_numero;
	private String nm_complem;
	private String nu_ddd_tel;
	private String cs_zona;
	private String id_pais;
	private String nosocomial;
	private String av_suino;
	private String out_anim;
	private String febre;
	private String tosse;
	private String garganta;
	private String dispineia;
	private String desc_resp;
	private String saturacao;
	private String diarreia;
	private String vomito;
	private String dor_abd;
	private String fadiga;
	private String perd_olft;
	private String perd_pala;
	private String outro_sin;
	private String outro_des;
	private String fator_risc;
	private String puerpera;
	private String cardiopati;
	private String hematologi;
	private String sind_down;
	private String hepatica;
	private String asma;
	private String diabetes;
	private String neurologic;
	private String pneumopati;
	private String imunodepre;
	private String renal;
	private String obsidade;
	private String obes_imc;
	private String out_morbi;
	private String morbi_desc;
	private String vacina_cov;
	private LocalDate dose_1_cov;
	private LocalDate dose_2_cov;
	private LocalDate dose_ref;
	private String fab_cov1;
	private String fab_cov2;
	private String fab_covref;
	private String lote_1_cov;
	private String lote_2_cov;
	private String lote_ref;
	private String fnt_in_cov;
	private String vacina;
	private LocalDate dt_ut_dose;
	private String mae_vac;
	private LocalDate dt_vac_mae;
	private String mae_amamenta;
	private LocalDate dt_doseuni;
	private LocalDate dt_1_dose;
	private LocalDate dt_2_dose;
	private String antiviral;
	private String tp_antivir;
	private String out_antiv;
	private LocalDate dt_antivir;
	private String Hospital;
	private LocalDate dt_interna;
	private String sg_uf_inte;
	private String id_rg_inte;
	private String id_mn_inte;
	private String id_un_inte;
	private String uti;
	private LocalDate dt_entuti;
	private LocalDate dt_saidauti;
	private String suport_ven;
	private String raiox_res;
	private String raiox_out;
	private LocalDate dt_raiox;
	private int tomo_res;
	private String tomo_out;
	private LocalDate dt_tomo;
	private String amostra;
	private LocalDate dt_coleta;
	private String tp_amostra;
	private String out_amost;
	private int requi_gal;
	private int tp_tes_an;
	private LocalDate dt_res_an;
	private String res_an;
	private String lab_an;
	private String co_lab_an;
	private String pos_an_flu;
	private String tp_flu_an;
	private String pos_an_out;
	private String an_sars2;
	private String an_vsr;
	private String an_para1;
	private String an_para2;
	private String an_para3;
	private String an_adeno;
	private String an_outro;
	private String ds_an_out;
	private String pcr_resul;
	private LocalDate dt_pcr;
	private String pos_pcrflu;
	private String tp_flu_pcr;
	private String pcr_fluasu;
	private String fluasu_out;
	private String pcr_flubli;
	private String flubli_out;
	private String pos_pcrout;
	private String pcr_sars2;
	private String pcr_vsr;
	private String pcr_para1;
	private String pcr_para2;
	private String pcr_para3;
	private String pcr_para4;
	private String pcr_adeno;
	private String pcr_metap;
	private String pcr_boca;
	private String pcr_rino;
	private String pcr_outro;
	private String ds_pcr_out;
	private String lab_pcr;
	private int tp_am_sor;
	private String sor_out;
	private LocalDate dt_co_sor;
	private int tp_sor;
	private String out_sor;
	private String sor_out1;
	private String res_igg;
	private String res_igm;
	private String res_iga;
	private LocalDate dt_res;
	private String classi_fin;
	private String classi_out;
	private String criterio;
	private String evolucao;
	private LocalDate dt_evoluca;
	private LocalDate dt_encerra;
	private String nu_do;
	private String observa;
	private String nome_prof;
	private String reg_prof;
	private LocalDate dt_digita;
	
	/*
	public Srag(String nu_notific, LocalDate dt_notific, String sem_not, LocalDate dt_sin_pri, String sem_pri,
			String sg_uf_not, String id_municip, String id_regiona, String id_unidade, String tem_cpf, String nu_cpf,
			String estrang, String nu_cns, String nm_pacient, String cs_sexo, LocalDate dt_nasc, String nu_idade_n,
			String tp_idade, String cs_gestant, String cs_raca, String cs_etnia, String pov_ct, String tp_pov_ct,
			String cs_escol_n, String pac_cocbo, String nm_mae_pac, String nu_cep, String sg_uf, String id_rg_resi,
			String id_mn_resi, String nm_bairro, String nm_logrado, String nu_numero, String nm_complem,
			String nu_ddd_tel, String cs_zona, String id_pais, String nosocomial, String av_suino, String out_anim,
			String febre, String tosse, String garganta, String dispineia, String desc_resp, String saturacao,
			String diarreia, String vomito, String dor_abd, String fadiga, String perd_olft, String perd_pala,
			String outro_sin, String outro_des, String fator_risc, String puerpera, String cardiopati,
			String hematologi, String sind_down, String hepatica, String asma, String diabetes, String neurologic,
			String pneumopati, String imunodepre, String renal, String obsidade, String obes_imc, String out_morbi,
			String morbi_desc, String vacina_cov, LocalDate dose_1_cov, LocalDate dose_2_cov, LocalDate dose_ref,
			String fab_cov1, String fab_cov2, String fab_covref, String lote_1_cov, String lote_2_cov, String lote_ref,
			String fnt_in_cov, String vacina, LocalDate dt_ut_dose, String mae_vac, LocalDate dt_vac_mae,
			String mae_amamenta, LocalDate dt_doseuni, LocalDate dt_1_dose, LocalDate dt_2_dose, String antiviral,
			String tp_antivir, String out_antiv, LocalDate dt_antivir, String hospital, LocalDate dt_interna,
			String sg_uf_inte, String id_rg_inte, String id_mn_inte, String id_un_inte, String uti, LocalDate dt_entuti,
			LocalDate dt_saidauti, String suport_ven, String raiox_res, String raiox_out, LocalDate dt_raiox,
			int tomo_res, String tomo_out, LocalDate dt_tomo, String amostra, LocalDate dt_coleta, String tp_amostra,
			String out_amost, int requi_gal, int tp_tes_an, LocalDate dt_res_an, String res_an, String lab_an,
			String co_lab_an, String pos_an_flu, String tp_flu_an, String pos_an_out, String an_sars2, String an_vsr,
			String an_para1, String an_para2, String an_para3, String an_adeno, String an_outro, String ds_an_out,
			String pcr_resul, LocalDate dt_pcr, String pos_pcrflu, String tp_flu_pcr, String pcr_fluasu,
			String fluasu_out, String pcr_flubli, String flubli_out, String pos_pcrout, String pcr_sars2,
			String pcr_vsr, String pcr_para1, String pcr_para2, String pcr_para3, String pcr_para4, String pcr_adeno,
			String pcr_metap, String pcr_boca, String pcr_rino, String pcr_outro, String ds_pcr_out, String lab_pcr,
			int tp_am_sor, String sor_out, LocalDate dt_co_sor, int tp_sor, String out_sor, String sor_out1,
			String res_igg, String res_igm, String res_iga, LocalDate dt_res, String classi_fin, String classi_out,
			String criterio, String evolucao, LocalDate dt_evoluca, LocalDate dt_encerra, String nu_do, String observa,
			String nome_prof, String reg_prof, LocalDate dt_digita) {
		*/
	public Srag(Date dt_notific, String sem_not, Date dt_sin_pri 
			) {
		super();
		//this.nu_notific = nu_notific;
		this.dt_notific = dt_notific;
		this.sem_not = sem_not;
		this.dt_sin_pri = dt_sin_pri;
		/*
		this.sem_pri = sem_pri;
		this.sg_uf_not = sg_uf_not;
		this.id_municip = id_municip;
		this.id_regiona = id_regiona;
		this.id_unidade = id_unidade;
		this.tem_cpf = tem_cpf;
		this.nu_cpf = nu_cpf;
		this.estrang = estrang;
		this.nu_cns = nu_cns;
		this.nm_pacient = nm_pacient;
		this.cs_sexo = cs_sexo;
		this.dt_nasc = dt_nasc;
		this.nu_idade_n = nu_idade_n;
		this.tp_idade = tp_idade;
		this.cs_gestant = cs_gestant;
		this.cs_raca = cs_raca;
		this.cs_etnia = cs_etnia;
		this.pov_ct = pov_ct;
		this.tp_pov_ct = tp_pov_ct;
		this.cs_escol_n = cs_escol_n;
		this.pac_cocbo = pac_cocbo;
		this.nm_mae_pac = nm_mae_pac;
		this.nu_cep = nu_cep;
		this.sg_uf = sg_uf;
		this.id_rg_resi = id_rg_resi;
		this.id_mn_resi = id_mn_resi;
		this.nm_bairro = nm_bairro;
		this.nm_logrado = nm_logrado;
		this.nu_numero = nu_numero;
		this.nm_complem = nm_complem;
		this.nu_ddd_tel = nu_ddd_tel;
		this.cs_zona = cs_zona;
		this.id_pais = id_pais;
		this.nosocomial = nosocomial;
		this.av_suino = av_suino;
		this.out_anim = out_anim;
		this.febre = febre;
		this.tosse = tosse;
		this.garganta = garganta;
		this.dispineia = dispineia;
		this.desc_resp = desc_resp;
		this.saturacao = saturacao;
		this.diarreia = diarreia;
		this.vomito = vomito;
		this.dor_abd = dor_abd;
		this.fadiga = fadiga;
		this.perd_olft = perd_olft;
		this.perd_pala = perd_pala;
		this.outro_sin = outro_sin;
		this.outro_des = outro_des;
		this.fator_risc = fator_risc;
		this.puerpera = puerpera;
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
		this.vacina_cov = vacina_cov;
		this.dose_1_cov = dose_1_cov;
		this.dose_2_cov = dose_2_cov;
		this.dose_ref = dose_ref;
		this.fab_cov1 = fab_cov1;
		this.fab_cov2 = fab_cov2;
		this.fab_covref = fab_covref;
		this.lote_1_cov = lote_1_cov;
		this.lote_2_cov = lote_2_cov;
		this.lote_ref = lote_ref;
		this.fnt_in_cov = fnt_in_cov;
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
		this.Hospital = hospital;
		this.dt_interna = dt_interna;
		this.sg_uf_inte = sg_uf_inte;
		this.id_rg_inte = id_rg_inte;
		this.id_mn_inte = id_mn_inte;
		this.id_un_inte = id_un_inte;
		this.uti = uti;
		this.dt_entuti = dt_entuti;
		this.dt_saidauti = dt_saidauti;
		this.suport_ven = suport_ven;
		this.raiox_res = raiox_res;
		this.raiox_out = raiox_out;
		this.dt_raiox = dt_raiox;
		this.tomo_res = tomo_res;
		this.tomo_out = tomo_out;
		this.dt_tomo = dt_tomo;
		this.amostra = amostra;
		this.dt_coleta = dt_coleta;
		this.tp_amostra = tp_amostra;
		this.out_amost = out_amost;
		this.requi_gal = requi_gal;
		this.tp_tes_an = tp_tes_an;
		this.dt_res_an = dt_res_an;
		this.res_an = res_an;
		this.lab_an = lab_an;
		this.co_lab_an = co_lab_an;
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
		this.pcr_resul = pcr_resul;
		this.dt_pcr = dt_pcr;
		this.pos_pcrflu = pos_pcrflu;
		this.tp_flu_pcr = tp_flu_pcr;
		this.pcr_fluasu = pcr_fluasu;
		this.fluasu_out = fluasu_out;
		this.pcr_flubli = pcr_flubli;
		this.flubli_out = flubli_out;
		this.pos_pcrout = pos_pcrout;
		this.pcr_sars2 = pcr_sars2;
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
		this.lab_pcr = lab_pcr;
		this.tp_am_sor = tp_am_sor;
		this.sor_out = sor_out;
		this.dt_co_sor = dt_co_sor;
		this.tp_sor = tp_sor;
		this.out_sor = out_sor;
		this.sor_out1 = sor_out1;
		this.res_igg = res_igg;
		this.res_igm = res_igm;
		this.res_iga = res_iga;
		this.dt_res = dt_res;
		this.classi_fin = classi_fin;
		this.classi_out = classi_out;
		this.criterio = criterio;
		this.evolucao = evolucao;
		this.dt_evoluca = dt_evoluca;
		this.dt_encerra = dt_encerra;
		this.nu_do = nu_do;
		this.observa = observa;
		this.nome_prof = nome_prof;
		this.reg_prof = reg_prof;
		this.dt_digita = dt_digita;
		*/
	}
/*
	public String getNu_notific() {
		return nu_notific;
	}

	public void setNu_notific(String nu_notific) {
		this.nu_notific = nu_notific;
	}
*/
	public Date getDt_notific() {
		return dt_notific;
	}

	public void setDt_notific(Date dt_notific) {
		this.dt_notific = dt_notific;
	}

	public String getSem_not() {
		return sem_not;
	}

	public void setSem_not(String sem_not) {
		this.sem_not = sem_not;
	}

	public Date getDt_sin_pri() {
		return dt_sin_pri;
	}

	public void setDt_sin_pri(Date dt_sin_pri) {
		this.dt_sin_pri = dt_sin_pri;
	}

	public String getSem_pri() {
		return sem_pri;
	}

	public void setSem_pri(String sem_pri) {
		this.sem_pri = sem_pri;
	}

	public String getSg_uf_not() {
		return sg_uf_not;
	}

	public void setSg_uf_not(String sg_uf_not) {
		this.sg_uf_not = sg_uf_not;
	}

	public String getId_municip() {
		return id_municip;
	}

	public void setId_municip(String id_municip) {
		this.id_municip = id_municip;
	}

	public String getId_regiona() {
		return id_regiona;
	}

	public void setId_regiona(String id_regiona) {
		this.id_regiona = id_regiona;
	}

	public String getId_unidade() {
		return id_unidade;
	}

	public void setId_unidade(String id_unidade) {
		this.id_unidade = id_unidade;
	}

	public String getTem_cpf() {
		return tem_cpf;
	}

	public void setTem_cpf(String tem_cpf) {
		this.tem_cpf = tem_cpf;
	}

	public String getNu_cpf() {
		return nu_cpf;
	}

	public void setNu_cpf(String nu_cpf) {
		this.nu_cpf = nu_cpf;
	}

	public String getEstrang() {
		return estrang;
	}

	public void setEstrang(String estrang) {
		this.estrang = estrang;
	}

	public String getNu_cns() {
		return nu_cns;
	}

	public void setNu_cns(String nu_cns) {
		this.nu_cns = nu_cns;
	}

	public String getNm_pacient() {
		return nm_pacient;
	}

	public void setNm_pacient(String nm_pacient) {
		this.nm_pacient = nm_pacient;
	}

	public String getCs_sexo() {
		return cs_sexo;
	}

	public void setCs_sexo(String cs_sexo) {
		this.cs_sexo = cs_sexo;
	}

	public LocalDate getDt_nasc() {
		return dt_nasc;
	}

	public void setDt_nasc(LocalDate dt_nasc) {
		this.dt_nasc = dt_nasc;
	}

	public String getNu_idade_n() {
		return nu_idade_n;
	}

	public void setNu_idade_n(String nu_idade_n) {
		this.nu_idade_n = nu_idade_n;
	}

	public String getTp_idade() {
		return tp_idade;
	}

	public void setTp_idade(String tp_idade) {
		this.tp_idade = tp_idade;
	}

	public String getCs_gestant() {
		return cs_gestant;
	}

	public void setCs_gestant(String cs_gestant) {
		this.cs_gestant = cs_gestant;
	}

	public String getCs_raca() {
		return cs_raca;
	}

	public void setCs_raca(String cs_raca) {
		this.cs_raca = cs_raca;
	}

	public String getCs_etnia() {
		return cs_etnia;
	}

	public void setCs_etnia(String cs_etnia) {
		this.cs_etnia = cs_etnia;
	}

	public String getPov_ct() {
		return pov_ct;
	}

	public void setPov_ct(String pov_ct) {
		this.pov_ct = pov_ct;
	}

	public String getTp_pov_ct() {
		return tp_pov_ct;
	}

	public void setTp_pov_ct(String tp_pov_ct) {
		this.tp_pov_ct = tp_pov_ct;
	}

	public String getCs_escol_n() {
		return cs_escol_n;
	}

	public void setCs_escol_n(String cs_escol_n) {
		this.cs_escol_n = cs_escol_n;
	}

	public String getPac_cocbo() {
		return pac_cocbo;
	}

	public void setPac_cocbo(String pac_cocbo) {
		this.pac_cocbo = pac_cocbo;
	}

	public String getNm_mae_pac() {
		return nm_mae_pac;
	}

	public void setNm_mae_pac(String nm_mae_pac) {
		this.nm_mae_pac = nm_mae_pac;
	}

	public String getNu_cep() {
		return nu_cep;
	}

	public void setNu_cep(String nu_cep) {
		this.nu_cep = nu_cep;
	}

	public String getSg_uf() {
		return sg_uf;
	}

	public void setSg_uf(String sg_uf) {
		this.sg_uf = sg_uf;
	}

	public String getId_rg_resi() {
		return id_rg_resi;
	}

	public void setId_rg_resi(String id_rg_resi) {
		this.id_rg_resi = id_rg_resi;
	}

	public String getId_mn_resi() {
		return id_mn_resi;
	}

	public void setId_mn_resi(String id_mn_resi) {
		this.id_mn_resi = id_mn_resi;
	}

	public String getNm_bairro() {
		return nm_bairro;
	}

	public void setNm_bairro(String nm_bairro) {
		this.nm_bairro = nm_bairro;
	}

	public String getNm_logrado() {
		return nm_logrado;
	}

	public void setNm_logrado(String nm_logrado) {
		this.nm_logrado = nm_logrado;
	}

	public String getNu_numero() {
		return nu_numero;
	}

	public void setNu_numero(String nu_numero) {
		this.nu_numero = nu_numero;
	}

	public String getNm_complem() {
		return nm_complem;
	}

	public void setNm_complem(String nm_complem) {
		this.nm_complem = nm_complem;
	}

	public String getNu_ddd_tel() {
		return nu_ddd_tel;
	}

	public void setNu_ddd_tel(String nu_ddd_tel) {
		this.nu_ddd_tel = nu_ddd_tel;
	}

	public String getCs_zona() {
		return cs_zona;
	}

	public void setCs_zona(String cs_zona) {
		this.cs_zona = cs_zona;
	}

	public String getId_pais() {
		return id_pais;
	}

	public void setId_pais(String id_pais) {
		this.id_pais = id_pais;
	}

	public String getNosocomial() {
		return nosocomial;
	}

	public void setNosocomial(String nosocomial) {
		this.nosocomial = nosocomial;
	}

	public String getAv_suino() {
		return av_suino;
	}

	public void setAv_suino(String av_suino) {
		this.av_suino = av_suino;
	}

	public String getOut_anim() {
		return out_anim;
	}

	public void setOut_anim(String out_anim) {
		this.out_anim = out_anim;
	}

	public String getFebre() {
		return febre;
	}

	public void setFebre(String febre) {
		this.febre = febre;
	}

	public String getTosse() {
		return tosse;
	}

	public void setTosse(String tosse) {
		this.tosse = tosse;
	}

	public String getGarganta() {
		return garganta;
	}

	public void setGarganta(String garganta) {
		this.garganta = garganta;
	}

	public String getDispineia() {
		return dispineia;
	}

	public void setDispineia(String dispineia) {
		this.dispineia = dispineia;
	}

	public String getDesc_resp() {
		return desc_resp;
	}

	public void setDesc_resp(String desc_resp) {
		this.desc_resp = desc_resp;
	}

	public String getSaturacao() {
		return saturacao;
	}

	public void setSaturacao(String saturacao) {
		this.saturacao = saturacao;
	}

	public String getDiarreia() {
		return diarreia;
	}

	public void setDiarreia(String diarreia) {
		this.diarreia = diarreia;
	}

	public String getVomito() {
		return vomito;
	}

	public void setVomito(String vomito) {
		this.vomito = vomito;
	}

	public String getDor_abd() {
		return dor_abd;
	}

	public void setDor_abd(String dor_abd) {
		this.dor_abd = dor_abd;
	}

	public String getFadiga() {
		return fadiga;
	}

	public void setFadiga(String fadiga) {
		this.fadiga = fadiga;
	}

	public String getPerd_olft() {
		return perd_olft;
	}

	public void setPerd_olft(String perd_olft) {
		this.perd_olft = perd_olft;
	}

	public String getPerd_pala() {
		return perd_pala;
	}

	public void setPerd_pala(String perd_pala) {
		this.perd_pala = perd_pala;
	}

	public String getOutro_sin() {
		return outro_sin;
	}

	public void setOutro_sin(String outro_sin) {
		this.outro_sin = outro_sin;
	}

	public String getOutro_des() {
		return outro_des;
	}

	public void setOutro_des(String outro_des) {
		this.outro_des = outro_des;
	}

	public String getFator_risc() {
		return fator_risc;
	}

	public void setFator_risc(String fator_risc) {
		this.fator_risc = fator_risc;
	}

	public String getPuerpera() {
		return puerpera;
	}

	public void setPuerpera(String puerpera) {
		this.puerpera = puerpera;
	}

	public String getCardiopati() {
		return cardiopati;
	}

	public void setCardiopati(String cardiopati) {
		this.cardiopati = cardiopati;
	}

	public String getHematologi() {
		return hematologi;
	}

	public void setHematologi(String hematologi) {
		this.hematologi = hematologi;
	}

	public String getSind_down() {
		return sind_down;
	}

	public void setSind_down(String sind_down) {
		this.sind_down = sind_down;
	}

	public String getHepatica() {
		return hepatica;
	}

	public void setHepatica(String hepatica) {
		this.hepatica = hepatica;
	}

	public String getAsma() {
		return asma;
	}

	public void setAsma(String asma) {
		this.asma = asma;
	}

	public String getDiabetes() {
		return diabetes;
	}

	public void setDiabetes(String diabetes) {
		this.diabetes = diabetes;
	}

	public String getNeurologic() {
		return neurologic;
	}

	public void setNeurologic(String neurologic) {
		this.neurologic = neurologic;
	}

	public String getPneumopati() {
		return pneumopati;
	}

	public void setPneumopati(String pneumopati) {
		this.pneumopati = pneumopati;
	}

	public String getImunodepre() {
		return imunodepre;
	}

	public void setImunodepre(String imunodepre) {
		this.imunodepre = imunodepre;
	}

	public String getRenal() {
		return renal;
	}

	public void setRenal(String renal) {
		this.renal = renal;
	}

	public String getObsidade() {
		return obsidade;
	}

	public void setObsidade(String obsidade) {
		this.obsidade = obsidade;
	}

	public String getObes_imc() {
		return obes_imc;
	}

	public void setObes_imc(String obes_imc) {
		this.obes_imc = obes_imc;
	}

	public String getOut_morbi() {
		return out_morbi;
	}

	public void setOut_morbi(String out_morbi) {
		this.out_morbi = out_morbi;
	}

	public String getMorbi_desc() {
		return morbi_desc;
	}

	public void setMorbi_desc(String morbi_desc) {
		this.morbi_desc = morbi_desc;
	}

	public String getVacina_cov() {
		return vacina_cov;
	}

	public void setVacina_cov(String vacina_cov) {
		this.vacina_cov = vacina_cov;
	}

	public LocalDate getDose_1_cov() {
		return dose_1_cov;
	}

	public void setDose_1_cov(LocalDate dose_1_cov) {
		this.dose_1_cov = dose_1_cov;
	}

	public LocalDate getDose_2_cov() {
		return dose_2_cov;
	}

	public void setDose_2_cov(LocalDate dose_2_cov) {
		this.dose_2_cov = dose_2_cov;
	}

	public LocalDate getDose_ref() {
		return dose_ref;
	}

	public void setDose_ref(LocalDate dose_ref) {
		this.dose_ref = dose_ref;
	}

	public String getFab_cov1() {
		return fab_cov1;
	}

	public void setFab_cov1(String fab_cov1) {
		this.fab_cov1 = fab_cov1;
	}

	public String getFab_cov2() {
		return fab_cov2;
	}

	public void setFab_cov2(String fab_cov2) {
		this.fab_cov2 = fab_cov2;
	}

	public String getFab_covref() {
		return fab_covref;
	}

	public void setFab_covref(String fab_covref) {
		this.fab_covref = fab_covref;
	}

	public String getLote_1_cov() {
		return lote_1_cov;
	}

	public void setLote_1_cov(String lote_1_cov) {
		this.lote_1_cov = lote_1_cov;
	}

	public String getLote_2_cov() {
		return lote_2_cov;
	}

	public void setLote_2_cov(String lote_2_cov) {
		this.lote_2_cov = lote_2_cov;
	}

	public String getLote_ref() {
		return lote_ref;
	}

	public void setLote_ref(String lote_ref) {
		this.lote_ref = lote_ref;
	}

	public String getFnt_in_cov() {
		return fnt_in_cov;
	}

	public void setFnt_in_cov(String fnt_in_cov) {
		this.fnt_in_cov = fnt_in_cov;
	}

	public String getVacina() {
		return vacina;
	}

	public void setVacina(String vacina) {
		this.vacina = vacina;
	}

	public LocalDate getDt_ut_dose() {
		return dt_ut_dose;
	}

	public void setDt_ut_dose(LocalDate dt_ut_dose) {
		this.dt_ut_dose = dt_ut_dose;
	}

	public String getMae_vac() {
		return mae_vac;
	}

	public void setMae_vac(String mae_vac) {
		this.mae_vac = mae_vac;
	}

	public LocalDate getDt_vac_mae() {
		return dt_vac_mae;
	}

	public void setDt_vac_mae(LocalDate dt_vac_mae) {
		this.dt_vac_mae = dt_vac_mae;
	}

	public String getMae_amamenta() {
		return mae_amamenta;
	}

	public void setMae_amamenta(String mae_amamenta) {
		this.mae_amamenta = mae_amamenta;
	}

	public LocalDate getDt_doseuni() {
		return dt_doseuni;
	}

	public void setDt_doseuni(LocalDate dt_doseuni) {
		this.dt_doseuni = dt_doseuni;
	}

	public LocalDate getDt_1_dose() {
		return dt_1_dose;
	}

	public void setDt_1_dose(LocalDate dt_1_dose) {
		this.dt_1_dose = dt_1_dose;
	}

	public LocalDate getDt_2_dose() {
		return dt_2_dose;
	}

	public void setDt_2_dose(LocalDate dt_2_dose) {
		this.dt_2_dose = dt_2_dose;
	}

	public String getAntiviral() {
		return antiviral;
	}

	public void setAntiviral(String antiviral) {
		this.antiviral = antiviral;
	}

	public String getTp_antivir() {
		return tp_antivir;
	}

	public void setTp_antivir(String tp_antivir) {
		this.tp_antivir = tp_antivir;
	}

	public String getOut_antiv() {
		return out_antiv;
	}

	public void setOut_antiv(String out_antiv) {
		this.out_antiv = out_antiv;
	}

	public LocalDate getDt_antivir() {
		return dt_antivir;
	}

	public void setDt_antivir(LocalDate dt_antivir) {
		this.dt_antivir = dt_antivir;
	}

	public String getHospital() {
		return Hospital;
	}

	public void setHospital(String hospital) {
		Hospital = hospital;
	}

	public LocalDate getDt_interna() {
		return dt_interna;
	}

	public void setDt_interna(LocalDate dt_interna) {
		this.dt_interna = dt_interna;
	}

	public String getSg_uf_inte() {
		return sg_uf_inte;
	}

	public void setSg_uf_inte(String sg_uf_inte) {
		this.sg_uf_inte = sg_uf_inte;
	}

	public String getId_rg_inte() {
		return id_rg_inte;
	}

	public void setId_rg_inte(String id_rg_inte) {
		this.id_rg_inte = id_rg_inte;
	}

	public String getId_mn_inte() {
		return id_mn_inte;
	}

	public void setId_mn_inte(String id_mn_inte) {
		this.id_mn_inte = id_mn_inte;
	}

	public String getId_un_inte() {
		return id_un_inte;
	}

	public void setId_un_inte(String id_un_inte) {
		this.id_un_inte = id_un_inte;
	}

	public String getUti() {
		return uti;
	}

	public void setUti(String uti) {
		this.uti = uti;
	}

	public LocalDate getDt_entuti() {
		return dt_entuti;
	}

	public void setDt_entuti(LocalDate dt_entuti) {
		this.dt_entuti = dt_entuti;
	}

	public LocalDate getDt_saidauti() {
		return dt_saidauti;
	}

	public void setDt_saidauti(LocalDate dt_saidauti) {
		this.dt_saidauti = dt_saidauti;
	}

	public String getSuport_ven() {
		return suport_ven;
	}

	public void setSuport_ven(String suport_ven) {
		this.suport_ven = suport_ven;
	}

	public String getRaiox_res() {
		return raiox_res;
	}

	public void setRaiox_res(String raiox_res) {
		this.raiox_res = raiox_res;
	}

	public String getRaiox_out() {
		return raiox_out;
	}

	public void setRaiox_out(String raiox_out) {
		this.raiox_out = raiox_out;
	}

	public LocalDate getDt_raiox() {
		return dt_raiox;
	}

	public void setDt_raiox(LocalDate dt_raiox) {
		this.dt_raiox = dt_raiox;
	}

	public int getTomo_res() {
		return tomo_res;
	}

	public void setTomo_res(int tomo_res) {
		this.tomo_res = tomo_res;
	}

	public String getTomo_out() {
		return tomo_out;
	}

	public void setTomo_out(String tomo_out) {
		this.tomo_out = tomo_out;
	}

	public LocalDate getDt_tomo() {
		return dt_tomo;
	}

	public void setDt_tomo(LocalDate dt_tomo) {
		this.dt_tomo = dt_tomo;
	}

	public String getAmostra() {
		return amostra;
	}

	public void setAmostra(String amostra) {
		this.amostra = amostra;
	}

	public LocalDate getDt_coleta() {
		return dt_coleta;
	}

	public void setDt_coleta(LocalDate dt_coleta) {
		this.dt_coleta = dt_coleta;
	}

	public String getTp_amostra() {
		return tp_amostra;
	}

	public void setTp_amostra(String tp_amostra) {
		this.tp_amostra = tp_amostra;
	}

	public String getOut_amost() {
		return out_amost;
	}

	public void setOut_amost(String out_amost) {
		this.out_amost = out_amost;
	}

	public int getRequi_gal() {
		return requi_gal;
	}

	public void setRequi_gal(int requi_gal) {
		this.requi_gal = requi_gal;
	}

	public int getTp_tes_an() {
		return tp_tes_an;
	}

	public void setTp_tes_an(int tp_tes_an) {
		this.tp_tes_an = tp_tes_an;
	}

	public LocalDate getDt_res_an() {
		return dt_res_an;
	}

	public void setDt_res_an(LocalDate dt_res_an) {
		this.dt_res_an = dt_res_an;
	}

	public String getRes_an() {
		return res_an;
	}

	public void setRes_an(String res_an) {
		this.res_an = res_an;
	}

	public String getLab_an() {
		return lab_an;
	}

	public void setLab_an(String lab_an) {
		this.lab_an = lab_an;
	}

	public String getCo_lab_an() {
		return co_lab_an;
	}

	public void setCo_lab_an(String co_lab_an) {
		this.co_lab_an = co_lab_an;
	}

	public String getPos_an_flu() {
		return pos_an_flu;
	}

	public void setPos_an_flu(String pos_an_flu) {
		this.pos_an_flu = pos_an_flu;
	}

	public String getTp_flu_an() {
		return tp_flu_an;
	}

	public void setTp_flu_an(String tp_flu_an) {
		this.tp_flu_an = tp_flu_an;
	}

	public String getPos_an_out() {
		return pos_an_out;
	}

	public void setPos_an_out(String pos_an_out) {
		this.pos_an_out = pos_an_out;
	}

	public String getAn_sars2() {
		return an_sars2;
	}

	public void setAn_sars2(String an_sars2) {
		this.an_sars2 = an_sars2;
	}

	public String getAn_vsr() {
		return an_vsr;
	}

	public void setAn_vsr(String an_vsr) {
		this.an_vsr = an_vsr;
	}

	public String getAn_para1() {
		return an_para1;
	}

	public void setAn_para1(String an_para1) {
		this.an_para1 = an_para1;
	}

	public String getAn_para2() {
		return an_para2;
	}

	public void setAn_para2(String an_para2) {
		this.an_para2 = an_para2;
	}

	public String getAn_para3() {
		return an_para3;
	}

	public void setAn_para3(String an_para3) {
		this.an_para3 = an_para3;
	}

	public String getAn_adeno() {
		return an_adeno;
	}

	public void setAn_adeno(String an_adeno) {
		this.an_adeno = an_adeno;
	}

	public String getAn_outro() {
		return an_outro;
	}

	public void setAn_outro(String an_outro) {
		this.an_outro = an_outro;
	}

	public String getDs_an_out() {
		return ds_an_out;
	}

	public void setDs_an_out(String ds_an_out) {
		this.ds_an_out = ds_an_out;
	}

	public String getPcr_resul() {
		return pcr_resul;
	}

	public void setPcr_resul(String pcr_resul) {
		this.pcr_resul = pcr_resul;
	}

	public LocalDate getDt_pcr() {
		return dt_pcr;
	}

	public void setDt_pcr(LocalDate dt_pcr) {
		this.dt_pcr = dt_pcr;
	}

	public String getPos_pcrflu() {
		return pos_pcrflu;
	}

	public void setPos_pcrflu(String pos_pcrflu) {
		this.pos_pcrflu = pos_pcrflu;
	}

	public String getTp_flu_pcr() {
		return tp_flu_pcr;
	}

	public void setTp_flu_pcr(String tp_flu_pcr) {
		this.tp_flu_pcr = tp_flu_pcr;
	}

	public String getPcr_fluasu() {
		return pcr_fluasu;
	}

	public void setPcr_fluasu(String pcr_fluasu) {
		this.pcr_fluasu = pcr_fluasu;
	}

	public String getFluasu_out() {
		return fluasu_out;
	}

	public void setFluasu_out(String fluasu_out) {
		this.fluasu_out = fluasu_out;
	}

	public String getPcr_flubli() {
		return pcr_flubli;
	}

	public void setPcr_flubli(String pcr_flubli) {
		this.pcr_flubli = pcr_flubli;
	}

	public String getFlubli_out() {
		return flubli_out;
	}

	public void setFlubli_out(String flubli_out) {
		this.flubli_out = flubli_out;
	}

	public String getPos_pcrout() {
		return pos_pcrout;
	}

	public void setPos_pcrout(String pos_pcrout) {
		this.pos_pcrout = pos_pcrout;
	}

	public String getPcr_sars2() {
		return pcr_sars2;
	}

	public void setPcr_sars2(String pcr_sars2) {
		this.pcr_sars2 = pcr_sars2;
	}

	public String getPcr_vsr() {
		return pcr_vsr;
	}

	public void setPcr_vsr(String pcr_vsr) {
		this.pcr_vsr = pcr_vsr;
	}

	public String getPcr_para1() {
		return pcr_para1;
	}

	public void setPcr_para1(String pcr_para1) {
		this.pcr_para1 = pcr_para1;
	}

	public String getPcr_para2() {
		return pcr_para2;
	}

	public void setPcr_para2(String pcr_para2) {
		this.pcr_para2 = pcr_para2;
	}

	public String getPcr_para3() {
		return pcr_para3;
	}

	public void setPcr_para3(String pcr_para3) {
		this.pcr_para3 = pcr_para3;
	}

	public String getPcr_para4() {
		return pcr_para4;
	}

	public void setPcr_para4(String pcr_para4) {
		this.pcr_para4 = pcr_para4;
	}

	public String getPcr_adeno() {
		return pcr_adeno;
	}

	public void setPcr_adeno(String pcr_adeno) {
		this.pcr_adeno = pcr_adeno;
	}

	public String getPcr_metap() {
		return pcr_metap;
	}

	public void setPcr_metap(String pcr_metap) {
		this.pcr_metap = pcr_metap;
	}

	public String getPcr_boca() {
		return pcr_boca;
	}

	public void setPcr_boca(String pcr_boca) {
		this.pcr_boca = pcr_boca;
	}

	public String getPcr_rino() {
		return pcr_rino;
	}

	public void setPcr_rino(String pcr_rino) {
		this.pcr_rino = pcr_rino;
	}

	public String getPcr_outro() {
		return pcr_outro;
	}

	public void setPcr_outro(String pcr_outro) {
		this.pcr_outro = pcr_outro;
	}

	public String getDs_pcr_out() {
		return ds_pcr_out;
	}

	public void setDs_pcr_out(String ds_pcr_out) {
		this.ds_pcr_out = ds_pcr_out;
	}

	public String getLab_pcr() {
		return lab_pcr;
	}

	public void setLab_pcr(String lab_pcr) {
		this.lab_pcr = lab_pcr;
	}

	public int getTp_am_sor() {
		return tp_am_sor;
	}

	public void setTp_am_sor(int tp_am_sor) {
		this.tp_am_sor = tp_am_sor;
	}

	public String getSor_out() {
		return sor_out;
	}

	public void setSor_out(String sor_out) {
		this.sor_out = sor_out;
	}

	public LocalDate getDt_co_sor() {
		return dt_co_sor;
	}

	public void setDt_co_sor(LocalDate dt_co_sor) {
		this.dt_co_sor = dt_co_sor;
	}

	public int getTp_sor() {
		return tp_sor;
	}

	public void setTp_sor(int tp_sor) {
		this.tp_sor = tp_sor;
	}

	public String getOut_sor() {
		return out_sor;
	}

	public void setOut_sor(String out_sor) {
		this.out_sor = out_sor;
	}

	public String getSor_out1() {
		return sor_out1;
	}

	public void setSor_out1(String sor_out1) {
		this.sor_out1 = sor_out1;
	}

	public String getRes_igg() {
		return res_igg;
	}

	public void setRes_igg(String res_igg) {
		this.res_igg = res_igg;
	}

	public String getRes_igm() {
		return res_igm;
	}

	public void setRes_igm(String res_igm) {
		this.res_igm = res_igm;
	}

	public String getRes_iga() {
		return res_iga;
	}

	public void setRes_iga(String res_iga) {
		this.res_iga = res_iga;
	}

	public LocalDate getDt_res() {
		return dt_res;
	}

	public void setDt_res(LocalDate dt_res) {
		this.dt_res = dt_res;
	}

	public String getClassi_fin() {
		return classi_fin;
	}

	public void setClassi_fin(String classi_fin) {
		this.classi_fin = classi_fin;
	}

	public String getClassi_out() {
		return classi_out;
	}

	public void setClassi_out(String classi_out) {
		this.classi_out = classi_out;
	}

	public String getCriterio() {
		return criterio;
	}

	public void setCriterio(String criterio) {
		this.criterio = criterio;
	}

	public String getEvolucao() {
		return evolucao;
	}

	public void setEvolucao(String evolucao) {
		this.evolucao = evolucao;
	}

	public LocalDate getDt_evoluca() {
		return dt_evoluca;
	}

	public void setDt_evoluca(LocalDate dt_evoluca) {
		this.dt_evoluca = dt_evoluca;
	}

	public LocalDate getDt_encerra() {
		return dt_encerra;
	}

	public void setDt_encerra(LocalDate dt_encerra) {
		this.dt_encerra = dt_encerra;
	}

	public String getNu_do() {
		return nu_do;
	}

	public void setNu_do(String nu_do) {
		this.nu_do = nu_do;
	}

	public String getObserva() {
		return observa;
	}

	public void setObserva(String observa) {
		this.observa = observa;
	}

	public String getNome_prof() {
		return nome_prof;
	}

	public void setNome_prof(String nome_prof) {
		this.nome_prof = nome_prof;
	}

	public String getReg_prof() {
		return reg_prof;
	}

	public void setReg_prof(String reg_prof) {
		this.reg_prof = reg_prof;
	}

	public LocalDate getDt_digita() {
		return dt_digita;
	}

	public void setDt_digita(LocalDate dt_digita) {
		this.dt_digita = dt_digita;
	}
	
}
