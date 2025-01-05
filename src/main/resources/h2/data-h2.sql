-- Intialize H2 database data.

SHOW TABLES;

-- pass_word = first_name
INSERT INTO user_ (user_name, email, full_name, pass_word, date_modified, date_created) VALUES ('harshrathod50', 'hrathore216@gmail.com', 'Harsh Rathod', '{bcrypt}$2a$10$2Mqtpba/D.cFDxk6oNm0p.1tt7ZLiMSGmu0w3oxkUoSJCvcKZct8q', CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP());
INSERT INTO user_ (user_name, email, full_name, pass_word, date_modified, date_created) VALUES ('rishabhrathod20', 'rishabhrathod20@gmail.com', 'Rishabh Rathore', '{bcrypt}$2a$10$VzNscAGMFAqOpwfcwaDQ3uF8j0Sear5LPPToGlSQ9Atc6wDOKvyBq', CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP());
INSERT INTO user_ (user_name, email, full_name, pass_word, date_modified, date_created) VALUES ('manavrathod2002', 'manavrathod2002@gmail.com', 'Manav Rathore', '{bcrypt}$2a$10$Tj5d6DN0R9i04EO.sX9G7uddRYDQfCQ3lHHGWlEtu0YdZOExkOXcO', CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP());
