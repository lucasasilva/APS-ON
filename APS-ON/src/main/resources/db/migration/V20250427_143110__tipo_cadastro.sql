-- Migration: V20250427_143110__tipo_cadastro.sql

-- Escreva seu SQL aqui...
alter table cad_pessoas
add tipo varchar(1);
