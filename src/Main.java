import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StepTracker stepTracker = new StepTracker();

        printMenu();
        int userInput = scanner.nextInt();

        while (userInput != 0) {
            if (userInput == 1) {
                System.out.println("Выберете месяц:");
                System.out.println("1 - Январь");
                System.out.println("2 - Февраль");
                System.out.println("3 - Март");
                System.out.println("4 - Апрель");
                System.out.println("5 - Май");
                System.out.println("6 - Июнь");
                System.out.println("7 - Июль");
                System.out.println("8 - Август");
                System.out.println("9 - Сентябрь");
                System.out.println("10 - Октябрь");
                System.out.println("11 - Ноябрь");
                System.out.println("12 - Декабрь");
                int month = scanner.nextInt();
                while (month < 1 || month > 12) {
                    System.out.println("Введите номер месяца от 1 до 12");
                    month = scanner.nextInt();
                }

                System.out.println("Введите номер дня от 1 до 30:");
                int day = scanner.nextInt();
                while (day < 1 || day > 30) {
                    System.out.println("Неправильное значение! Введите номер дня от 1 до 30:");
                    day = scanner.nextInt();
                }

                System.out.println("Введите количество шагов:");
                int steps = scanner.nextInt();
                while (steps < 0) {
                    System.out.println("Нужно ввести положительное число шагов");
                    steps = scanner.nextInt();
                }

                stepTracker.savingStepsInDay(month, day, steps);

            } else if (userInput == 2) {
                System.out.println("Введите номер месяца за который хотите получить статистику:");
                System.out.println("Выберете месяц:");
                System.out.println("1 - Январь");
                System.out.println("2 - Февраль");
                System.out.println("3 - Март");
                System.out.println("4 - Апрель");
                System.out.println("5 - Май");
                System.out.println("6 - Июнь");
                System.out.println("7 - Июль");
                System.out.println("8 - Август");
                System.out.println("9 - Сентябрь");
                System.out.println("10 - Октябрь");
                System.out.println("11 - Ноябрь");
                System.out.println("12 - Декабрь");
                int month = scanner.nextInt();
                if (month < 1) {
                    System.out.println("Введите номер месяца от 1 до 12");
                } else if (month > 12) {
                    System.out.println("Введите номер месяца от 1 до 12");
                }
                stepTracker.quantityStepsInMonth(month);
                System.out.println("Всего в этом месяце вы прошли:" + stepTracker.sumStepsInMonth(month));
                stepTracker.maxSteps(month);
                stepTracker.averageValueSteps(month);
                stepTracker.distance(month);
                stepTracker.calories (month);
                stepTracker.bestSeries (month);

            } else if (userInput == 3) {
                System.out.println("Введите вашу новую цель по количеству шагов:");
                int newPurposeSteps = scanner.nextInt();
                stepTracker.purposeSteps(newPurposeSteps);

            } else if (userInput == 0) {
                System.out.println("Выход");
                break;
            } else {
                System.out.println("Извините, такой команды пока нет.");
            }
            // обработка разных случаев
            printMenu(); // печатаем меню ещё раз перед завершением предыдущего действия
            userInput = scanner.nextInt(); // повторное считывание данных от пользователя

            System.out.println("Программа завершена");
        }
    }

    private static void printMenu() {
        System.out.println("Что вы хотите сделать? ");
        System.out.println("1 - Ввести количество шагов за определённый день");
        System.out.println("2 - Напечатать статистику за определённый месяц");
        System.out.println("3 - Изменить цель по количеству шагов в день");
        System.out.println("0 - Выход из приложения");
    }
}
