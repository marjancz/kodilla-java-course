EXPLAIN SELECT FIRSTNAME
FROM READERS
WHERE FIRSTNAME = 'John';

CREATE INDEX BOOKNO ON BOOKS (TITLE);
CREATE INDEX READERNO ON READERS (FIRSTNAME, LASTNAME);

EXPLAIN SELECT FIRSTNAME
FROM READERS
WHERE FIRSTNAME = 'John';