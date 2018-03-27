INSERT INTO POSTS (USER_ID, BODY)
VALUES (3, "Hey Zachary, could U send me your email address?");

COMMIT;

UPDATE POSTS
SET BODY = "To delete"
WHERE ID = 7 AND USER_ID = 3;

COMMIT;

DELETE FROM POSTS
WHERE ID = 7;

COMMIT;

INSERT INTO POSTS (USER_ID, BODY)
VALUES (5, "I finally got 2 tickets for the Metallica concert !!!");

COMMIT;

UPDATE POSTS
SET BODY = "To delete"
WHERE ID = 8 AND USER_ID = 5;

COMMIT;

DELETE FROM POSTS
WHERE ID = 8;

COMMIT;

INSERT INTO POSTS (USER_ID, BODY)
VALUES (5, "It will be awsome concert!!!");

COMMIT;

UPDATE POSTS
SET BODY = "To delete"
WHERE ID = 9 AND USER_ID = 5;

COMMIT;

DELETE FROM POSTS
WHERE ID = 9;

COMMIT;




