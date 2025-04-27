-- Migration: V20250427_150226__login_nome_senha_not_null.sql

-- Escreva seu SQL aqui...
alter table cad_pessoas
alter column nome set not null,
alter column senha set not null,
alter column login set not null,
alter column tipo set not null;
