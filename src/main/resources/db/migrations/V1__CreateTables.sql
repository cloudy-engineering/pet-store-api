
create table rewards (
    reward_id numeric identity not null primary key ,
    owner varchar(80) not null,
    reward_type varchar(80) not null
);

insert into rewards (owner, reward_type) values ( 'charlene.masters', '20% Discount');
insert into rewards(owner, reward_type) VALUES ( 'charlene.masters', 'BOGO Free' );
insert into rewards (owner, reward_type) values ( 'mary.contrary', '10% Discount' );
insert into rewards (owner, reward_type) VALUES ( 'mary.contrary', '25% Discount' );
insert into rewards (owner, reward_type) values ( 'mary.contrary', 'invite a friend' );
