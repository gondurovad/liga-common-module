create table if not exists debug
(
    uuid                bigserial       not null primary key unique,
    system_type_id      smallint        not null,
    method_params       varchar(255)    not null
);
create table if not exists exception
(
    uuid                bigserial       not null primary key unique,
    system_type_id      smallint        not null,
    method_params       varchar(255)    not null
);