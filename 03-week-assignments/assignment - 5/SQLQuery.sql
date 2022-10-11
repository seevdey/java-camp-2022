--SELECT * FROM Customers
--SELECT ContactName, CompanyName, City FROM Customers
--ALIAS --> SELECT ContactName Adi, CompanyName Sirketadi, City Sehir FROM Customers
--SELECT * FROM Customers WHERE City = 'London';
--SELECT * FROM Customers WHERE City = 'Berlin';

--case insensitive
--SeleCt * FROM Products

--SELECT * FROM Products WHERE CategoryID = 1 OR CategoryID = 3
--SELECT * FROM Products WHERE CategoryID = 1 AND UnitPrice >= 10

--ORDER BY --> sıralama --> örneğin isme göre filtrele, artan fiyata göre listele 
--SELECT * FROM Products ORDER BY ProductName --ürün tablosunu isimlerine göre sırala
--SELECT * FROM Products ORDER BY CategoryID, ProductName
--SELECT * FROM Products ORDER BY UnitPrice
--ASC --artan // DESC --azalan
--SELECT * FROM Products WHERE CategoryID = 1 ORDER BY UnitPrice DESC

--COUNT kullanınca tek bir kolon ve tek bir satır gelmesi gerekiyor
--SELECT COUNT(*) FROM Products 
--SELECT COUNT(*) Adet FROM Products WHERE CategoryID = 2


--GROUP BY kullandığınız zaman SELECT ettiğiniz kolon sadece ve sadece GROUP BY da yazdığınız alan ve kümülatif datalar olabilir
--GROUP BY yaptığın zaman her bir grup için arka tarafta bir tablo oluşturuyormuş gibi düşünebilirsin

--Bütün kategorileri bana tekrar etmeyecek şekilde listele
--SELECT CategoryID FROM Products GROUP BY CategoryID


--Hangi kategoride kaç farklı ürünümüz var?
--SELECT CategoryID, COUNT(*) FROM Products GROUP BY CategoryID

--Ürün sayısı 10 dan az olan kategorileri listele 'UnitPrice > 20 olacak şekilde' --> Burdaki WHERE koşulunu kümülatif dataya yazacaksın bu yüzden GROUP BY da kümülatif dataya yazılan koşulu HAVING olarak yazarız
/*SELECT CategoryID, COUNT(*) FROM Products 
WHERE UnitPrice > 20
GROUP BY CategoryID HAVING COUNT(*) < 10*/


--INNER JOIN sadece 2 tabloda da eşleşenleri bir araya getirir. Eşleşmeyen data varsa onu getirmez
/*
SELECT Products.ProductID, Products.ProductName, Products.UnitPrice, Categories.CategoryName FROM Products
INNER JOIN Categories ON Products.CategoryID = Categories.CategoryID
WHERE Products.UnitPrice > 10*/


--LEFT JOIN solda olup sağda olmayanları da getir > Örnek için soldaki Products, sağdaki [Order Details] yani ürünler tablosunda var ama satış yok
/*
SELECT * FROM Products p
LEFT JOIN [Order Details] od
ON p.ProductID = od.ProductID*/


--Müşterilerde olup siparişte olmayanları da yani hem INNER JOIN olanları hem de sol tarafta olanları yani müşterilerde olmayanları da getir 
/*SELECT * FROM Customers c
LEFT JOIN Orders o 
ON c.CustomerID = o.CustomerID
WHERE o.CustomerID IS NULL --bu koşulda hiç ürün almayan müşteriler listeleniyor > null demek o data yok demek*/


SELECT * FROM Products p
INNER JOIN [Order Details] od
ON p.ProductID = od.ProductID
INNER JOIN Orders o
ON o.OrderID = od.OrderID