--film tablosunda film uzunluğu length sütununda gösterilmektedir.
--Uzunluğu ortalama film uzunluğundan fazla kaç tane film vardır?

SELECT COUNT(*) FROM film
where length > (SELECT AVG(length) from film);

--film tablosunda en yüksek rental_rate değerine sahip kaç tane film vardır?

SELECT COUNT(*) FROM film
where rental_rate = (SELECT max(rental_rate) from film);

--film tablosunda en düşük rental_rate ve en düşün
--replacement_cost değerlerine sahip filmleri sıralayınız.

SELECT * FROM film
where rental_rate = (SELECT min(rental_rate) from film) and replacement_cost = (SELECT min(replacement_cost)from film);


--payment tablosunda en fazla sayıda
--alışveriş yapan müşterileri(customer) sıralayınız.

SELECT customer_id,count(*) as total_payments
from payment
GROUP BY
    customer_id
ORDER BY total_payments DESC
;
