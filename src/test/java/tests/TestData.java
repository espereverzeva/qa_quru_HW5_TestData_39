package tests;

import com.github.javafaker.Faker;
import utils.RandomUtils;

public class TestData {
             static Faker faker = new Faker();
             RandomUtils randomUtils = new RandomUtils();

    static String firstName = faker.name().firstName(),
                  lastName = faker.name().lastName(),
                  fullName = firstName + " " + lastName,
                  email = faker.internet().emailAddress(),
                  gender = faker.options().option("Male", "Female", "Other"),
                  phoneNumber = faker.phoneNumber().subscriberNumber(10),
                  day = String.format("%s", faker.number().numberBetween(1, 28)),
                  month = faker.options().option("January", "February", "March", "April",
                    "May", "June", "July", "August", "September", "October", "November", "December"),
                  year = String.format("%s", faker.number().numberBetween(1920, 2025)),
                  dateBirth = day + " " + month + "," + year,
                  picture = faker.options().option("aaa.png","zxc.png"),
                  fullAddress = faker.address().fullAddress(),
                  subjects = faker.options().option("Arts","Accouting","Biology",
            "Civics","English","Economics","Hindi","History","Maths","Physics",
            "Computer Science","Chemistry","Commerce","Social Studies"),

                  hobbies = faker.options().option("Sports","Reading","Music");
                  String state = randomUtils.getRandomState(),
                  city = randomUtils.getRandomCity(state);

}
