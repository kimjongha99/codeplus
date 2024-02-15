-- 코드를 입력하세요
SELECT a.TITLE	,a.BOARD_ID	,b.REPLY_ID	,b.WRITER_ID,	b.CONTENTS	,DATE_FORMAT(b.CREATED_DATE, '%Y-%m-%d') AS CREATED_DATE
FROM USED_GOODS_BOARD a ,USED_GOODS_REPLY b
WHERE a.BOARD_ID = b.BOARD_ID
AND DATE_FORMAT(a.CREATED_DATE,'%Y-%m')='2022-10'


ORDER BY b.CREATED_DATE ASC, a.TITLE ASC