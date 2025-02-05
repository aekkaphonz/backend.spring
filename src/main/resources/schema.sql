CREATE TABLE IF NOT EXISTS sso_user_test(
                               request_date TIMESTAMP NOT NULL,
                               ssotype VARCHAR(50),
                               systemid VARCHAR(50),
                               systemname VARCHAR(250),
                               systemtransactions VARCHAR(250),
                               systemprivileges VARCHAR(250),
                               systemusergroup VARCHAR(50),
                               systemlocationgroup VARCHAR(50),
                               userid VARCHAR(200),
                               userfullname VARCHAR(500),
                               userrdofficecode VARCHAR(250),
                               userofficecode VARCHAR(250),
                               clientlocation VARCHAR(250),
                               locationmachinenumber VARCHAR(500),
                               tokenid VARCHAR(1000),
                               CONSTRAINT pk_sso_user_test PRIMARY KEY (request_date)
);
