import org.apache.commons.lang.ArrayUtils;
import org.apache.commons.lang.StringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.w3c.dom.ls.LSOutput;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/AndrewBall/IdeaProjects/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.gmail.com/");
        Thread.sleep(2000);
        driver.manage().window().maximize();
        driver.findElement(By.id("identifierId")).sendKeys("sid.ada.beacon@gmail.com");
        driver.findElement(By.className("Cwak9")).click();
        String at = driver.getTitle();
        String et = "gmail";
        driver.close();
        if(at.equalsIgnoreCase(et))
        {
            System.out.println("Test Success");
        }else {
            System.out.println("Test Failed");
        }

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter Something: ");
//        String input = scanner.nextLine();
//        System.out.println(input.isBlank());
//        System.out.println(input.endsWith("ing"));
//        if (StringUtils.isNumericSpace(input)){
//            System.out.println(input + "Is Numeric");
//        }else{
//            System.out.println(input + "Is not numeric");
//        }
//        String flip = StringUtils.swapCase(input);
//        System.out.println(flip);
    }


}
