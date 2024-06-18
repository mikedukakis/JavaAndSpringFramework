SELECT sales.sales_invoice_number, sales.sales_date, sales.glasses_glasses_id
FROM sales
JOIN customers ON sales.customers_customer_id = customers.customer_id
WHERE customers.customer_id = 1
  AND sales.sales_date BETWEEN '2024-01-01' AND '2024-12-31';
