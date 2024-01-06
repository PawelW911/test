CREATE TABLE food_order
(
    food_order_id            SERIAL                      NOT NULL,
    food_order_number        VARCHAR(32)                 NOT NULL,
    received_date_time  TIMESTAMP WITH TIME ZONE    NOT NULL,
    completed_date_time TIMESTAMP WITH TIME ZONE    NOT NULL,
    sum_cost            NUMERIC(7,2)                NOT NULL,
    restaurant_id       INT                         NOT NULL,
    customer_id         INT                         NOT NULL,
    appetizer_id        INT,
    soup_id             INT,
    main_meal_id        INT,
    desert_id           INT,
    drink_id            INT,
    PRIMARY KEY (food_order_id),
    UNIQUE (food_order_number),
    CONSTRAINT fk_food_order_restaurant
        FOREIGN KEY (restaurant_id)
            REFERENCES restaurant (restaurant_id),
    CONSTRAINT fk_food_order_customer
        FOREIGN KEY (customer_id)
            REFERENCES customer (customer_id),
    CONSTRAINT fk_food_order_appetizer
        FOREIGN KEY (appetizer_id)
            REFERENCES appetizer (appetizer_id),
    CONSTRAINT fk_food_order_soup
        FOREIGN KEY (soup_id)
            REFERENCES soup (soup_id),
    CONSTRAINT fk_food_order_main_meal
        FOREIGN KEY (main_meal_id)
            REFERENCES main_meal (main_meal_id),
    CONSTRAINT fk_food_order_desert
        FOREIGN KEY (desert_id)
            REFERENCES desert (desert_id),
    CONSTRAINT fk_food_order_drink
        FOREIGN KEY (drink_id)
            REFERENCES drink (drink_id)
);