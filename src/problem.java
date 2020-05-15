import java.util.Locale;
import java.util.Scanner;

public class problem {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		double salario, salarioanual, servi�os, capital, medicos, educacionais, impostosalario=0, impostoservi�os=0, impostocapital=0, maxdedutivel=0, gastosdedutiveis=0;
		
		System.out.println("Renda anual com sal�rio: ");
		salarioanual = sc.nextDouble();
		System.out.println("Renda anual com presta��o de servi�o: ");
		servi�os = sc.nextDouble();
		System.out.println("Renda anual com ganho de capital: ");
		capital = sc.nextDouble();
		System.out.println("Gastos m�dicos: ");
		medicos = sc.nextDouble();
		System.out.println("Gastos educacionais: ");
		educacionais = sc.nextDouble();
		
		salario = salarioanual / 12;
		
		if (salario < 3000) {
			impostosalario = 0;
		}
		else if (3000 < salario && salario < 5000) {
			impostosalario = (salario * 0.1) * 12;
		} 
		else {
			impostosalario = (salario * 0.2) * 12;
		}
		
		
		if (servi�os > 0) {
			impostoservi�os = servi�os * 0.15;
		}
		else {
			impostoservi�os = 0.00;
		}
		
		
		if (capital > 0) {
			impostocapital = capital * 0.2;
		}
		else {
			impostocapital = 0.00;
		}
		
		System.out.println("");
		System.out.println("RELAT�RIO DE IMPOSTO DE RENDA");
		System.out.println("");
		System.out.println("CONSOLIDADO DE RENDA:");
		System.out.printf("Imposto sobre sal�rio: %.2f%n", impostosalario);
		System.out.printf("Imposto sobre servi�os: %.2f%n", impostoservi�os);
		System.out.printf("Imposto sobre ganho de capital: %.2f%n", impostocapital);
		
		maxdedutivel = (impostosalario + impostoservi�os + impostocapital) * 0.30;
		gastosdedutiveis = medicos + educacionais;
		
		System.out.println("");
		System.out.println("DEDU��ES:");
		System.out.printf("M�ximo dedut�vel: %.2f%n", maxdedutivel);
		System.out.printf("Gastos dedut�veis: %.2f%n", gastosdedutiveis);
		
		
		
		
		sc.close();
	}

}
