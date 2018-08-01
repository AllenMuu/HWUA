

CREATE TABLE USERS(
ID Integer PRIMARY KEY auto_increment,
NAME VARCHAR(20) UNIQUE,
PWD VARCHAR(20) NOT NULL
);

CREATE TABLE MESSAGES(
ID Integer PRIMARY KEY auto_increment,
SENDID Integer NOT NULL,
TITLE VARCHAR(40) NOT NULL,
MSGCONTENT VARCHAR(400) NOT NULL,
STATE Integer NOT NULL,
RECEIVEID Integer NOT NULL,
MSG_CREATE_DATE VARCHAR(20) NOT NULL,
CONSTRAINT FK_S_NAME FOREIGN KEY(SENDID) REFERENCES USERS(ID),
CONSTRAINT FK_R_NAME FOREIGN KEY(RECEIVEID)REFERENCES USERS(ID)
);

