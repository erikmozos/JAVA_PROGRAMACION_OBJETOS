package ex6_4;
import java.util.Scanner;
public class programadata {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int dia, mes, any;
		
		System.out.println("Introdueix un dia");
		dia= sc.nextInt();
		sc.nextLine();
		System.out.println("introdueix un mes");
		mes = sc.nextInt();
		sc.nextLine();
		System.out.println("Introdueix un any");
		any = sc.nextInt();
		sc.nextLine();
		data dataintrduida = new data(dia, mes, any);
		if(dataintrduida.isValidacio()== true) {
		dataintrduida.dema();
		System.out.println("El dia següent serà " + dataintrduida.getDia()+ "/" +dataintrduida.getMes()+ "/" +dataintrduida.getAny());
	}

}
}
