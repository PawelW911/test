CREATE TABLE main_meal
(
    main_meal_id    SERIAL          NOT NULL,
    name            VARCHAR(32)     NOT NULL,
    composition     TEXT            NOT NULL,
    price           NUMERIC(6,2)    NOT NULL,
    quantity        INT             NOT NULL,
    PRIMARY KEY (main_meal_id)
);