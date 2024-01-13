insert into contact (name, surname) values ('John', 'Doe');
insert into contact (name, surname) values ('John', 'Wick');
insert into contact (name, surname) values ('Gerald', 'of Rivia');

insert into address (street, contact_id) values ('My cool street 22', 1);
insert into address (street, contact_id) values ('One not good street 123', 1);
insert into address (street, contact_id) values ('Second person square 6', 2);
insert into address (street, contact_id) values ('Third person street 1', 3);
insert into address (street, contact_id) values ('Third person street 3', 3);

insert into phone (phone_number, contact_id) values ('+385 1 111111', 1);
insert into phone (phone_number, contact_id) values ('+385 1 222222', 1);
insert into phone (phone_number, contact_id) values ('+385 2 333333', 2);
insert into phone (phone_number, contact_id) values ('+385 3 444444', 3);
insert into phone (phone_number, contact_id) values ('+385 3 555555', 3);