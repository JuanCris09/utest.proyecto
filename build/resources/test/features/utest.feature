#Autor: Juan



@stories
Feature: academy utest
  As a user i wants to register on the uTest platform
  @scenario1
  Scenario: Search the Utest platform
    Given that Juan wants to register on the uTest platform
    | strEmail| strPassword |
    | TuCorreo| TuClave     |
    When he registers on the uTest platform
    |strRegistro|
    |formulario registro uTest|
    Then he should be registered on the uTest platform
      |strRegistro|
      |formulario registro uTest|