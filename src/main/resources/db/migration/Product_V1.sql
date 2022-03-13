CREATE TABLE product
(
    id                 SEQUENCE       NOT NULL,
    name               VARCHAR(50)    NOT NULL,
    description        VARCHAR(1000)  NOT NULL,
    price              DECIMAL(10, 2) NOT NULL
);