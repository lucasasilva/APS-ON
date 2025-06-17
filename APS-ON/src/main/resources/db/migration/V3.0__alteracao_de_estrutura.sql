alter table cad_atividades
add periodo varchar(10);
create table cad_atividades_grupos(
id SERIAL,
cod_atividade integer,
cod_grupo integer,
constraint fk_ativ_grupo_atividades FOREIGN KEY (COD_ATIVIDADE) REFERENCES CAD_ATIVIDADES(ID)
);

DROP TABLE CAD_ATIV_PERIODOS;

alter table cad_pessoas add tipo varchar(3);