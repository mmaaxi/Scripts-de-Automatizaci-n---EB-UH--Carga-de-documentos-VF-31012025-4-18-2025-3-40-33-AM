Feature: Visualización del documento cargado

  Scenario: Validar visualización del documento cargado en la interfaz de usuario
    Given El documento válido es cargado exitosamente
    When El usuario interactúa con el documento cargado
    Then El documento debe ser mostrado correctamente en la interfaz de usuario sin perdida de calidad