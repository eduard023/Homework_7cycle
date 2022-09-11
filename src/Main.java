public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();
    }

    private static void task1(){
        //Задание 1
        System.out.println("Задача 1. Домашнее задание 1!");
        int money = 29000;
        int saveMoney = 0;
        for (int i = 1; saveMoney < 2_459_000; i++){
            saveMoney += saveMoney/100;
            saveMoney += money;
            System.out.println("Месяц "+ i + ", сумма накоплений равна " + saveMoney + " рублей.");
        }
    }

    private static void task2(){
        //Задание 1
        System.out.println("Задача 2. Домашнее задание 1!");
        int i = 1;
        while (i <= 9){
            i++;
            System.out.print(i+" ");
        }
        System.out.println();
        for (i = 10;i >= 1; i--) {
            System.out.print(i+" ");
        }
        System.out.println();
    }

    private static void task3(){
        //Задание 1
        System.out.println("Задача 3. Домашнее задание 1!");
        int countryPopulation = 12_000_000;
        int birthrate = 17;  // на 1000 человек
        int mortality = 8;   // на 1000 человек
        int years = 0;
        while (years < 10){
            years++;
            int totalBirthrate = countryPopulation / 1000 * birthrate; // общая рождаемость
            int totalMortality = countryPopulation / 1000 * mortality; // общая смертность
            countryPopulation += totalBirthrate - totalMortality;
            System.out.println("Год " + years + " численность населения состовляет "+ countryPopulation);
            System.out.println(totalBirthrate);
        }
    }

    private static void task4(){
        //Задание 2
        System.out.println("Задача 1. Домашнее задание 2!");
        int totalSum = 0;
        int deposit = 15000;
        int month = 0;
        while (totalSum <= 12_000_000){
            totalSum = totalSum + deposit;
            totalSum += (totalSum / 100 * 7);
            month++;
            System.out.println("Месяц: " + month + ". Сумма накоплений " + totalSum);
        }

    }

    private static void task5(){
        //Задание 2
        System.out.println("Задача 2. Домашнее задание 2!");
        int totalSum = 0;
        int deposit = 15000;
        int month = 0;
        while (totalSum <= 12_000_000){
            totalSum = totalSum + deposit;
            totalSum += (totalSum / 100 * 7);
            month++;
            if (month % 6 == 0) {
                System.out.println("Месяц: " + month + ". Сумма накоплений " + totalSum);
            }
        }
    }

    private static void task6(){
        //Задание 2
        System.out.println("Задача 3. Домашнее задание 2!");
        int totalSum = 0;
        int deposit = 15000;
        int month = 0;
        while (month <= 9 *12){ // 9 лет
            totalSum = totalSum + deposit;
            totalSum += (totalSum / 100 * 7);
            month++;
            if (month % 6 == 0){
                System.out.println("Месяц: " + month + " сумма накоплений: " + totalSum);
            }
        }
    }

    private static void task7(){
        //Задание 2
        System.out.println("Задача 4. Домашнее задание 2!");
        int firstFriday = 5;
        System.out.println("Сегодня пятница " + firstFriday + "-е число. Необходимо подготовить отчет.");
        while(firstFriday < 31){
            firstFriday = firstFriday + 7; //в недели 7 дней
            if(firstFriday < 31) {
                System.out.println("Сегодня пятница " + firstFriday + "-е число. Необходимо подготовить отчет.");
            }
        }
    }

    private static void task8(){
        //Задание 3
        System.out.println("Задача 1. Домашнее задание 3!");
        int years = 2022;
        int lastYears = years - 200;
        int nextYears = years + 100;
        for (int i = 0;i < nextYears; i +=79){
           if (i > lastYears){
                System.out.println(i);
            }
        }

    }

    private static void task9(){
        //Задание 3
        System.out.println("Задача 2. Домашнее задание 3!");
        int b = 1;
        for (int a = 2; b <= 10; b++){
            int c = a*b;
            System.out.println(a+"*"+b+"="+c );

        }
        }
    }
