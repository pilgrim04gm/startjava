SELECT * from JaegersTable;

SELECT modelName, status FROM JaegersTable WHERE Status != 'destroyed';

SELECT modelName, mark FROM JaegersTable WHERE mark = 'Mark-1' OR mark = 'Mark-6';

SELECT * FROM JaegersTable ORDER BY mark DESC;

SELECT modelName, launch FROM JaegersTable WHERE launch = (SELECT MIN(launch) FROM JaegersTable);

SELECT modelName, kaijukill FROM JaegersTable WHERE kaijukill = (SELECT MAX(kaijukill) FROM JaegersTable);

SELECT modelName, kaijukill FROM JaegersTable WHERE kaijukill = (SELECT MIN(kaijukill) FROM JaegersTable);

SELECT AVG(weight) FROM JaegersTable;

UPDATE JaegersTable SET kaijukill = kaijukill+1 WHERE status = 'alive';
	
DELETE FROM JaegersTable WHERE status = 'destroyed';
	