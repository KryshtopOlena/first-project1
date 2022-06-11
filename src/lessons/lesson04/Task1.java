package lessons.lesson04;

public class Task1 {

    public static void main(String[] args) {
        int employee1 = 3000;
        int employee2 = 4500;
        int employee3 = 5800;
        int allPeriod = 120;
        double tax = 0.95;
        int salaryResults1 = employee1 * allPeriod;
        int salaryResults2 = employee2 * allPeriod;
        int salaryResults3 = employee3 * allPeriod;
        System.out.println("Загальна зарплата 1. = " + salaryResults1 + ";" );
        System.out.println("Загальна зарплата 2. = " + salaryResults2 + ";" );
        System.out.println("Загальна зарплата 3. = " + salaryResults3 + ";" );
        double taxResults1 = salaryResults1 * tax;
        double taxResults2 = salaryResults2 * tax;
        double taxResults3 = salaryResults3 * tax;
        System.out.println( "Зарплата після налога 1. = " + taxResults1);
        System.out.println( "Зарплата після налога 2. = " + taxResults2);
        System.out.println( "Зарплата після налога 3. = " + taxResults3);
        double average = ( taxResults1 + taxResults2 + taxResults3 ) / 3;
        System.out.println("Середня зарплата після налога = " + average);

    }
}
