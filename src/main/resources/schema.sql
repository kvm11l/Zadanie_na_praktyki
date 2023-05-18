CREATE TABLE KLIENT (
  id_klient INT PRIMARY KEY,
  imie VARCHAR(50),
  nazwisko VARCHAR(50),
  id_zamowienia INT
);



CREATE TABLE ZAMOWIENIE (
    id_zamowienia INT PRIMARY KEY,
    produkt VARCHAR(50),
    ilosc INT
);

CREATE TABLE FAKTURA (
    id_faktury INT PRIMARY KEY,
    id_zamowienia INT,
    id_klient INT,
    cena DOUBLE
);





CREATE TABLE POST (
  id BIGINT AUTO_INCREMENT  PRIMARY KEY,
  title VARCHAR(400) NOT NULL,
  content VARCHAR(2000) NULL,
  created timestamp
);

CREATE TABLE COMMENT (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    post_id BIGINT NOT NULL,
    content VARCHAR(2000) NULL,
    created timestamp
);

ALTER TABLE COMMENT
    ADD CONSTRAINT comment_post_id
    FOREIGN KEY (post_id) REFERENCES post(id)
    ;



// komentarz polacze z postami przez post_id i id

