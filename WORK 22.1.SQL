-- FUNCTION returns reader by ID

DROP FUNCTION IF EXISTS Reader;

DELIMITER $$

CREATE FUNCTION Reader(readerId int) returns varchar(255) deterministic

BEGIN

  DECLARE errorInfo varchar(20) DEFAULT 'Wrong Id number!';
  DECLARE reader_name varchar(255);

  IF readerId <= 0 THEN
    return errorInfo;

  ELSE
    SELECT LASTNAME into reader_name FROM READERS
	  WHERE READER_ID = readerId;
	return reader_name;
  END IF;
-- return null;

END $$

DELIMITER ;

SELECT Reader(1);


-- PROCEDURE returns reader by ID

DROP PROCEDURE IF EXISTS Reader;

DELIMITER $$

CREATE PROCEDURE Reader(readerId int)

BEGIN

  DECLARE errorInfo varchar(255) DEFAULT 'Wrong Id number!';

  IF readerId <= 0 THEN
    SELECT errorInfo;

  ELSE
    SELECT READER_ID, FIRSTNAME, LASTNAME, PESELID FROM READERS
	  WHERE READER_ID = readerId;

  END IF;

END $$

DELIMITER ;

CALL Reader(2);