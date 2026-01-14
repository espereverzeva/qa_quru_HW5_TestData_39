package tests;

import org.junit.jupiter.api.Test;
import pages.RegistrationPage;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static tests.TestData.*;

public class RegistrationWithPageObjectsTests extends TestBase {

    RegistrationPage registrationPage = new RegistrationPage();
    TestData testData = new TestData();

    @Test
    void fillFormTest() {
        registrationPage.openPage()
                .removeBanner()
                .setFirstName(firstName)
                .setLastName(lastName)
                .setEmaiName(email)
                .setGender(gender)
                .setNumberName(phoneNumber)
                .setDateOfBirth(day,month,year)
                .setSubject(subjects)
                .setHobbies(hobbies)
                .setUploadPicture(picture)
                .setCurrentAddress(fullAddress)
                .setState(testData.state)
                .setCity(testData.city)
                .setSubmit()
                .checkResult("Student Name", fullName)
                .checkResult("Student Email", email)
                .checkResult("Gender", gender)
                .checkResult("Mobile", phoneNumber)
                .checkResult("Date of Birth", dateBirth)
                .checkResult("Subjects", subjects)
                .checkResult("Hobbies", hobbies)
                .checkResult("Picture", picture)
                .checkResult("Address", fullAddress)
                .checkResult("State and City", testData.state + " " + testData.city)
                .closeModal();

    }


    @Test
    void minFormTest() {
            registrationPage.openPage()
                    .setFirstName(firstName)
                    .setLastName(lastName)
                    .setGender(gender)
                    .setNumberName(phoneNumber)
                    .setSubmit()
                    .checkResult("Student Name", fullName)
                    .checkResult("Gender", gender)
                    .checkResult("Mobile", phoneNumber)
                    .closeModal();

    }

    @Test
    void negativeFormTest() {
        registrationPage.openPage()
                .setFirstName(firstName)
                //не заполнена фамилия
                .setGender(gender)
                .setNumberName(phoneNumber)
                .setSubmit()
                .checkResult("Student Name", fullName)
                .checkResult("Gender", gender)
                .checkResult("Mobile", phoneNumber)
                .closeModal();

    }

}