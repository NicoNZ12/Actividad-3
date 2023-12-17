# Actividad-3
- Crud hecho con Java y MySQL
## Lógica de la aplicación
- La aplicación esta diseñada siguiendo el patrón DAO. Cuenta con tres paquetes: El paquete "dao" con la clase Main la cual ejecuta la conexión a la base de datos e inicializa la interfaz gráfica(Java Swing) de la aplicación. El paquete "cambioAceite", el cual posee la clase Auto donde se definen los atributos, el constructor y los getters y setters y la clasa JFrame form GUI. Por último, el paquete "interfaces" el cual posee la interfaz DAOAuto donde se definen los métodos caracteristicos de este crud y la clase DAOAutoImplemetación que implementa la interfaz DAOAuto y sobrescribe los métodos de la interfaz.
- La mayoria de la lógica se encuentra en el codigo de la interfaz gráfica, donde se crean varios métodos que realizan la lógica correspondiente dependiendo la función que se quiere realizar. Y luego se crean de forma privada la funcionalidad de los diferentes botones y acá se llaman a los métodos nombrados previamente. Todo esto con la idea de modularizar el código lo más posible y permitir una mejor lectura y escalabilidad del mismo.
## Problema durante el desarrollo
  
