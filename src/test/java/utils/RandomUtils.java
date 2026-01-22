package utils;

import com.github.javafaker.Faker;


public class RandomUtils {
    private final Faker faker = new Faker();

    public String getRandomState() {
        return faker.options().option("NCR", "Uttar Pradesh", "Haryana", "Rajasthan");
    }

    public String getRandomCity(String state) {
        return switch (state) {
            case "NCR" -> faker.options().option("Delhi", "Gurgaon", "Noida");
            case "Uttar Pradesh" -> faker.options().option("Agra", "Lucknow", "Merrut");
            case "Haryana" -> faker.options().option("Karnal", "Panipat");
            case "Rajasthan" -> faker.options().option("Jaipur", "Jaiselmer");
            default -> null;
        };
    }

    public String getFirstName() {
        return faker.name().firstName();
    }

    public String getLastName() {
        return faker.name().lastName();
    }

    public String getEmail() {
        return faker.internet().emailAddress();
    }

    public String getGender() {
        return faker.options().option("Male", "Female", "Other");
    }

    public String getPhoneNumber() {
        return faker.phoneNumber().subscriberNumber(10);
    }

    public String getDay() {
        return String.format("%s", faker.number().numberBetween(1, 28));
    }

    public String getMonth() {
        return faker.options().option("January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December");
    }

    public String getYear() {
        return String.format("%s", faker.number().numberBetween(1920, 2025));
    }

    public String getPicture() {
        return faker.options().option("aaa.png", "zxc.png");
    }

    public String getFullAddress() {
        return faker.address().fullAddress();
    }

    public String getSubjects() {
        return faker.options().option("Arts", "Accounting", "Biology",
                "Civics", "English", "Economics", "Hindi", "History", "Maths", "Physics",
                "Computer Science", "Chemistry", "Commerce", "Social Studies");
    }

    public String getHobbies() {
        return faker.options().option("Sports", "Reading", "Music");
    }
}
