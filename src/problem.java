import java.util.Locale;
import java.util.Scanner;

public class problem {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		double salario, servi�os, capital, medicos, educacionais;
		
		System.out.println("Renda anual com sal�rio: ");
		salario = sc.nextDouble();
		System.out.println("Renda anual com presta��o de servi�o: ");
		servi�os = sc.nextDouble();
		System.out.println("Renda anual com ganho de capital: ");
		capital = sc.nextDouble();
		System.out.println("Gastos m�dicos: ");
		medicos = sc.nextDouble();
		System.out.println("Gastos educacionais: ");
		educacionais = sc.nextDouble();
		
		sc.close();
	}

}
