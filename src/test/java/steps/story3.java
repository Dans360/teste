package steps;

import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import pages.HomePage;
import runner.RunCucumberTest;

public class story3  extends RunCucumberTest {
    HomePage homepage = new HomePage(driver);

    @Quando("^Pesquiso o produto clicando no ícone de lupa \\(Seguir o nome do produto do banco de automação\\)$")
    public void pesquiso_o_produto_clicando_no_ícone_de_lupa_Seguir_o_nome_do_produto_do_banco_de_automação() throws InterruptedException {
        homepage.pesquisarProdutoNaLupa();
        homepage.selecionarProdutoPesquisado();
    }

    @Quando("^Selecionar produto pesquisado$")
    public void selecionar_produto_pesquisado()  {
        homepage.selecionarProdutoPesquisado();
        homepage.confirmarProduto();
    }

    @Quando("^Alterar a cor do produto$")
    public void alterar_a_cor_do_produto()  {
        homepage.alterarCorParaVermelho();
    }

    @Quando("^Alterar a quantidade de produtos que desaja comprar$")
    public void alterar_a_quantidade_de_produtos_que_desaja_comprar()  {
        homepage.alterarQuantidade();
    }

    @Quando("^Acessar a página de checkout$")
    public void acessar_a_página_de_checkout()  {
        homepage.acessarChekout();
    }

    @Então("^Validar que a soma dos preços correspondem ao total apresentado na página de checkout\\.$")
    public void validar_que_a_soma_dos_preços_correspondem_ao_total_apresentado_na_página_de_checkout() throws InterruptedException {
        homepage.acessarCarrinho();
        homepage.validarChekout();
        homepage.Menucart();
        homepage.clicarX();
    }


}
