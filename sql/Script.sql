CREATE TABLE tbl_user(
name varchar2(10)
,id varchar2(10) NOT NULL
,password varchar2(10) NOT NULL
,phone number(11) NOT null
);

CREATE TABLE tbl_received(
receivedname varchar2(10) NOT null
,title varchar2(100) NOT null
,reg_date DATE DEFAULT sysdate
,contents varchar2(3000)
);

CREATE TABLE tbl_dispatched(
dispatchedname varchar2(10) NOT null
,title varchar2(100) NOT null
,reg_date DATE DEFAULT sysdate
,contents varchar2(3000)
);

CREATE TABLE tbl_trash(
name varchar2(10) NOT null
,title varchar2(100) NOT null
,reg_date DATE DEFAULT sysdate
,contents varchar2(3000)
);

COMMIT;