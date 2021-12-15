-------MYSQL TABLE LOCKING------

//1.Create a new table named "info_table" using the statement as follows.

    CREATE TABLE INFO_TABLE (   
        ID INT NOT NULL AUTO_INCREMENT,   
        NAME VARCHAR(50) NOT NULL,   
        MESSAGE VARCHAR(80) NOT NULL,  
        PRIMARY KEY (ID)   
    );  

 We will first connect to the database and use the CONNECTION_ID() function that gives the current connection id in the first session
as follows.
SELECT CONNECTION_ID();

INSERT INTO INFO_TABLE(NAME,MESSSAGE)
VALUES('PETER','HII'),
('JOSEPH','HELLO'),
('MARK','WELCOME');

We will execute the LOCK TABLE statement to acquire a lock onto the table
LOCK TABLE INFO_TABLE READ;
