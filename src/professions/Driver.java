package professions;

public class Driver extends Person {

    private final int experience;

    public Driver(String fullName, String dateOfBirth, int experience) {
        super(fullName, dateOfBirth);
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "experience=" + experience +
                '}';
    }
}
