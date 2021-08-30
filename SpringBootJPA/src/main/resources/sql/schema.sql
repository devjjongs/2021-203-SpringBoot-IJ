create TABLE member2
(
    memberId number primary key not null,
    name     varchar(50)
)

create TABLE phone
(
    seq      number primary key not null,
    memberId number,
    phoneNo  varchar2(50).CONSTRAINT "SPRING"
)


create SEQUENCE "SPRING"."MEMBER2_SEQ"
    minvalue 1
    maxvalue 99999
    increment by 1
    start with 1
;
create SEQUENCE "SPRING"."PHONE_SEQ"
    minvalue 1
    maxvalue 99999
    increment by 1
    start with 1
;
