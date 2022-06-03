package steps;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import pages.HomePage;
import runner.RunCucumberTest;

public class story4 extends RunCucumberTest {
    HomePage homepage = new HomePage(driver);


    @Dado("^no botão “See offer”$")
    public void no_botão_See_offer()  {
        homepage.botaoSeeOffer();
    }

    @Quando("^no carrinho de compras$")
    public void no_carrinho_de_compras()  {
        homepage.clicarMenuCarrinho();
    }

    @Então("^remover produto do carrinho de compras$")
    public void remover_produto_do_carrinho_de_compras() throws InterruptedException {
        homepage.Menucart();
        homepage.clicarX();
    }

    @Então("^Validar que o carrinho de compras está vazio\\.$")
    public void validar_que_o_carrinho_de_compras_está_vazio()  {
        homepage.CarroVazio();
    }

}
