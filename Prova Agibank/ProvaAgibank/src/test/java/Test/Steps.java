package Test;

import Elements.Elementos;
import Pages.Metodos;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps {

	Metodos met = new Metodos();
	
	Elementos elemento = new Elementos();
	
	
	@Given("que esteja no blog do {string}")
	public void que_esteja_no_blog_do(String site) {
		
		met.abrirNavegador(site);
	 	}

	@When("clicar na lupa")
	public void clicar_na_lupa() {
	   met.clicar(elemento.getLupa());
	}

	@When("pesquisar {string} no campo de pesquisa")
	public void pesquisar_no_campo_de_pesquisa(String texto) {
		met.preencher(elemento.getPesquisa(), texto);
		met.clicar(elemento.getBtnPesquisa());
	   
	}

	@Then("valido o retorno da pesquisa com sucesso")
	public void valido_o_retorno_da_pesquisa_com_sucesso() {
		met.validarTexto(elemento.getValidaTexto(), "extrato");
		met.sair();
	    
	}

	@When("pesquisar uma palavra inexistente")
	public void pesquisar_uma_palavra_inexistente() {
		met.preencher(elemento.getPesquisa(), "drtyyy");
		met.clicar(elemento.getBtnPesquisa());
		
	   
	}

	@Then("valido a mensagem {string}")
	public void valido_a_mensagem(String texto) {
		met.validarTexto(elemento.getResultadoInexistente(), texto);
		met.sair();
	  
	}
	
}
