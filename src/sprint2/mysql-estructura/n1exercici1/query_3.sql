SELECT DISTINCT vendors.vendor_name
FROM sales
JOIN glasses ON sales.glasses_glasses_id = glasses.glasses_id
JOIN brands ON glasses.brands_brand_id = brands.brand_id
JOIN vendors ON brands.vendors_vendor_id = vendors.vendor_id;
