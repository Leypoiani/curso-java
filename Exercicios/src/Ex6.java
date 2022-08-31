import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double A, B, C;
		double trian, circ, trap, quad, ret;
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		
		trian = (A * C)/ 2;
		circ = 3.14159 * (Math.pow(C, 2));
		trap = ((A + B)*C)/2;
		quad = Math.pow(B, 2);
		ret = A * B;
		System.out.printf("TRIANGULO = %.3f%nCIRCULO = %.3f%nTRAPEZIO = %.3f%nQUADRADO = %.3f%nRETANGULO = %.3f%n", trian, circ, trap, quad, ret);
	}

}
