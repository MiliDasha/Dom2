/* 1 задание */

import java.util.Scanner;
import java.util.regex.*;
public class Daiball {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст для анализа:");
        String text = scanner.nextLine();
		Pattern pattern = Pattern.compile("[а-яА-Яa-zA-Z]+");
        Matcher matcher = pattern.matcher(text);
        int count = 0;
        String maxword = "";
		
        while (matcher.find()) {
            String word = matcher.group();
            count++;
            if (word.length() > maxword.length()) {
                maxword = word;
            }
		}
		System.out.println("Слов всего: " + count);
        System.out.println("Самое длинное слово: " + maxword);
	}
}



import java.util.regex.*;
public class Daiball{
	public static void main(String[] args){
		String mani = "bla bla bla 100 23 27.11";
		Pattern pattern = Pattern.compile("([0-9]+)");
		Matcher matcher = pattern.matcher(mani);
		while (matcher.find()){
			String otvet = matcher.group(1);
			System.out.println(otvet);
		}
	}
} 

import java.util.regex.*;
public class Daiball{
	public static void main(String[] args){
		String mani = "bla bla bla $100 $23 27.11";
		Pattern pattern = Pattern.compile("$([0-9]+)");
		Matcher matcher = pattern.matcher(mani);
		while (matcher.find()){
			String otvet = matcher.group(1);
			System.out.println(otvet);
		}
	}
}

/* 3 */

import java.util.regex.*;
public class Daiball{
    public static void main(String[] args) {
		String email = "blabla bla bla dashatarelova@gmail.ru blabla bla";
		Pattern pattern = Pattern.compile("\\w+\\@\\w+\\-*\\w+\\.(com|ru)\\.*\\,*");
		Matcher matcher = pattern.matcher(email);
		while (matcher.find()){
			String otvet = matcher.group();
			System.out.println(otvet);
		}
	}
}

import java.util.regex.*;
public class Daiball{
	public static void main(String[] args){
		String nomer = "bla bla bla 89370029001 27.11.23451";
		Pattern pattern = Pattern.compile("8[0-9]{10}");
		Matcher matcher = pattern.matcher(nomer);
		while (matcher.find()){
			String otvet = matcher.group();
			System.out.println(otvet);
		}
	}
}

/* 4 */
 
import java.util.Scanner;
import java.util.regex.*;

public class Daiball {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст для анализа:");
        String text = scanner.nextLine();
        int simvlcount = 0;           
        int bukvacount = 0;
		int chislocount = 0;
		int probelcount = 0;
        int specsimv = 0;

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i); 
            simvlcount++; 
            if (bukva.matches("[A-Za-z]")){
                bukvacount++;
			}
			if (chisl.matches("[0-9]")) {
				chislocount++;
			}
			if (probel.matches("\\s")){
				probelcount++;
			} else {
				specsimv++;
            }
        }
        System.out.println(simvlcount);
        System.out.println(bukvacount);
		System.out.println(chislocount);
		System.out.println(probelcount);
        System.out.println(specsimv);
    }
}

/* 2 */
import java.util.Scanner;
import java.util.regex.*;

public class Daiball {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        Pattern pattern = Pattern.compile("[0-9]+(\\.[0-9]+)?");
        Matcher matcher = pattern.matcher(text);

        double totalSum = 0;
        int numbersCount = 0;

        while (matcher.find()) {
            String numberStr = matcher.group();
            System.out.println(numberStr);
            totalSum += Double.valueOf(numberStr);
            numbersCount++;
        }


        Pattern pattern = Pattern.compile("\\$[0-9]+(\\.[0-9]+)?");
        Matcher matcher = pattern.matcher(text);
        
        double salesSum = 0;

        while (matcher.find()) {
            String thsesymbol = matcher.group();
            String saleStr = thsesymbol.substring(1);
            salesSum += Double.valueOf(saleStr);
        }
        
		
        double average = 0;
        if (numbersCount > 0) {
            average = totalSum / numbersCount;
        }

        System.out.println("Сумма продаж: " + salesSum);
        System.out.println("Среднее значение: " + average);
    }
}