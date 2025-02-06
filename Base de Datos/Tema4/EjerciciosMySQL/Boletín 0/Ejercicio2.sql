use boletin0;

insert into profesores(Nombre, Apellido1, Apellido2, DNI, Dirección, Título, Gana)
values("Juan", "Arcos", "López", "76978084M", "Puerta Negra, 4", "Ing. Informático", "7500");

insert into profesores(Nombre, Apellido1, Apellido2, DNI, Dirección, Título, Gana)
values("María", "Oliva", "Rubio", "50427865C", "Juan Alfonso, 23", "Lda. Fil. Inglesa", "4900");

insert into profesores(Nombre, Apellido1, Apellido2, DNI, Dirección, Título, Gana)
values("Sara", "Lemes", "Sancho", "99857929W", "Calle Viento, 1", "Magisterio", "6100");

insert into Cursos(Nombre_Curso, Cod_Curso, DNI_Profesor, Max_Alumnos, Fecha_Inicio, Fecha_Fin, Num_Horas)
values("Inglés Básico", "1", "50127865C", "15", "23-01-01", "23-10-01", "120");

insert into Cursos(Nombre_Curso, Cod_Curso, DNI_Profesor, Fecha_Inicio, Num_Horas)
values("Adm. Linux", "2", "76978084M", "23-02-03", "80");

insert into Alumnos(DNI, Nombre, Apellido1, Apellido2, Dirección, Sexo, Fecha_Nacimiento, Curso)
values("23755174S", "Lucas", "Manilva", "Lopez", "Alhamar, 4", "H", "70-01-01", "1");

insert into Alumnos(DNI, Nombre, Apellido1, Apellido2, Dirección, Sexo, Curso)
values("03818863N", "Antonia", "Santos", "Alcántara", "Maniquí, 21", "M", "2");

insert into Alumnos(DNI, Nombre, Apellido1, Apellido2, Dirección, Curso)
values("33577501P", "Manuel", "Baños", "Rioseco", "Jurel, 2", "2");

insert into Alumnos(DNI, Nombre, Apellido1, Apellido2, Dirección, Sexo, Fecha_Nacimiento, Curso)
values("36107620N", "José", "Llorente", "Escueto", "Jarcha, 5", "H", "90-02-03", "1");
