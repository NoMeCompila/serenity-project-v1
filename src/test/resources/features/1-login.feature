# new feature
# Tags: optional

@Suite @Login
Feature: Validar inicio de sesion
    Background: validar inicio de sesion con credenciales validas
        Given el usuario navega al sitio web

        @ValidLogin
        Scenario: 1 - validar con credenciales correctas
            When ingresa credenciales correctas
            Then la app muestra el homepage

        @InvalidLogin
        Scenario: validar por credenciales incorrectas
            When ingresa credenciales incorrectas
            Then la app muestra un mensaje de error
