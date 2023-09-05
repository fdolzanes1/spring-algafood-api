insert into kitchen (name) values ('Tailandesa');
insert into kitchen (name) values ('Indiana');
insert into kitchen (name) values ('Japonesa');
insert into kitchen (name) values ('Mexicana');
insert into kitchen (name) values ('Italiana');

insert into restaurant (name, shipping_fee, kitchen_id) values ('Thai Gourmet', 10.0, 1);
insert into restaurant (name, shipping_fee, kitchen_id) values ('Thai Delivery', 9.50, 1);
insert into restaurant (name, shipping_fee, kitchen_id) values ('Tuk Tuk Comida Indiana', 15.0, 2);

insert into state (name) values ('Minas Gerais');
insert into state (name) values ('Sao Paulo');
insert into state (name) values ('Ceara');

insert into city (name, state_id) values ('Uberlandia', 1);
insert into city (name, state_id) values ('Belo Horizonte', 1);
insert into city (name, state_id) values ('Sao Paulo', 2);
insert into city (name, state_id) values ('Campinas', 2);
insert into city (name, state_id) values ('Fortaleza', 3);

insert into payment_method (description) values ('Cartao de credito');
insert into payment_method (description) values ('Cartao de debito');
insert into payment_method (description) values ('Dinheiro');

insert into permission (name, description) values ('CONSULTAR_COZINHAS', 'Permite consultar cozinhas');
insert into permission (name, description) values ('EDITAR_COZINHAS', 'Permite editar cozinhas');
