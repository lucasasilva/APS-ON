CREATE TABLE cad_pessoas (
                             id SERIAL,
                             nome VARCHAR(100),
                             telefone VARCHAR(20),
                             email VARCHAR(100),
                             login VARCHAR(100),
                             senha VARCHAR(100),
                             CONSTRAINT pk_cad_pessoas PRIMARY KEY (id)
);

CREATE TABLE cad_area_atuacao_medica (
                                         id SERIAL,
                                         nome VARCHAR(20),
                                         CONSTRAINT pk_cad_area_atuacao_medica PRIMARY KEY (id)
);

CREATE TABLE cad_instituicoes_saude (
                                       id SERIAL,
                                       nome VARCHAR(30),
                                       CONSTRAINT pk_cad_instituicao_saude PRIMARY KEY (id)

);

CREATE TABLE cad_professores (
                                 id INTEGER,
                                 instituicao_trabalho INTEGER,
                                 CONSTRAINT pk_cad_professores PRIMARY KEY (id),
                                 CONSTRAINT fk_cad_prof_pessoa FOREIGN KEY (ID) REFERENCES CAD_PESSOAS(ID) on DELETE CASCADE,
                                 CONSTRAINT fk_instituicao_trabalho FOREIGN KEY (instituicao_trabalho) REFERENCES cad_instituicoes_saude(id)
);

CREATE TABLE cad_prof_dias_disp (
                                    id SERIAL,
                                    dia_semana INTEGER,
                                    cod_professor INTEGER,
                                    CONSTRAINT pk_cad_prof_dias_disp PRIMARY KEY (id),
                                    CONSTRAINT FK_CAD_PROF_DIAS_DISP FOREIGN KEY (COD_PROFESSOR) REFERENCES CAD_PROFESSORES(ID) ON DELETE CASCADE
);

CREATE TABLE cad_alunos (
                            id INTEGER,
                            registro_aluno INTEGER,
                            periodo integer,
                            CONSTRAINT pk_cad_alunos PRIMARY KEY (id),
                            CONSTRAINT FK_ALUNO_PESSOA FOREIGN KEY (ID) REFERENCES CAD_PESSOAS(ID) ON DELETE CASCADE
);

CREATE TABLE cad_atividades (
                                id SERIAL,
                                professor_responsavel INTEGER,
                                instituicao_prestacao INTEGER,
                                qtd_vagas INTEGER,
                                dt_inicio DATE,
                                dt_fim DATE,
                                area_atuacao_medica INTEGER,
                                tipo_atividade VARCHAR(50),
                                CONSTRAINT pk_cad_atividade PRIMARY KEY (id),
                                CONSTRAINT fk_professor_responsavel FOREIGN KEY (professor_responsavel) REFERENCES cad_professores (id),
                                CONSTRAINT fk_area_atuacao_medica_atividades FOREIGN KEY (area_atuacao_medica) REFERENCES cad_area_atuacao_medica (id)
);

create table cad_atividades_grupos(
id SERIAL,
cod_atividade integer,
cod_grupo integer,
CONSTRAINT PK_CAD_ATIVIDADES_GRUPOS PRIMARY KEY (ID),
constraint fk_ativ_grupo_atividades FOREIGN KEY (COD_ATIVIDADE) REFERENCES CAD_ATIVIDADES(ID) ON DELETE CASCADE
);

CREATE TABLE cad_ativ_grupo_alunos (
                                       id SERIAL,
                                       COD_GRUPO INTEGER,
                                       cod_atividade INTEGER,
                                       codigo_aluno INTEGER,
                                       QTD_VAGAS INTEGER,
                                       QTD_VAGAS_SOBRANDO INTEGER,
                                       CONSTRAINT pk_cad_ativ_grupo_alunos PRIMARY KEY (id),
                                       CONSTRAINT fk_cod_atividade_grupos FOREIGN KEY (cod_atividade) REFERENCES cad_atividades (id) ON DELETE CASCADE,
                                       CONSTRAINT FK_GRUPO_ALUNO FOREIGN KEY(COD_GRUPO) REFERENCES CAD_ATIVIDADES_GRUPOS (ID) ON DELETE CASCADE,
                                       CONSTRAINT fk_codigo_aluno_grupo_alunos FOREIGN KEY (codigo_aluno) REFERENCES cad_alunos (id)
);

CREATE TABLE cad_ativ_horarios (
                                   id SERIAL,
                                   cod_atividade INTEGER,
                                   horarios TIME,
                                   CONSTRAINT pk_cad_ativ_horarios PRIMARY KEY (id),
                                   CONSTRAINT fk_cod_atividade_horarios FOREIGN KEY (cod_atividade) REFERENCES cad_atividades (id) ON DELETE CASCADE
);

CREATE TABLE cad_ativ_periodos (
                                   id SERIAL,
                                   cod_atividade INTEGER,
                                   periodo INTEGER,
                                   CONSTRAINT pk_cad_ativ_periodos PRIMARY KEY (id),
                                   CONSTRAINT fk_cod_atividade_periodos FOREIGN KEY (cod_atividade) REFERENCES cad_atividades (id)
);
