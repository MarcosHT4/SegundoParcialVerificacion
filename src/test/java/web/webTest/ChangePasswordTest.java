package web.webTest;

import dev.failsafe.internal.util.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ChangePasswordTest extends TestBaseDos{

    String oldPassword = "pole54321";
    String newPassword = "pole12345";

    @Test
    public void verifyChangePasswordTest() throws InterruptedException {
        mainTodoistPage.loginButton.click();
        loginPage.emailTextBox.setText("msimon123@vpsi.com");
        loginPage.passwordTextBox.setText(oldPassword);
        loginPage.loginButton.click();
        navBarSection.openInfoButton.click();
        navBarSection.openSettingsButton.click();
        settingsPopUp.changePasswordButton.click();
        changePasswordSection.oldPasswordTextBox.setText(oldPassword);
        changePasswordSection.newPasswordTextBox.setText(newPassword);
        changePasswordSection.repeatNewPasswordTextBox.setText(newPassword);
        changePasswordSection.changePasswordButton.click();
        Thread.sleep(3000);
        Assertions.assertFalse(changePasswordSection.newPasswordTextBox.isControlDisplayed(), "ERROR!! No se pudo cambiar la contrasena");
        settingsPopUp.exitSettingsButton.click();
        navBarSection.openInfoButton.click();
        navBarSection.logoutButton.click();
        mainTodoistPage.loginButton.click();
        loginPage.emailTextBox.setText("msimon123@vpsi.com");
        loginPage.passwordTextBox.setText(newPassword);
        loginPage.loginButton.click();
        Thread.sleep(3000);
        Assertions.assertTrue(navBarSection.openInfoButton.isControlDisplayed(), "ERROR!! No se pudo iniciar sesion con la nueva contrasena");

    }

}
