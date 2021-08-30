CREATE TABLE member2
(
    memberId number primary key not null,
    name     varchar(50)
);

CREATE TABLE phone
(
    SEQ      number primary key not null,
    MEMBERID number,
    PHONENO  varchar2(50),
    CONSTRAINT "PHONE_FK1" FOREIGN KEY ("MEMBERID")
        REFERENCES "SPRING"."MEMBER2" ("MEMBERID") ON DELETE CASCADE
);

CREATE SEQUENCE "SPRING"."MEMBER2_SEQ"
    MINVALUE 1
    MAXVALUE 99999
    INCREMENT BY 1
    START WITH 1
;

CREATE SEQUENCE "SPRING"."PHONE_SEQ"
    MINVALUE 1
    MAXVALUE 99999
    INCREMENT BY 1
    START WITH 1
;
    