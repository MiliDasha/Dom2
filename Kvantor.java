import java.util.regex.*;
public class Kvantor{
    public static void main(String[] args) {
		String text = "Она сказала: \"Привет!\", а он ответил: \"Как дела?\", потом: \"Отлично!\"";
		Pattern pattern = Pattern.compile("\"(.*?)\"");
		Matcher matcher = pattern.matcher(text);
		while (matcher.find()){
			String otvet = matcher.group();
			System.out.println(otvet);
		}
	}
}	

import java.util.regex.*;
public class Kvantor{
    public static void main(String[] args) {
		String html = """ 
    <div class="product"> 
        <h3>Телефон</h3> 
        <p>Цена: 20000 руб</p> 
    </div> 
    <div class="product"> 
        <h3>Ноутбук</h3>  
        <p>Цена: 50000 руб</p> 
    </div> 
     """; 
	Pattern.compile("<h3>(.*?)</h3>").matcher(html).results().forEach(m -> System.out.println(m.group(1)));
	}
}

import java.util.regex.*;
public class Kvantor{
    public static void main(String[] args) {
		String csv = "Вика,18,Альметьевск;Анна,24,Казань;Аскар,6,Бугульма";
		Pattern pattern = Pattern.compile("[^;]+");
		Matcher matcher = pattern.matcher(csv);
		while (matcher.find()){
			String otvet = matcher.group();
			System.out.println(otvet);
		}
	}
}

import java.util.regex.*;
public class Kvantor{
    public static void main(String[] args) {
		String post = "Сегодня был в #парке и #кино #отдых #выходные";
		Pattern pattern = Pattern.compile("#([а-яА-Я0-9]+)");
		Matcher matcher = pattern.matcher(post);
		while (matcher.find()){
			String otvet = matcher.group(1);
			System.out.println(otvet);
		}
	}
}