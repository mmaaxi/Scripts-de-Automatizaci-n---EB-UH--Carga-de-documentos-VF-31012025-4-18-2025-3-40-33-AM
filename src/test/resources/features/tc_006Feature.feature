Feature: Verificar la integridad del archivo después de la carga

  Scenario: Cargar y verificar la integridad del archivo después de la carga
    Given el usuario está en la página de carga de documentos
    When el usuario carga un documento válido
    Then el sistema procesa la carga sin modificar el contenido del archivo
    When el usuario descarga el documento cargado desde la interfaz de usuario
    Then el archivo descargado mantiene su integridad y formato original