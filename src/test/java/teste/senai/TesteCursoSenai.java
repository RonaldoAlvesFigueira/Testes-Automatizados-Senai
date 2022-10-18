package teste.senai;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TesteCursoSenai {
private WebDriver driver;


@Before
public void ConfigurarTeste () {
	System.setProperty("webdriver.crome.driver","C:\\Users\\Micro\\Documents\\chromedriver.exe");
	driver = new ChromeDriver();
}
@Test
public void TesteNavegabilidade () {
	
}

}
