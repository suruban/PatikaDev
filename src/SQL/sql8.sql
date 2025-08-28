
--tablo oluşturma
CREATE TABLE employee (
                          id INT PRIMARY KEY,
                          name VARCHAR(50),
                          birthday DATE,
                          email VARCHAR(100)
);

-- mockaroo'dan örnek 5 kayıt girdim
INSERT INTO employee (id, name, birthday, email) VALUES
(1, 'John Doe', '1990-05-14', 'johndoe@example.com'),
(2, 'Alice Smith', '1985-03-22', 'alice.smith@example.com'),
(3, 'Michael Brown', '1992-11-10', 'mbrown@example.com'),
(4, 'Emily Johnson', '1988-07-30', 'emilyj@example.com'),
(5, 'David Wilson', '1995-01-18', 'dwilson@example.com');

-- id'ye göre güncelleme
UPDATE employee
SET email = 'updated_email@example.com'
WHERE id = 3;

-- name'e göre güncelleme
UPDATE employee
SET birthday = '1999-12-31'
WHERE name = 'Alice Smith';

-- birthday'e göre güncelleme
UPDATE employee
SET name = 'Birthday Updated'
WHERE birthday = '1988-07-30';

-- email'e göre güncelleme
UPDATE employee
SET name = 'Email Updated'
WHERE email = 'dwilson@example.com';

-- farklı bir id'ye göre güncelleme
UPDATE employee
SET email = 'newmail@example.com'
WHERE id = 5;


-- id'ye göre silme
DELETE FROM employee
WHERE id = 1;

-- name'e göre silme
DELETE FROM employee
WHERE name = 'John Doe';

-- birthday'e göre silme
DELETE FROM employee
WHERE birthday = '1992-11-10';

-- email'e göre silme
DELETE FROM employee
WHERE email = 'alice.smith@example.com';

-- başka bir id'ye göre silme
DELETE FROM employee
WHERE id = 4;

