#!/bin/bash

# Nome descritivo (use aspas se tiver espaços)
DESCRIPTION=$1

if [ -z "$DESCRIPTION" ]; then
  echo "❗ Informe uma descrição: ./create-flyway.sh criar_tabela_alunos"
  exit 1
fi

# Gera timestamp
TIMESTAMP=$(date +"%Y%m%d_%H%M%S")

# Formata nome
FILENAME="V${TIMESTAMP}__${DESCRIPTION// /_}.sql"

# Caminho onde o arquivo será criado (ajuste se necessário)
MIGRATION_DIR="src/main/resources/db/migration"

# Cria diretório se não existir
mkdir -p "$MIGRATION_DIR"

# Caminho completo
FULL_PATH="$MIGRATION_DIR/$FILENAME"

# Conteúdo base
echo "-- Migration: $FILENAME

-- Escreva seu SQL aqui...
" > "$FULL_PATH"

echo "✔️ Criado: $FULL_PATH"
