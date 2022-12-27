package org.example;

import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//    double procentOil;
//    double rost = 181.5;
//    double taliya = 65;
//    char pol = 'f';
//
//    if (pol == 'm') {
//        procentOil = 64 - (20 * rost/taliya);
//        System.out.println("Процент жира у мужчины: " + procentOil);
//    } else if (pol == 'f') {
//        procentOil = 76 - (20 * rost/taliya);
//        System.out.println("Процент жира у женщины: " + procentOil);
//    }
//
//      ДЗ - 2
//        Scanner in = new Scanner(System.in);
//        System.out.print("a: ");
//        int a = in.nextInt();
//        System.out.print("b: ");
//        int b = in.nextInt();
//        System.out.println("Zadanie 1: " + (a + b) / 2f);
//        System.out.println("Zadanie 2: " + a % b);
//
//        Задачи по while *****************************************************
//        int numb = 1;
//        while(numb <= 5) {
//            System.out.println(numb);
//            numb++;
//        }
//        numb--;
//        while(numb > 0) {
//            System.out.println(numb);
//            numb--;
//        }
//
//        int numbZadanye3 = 1;
//        while (numbZadanye3 <= 10) {
//            System.out.println(numbZadanye3 * 3);
//            numbZadanye3++;
//        }
//
//        Scanner scan = new Scanner(System.in);
//        int numbZadanye4 = scan.nextInt();
//        int numb1 = 1;
//        int sum = 0;
//
//        while (numb1 <= numbZadanye4) {
//            sum += numb1;
//            numb1++;
//        }
//        System.out.println(sum);

    // Задачи по for

//        for (int i = 1; i <= 5; i++) {
//            System.out.println(i);
//        }
//        for (int i = 5; i > 0; i--) {
//            System.out.println(i);
//        }
//
//        for (int i = 1; i <= 10; i++) {
//            System.out.println(i * 3);
//        }

//        Scanner scan = new Scanner(System.in);
//        int numbZadanye3 = scan.nextInt();
//        int sum = 0;
//
//        for (int i = 1; i <= numbZadanye3; i++) {
//            sum += i;
//        }
//        System.out.println("Итого: " + sum);

        // ДЗ-4
//        int count = 0;
//
//        for (int i = 2; i <= 20; i+=2) {
//            count++;
//        }
//
//        int [] array = new int[count];
//
//        for (int i = 0, j = 2; i < array.length; i++, j+=2) {
//            array[i] = j;
//            System.out.println(array[i]);
//        }
        // ДЗ-5
//        Scanner scan = new Scanner(System.in);
//        int [][] arr = new int[3][3];
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 3; j++) {
//                System.out.println("Введите число: ");
//                arr[i][j] = scan.nextInt();
//            }
//        }
//
//        int [][] arr2 = new int[3][3];
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 3; j++) {
//                System.out.println("Введите число: ");
//                arr2[i][j] = scan.nextInt();
//            }
//        }
//
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 3; j++) {
//                System.out.print(arr[i][j] + arr2[i][j] + " ");
//            }
//            System.out.println();
//        }

        // ДЗ-6
//    while (true) {
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Введите первое число либо STOP: ");
//        String a = scan.nextLine();
//        if (a.equals("STOP")) {
//            break;
//        }
//        System.out.println("Введите второе число либо STOP: ");
//        String b = scan.nextLine();
//        if (b.equals("STOP")) {
//            break;
//        }
//        int c = Integer.parseInt(a);
//        int d = Integer.parseInt(b);
//        System.out.println("Сумма чисел = " + addition(c, d));
//        System.out.println("Произведение чисел = " + multiplication(c, d));
//        System.out.println("Деление чисел = " + division(c, d));
//        System.out.println("Минусование чисел = " + minus(c, d));
//    }

        // ДЗ-7
//        while (true) {
//            Scanner scan = new Scanner(System.in);
//            Random random = new Random();
//            int randVal = random.nextInt(2);
//            System.out.println("0 - ножницы, 1 - камень, 2 - бумага");
//            System.out.println("Введите цифру чтобы играть, либо 99 чтобы выйти: ");
//            int userVal = scan.nextInt();
//            if (userVal == 99) {
//                System.out.println("Спасибо за игру!");
//                break;
//            }
//            else if (userVal <= 2) {
//                sulifa(randVal, userVal);
//            }
//            else {
//                System.out.println("Ввели не правильную цифру.");
//            }
//
//        }

//        int res = (int)power(2.7, 2);
//        System.out.println(res);
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Добро пожаловать в супермаркет!");
//        System.out.println("Введите сколько у вас с собой денег: ");
//        int money = scan.nextInt();
//        if (money >= 10) {
//            shoping(money);
//        } else if (money == 0) {
//            System.out.println("Без денег покупки не возможны.");
//        } else if (money < 0) {
//            System.out.println("Не правильно ввели цифры, попробуйте заново.");
//        } else {
//            System.out.println("Слишком мало денег. Минимальная стоимость продуктов 10$");
//        }

//FootballPlayer player1 = new FootballPlayer("Terry", "Defender");
//FootballPlayer player2 = new FootballPlayer("Drogba", "Forward", 11, 40);
//
//player1.setNumber(26);
//System.out.println("Имя игрока " + player1.getName() + ", позиция " + player1.getPosition() + ", номер " + player1.getNumber());
//System.out.println("Второй игрок " + player2.getName());

Kazakh kazakh1 = new Kazakh("Kipchak", "Nurkhan", new String[]{"1 ata", "2 ata", "3 ata", "4 ata", "5 ata", "6 ata", "7 ata"});
System.out.println("Имя " + kazakh1.getName() + ", ру " + kazakh1.getRu() + ", 7 ата: ");
kazakh1.getZhetiAta();
    } // Заканчивается метод main

//    private static void shoping(int money) {
//        String[] shopList = new String[200]; //список покупок, максимум 200 позиций
//        int[] priceList = new int[shopList.length]; //список цен, равен со списком покупок
//        Scanner scan = new Scanner(System.in);
//        Date date = new Date();
//        Random random = new Random(); //для рандомных цен
//        int sum = 0; //для суммирования покупок
//        int count = 0; //для подсчета позиций
//
//        // Внесение продуктов:
//        for (int i = 0; i <= shopList.length; i++) {
//            System.out.println("Введите какой продукт собираетесь брать, либо слово 'стоп' если закончили покупки: ");
//            shopList[i] = scan.nextLine();
//            if (!shopList[i].equals("стоп") || shopList[i].equals("Стоп")) {
//                priceList[i] = random.nextInt(10, 100);
//                count++;
//            }
//            else {
//                break;
//            }
//        }
//
//        // Вывод списка:
//        System.out.println(date.toString());
//        System.out.println("Ваши покупки: ");
//        for (int i = 0; i <= shopList.length; i++) {
//            if (shopList[i].equals("стоп") || shopList[i].equals("Стоп")) {
//                break;
//            }
//            sum = sum + priceList[i];
//            System.out.println((i+1) + ". " + shopList[i] + " - " + priceList[i] + "$;");
//        }
//
//        System.out.println("Итого: " + sum + "$.");
//        System.out.println();
//
//        // Если не хватает денег, убираем продукты:
//        if (sum > money) {
//            while (sum > money) {
//                System.out.println("Не хватает " + (sum - money) + "$. Нужно " + sum + "$, а у вас " + money + "$. ");
//                System.out.println("Нужно убрать одну или несколько продуктов чтобы хватило оплатить. Напишите номер позиций в чеке: ");
//                int position = scan.nextInt();
//                if (position > count || position < 1) {
//                    System.out.println("Ошиблись номером позиций. Повторите попытку.");
//                    System.out.println();
//                }
//                else {
//                    System.out.println("Убираем продукт " + shopList[position - 1] + " стоимостью - " + priceList[position - 1] + "$.");
//                    System.out.println();
//                    sum = sum - priceList[position - 1];
//                }
//            }
//        }
//
//        // Вывод итоговой суммы:
//        System.out.println();
//        System.out.println("Оплата прошла, спасибо за покупку.");
//        System.out.println("На счету осталось " + (money - sum) + "$.");
//    }


//    private static void sulifa(int randVal, int userVal) {
//            if (userVal <= 2) {
//                if (randVal == userVal) {
//                    System.out.println("ничья");
//                    System.out.println();
//                }
//                else if (randVal == 0) {
//                    if (userVal == 1) {
//                        System.out.println("Компьютер выбрал цифру - " + randVal + ". Вы выиграли!");
//                        System.out.println();
//                    }
//                    else if (userVal == 2) {
//                        System.out.println("Компьютер выбрал цифру - " + randVal + ". Вы проиграли!");
//                        System.out.println();
//                    }
//                }
//                else if (randVal == 1) {
//                    if (userVal == 0) {
//                        System.out.println("Компьютер выбрал цифру - " + randVal + ". Вы проиграли!");
//                        System.out.println();
//                    }
//                    else if (userVal == 2) {
//                        System.out.println("Компьютер выбрал цифру - " + randVal + ". Вы выиграли!");
//                        System.out.println();
//                    }
//                }
//                else if (randVal == 2) {
//                    if (userVal == 0) {
//                        System.out.println("Компьютер выбрал цифру - " + randVal + ". Вы выиграли!");
//                        System.out.println();
//                    }
//                    else if (userVal == 1) {
//                        System.out.println("Компьютер выбрал цифру - " + randVal + ". Вы проиграли!");
//                        System.out.println();
//                    }
//                }
//            }
//            else {
//                System.out.println("Ввели не правильную цифру");
//                System.out.println();
//            }
//        }
//
//    public static int addition(int a, int b) {
//        return a + b;
//    }
//    public static int multiplication(int a, int b) {
//        return a * b;
//    }
//    public static double division(double a, double b) {
//        return a / b;
//    }
//    public static int minus(int a, int b) {
//        return a - b;
//    }


}