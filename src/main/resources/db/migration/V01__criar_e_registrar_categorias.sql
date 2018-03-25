CREATE TABLE categories (
	id_category BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
	nm_category VARCHAR(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO categories (nm_category) values ('Lazer');
INSERT INTO categories (nm_category) values ('Alimentação');
INSERT INTO categories (nm_category) values ('Supermercado');
INSERT INTO categories (nm_category) values ('Farmácia');
INSERT INTO categories (nm_category) values ('Outros');