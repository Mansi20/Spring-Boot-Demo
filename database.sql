CREATE DATABASE lattice;

use lattice



create table device (
    device_id INT PRIMARY KEY AUTO_INCREMENT,
	description VARCHAR(500) NOT NULL,
    status ENUM('Working', 'Idle', 'Complete') NOT NULL,
    operator_id INT NOT NULL,
    protocol_id INT NOT NULL,
    FOREIGN KEY protocol_id(protocol_id)
    REFERENCES protocol(protocol_id)
    ON UPDATE CASCADE
	ON DELETE RESTRICT
);

create table protocol(
	created_on TIMESTAMP ,
	effectivity_date TIMESTAMP ,
	protocol_id INT PRIMARY KEY AUTO_INCREMENT,
	title VARCHAR(200) NOT NULL
);

create table tag
(
    tag_id INT PRIMARY KEY AUTO_INCREMENT,
	description VARCHAR(200) NOT NULL,
    is_active ENUM('Y', 'N') NOT NULL,
	created_on TIMESTAMP  
)

create table user
(
    user_id INT PRIMARY KEY AUTO_INCREMENT,
    user_name VARCHAR(200) NOT NULL,
	email VARCHAR(200) NOT NULL,
    device_id INT NOT NULL,
    tag_id INT NOT NULL,
	FOREIGN KEY device_id(device_id)
    REFERENCES device(device_id)
    ON UPDATE CASCADE
	ON DELETE RESTRICT,
    FOREIGN KEY tag_id(tag_id)
    REFERENCES tag(tag_id)
    ON UPDATE CASCADE
	ON DELETE RESTRICT
)