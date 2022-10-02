public class Main {
    public static void main(String[] args) {

        //Задача 1
                int number_1 = 1;
                System.out.println("Значение переменной number_1 с типом int равно " + number_1);
                byte number_2 = 2;
                System.out.println("Значение переменной number_2 с типом byte равно " + number_2);
                short number_3 = 3;
                System.out.println("Значение переменной number_3 с типом short равно " + number_3);
                long number_4 = 496587423L;
                System.out.println("Значение переменной number_4 с типом long равно " + number_4);
                float number_5 = 5.65f;
                System.out.println("Значение переменной number_5 с типом float равно " + number_5);
                double number_6 = 3.14;
                System.out.println("Значение переменной number_6 с типом double равно " + number_6);



       //Задача 2
        float num_1 = 27.12f;
        long num_2 = 987678965549L;
        char num_6 = 569;
        short num_7 = -159;
        int num_8 = 27897;
        boolean num_5 = false;
        byte num_4 = 67;
        double num_3 = 2.786;

        double numb_1 = 356.9965;
        System.out.println("Значение переменной numb_1 с типом double равно " + numb_1);
        float numb_10 = 36.6f;
        System.out.println("Значение переменной numb_10 с типом float равно " + numb_10);
        long numb_2 = 542874965874L;
        System.out.println("Значение переменной numb_2 с типом long равно " + numb_2);
        int numb_6 = 45693258;
        System.out.println("Значение переменной numb_6 с типом int равно " + numb_6);
        short numb_4 = 985;
        System.out.println("Значение переменной numb_4 с типом short равно " + numb_4);
        char numb_8 = 36952;
        System.out.println("Значение переменной numb_8 с типом char равно " + numb_8);
        boolean numb_5 = true;
        System.out.println("Значение переменной numb_5 с типом boolean равно " + numb_5);
        byte numb_9 = 127;
        System.out.println("Значение переменной numb_9 с типом byte равно " + numb_9);

    //Задача 3
        int luda = 23;
        int anna = 27;
        int kate = 30;
        int paper = 480;
        int students = luda + anna + kate;
        int paperForStudents = paper / students;
        System.out.println("На каждого ученика рассчитано " + paperForStudents + " листов бумаги.");

        //Задача 4
        int bottles = 16;
        int productionTime = 2;
        int totalProductionTime_1 = (bottles / productionTime) * 20;
        System.out.println("За 20 минут машина произвела бутылок " + totalProductionTime_1 + " штук ");
        int productionInHours = ((bottles / productionTime) * 60) * 24;
        System.out.println("За 24 часа машина произвела бутылок " + productionInHours + " штук ");
        int productionTimeDays = productionInHours * 3;
        System.out.println("За 3 суток машина произвела бутылок " + productionTimeDays + " штук ");
        int productionTimeInMonth = productionTimeDays * 10;
        System.out.println("За 1 месяц машина произвела бутылок " + productionTimeInMonth + " штук ");


        //Задача 5
        byte paintForSchool = 120;
        byte whitePaintForTheClassroom = 2;
        byte brownPaintForTheClassroom = 4;
        int classrooms = paintForSchool / (whitePaintForTheClassroom + brownPaintForTheClassroom);
        int totalWhitePaint = whitePaintForTheClassroom * classrooms;
        int totalBrownPaint = brownPaintForTheClassroom * classrooms;
        System.out.println("В школе, где " + classrooms + " классов, нужно " + totalWhitePaint + " банок белой краски и " + totalBrownPaint + " банок коричневой краски.");

        //Задача 6
        int bananas = 5;
        double weightOfOneBanana = 0.08;
        float milk = 0.2f;
        double weightOfOneMilk = 0.105;
        int iceCream = 2;
        double weightOfOneIceCream = 0.1;
        int egg = 4;
        double weightOfOneEgg = 0.07;
        double totalWeightOfProductsKg = (weightOfOneBanana * bananas) + ((weightOfOneMilk * milk) * 10) + (weightOfOneIceCream * iceCream) + (weightOfOneEgg * egg);
        double totalWeightOfProductsGram = totalWeightOfProductsKg * 1000;
        System.out.println("Общий вес продуктов в рецепте " + (int)totalWeightOfProductsGram + " грамм. Или " +  (float)totalWeightOfProductsKg + " кг.");

        //Задача 7
        double weightLossPlan_1 = 0.25;
        double weightLossPlan_2 = 0.5;
        float purpose = 7;
        double daysBeforeTheGoal_1 = purpose / weightLossPlan_1;
        double daysBeforeTheGoal_2 = purpose / weightLossPlan_2;
        double average = (daysBeforeTheGoal_1 + daysBeforeTheGoal_2) / 2;
        System.out.println("Для похудения на 7кг потребуется " + (int)daysBeforeTheGoal_1 + " дней, если сбрасывать по " + weightLossPlan_1 + "кг в день." +
                "Но если сбрасывать по " + weightLossPlan_2 + ", то потребуеься гораздо меньше времени, всего " + (int)daysBeforeTheGoal_2 + " дней. В среденем на похудение уйдет " + (int)average + " день.");

        //Задача 8
        int masha = 67760;
        int denis = 83690;
        int kristina = 76230;
        int raiseMasha = masha * (10 % 100 + 1);
        int raiseDenis = denis * (1 + 10 % 100);
        int raiseKristina = kristina * (1 + 10 % 100);
        int inYearMasha = (raiseMasha * 12) - (masha * 12);
        int inYearDenis = (raiseDenis * 12) - (denis * 12);
        int inYearKristina = (raiseKristina * 12) - (kristina * 12);
        System.out.println("Маша теперь получает " + raiseMasha + " рублей. Годовой доход вырос на " + inYearMasha + " рублей");
        System.out.println("Денис теперь получает " + raiseDenis + " рублей. Годовой доход вырос на " + inYearDenis + " рублей");
        System.out.println("Кристина теперь получает " + raiseKristina + " рублей. Годовой доход вырос на " + inYearKristina + " рублей");

    }


}

