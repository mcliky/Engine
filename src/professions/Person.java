package professions;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

public class Person {

    protected String fullName;
    protected String dateOfBirth;

    public Person(String fullName, String dateOfBirth) {
        this.fullName = fullName;
        this.dateOfBirth = dateOfBirth;
    }

    public void countAge() {
        LocalDate today = LocalDate.now();
//        String[] arr = dateOfBirth.split("\\.");
//        System.out.println(Arrays.toString(arr));
//        int year = Integer.parseInt(arr[2]);
//        int month = Integer.parseInt(arr[1]);
//        int day = Integer.parseInt(arr[0]);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d.MM.yyyy");
        LocalDate localDate = LocalDate.parse(dateOfBirth, formatter);
        System.out.println(localDate.getYear());
        LocalDate birthday = LocalDate.of(localDate.getYear(), localDate.getMonth(), localDate.getDayOfMonth());
        Period period = Period.between(birthday, today);
        System.out.println("Возраст водителя составляет " + period.getYears() + " лет");

    }

    @Override
    public String toString() {
        return "Person{" +
                "fullName='" + fullName + '\'' +
                '}';
    }
}
