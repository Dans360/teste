package steps;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import pages.HomePage;
import runner.RunCucumberTest;

public class story2 extends RunCucumberTest {
    HomePage homepage = new HomePage(driver);

    @Dado("^No menu, clicar na opção “Special Offer”$")
    public void no_menu_clicar_na_opção_Special_Offer()  {
        homepage.clicarNaOpçãoSpecialOffer();
    }

    @Dado("^Clicar no botão “See offer”$")
    public void clicar_no_botão_See_offer()  {
        homepage.botaoSeeOffer();
    }

    @Quando("^Alterar a cor do produto de acordo com a cor informada no banco de automação$")
    public void alterar_a_cor_do_produto_de_acordo_com_a_cor_informada_no_banco_de_automação()  {
        homepage.alterarCorParaVermelho();
    }

    @Então("^Clicar no botão “Add to cart”$")
    public void clicar_no_botão_Add_to_cart() {
        homepage.clicarBotãoAddToCart();
    }

    @Então("^Validar que produto foi adicionado ao carrinho com a cor selecionada\\.$")
    public void validar_que_produto_foi_adicionado_ao_carrinho_com_a_cor_selecionada() throws InterruptedException {
        homepage.clicarMenuCarrinho();
        homepage.modeloDoProduto();
        homepage.confirmacaoCorAlterada();
        homepage.quantidadeDeProduto();
        homepage.Menucart();
        homepage.clicarX();
    }

}
