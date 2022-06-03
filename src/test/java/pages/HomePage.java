package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void acessarSite() {
        driver.get("https://advantageonlineshopping.com/#/");
    }

    public void clicarNaOpçãoSpecialOffer() {
        driver.findElement(By.linkText("SPECIAL OFFER")).click();
    }

    public void botaoSeeOffer() {
        driver.findElement(By.id("see_offer_btn")).click();
    }

    public void customizationSimplicity () {
        driver.findElement(By.xpath("//div[@class='roboto-light list ng-scope'][1]")).getText();
        Assert.assertEquals("CUSTOMIZATION Simplicity", driver.findElement(By.xpath("//div[@class='roboto-light list ng-scope'][1]")).getText());
    }
    public void display () {
        driver.findElement(By.xpath("//div[@class='roboto-light list ng-scope'][2]")).getText();
        Assert.assertEquals("DISPLAY 15.6-inch diagonal Full HD WLED-backlit Display (1920x1080) Touchscreen", driver.findElement(By.xpath("//div[@class='roboto-light list ng-scope'][2]")).getText());
    }
    public void displayResolution () {
        driver.findElement(By.xpath("//div[@class='roboto-light list ng-scope'][3]")).getText();
        Assert.assertEquals("DISPLAY RESOLUTION 1920x1080", driver.findElement(By.xpath("//div[@class='roboto-light list ng-scope'][3]")).getText());
    }
    public void displaysize () {
        driver.findElement(By.xpath("//div[@class='roboto-light list ng-scope'][4]")).getText();
        Assert.assertEquals("DISPLAY SIZE 15.6", driver.findElement(By.xpath("//div[@class='roboto-light list ng-scope'][4]")).getText());
    }
    public void memory () {
        driver.findElement(By.xpath("//div[@class='roboto-light list ng-scope'][5]")).getText();
        Assert.assertEquals("MEMORY 16GB DDR3 - 2 DIMM", driver.findElement(By.xpath("//div[@class='roboto-light list ng-scope'][5]")).getText());
    }
    public void operatingSystem () {
        driver.findElement(By.xpath("//div[@class='roboto-light list ng-scope'][6]")).getText();
        Assert.assertEquals("OPERATING SYSTEM Windows 10", driver.findElement(By.xpath("//div[@class='roboto-light list ng-scope'][6]")).getText());
    }
    public void processor () {
        driver.findElement(By.xpath("//div[@class='roboto-light list ng-scope'][7]")).getText();
        Assert.assertEquals("PROCESSOR AMD Quad-Core A10-8700P Processor + AMD Radeon(TM) R6 Graphics", driver.findElement(By.xpath("//div[@class='roboto-light list ng-scope'][7]")).getText());
    }
    public void touchceen () {
        driver.findElement(By.xpath("//div[@class='roboto-light list ng-scope'][8]")).getText();
        Assert.assertEquals("TOUCHSCREEN Yes", driver.findElement(By.xpath("//div[@class='roboto-light list ng-scope'][8]")).getText());
    }
    public void weight () {
        driver.findElement(By.xpath("//div[@class='roboto-light list ng-scope'][9]")).getText();
        Assert.assertEquals("WEIGHT 5.51 lb", driver.findElement(By.xpath("//div[@class='roboto-light list ng-scope'][9]")).getText());
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public void alterarCorParaVermelho() {
        driver.findElement(By.cssSelector("span#bunny.productColor.ng-scope.RED")).click();
    }

    public void clicarBotãoAddToCart() {
        driver.findElement(By.cssSelector("button.roboto-medium.ng-scope")).click();
    }

    public void clicarMenuCarrinho() {
        driver.findElement(By.id("menuCart")).click();
    }

    public void modeloDoProduto() {
        driver.findElement(By.xpath("//label[@class='roboto-regular productName ng-binding']")).getText();
        Assert.assertEquals("HP PAVILION 15Z TOUCH LAPTOP", driver.findElement(By.xpath("//label[@class='roboto-regular productName ng-binding']")).getText());
    }

    public void confirmacaoCorAlterada() {
        driver.findElement(By.cssSelector("span[title=\"RED\"]")).getText();
        Assert.assertEquals("",driver.findElement(By.cssSelector("span[title=\"RED\"]")).getText());
    }

    public void quantidadeDeProduto() {
        driver.findElement(By.xpath("//td[@class='smollCell quantityMobile']")).getText();
        Assert.assertEquals("1", driver.findElement(By.xpath("//td[@class='smollCell quantityMobile']")).getText());
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public void pesquisarProdutoNaLupa() throws InterruptedException {
        driver.findElement(By.id("autoComplete")).sendKeys("HP PAVILION 15Z TOUCH LAPTOP");
        Thread.sleep(2000);
    }

    public void selecionarProdutoPesquisado() {
        driver.findElement(By.id("menuSearch")).click();
    }

    public void confirmarProduto() {
        driver.findElement(By.xpath("//p[1]/a[@class='productName ng-binding']")).click();
    }

    public void alterarCorParaAzul() {
        driver.findElement(By.cssSelector("span#bunny.productColor.ng-scope.BLUE")).click();
    }

    public void alterarQuantidade() {
        driver.findElement(By.className("plus")).click();
    }

    public void adicionarCarrinho() {
        //driver.findElement(By.cssSelector("button.roboto-medium.ng-scope")).click();
    }

    public void acessarChekout() {
        driver.findElement(By.id("menuCart")).click();
    }

    public void acessarCarrinho() {
        driver.findElement(By.id("checkOutButton")).click();
    }

    public void validarChekout() {
        driver.findElement(By.xpath("//span[@class='roboto-medium totalValue ng-binding']")).getText();
        Assert.assertEquals("$899.98", driver.findElement(By.xpath("//span[@class='roboto-medium totalValue ng-binding']")).getText());

    }

    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public void Menucart() throws InterruptedException {
        driver.findElement(By.id("menuCart")).click();
        Thread.sleep(2000);
    }

    public void clicarX() {
        driver.findElement(By.xpath("//div[@class='removeProduct iconCss iconX']")).click();
    }

    public void CarroVazio() {
        driver.findElement(By.xpath("//label[@class='roboto-bold ng-scope']")).getText();
        Assert.assertEquals("Your shopping cart is empty", driver.findElement(By.xpath("//label[@class='roboto-bold ng-scope']")).getText());
    }

}