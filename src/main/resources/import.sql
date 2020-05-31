INSERT INTO employees(employee_id, employee_address, employee_name, employee_phone) VALUES(1,'Dhaka','Md. Emran Hossain','01670932273');
INSERT INTO employees(employee_id, employee_address, employee_name, employee_phone) VALUES(2,'Dhaka','AAA','01715909280');

INSERT INTO hibernate_sequence(id, next_val) VALUES(1,59);

INSERT INTO user_roles(user_role_id, role, username) VALUES(1,'ROLE_ADMIN','admin');
INSERT INTO user_roles(user_role_id, role, username) VALUES(2,'ROLE_EMP','employee');

INSERT INTO users(id, enabled, password, username) VALUES(1, 1,'$2a$10$gGZHRaz0Y.MS4A4PQgHfLObBThbKJkRScKUcjpo4C/S1UYXsPxvJa', 'admin');
INSERT INTO users(id, enabled, password, username) VALUES(2, 1,'$2a$10$.4HNmaTl/n1Cj8K7SBO01.qemKqS81Sof8zgwv2VZkeWqkinm9U7i', 'employee');
