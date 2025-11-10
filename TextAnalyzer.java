
import java.util.Scanner;
public class Classni{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		boolean xaxa = line.matches("(0[1-9]|[1-2][0-9]|3[01])\\.(0[1-9]|1[0-2])\\.([1-2][0-9][0-9][0-9])");
		System.out.println(xaxa);
	}
} 


		
  
import java.util.Scanner;
public class TextAnalyzer{
    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);
        String text = enter.nextLine();
        System.out.println("Email-Адреса : ");
        System.out.println(findEmails(text));
        System.out.println("Даты: ");
        System.out.println(findDates(text));
        System.out.println("Слова с заглавной буквы : ");
        System.out.println(findCapitalizedWords(text));
        System.out.println("Общее кол-во цифр: " );
		System.out.println(countDigits(text));
        enter.close();
    }
	public static int counterslov(String x){ //это мы считаем слова в строке и возвращаем их кол-во
        int counterslov = 1;
        for (int i = 0 ; i < x.length() ; i++){       
            if (x.charAt(i) == ' '){
                counterslov++;
            }
        }
        return counterslov;
    }
    public static String[] ownspliter(String x){ //разделяем
        String[] splited = new String[counterslov(x)];
        int schetchslov = 0;
        String slovo = "";
        for (int i = 0 ; i < x.length() ; i ++){
            if (x.charAt(i) != ' '){
                slovo += x.charAt(i);
            }
            else{
                splited[schetchslov] = slovo;
                schetchslov++;
                slovo = "";
            }
        }
        splited[schetchslov] = slovo;
        return splited;
    }
	public static String deleter (String text){ //чистим строку, чтобы остались только буквы
        String newstring = "";
        for (int i = 0 ; i < text.length() ; i++){
                String bukva = "" + text.charAt(i);
                if (bukva.matches("[A-Za-zА-Яа-я]")){
                    newstring += bukva;
            }
        }
        return newstring;
	}
	public static String findEmails(String text){ //почта
        String slova = "";
        int counter = 1;
        for (int i = 0 ; i < counterslov(text) ; i++){
                String slovo = ownspliter(text)[i];
                if (slovo.matches("\\w+\\@\\w+\\-*\\w+\\.(com|ru)\\.*\\,*")){
                    slova += counter + "." + slovo +"\n";
                    counter++;
            }
        }
        return slova;
    }
    public static String findDates(String text){ //дата
        String slova = "";
        int counter = 1;
        for (int i = 0 ; i < counterslov(text) ; i++){
                String slovo = ownspliter(text)[i];
                if (slovo.matches("(0[1-9]ч[1-2][0-9]|3[01])\\.(0[1-9]|1[0-2])\\.([1-2][0-9][0-9][0-9])")){
                    slova += counter + "." + slovo +"\n";
                    counter++;
            }
        }
        return slova;
    }
	    public static String findCapitalizedWords(String text){ //заглавная буква
        String slova = "";
        int counter = 1;
        for (int i = 0 ; i < counterslov(text) ; i++){
                String slovo = deleter(ownspliter(text)[i]);
                if (slovo.matches("[A-ZА-Я]{1}[a-zа-я]+")){
                    slova += counter + "." + slovo +"\n";
                    counter++;
            }
        }
        return slova;
    }
    public static int countDigits(String x){ //кол-во цифр
        int counter = 0;
        for (int i = 0 ; i < x.length() ; i++){
            String bukva = "" + x.charAt(i);
            if (bukva.matches("[0-9]")){
                counter++;
            }
        }
        return counter;
    }

}
