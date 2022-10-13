package pageObjects;

import com.microsoft.playwright.*;
import org.junit.Test;

public class MyTest {

    public void mytest() {
        Playwright pw = Playwright.create();
        Page pg = pw.chromium().launch(new BrowserType.LaunchOptions().setHeadless(true)).newPage();
        pg.navigate("https://github.com");
        System.out.println(pg.title());

    }

}
