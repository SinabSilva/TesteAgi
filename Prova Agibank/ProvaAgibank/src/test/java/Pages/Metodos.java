package Pages;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Metodos {

	WebDriver driver;

	public void abrirNavegador(String site) {

		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");

		driver = new ChromeDriver();

		driver.get(site);

		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);

		driver.manage().window().maximize();
	}

	public void clicar(By elemento) {
		driver.findElement(elemento).click();

	}

	public void preencher(By elemento, String texto) {
		driver.findElement(elemento).sendKeys(texto);
	}

	public void submit(By elemento) {
		driver.findElement(elemento).submit();
	}

	public void pausa(int tempo) throws Exception {
		Thread.sleep(tempo);
	}

	public void validarTexto(By elemento, String texto) {
		String mensagem = driver.findElement(elemento).getText();
		assertEquals(texto, mensagem);

	}

	public void sair() {
		driver.quit();
	}
}
