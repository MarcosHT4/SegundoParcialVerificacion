package web.webTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class SignUpCreateProjectTest extends TestBase {

    String nameProject = "Proyecto Marcos " + LocalTime.now().format(DateTimeFormatter.ofPattern("HHmmss"));

    @Test
    public void signUpCreateProjectTest() {
        mainPage.signUpButton.click();
        signUpPage.fullNameTextbox.setText("Marcos");
        signUpPage.emailTextbox.setText("marcosvpsi38cfgcgf4957@vpsi.com");
        signUpPage.passwordTextbox.setText("12345");
        signUpPage.acceptTermsButton.click();
        signUpPage.signUpButton.click();
        Assertions.assertTrue(centralSection.openSettingsButton.isControlDisplayed(), "ERROR! El usuario no se creó!");
        projectSection.addProjectButton.click();
        projectSection.projectNameTextBox.setText(nameProject);
        projectSection.projectNameButton.click();
        Assertions.assertTrue(projectSection.addNameToProjectLabel(nameProject).isControlDisplayed(), "ERROR! El proyecto no se creo!");
        navBarSection.openInfoButton.click();
        navBarSection.openSettingsButton.click();




    }



}
