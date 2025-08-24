select * from country
where country LIKE('A%') and country LIKE('%a')

select * from country
where LENGTH(country) >=6 and country LIKE('%n')

select title from film
where LENGTH(title)>6 and title LIKE('%t%');

SELECT *
FROM film
WHERE title LIKE 'C%'
  AND length > 90
  AND rental_rate = 2.99;