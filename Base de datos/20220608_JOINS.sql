/*-- INNER JOIN*/

select c.customerNumber, c.customerName, o.orderNumber 
from customers c
inner join orders o
on c.customerNumber = o.customerNumber
order by c.customerName desc;



