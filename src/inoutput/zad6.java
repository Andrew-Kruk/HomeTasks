//1. Добавить элемент в коллекцию			
//2. Обновить данные элемента по индексу			
//3. Удалить элемент по индексу			
//4. Вывести все объекты на экран			

package inoutput;

import java.util.Scanner;
import zad4.LitConstructor;

public class zad6{
	
	static LitConstructor[] mas = new LitConstructor[100];
	
//	public static void zapoln(){
//		mas[0] = new LitConstructor("Classic", 1922, "Belye berezi", "Brovkin");
//		mas[1] = new LitConstructor("Nauchniy", 1979, "Tkani", "Ermolaev");
//		mas[2] = new LitConstructor("Hudozhestvenniy", 1949, "Krapotkino", "Ryabov");
//	}
	
	public static void addF5Obj(){
		int i = 3;
		LitConstructor obj = new LitConstructor();
		obj.enter();
		mas[i] = obj;
		i++;
	} 
	

	public static void printAllObj(){
		for (int i = 0; i < mas.length; i++){
			if (mas[i] != null){
				mas[i].info();
				System.out.println();
				System.out.println();
			}
		}
	}
	
	public static void update(){
		Scanner sc = new Scanner(System.in);
		int ind = 0;
		System.out.println("vvedite index obnovlyaemogo elementa : ");
		ind = sc.nextInt();
		mas[ind].enter();
	}
	
	public static void delete(){
		int ins = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("vvedite index udalyaemogo objecta : ");
		ins = sc.nextInt();
		mas[ins] = null;
		
	}

}
