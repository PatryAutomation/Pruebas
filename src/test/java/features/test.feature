Feature: Registro de Usuario
  Como usuario quiero registrar un nuevo usuario en la opcion Admin.

  Scenario: Validar el registro de un nuevo usuario en Admin
    Given   que el usuario se loguea e ingresa en Admin
    When    el usuario intenta registrar un nuevo usuario
    Then    verificar que se visualiza el mensaje exitoso
