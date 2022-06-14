select * from customers c;

/*select * from customers c  where customername like '%toy%';*/

select c.customerNumber, c.customerName, c.city 
from customers c 
where c.city = 'Madrid';


-- obtener todas las ordenes por cliente
select c.customerNumber, o.orderNumber ,c.customerName, o.comments  
from customers c, orders o
where c.customerNumber = o.customerNumber 
and c.customerNumber = 496
order by c.customerNumber desc;

-- Productos

select * from products p;

select * from productlines pl;

-- filtrar todos los productos de Motorcycles, con la descripcion del productline

select p.productName, pl.productLine, pl.textDescription 
from products p, productlines pl
where p.productLine = pl.productLine 
and pl.productLine = 'Motorcycles';

select p.productName, p.quantityInStock  
from products p
where p.productLine = 'Motorcycles'
order by p.quantityInStock desc; 

select p.productName, p.productLine, p.quantityInStock  
from products p
where productName like '%Ford%'
order by p.productName  ASC;


