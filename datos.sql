--Salas de recuperacion
INSERT INTO public.salarecuperacion (camas, disponibles) VALUES (3, 1);
INSERT INTO public.salarecuperacion (camas, disponibles) VALUES (2, 1);
INSERT INTO public.salarecuperacion (camas, disponibles) VALUES (1, 0);

--Camas de recuperacion
INSERT INTO public.camarecuperacion (id_sala) VALUES (1);
INSERT INTO public.camarecuperacion (id_sala, disponible, id_paciente, fechauso) VALUES (1, FALSE, 10, '2020-07-22');
INSERT INTO public.camarecuperacion (id_sala, disponible, id_paciente, fechauso) VALUES (1, FALSE, 3, '2020-07-24');

INSERT INTO public.camarecuperacion (id_sala) VALUES (2);
INSERT INTO public.camarecuperacion (id_sala, disponible, id_paciente, fechauso) VALUES (2, FALSE, 4, '2020-07-26');

INSERT INTO public.camarecuperacion (id_sala, disponible, id_paciente, fechauso) VALUES (3, FALSE, 8, '2020-07-24');

--Equipamiento
INSERT INTO public.equipamiento (id_sala) VALUES (1);
INSERT INTO public.equipamiento (nombre, id_sala) VALUES ("Esfignomanómetro", 1);
INSERT INTO public.equipamiento (nombre, id_sala) VALUES ("Estetoscopio", 1);

INSERT INTO public.equipamiento (id_sala) VALUES (2);
INSERT INTO public.equipamiento (nombre, id_sala) VALUES ("Termómetro", 2);
INSERT INTO public.equipamiento (nombre, id_sala) VALUES ("Monitor de signos vitales", 2);

INSERT INTO public.equipamiento (id_sala) VALUES (3);
INSERT INTO public.equipamiento (nombre, id_sala) VALUES ("Administrador de oxígeno", 3);