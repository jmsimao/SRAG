package br.com.srag.Srag.Controller;

import java.util.ArrayList;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.srag.Srag.Model.Srag;
import jxl.write.DateTime;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Date;
import java.io.File;



@RestController
@RequestMapping("/srag")
public class SragController {

	private List<Srag> srag = new ArrayList<>();
	
	private static String nomeArq = "C:\\Stage\\INFLUD22-15-08-2022-2.xlsx";
	private final String workSheet = "Teste";
	//private static String nomeArq = "C:\\Stage\\Srag01.xlsx";
	
	public SragController() throws IOException {
		this.populaSrag();
	}
	
	private void populaSrag() throws IOException  {
		FileInputStream arquivo = new FileInputStream(new File(nomeArq));
		XSSFWorkbook workbook = new XSSFWorkbook(arquivo);
		XSSFSheet sheet = workbook.getSheet(this.workSheet);
		
		for(Row r : sheet) {
			if (r.getRowNum() > 0) {
				String id_regiona = "Nulo";
				double co_regiona = -1;
				double cs_escol_n = -1;
				String sg_uf = "Nulo";
				String id_rg_resi = "Nulo";
				double co_rg_resi = -1;
				String id_mn_resi = "Nulo";
				double co_mun_res = -1;
				double cs_zona = -1;
				String surto_sg = "Nulo";
				double nosocomial = -1;
				double ave_suino = -1;
				double febre = -1;
				double tosse = -1;
				double garganta = -1;
				double dispneia = -1;
				double desc_resp = -1;
				double saturacao = -1;
				double diarreia = -1;
				double vomito = -1;
				double outro_sin = -1;
				String outro_des = "Nulo";
				double puerpera = -1;
				double fator_risc = -1;
				double cardiopati = -1;
				double hematologi = -1;
				double sind_down = -1;
				double hepatica = -1;
				double asma = -1;
				double diabetes = -1;
				double neurologic = -1;
				double pneumopati = -1;
				double imunodepre = -1;
				double renal = -1;
				double obsidade = -1;
				double obes_imc = -1;
				double out_morbi = -1;
				String morbi_desc = "Nulo";
				double vacina = -1;
				Object dt_ut_dose = "Nulo";
				double mae_vac = -1;
				Object dt_vac_mae = "Nulo";
				double mae_amamenta = -1;
				Object dt_doseuni = "Nulo";
				Object dt_1_dose = "Nulo";
				Object dt_2_dose = "Nulo";
				double antiviral = -1;
				double tp_antivir = -1;
				String out_antiv = "Nulo";
				Object dt_antivir = "Nulo";
				double hospital = -1;
				Object dt_interna = "Nulo";
				String sg_uf_inte = "Nulo";
				String id_rg_inte = "Nulo";
				double co_rg_inte = -1;
				String id_mn_inte = "Nulo";
				double co_mu_inte = -1;
				double uti = -1;
				Object dt_entuti = "Nulo";
				Object dt_saidauti = "Nulo";
				double suport_ven = -1;
				double raiox_res = -1;
				String raiox_out = "Nulo";
				Object dt_raiox = "Nulo";
				double amostra = -1;
				Object dt_coleta = "Nulo";
				double tp_amostra = -1;
				String out_amost = "Nulo";
				
				//
				try {
					if (r.getCell(5) != null) { id_regiona = r.getCell(5).toString(); }
					if (r.getCell(6) != null) { co_regiona = r.getCell(6).getNumericCellValue(); }
					if (r.getCell(18) != null) { cs_escol_n = r.getCell(18).getNumericCellValue(); }
					if (r.getCell(21) != null) { sg_uf = r.getCell(21).toString(); }	
					if (r.getCell(22) != null) { id_regiona = r.getCell(22).toString(); }
					if (r.getCell(23) != null) { co_rg_resi = r.getCell(23).getNumericCellValue(); }
					if (r.getCell(24) != null) { id_mn_resi = r.getCell(24).toString(); }
					if (r.getCell(25) != null) { co_mun_res = r.getCell(25).getNumericCellValue(); }
					if (r.getCell(26) != null) { cs_zona = r.getCell(26).getNumericCellValue(); }
					if (r.getCell(27) != null) { surto_sg = r.getCell(27).toString(); }
					if (r.getCell(28) != null) { nosocomial = r.getCell(28).getNumericCellValue();; }
					if (r.getCell(29) != null) { ave_suino = r.getCell(29).getNumericCellValue();; }
					if (r.getCell(30) != null) { febre = r.getCell(30).getNumericCellValue();; }
					if (r.getCell(31) != null) { tosse = r.getCell(31).getNumericCellValue();; }
					if (r.getCell(32) != null) { garganta = r.getCell(32).getNumericCellValue();; }
					if (r.getCell(33) != null) { dispneia = r.getCell(33).getNumericCellValue();; }
					if (r.getCell(34) != null) { desc_resp = r.getCell(34).getNumericCellValue();; }
					if (r.getCell(35) != null) { saturacao = r.getCell(35).getNumericCellValue();; }
					if (r.getCell(36) != null) { diarreia = r.getCell(36).getNumericCellValue();; }
					if (r.getCell(37) != null) { vomito = r.getCell(37).getNumericCellValue();; }
					if (r.getCell(38) != null) { outro_sin = r.getCell(38).getNumericCellValue();; }
					if (r.getCell(39) != null) { outro_des = r.getCell(39).toString(); }
					if (r.getCell(40) != null) { puerpera = r.getCell(40).getNumericCellValue();; }
					if (r.getCell(41) != null) { fator_risc = r.getCell(41).getNumericCellValue();; }
					if (r.getCell(42) != null) { cardiopati = r.getCell(42).getNumericCellValue();; }
					if (r.getCell(43) != null) { hematologi  = r.getCell(43).getNumericCellValue();; }
					if (r.getCell(44) != null) { sind_down = r.getCell(44).getNumericCellValue();; }
					if (r.getCell(45) != null) { hepatica = r.getCell(45).getNumericCellValue();; }
					if (r.getCell(46) != null) { asma = r.getCell(46).getNumericCellValue();; }
					if (r.getCell(47) != null) { diabetes = r.getCell(47).getNumericCellValue();; }
					if (r.getCell(48) != null) { neurologic = r.getCell(48).getNumericCellValue();; }
					if (r.getCell(49) != null) { pneumopati = r.getCell(49).getNumericCellValue();; }
					if (r.getCell(50) != null) { imunodepre = r.getCell(50).getNumericCellValue();; }
					if (r.getCell(51) != null) { renal = r.getCell(51).getNumericCellValue();; }
					if (r.getCell(52) != null) { obsidade = r.getCell(52).getNumericCellValue();; }
					if (r.getCell(53) != null) { obes_imc = r.getCell(53).getNumericCellValue();; }
					if (r.getCell(54) != null) { out_morbi = r.getCell(54).getNumericCellValue();; }
					if (r.getCell(55) != null) { morbi_desc = r.getCell(55).toString(); }
					if (r.getCell(56) != null) { vacina = r.getCell(56).getNumericCellValue(); }
					if (r.getCell(57) != null) { dt_ut_dose = r.getCell(57).getLocalDateTimeCellValue(); }
					if (r.getCell(58) != null) { mae_vac = r.getCell(58).getNumericCellValue(); }
					if (r.getCell(59) != null) { dt_vac_mae = r.getCell(59).getLocalDateTimeCellValue(); }
					if (r.getCell(60) != null) { mae_amamenta = r.getCell(60).getNumericCellValue(); }
					if (r.getCell(61) != null) { dt_doseuni = r.getCell(61).getLocalDateTimeCellValue(); }
					if (r.getCell(62) != null) { dt_1_dose = r.getCell(62).getLocalDateTimeCellValue(); }
					if (r.getCell(63) != null) { dt_2_dose = r.getCell(63).getLocalDateTimeCellValue(); }
					if (r.getCell(64) != null) { antiviral = r.getCell(64).getNumericCellValue(); }
					if (r.getCell(65) != null) { tp_antivir = r.getCell(65).getNumericCellValue(); }
					if (r.getCell(66) != null) { out_antiv = r.getCell(66).toString(); }
					if (r.getCell(67) != null) { dt_antivir = r.getCell(67).getLocalDateTimeCellValue(); }
					if (r.getCell(68) != null) { hospital = r.getCell(68).getNumericCellValue(); }
					if (r.getCell(69) != null) { dt_interna = r.getCell(69).getLocalDateTimeCellValue(); }
					if (r.getCell(70) != null) { sg_uf_inte = r.getCell(70).toString(); }
					if (r.getCell(71) != null) { id_rg_inte = r.getCell(71).toString(); }
					if (r.getCell(72) != null) { co_rg_inte = r.getCell(72).getNumericCellValue(); }
					if (r.getCell(73) != null) { id_mn_inte = r.getCell(73).toString(); }
					if (r.getCell(74) != null) { co_mu_inte = r.getCell(74).getNumericCellValue(); }
					if (r.getCell(75) != null) { uti = r.getCell(75).getNumericCellValue(); }
					if (r.getCell(76) != null) { dt_entuti = r.getCell(76).getDateCellValue(); }
					if (r.getCell(77) != null) { dt_saidauti = r.getCell(77).getDateCellValue(); }
					if (r.getCell(78) != null) { suport_ven = r.getCell(78).getNumericCellValue(); }
					if (r.getCell(79) != null) { raiox_res = r.getCell(79).getNumericCellValue(); }
					if (r.getCell(80) != null) { raiox_out = r.getCell(80).toString(); }
					if (r.getCell(81) != null) { dt_raiox = r.getCell(81).getDateCellValue(); }
					if (r.getCell(82) != null) { amostra = r.getCell(82).getNumericCellValue(); }
					if (r.getCell(83) != null) { dt_coleta = r.getCell(83).getDateCellValue(); }
					if (r.getCell(84) != null) { tp_amostra = r.getCell(84).getNumericCellValue(); }
					if (r.getCell(85) != null) { out_amost = r.getCell(85).toString(); }

					
				
					/* */
					srag.add(new Srag(
							r.getCell(0).getDateCellValue()
							,r.getCell(1).getNumericCellValue()
							,r.getCell(2).getDateCellValue()
							,r.getCell(3).getNumericCellValue()
							,r.getCell(4).getStringCellValue()
							,id_regiona
							,co_regiona
							,r.getCell(7).getStringCellValue()
							,r.getCell(8).getNumericCellValue()
							,r.getCell(9).getStringCellValue()
							,r.getCell(10).getNumericCellValue()
							,r.getCell(11).getStringCellValue()
							,r.getCell(12).getDateCellValue()
							,r.getCell(13).getNumericCellValue()
							,r.getCell(14).getNumericCellValue()
							,r.getCell(15).getNumericCellValue()
							,r.getCell(16).getNumericCellValue()
							,r.getCell(17).getNumericCellValue()
							,cs_escol_n
							,r.getCell(19).getStringCellValue()
							,r.getCell(20).getNumericCellValue()
							,sg_uf
							,id_rg_resi
							,co_rg_resi
							,id_mn_resi
							,co_mun_res
							,cs_zona
							,surto_sg
							,nosocomial
							,ave_suino
							,febre
							,tosse
							,garganta
							,dispneia
							,desc_resp
							,saturacao
							,diarreia
							,vomito
							,outro_sin
							,outro_des
							,puerpera
							,fator_risc 
							,cardiopati
							,hematologi
							,sind_down 
							,hepatica 
							,asma
							,diabetes 
							,neurologic
							,pneumopati 
							,imunodepre
							,renal
							,obsidade 
							,obes_imc
							,out_morbi
							,morbi_desc
							,vacina
							,dt_ut_dose
							,mae_vac
							,dt_vac_mae
							,mae_amamenta
							,dt_doseuni
							,dt_1_dose
							,dt_2_dose
							,antiviral
							,tp_antivir
							,out_antiv
							,dt_antivir
							,hospital
							,dt_interna
							,sg_uf_inte
							,id_rg_inte
							,co_rg_inte
							,id_mn_inte
							,co_mu_inte
							,uti
							,dt_entuti
							,dt_saidauti
							,suport_ven
							,raiox_res
							,raiox_out
							,dt_raiox
							,amostra
							,dt_coleta
							,tp_amostra
							,out_amost
							
							/* */
							));
				}
				catch (Error e) {
					System.err.print(e);
				}
				
				if (r.getRowNum() > 5000) {
					arquivo.close();
					break;
				}
		
			}
		}
		
		
		
	}
	
	
	//
	@GetMapping
	public String getSarg() {
		return "Projeto de Casos de Sindrome Respiratória Aguda Grave (SARG) \r\n"
				+ "					Hospitalizados for Spring Boot!";
	}
	
	@GetMapping("/data")
	public Iterable<Srag> getData() {
		return srag;
	}
		
}
