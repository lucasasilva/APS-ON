-- Migration: V20250427_220149__alteracoes_cad_atividades.sql

-- Escreva seu SQL aqui...
alter table cad_atividades
alter column professor_responsavel set not null,
alter column instituicao_prestacao set not null,
alter column qtd_vagas set not null,
alter column dt_inicio set not null,
alter column dt_fim set not null,
alter column area_atuacao_media set not null,
alter column tipo_atividade set not null;
