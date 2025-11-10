/* Вариант 2
 1 задание */
/* import java.util.Scanner;
public class Aagkr {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] masiv = new int[n];
        int countchet = 0;
        int countnechet = 0;
        for (int i = 0 ; i < n ; i++){
            int number = i + 1;
            System.out.print("Vvedite chislo " + number + ": ");
            masiv[i] = sc.nextInt();
        }
        for (int i = 0 ; i < n ; i++){
            if (masiv[i] % 2 == 0){
                countchet ++;
            }
            else{
                countnechet++;
            }
        }
        if (countchet == countnechet){
            System.out.println("Oni ravni");
        }
        else{
            System.out.println("Oni ne ravni");
        }
        sc.close();
    }
} */

/* задание 2 */ 

/* public class task2 {
    public static void main(String[] args){
        Scanner enter = new Scanner(System.in);
        System.out.print("Vvedite x: ");
        int x = enter.nextInt();
        System.out.print("Vvedite n: ");
        int n = enter.nextInt();
        double konechnsumma = 0;
        for (int k = 1 ; k <= n ; k++){
            int factorialk1 = 1;
            int xvstepenk2 = 1;
            for (int i = 1 ; i <= k + 1; i++){
                factorialk1 *= i;
            }
            System.out.println(factorialk1);
            for (int i = 0 ; i < k + 2 ; i++){
                xvstepenk2 *= x;
            }
            System.out.println(xvstepenk2);
            double sverxu = k * xvstepenk2;
            double vichislenie = sverxu / factorialk1;
            if (k % 2 == 0){
                konechnsumma += vichislenie;
            }
            else{
                konechnsumma -= vichislenie;
            }
        }
        System.out.println(konechnsumma);
    }
} */


/* задание 3 */

/* import java.util.Scanner;
public class Aagkr {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] matrix = new int[n][n];
        int[] maximassiv = new int [n];
        int maxisumma = 0;
        for (int i = 0 ; i < n ; i++){
            for (int j = 0 ; j < n ; j++){
                System.out.print("Vvedite chislo dlya [" + i + "] index: ");
                matrix[i][j] = sc.nextInt();
            }
        }
        for(int i = 0 ; i < n ; i++){
            int summa = 0;
            for ( int j = 0 ; j < n ; j++){
                summa += matrix[i][j];
            }
            if (summa > maxisumma){
                maximassiv = matrix[i];
            }
        }
        for(int i = 0 ; i < n ; i++){
            System.out.print(maximassiv[i] + " ");
        }
    }
} */

/* задание 4 */
/* import java.util.Scanner;

/* public class Aagkr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        line = line.toLowerCase();
        String vowels = "аеёиоуыэюя";
        for (int i = 0; i < line.length() - 1; i++) {
            boolean firstIsVowel = false;
            boolean secondIsVowel = false;
            for (int j = 0; j < vowels.length(); j++) {
                if (line.charAt(i) == vowels.charAt(j)) {
                    firstIsVowel = true;
                    break;
                }
            }
            for (int k = 0; k < vowels.length(); k++) {
                if (line.charAt(i + 1) == vowels.charAt(k)) {
                    secondIsVowel = true;
                    break;
                }
            }
            if (firstIsVowel && secondIsVowel) {
                System.out.println("no");
                return;
            }
        }
        System.out.println("ok");
     
	}
} */


/* import java.util.Scanner;
// Импортируем класс Scanner из пакета java.util, который необходим для чтения ввода пользователя с консоли.

public class Aagkr {
// Объявляем публичный класс с именем Aagkr. Все исполняемые Java-программы должны быть заключены в класс.

    public static void main(String[] args) {
    // Главный метод программы, точка входа, откуда начинается выполнение.
        
        Scanner sc = new Scanner(System.in);
        // Создаем новый объект класса Scanner, названный 'sc', который будет читать данные из стандартного потока ввода (консоли).
        
        String line = sc.nextLine();
        // Читаем всю строку, введенную пользователем до нажатия Enter, и сохраняем ее в переменной 'line'.
        
        line = line.toLowerCase();
        // Преобразуем всю строку 'line' в нижний регистр. Это делается для того, чтобы проверка на гласные буквы игнорировала регистр (например, 'А' и 'а' будут обработаны одинаково).
        
        String vowels = "аеёиоуыэюя";
        // Объявляем строку 'vowels', которая содержит все русские гласные буквы в нижнем регистре.
        
        // Начинаем цикл, который перебирает символы в строке.
        // Цикл идет до line.length() - 1, чтобы избежать ошибки IndexOutOfBoundsException, 
        // когда мы пытаемся обратиться к line.charAt(i + 1) на последней итерации.
        for (int i = 0; i < line.length() - 1; i++) {
            
            boolean firstIsVowel = false;
            // Объявляем булеву переменную, которая будет true, если текущий символ (line.charAt(i)) является гласной. Изначально false.
            
            boolean secondIsVowel = false;
            // Объявляем булеву переменную, которая будет true, если следующий символ (line.charAt(i + 1)) является гласной. Изначально false.
            
            // --- Проверка первого символа (line.charAt(i)) ---
            
            // Внутренний цикл: перебираем все гласные в строке 'vowels'.
            for (int j = 0; j < vowels.length(); j++) {
                
                if (line.charAt(i) == vowels.charAt(j)) {
                // Сравниваем текущий символ строки (line.charAt(i)) с j-й гласной буквой.
                    
                    firstIsVowel = true;
                    // Если совпадение найдено, устанавливаем флаг в true.
                    
                    break;
                    // Прерываем внутренний цикл, так как символ уже определен как гласная.
                }
            }
            
            // --- Проверка второго символа (line.charAt(i + 1)) ---
            
            // Второй внутренний цикл: снова перебираем все гласные.
            for (int k = 0; k < vowels.length(); k++) {
                
                if (line.charAt(i + 1) == vowels.charAt(k)) {
                // Сравниваем следующий символ строки (line.charAt(i + 1)) с k-й гласной буквой.
                    
                    secondIsVowel = true;
                    // Если совпадение найдено, устанавливаем флаг в true.
                    
                    break;
                    // Прерываем внутренний цикл.
                }
            }
            
            // --- Проверка условия "две гласные подряд" ---
            
            if (firstIsVowel && secondIsVowel) {
            // Если оба флага (firstIsVowel И secondIsVowel) установлены в true.
                
                System.out.println("no");
                // Выводим "no" (подразумевая, что условие не выполнено/нарушено).
                
                return;
                // Немедленно завершаем выполнение метода main и, соответственно, всей программы.
            }
        }
        
        // Эта строка достигается только в том случае, если основной цикл завершился (то есть, две гласные подряд не были найдены).
        System.out.println("ok");
        // Выводим "ok".
    }
} */









/* Вариант 1
 1 задание */
/* import java.util.Scanner;

public class Aagkr {
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Vvedite razmer massiva n: "); 
        int n = sc.nextInt(); 
        int[] masiv = new int[n];
        for (int i = 0 ; i < n ; i++){
            int number = i + 1;   
            System.out.print("Vvedite chislo " + number + ": ");
            masiv[i] = sc.nextInt(); 
        }
        int sumPervogo = 0;
        int chisloPervoe = masiv[0];
        int temp = chisloPervoe;
        while (temp > 0) {
            int cifra = temp % 10;
            sumPervogo += cifra;  
            temp = temp / 10;
        }
		
        int sumPoslednego = 0;
        int chisloPoslednee = masiv[n-1]; 
        temp = chisloPoslednee;
        while (temp > 0) {
            int cifra = temp % 10;
            sumPoslednego += cifra;
            temp = temp / 10;
        }

        if (sumPervogo == sumPoslednego){
            System.out.println("Summa cifr pervogo i poslednego chisla RAVNI"); 
        } else {
            System.out.println("Summa cifr pervogo i poslednego chisla NE RAVNI");
        }
        sc.close();
    }
} */

/*  3 задание  */
/* import java.util.Scanner;

public class Aagkr {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Vvedite razmer matritsy n: ");
        int n = sc.nextInt();
        int[][] matrix = new int[n][n];
        for (int i = 0 ; i < n ; i++){
            for (int j = 0 ; j < n ; j++){
                System.out.print("Vvedite chislo dlya matrix[" + i + "][" + j + "]: ");
                matrix[i][j] = sc.nextInt();
            }
        }

        int summaNeDel3 = 0;
        for(int i = 0 ; i < n ; i++){
            for ( int j = 0 ; j < n ; j++){
                int element = matrix[i][j];
                if (element % 3 != 0) {
                    summaNeDel3 += element;
                }
            }
        }
        System.out.println("Summa vseh chisel, kotorye NE deljatsya na 3: " + summaNeDel3);
        sc.close();
    }
} */

/*  2 задание  */

/* // 1. Импортируем библиотеку для чтения ввода
import java.util.Scanner;

// 2. Объявляем класс
public class Aagkr {

    // 3. Точка входа — main-метод
    public static void main(String[] args){

        // 4. Создаем объект Scanner для чтения ввода
        Scanner enter = new Scanner(System.in);


        // 5. Ввод числа `x` (из формулы ряда):
        System.out.print("Vvedite x: "); // 5a. Подсказка
        int x = enter.nextInt();         // 5b. Считываем `x`


        // 6. Ввод числа `n` (количество членов ряда):
        System.out.print("Vvedite n: "); // 6a. Подсказка
        int n = enter.nextInt();         // 6b. Считываем `n`


        // 7. Переменная для хранения *конечной суммы* ряда (используем `double`, чтобы хранить дробные числа)
        double konechnsumma = 0;


        // 8. Основной цикл: проходит по каждому члену ряда (от k=1 до k=n)
        for (int k = 1 ; k <= n ; k++){


            // --- БЛОК 1: Вычисляем ЗНАМЕНАТЕЛЬ формулы: (2k)! + k ---
            long factorial2k = 1;                      // 9. Переменная для хранения факториала `(2k)!` (используем `long`, так как факториалы растут быстро)
            int znamenatel = 2 * k;                    // 10. Вычисляем `2k` (число, факториал которого нужен)

            // 11. Цикл для вычисления факториала `(2k)!`:
            //     факториал — это произведение всех чисел от 1 до `znamenatel` (например, 3! = 1*2*3)
            for (int i = 1 ; i <= znamenatel; i++) {
                factorial2k *= i;                      // 11a. Сокращение от: factorial2k = factorial2k * i
            }

            double chislZnamen = factorial2k + k;      // 12. Полный знаменатель: (2k)! + k (переводим в `double` для корректного деления)


            // --- БЛОК 2: Вычисляем ЧИСЛИТЕЛЬ формулы: x^(3k-1) ---
            double xvstepen = 1;                       // 13. Переменная для хранения `x` в степени `3k-1` (используем `double`)
            int stepen = 3 * k - 1;                    // 14. Вычисляем показатель степени: `3k-1`

            // 15. Цикл для возведения `x` в степень `stepen`:
            //     умножаем `x` на себя `stepen` раз (например, x^3 = x * x * x)
            for (int i = 0 ; i < stepen; i++) {
                xvstepen *= x;                         // 15a. Сокращение от: xvstepen = xvstepen * x
            }


            // --- БЛОК 3: Вычисляем ОДИН ЧЛЕН ряда и добавляем/вычитаем к сумме ---
            double chlenRyada = xvstepen / chislZnamen; // 16. Один член ряда = числитель / знаменатель

            if (k % 2 != 0) {                          // 17. Условие: если `k` — *нечетное* число (остаток от деления на 2 != 0)
                konechnsumma -= chlenRyada;            // 17a. Вычитаем этот член из суммы (konechnsumma = konechnsumma - chlenRyada)
            } else {                                   // 18. Если `k` — *четное* число
                konechnsumma += chlenRyada;            // 18a. Прибавляем этот член к сумме (konechnsumma = konechnsumma + chlenRyada)
            }

        } // Конец основного цикла по `k`


        // 19. Выводим *конечную сумму* ряда
        System.out.println("Konechnaya summa ryada: " + konechnsumma);


        // 20. Закрываем объект Scanner
        enter.close();
    }
} */

/*  4 задание  */

/* import java.util.Scanner;

public class Zadanie4_Simple {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Vvedite stroku: ");
        String line = scanner.nextLine();

        // 1. КОНСТАНТЫ ДЛЯ ПРОВЕРКИ
        // Строка содержит ТОЛЬКО МАЛЕНЬКИЕ согласные, упорядоченные по алфавиту.
        String alphabetConsonants = "бвгджзйклмнпрстфхцчшщ"; 

        // Переменная для хранения позиции *предыдущей* встреченной согласной в алфавите
        // Инициализируем -1, так как 0 — это уже позиция 'б'.
        int prevConsonantPosition = -1; 
        
        boolean isOk = true; 

        // 2. ГЛАВНЫЙ ЦИКЛ ОБРАБОТКИ СТРОКИ
        for (int i = 0; i < line.length(); i++) {
            char originalChar = line.charAt(i); // Текущий символ

            // 3. РУЧНОЕ ПРЕОБРАЗОВАНИЕ В НИЖНИЙ РЕГИСТР
            // Используем ту же логику ручного преобразования, что и ранее, чтобы избежать toLowerCase()
            char lowerChar = originalChar;
            if (originalChar >= 'А' && originalChar <= 'Я') {
                if (originalChar == 'Ё') {
                    lowerChar = 'ё';
                } else {
                    lowerChar = (char) (originalChar + ('а' - 'А'));
                }
            }


            // 4. ПРОВЕРКА НА СОГЛАСНУЮ И ОПРЕДЕЛЕНИЕ ЕЕ ПОЗИЦИИ
            
            // indexOf: ищем символ в нашей строке согласных.
            // Если символ не найден (гласная, цифра, пробел), position будет -1.
            int currentPosition = alphabetConsonants.indexOf(lowerChar); 

            // Если currentPosition >= 0, значит, мы нашли согласную.
            if (currentPosition != -1) {

                // 5. ПРОВЕРКА ПОРЯДКА
                
                // Проверяем, встречали ли мы уже предыдущую согласную (prevConsonantPosition != -1).
                // Если встречали, то сравниваем позиции:
                if (prevConsonantPosition != -1) {
                    
                    // Если текущая позиция меньше или равна предыдущей позиции
                    // (например, встретили 'г' (поз. 2), а потом 'б' (поз. 0)).
                    // Заметка: В оригинальном условии не сказано, что буквы не могут повторяться.
                    // Если буквы могут повторяться ('бб'), то currentPosition >= prevConsonantPosition.
                    // Если буквы должны строго возрастать ('б', 'в'), то currentPosition > prevConsonantPosition.
                    // Примем более общее: алфавитный порядок => можно повторяться, т.е. currentPosition < prevConsonantPosition - нарушение.
                    if (currentPosition < prevConsonantPosition) {
                        isOk = false; // Нарушение порядка
                        break;        // Прерываем цикл
                    }
                }

                // 6. ОБНОВЛЕНИЕ ПРЕДЫДУЩЕЙ ПОЗИЦИИ
                // Запоминаем позицию текущей согласной, чтобы сравнить ее со следующей.
                prevConsonantPosition = currentPosition;
            }
        }


        // 7. ВЫВОД РЕЗУЛЬТАТА
        if (isOk) {
            System.out.println("ok");
        } else {
            System.out.println("no");
        }


        scanner.close();
    }
}
 */