-- 1) Tüm first_name verileri
-- Tekrarsız
SELECT first_name FROM actor
UNION
SELECT first_name FROM customer;

-- Tekrarlı
SELECT first_name FROM actor
UNION ALL
SELECT first_name FROM customer;


-- 2) Kesişim (first_name)
-- Tekrarsız
SELECT first_name FROM actor
INTERSECT
SELECT first_name FROM customer;

-- Tekrarlı
SELECT first_name FROM actor
INTERSECT ALL
SELECT first_name FROM customer;


-- 3) Sadece actor’da olup customer’da olmayanlar
-- Tekrarsız
SELECT first_name FROM actor
EXCEPT
SELECT first_name FROM customer;

-- Tekrarlı
SELECT first_name FROM actor
EXCEPT ALL
SELECT first_name FROM customer;
