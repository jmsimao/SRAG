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
	
	//private static String nomeArq = "C:\\Stage\\Srag22150822.xlsx";
	private static String nomeArq = "C:\\Stage\\Srag01.xlsx";
	
	public SragController() throws IOException {
		this.populaSrag();
	}
	
	private void populaSrag() throws IOException  {
		FileInputStream arquivo = new FileInputStream(new File(nomeArq));
		XSSFWorkbook workbook = new XSSFWorkbook(arquivo);
		XSSFSheet sheet = workbook.getSheetAt(1);
		
		for(Row r : sheet) {
			if (r.getRowNum() > 0) {
				srag.add(new Srag(r.getCell(0).getDateCellValue(),
						r.getCell(1).toString(),
						r.getCell(2).getDateCellValue()
						));
			}
		}
		
		
		arquivo.close();
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
