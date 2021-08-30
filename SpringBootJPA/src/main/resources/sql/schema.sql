create TABLE member2
(
    memberId number primary key not null,
    name     varchar(50)
)

create TABLE phone
(
    seq      number primary key not null,
    memberId number,
    phoneNo  varchar2(50).CONSTRAINT "SPTING"
)


create SEQUENCE "SPRING"."MEMBER2_SEQ"
    MINVALUE 1
    MAXVALUE 99999
    INCREMENT By 1
    START WITH 1;


create SEQUENCE "SPRING"."PHONE_SEQ"
    MINVALUE 1
    MAXVALUE 99999
    INCREMENT By 1
    START WITH 1;