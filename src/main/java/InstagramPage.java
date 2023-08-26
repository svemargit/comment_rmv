import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.*;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.ex.ElementNotFound;
import com.codeborne.selenide.ex.ElementShould;
import java.time.Duration;

public class InstagramPage {

  public InstagramPage openAndLogin() {
    open("https://www.instagram.com/your_activity/interactions/comments");
    $x("//button[text()='Allow all cookies']").should(visible, Duration.ofSeconds(30)).click();
    String username = "yourUsername"; // change username
    String password = "yourPassword"; // change password
    $x("//input[@name='username']").should(visible, Duration.ofSeconds(30)).setValue(username);
    $x("//input[@name='password']").setValue(password);
    $x("//button[@type='submit']").click();
    try {
      $x("//div[text()='Not now']").should(visible, Duration.ofSeconds(30)).click();
    } catch (ElementShould | ElementNotFound ignored) {
    }
    $x("//span[text()='Select']").should(visible, Duration.ofSeconds(30)).click();
    return page(this);
  }

  public InstagramPage selectComments(int howMany) {
    ElementsCollection comments = $$x("//div[contains(@style,'circle')]");
    int i = 0;
    for (SelenideElement comment : comments) {
      comment.should(enabled, Duration.ofSeconds(5)).scrollIntoView(true).click();
      i++;
      if (i == howMany) {
        break;
      }
    }
    return page(this);
  }

  public InstagramPage delete() {
    $x("//span[text()='Delete']").click();
    $x("//*[text()='Delete comments?']").should(visible, Duration.ofMinutes(5));
    $x("//button/div[text()='Delete']").click();
    sleep(5000);
    if ($x("//*[text()='Something went wrong']").exists()) {
      $x("//button/div[text()='OK']").click();
    }
    $x("//span[text()='Select']").should(visible, Duration.ofSeconds(30)).click();
    return page(this);
  }
}
