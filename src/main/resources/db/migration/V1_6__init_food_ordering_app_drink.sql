CREATE TABLE drink
(
    drink_id       SERIAL          NOT NULL,
    name            VARCHAR(32)     NOT NULL,
    composition     TEXT            NOT NULL,
    alcohol_free    BOOLEAN         NOT NULL,
    price           NUMERIC(6,2)    NOT NULL,
    quantity        INT             NOT NULL,
    PRIMARY KEY (drink_id)
);