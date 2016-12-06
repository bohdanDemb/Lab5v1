import java.util.Scanner;

public class Main {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Введіть своє ім'я:");
		System.out.println("Hello, " + sc.next() + "!");
		System.out.println("Введіть свій рівень доступу");
		if(sc.next().equals("admin")){
			System.out.println("Ви ввійшли як адміністратор");
		}
		else System.out.println("У вас права доступу звичайного користувача");
	}
}
