package tests;

import org.junit.jupiter.api.Test;
import pages.RegistrationPage;


public class RegistrationWithPageObjectsTests extends TestBase {
    RegistrationPage registrationPage = new RegistrationPage();

    @Test
    void fillFormTest() {
        TestData testData = new TestData();

        registrationPage.openPage()
            .removeBanner()
            .setFirstName(testData.firstName)
            .setLastName(testData.lastName)
            .setEmaiName(testData.email)
            .setGender(testData.gender)
            .setNumberName(testData.phoneNumber)
            .setDateOfBirth(testData.day, testData.month, testData.year)
            .setSubject(testData.subjects)
            .setHobbies(testData.hobbies)
            .setUploadPicture(testData.picture)
            .setCurrentAddress(testData.fullAddress)
            .setState(testData.state)
            .setCity(testData.city)
            .setSubmit()
            .checkResult("Student Name", testData.fullName)
            .checkResult("Student Email", testData.email)
            .checkResult("Gender", testData.gender)
            .checkResult("Mobile", testData.phoneNumber)
            .checkResult("Date of Birth", testData.dateBirth)
            .checkResult("Subjects", testData.subjects)
            .checkResult("Hobbies", testData.hobbies)
            .checkResult("Picture", testData.picture)
            .checkResult("Address", testData.fullAddress)
            .checkResult("State and City", testData.state + " " + testData.city)
            .closeModal();
    }

    @Test
    void minFormTest() {
        TestData testData = new TestData();

        registrationPage.openPage()
            .removeBanner()
            .setFirstName(testData.firstName)
            .setLastName(testData.lastName)
            .setGender(testData.gender)
            .setNumberName(testData.phoneNumber)
            .setSubmit()
            .checkResult("Student Name", testData.fullName)
            .checkResult("Gender", testData.gender)
            .checkResult("Mobile", testData.phoneNumber)
            .closeModal();
    }

    @Test
    void negativeFormTest() {
        TestData testData = new TestData();

        registrationPage.openPage()
            .removeBanner()
            .setFirstName(testData.firstName)
            //не заполнена фамилия
            .setGender(testData.gender)
            .setNumberName(testData.phoneNumber)
            .setSubmit()
            .checkResult("Student Name", testData.fullName)
            .checkResult("Gender", testData.gender)
            .checkResult("Mobile", testData.phoneNumber)
            .closeModal();
    }
}
