-- Intialize H2 database schema.

SHOW TABLES;

CREATE TABLE IF NOT EXISTS user_ (
	user_id INT PRIMARY KEY,
	user_name VARCHAR(255) UNIQUE,
	email VARCHAR(255) UNIQUE,
	full_name VARCHAR(255),
	pass_word VARCHAR(255),
	date_modified TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL,
	date_created TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL
);
COMMENT ON TABLE user_ IS 'User information table.';
COMMENT ON COLUMN user_.user_id IS 'Primary key of the user.';
COMMENT ON COLUMN user_.user_name IS 'Unique username for the user.';
COMMENT ON COLUMN user_.email IS 'Unique email address of the user.';
COMMENT ON COLUMN user_.full_name IS 'Full name of the user.';
COMMENT ON COLUMN user_.pass_word IS 'Password for the user account.';
COMMENT ON COLUMN user_.date_modified IS 'Date and time when the record was last modified.';
COMMENT ON COLUMN user_.date_created IS 'Date and time when the record was created.';
