$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("story.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#language: pt"
    }
  ],
  "line": 3,
  "name": "usar estoria de cenarios",
  "description": "Eu como usuário do site\r\nQuero poder alterar e testar o site\r\nPara validar teste com sucesso.",
  "id": "usar-estoria-de-cenarios",
  "keyword": "Funcionalidade"
});
formatter.scenario({
  "line": 9,
  "name": "1-Validar especificações do produto",
  "description": "",
  "id": "usar-estoria-de-cenarios;1-validar-especificações-do-produto",
  "type": "scenario",
  "keyword": "Cenário",
  "tags": [
    {
      "line": 8,
      "name": "@especificar-produto"
    }
  ]
});
formatter.step({
  "line": 10,
  "name": "ao acessar o site advantage online shopping",
  "keyword": "Dado "
});
formatter.step({
  "line": 11,
  "name": "no menu, clicar na opção \"Special Offer\"",
  "keyword": "E "
});
formatter.step({
  "line": 12,
  "name": "clicar no botão \"See Offer\"",
  "keyword": "E "
});
formatter.step({
  "line": 13,
  "name": "Validar que as especificações do produto.",
  "keyword": "Então "
});
formatter.match({
  "location": "story1.ao_acessar_o_site_advantage_online_shopping()"
});
formatter.result({
  "duration": 2976425300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Special Offer",
      "offset": 26
    }
  ],
  "location": "story1.no_menu_clicar_na_opção(String)"
});
formatter.result({
  "duration": 41464631500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "See Offer",
      "offset": 17
    }
  ],
  "location": "story1.clicar_no_botão(String)"
});
formatter.result({
  "duration": 13329253300,
  "status": "passed"
});
formatter.match({
  "location": "story1.validar_que_as_especificações_do_produto()"
});
formatter.result({
  "duration": 1964359100,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "2-Validar alteração de cor do produto no carrinho",
  "description": "",
  "id": "usar-estoria-de-cenarios;2-validar-alteração-de-cor-do-produto-no-carrinho",
  "type": "scenario",
  "keyword": "Cenário",
  "tags": [
    {
      "line": 15,
      "name": "@alterar-cor"
    }
  ]
});
formatter.step({
  "line": 17,
  "name": "ao acessar o site advantage online shopping",
  "keyword": "Dado "
});
formatter.step({
  "line": 18,
  "name": "No menu, clicar na opção “Special Offer”",
  "keyword": "E "
});
formatter.step({
  "line": 19,
  "name": "Clicar no botão “See offer”",
  "keyword": "E "
});
formatter.step({
  "line": 20,
  "name": "Alterar a cor do produto de acordo com a cor informada no banco de automação",
  "keyword": "Quando "
});
formatter.step({
  "line": 21,
  "name": "Clicar no botão “Add to cart”",
  "keyword": "Então "
});
formatter.step({
  "line": 22,
  "name": "Validar que produto foi adicionado ao carrinho com a cor selecionada.",
  "keyword": "E "
});
formatter.match({
  "location": "story1.ao_acessar_o_site_advantage_online_shopping()"
});
formatter.result({
  "duration": 402641200,
  "status": "passed"
});
formatter.match({
  "location": "story2.no_menu_clicar_na_opção_Special_Offer()"
});
formatter.result({
  "duration": 15257985900,
  "status": "passed"
});
formatter.match({
  "location": "story2.clicar_no_botão_See_offer()"
});
formatter.result({
  "duration": 6725166600,
  "status": "passed"
});
formatter.match({
  "location": "story2.alterar_a_cor_do_produto_de_acordo_com_a_cor_informada_no_banco_de_automação()"
});
formatter.result({
  "duration": 5992223500,
  "status": "passed"
});
formatter.match({
  "location": "story2.clicar_no_botão_Add_to_cart()"
});
formatter.result({
  "duration": 8722078800,
  "status": "passed"
});
formatter.match({
  "location": "story2.validar_que_produto_foi_adicionado_ao_carrinho_com_a_cor_selecionada()"
});
formatter.result({
  "duration": 9048226700,
  "status": "passed"
});
formatter.scenario({
  "line": 25,
  "name": "3-Validar página de checkout",
  "description": "",
  "id": "usar-estoria-de-cenarios;3-validar-página-de-checkout",
  "type": "scenario",
  "keyword": "Cenário",
  "tags": [
    {
      "line": 24,
      "name": "@validar-checkout"
    }
  ]
});
formatter.step({
  "line": 26,
  "name": "ao acessar o site advantage online shopping",
  "keyword": "Dado "
});
formatter.step({
  "line": 27,
  "name": "Pesquiso o produto clicando no ícone de lupa (Seguir o nome do produto do banco de automação)",
  "keyword": "Quando "
});
formatter.step({
  "line": 28,
  "name": "Selecionar produto pesquisado",
  "keyword": "E "
});
formatter.step({
  "line": 29,
  "name": "Alterar a cor do produto",
  "keyword": "E "
});
formatter.step({
  "line": 30,
  "name": "Alterar a quantidade de produtos que desaja comprar",
  "keyword": "Quando "
});
formatter.step({
  "line": 31,
  "name": "Clicar no botão “Add to cart”",
  "keyword": "E "
});
formatter.step({
  "line": 32,
  "name": "Acessar a página de checkout",
  "keyword": "E "
});
formatter.step({
  "line": 33,
  "name": "Validar que a soma dos preços correspondem ao total apresentado na página de checkout.",
  "keyword": "Então "
});
formatter.match({
  "location": "story1.ao_acessar_o_site_advantage_online_shopping()"
});
formatter.result({
  "duration": 334572200,
  "status": "passed"
});
formatter.match({
  "location": "story3.pesquiso_o_produto_clicando_no_ícone_de_lupa_Seguir_o_nome_do_produto_do_banco_de_automação()"
});
formatter.result({
  "duration": 17224435700,
  "status": "passed"
});
formatter.match({
  "location": "story3.selecionar_produto_pesquisado()"
});
formatter.result({
  "duration": 7128894300,
  "status": "passed"
});
formatter.match({
  "location": "story3.alterar_a_cor_do_produto()"
});
formatter.result({
  "duration": 4195950700,
  "status": "passed"
});
formatter.match({
  "location": "story3.alterar_a_quantidade_de_produtos_que_desaja_comprar()"
});
formatter.result({
  "duration": 5233841500,
  "status": "passed"
});
formatter.match({
  "location": "story2.clicar_no_botão_Add_to_cart()"
});
formatter.result({
  "duration": 4216006900,
  "status": "passed"
});
formatter.match({
  "location": "story3.acessar_a_página_de_checkout()"
});
formatter.result({
  "duration": 6100706100,
  "status": "passed"
});
formatter.match({
  "location": "story3.validar_que_a_soma_dos_preços_correspondem_ao_total_apresentado_na_página_de_checkout()"
});
formatter.result({
  "duration": 12867621500,
  "status": "passed"
});
formatter.scenario({
  "line": 36,
  "name": "4–Remover produto do carrinho de compras",
  "description": "",
  "id": "usar-estoria-de-cenarios;4–remover-produto-do-carrinho-de-compras",
  "type": "scenario",
  "keyword": "Cenário",
  "tags": [
    {
      "line": 35,
      "name": "@remover-produto"
    }
  ]
});
formatter.step({
  "line": 37,
  "name": "ao acessar o site advantage online shopping",
  "keyword": "Dado "
});
formatter.step({
  "line": 38,
  "name": "No menu, clicar na opção “Special Offer”",
  "keyword": "E "
});
formatter.step({
  "line": 39,
  "name": "no botão “See offer”",
  "keyword": "E "
});
formatter.step({
  "line": 40,
  "name": "Clicar no botão “Add to cart”",
  "keyword": "Quando "
});
formatter.step({
  "line": 41,
  "name": "no carrinho de compras",
  "keyword": "E "
});
formatter.step({
  "line": 42,
  "name": "remover produto do carrinho de compras",
  "keyword": "Então "
});
formatter.step({
  "line": 43,
  "name": "Validar que o carrinho de compras está vazio.",
  "keyword": "E "
});
formatter.match({
  "location": "story1.ao_acessar_o_site_advantage_online_shopping()"
});
formatter.result({
  "duration": 309479800,
  "status": "passed"
});
formatter.match({
  "location": "story2.no_menu_clicar_na_opção_Special_Offer()"
});
formatter.result({
  "duration": 16593782500,
  "status": "passed"
});
formatter.match({
  "location": "story4.no_botão_See_offer()"
});
formatter.result({
  "duration": 6381401800,
  "status": "passed"
});
formatter.match({
  "location": "story2.clicar_no_botão_Add_to_cart()"
});
formatter.result({
  "duration": 5047261500,
  "status": "passed"
});
formatter.match({
  "location": "story4.no_carrinho_de_compras()"
});
formatter.result({
  "duration": 5674278600,
  "status": "passed"
});
formatter.match({
  "location": "story4.remover_produto_do_carrinho_de_compras()"
});
formatter.result({
  "duration": 2347735900,
  "status": "passed"
});
formatter.match({
  "location": "story4.validar_que_o_carrinho_de_compras_está_vazio()"
});
formatter.result({
  "duration": 6396073100,
  "status": "passed"
});
});