INSERT INTO public.salarecuperacion (camas, disponibles) VALUES (3, 1);
INSERT INTO public.salarecuperacion (camas, disponibles) VALUES (0, 0);

INSERT INTO public.camarecuperacion (id_sala) VALUES (1);
INSERT INTO public.camarecuperacion (id_sala, disponible, id_paciente, fechauso) VALUES (1, FALSE, 10, '2020-07-08');
INSERT INTO public.camarecuperacion (id_sala, disponible, id_paciente, fechauso) VALUES (1, FALSE, 3, '2020-07-24');
