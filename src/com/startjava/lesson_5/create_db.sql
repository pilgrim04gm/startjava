-- create database

CREATE DATABASE jaegers;

-- connect to jaegers

\c jaegers;

-- create table

CREATE TABLE JaegersTable(
	id        SERIAL Primary Key, 
	modelName TEXT,
	mark      CHARACTER(6),
	height    REAL,
	weight    REAL,
	status    TEXT,
	origin    TEXT,
	launch    DATE,
	kaijuKill SMALLINT
	);

