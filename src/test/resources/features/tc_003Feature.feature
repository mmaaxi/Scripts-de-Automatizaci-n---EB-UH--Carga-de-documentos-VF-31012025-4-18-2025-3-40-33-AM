Feature: Verificar límite de tamaño de archivo

  Scenario: Intentar cargar un archivo cuyo tamaño excede el límite permitido
    Given El usuario selecciona un documento cuyo tamaño excede el límite permitido
    When El usuario intenta cargar el documento
    Then El sistema muestra un mensaje de error indicando que el tamaño del archivo es demasiado grande
    And El sistema no permite la carga del archivo