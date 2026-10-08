import java.util.Scanner;

public class firstlab {

    // задание 1. методы

    // 1. дробная часть
    public double fraction(double x) {
        int intPart = (int) x;
        return x - intPart;
    }

    // 4. есть ли позитив
    public boolean isPositive(int x) {
        return x > 0;
    }

    // 5. двузначное
    public boolean is2Digits(int x) {
        int abs = x < 0 ? -x : x;
        return abs >= 10 && abs <= 99;
    }

    // 8. делитель
    public boolean isDivisor(int a, int b) {
        if (a == 0 || b == 0) return false;
        return a % b == 0 || b % a == 0;
    }

    // 9. равенство
    public boolean isEqual(int a, int b, int c) {
        return a == b && b == c;
    }

    // задание 2. условия

    // 3. тридцать пять
    public boolean is35(int x) {
        boolean div3 = x % 3 == 0;
        boolean div5 = x % 5 == 0;
        if (div3 && div5) return false;
        return div3 || div5;
    }

    // 5. тройной максимум
    public int max3(int x, int y, int z) {
        int max = x;
        if (y > max) max = y;
        if (z > max) max = z;
        return max;
    }

    // 7. двойная сумма
    public int sum2(int x, int y) {
        int sum = x + y;
        if (sum >= 10 && sum <= 19) return 20;
        return sum;
    }

    // 8. возраст
    public String age(int x) {
        int lastTwo = x % 100;
        int lastOne = x % 10;
        String word;
        if (lastTwo >= 11 && lastTwo <= 14) {
            word = "лет";
        } else if (lastOne == 1) {
            word = "год";
        } else if (lastOne >= 2 && lastOne <= 4) {
            word = "года";
        } else {
            word = "лет";
        }
        return x + " " + word;
    }

    // 10. вывод дней недели
    public void printDays(String x) {
        switch (x) {
            case "понедельник":
                System.out.println("понедельник");
            case "вторник":
                System.out.println("вторник");
            case "среда":
                System.out.println("среда");
            case "четверг":
                System.out.println("четверг");
            case "пятница":
                System.out.println("пятница");
            case "суббота":
                System.out.println("суббота");
            case "воскресенье":
                System.out.println("воскресенье");
                break;
            default:
                System.out.println("это не день недели");
        }
    }

    // задание 3. циклы

    // 2. числа наоборот
    public String reverseListNums(int x) {
        StringBuilder sb = new StringBuilder();
        for (int i = x; i >= 0; i--) {
            sb.append(i);
            if (i > 0) sb.append(" ");
        }
        return sb.toString();
    }

    // 4. возведение в степень
    public int pow(int x, int y) {
        int result = 1;
        for (int i = 0; i < y; i++) {
            result *= x;
        }
        return result;
    }

    // 6. одинаковость
    public boolean equalNum(int x) {
        int abs = x < 0 ? -x : x;
        int last = abs % 10;
        abs /= 10;
        while (abs > 0) {
            if (abs % 10 != last) return false;
            abs /= 10;
        }
        return true;
    }

    // 9. правый треугольник
    public void rightTriangle(int x) {
        for (int i = 1; i <= x; i++) {
            for (int j = 0; j < x - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // 10. угадайка
    public void guessGame() {
        Scanner sc = new Scanner(System.in);
        int secret = (int) (Math.random() * 10);
        int attempts = 0;
        while (true) {
            System.out.print("введите число от 0 до 9: ");
            if (!sc.hasNextInt()) {
                System.out.println("ошибка: введите целое число");
                sc.next();
                continue;
            }
            int user = sc.nextInt();
            if (user < 0 || user > 9) {
                System.out.println("число должно быть от 0 до 9");
                continue;
            }
            attempts++;
            if (user == secret) {
                System.out.println("вы угадали! вы отгадали число за " + attempts + " попытки");
                break;
            } else {
                System.out.println("вы не угадали, введите число от 0 до 9:");
            }
        }
    }

    // задание 4. массивы

    // 1. поиск первого значения
    public int findFirst(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) return i;
        }
        return -1;
    }

    // 2. поиск последнего значения
    public int findLast(int[] arr, int x) {
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == x) return i;
        }
        return -1;
    }

    // 7. возвратный реверс
    public int[] reverseBack(int[] arr) {
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            result[i] = arr[arr.length - 1 - i];
        }
        return result;
    }

    // 8. объединение
    public int[] concat(int[] arr1, int[] arr2) {
        int[] result = new int[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length; i++) result[i] = arr1[i];
        for (int i = 0; i < arr2.length; i++) result[arr1.length + i] = arr2[i];
        return result;
    }

    // 10. удалить негатив
    public int[] deleteNegative(int[] arr) {
        int count = 0;
        for (int v : arr) if (v >= 0) count++;
        int[] result = new int[count];
        int idx = 0;
        for (int v : arr) {
            if (v >= 0) result[idx++] = v;
        }
        return result;
    }

    // вспомогательные методы

    // преобразование массива в строку
    private String arrayToString(int[] arr) {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
            if (i < arr.length - 1) sb.append(", ");
        }
        sb.append("]");
        return sb.toString();
    }

    // проверка на ввод числа
    private int readInt(Scanner sc, String prompt) {
        while (true) {
            System.out.print(prompt);
            if (sc.hasNextInt()) {
                return sc.nextInt();
            } else {
                System.out.println("Ошибка: введите целое число!");
                sc.next();
            }
        }
    }

    // проверка на вещественное число
    private double readDouble(Scanner sc, String prompt) {
        while (true) {
            System.out.print(prompt);
            if (sc.hasNextDouble()) {
                return sc.nextDouble();
            } else {
                System.out.println("Ошибка: введите число!");
                sc.next();
            }
        }
    }

    // главный метод

    public static void main(String[] args) {
        firstlab lab = new firstlab();
        Scanner sc = new Scanner(System.in);

        // задание 1
        System.out.println("задание 1. методы");

        double d = lab.readDouble(sc, "1) введите число для дробной части: ");
        System.out.println("дробная часть: " + lab.fraction(d));

        int p = lab.readInt(sc, "4) введите число для проверки на позитив: ");
        System.out.println("результат: " + lab.isPositive(p));

        int two = lab.readInt(sc, "5) введите число для проверки двузначности: ");
        System.out.println("результат: " + lab.is2Digits(two));

        int a1 = lab.readInt(sc, "8) делитель. введите a: ");
        int b1 = lab.readInt(sc, "   введите b: ");
        System.out.println("одно из принятых чисел делит другое нацело? " + lab.isDivisor(a1, b1));

        int e1 = lab.readInt(sc, "9) равенство. Введите a: ");
        int e2 = lab.readInt(sc, "   введите b: ");
        int e3 = lab.readInt(sc, "   введите c: ");
        System.out.println("равны ли все три числа? " + lab.isEqual(e1, e2, e3));

        // задание 2
        System.out.println("\nзадание 2. условия");

        int x35 = lab.readInt(sc, "3) тридцать пять. введите x: ");
        System.out.println("результат: " + lab.is35(x35));

        int m1 = lab.readInt(sc, "5) тройной максимум. x: ");
        int m2 = lab.readInt(sc, "   y: ");
        int m3 = lab.readInt(sc, "   z: ");
        System.out.println("максимум: " + lab.max3(m1, m2, m3));

        int s1 = lab.readInt(sc, "7) двойная сумма. x: ");
        int s2 = lab.readInt(sc, "   y: ");
        System.out.println("результат: " + lab.sum2(s1, s2));

        int ageX = lab.readInt(sc, "8) возраст. введите число лет: ");
        System.out.println("возраст: " + lab.age(ageX));

        System.out.print("10) введите день недели: ");
        String day = sc.next();
        lab.printDays(day);

        // задание 3
        System.out.println("\nзадание 3. циклы");

        int rl = lab.readInt(sc, "2) числа наоборот. введите x: ");
        System.out.println("результат: " + lab.reverseListNums(rl));

        int pw1 = lab.readInt(sc, "4) степень числа. x: ");
        int pw2 = lab.readInt(sc, "   y: ");
        System.out.println("x в степени y: " + lab.pow(pw1, pw2));

        int eq = lab.readInt(sc, "6) одинаковость. введите число: ");
        System.out.println("все ли цифры одинаковы? " + lab.equalNum(eq));

        int rt = lab.readInt(sc, "9) правый треугольник. введите высоту: ");
        lab.rightTriangle(rt);

        System.out.println("10) игра «угадайка»");
        lab.guessGame();

        // задание 4
        System.out.println("\nзадание 4. массивы");

        int[] arr = {1, 2, 3, 4, 2, 2, 5};

        int ff = lab.readInt(sc, "1) поиск первого значения. введите x: ");
        System.out.println("индекс первого вхождения: " + lab.findFirst(arr, ff));

        int fl = lab.readInt(sc, "2) поиск последнего значения. введите x: ");
        System.out.println("индекс последнего вхождения: " + lab.findLast(arr, fl));

        System.out.println("7) возвратный реверс: " + lab.arrayToString(lab.reverseBack(arr)));

        int[] arr2 = {7, 8, 9};
        System.out.println("8) объединение: " + lab.arrayToString(lab.concat(arr, arr2)));

        int[] neg = {1, 2, -3, 4, -2, 2, -5};
        System.out.println("10) удалить негатив: " + lab.arrayToString(lab.deleteNegative(neg)));

        sc.close();
    }
}