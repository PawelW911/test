CREATE TABLE menu
(
    menu_id         SERIAL  NOT NULL,
    main_meal_id    INT     NOT NULL,
    appetizer_id    INT     NOT NULL,
    soup_id         INT     NOT NULL,
    desert_id       INT     NOT NULL,
    drink_id        INT     NOT NULL,
    PRIMARY KEY (menu_id),
    CONSTRAINT fk_menu_main_meal
        FOREIGN KEY (main_meal_id)
            REFERENCES main_meal (main_meal_id),
    CONSTRAINT fk_menu_appetizer
        FOREIGN KEY (appetizer_id)
            REFERENCES appetizer (appetizer_id),
    CONSTRAINT fk_menu_soup
        FOREIGN KEY (soup_id)
            REFERENCES soup (soup_id),
    CONSTRAINT fk_menu_desert
        FOREIGN KEY (desert_id)
            REFERENCES desert (desert_id),
    CONSTRAINT fk_menu_drink
        FOREIGN KEY (drink_id)
            REFERENCES drink (drink_id)
);