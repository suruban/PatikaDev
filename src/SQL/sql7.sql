SELECT rating,COUNT(*) From film
group by rating;

SELECT replacement_cost, COUNT(*)
FROM film
GROUP BY replacement_cost
HAVING COUNT(*) > 50;


SELECT store_id,COUNT(*) as storecount
from customer
group by store_id;

SELECT country_id,COUNT(*) as CityCount
from city
group by country_id
order by CityCount DESC
    limit 1;
