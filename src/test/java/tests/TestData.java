package tests;

import com.github.javafaker.Faker;
import utils.RandomUtils;

public class TestData {

             RandomUtils randomUtils = new RandomUtils();

       String firstName = randomUtils.getFirstName(),
                  lastName = randomUtils.getLastName(),
                  fullName = firstName + " " + lastName,
                  email = randomUtils.getEmail(),
                  gender = randomUtils.getGender(),
                  phoneNumber = randomUtils.getPhoneNumber(),
                  day = randomUtils.getDay(),
                  month = randomUtils.getMonth(),
                  year = randomUtils.getYear(),
                  dateBirth = day + " " + month + "," + year,
                  picture = randomUtils.getPicture(),
                  fullAddress = randomUtils.getFullAddress(),
                  subjects = randomUtils.getSubjects(),

                  hobbies = randomUtils.getHobbies();
                  String state = randomUtils.getRandomState(),
                  city = randomUtils.getRandomCity(state);

}
