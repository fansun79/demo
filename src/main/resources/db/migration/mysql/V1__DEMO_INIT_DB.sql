CREATE TABLE T_USER(
  ID INT(11) NOT NULL AUTO_INCREMENT,
  ACCOUNT_ID VARCHAR(100) NOT NULL,
  PASSWORD VARCHAR(100) NOT NULL,
  NAME VARCHAR(32) NOT NULL,
  PRIMARY KEY (ID)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


CREATE TABLE T_ROLE(
  ID INT(11) NOT NULL AUTO_INCREMENT,
  NAME VARCHAR(32) NOT NULL UNIQUE ,
  REMARK VARCHAR(255),
  PRIMARY KEY (ID)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE T_ROLE_USER(
  USER_ID INT(11) NOT NULL,
  ROLE_ID INT(11) NOT NULL,
  PRIMARY KEY (USER_ID,ROLE_ID)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

ALTER TABLE T_USER ADD INDEX INDEX_ACCOUNTID(ACCOUNT_ID);