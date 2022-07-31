package lista03;

import java.util.*;

public class exercicio1 {
	public static void main(String[] args) {
		char sexo = 0, menorsalsexo = 0;
		int idade = 0, conth, contf200, maior, menor, menorsalidade = 0;
		double salario, ssalario = 0, menorsalario;
		Scanner dado = new Scanner(System.in);
		

		conth = 0;
		contf200 = 0;
		maior = 0;
		menor = 200;
		salario = 1;
		menorsalario = 9999;

		int masculino = 0;
		int feminino = 0;
		int masculinores = 0;
		int femininores = 0;

		while (salario > 0) {

			System.out.println("Qual a idade do entrevistado: ");
			idade = dado.nextInt();
			System.out.println("Sexo<M/F> (capslock ligado): ");
			sexo = dado.next().charAt(0);
			System.out.println("Salario: R$");
			salario = dado.nextDouble();

			if (salario > 0) {

				ssalario = ssalario + salario;
				conth = conth + 1;
			}
			if (idade > maior) {
				maior = idade;
			}
			if (idade < menor) {
				menor = idade;

			}
			if (sexo == 'M') {
				masculinores = masculino + 1;
			}
			if (sexo == 'F') {
				femininores = feminino + 1;
			}
			if (salario < menorsalario) {
				menorsalario = salario;
				menorsalidade = idade;
				menorsalsexo = sexo;
			}
			if (idade < 0) {
				System.out.println("fim programa");
				System.out.println("Media dos salarios do grupo: R$" + ssalario / conth);
				System.out.println("Menor idade: " + menor + " anos");
				System.out.println("Maior idade: " + maior + " anos");
				System.out.println("tem " + masculinores + " Homens e " + femininores + " Mulheres");
				System.out.println("A idade da pessoa e o sexo que possui o menor salário " + menorsalario + " foi da pessoa com idade " + menorsalidade + " do sexo " + menorsalsexo);
			}
		}
	}
}