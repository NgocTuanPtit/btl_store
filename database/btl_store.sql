use mobilestore;

CREATE TABLE customer(
  id bigint NOT NULL PRIMARY KEY auto_increment,
  name VARCHAR(255) NOT NULL,
  code VARCHAR(255) NOT NULL,
  address VARCHAR(255) NOT NULL,
  phone VARCHAR(255) NOT NULL,
  birthday TIMESTAMP NULL
);

CREATE TABLE item (
  id bigint NOT NULL PRIMARY KEY auto_increment,
  name VARCHAR(150) NOT NULL,
  type VARCHAR(150) NOT NULL,
  image VARCHAR(150) NULL,
  status int NOT NULL,
  cost float NOT NULL
);

CREATE TABLE buy (
  customer_id bigint NOT NULL,
  item_id bigint NOT NULL
);

ALTER TABLE buy ADD CONSTRAINT fk_buy_customer FOREIGN KEY (customer_id) REFERENCES customer(id);
ALTER TABLE buy ADD CONSTRAINT fk_buy_item FOREIGN KEY (item_id) REFERENCES item(id);