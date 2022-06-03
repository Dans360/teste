package steps;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import pages.HomePage;
import runner.RunCucumberTest;

public class story1 extends RunCucumberTest {

    HomePage homepage = new HomePage(driver);

    @Dado("^ao acessar o site advantage online shopping$")
    public void ao_acessar_o_site_advantage_online_shopping()  {
        homepage.acessarSite();
    }

    @Dado("^no menu, clicar na opção \"([^\"]*)\"$")
    public void no_menu_clicar_na_opção(String arg1)  {
        homepage.clicarNaOpçãoSpecialOffer();
    }

    @Dado("^clicar no botão \"([^\"]*)\"$")
    public void clicar_no_botão(String arg1)  {
        homepage.botaoSeeOffer();
    }

    @Então("^Validar que as especificações do produto\\.$")
    public void validar_que_as_especificações_do_produto()  {
        homepage.customizationSimplicity();
        homepage.display();
        homepage.displayResolution();
        homepage.displaysize();
        homepage.memory();
        homepage.operatingSystem();
        homepage.processor();
        homepage.touchceen();
        homepage.weight();
    }
}
