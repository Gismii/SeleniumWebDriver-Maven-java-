import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver; // biblioteca;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BasicTes {

    // atributos / caracteristicas

  String url;     // endere site alvo
  WebDriver driver;  //objeto selenium webdrive

    //Métodos ou funções
    @Before
    public void iniciar(){
      url = "https://proway.evolke.com.br/lms/learning/index.php?elc=cb68fe9db020eea891ba409df15f87a7";

      // Informe ao selenium e ao navegador, que o chromeDrive está em tal lugar; (chromeDrive é uma ferramenta e não um navegador.
      System.setProperty("webdriver.chrome.driver","C:\\Users\\gisme\\.m2\\repository\\org\\seleniumhq\\selenium\\selenium-chrome-driver");
      driver = new ChromeDriver();
      driver.manage().timeouts().implicitlyWait(60000, TimeUnit.MILLISECONDS);
      driver.manage().window().maximize();



    }
    @After
    public void finalizar(){
      driver.quit();// finalioza o selenium


    }
    @Test
    public void consultar(){
      driver.get(url);  // vai abrir a pagina indicada pelo url
      driver.findElements(By.id("frame_conteudo")).clear();
      //driver.findElements(By.id("frame_conteudo")).sendkeys(Keys.chord(""));
      //driver.findElements(By.id("frame_conteudo")).s

    }

}

