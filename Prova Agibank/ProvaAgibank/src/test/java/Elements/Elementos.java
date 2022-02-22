package Elements;

import org.openqa.selenium.By;

public class Elementos {

	
	//Elemento encapsulado
	
	private By lupa = By.id("search-open");
	private By pesquisa = By.xpath("//*[@id=\"masthead\"]/div[1]/div[2]/form/label/input");
	private By btnPesquisa = By.xpath("//*[@id=\"masthead\"]/div[1]/div[2]/form/input");
	private By validaTexto = By.xpath("//*[@id=\"primary\"]/header/h1/span");
	private By resultadoInexistente = By.xpath("//*[@id=\"primary\"]/section/header/h1");
	
	//Metodo de acesso
	
	
	public By getLupa() {
		return lupa;
	}
	public By getPesquisa() {
		return pesquisa;
	}
	public By getBtnPesquisa() {
		return btnPesquisa;
	}
	public By getValidaTexto() {
		return validaTexto;
	}
	public By getResultadoInexistente() {
		return resultadoInexistente;
	}

}
