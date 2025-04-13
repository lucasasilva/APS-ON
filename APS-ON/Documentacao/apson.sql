PGDMP                      }            apson    17.2    17.2 c    �           0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                           false            �           0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                           false            �           0    0 
   SEARCHPATH 
   SEARCHPATH     8   SELECT pg_catalog.set_config('search_path', '', false);
                           false            �           1262    16429    apson    DATABASE     |   CREATE DATABASE apson WITH TEMPLATE = template0 ENCODING = 'UTF8' LOCALE_PROVIDER = libc LOCALE = 'Portuguese_Brazil.1252';
    DROP DATABASE apson;
                     postgres    false            �            1259    16473 
   cad_alunos    TABLE     X   CREATE TABLE public.cad_alunos (
    id integer NOT NULL,
    registro_aluno integer
);
    DROP TABLE public.cad_alunos;
       public         heap r       postgres    false            �            1259    16472    cad_alunos_id_seq    SEQUENCE     �   CREATE SEQUENCE public.cad_alunos_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 (   DROP SEQUENCE public.cad_alunos_id_seq;
       public               postgres    false    225            �           0    0    cad_alunos_id_seq    SEQUENCE OWNED BY     G   ALTER SEQUENCE public.cad_alunos_id_seq OWNED BY public.cad_alunos.id;
          public               postgres    false    224            �            1259    16583    cad_area_atuacao_medica    TABLE     j   CREATE TABLE public.cad_area_atuacao_medica (
    id integer NOT NULL,
    nome character varying(100)
);
 +   DROP TABLE public.cad_area_atuacao_medica;
       public         heap r       postgres    false            �            1259    16582    cad_area_atuacao_medica_id_seq    SEQUENCE     �   CREATE SEQUENCE public.cad_area_atuacao_medica_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 5   DROP SEQUENCE public.cad_area_atuacao_medica_id_seq;
       public               postgres    false    239            �           0    0    cad_area_atuacao_medica_id_seq    SEQUENCE OWNED BY     a   ALTER SEQUENCE public.cad_area_atuacao_medica_id_seq OWNED BY public.cad_area_atuacao_medica.id;
          public               postgres    false    238            �            1259    16547    cad_ativ_dias_semana    TABLE     y   CREATE TABLE public.cad_ativ_dias_semana (
    id integer NOT NULL,
    cod_atividade integer,
    dia_semana integer
);
 (   DROP TABLE public.cad_ativ_dias_semana;
       public         heap r       postgres    false            �            1259    16546    cad_ativ_dias_semana_id_seq    SEQUENCE     �   CREATE SEQUENCE public.cad_ativ_dias_semana_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 2   DROP SEQUENCE public.cad_ativ_dias_semana_id_seq;
       public               postgres    false    233            �           0    0    cad_ativ_dias_semana_id_seq    SEQUENCE OWNED BY     [   ALTER SEQUENCE public.cad_ativ_dias_semana_id_seq OWNED BY public.cad_ativ_dias_semana.id;
          public               postgres    false    232            �            1259    16571    cad_ativ_grupos_alunos    TABLE     }   CREATE TABLE public.cad_ativ_grupos_alunos (
    id integer NOT NULL,
    cod_atividade integer,
    codigo_aluno integer
);
 *   DROP TABLE public.cad_ativ_grupos_alunos;
       public         heap r       postgres    false            �            1259    16570    cad_ativ_grupos_alunos_id_seq    SEQUENCE     �   CREATE SEQUENCE public.cad_ativ_grupos_alunos_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 4   DROP SEQUENCE public.cad_ativ_grupos_alunos_id_seq;
       public               postgres    false    237            �           0    0    cad_ativ_grupos_alunos_id_seq    SEQUENCE OWNED BY     _   ALTER SEQUENCE public.cad_ativ_grupos_alunos_id_seq OWNED BY public.cad_ativ_grupos_alunos.id;
          public               postgres    false    236            �            1259    16522    cad_ativ_horarios    TABLE     �   CREATE TABLE public.cad_ativ_horarios (
    id integer NOT NULL,
    cod_atividade integer,
    horarios time without time zone
);
 %   DROP TABLE public.cad_ativ_horarios;
       public         heap r       postgres    false            �            1259    16521    cad_ativ_horarios_id_seq    SEQUENCE     �   CREATE SEQUENCE public.cad_ativ_horarios_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 /   DROP SEQUENCE public.cad_ativ_horarios_id_seq;
       public               postgres    false    229            �           0    0    cad_ativ_horarios_id_seq    SEQUENCE OWNED BY     U   ALTER SEQUENCE public.cad_ativ_horarios_id_seq OWNED BY public.cad_ativ_horarios.id;
          public               postgres    false    228            �            1259    16535    cad_ativ_periodos    TABLE     s   CREATE TABLE public.cad_ativ_periodos (
    id integer NOT NULL,
    cod_atividade integer,
    periodo integer
);
 %   DROP TABLE public.cad_ativ_periodos;
       public         heap r       postgres    false            �            1259    16534    cad_ativ_periodos_id_seq    SEQUENCE     �   CREATE SEQUENCE public.cad_ativ_periodos_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 /   DROP SEQUENCE public.cad_ativ_periodos_id_seq;
       public               postgres    false    231            �           0    0    cad_ativ_periodos_id_seq    SEQUENCE OWNED BY     U   ALTER SEQUENCE public.cad_ativ_periodos_id_seq OWNED BY public.cad_ativ_periodos.id;
          public               postgres    false    230            �            1259    16504    cad_atividades    TABLE       CREATE TABLE public.cad_atividades (
    id integer NOT NULL,
    professor_responsavel integer,
    instituicao_prestacao integer,
    qtd_vagas integer,
    dt_inicio date,
    dt_fim date,
    area_atuacao_medica integer,
    tipo_atividade character varying(3)
);
 "   DROP TABLE public.cad_atividades;
       public         heap r       postgres    false            �            1259    16559    cad_atividades_grupos    TABLE     v   CREATE TABLE public.cad_atividades_grupos (
    id integer NOT NULL,
    cod_atividade integer,
    dias_ativ date
);
 )   DROP TABLE public.cad_atividades_grupos;
       public         heap r       postgres    false            �            1259    16558    cad_atividades_grupos_id_seq    SEQUENCE     �   CREATE SEQUENCE public.cad_atividades_grupos_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 3   DROP SEQUENCE public.cad_atividades_grupos_id_seq;
       public               postgres    false    235            �           0    0    cad_atividades_grupos_id_seq    SEQUENCE OWNED BY     ]   ALTER SEQUENCE public.cad_atividades_grupos_id_seq OWNED BY public.cad_atividades_grupos.id;
          public               postgres    false    234            �            1259    16503    cad_atividades_id_seq    SEQUENCE     �   CREATE SEQUENCE public.cad_atividades_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 ,   DROP SEQUENCE public.cad_atividades_id_seq;
       public               postgres    false    227            �           0    0    cad_atividades_id_seq    SEQUENCE OWNED BY     O   ALTER SEQUENCE public.cad_atividades_id_seq OWNED BY public.cad_atividades.id;
          public               postgres    false    226            �            1259    16439    cad_instituicoes_saude    TABLE     h   CREATE TABLE public.cad_instituicoes_saude (
    id integer NOT NULL,
    nome character varying(30)
);
 *   DROP TABLE public.cad_instituicoes_saude;
       public         heap r       postgres    false            �            1259    16438    cad_instituicoes_saude_id_seq    SEQUENCE     �   CREATE SEQUENCE public.cad_instituicoes_saude_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 4   DROP SEQUENCE public.cad_instituicoes_saude_id_seq;
       public               postgres    false    221            �           0    0    cad_instituicoes_saude_id_seq    SEQUENCE OWNED BY     _   ALTER SEQUENCE public.cad_instituicoes_saude_id_seq OWNED BY public.cad_instituicoes_saude.id;
          public               postgres    false    220            �            1259    16460    cad_pessoas    TABLE     �   CREATE TABLE public.cad_pessoas (
    id integer NOT NULL,
    nome character varying(100),
    telefone character varying(20),
    email character varying(100),
    login character varying(100),
    senha character varying(100)
);
    DROP TABLE public.cad_pessoas;
       public         heap r       postgres    false            �            1259    16459    cad_pessoas_id_seq    SEQUENCE     �   CREATE SEQUENCE public.cad_pessoas_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 )   DROP SEQUENCE public.cad_pessoas_id_seq;
       public               postgres    false    223            �           0    0    cad_pessoas_id_seq    SEQUENCE OWNED BY     I   ALTER SEQUENCE public.cad_pessoas_id_seq OWNED BY public.cad_pessoas.id;
          public               postgres    false    222            �            1259    16431    cad_prof_dias_disp    TABLE     w   CREATE TABLE public.cad_prof_dias_disp (
    id integer NOT NULL,
    dia_semana integer,
    cod_professor integer
);
 &   DROP TABLE public.cad_prof_dias_disp;
       public         heap r       postgres    false            �            1259    16430    cad_prof_dias_disp_id_seq    SEQUENCE     �   CREATE SEQUENCE public.cad_prof_dias_disp_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 0   DROP SEQUENCE public.cad_prof_dias_disp_id_seq;
       public               postgres    false    218            �           0    0    cad_prof_dias_disp_id_seq    SEQUENCE OWNED BY     W   ALTER SEQUENCE public.cad_prof_dias_disp_id_seq OWNED BY public.cad_prof_dias_disp.id;
          public               postgres    false    217            �            1259    16435    cad_professores    TABLE     c   CREATE TABLE public.cad_professores (
    id integer NOT NULL,
    instituicao_trabalho integer
);
 #   DROP TABLE public.cad_professores;
       public         heap r       postgres    false            �           2604    16476    cad_alunos id    DEFAULT     n   ALTER TABLE ONLY public.cad_alunos ALTER COLUMN id SET DEFAULT nextval('public.cad_alunos_id_seq'::regclass);
 <   ALTER TABLE public.cad_alunos ALTER COLUMN id DROP DEFAULT;
       public               postgres    false    224    225    225            �           2604    16586    cad_area_atuacao_medica id    DEFAULT     �   ALTER TABLE ONLY public.cad_area_atuacao_medica ALTER COLUMN id SET DEFAULT nextval('public.cad_area_atuacao_medica_id_seq'::regclass);
 I   ALTER TABLE public.cad_area_atuacao_medica ALTER COLUMN id DROP DEFAULT;
       public               postgres    false    238    239    239            �           2604    16550    cad_ativ_dias_semana id    DEFAULT     �   ALTER TABLE ONLY public.cad_ativ_dias_semana ALTER COLUMN id SET DEFAULT nextval('public.cad_ativ_dias_semana_id_seq'::regclass);
 F   ALTER TABLE public.cad_ativ_dias_semana ALTER COLUMN id DROP DEFAULT;
       public               postgres    false    233    232    233            �           2604    16574    cad_ativ_grupos_alunos id    DEFAULT     �   ALTER TABLE ONLY public.cad_ativ_grupos_alunos ALTER COLUMN id SET DEFAULT nextval('public.cad_ativ_grupos_alunos_id_seq'::regclass);
 H   ALTER TABLE public.cad_ativ_grupos_alunos ALTER COLUMN id DROP DEFAULT;
       public               postgres    false    237    236    237            �           2604    16525    cad_ativ_horarios id    DEFAULT     |   ALTER TABLE ONLY public.cad_ativ_horarios ALTER COLUMN id SET DEFAULT nextval('public.cad_ativ_horarios_id_seq'::regclass);
 C   ALTER TABLE public.cad_ativ_horarios ALTER COLUMN id DROP DEFAULT;
       public               postgres    false    228    229    229            �           2604    16538    cad_ativ_periodos id    DEFAULT     |   ALTER TABLE ONLY public.cad_ativ_periodos ALTER COLUMN id SET DEFAULT nextval('public.cad_ativ_periodos_id_seq'::regclass);
 C   ALTER TABLE public.cad_ativ_periodos ALTER COLUMN id DROP DEFAULT;
       public               postgres    false    230    231    231            �           2604    16507    cad_atividades id    DEFAULT     v   ALTER TABLE ONLY public.cad_atividades ALTER COLUMN id SET DEFAULT nextval('public.cad_atividades_id_seq'::regclass);
 @   ALTER TABLE public.cad_atividades ALTER COLUMN id DROP DEFAULT;
       public               postgres    false    227    226    227            �           2604    16562    cad_atividades_grupos id    DEFAULT     �   ALTER TABLE ONLY public.cad_atividades_grupos ALTER COLUMN id SET DEFAULT nextval('public.cad_atividades_grupos_id_seq'::regclass);
 G   ALTER TABLE public.cad_atividades_grupos ALTER COLUMN id DROP DEFAULT;
       public               postgres    false    235    234    235            �           2604    16442    cad_instituicoes_saude id    DEFAULT     �   ALTER TABLE ONLY public.cad_instituicoes_saude ALTER COLUMN id SET DEFAULT nextval('public.cad_instituicoes_saude_id_seq'::regclass);
 H   ALTER TABLE public.cad_instituicoes_saude ALTER COLUMN id DROP DEFAULT;
       public               postgres    false    221    220    221            �           2604    16463    cad_pessoas id    DEFAULT     p   ALTER TABLE ONLY public.cad_pessoas ALTER COLUMN id SET DEFAULT nextval('public.cad_pessoas_id_seq'::regclass);
 =   ALTER TABLE public.cad_pessoas ALTER COLUMN id DROP DEFAULT;
       public               postgres    false    222    223    223            �           2604    16434    cad_prof_dias_disp id    DEFAULT     ~   ALTER TABLE ONLY public.cad_prof_dias_disp ALTER COLUMN id SET DEFAULT nextval('public.cad_prof_dias_disp_id_seq'::regclass);
 D   ALTER TABLE public.cad_prof_dias_disp ALTER COLUMN id DROP DEFAULT;
       public               postgres    false    217    218    218            �          0    16473 
   cad_alunos 
   TABLE DATA           8   COPY public.cad_alunos (id, registro_aluno) FROM stdin;
    public               postgres    false    225   �y       �          0    16583    cad_area_atuacao_medica 
   TABLE DATA           ;   COPY public.cad_area_atuacao_medica (id, nome) FROM stdin;
    public               postgres    false    239   �y       �          0    16547    cad_ativ_dias_semana 
   TABLE DATA           M   COPY public.cad_ativ_dias_semana (id, cod_atividade, dia_semana) FROM stdin;
    public               postgres    false    233   �y       �          0    16571    cad_ativ_grupos_alunos 
   TABLE DATA           Q   COPY public.cad_ativ_grupos_alunos (id, cod_atividade, codigo_aluno) FROM stdin;
    public               postgres    false    237   z       �          0    16522    cad_ativ_horarios 
   TABLE DATA           H   COPY public.cad_ativ_horarios (id, cod_atividade, horarios) FROM stdin;
    public               postgres    false    229   4z       �          0    16535    cad_ativ_periodos 
   TABLE DATA           G   COPY public.cad_ativ_periodos (id, cod_atividade, periodo) FROM stdin;
    public               postgres    false    231   Qz       �          0    16504    cad_atividades 
   TABLE DATA           �   COPY public.cad_atividades (id, professor_responsavel, instituicao_prestacao, qtd_vagas, dt_inicio, dt_fim, area_atuacao_medica, tipo_atividade) FROM stdin;
    public               postgres    false    227   nz       �          0    16559    cad_atividades_grupos 
   TABLE DATA           M   COPY public.cad_atividades_grupos (id, cod_atividade, dias_ativ) FROM stdin;
    public               postgres    false    235   �z       �          0    16439    cad_instituicoes_saude 
   TABLE DATA           :   COPY public.cad_instituicoes_saude (id, nome) FROM stdin;
    public               postgres    false    221   �z       �          0    16460    cad_pessoas 
   TABLE DATA           N   COPY public.cad_pessoas (id, nome, telefone, email, login, senha) FROM stdin;
    public               postgres    false    223   �z       �          0    16431    cad_prof_dias_disp 
   TABLE DATA           K   COPY public.cad_prof_dias_disp (id, dia_semana, cod_professor) FROM stdin;
    public               postgres    false    218   {       �          0    16435    cad_professores 
   TABLE DATA           C   COPY public.cad_professores (id, instituicao_trabalho) FROM stdin;
    public               postgres    false    219   ,{       �           0    0    cad_alunos_id_seq    SEQUENCE SET     @   SELECT pg_catalog.setval('public.cad_alunos_id_seq', 1, false);
          public               postgres    false    224            �           0    0    cad_area_atuacao_medica_id_seq    SEQUENCE SET     M   SELECT pg_catalog.setval('public.cad_area_atuacao_medica_id_seq', 1, false);
          public               postgres    false    238            �           0    0    cad_ativ_dias_semana_id_seq    SEQUENCE SET     J   SELECT pg_catalog.setval('public.cad_ativ_dias_semana_id_seq', 1, false);
          public               postgres    false    232            �           0    0    cad_ativ_grupos_alunos_id_seq    SEQUENCE SET     L   SELECT pg_catalog.setval('public.cad_ativ_grupos_alunos_id_seq', 1, false);
          public               postgres    false    236            �           0    0    cad_ativ_horarios_id_seq    SEQUENCE SET     G   SELECT pg_catalog.setval('public.cad_ativ_horarios_id_seq', 1, false);
          public               postgres    false    228            �           0    0    cad_ativ_periodos_id_seq    SEQUENCE SET     G   SELECT pg_catalog.setval('public.cad_ativ_periodos_id_seq', 1, false);
          public               postgres    false    230            �           0    0    cad_atividades_grupos_id_seq    SEQUENCE SET     K   SELECT pg_catalog.setval('public.cad_atividades_grupos_id_seq', 1, false);
          public               postgres    false    234            �           0    0    cad_atividades_id_seq    SEQUENCE SET     D   SELECT pg_catalog.setval('public.cad_atividades_id_seq', 1, false);
          public               postgres    false    226            �           0    0    cad_instituicoes_saude_id_seq    SEQUENCE SET     L   SELECT pg_catalog.setval('public.cad_instituicoes_saude_id_seq', 1, false);
          public               postgres    false    220            �           0    0    cad_pessoas_id_seq    SEQUENCE SET     @   SELECT pg_catalog.setval('public.cad_pessoas_id_seq', 2, true);
          public               postgres    false    222            �           0    0    cad_prof_dias_disp_id_seq    SEQUENCE SET     H   SELECT pg_catalog.setval('public.cad_prof_dias_disp_id_seq', 1, false);
          public               postgres    false    217            �           2606    16478    cad_alunos pk_cad_alunos 
   CONSTRAINT     V   ALTER TABLE ONLY public.cad_alunos
    ADD CONSTRAINT pk_cad_alunos PRIMARY KEY (id);
 B   ALTER TABLE ONLY public.cad_alunos DROP CONSTRAINT pk_cad_alunos;
       public                 postgres    false    225            �           2606    16588 2   cad_area_atuacao_medica pk_cad_area_atuacao_medica 
   CONSTRAINT     p   ALTER TABLE ONLY public.cad_area_atuacao_medica
    ADD CONSTRAINT pk_cad_area_atuacao_medica PRIMARY KEY (id);
 \   ALTER TABLE ONLY public.cad_area_atuacao_medica DROP CONSTRAINT pk_cad_area_atuacao_medica;
       public                 postgres    false    239            �           2606    16552 ,   cad_ativ_dias_semana pk_cad_ativ_dias_semana 
   CONSTRAINT     j   ALTER TABLE ONLY public.cad_ativ_dias_semana
    ADD CONSTRAINT pk_cad_ativ_dias_semana PRIMARY KEY (id);
 V   ALTER TABLE ONLY public.cad_ativ_dias_semana DROP CONSTRAINT pk_cad_ativ_dias_semana;
       public                 postgres    false    233            �           2606    16576 0   cad_ativ_grupos_alunos pk_cad_ativ_grupos_alunos 
   CONSTRAINT     n   ALTER TABLE ONLY public.cad_ativ_grupos_alunos
    ADD CONSTRAINT pk_cad_ativ_grupos_alunos PRIMARY KEY (id);
 Z   ALTER TABLE ONLY public.cad_ativ_grupos_alunos DROP CONSTRAINT pk_cad_ativ_grupos_alunos;
       public                 postgres    false    237            �           2606    16527 &   cad_ativ_horarios pk_cad_ativ_horarios 
   CONSTRAINT     d   ALTER TABLE ONLY public.cad_ativ_horarios
    ADD CONSTRAINT pk_cad_ativ_horarios PRIMARY KEY (id);
 P   ALTER TABLE ONLY public.cad_ativ_horarios DROP CONSTRAINT pk_cad_ativ_horarios;
       public                 postgres    false    229            �           2606    16540 &   cad_ativ_periodos pk_cad_ativ_periodos 
   CONSTRAINT     d   ALTER TABLE ONLY public.cad_ativ_periodos
    ADD CONSTRAINT pk_cad_ativ_periodos PRIMARY KEY (id);
 P   ALTER TABLE ONLY public.cad_ativ_periodos DROP CONSTRAINT pk_cad_ativ_periodos;
       public                 postgres    false    231            �           2606    16509     cad_atividades pk_cad_atividades 
   CONSTRAINT     ^   ALTER TABLE ONLY public.cad_atividades
    ADD CONSTRAINT pk_cad_atividades PRIMARY KEY (id);
 J   ALTER TABLE ONLY public.cad_atividades DROP CONSTRAINT pk_cad_atividades;
       public                 postgres    false    227            �           2606    16564 .   cad_atividades_grupos pk_cad_atividades_grupos 
   CONSTRAINT     l   ALTER TABLE ONLY public.cad_atividades_grupos
    ADD CONSTRAINT pk_cad_atividades_grupos PRIMARY KEY (id);
 X   ALTER TABLE ONLY public.cad_atividades_grupos DROP CONSTRAINT pk_cad_atividades_grupos;
       public                 postgres    false    235            �           2606    16444 0   cad_instituicoes_saude pk_cad_instituicoes_saude 
   CONSTRAINT     n   ALTER TABLE ONLY public.cad_instituicoes_saude
    ADD CONSTRAINT pk_cad_instituicoes_saude PRIMARY KEY (id);
 Z   ALTER TABLE ONLY public.cad_instituicoes_saude DROP CONSTRAINT pk_cad_instituicoes_saude;
       public                 postgres    false    221            �           2606    16465    cad_pessoas pk_cad_pessoas 
   CONSTRAINT     X   ALTER TABLE ONLY public.cad_pessoas
    ADD CONSTRAINT pk_cad_pessoas PRIMARY KEY (id);
 D   ALTER TABLE ONLY public.cad_pessoas DROP CONSTRAINT pk_cad_pessoas;
       public                 postgres    false    223            �           2606    16453 (   cad_prof_dias_disp pk_cad_prof_dias_disp 
   CONSTRAINT     f   ALTER TABLE ONLY public.cad_prof_dias_disp
    ADD CONSTRAINT pk_cad_prof_dias_disp PRIMARY KEY (id);
 R   ALTER TABLE ONLY public.cad_prof_dias_disp DROP CONSTRAINT pk_cad_prof_dias_disp;
       public                 postgres    false    218            �           2606    16451 "   cad_professores pk_cad_professores 
   CONSTRAINT     `   ALTER TABLE ONLY public.cad_professores
    ADD CONSTRAINT pk_cad_professores PRIMARY KEY (id);
 L   ALTER TABLE ONLY public.cad_professores DROP CONSTRAINT pk_cad_professores;
       public                 postgres    false    219            �           1259    16533    cad_ativ_horarios_idx01    INDEX     b   CREATE INDEX cad_ativ_horarios_idx01 ON public.cad_ativ_horarios USING btree (id, cod_atividade);
 +   DROP INDEX public.cad_ativ_horarios_idx01;
       public                 postgres    false    229    229            �           1259    16520    cad_ativdades_idx01    INDEX     c   CREATE INDEX cad_ativdades_idx01 ON public.cad_atividades USING btree (id, professor_responsavel);
 '   DROP INDEX public.cad_ativdades_idx01;
       public                 postgres    false    227    227            �           1259    16466    cad_pessoas_index    INDEX     G   CREATE INDEX cad_pessoas_index ON public.cad_pessoas USING btree (id);
 %   DROP INDEX public.cad_pessoas_index;
       public                 postgres    false    223            �           2606    16479     cad_alunos fk_cad_alunos_pessoas    FK CONSTRAINT     �   ALTER TABLE ONLY public.cad_alunos
    ADD CONSTRAINT fk_cad_alunos_pessoas FOREIGN KEY (id) REFERENCES public.cad_pessoas(id);
 J   ALTER TABLE ONLY public.cad_alunos DROP CONSTRAINT fk_cad_alunos_pessoas;
       public               postgres    false    225    223    4815            �           2606    16589 '   cad_atividades fk_cad_ativ_area_atuacao    FK CONSTRAINT     �   ALTER TABLE ONLY public.cad_atividades
    ADD CONSTRAINT fk_cad_ativ_area_atuacao FOREIGN KEY (area_atuacao_medica) REFERENCES public.cad_area_atuacao_medica(id);
 Q   ALTER TABLE ONLY public.cad_atividades DROP CONSTRAINT fk_cad_ativ_area_atuacao;
       public               postgres    false    239    227    4833            �           2606    16577 2   cad_ativ_grupos_alunos fk_cad_ativ_grp_alunos_ativ    FK CONSTRAINT     �   ALTER TABLE ONLY public.cad_ativ_grupos_alunos
    ADD CONSTRAINT fk_cad_ativ_grp_alunos_ativ FOREIGN KEY (id) REFERENCES public.cad_atividades(id);
 \   ALTER TABLE ONLY public.cad_ativ_grupos_alunos DROP CONSTRAINT fk_cad_ativ_grp_alunos_ativ;
       public               postgres    false    237    4820    227            �           2606    16565 -   cad_atividades_grupos fk_cad_ativ_grupos_ativ    FK CONSTRAINT     �   ALTER TABLE ONLY public.cad_atividades_grupos
    ADD CONSTRAINT fk_cad_ativ_grupos_ativ FOREIGN KEY (id) REFERENCES public.cad_atividades(id);
 W   ALTER TABLE ONLY public.cad_atividades_grupos DROP CONSTRAINT fk_cad_ativ_grupos_ativ;
       public               postgres    false    4820    235    227            �           2606    16528 +   cad_ativ_horarios fk_cad_ativ_horarios_ativ    FK CONSTRAINT     �   ALTER TABLE ONLY public.cad_ativ_horarios
    ADD CONSTRAINT fk_cad_ativ_horarios_ativ FOREIGN KEY (id) REFERENCES public.cad_atividades(id);
 U   ALTER TABLE ONLY public.cad_ativ_horarios DROP CONSTRAINT fk_cad_ativ_horarios_ativ;
       public               postgres    false    4820    229    227            �           2606    16541 +   cad_ativ_periodos fk_cad_ativ_periodos_ativ    FK CONSTRAINT     �   ALTER TABLE ONLY public.cad_ativ_periodos
    ADD CONSTRAINT fk_cad_ativ_periodos_ativ FOREIGN KEY (cod_atividade) REFERENCES public.cad_atividades(id);
 U   ALTER TABLE ONLY public.cad_ativ_periodos DROP CONSTRAINT fk_cad_ativ_periodos_ativ;
       public               postgres    false    227    231    4820            �           2606    16515 )   cad_atividades fk_cad_atividades_inst_atu    FK CONSTRAINT     �   ALTER TABLE ONLY public.cad_atividades
    ADD CONSTRAINT fk_cad_atividades_inst_atu FOREIGN KEY (instituicao_prestacao) REFERENCES public.cad_instituicoes_saude(id);
 S   ALTER TABLE ONLY public.cad_atividades DROP CONSTRAINT fk_cad_atividades_inst_atu;
       public               postgres    false    221    4812    227            �           2606    16510 %   cad_atividades fk_cad_atividades_prof    FK CONSTRAINT     �   ALTER TABLE ONLY public.cad_atividades
    ADD CONSTRAINT fk_cad_atividades_prof FOREIGN KEY (professor_responsavel) REFERENCES public.cad_professores(id);
 O   ALTER TABLE ONLY public.cad_atividades DROP CONSTRAINT fk_cad_atividades_prof;
       public               postgres    false    227    4810    219            �           2606    16553 -   cad_ativ_dias_semana fk_cad_atv_dias_disp_atv    FK CONSTRAINT     �   ALTER TABLE ONLY public.cad_ativ_dias_semana
    ADD CONSTRAINT fk_cad_atv_dias_disp_atv FOREIGN KEY (cod_atividade) REFERENCES public.cad_atividades(id);
 W   ALTER TABLE ONLY public.cad_ativ_dias_semana DROP CONSTRAINT fk_cad_atv_dias_disp_atv;
       public               postgres    false    227    4820    233            �           2606    16454 -   cad_prof_dias_disp fk_cad_prof_dias_disp_prof    FK CONSTRAINT     �   ALTER TABLE ONLY public.cad_prof_dias_disp
    ADD CONSTRAINT fk_cad_prof_dias_disp_prof FOREIGN KEY (cod_professor) REFERENCES public.cad_professores(id);
 W   ALTER TABLE ONLY public.cad_prof_dias_disp DROP CONSTRAINT fk_cad_prof_dias_disp_prof;
       public               postgres    false    4810    218    219            �           2606    16445 &   cad_professores fk_cad_prof_inst_saude    FK CONSTRAINT     �   ALTER TABLE ONLY public.cad_professores
    ADD CONSTRAINT fk_cad_prof_inst_saude FOREIGN KEY (instituicao_trabalho) REFERENCES public.cad_instituicoes_saude(id);
 P   ALTER TABLE ONLY public.cad_professores DROP CONSTRAINT fk_cad_prof_inst_saude;
       public               postgres    false    221    4812    219            �           2606    16467 *   cad_professores fk_cad_professores_pessoas    FK CONSTRAINT     �   ALTER TABLE ONLY public.cad_professores
    ADD CONSTRAINT fk_cad_professores_pessoas FOREIGN KEY (id) REFERENCES public.cad_pessoas(id);
 T   ALTER TABLE ONLY public.cad_professores DROP CONSTRAINT fk_cad_professores_pessoas;
       public               postgres    false    4815    223    219            �      x������ � �      �      x������ � �      �      x������ � �      �      x������ � �      �      x������ � �      �      x������ � �      �      x������ � �      �      x������ � �      �      x������ � �      �   :   x�3��)MN,���,I-.Iu �z���|C#c.#��HL��"S3S3�=... =��      �      x������ � �      �      x������ � �     