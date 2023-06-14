package web.pages.todoist;

import org.openqa.selenium.By;
import web.controls.Button;

public class NavBarSection {

    public Button openInfoButton = new Button(By.xpath("//div[contains(@class,'avatar')]"));
    public Button openSettingsButton = new Button(By.xpath("//span[contains(text(), 'Config')]"));

    public Button logoutButton = new Button(By.xpath("//span[contains(text(), 'Cerrar')]"));






}
