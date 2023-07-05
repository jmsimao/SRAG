package br.com.srag.Srag.Model;

public class Srag {
	
	private Object dtNotific;
	private double semNot;
	private Object dtSinPri;
	private double semPri;
	private String sgUfNot;
	private String idRegiona; // 5
	private double coRegiona;
	private String idMunicip; // 7
	private double coMunNote;
	private String idUnidade;
	private double coUniNote;
	private String csSexo;
	private Object dtNasc;
	private double nuIdadeN;
	private double tpIdade;
	private double codIdade;
	private double csGestant;
	private double csRaca;
	private double csEscolN;
	private String idPais;
	private double coPais;
	private String sgUf;
	private String idRgResi;
	private double coRgResi;
	private String idMnResi;
	private double coMunRes;
	private double csZona;
	private String surtoSg;
	private double nosocomial;
	private double aveSuino;
	private double febre;
	private double tosse;
	private double garganta;
	private double dispneia;
	private double descResp;
	private double saturacao;
	private double diarreia;
	private double vomito;
	private double outroSin;
	private String outroDes;
	private double puerpera;
	private double fatorRisc;
	private double cardiopati;
	private double hematologi;
	private double sindDown;
	private double hepatica;
	private double asma;
	private double diabetes;
	private double neurologic;
	private double pneumopati;
	private double imunodepre;
	private double renal;
	private double obsidade;
	private double obesImc;
	private double outMorbi;
	private String morbiDesc;
	private double vacina;
	private Object dtUtDose;
	private double maeVac;
	private Object dtVacMae;
	private double maeAmamenta;
	private Object dtDoseUni;
	private Object dt1Dose;
	private Object dt2Dose;
	private double antiviral;
	private double tpAntivir;
	private String outAntiv;
	private Object dtAntivir;
	private double hospital;
	private Object dtInterna;
	private String sgUfInte;
	private String idRgInte;
	private double coRgInte;
	private String idMnInte;
	private double coMuInte; //BW
	private double uti;
	private Object dtEntUti;
	private Object dtSaidaUti;
	private double suportVen;
	private double raioXRes;
	private String raioXOut;
	private Object dtRaioX; //CD
	private double amostra;
	private Object dtColeta;
	private double tpAmostra;
	private String outAmost; //CH
	private double pcrResul;
	private Object dtPcr;
	private double posPcrFlu;
	private double tpFluPcr;
	private double pcrFluAsu;
	private String fluAsuOut;
	private double pcrFluBli;
	private String fluBliOut;
	private double posPcrOut; //CQ
	private double pcrVsr;
	private double pcrPara1;
	private double pcrPara2;
	private double pcrPara3;
	private double pcrPara4;
	private double pcrAdeno;
	private double pcrMetap;
	private double pcrBoca;
	private double pcrRino;
	private double pcrOutro;
	private String dsPcrOut; //DB
	private double classiFin;
	private String classiOut;
	private double criterio;
	private double evolucao; //DF
	private Object dtEvoluca;
	private Object dtEncerra;
	private Object dtDigita; //DI
	// *VGM // DJ-DO
	private double pcrSars2; //DP
	private String pacCocBo;
	private String pacDscBo; //DR
	private String outAnim;
	private double dorAbd;
	private double fadiga;
	private double perdOlft;
	private double perdPala;
	private double tomoRes;
	private String tomoOut;
	private Object dtTomo;
	private double tpTesAn;
	private Object dtResAn;
	private double resAn;
	private double posAnFlu;
	private double tpFluAn; //EE
	private double posAnOut;
	private double anSars2;
	private double anVsr;
	private double anPara1;
	private double anPara2;
	private double anPara3;
	private double anAdeno;
	private double anOutro;
	private String dsAnOut; //EN
	private double tpAmSor;
	private String sorOut;
	private Object dtCoSor;
	private double tpSor;
	private String outSor; //ES
	private Object dtRes;
	private double resIgg;
	private double resIgm;
	private double resIga;
	private double estrang;
	private double vacinaCov;
	private Object dose1Cov;
	private Object dose2Cov;
	private Object doseRef;
	private String fabCov1;
	private String fabCov2;
	private String fabCovRef;
	private String loteRef; //EF
	
	private String lote1Cov;
	private String lote2Cov;
	private double fntInCov; //fJ
	
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
		this.dtNotific = dt_notific;
		this.semNot = sem_not;
		this.dtSinPri = dt_sin_pri;
		this.semPri = sem_pri;
		this.sgUfNot = sg_uf_not;
		this.idRegiona = id_regiona;
		this.coRegiona = co_regiona; 
		this.idMunicip = id_municip;
		this.coMunNote = co_mun_note;
		this.idUnidade = id_unidade;
		this.coUniNote = co_uni_note;
		this.csSexo = cs_sexo;
		this.dtNasc = dt_nasc;
		this.nuIdadeN = nu_idade_n;
		this.tpIdade = tp_idade;
		this.codIdade = cod_idade;
		this.csGestant = cs_gestant;
		this.csRaca = cs_raca;
		this.csEscolN = cs_escol_n;
		this.idPais = id_pais;
		this.coPais = co_pais;
		this.sgUf = sg_uf;
		this.idRgResi = id_rg_resi;
		this.coRgResi = co_rg_resi;
		this.idMnResi = id_mn_resi;
		this.coMunRes = co_mun_res;
		this.csZona = cs_zona;
		this.surtoSg = surto_sg;
		this.nosocomial = nosocomial;
		this.aveSuino = ave_suino;
		this.febre = febre;
		this.tosse = tosse;
		this.garganta = garganta;
		this.dispneia = dispneia;
		this.descResp = desc_resp;
		this.saturacao = saturacao;
		this.diarreia = diarreia;
		this.vomito = vomito;
		this.outroSin = outro_sin;
		this.outroDes = outro_des;
		this.puerpera = puerpera;
		this.fatorRisc = fator_risc;
		this.cardiopati = cardiopati;
		this.hematologi = hematologi;
		this.sindDown = sind_down;
		this.hepatica = hepatica;
		this.asma = asma;
		this.diabetes = diabetes;
		this.neurologic = neurologic;
		this.pneumopati = pneumopati;
		this.imunodepre = imunodepre;
		this.renal = renal;
		this.obsidade = obsidade;
		this.obesImc = obes_imc;
		this.outMorbi = out_morbi;
		this.morbiDesc = morbi_desc;
		this.vacina = vacina;
		this.dtUtDose = dt_ut_dose;
		this.maeVac = mae_vac;
		this.dtVacMae = dt_vac_mae;
		this.maeAmamenta = mae_amamenta;
		this.dtDoseUni = dt_doseuni;
		this.dt1Dose = dt_1_dose;
		this.dt2Dose = dt_2_dose;
		this.antiviral = antiviral;
		this.tpAntivir = tp_antivir;
		this.outAntiv = out_antiv;
		this.dtAntivir = dt_antivir;
		this.hospital = hospital;
		this.dtInterna = dt_interna;
		this.sgUfInte = sg_uf_inte;
		this.idRgInte = id_rg_inte;
		this.coRgInte = co_rg_inte;
		this.idMnInte = id_mn_inte;
		this.coMuInte = co_mu_inte;
		this.uti = uti;
		this.dtEntUti = dt_entuti;
		this.dtSaidaUti = dt_saidauti;
		this.suportVen = suport_ven;
		this.raioXRes = raiox_res;
		this.raioXOut = raiox_out;
		this.dtRaioX = dt_raiox;
		this.amostra = amostra;
		this.dtColeta = dt_coleta;
		this.tpAmostra = tp_amostra;
		this.outAmost = out_amost;
		this.pcrResul = pcr_resul;
		this.dtPcr = dt_pcr;
		this.posPcrFlu = pos_pcrflu;
		this.tpFluPcr = tp_flu_pcr;
		this.pcrFluAsu = pcr_fluasu;
		this.fluAsuOut = fluasu_out;
		this.pcrFluBli = pcr_flubli;
		this.fluBliOut = flubli_out;
		this.posPcrOut = pos_pcrout; 
		this.pcrVsr = pcr_vsr;
		this.pcrPara1 = pcr_para1;
		this.pcrPara2 = pcr_para2;
		this.pcrPara3 = pcr_para3;
		this.pcrPara4 = pcr_para4;
		this.pcrAdeno = pcr_adeno;
		this.pcrMetap = pcr_metap;
		this.pcrBoca = pcr_boca;
		this.pcrRino = pcr_rino;
		this.pcrOutro = pcr_outro;
		this.dsPcrOut = ds_pcr_out;
		this.classiFin = classi_fin;
		this.classiOut = classi_out;
		this.criterio = criterio;
		this.evolucao = evolucao;
		this.dtEvoluca = dt_evoluca;
		this.dtEncerra = dt_encerra;
		this.dtDigita = dt_digita;
		// *VGM // DJ-DO
		this.pcrSars2 = pcr_sars2;
		this.pacCocBo = pac_cocbo;
		this.pacDscBo = pac_dscbo;
		this.outAnim = out_anim;
		this.dorAbd = dor_abd;
		this.fadiga = fadiga;
		this.perdOlft = perd_olft;
		this.perdPala = perd_pala;
		this.tomoRes = tomo_res;
		this.tomoOut = tomo_out;
		this.dtTomo = dt_tomo;
		this.tpTesAn = tp_tes_an;
		this.dtResAn = dt_res_an;
		this.resAn = res_an;
		this.posAnFlu = pos_an_flu;
		this.tpFluAn = tp_flu_an;
		this.posAnOut = pos_an_out;
		this.anSars2 = an_sars2;
		this.anVsr = an_vsr;
		this.anPara1 = an_para1;
		this.anPara2 = an_para2;
		this.anPara3 = an_para3;
		this.anAdeno = an_adeno;
		this.anOutro = an_outro;
		this.dsAnOut = ds_an_out;
		this.tpAmSor = tp_am_sor;
		this.sorOut = sor_out;
		this.dtCoSor = dt_co_sor;
		this.tpSor = tp_sor;
		this.outSor = out_sor;
		this.dtRes = dt_res;
		this.resIgg = res_igg;
		this.resIgm = res_igm;
		this.resIga = res_iga;
		this.estrang = estrang;
		this.vacinaCov = vacina_cov;
		this.dose1Cov = dose_1_cov;
		this.dose2Cov = dose_2_cov;
		this.doseRef = dose_ref;
		this.fabCov1 = fab_cov1;
		this.fabCov2 = fab_cov2;
		this.fabCovRef = fab_covref;
		this.loteRef = lote_ref;
	}
	
	public Srag(
				String lab_pr_cov
				,String lote_1_cov
				,String lote_2_cov
				,double fnt_in_cov
				) 
	{
		this.labPrCov = lab_pr_cov;
		this.lote1Cov = lote_1_cov;
		this.lote2Cov = lote_2_cov;
		this.fntInCov = fnt_in_cov;
	}

	// Getters...

	public Object getDtNotific() {
		return dtNotific;
	}

	public double getSemNot() {
		return semNot;
	}

	public Object getDtSinPri() {
		return dtSinPri;
	}

	public double getSemPri() {
		return semPri;
	}

	public String getSgUfNot() {
		return sgUfNot;
	}

	public String getIdRegiona() {
		return idRegiona;
	}

	public double getCoRegiona() {
		return coRegiona;
	}

	public String getIdMunicip() {
		return idMunicip;
	}

	public double getCoMunNote() {
		return coMunNote;
	}

	public String getIdUnidade() {
		return idUnidade;
	}

	public double getCoUniNote() {
		return coUniNote;
	}

	public String getCsSexo() {
		return csSexo;
	}

	public Object getDtNasc() {
		return dtNasc;
	}

	public double getNuIdadeN() {
		return nuIdadeN;
	}

	public double getTpIdade() {
		return tpIdade;
	}

	public double getCodIdade() {
		return codIdade;
	}

	public double getCsGestant() {
		return csGestant;
	}

	public double getCsRaca() {
		return csRaca;
	}

	public double getCsEscolN() {
		return csEscolN;
	}

	public String getIdPais() {
		return idPais;
	}

	public double getCoPais() {
		return coPais;
	}

	public String getSgUf() {
		return sgUf;
	}

	public String getIdRgResi() {
		return idRgResi;
	}

	public double getCoRgResi() {
		return coRgResi;
	}

	public String getIdMnResi() {
		return idMnResi;
	}

	public double getCoMunRes() {
		return coMunRes;
	}

	public double getCsZona() {
		return csZona;
	}

	public String getSurtoSg() {
		return surtoSg;
	}

	public double getNosocomial() {
		return nosocomial;
	}

	public double getAveSuino() {
		return aveSuino;
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

	public double getDescResp() {
		return descResp;
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

	public double getOutroSin() {
		return outroSin;
	}

	public String getOutroDes() {
		return outroDes;
	}

	public double getPuerpera() {
		return puerpera;
	}

	public double getFatorRisc() {
		return fatorRisc;
	}

	public double getCardiopati() {
		return cardiopati;
	}

	public double getHematologi() {
		return hematologi;
	}

	public double getSindDown() {
		return sindDown;
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

	public double getObesImc() {
		return obesImc;
	}

	public double getOutMorbi() {
		return outMorbi;
	}

	public String getMorbiDesc() {
		return morbiDesc;
	}

	public double getVacina() {
		return vacina;
	}

	public Object getDtUtDose() {
		return dtUtDose;
	}

	public double getMaeVac() {
		return maeVac;
	}

	public Object getDtVacMae() {
		return dtVacMae;
	}

	public double getMaeAmamenta() {
		return maeAmamenta;
	}

	public Object getDtDoseUni() {
		return dtDoseUni;
	}

	public Object getDt1Dose() {
		return dt1Dose;
	}

	public Object getDt2Dose() {
		return dt2Dose;
	}

	public double getAntiviral() {
		return antiviral;
	}

	public double getTpAntivir() {
		return tpAntivir;
	}

	public String getOutAntiv() {
		return outAntiv;
	}

	public Object getDtAntivir() {
		return dtAntivir;
	}

	public double getHospital() {
		return hospital;
	}

	public Object getDtInterna() {
		return dtInterna;
	}

	public String getSgUfInte() {
		return sgUfInte;
	}

	public String getIdRgInte() {
		return idRgInte;
	}

	public double getCoRgInte() {
		return coRgInte;
	}

	public String getIdMnInte() {
		return idMnInte;
	}

	public double getCoMuInte() {
		return coMuInte;
	}

	public double getUti() {
		return uti;
	}

	public Object getDtEntUti() {
		return dtEntUti;
	}

	public Object getDtSaidaUti() {
		return dtSaidaUti;
	}

	public double getSuportVen() {
		return suportVen;
	}

	public double getRaioXRes() {
		return raioXRes;
	}

	public String getRaioXOut() {
		return raioXOut;
	}

	public Object getDtRaioX() {
		return dtRaioX;
	}

	public double getAmostra() {
		return amostra;
	}

	public Object getDtColeta() {
		return dtColeta;
	}

	public double getTpAmostra() {
		return tpAmostra;
	}

	public String getOutAmost() {
		return outAmost;
	}

	public double getPcrResul() {
		return pcrResul;
	}

	public Object getDtPcr() {
		return dtPcr;
	}

	public double getPosPcrFlu() {
		return posPcrFlu;
	}

	public double getTpFluPcr() {
		return tpFluPcr;
	}

	public double getPcrFluAsu() {
		return pcrFluAsu;
	}

	public String getFluAsuOut() {
		return fluAsuOut;
	}

	public double getPcrFluBli() {
		return pcrFluBli;
	}

	public String getFluBliOut() {
		return fluBliOut;
	}

	public double getPosPcrOut() {
		return posPcrOut;
	}

	public double getPcrVsr() {
		return pcrVsr;
	}

	public double getPcrPara1() {
		return pcrPara1;
	}

	public double getPcrPara2() {
		return pcrPara2;
	}

	public double getPcrPara3() {
		return pcrPara3;
	}

	public double getPcrPara4() {
		return pcrPara4;
	}

	public double getPcrAdeno() {
		return pcrAdeno;
	}

	public double getPcrMetap() {
		return pcrMetap;
	}

	public double getPcrBoca() {
		return pcrBoca;
	}

	public double getPcrRino() {
		return pcrRino;
	}

	public double getPcrOutro() {
		return pcrOutro;
	}

	public String getDsPcrOut() {
		return dsPcrOut;
	}

	public double getClassiFin() {
		return classiFin;
	}

	public String getClassiOut() {
		return classiOut;
	}

	public double getCriterio() {
		return criterio;
	}

	public double getEvolucao() {
		return evolucao;
	}

	public Object getDtEvoluca() {
		return dtEvoluca;
	}

	public Object getDtEncerra() {
		return dtEncerra;
	}

	public Object getDtDigita() {
		return dtDigita;
	}

	public double getPcrSars2() {
		return pcrSars2;
	}

	public String getPacCocBo() {
		return pacCocBo;
	}

	public String getPacDscBo() {
		return pacDscBo;
	}

	public String getOutAnim() {
		return outAnim;
	}

	public double getDorAbd() {
		return dorAbd;
	}

	public double getFadiga() {
		return fadiga;
	}

	public double getPerdOlft() {
		return perdOlft;
	}

	public double getPerdPala() {
		return perdPala;
	}

	public double getTomoRes() {
		return tomoRes;
	}

	public String getTomoOut() {
		return tomoOut;
	}

	public Object getDtTomo() {
		return dtTomo;
	}

	public double getTpTesAn() {
		return tpTesAn;
	}

	public Object getDtResAn() {
		return dtResAn;
	}

	public double getResAn() {
		return resAn;
	}

	public double getPosAnFlu() {
		return posAnFlu;
	}

	public double getTpFluAn() {
		return tpFluAn;
	}

	public double getPosAnOut() {
		return posAnOut;
	}

	public double getAnSars2() {
		return anSars2;
	}

	public double getAnVsr() {
		return anVsr;
	}

	public double getAnPara1() {
		return anPara1;
	}

	public double getAnPara2() {
		return anPara2;
	}

	public double getAnPara3() {
		return anPara3;
	}

	public double getAnAdeno() {
		return anAdeno;
	}

	public double getAnOutro() {
		return anOutro;
	}

	public String getDsAnOut() {
		return dsAnOut;
	}

	public double getTpAmSor() {
		return tpAmSor;
	}

	public String getSorOut() {
		return sorOut;
	}

	public Object getDtCoSor() {
		return dtCoSor;
	}

	public double getTpSor() {
		return tpSor;
	}

	public String getOutSor() {
		return outSor;
	}

	public Object getDtRes() {
		return dtRes;
	}

	public double getResIgg() {
		return resIgg;
	}

	public double getResIgm() {
		return resIgm;
	}

	public double getResIga() {
		return resIga;
	}

	public double getEstrang() {
		return estrang;
	}

	public double getVacinaCov() {
		return vacinaCov;
	}

	public Object getDose1Cov() {
		return dose1Cov;
	}

	public Object getDose2Cov() {
		return dose2Cov;
	}

	public Object getDoseRef() {
		return doseRef;
	}

	public String getFabCov1() {
		return fabCov1;
	}

	public String getFabCov2() {
		return fabCov2;
	}

	public String getFabCovRef() {
		return fabCovRef;
	}

	public String getLoteRef() {
		return loteRef;
	}

	public String getLabPrCov() {
		return labPrCov;
	}

	public String getLote1Cov() {
		return lote1Cov;
	}

	public String getLote2Cov() {
		return lote2Cov;
	}

	public double getFntInCov() {
		return fntInCov;
	}

	private String labPrCov;
	public void setLabPrCov(String labPrCov) {
		this.labPrCov = labPrCov;
	}

	public void setLote1Cov(String lote1Cov) {
		this.lote1Cov = lote1Cov;
	}

	public void setLote2Cov(String lote2Cov) {
		this.lote2Cov = lote2Cov;
	}

	public void setFntInCov(double fntInCov) {
		this.fntInCov = fntInCov;
	}


}
