import com.microsoft.playwright.*;
import org.junit.Test;

public class MyTest {

    @Test
    public void mytest() {
        Playwright pw = Playwright.create();
        Page pg = pw.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false)).newPage();
        pg.navigate("https://github.com");
        System.out.println(pg.title());
        pg.click("text=Sign in");
        pg.fill("id=login_field","manjushab20");
        pg.fill("id=password","Manju@123");
        pg.onDialog(Dialog -> Dialog.accept());
        pg.reload();
    }

}
