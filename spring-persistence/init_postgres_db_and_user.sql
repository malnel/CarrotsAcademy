CREATE DATABASE bookee;
CREATE USER my_user WITH PASSWORD 'my_password';
\c bookee
CREATE TABLE book(
book_id serial PRIMARY KEY,
title VARCHAR(50) NOT NULL,
isbn VARCHAR(17) UNIQUE NOT NULL,
author VARCHAR(50) UNIQUE NOT NULL
);

INSERT INTO book (book_id, title, isbn, author) VALUES
(1,'aTitle','anIsbn','aValue');

GRANT ALL PRIVILEGES ON ALL TABLES IN SCHEMA public TO my_user;
GRANT ALL PRIVILEGES ON ALL SEQUENCES IN SCHEMA public to my_user;
GRANT ALL PRIVILEGES ON ALL FUNCTIONS IN SCHEMA public to my_user;
