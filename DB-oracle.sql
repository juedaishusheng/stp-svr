/*-------------+
|  DB: ORACLE  |
+=============*/

-- DB Data Location
-- @see https://docs.oracle.com/cd/B28359_01/server.111/b28310/omf003.htm
ALTER SESSION SET DB_CREATE_FILE_DEST = 'C:/dat';
ALTER SESSION SET DB_CREATE_ONLINE_LOG_DEST_1 = 'C:/dat';
ALTER SESSION SET DB_CREATE_ONLINE_LOG_DEST_2 = 'C:/dat';

-- DB 空间
SELECT * FROM dba_tablespaces;

-- DROP TABLESPACE stp_data INCLUDING CONTENTS AND DATAFILES;
CREATE TABLESPACE stp_data DATAFILE SIZE 10M AUTOEXTEND ON;

-- DROP TABLESPACE stp_temp INCLUDING CONTENTS AND DATAFILES;
CREATE TEMPORARY TABLESPACE stp_temp TEMPFILE SIZE 5M AUTOEXTEND ON;

-- DB 用户
-- DROP USER stp CASCADE;
CREATE USER stp IDENTIFIED BY stp DEFAULT TABLESPACE stp_data TEMPORARY TABLESPACE stp_temp;
GRANT CREATE SESSION, CREATE TABLE, CREATE VIEW, CREATE SEQUENCE, CREATE PROCEDURE, UNLIMITED TABLESPACE TO stp;

-- ALTER SESSION, CREATE DATABASE LINK, CREATE TRIGGER, CREATE SYNONYM, CREATE PUBLIC SYNONYM
-- CREATE ROLE, CREATE MATERIALIZED VIEW, CREATE TYPE

-- DB 授权: TABLES
BEGIN
   FOR x IN (SELECT table_name FROM all_tables WHERE owner = 'STP') LOOP
      execute IMMEDIATE 'GRANT ALL ON stp.'||x.table_name||' TO stp';
   END LOOP;
END;

-- DB 对象
  SELECT (   '<table tableName="'
          || table_name
          || '" domainObjectName="'
          || REPLACE (INITCAP (table_name), '_')
          || '"><generatedKey column="ID" sqlStatement="SELECT SEQ_'
          || table_name
          || '.NEXTVAL FROM DUAL"/></table>') AS mapper
    FROM user_tables
   WHERE table_name LIKE 'T_%'
ORDER BY table_name;

-- DB 时间
SELECT DBTIMEZONE FROM DUAL;
SELECT SYSDATE, SYSTIMESTAMP, CURRENT_DATE, CURRENT_TIMESTAMP FROM DUAL;

SELECT (TO_NUMBER(TO_CHAR(SYSDATE, 'YYYYDDD')) - 1900000) as jdeDate FROM DUAL;
SELECT TO_CHAR(TRUNC(SYSDATE), 'HH24MISS') as pureDate FROM DUAL; -- '000000', so TRUNC(SYSDATE) is pure date


/*--------+
|  ROLES  |
+=========*/

-- s_roles

--DROP TABLE s_roles;
CREATE TABLE s_roles (
  role varchar2(10) NOT NULL,
  role_desc nvarchar2(50) NOT NULL,
  PRIMARY KEY (role)
);

COMMENT ON TABLE s_roles IS '角色';
COMMENT ON COLUMN s_roles.role IS '角色ID';
COMMENT ON COLUMN s_roles.role_desc IS '角色描述';

TRUNCATE TABLE s_roles;
INSERT INTO s_roles (role,role_desc)
SELECT 'DEV','系统开发' FROM DUAL
UNION ALL SELECT 'SYS','系统管理' FROM DUAL
UNION ALL SELECT 'PM','产品管理' FROM DUAL
UNION ALL SELECT 'OM','订单管理' FROM DUAL
UNION ALL SELECT 'CM','产能调度' FROM DUAL
-- ...
;
COMMIT;


/*--------+
|  MENUS  |
+=========*/

-- s_menus

--DROP TABLE s_menus;
CREATE TABLE s_menus (
  menu char(5) NOT NULL,
  menu_icon varchar2(20) NOT NULL,
  menu_label nvarchar2(50) NOT NULL,
  menu_fixed number(1) DEFAULT 0,
  menu_upper char(5),
  menu_order number(3) NOT NULL,
  menu_roles varchar2(100) NOT NULL,
  PRIMARY KEY (menu)
);

COMMENT ON TABLE s_menus IS '菜单';
COMMENT ON COLUMN s_menus.menu IS '菜单ID';
COMMENT ON COLUMN s_menus.menu_icon IS '菜单图标';
COMMENT ON COLUMN s_menus.menu_label IS '菜单文字';
COMMENT ON COLUMN s_menus.menu_fixed IS '菜单固定(不可关闭)';
COMMENT ON COLUMN s_menus.menu_upper IS '上级菜单,NULL表示顶级菜单';
COMMENT ON COLUMN s_menus.menu_order IS '同级中的显示顺序';
COMMENT ON COLUMN s_menus.menu_roles IS '能访问该菜单的角色列表(逗号分隔)';

TRUNCATE TABLE s_menus;
INSERT INTO s_menus (menu,menu_icon,menu_label,menu_fixed,menu_upper,menu_order,menu_roles)
SELECT 'home','home','首页',1,NULL,10,'*' FROM DUAL
-- ...
UNION ALL SELECT 'ui','chrome','～ DEV ～',0,NULL,11,'DEV' FROM DUAL
UNION ALL SELECT 'ui001','calendar','日历',0,'ui',10,'DEV' FROM DUAL
UNION ALL SELECT 'ui002','line-chart','图表',0,'ui',20,'DEV' FROM DUAL
UNION ALL SELECT 'ui003','table','表格',0,'ui',30,'DEV' FROM DUAL
UNION ALL SELECT 'ui004','edit','表单',0,'ui',40,'DEV' FROM DUAL
UNION ALL SELECT 'ui005','exchange','数据',0,'ui',50,'DEV' FROM DUAL
-- ...
UNION ALL SELECT 'pm','cubes','产品管理',0,NULL,20,'PM,DEV' FROM DUAL
UNION ALL SELECT 'pm001','cubes','产品新建及查询',0,'pm',10,'PM,DEV' FROM DUAL
UNION ALL SELECT 'pm002','cubes','产品新增',0,'pm',20,'PM,DEV' FROM DUAL
-- ...
UNION ALL SELECT 'om','share-alt','订单管理',0,NULL,30,'OM,DEV' FROM DUAL
UNION ALL SELECT 'om001','search','订单新建及查询',0,'om',10,'OM,DEV' FROM DUAL
UNION ALL SELECT 'om002','share-alt','营业待处理订单',0,'om',20,'OM,DEV' FROM DUAL
-- ...
UNION ALL SELECT 'cm','dashboard','产能调度',0,NULL,40,'CM,DEV' FROM DUAL
UNION ALL SELECT 'cm001','dashboard','驾驶舱',0,'cm',10,'CM,DEV' FROM DUAL
UNION ALL SELECT 'cm002','calendar','生产支持',0,'cm',20,'CM,DEV' FROM DUAL
-- ...
;
COMMIT;


/*--------+
|  USERS  |
+=========*/

-- s_users

--DROP TABLE s_users;
CREATE TABLE s_users (
  id number(18) NOT NULL,

  username varchar2(20) NOT NULL,
  password char(64) NOT NULL,
  salt char(16) NOT NULL,
  enabled number(1) DEFAULT 1,

  role varchar2(10) NOT NULL,
  profile nvarchar2(1000),

  audit_version number(18) DEFAULT 1,
  audit_user_id number(18) NOT NULL,
  audit_time_at timestamp DEFAULT SYSTIMESTAMP,
  audit_prog_id varchar2(40) NOT NULL,
  audit_node_id varchar2(40) NOT NULL,

  PRIMARY KEY (id)
);
CREATE UNIQUE INDEX idx_uniq_username ON s_users(username);

--DROP SEQUENCE seq_s_users;
CREATE SEQUENCE seq_s_users MINVALUE 1 MAXVALUE 999999999999999999 START WITH 7 INCREMENT BY 1 CACHE 20;

COMMENT ON TABLE s_users IS '用户';
COMMENT ON COLUMN s_users.username IS '用户ID';
COMMENT ON COLUMN s_users.password IS '密码(SHA256+SALT)';
COMMENT ON COLUMN s_users.salt IS '密码的SALT';
COMMENT ON COLUMN s_users.enabled IS '1:有效／0:无效';
COMMENT ON COLUMN s_users.role IS '角色';
COMMENT ON COLUMN s_users.profile IS '用户Profile(JSON格式)';
COMMENT ON COLUMN s_users.audit_version IS '数据版本';
COMMENT ON COLUMN s_users.audit_user_id IS '更新用户ID';
COMMENT ON COLUMN s_users.audit_time_at IS '更新时间';
COMMENT ON COLUMN s_users.audit_prog_id IS '更新程序ID';
COMMENT ON COLUMN s_users.audit_node_id IS '更新节点ID';

-- password generated by ShiroPasswordServiceTest.encryptPassword
TRUNCATE TABLE s_users;
INSERT INTO s_users (id, username, password, salt, enabled, role, audit_user_id, audit_prog_id, audit_node_id)
SELECT 0, 'dev', '9bbb66bda489d8286ff18f8832bbbe399c761237c9d6d0e4029bac1f33e972be', 'flh884wndkv5rfwc', 1, 'DEV', 0, '-', '-' FROM DUAL
UNION ALL SELECT 1, 'admin', '9bbb66bda489d8286ff18f8832bbbe399c761237c9d6d0e4029bac1f33e972be', 'flh884wndkv5rfwc', 1, 'SYS', 0, '-', '-' FROM DUAL
UNION ALL SELECT 2, 'pm1', '9bbb66bda489d8286ff18f8832bbbe399c761237c9d6d0e4029bac1f33e972be', 'flh884wndkv5rfwc', 1, 'PM', 0, '-', '-' FROM DUAL
UNION ALL SELECT 3, 'om1', '9bbb66bda489d8286ff18f8832bbbe399c761237c9d6d0e4029bac1f33e972be', 'flh884wndkv5rfwc', 1, 'OM', 0, '-', '-' FROM DUAL
UNION ALL SELECT 4, 'cm1', '9bbb66bda489d8286ff18f8832bbbe399c761237c9d6d0e4029bac1f33e972be', 'flh884wndkv5rfwc', 1, 'CM1', 0, '-', '-' FROM DUAL
UNION ALL SELECT 5, 'cm2', '9bbb66bda489d8286ff18f8832bbbe399c761237c9d6d0e4029bac1f33e972be', 'flh884wndkv5rfwc', 1, 'CM2', 0, '-', '-' FROM DUAL
UNION ALL SELECT 6, 'fm', '9bbb66bda489d8286ff18f8832bbbe399c761237c9d6d0e4029bac1f33e972be', 'flh884wndkv5rfwc', 1, 'FM', 0, '-', '-' FROM DUAL
-- ...
;
COMMIT;


/*-------------------+
|  COUNTERS & LOCKS  |
+===================*/

-- s_counters

--DROP TABLE s_counters;
CREATE TABLE s_counters (
  counter_code varchar2(20) NOT NULL,
  counter_desc nvarchar2(200) NOT NULL,
  counter_key varchar2(20) NOT NULL,
  counter_max number(9) NOT NULL,
  counter_val number(9) NOT NULL,
  PRIMARY KEY (counter_code)
);

COMMENT ON TABLE s_counters IS '发号器';
COMMENT ON COLUMN s_counters.counter_code IS '发号器编码';
COMMENT ON COLUMN s_counters.counter_desc IS '发号器功能描述';
COMMENT ON COLUMN s_counters.counter_key IS '发号器计数复位条件';
COMMENT ON COLUMN s_counters.counter_max IS '发号器计数最大值, 比如9999';
COMMENT ON COLUMN s_counters.counter_val IS '发号器当前计数值: 1开始';


-- s_locks

--DROP TABLE s_locks;
CREATE TABLE s_locks (
  lock_code varchar2(10) NOT NULL,
  lock_desc nvarchar2(50) NOT NULL,
  lock_data varchar2(20) NOT NULL,
  lock_id char(36) NOT NULL,
  sess_id char(32) NOT NULL,
  node_id varchar2(40) NOT NULL,
  lock_by varchar2(20) NOT NULL,
  lock_at timestamp DEFAULT SYSTIMESTAMP,
  PRIMARY KEY (lock_id)
);
CREATE UNIQUE INDEX idx_uniq_lock_data ON s_locks(lock_code, lock_data);

COMMENT ON TABLE s_locks IS '业务对象锁';
COMMENT ON COLUMN s_locks.lock_code IS '锁编码';
COMMENT ON COLUMN s_locks.lock_desc IS '锁描述';
COMMENT ON COLUMN s_locks.lock_data IS '加锁的数据';
COMMENT ON COLUMN s_locks.lock_id IS '拥有锁的请求ID(UUID)';
COMMENT ON COLUMN s_locks.sess_id IS '拥有锁的会话ID';
COMMENT ON COLUMN s_locks.node_id IS '拥有锁的节点ID';
COMMENT ON COLUMN s_locks.lock_by IS '加锁操作的用户';
COMMENT ON COLUMN s_locks.lock_at IS '加锁操作的时点';

-- 比如订单支付,锁的是帐户
-- lock_code = 'ACCOUNT', lock_desc = N'订单支付中', lock_data = '700002'

-- 比如订单编辑,锁的是订单
-- lock_code = 'ORDER', lock_desc = N'订单编辑中', lock_data = 'A201606140014'

-- 比如订单编辑,锁的是门店
-- lock_code = 'MGMTFEE', lock_desc = N'管理费支付中', lock_data = '800001'

-- 最后还要一个数据访问同步锁，用于业务锁存在的确认的同步(当然也可用于其他需要数据访问同布的场合)。
INSERT INTO s_locks VALUES('LOCK', N'数据访问同步锁', '-', '-', '-', '-', '-', SYSTIMESTAMP);
COMMIT;
