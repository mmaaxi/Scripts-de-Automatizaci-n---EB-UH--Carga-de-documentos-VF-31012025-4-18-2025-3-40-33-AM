Feature: Validación de carga de documento sin archivo seleccionado

  Scenario: Comportamiento al no seleccionar un archivo y hacer clic en 'Cargar documento'
    Given el usuario está en la página de carga de documentos
    When el usuario no selecciona ningún archivo y hace clic en 'Cargar documento'
    Then el sistema debe solicitar al usuario que seleccione un archivo antes de proceder