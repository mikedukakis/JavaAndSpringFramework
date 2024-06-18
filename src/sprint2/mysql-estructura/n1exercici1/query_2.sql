SELECT DISTINCT brands.brand_model
FROM sales
JOIN glasses ON sales.glasses_glasses_id = glasses.glasses_id
JOIN brands ON glasses.brands_brand_id = brands.brand_id
WHERE sales.staff_staff_id = 1
  AND YEAR(sales.sales_date) = 2024;
