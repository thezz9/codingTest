-- 코드를 입력하세요
SELECT B.CAR_ID FROM CAR_RENTAL_COMPANY_CAR  A
JOIN CAR_RENTAL_COMPANY_RENTAL_HISTORY B
ON A.CAR_ID = B.CAR_ID
WHERE CAR_TYPE ='세단'
AND TO_CHAR(START_DATE, 'MM') = '10'
GROUP BY B.CAR_ID
ORDER BY 1 DESC

