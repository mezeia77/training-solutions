--use mysql;
--create schema if not exists activitytracker default character set utf8 collate utf8_hungarian_ci;
--
--create user 'activitytracker'@'localhost' identified by 'activitytracker';
--grant all on *.* to 'activitytracker'@'localhost';

CREATE TABLE activities (id BIGINT AUTO_INCREMENT, start_time TIMESTAMP, activity_desc VARCHAR(255), activity_type VARCHAR(255),PRIMARY KEY (id));

insert into activities(start_time, activity_desc, activity_type) values ('2021.02.02', 'Running at the lake', 'RUNNING');
insert into activities(start_time, activity_desc, activity_type) values ('2021.02.03', 'Running at the fortress', 'BIKING');
insert into activities(start_time, activity_desc, activity_type) values ('2021.02.04', 'Hiking at the forest', 'HIKING');

CREATE TABLE track_points (
id BIGINT AUTO_INCREMENT,act_time DATE, lat DOUBLE, lon DOUBLE,
activityId BIGINT, PRIMARY KEY(id), FOREIGN KEY(activityId) REFERENCES activities(id));