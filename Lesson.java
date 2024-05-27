import javax.swing.*;

public class Lesson {
    public static void main (String[] args){
        printThreeWords();
        checkSumSing();
        printColor();
        compareNumbers();
        intNumb();
        pozitivNum();
        pozNegat();



    }

    public static void printThreeWords() {
        System.out.println("Orange\nBanana\nApple");
    }
public static void checkSumSing() {
    int a = 7;
    int b = -10;
    int c = a + b;
    if (c >= 0) {
        System.out.println("Сумма положительная");
    } else {
        System.out.println("Сумма отрицательная");}}
public static void printColor() {
        int value =56;
        if(value<=0){
            System.out.println("Красный");
        }if(value>0 && value <101){
        System.out.println("Желтый");}
if(value>100){
    System.out.println("Зеленый");}}
public static void compareNumbers() {
        int a = 10;
        int b = 14;
        if (a<b) {
            System.out.println("a<b");}
        if (a>=b) {
            System.out.println("a >= b");
        }}

    public static void intNumb() {
        int d = 0;
        int f = 1;
        if ((d + f) > 10 && (d + f) < 20)
        {
            System.out.println("true");}
        else {
            System.out.println("false");
        }
    }

    public static void pozitivNum() {
        int a;
        a=0;
        if (a>=0) {
            System.out.println("Число положительное");}
            else {
            System.out.println("Число отрицательное");
        }
    }
public static void pozNegat() {
    int value = -4;
    if (value < 0) {
        System.out.println("true");
    } else {
        System.out.println("false");
    }
}}