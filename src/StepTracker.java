public class StepTracker {
    MonthData[] monthToData;
    int purposeSteps = 10000;

    Converter converter = new Converter();


    public StepTracker() {
        monthToData = new MonthData[12];
        for (int i = 0; i < monthToData.length; i++) {
            monthToData[i] = new MonthData();
        }
    }

    class MonthData {
        int[] daySteps = new int[30];

        void setSteps(int day, int steps) {
            daySteps[day] = steps;
        }

        int getSteps(int day) {
            return daySteps[day];
        }
    }

    void savingStepsInDay(int month, int day, int steps) {

            monthToData[month - 1].setSteps( (day - 1), steps);
            System.out.println("Значение сохранено");
        }


    void quantityStepsInMonth(int month) {
        //  статистика шагов в месяце
        for (int i = 0; i < monthToData[month - 1].daySteps.length; i++) {
            System.out.println((i + 1) + " день: " + monthToData[month - 1].getSteps(i) + " шагов");
        }
    }

    int sumStepsInMonth(int month) {
        // общее количество шагов за месяц
        int sumSteps = 0;
        for (int i = 0; i < monthToData[month - 1].daySteps.length; i++) {
            sumSteps = sumSteps + monthToData[month - 1].daySteps[i];
        }

        return sumSteps;

    }

    void maxSteps(int month) {
        // максимальное количество шагов за месяце
        int maxSteps = 0;
        for (int i = 0; i < monthToData[month - 1].daySteps.length; i++) {
            if (monthToData[month - 1].getSteps(i) > maxSteps) {
                maxSteps = monthToData[month - 1].getSteps(i);
            }
        }
        System.out.println("Максимальное количество шагов в этом месяце:" + maxSteps);
    }

    void averageValueSteps(int month) {
        int sum = sumStepsInMonth(month);
        double average = sum / monthToData[month - 1].daySteps.length;
        System.out.println("Среднее количество шагов в этом месяце:" + average);
    }

    void distance(int month) {
        int sum = sumStepsInMonth(month);
        System.out.println("Пройденная дистанция (в км):" + converter.distanceInKilometres(sum));
    }
    void calories (int month) {
        int sum = sumStepsInMonth(month);
        System.out.println("Количество сожжённых килокалорий:" + converter.calories(sum));
    }
    void bestSeries (int month) {
    int bestSeries = 0;
    int maxBestSeries = 0;

        for (int i = 0; i < monthToData[month - 1].daySteps.length; i++){
        if (monthToData[month - 1].getSteps(i) >= purposeSteps) {
            bestSeries = bestSeries + 1;

            if (bestSeries > maxBestSeries) {
                maxBestSeries = bestSeries;
            }
        } else {
            bestSeries = 0;
        }
            }
        System.out.println("Лучшая серия: " + maxBestSeries);
        }

    void purposeSteps(int newPurposeSteps) {
        if (newPurposeSteps > 0) {
            purposeSteps = newPurposeSteps;
        } else {
            System.out.println("Введите положительное число!");
        }
        }

}




