#language: pt

Funcionalidade: usar estoria de cenarios
  Eu como usuário do site
  Quero poder alterar e testar o site
  Para validar teste com sucesso.

@especificar-produto
  Cenário: 1-Validar especificações do produto
    Dado ao acessar o site advantage online shopping
    E no menu, clicar na opção "Special Offer"
    E clicar no botão "See Offer"
    Então Validar que as especificações do produto.

@alterar-cor
  Cenário: 2-Validar alteração de cor do produto no carrinho
    Dado ao acessar o site advantage online shopping
    E No menu, clicar na opção “Special Offer”
    E Clicar no botão “See offer”
    Quando Alterar a cor do produto de acordo com a cor informada no banco de automação
    Então Clicar no botão “Add to cart”
    E Validar que produto foi adicionado ao carrinho com a cor selecionada.

@validar-checkout
  Cenário: 3-Validar página de checkout
    Dado ao acessar o site advantage online shopping
    Quando Pesquiso o produto clicando no ícone de lupa (Seguir o nome do produto do banco de automação)
    E Selecionar produto pesquisado
    E Alterar a cor do produto
    Quando Alterar a quantidade de produtos que desaja comprar
    E Clicar no botão “Add to cart”
    E Acessar a página de checkout
    Então Validar que a soma dos preços correspondem ao total apresentado na página de checkout.

@remover-produto
  Cenário: 4–Remover produto do carrinho de compras
    Dado ao acessar o site advantage online shopping
    E No menu, clicar na opção “Special Offer”
    E no botão “See offer”
    Quando Clicar no botão “Add to cart”
    E no carrinho de compras
    Então remover produto do carrinho de compras
    E Validar que o carrinho de compras está vazio.