create table s_user (
    id bigint auto_increment comment 'id',
    name varchar(50) unique key	not null comment '账号',
    password varchar(100) not null comment '密码',
    primary key(id)
)
create table s_role (
    id bigint auto_increment comment 'id',
    name varchar(50) unique key not null comment '角色名',
    display varchar(50) not null comment '显示名称',
    primary key (id)
)
create table s_user_role (
     id bigint auto_increment comment 'id',
     user_id bigint not null comment '用户id',
     role_id bigint not null comment '角色id',
     primary key (id)
)
create table s_permission (
    id bigint auto_increment comment 'id',
    name varchar(50) unique key comment '权限名',
    display varchar(50) comment '显示名称',
    primary key(id)
);
create table s_role_permission (
  id bigint auto_increment comment 'id',
  role_id bigint not null comment '角色id',
  permission_id bigint not null comment '权限id',
  primary key(id)
);
create index index_user_role on s_user_role (user_id, role_id);
create index  index_role_permission s_role_permission (role_id, permission_id);