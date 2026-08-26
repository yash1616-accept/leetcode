# Write your MySQL query statement below
Select user_id,max(time_stamp) as last_stamp
 from Logins 
WHERE year(time_stamp) = 2020
group by user_id;