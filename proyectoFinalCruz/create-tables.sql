CREATE table client(
 id INT NOT NULL,
 name VARCHAR(150) NOT NULL,
 lastname VARCHAR(150) not NULL,
 dni INT NOT NULL,
 PRIMARY KEY(id)
);

CREATE TABLE products(
 id INT NOT NULL,
 name VARCHAR(150) NOT NULL,
 price FLOAT NOT NULL,
 quantity INT NOT NULL,
 PRIMARY KEY(id)
);

-
