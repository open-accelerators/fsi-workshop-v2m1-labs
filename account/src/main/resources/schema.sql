DROP TABLE IF EXISTS account;
DROP TABLE IF EXISTS customer_account_xref;

CREATE TABLE account (
  accountId VARCHAR(8) NOT NULL PRIMARY KEY,
  type VARCHAR(24),
  description VARCHAR(30),
  balance NUMERIC(10,2),
  balanceDate TIMESTAMP,
  creditLine NUMERIC(10,2),
  beginBalance NUMERIC(10,2),
  beginBalanceTimestamp TIMESTAMP
);

CREATE TABLE customer_account_xref (
    customerId VARCHAR(8),
    accountId VARCHAR(8)
);

INSERT INTO account VALUES('5005','Money Market','Hi Balance',3400.00,'2019-10-25 12:55:33.000000000',0.00,3500.00,'2019-07-28 23:03:20.000000000');
INSERT INTO account VALUES('5006','Checking','Checking',2475.54,'2019-10-28 12:55:33.000000000',0.00,66.54,'2019-07-21 03:12:00.000000000');
INSERT INTO account VALUES('5007','Credit','Visa',216.95,'2019-10-27 12:55:33.000000000',5000.00,166.08,'2019-07-23 10:13:54.000000000');
INSERT INTO account VALUES('5008','Savings','Super Interest Account',57601.35,'2019-10-28 12:55:33.000000000',0.00,5433.89,'2019-07-15 12:55:33.000000000');

INSERT INTO customer_account_xref VALUES('200','5005');
INSERT INTO customer_account_xref VALUES('201','5005');
INSERT INTO customer_account_xref VALUES('200','5006');
INSERT INTO customer_account_xref VALUES('200','5007');
INSERT INTO customer_account_xref VALUES('201','5006');
INSERT INTO customer_account_xref VALUES('201','5007');
INSERT INTO customer_account_xref VALUES('200','5008');
INSERT INTO customer_account_xref VALUES('201','5008');
