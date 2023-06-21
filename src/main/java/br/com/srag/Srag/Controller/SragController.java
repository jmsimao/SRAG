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

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
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
					
					//
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
