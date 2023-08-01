# Write your MySQL query statement below
with t as(
    select count(*) as total
    from Delivery
),
imm as (
    select count(*) as imm_count
    from Delivery
    where order_date = customer_pref_delivery_date
)
select round(imm.imm_count * 100.0 / t.total, 2) as immediate_percentage
from t, imm