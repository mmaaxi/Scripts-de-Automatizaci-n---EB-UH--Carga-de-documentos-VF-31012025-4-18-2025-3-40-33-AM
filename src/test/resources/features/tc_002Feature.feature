Feature: Validar error con formato no permitido

  Scenario: Seleccionar documento con formato no permitido y recibir mensaje de error
    Given el usuario está en la página de carga de documentos
    When el usuario selecciona un archivo con formato no permitido
    And el usuario hace clic en 'Cargar documento'
    Then se muestra un mensaje de error indicando que el formato no es soportado