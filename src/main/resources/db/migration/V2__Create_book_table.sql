CREATE SEQUENCE book_id_seq;
CREATE TABLE book
(
  id BIGINT PRIMARY KEY NOT NULL,
  title VARCHAR(255),
  book_edition_id BIGINT
);