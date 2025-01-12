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

CREATE TABLE IF NOT EXISTS role_ (
	role_id INT PRIMARY KEY,
	name_ VARCHAR(255) UNIQUE,
	date_modified TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL,
	date_created TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL
);
COMMENT ON TABLE role_ IS 'Role information table.';
COMMENT ON COLUMN role_.role_id IS 'Primary key of the role.';
COMMENT ON COLUMN role_.name_ IS 'Unique name for the role.';
COMMENT ON COLUMN role_.date_modified IS 'Date and time when the role was last modified.';
COMMENT ON COLUMN role_.date_created IS 'Date and time when the role was created.';

CREATE TABLE IF NOT EXISTS user_role (
	user_id INT,
	role_id INT,
	date_modified TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL,
	date_created TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL,
	PRIMARY KEY (user_id, role_id),
	FOREIGN KEY (user_id) REFERENCES user_(user_id),
	FOREIGN KEY (role_id) REFERENCES role_(role_id)
);
COMMENT ON TABLE user_role IS 'Role information table.';
COMMENT ON COLUMN user_role.user_id IS 'Primary key of the user.';
COMMENT ON COLUMN user_role.role_id IS 'Primary key of the role.';
COMMENT ON COLUMN user_role.date_modified IS 'Date and time when the user role was last modified.';
COMMENT ON COLUMN user_role.date_created IS 'Date and time when the user role was created.';
