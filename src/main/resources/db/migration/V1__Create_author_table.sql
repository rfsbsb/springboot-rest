CREATE SEQUENCE author_id_seq;
CREATE TABLE author
(
    id BIGINT PRIMARY KEY NOT NULL,
    birth BYTEA,
    name VARCHAR(255),
    nationality VARCHAR(255)
);