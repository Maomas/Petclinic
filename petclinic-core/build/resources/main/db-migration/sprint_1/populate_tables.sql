USE petclinic;

INSERT INTO vets (first_name,last_name,speciality) VALUES ('James','Carter','radiology');
INSERT INTO vets (first_name,last_name,speciality) VALUES ('Helen','Leary','surgery');
INSERT INTO vets (first_name,last_name,speciality) VALUES ('Linda','Douglas','radiology');
INSERT INTO vets (first_name,last_name,speciality) VALUES ('Rafael','Ortega','dentistry');

INSERT INTO owners (first_name, last_name, address, city, telephone) VALUES ('George', 'Franklin', '110 W. Liberty St.', 'Madison', '6085551023');
INSERT INTO owners (first_name, last_name, address, city, telephone) VALUES ('Betty', 'Davis', '638 Cardinal Ave.', 'Sun Prairie', '6085551749');
INSERT INTO owners (first_name, last_name, address, city, telephone) VALUES ('Eduardo', 'Rodriquez', '2693 Commerce St.', 'McFarland', '6085558763');
INSERT INTO owners (first_name, last_name, address, city, telephone) VALUES ('Harold', 'Davis', '563 Friendly St.', 'Windsor', '6085553198');
INSERT INTO owners (first_name, last_name, address, city, telephone) VALUES ('Peter', 'McTavish', '2387 S. Fair Way', 'Madison', '6085552765');

INSERT IGNORE INTO pets (name, birth_date, type_id, owner_id) VALUES ('Leo', '2000-09-07', 1, 1);
INSERT IGNORE INTO pets (name, birth_date, type_id, owner_id) VALUES ('Basil', '2002-08-06', 6, 2);
INSERT IGNORE INTO pets (name, birth_date, type_id, owner_id) VALUES ('Rosy', '2001-04-17', 2, 3);
INSERT IGNORE INTO pets (name, birth_date, type_id, owner_id) VALUES ('Jewel', '2000-03-07', 2, 3);
INSERT IGNORE INTO pets (name, birth_date, type_id, owner_id) VALUES ('Iggy', '2000-11-30', 3, 4);