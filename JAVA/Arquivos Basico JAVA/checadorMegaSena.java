package packageTrabalho;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.Scanner;

//botão direito do mouse no projeto,
//properties,
//java build path,
//libraries,
//add jars,
//escolhe a pasta onde está,
//seleciona a lib
//e voilá

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class checadorMegaSena {
	static Scanner meuScanner = new Scanner(System.in);

	public static void main(String[] args) {
		String[] Nqfg = NumbersAleatorios();
		try {
			lerPlanilha(Nqfg);
		} catch (Exception NullPoiExc) {
			System.out.println("Houve um erro, por favor execute novamente!.");
		}
		String[] NumbersInserted = PedirProUser();
		lerPlanilha(NumbersInserted);
	}

	private static String[] PedirProUser() {
		String[] numerosInseridos = new String[6];
		for (int i = 0; i < numerosInseridos.length; i++) {
			System.out.println("Escreva um valor numérico entre 1 e 60");
			int EntradaAtual = meuScanner.nextInt();
			if (EntradaAtual > 60 || EntradaAtual <= 0) {
				System.out.println("Por favor escreva um numero entre 1 e 60!");
				PedirProUser();
				return null;
			} else {
				numerosInseridos[i] = "" + EntradaAtual;
			}
		}
		for (int i = 0; i < numerosInseridos.length; i++) {
			for (int j = 0; j < numerosInseridos.length; j++) {
				if (i != j) {
					if (numerosInseridos[i].equals(numerosInseridos[j])) {
						System.out.println("Por favor insira numeros diferentes!");
						PedirProUser();
						return null;
					}
				}
			}
		}
		for (int i = 0; i < numerosInseridos.length; i++) {
		}
		return numerosInseridos;
	}

	private static String[] NumbersAleatorios() {
		String ale[] = new String[6];
		for (int i = 0; i < ale.length; i++) {
			int doYort = 1 + (int) (Math.random() * 60);
			ale[i] = "" + doYort;

		}
		for (int x = 0; x < ale.length; x++) {
			for (int j = 0; j < ale.length; j++) {
				if (x != j) {
					if (ale[x].equals(ale[j])) {
						NumbersAleatorios();
						return null;
					}
				}
			}
		}
		for (int x = 0; x < ale.length; x++) {
			System.out.print(" " + ale[x] + " ");
		}
		System.out.println("");
		System.out.println("Testando valores gerados aleatóriamente..");
		return ale;
	}

	private static void lerPlanilha(String[] osNumerosQueForamGerados) {
		String dds[][] = new String[2415][8];
		try {
			Workbook workbook = Workbook.getWorkbook(new File("./Material/megasena.xls"));
			Sheet sheet = workbook.getSheet(0);
			File File = new File("./Material/megasena.xls");
			FileReader Reading;
			Reading = new FileReader(File);
			BufferedReader ler = new BufferedReader(Reading);
			for (int linha = 7; linha < 2415; linha++) {
				for (int coluna = 0; coluna < 8; coluna++) {
					Cell celula = sheet.getCell(coluna, linha);
					String Vlr = celula.getContents();
					dds[linha][coluna] = Vlr;
				}
			}
			ChecarNaPll(dds, osNumerosQueForamGerados);
			workbook.close();
			ler.close();

		} catch (IOException e) {
			e.printStackTrace();
		} catch (BiffException e) {
			e.printStackTrace();
		}
	}

	private static void ChecarNaPll(String[][] pllEmMatriz, String[] NumbersToSearch) {
		int contCont = 0;
		boolean[] LinesWhereFound = new boolean[2415];
		for (int i = 0; i < LinesWhereFound.length; i++) {
			LinesWhereFound[i] = false;
		}
		for (int linha = 7; linha < pllEmMatriz.length; linha++) {
			if (contCont == 6) {
				System.out.println("Encontrado na linha " + (linha));
				LinesWhereFound[linha] = true;
				contCont = 0;
			}
			contCont = 0;
			for (int coluna = 2; coluna < pllEmMatriz[linha].length; coluna++) {

				for (int i = 0; i < NumbersToSearch.length; i++) {
					String valorAtualPlanilha = pllEmMatriz[linha][coluna];
					String valorRandomAtual = NumbersToSearch[i];
					if (NumbersToSearch[i].equals(pllEmMatriz[linha][coluna])) {
						contCont++;
					}
				}
			}

		}
		boolean EleniltonDelicia = false;
		for (int i = 0; i < LinesWhereFound.length; i++) {

			if (LinesWhereFound[i]) {
				System.out.println("Foi encontrado esse resultado no sorteio " + pllEmMatriz[i - 1][0] + " de data "
						+ pllEmMatriz[i - 1][1]);
				EleniltonDelicia = true;
			}
			if (i == 2414) {
				if (EleniltonDelicia == false) {
					System.out.println("Não foi encontrado essa cartela na mega sena!");
				}
			}
		}
	}
}