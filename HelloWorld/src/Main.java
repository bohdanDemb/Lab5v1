import java.util.Scanner;

public class Main {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("������ ��� ��'�:");
		System.out.println("Hello, " + sc.next() + "!");
		System.out.println("������ ��� ����� �������");
		if(sc.next().equals("admin")){
			System.out.println("�� ������ �� �����������");
		}
		else System.out.println("� ��� ����� ������� ���������� �����������");
	}
}
