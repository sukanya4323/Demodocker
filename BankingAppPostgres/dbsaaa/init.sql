CREATE DATABASE Comany_DB;
GRANT ALL PRIVILEGES ON DATABASE Comany_DB TO postgres;
CREATE TABLE project
(
    project_id serial ,project_name varchar(250) ,project_desc varchar(250),
	 PRIMARY KEY (project_id)
);

Insert into project values (23,'Alfas','Banking');
Insert into project values (24,'AlfasCore','Payments');
Insert into project values (25,'Regas','Ecommerce');