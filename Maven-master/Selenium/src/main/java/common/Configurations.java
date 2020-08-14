package common;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Configurations {

	public static String DRIVER_DIR = System.getProperty("user.dir") + File.separator + "drivers" + File.separator;
	public static String GECKO_DRIVER_PATH = DRIVER_DIR + "geckodriver";
	public static String CHROME_DRIVER_PATH = DRIVER_DIR + "chromedriver";
	
	private static String modifyIfWindows(String inPath) {
		if (System.getProperty("os.name").toLowerCase().contains("windows")) {
			return inPath + ".exe";
		} else {
			return inPath;
		}
	}

	public static WebDriver createFireFoxDriver() {
		System.setProperty("webdriver.gecko.driver", modifyIfWindows(GECKO_DRIVER_PATH));
		return new FirefoxDriver();
	}

	public static WebDriver createChromeDriver() {
		System.setProperty("webdriver.chrome.driver", modifyIfWindows(CHROME_DRIVER_PATH));
		return new ChromeDriver();
	}

}
