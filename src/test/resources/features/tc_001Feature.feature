Feature: Validar carga de documento con formato permitido

  Scenario: El usuario carga un documento de formato permitido
    Given El usuario ha seleccionado un documento con formato permitido
    When El usuario hace clic en el botón 'Cargar documento'
    Then El sistema procesa el documento sin errores
    And Se muestra un mensaje de confirmación de carga exitosa