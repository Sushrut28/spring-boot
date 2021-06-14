DROP TABLE IF EXISTS employee;

CREATE TABLE employee(
  id INT AUTO_INCREMENT  PRIMARY KEY,
  name VARCHAR(250) NOT NULL
);

INSERT INTO employee(name) VALUES
  ('Aliko'),
  ('Bill'),
  ('Folrunsho');