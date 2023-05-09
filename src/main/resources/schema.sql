CREATE TABLE orders
(
    order_id    integer      not null,
    item_name   varchar(100) not null,
    user_name   varchar(100) not null,
    price       integer      not null,
    create_time timestamp    not null
);