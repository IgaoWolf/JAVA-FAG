package br.fag.aula08;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Locale;

import jxl.Cell;
import jxl.JXLException;
import jxl.Sheet;
import jxl.Workbook;
import jxl.WorkbookSettings;
import jxl.read.biff.BiffException;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;

public class CódigoFinal {

	public static void main(String[] args) throws JXLException, IOException {
		PrimeiraEtapa();
	}

	private static void PrimeiraEtapa() throws JXLException {
		try {
			String nomeArquivo = "./src/arquivos/megasena.xls";
			FileInputStream f = new FileInputStream(nomeArquivo);
			Workbook w = Workbook.getWorkbook(f);
			Sheet s = w.getSheet(0);
			AcessandoPlanilha(s, w, f);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void AcessandoPlanilha(Sheet s, Workbook w, FileInputStream f) throws BiffException, IOException {
		File arquivoMegaSena = new File("./src/arquivos/megasena.xls");
		FileReader leituraMegaSena;
		leituraMegaSena = new FileReader(arquivoMegaSena);
		BufferedReader ler = new BufferedReader(leituraMegaSena);
		Cell celulaMS = s.getCell(2, 7);
		String valorMS = celulaMS.getContents();
		System.out.println(" " + valorMS + "   " + s.getCell(7, 7).getContents() + "  " + s.getCell(7, 2414).getContents() + "  ");
		int acontecendo[] = new int[61];
		for (int linhaPlanilha = 7; linhaPlanilha <= 2414; linhaPlanilha++) {
			for (int colunaPlanilha = 2; colunaPlanilha <= 7; colunaPlanilha++) {
				for (int i = 1; i <= 60; i++) {
					String testeMS = s.getCell(colunaPlanilha, linhaPlanilha).getContents();
					if (testeMS.equals("" + i)) {
						acontecendo[i] += 1;
					}
					System.out.println("O numero: " + i  + " repete nesta quantidade: " + acontecendo[i]);
				}
			}
		}
	}
	
}