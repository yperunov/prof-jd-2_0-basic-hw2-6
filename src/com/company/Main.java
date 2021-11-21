package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //Task0
        System.out.println("Пишем наше ДЗ");
        System.out.println("Делаем коммит в пуш");
        System.out.println("Переходим в гитхаб");

        //Task1
        byte basketNumber = 41;
        short respondentNumber = 2685;
        int earthToSunDistance = 149_600_000;
        long newRandomNumber = 123_456_789_012L;
        float constantPiStandard = 3.1415927f;
        double constantPiExtended = 3.141592653589793;
        char firstLetterMyName = 89;
        boolean firstTaksMade = true;

        //Task2
        float boxer1Weight = 78.2f;
        float boxer2Weight = 82.7f;
        System.out.println("Общий вес двух бойцов: " + (boxer1Weight+boxer2Weight) + "кг");
        System.out.println("Разница веса двух бойцов: " + (boxer2Weight-boxer1Weight) +"кг");

        //Task3
        int bananQty = 5;
        int bananPcsWgt = 80;
        int bananTtlWgt= bananPcsWgt * bananQty;
        int milkVolume = 200;
        int milk100MlWgt = 105;
        int coef100ToVolume = milkVolume/100;
        int milkTtlWgt = milk100MlWgt * coef100ToVolume;
        int icecreamQty = 2;
        int icecreamPcsWgt = 100;
        int icecreamTtlWgt = icecreamPcsWgt * icecreamQty;
        int eggQty = 4;
        int eggPcsWgt = 70;
        int eggTtlWgt = eggPcsWgt * eggQty;
        int breakfastTtlWgtGramm = bananTtlWgt + milkTtlWgt + icecreamTtlWgt + eggTtlWgt;
        float breakfastTtlWgtKilo = breakfastTtlWgtGramm / 1000f;
        System.out.println("Вес спорт-завтрака: " + breakfastTtlWgtKilo + "кг");

        //Task4
        int wgtToLooseKilo = 7;
        int wgtToLooseGram = wgtToLooseKilo * 1000;
        int minWgtLoosePerDay = 250;
        int maxWgtLoosePerDay = 500;
        int daysToLooseWgtShrt = wgtToLooseGram / maxWgtLoosePerDay;
        int daysToLooseWgtLong = wgtToLooseGram / minWgtLoosePerDay;
        int averageWgtLoosePerDay = (minWgtLoosePerDay + maxWgtLoosePerDay) / 2;
        int daysToLooseWgtAverage = wgtToLooseGram / averageWgtLoosePerDay;
        System.out.println("Количество дней для похудения при потере 250 грамм в день: " + daysToLooseWgtLong);
        System.out.println("Количество дней для похудения при потере 500 грамм в день: " + daysToLooseWgtShrt);
        System.out.println("Среднее количество дней для похудения: " + daysToLooseWgtAverage);

        //Task5
        float salaryMashaPerMonth = 67_760f;
        float salaryDenisPerMonth = 83_690f;
        float salaryKristinaPerMonth = 76_230f;
        float salaryIndexation = 1.1f;
        float monthInOneYear = 12f;
        float salaryMashaPerMonthIndexation = salaryMashaPerMonth * salaryIndexation;
        float salaryDenisPerMonthIndexation = salaryDenisPerMonth * salaryIndexation;
        float salaryKristinaPerMonthIndexation = salaryKristinaPerMonth * salaryIndexation;
        float salaryMashaPerYearInitial = salaryMashaPerMonth * monthInOneYear;
        float salaryDenisPerYearInitial = salaryDenisPerMonth * monthInOneYear;
        float salaryKristinaPerYearInitial = salaryKristinaPerMonth * monthInOneYear;
        float salaryMashaPerYearIndexation = salaryMashaPerMonthIndexation * monthInOneYear;
        float salaryDenisPerYearIndexation = salaryDenisPerMonthIndexation * monthInOneYear;
        float salaryKristinaPerYearIndexation = salaryKristinaPerMonthIndexation * monthInOneYear;
        float salaryMashaDifference = salaryMashaPerYearIndexation - salaryMashaPerYearInitial;
        float salaryDenisDifference = salaryDenisPerYearIndexation - salaryDenisPerYearInitial;
        float salaryKristinaDifference = salaryKristinaPerYearIndexation - salaryKristinaPerYearInitial;
        System.out.println("Маша теперь получает " + salaryMashaPerMonthIndexation + " рублей. " + "Годовой доход вырос на " + salaryMashaDifference + " рублей.");
        System.out.println("Денис теперь получает " + salaryDenisPerMonthIndexation + " рублей. " + "Годовой доход вырос на " + salaryDenisDifference + " рублей.");
        System.out.println("Кристина теперь получает " + salaryKristinaPerMonthIndexation + " рублей. " + "Годовой доход вырос на " + salaryKristinaDifference + " рублей.");



    }
}
