CREATE TABLE street_delivery
(
    street_delivery_id  SERIAL      NOT NULL,
    street              VARCHAR(32) NOT NULL,
    city                VARCHAR(32) NOT NULL,
    PRIMARY KEY (street_delivery_id)
);