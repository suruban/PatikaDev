SELECT * from film
where title LIKE('%n')
order by length DESC;

SELECT * from film
where title LIKE('%n')
order by length asc
offset 5
    limit 5;

SELECT * from customer
where store_id =1
order by last_name DESC
    limit 10;