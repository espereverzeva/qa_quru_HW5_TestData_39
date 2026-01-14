package tests;

import org.junit.jupiter.api.Test;
import pages.RegistrationPage;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class RegistrationWithPageObjectsTests extends TestBase {

    RegistrationPage registrationPage = new RegistrationPage();


    @Test
    void fillFormTest() {
        registrationPage.openPage()
                .removeBanner()
                .setFirstName("Anna")
                .setLastName("Big")
                .setEmaiName("Big@mai.ru")
                .setGender("Female")
                .setNumberName("9638527441")
                .setDateOfBirth("19", "March", "1991")
                .setSubject("Chemistry")
                .setHobbies("Sports")
                .setUploadPicture("zxc.png")
                .setCurrentAddress("Russia, Novosibirsk")
                .setState("Haryana")
                .setCity("Karnal")
                .setSubmit()
                .checkResult("Student Name", "Anna Big")
                .checkResult("Student Email", "Big@mai.ru")
                .checkResult("Gender", "Female")
                .checkResult("Mobile", "9638527441")
                .checkResult("Date of Birth", "19 March,1991")
                .checkResult("Subjects", "Chemistry")
                .checkResult("Hobbies", "Sports")
                .checkResult("Picture", "zxc.png")
                .checkResult("Address", "Russia, Novosibirsk")
                .checkResult("State and City", "Haryana Karnal")
                .closeModal();

    }


    @Test
    void minFormTest() {
            registrationPage.openPage()
                    .setFirstName("Anna")
                    .setLastName("Big")
                    .setGender("Female")
                    .setNumberName("9638527441")
                    .setSubmit()
                    .checkResult("Student Name", "Anna Big")
                    .checkResult("Gender", "Female")
                    .checkResult("Mobile", "9638527441")
                    .closeModal();

    }

    @Test
    void negativeFormTest() {
        registrationPage.openPage()
                .setFirstName("Anna")
                //не заполнена фамилия
                .setGender("Female")
                .setNumberName("9638527441")
                .setSubmit()
                .checkResult("Student Name", "Anna")
                .checkResult("Gender", "Female")
                .checkResult("Mobile", "9638527441")
                .closeModal();

    }

}