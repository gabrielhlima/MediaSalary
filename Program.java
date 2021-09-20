import java.util.Scanner;

import entities.Salary;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Salary a = new Salary();
		Salary b = new Salary();

		System.out.println("Informe o nome do primeiro funcionário:");
		a.name = sc.nextLine();
		System.out.println("Informe o salário do primeiro funcionário:");
		a.salary = sc.nextDouble();
		sc.nextLine(); // limpa o buffer do teclado
		System.out.println("Informe o nome do segundo funcionário:");
		b.name = sc.nextLine();
		System.out.println("Informe o salário do segundo funcionário:");
		b.salary = sc.nextDouble();

		double mediaSalary = (a.salary + b.salary) / 2;

		System.out.println("A média salaria é: " + mediaSalary);
		sc.close();
	}

}
