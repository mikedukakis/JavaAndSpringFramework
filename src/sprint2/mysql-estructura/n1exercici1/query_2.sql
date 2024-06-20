SELECT DISTINCT brands.brands_model
FROM sales
JOIN glasses ON sales.glasses_id = glasses.glasses_id
JOIN brands ON glasses.brands_id = brands.brands_id
WHERE sales.staff_id = 1
  AND YEAR(sales.sales_date) = 2024;