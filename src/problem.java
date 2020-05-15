import java.util.Locale;
import java.util.Scanner;

public class problem {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		double salario, serviços, capital, medicos, educacionais;
		
		System.out.println("Renda anual com salário: ");
		salario = sc.nextDouble();
		System.out.println("Renda anual com prestação de serviço: ");
		serviços = sc.nextDouble();
		System.out.println("Renda anual com ganho de capital: ");
		capital = sc.nextDouble();
		System.out.println("Gastos médicos: ");
		medicos = sc.nextDouble();
		System.out.println("Gastos educacionais: ");
		educacionais = sc.nextDouble();
		
		sc.close();
	}

}
