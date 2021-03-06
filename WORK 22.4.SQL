-- // Triggers on BOOKS table

CREATE TABLE BOOKS_AUD (
	EVENT_ID int(11) NOT null auto_increment,
    EVENT_DATE datetime not null,
    EVENT_TYPE varchar(10) default null,
    BOOK_ID int(11) not null,
    OLD_BOOK_ID int(11),
    NEW_BOOK_ID int(11),
    OLD_TITLE varchar(255),
    NEW_TITLE varchar(255),
    OLD_PUBYEAR int(4),
    NEW_PUBYEAR int(4),
    OLD_BESTSELLER boolean,
    NEW_BESTSELLER boolean,
    primary key (EVENT_ID)
);

commit;

DELIMITER $$
CREATE TRIGGER BOOKS_INSERT AFTER INSERT ON BOOKS
FOR EACH ROW
BEGIN
	INSERT INTO BOOKS_AUD (EVENT_DATE, EVENT_TYPE, BOOK_ID,  NEW_TITLE, NEW_PUBYEAR)
		VALUES (CURTIME(), "INSERT", NEW.BOOK_ID, NEW.TITLE, NEW.PUBYEAR);
END $$
DELIMITER ;

commit;

DELIMITER $$
CREATE TRIGGER BOOKS_DELETE AFTER DELETE ON BOOKS
FOR EACH ROW
BEGIN
	INSERT INTO BOOKS_AUD (EVENT_DATE, EVENT_TYPE, BOOK_ID,  NEW_TITLE, NEW_PUBYEAR)
		VALUES (CURTIME(), "DELETE", OLD.BOOK_ID, OLD.TITLE, OLD.PUBYEAR);
END $$
DELIMITER ;

commit;

DELIMITER $$
CREATE TRIGGER BOOKS_UPDATE AFTER UPDATE ON BOOKS
FOR EACH ROW
BEGIN
	INSERT INTO BOOKS_AUD (EVENT_DATE, EVENT_TYPE, BOOK_ID, NEW_BOOK_ID, NEW_TITLE,
	                    NEW_PUBYEAR, NEW_BESTSELLER, OLD_BOOK_ID, OLD_TITLE, OLD_PUBYEAR, OLD_BESTSELLER)
		VALUES (CURTIME(), "UDPATE", OLD.BOOK_ID, NEW.BOOK_ID, NEW.TITLE, NEW.PUBYEAR,
		                  NEW.BESTSELLER, OLD.BOOK_ID, OLD.TITLE, OLD.PUBYEAR, OLD.BESTSELLER);
END $$
DELIMITER ;

-- // Triggers on READERS table

CREATE TABLE READERS_AUD (
	EVENT_ID INT(11) NOT NULL AUTO_INCREMENT,
  EVENT_DATE DATETIME NOT NULL,
  EVENT_TYPE VARCHAR (10) DEFAULT NULL,
  READER_ID INT(11) NOT NULL,
  OLD_FIRSTNAME VARCHAR(255),
  NEW_FIRSTNAME VARCHAR(255),
  OLD_LASTNAME VARCHAR(255),
  NEW_LASTNAME VARCHAR(255),
  OLD_PESELID VARCHAR(11),
  NEW_PESELID VARCHAR(11),
  OLD_VIP_LEVEL VARCHAR(20),
  NEW_VIP_LEVEL VARCHAR(20),
  PRIMARY KEY (EVENT_ID)
);

COMMIT;

DELIMITER $$
CREATE TRIGGER READERS_INSERT AFTER INSERT ON READERS
FOR EACH ROW
BEGIN
	INSERT INTO READERS_AUD (EVENT_DATE, EVENT_TYPE, READER_ID,  NEW_FIRSTNAME, NEW_LASTNAME, NEW_PESELID)
		VALUES (CURTIME(), "INSERT", NEW.READER_ID, NEW.FIRSTNAME, NEW.LASTNAME, NEW.PESELID);
END $$
DELIMITER ;

commit;

DELIMITER $$
CREATE TRIGGER READERS_DELETE AFTER DELETE ON READERS
FOR EACH ROW
BEGIN
	INSERT INTO READERS_AUD (EVENT_DATE, EVENT_TYPE, READER_ID,  NEW_FIRSTNAME, NEW_LASTNAME, NEW_PESELID)
		VALUES (CURTIME(), "DELETE", OLD.READER_ID, OLD.FIRSTNAME, OLD.LASTNAME, OLD.PESELID);
END $$
DELIMITER ;

commit;

DELIMITER $$
CREATE TRIGGER READERS_UPDATE AFTER UPDATE ON READERS
FOR EACH ROW
BEGIN
	INSERT INTO READERS_AUD (EVENT_DATE, EVENT_TYPE, READER_ID,  NEW_FIRSTNAME, NEW_LASTNAME,
	                NEW_PESELID, NEW_VIP_LEVEL, OLD_FIRSTNAME, OLD_LASTNAME, OLD_PESELID, OLD_VIP_LEVEL)
		VALUES (CURTIME(), "UPDATE", OLD.READER_ID, NEW.FIRSTNAME, NEW.LASTNAME, NEW.PESELID,
		              NEW.VIP_LEVEL, OLD.FIRSTNAME, OLD.LASTNAME, OLD.PESELID, OLD.VIP_LEVEL);
END $$
DELIMITER ;