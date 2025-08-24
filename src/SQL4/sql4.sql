SELECT DISTINCT replacement_cost from film;

SELECT COUNT(DISTINCT replacement_cost)
FROM film;

SELECT COUNT(title) from film
where title like('T%') and rating = 'G';

SELECT COUNT(*) from country
where LENGTH(country) =5

SELECT COUNT(*) from city
where city LIKE('%R') or city LIKE('%r')