import java.util.Scanner;

import entities.Salary;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Salary a = new Salary();
		Salary b = new Salary();

		System.out.println("Informe o nome do primeiro funcion�rio:");
		a.name = sc.nextLine();
		System.out.println("Informe o sal�rio do primeiro funcion�rio:");
		a.salary = sc.nextDouble();
		sc.nextLine(); // limpa o buffer do teclado
		System.out.println("Informe o nome do segundo funcion�rio:");
		b.name = sc.nextLine();
		System.out.println("Informe o sal�rio do segundo funcion�rio:");
		b.salary = sc.nextDouble();

		double mediaSalary = (a.salary + b.salary) / 2;

		System.out.println("A m�dia salaria �: " + mediaSalary);
		sc.close();
	}

}
