---------INDEX IN MYSQL----------

//1.We create an index at the time of table creation in the database. The following statement creates a table with an index that contains 
two columns col2 and col3.

CREATE TABLE T_INDEX(COL1 INT PRIMARY KEY,COL2 INT NOT NULL,COL3 INT NOT NULL,COL4 VARCHAR(20),INDEX(COL2,COL3));

//2.We want to add the new index for the column col4, we use the following statement.

CREATE INDEX IND_1 ON T_INDEX(COL4);

//3.The following statement to return the result of the student whose class is CS branch.

SELECT STUDENTID,FIRSTNAME,LASTNAME FROM STUDENT WHERE CLASS='CS';

//4.You want to see how MySQL performs this query internally, execute the following statement.

EXPLAIN SELECT STUDENTID,FIRSTNAME,LASTNAME FROM STUDENT WHERE CLASS='CS';

//5.Create an index for a class column using the following statement.
CREATE INDEX CLASS ON STUDENT(CLASS);

//6.You want to show the indexes of a table, execute the following statement:

SHOW INDEXES FROM STUDENT;