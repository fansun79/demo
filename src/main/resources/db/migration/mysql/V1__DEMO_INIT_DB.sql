CREATE TABLE T_TRADING_ACCOUNT(
  ID INT(11) NOT NULL AUTO_INCREMENT,
  ACCOUNT_NAME VARCHAR(100) NOT NULL,
  PASSWORD VARCHAR(100) NOT NULL,
  DATASOURCE VARCHAR(32) NOT NULL,
  PRIMARY KEY (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE T_TRADER(
  ID INT(11) NOT NULL AUTO_INCREMENT,
  NAME varchar(100) NOT NULL,
  PRIMARY KEY (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


CREATE TABLE T_TRADING_ACCOUNT_TRADER(

    ACCOUNT_ID INT(11) NOT NULL,
    TRADER_ID INT(11) NOT NULL

)ENGINE=InnoDB DEFAULT CHARSET=utf8;

ALTER TABLE T_TRADING_ACCOUNT_TRADER ADD INDEX INDEX_ACCOUNTID(ACCOUNT_ID);