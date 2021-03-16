
DROP table IF EXISTS cliente;

create table cliente(
	id int auto_increment,
	nombre varchar(250),
	apellido varchar(250),
	direccion varchar(250),
	dni integer,
	fecha date,
    trabajo varchar(250),
    sueldo decimal (8,2)
);

insert into cliente (nombre, apellido,direccion,dni,fecha,trabajo,sueldo)values('Jose','Marin','calle imaginaria 1',123456789, NOW(),'Arquitecto', 2300);
insert into cliente (nombre, apellido,direccion,dni,fecha,trabajo,sueldo)values('Juan','Lopez','calle imaginaria 2',122222222, NOW(),'Ingeniero',3300);
insert into cliente (nombre, apellido,direccion,dni,fecha,trabajo,sueldo)values('Pedro','Guillem','calle imaginaria 3',123333333, NOW(),'Abogado',4000);
insert into cliente (nombre, apellido,direccion,dni,fecha,trabajo,sueldo)values('Jordi','Martin','calle imaginaria 4',123444444, NOW(),'Informatico',4200);
insert into cliente (nombre, apellido,direccion,dni,fecha,trabajo,sueldo)values('Jonatan','Vicente','calle imaginaria 5',123455555, NOW(),'Abogado',4000);


