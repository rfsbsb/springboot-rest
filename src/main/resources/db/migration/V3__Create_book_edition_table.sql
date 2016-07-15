CREATE SEQUENCE book_edition_id_seq;
CREATE TABLE book_edition
(
  id BIGINT PRIMARY KEY NOT NULL,
  title VARCHAR(255),
  year INT,
  pages INT,
  isbn13 BIGINT,
  isbn10 BIGINT,
  book_id BIGINT NOT NULL
);