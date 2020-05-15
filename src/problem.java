import java.util.Locale;
import java.util.Scanner;

public class problem {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		double salario, salarioanual, serviços, capital, medicos, educacionais, impostosalario=0, impostoserviços=0, impostocapital=0, maxdedutivel=0, gastosdedutiveis=0;
		
		System.out.println("Renda anual com salário: ");
		salarioanual = sc.nextDouble();
		System.out.println("Renda anual com prestação de serviço: ");
		serviços = sc.nextDouble();
		System.out.println("Renda anual com ganho de capital: ");
		capital = sc.nextDouble();
		System.out.println("Gastos médicos: ");
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
		
		
		if (serviços > 0) {
			impostoserviços = serviços * 0.15;
		}
		else {
			impostoserviços = 0.00;
		}
		
		
		if (capital > 0) {
			impostocapital = capital * 0.2;
		}
		else {
			impostocapital = 0.00;
		}
		
		System.out.println("");
		System.out.println("RELATÓRIO DE IMPOSTO DE RENDA");
		System.out.println("");
		System.out.println("CONSOLIDADO DE RENDA:");
		System.out.printf("Imposto sobre salário: %.2f%n", impostosalario);
		System.out.printf("Imposto sobre serviços: %.2f%n", impostoserviços);
		System.out.printf("Imposto sobre ganho de capital: %.2f%n", impostocapital);
		
		maxdedutivel = (impostosalario + impostoserviços + impostocapital) * 0.30;
		gastosdedutiveis = medicos + educacionais;
		
		System.out.println("");
		System.out.println("DEDUÇÕES:");
		System.out.printf("Máximo dedutível: %.2f%n", maxdedutivel);
		System.out.printf("Gastos dedutíveis: %.2f%n", gastosdedutiveis);
		
		
		
		
		sc.close();
	}

}
