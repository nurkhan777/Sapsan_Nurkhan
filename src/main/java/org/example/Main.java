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
//        System.out.println("������� ���� � �������: " + procentOil);
//    } else if (pol == 'f') {
//        procentOil = 76 - (20 * rost/taliya);
//        System.out.println("������� ���� � �������: " + procentOil);
//    }
//
//      �� - 2
//        Scanner in = new Scanner(System.in);
//        System.out.print("a: ");
//        int a = in.nextInt();
//        System.out.print("b: ");
//        int b = in.nextInt();
//        System.out.println("Zadanie 1: " + (a + b) / 2f);
//        System.out.println("Zadanie 2: " + a % b);
//
//        ������ �� while *****************************************************
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

    // ������ �� for

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
//        System.out.println("�����: " + sum);

        // ��-4
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
        // ��-5
//        Scanner scan = new Scanner(System.in);
//        int [][] arr = new int[3][3];
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 3; j++) {
//                System.out.println("������� �����: ");
//                arr[i][j] = scan.nextInt();
//            }
//        }
//
//        int [][] arr2 = new int[3][3];
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 3; j++) {
//                System.out.println("������� �����: ");
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

        // ��-6
//    while (true) {
//        Scanner scan = new Scanner(System.in);
//        System.out.println("������� ������ ����� ���� STOP: ");
//        String a = scan.nextLine();
//        if (a.equals("STOP")) {
//            break;
//        }
//        System.out.println("������� ������ ����� ���� STOP: ");
//        String b = scan.nextLine();
//        if (b.equals("STOP")) {
//            break;
//        }
//        int c = Integer.parseInt(a);
//        int d = Integer.parseInt(b);
//        System.out.println("����� ����� = " + addition(c, d));
//        System.out.println("������������ ����� = " + multiplication(c, d));
//        System.out.println("������� ����� = " + division(c, d));
//        System.out.println("����������� ����� = " + minus(c, d));
//    }

        // ��-7
//        while (true) {
//            Scanner scan = new Scanner(System.in);
//            Random random = new Random();
//            int randVal = random.nextInt(2);
//            System.out.println("0 - �������, 1 - ������, 2 - ������");
//            System.out.println("������� ����� ����� ������, ���� 99 ����� �����: ");
//            int userVal = scan.nextInt();
//            if (userVal == 99) {
//                System.out.println("������� �� ����!");
//                break;
//            }
//            else if (userVal <= 2) {
//                sulifa(randVal, userVal);
//            }
//            else {
//                System.out.println("����� �� ���������� �����.");
//            }
//
//        }

//        int res = (int)power(2.7, 2);
//        System.out.println(res);
//        Scanner scan = new Scanner(System.in);
//        System.out.println("����� ���������� � �����������!");
//        System.out.println("������� ������� � ��� � ����� �����: ");
//        int money = scan.nextInt();
//        if (money >= 10) {
//            shoping(money);
//        } else if (money == 0) {
//            System.out.println("��� ����� ������� �� ��������.");
//        } else if (money < 0) {
//            System.out.println("�� ��������� ����� �����, ���������� ������.");
//        } else {
//            System.out.println("������� ���� �����. ����������� ��������� ��������� 10$");
//        }

//FootballPlayer player1 = new FootballPlayer("Terry", "Defender");
//FootballPlayer player2 = new FootballPlayer("Drogba", "Forward", 11, 40);
//
//player1.setNumber(26);
//System.out.println("��� ������ " + player1.getName() + ", ������� " + player1.getPosition() + ", ����� " + player1.getNumber());
//System.out.println("������ ����� " + player2.getName());

Kazakh kazakh1 = new Kazakh("Kipchak", "Nurkhan", new String[]{"1 ata", "2 ata", "3 ata", "4 ata", "5 ata", "6 ata", "7 ata"});
System.out.println("��� " + kazakh1.getName() + ", �� " + kazakh1.getRu() + ", 7 ���: ");
kazakh1.getZhetiAta();
    } // ������������� ����� main

//    private static void shoping(int money) {
//        String[] shopList = new String[200]; //������ �������, �������� 200 �������
//        int[] priceList = new int[shopList.length]; //������ ���, ����� �� ������� �������
//        Scanner scan = new Scanner(System.in);
//        Date date = new Date();
//        Random random = new Random(); //��� ��������� ���
//        int sum = 0; //��� ������������ �������
//        int count = 0; //��� �������� �������
//
//        // �������� ���������:
//        for (int i = 0; i <= shopList.length; i++) {
//            System.out.println("������� ����� ������� ����������� �����, ���� ����� '����' ���� ��������� �������: ");
//            shopList[i] = scan.nextLine();
//            if (!shopList[i].equals("����") || shopList[i].equals("����")) {
//                priceList[i] = random.nextInt(10, 100);
//                count++;
//            }
//            else {
//                break;
//            }
//        }
//
//        // ����� ������:
//        System.out.println(date.toString());
//        System.out.println("���� �������: ");
//        for (int i = 0; i <= shopList.length; i++) {
//            if (shopList[i].equals("����") || shopList[i].equals("����")) {
//                break;
//            }
//            sum = sum + priceList[i];
//            System.out.println((i+1) + ". " + shopList[i] + " - " + priceList[i] + "$;");
//        }
//
//        System.out.println("�����: " + sum + "$.");
//        System.out.println();
//
//        // ���� �� ������� �����, ������� ��������:
//        if (sum > money) {
//            while (sum > money) {
//                System.out.println("�� ������� " + (sum - money) + "$. ����� " + sum + "$, � � ��� " + money + "$. ");
//                System.out.println("����� ������ ���� ��� ��������� ��������� ����� ������� ��������. �������� ����� ������� � ����: ");
//                int position = scan.nextInt();
//                if (position > count || position < 1) {
//                    System.out.println("�������� ������� �������. ��������� �������.");
//                    System.out.println();
//                }
//                else {
//                    System.out.println("������� ������� " + shopList[position - 1] + " ���������� - " + priceList[position - 1] + "$.");
//                    System.out.println();
//                    sum = sum - priceList[position - 1];
//                }
//            }
//        }
//
//        // ����� �������� �����:
//        System.out.println();
//        System.out.println("������ ������, ������� �� �������.");
//        System.out.println("�� ����� �������� " + (money - sum) + "$.");
//    }


//    private static void sulifa(int randVal, int userVal) {
//            if (userVal <= 2) {
//                if (randVal == userVal) {
//                    System.out.println("�����");
//                    System.out.println();
//                }
//                else if (randVal == 0) {
//                    if (userVal == 1) {
//                        System.out.println("��������� ������ ����� - " + randVal + ". �� ��������!");
//                        System.out.println();
//                    }
//                    else if (userVal == 2) {
//                        System.out.println("��������� ������ ����� - " + randVal + ". �� ���������!");
//                        System.out.println();
//                    }
//                }
//                else if (randVal == 1) {
//                    if (userVal == 0) {
//                        System.out.println("��������� ������ ����� - " + randVal + ". �� ���������!");
//                        System.out.println();
//                    }
//                    else if (userVal == 2) {
//                        System.out.println("��������� ������ ����� - " + randVal + ". �� ��������!");
//                        System.out.println();
//                    }
//                }
//                else if (randVal == 2) {
//                    if (userVal == 0) {
//                        System.out.println("��������� ������ ����� - " + randVal + ". �� ��������!");
//                        System.out.println();
//                    }
//                    else if (userVal == 1) {
//                        System.out.println("��������� ������ ����� - " + randVal + ". �� ���������!");
//                        System.out.println();
//                    }
//                }
//            }
//            else {
//                System.out.println("����� �� ���������� �����");
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