-- 코드를 입력하세요
SELECT A.FLAVOR 
FROM FIRST_HALF A
JOIN ICECREAM_INFO B
ON A.FLAVOR = B.FLAVOR
WHERE TOTAL_ORDER > 3000
AND INGREDIENT_TYPE = 'fruit_based'