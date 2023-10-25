# new feature
# Tags: optional

@Suite @Login
Feature: Validar inicio de sesion
    Background: validar inicio de sesion con credenciales validas
        Given el usuario navega al sitio web

        @ValidLogin
        Scenario Outline: 1 - validar con credenciales correctas
            When ingresa <usuario> y <password>
            Then la app muestra el homepage

            Examples:
                | usuario       | password     |
                | standard_user | secret_sauce |
                | standard_user | 123456789012 |