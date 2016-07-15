ALTER TABLE book ADD CONSTRAINT book_edition_id_fk FOREIGN KEY (book_edition_id) REFERENCES book_edition (id) MATCH FULL;
ALTER TABLE book_edition ADD CONSTRAINT book_id_fk FOREIGN KEY (book_id) REFERENCES book (id) MATCH FULL;
ALTER TABLE book_author ADD CONSTRAINT book_book_author_id_fk FOREIGN KEY (author_id) REFERENCES author (id) MATCH FULL;
ALTER TABLE book_author ADD CONSTRAINT author_book_author_id_fk FOREIGN KEY (book_id) REFERENCES book (id) MATCH FULL;