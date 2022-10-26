Nicolás Pacheco Toledo

Caso 1
Clases: Jugador, Gol, Partido
Analisis: La clase partido se compone de varios jugadores (Clase Jugador) y esta compuesto de Goles entre 0..*
La clase Gol tiene usa asociacion con la clase jugador, jugador tiene un metodo anotarGol()

Caso 2
Clases: EmpresaNaviera, Buque, Astillero
Analisis: La clase Empresa naviera se compone de 10 buques de la clase Buque
Buque tiene un atributo String de estado, puede ser Activo o Obsoleto, otra opcion es un enum
La clase Astillero tiene una composicion con la clase buque, esta compuesta de buques (aunque en realidad podrian ser buques o piezas) los buques pueden existir sin el astillero y la empresa naviera

Caso 3
Clases: Pedido, Mesero
Analisis: La clase Pedido depende de la clase mesero

Caso 4
Clases: Equipo, Jugador
Analisis: Un equipo tiene una relacion de composicion con la clase Jugador, pues esta compuesta de jugadores ademas un jugador dirige el equipo. Debe existir al menos un jugador

Caso 5
Clases:  Un evento puede existir independientemente o formar parte de otros eventos, por lo tanto la clase evento tiene una relacion de agregacion consigo.
Un eventro es parte de 0 eventos (sigo mismo o puede ser parte otro 1 evento)
