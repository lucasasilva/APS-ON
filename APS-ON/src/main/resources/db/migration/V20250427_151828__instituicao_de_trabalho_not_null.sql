-- Migration: V20250427_151828__instituicao_de_trabalho_not_null.sql

-- Escreva seu SQL aqui...

alter table cad_professores
alter column instituicao_trabalho set not null;