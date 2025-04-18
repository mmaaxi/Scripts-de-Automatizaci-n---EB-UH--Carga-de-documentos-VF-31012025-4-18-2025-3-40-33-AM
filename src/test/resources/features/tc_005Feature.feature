Feature: Validar proceso de carga múltiple de documentos

  Scenario: Usuario carga múltiples documentos y verifica la confirmación
    Given el usuario está en la página de carga de documentos
    When el usuario selecciona múltiples archivos con formatos permitidos
    Then el sistema muestra todos los archivos seleccionados
    When el usuario hace clic en 'Cargar documentos'
    Then cada documento se procesa individualmente
    And se muestra un mensaje de confirmación para cada carga exitosa