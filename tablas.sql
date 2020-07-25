
CREATE TABLE public.salarecuperacion(
    id_sala serial not null,
    camas int not null,
    especialidad int not null,
    primary key (id_sala)
)

CREATE TABLE public.camarecuperacion(
    id_cama serial not null,
    id_sala serial not null,
    disponible boolean default TRUE,
    id_paciente serial not null,
    fechauso DATETIME,
    primary key (id_cama),
    FOREIGN key (id_sala) references salarecuperacion(id_sala)
);