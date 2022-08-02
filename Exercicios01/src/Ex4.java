import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int numero;
		double horas, salario, valorHora;
		System.out.println("Digite o numero do funcionario: ");
		numero = sc.nextInt();
		System.out.println("Digite o numero de horas trabalhadas: ");
		horas = sc.nextDouble();
		System.out.println("Digite o valor recebido por hora: ");
		valorHora = sc.nextDouble();
		
		salario = valorHora * horas;
		
		System.out.println("NUMBER = " + numero);
		System.out.printf("SALARY = %.2f%n", salario);
		
		sc.close();
	}

}
