package ChapterThree;

public class HeartRate {
    private String firstName;
    private String lastName;

    private int age;

    public HeartRate(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;


    }

    public int getMaximumHeartRate() {
        return 220 - getAge();
    }

    public void setTargetHeartRateRange() {
        System.out.printf("%.1f to %.1f BPM (beats per minute)",
                getMaximumHeartRate() * 0.50, getMaximumHeartRate() * 0.85);
    }

    // Setters
    public void setFirstName(String first) {
        firstName = first;
    }

    public void setLastName(String last) {
        lastName = last;
    }

    public void setAge(int currentAge) {
        age = currentAge;
    }

    // Getters
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

}

