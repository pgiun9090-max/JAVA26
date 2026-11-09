-- KSConsoleBank 회원 테이블 (hr 계정으로 실행)
CREATE TABLE BANK_MEMBER (
    id        VARCHAR2(30)  PRIMARY KEY,
    password  VARCHAR2(50)  NOT NULL,
    name      VARCHAR2(50)  NOT NULL,
    email     VARCHAR2(100),
    mobile    VARCHAR2(20),
    type      CHAR(1)       DEFAULT 'U' NOT NULL CHECK (type IN ('A','U'))
);

-- 관리자 계정 (프로그램에서 admin / 1234 로 로그인)
INSERT INTO BANK_MEMBER (id, password, name, type) VALUES ('admin', '1234', '관리자', 'A');

COMMIT;
