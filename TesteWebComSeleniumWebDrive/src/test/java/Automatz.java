import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver; // biblioteca;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automatz {

    // atributos / caracteristicas

  String url;     // endere site alvo
  WebDriver driver;  //objeto selenium webdrive

    //Métodos ou funções
    @Before
    public void iniciar(){
      url = "https://github.com/Gismii";

      // Informe ao selenium e ao navegador, que o chromeDrive está em tal lugar; (chromeDrive é uma ferramenta e não um navegador.
      System.setProperty("webdriver.chrome.driver",
              "C:\\Users\\gisme\\.m2\\repository\\org\\seleniumhq\\selenium\\selenium-chrome-driver\\4.1.4");
      driver = new ChromeDriver();



    }
    @After
    public void finalizar(){


    }
    @Test
    public void consultar(){

    }

}

