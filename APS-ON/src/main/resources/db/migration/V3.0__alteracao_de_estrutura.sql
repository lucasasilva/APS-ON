alter table cad_atividades
add periodo varchar(50);

DROP TABLE CAD_ATIV_PERIODOS;

alter table cad_pessoas add tipo varchar(1);

insert into cad_pessoas (nome, login, senha, tipo) values ('admin', 'admin','admin','S');

create or replace FUNCTION BLOCK_DELETE_ADMIN()
RETURNS TRIGGER AS $$
BEGIN
	IF old.id = 1 THEN
	RAISE EXCEPtION 'Não é permitido excluir usuário admin seu macaco prego troncho';
	end if;
	RETURN old;
END;
$$ LANGUAGE plpgsql;

create trigger trg_block_delete_admin
BEFORE delete on cad_pessoas
for each row execute function BLOCK_DELETE_ADMIN();