package web.webTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ChangePasswordTest extends TestBase{

    @Test
    public void verifyChangePasswordTest() throws InterruptedException {
        mainTodoistPage.loginButton.click();
        loginPage.emailTextBox.setText("msimon123@vpsi.com");
        loginPage.passwordTextBox.setText("pole12345");
        loginPage.loginButton.click();
        navBarSection.openInfoButton.click();
        navBarSection.openSettingsButton.click();

    }

}
