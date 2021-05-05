create table customers
(
    id           bigserial primary key,
    name         varchar not null,
    surname      varchar not null,
    age          smallint check ( age > 0 and age < 100 ),
    phone_number bigint unique
);

create table orders
(
    id           bigserial primary key,
    date         timestamptz default now(),
    customer_id  bigint references customers (id),
    product_name varchar not null unique,
    amount       integer not null
);