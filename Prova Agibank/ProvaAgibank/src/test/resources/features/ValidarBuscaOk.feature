#Author: sinabns@hotmail.com

@tag
Feature: Campo de busca
Eu como usuario quero realizar uma busca no blog do Agi para me manter informado sobre financas

Background: 
    Given que esteja no blog do "https://blogdoagi.com.br/"
    When clicar na lupa
  
  
  @tag1
  Scenario: Validar retorno de item pesquizado com sucesso
    And pesquisar "extrato" no campo de pesquisa
    Then valido o retorno da pesquisa com sucesso 

  @tag2
  
  Scenario: Validar pesquisa com palavra inexistente
    But pesquisar uma palavra inexistente
    Then valido a mensagem "Nenhum resultado"