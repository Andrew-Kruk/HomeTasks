//1. Добавить элемент в коллекцию			
//2. Обновить данные элемента по индексу			
//3. Удалить элемент по индексу			
//4. Вывести все объекты на экран	

package inoutput;

import java.util.Scanner;
import zad4.LitConstructor;

public class Main6 extends zad6{

	public static void main(String[] args) {
		
		mas[0] = new LitConstructor("Classic", 1922, "Belye berezi", "Brovkin");
		mas[1] = new LitConstructor("Nauchniy", 1979, "Tkani", "Ermolaev");
		mas[2] = new LitConstructor("Hudozhestvenniy", 1949, "Krapotkino", "Ryabov");
		
		int choiceW = 1;
		
		while (choiceW == 1){
		
		System.out.println("Sdelaite vibor, vvedya cifru");
		System.out.println("1 - Dobavit element v kolekciyu");
		System.out.println("2 - Obnovit dannie elementa po indexu");
		System.out.println("3 - Udalit element po indexu");
		System.out.println("4 - Vivesti vse objecti na ekran");
		
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		int ind = 0;
		
		switch (choice){
		
		case 1 : 		//zad6.zapoln();
						zad6.addF5Obj();
						break;
		
		case 2 : 		//zad6.zapoln();
						zad6.update();
						break;
		
		case 3 : 		//zad6.zapoln();
						zad6.delete();
						break;
						
		case 4 :		//zad6.zapoln();
						zad6.printAllObj();
				
						
		}
		System.out.println("Hotite prodolzit dalshe? 1 - da, 2 - net");
		choiceW = sc.nextInt();
	}
		
	}

}

