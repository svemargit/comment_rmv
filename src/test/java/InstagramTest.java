import org.testng.annotations.Test;

public class InstagramTest extends Main {

  @Test
  public static void deleteInstagramComments() {
    InstagramPage ig = new InstagramPage().openAndLogin();
    for (int i = 0; i < 100; i++) {
      ig.selectComments(20);
      ig.delete();
    }
  }
}
