import java.util.Scanner;

/*
Возьмём бесконечную цифровую последовательность, образованную склеиванием последовательных 
положительных чисел: S = 123456789101112131415...
Определите первое вхождение заданной последовательности A в бесконечной 
последовательности S (нумерация начинается с 1).

Пример входных данных:
6789
111

Пример выходных данных:
6
12
*/

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		StringBuffer buffer = new StringBuffer();
		
		long indexOfEnter; //место входа
		long i = 1; // нумерация последовательности начинается с 1
		String s; //последовательность S
		
		System.out.println("Введите последовательность А: ");
		
		s = scanner.nextLine();
		scanner.close();
		
		if(s.length() == 0){
			System.err.println("Вы не ввели последовательность");
			return;
		}
		
	    try {
	        indexOfEnter = Long.parseLong(s);
	    } catch (NumberFormatException e) {
	    	System.err.println("Последовательность введена некорректно");
	    	return;
	    }  
		
		while((indexOfEnter = buffer.toString().indexOf(s)) == -1){
			buffer.append(i);
			i++;
		}
		System.out.println("Первое вхождение А в последовательность S: ");
		System.err.println(indexOfEnter + 1);
	}
}
