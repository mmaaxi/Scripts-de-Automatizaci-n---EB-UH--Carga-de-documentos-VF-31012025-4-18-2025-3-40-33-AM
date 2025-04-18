Feature: Validar registro de logs de carga

  Scenario: Carga exitosa de un documento y validación de registro en el log
    Given el usuario está en la página de carga de documentos
    When el usuario realiza una carga exitosa de un documento
    Then el sistema registra todos los detalles de la carga en un log interno
    And verifica que se hayan creado las entradas correspondientes en el log
    Then el log muestra entradas detalladas del proceso de carga, incluyendo fecha, hora y usuario