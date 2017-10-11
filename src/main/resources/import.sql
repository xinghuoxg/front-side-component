
drop table if exists city;

create table `city` (`id` int primary key auto_increment, `name` VARCHAR(25), `state` varchar(25), `country` varchar(25));

insert into `city` (`name`, `state`, `country`) values ('San Francisco', 'CA', 'US');