## 工厂查询

1. 工厂查询初始化
```
 select b.addr_no,c.ADDR_NAME,a.ONTIME_RATE,a.QUALIFY_LEVEL,a.PRINT_DIFF_LEVEL,a.BIND_DIFF_LEVEL,
 a.VALID_FROM,a.VALID_TO,nvl(x.cnt1, 0) cnt1,nvl(y.cnt2, 0) cnt2,nvl(z.cnt3, 0) cnt3
 from T_FACT_RELATE a INNER join T_FACTORY b on a.FACT_ID=b.ID
 INNER JOIN T_ADDRESS_BOOK C ON b.addr_no=c.addr_no
 left join
 (
   select k.fact_id, count(k.so_id) cnt1
   from (
     select distinct fact_id,so_id
     from t_so_manu d
     where d.manu_status = '01'
       and exists (select 1 from t_so where ou_Id = 1 and id = d.so_id)
   ) k
   group by k.fact_id
 ) x
 on a.fact_id = x.fact_id

 left join
 (
   select l.fact_id, count(l.so_id) cnt2
   from (
     select distinct fact_id,so_id
     from t_so_manu d
     where d.PAPER_READY_STATUS = '01'
       and exists (select 1 from t_so where ou_Id = 1 and id = d.so_id)
   ) l
   group by l.fact_id
 ) y
 on a.fact_id = y.fact_id

 left join
 (
   select m.fact_id, count(m.so_id) cnt3
   from (
     select fact_id,so_id
     from t_so_manu d
     where d.PROD_INFO_STATUS = '01'
       and exists (select 1 from t_so where ou_Id = 1 and id = d.so_id)
   ) m
   group by m.fact_id
 ) z
 on a.fact_id = z.fact_id
 where a.OU_ID=1

```

2. 双击进入  表头信息查询
```
 SELECT T.ID as factId, A.ADDR_NO as addrNo, A.ADDR_NAME as addrName, C.ONTIME_RATE as ontimeRate,
   C.QUALIFY_LEVEL as qualifyLevel, C.PRINT_DIFF_LEVEL as printDiffLevel, C.BIND_DIFF_LEVEL as bindDiffLevel,
   C.VALID_FROM as validFrom, C.VALID_TO as validTo, nvl(M1.manuNum,0) as manuNum,
   nvl(M2.paperReadyNum,0) as paperReadyNum, nvl(M3.prodInfoNum,0) as prodInfoNum
 FROM T_FACTORY T
   LEFT OUTER JOIN T_ADDRESS_BOOK A ON A.ADDR_NO=T.ADDR_NO
   LEFT OUTER JOIN T_FACT_STDCAPA C ON C.FACT_ID = T.ID
   LEFT OUTER JOIN (SELECT COUNT(*) AS manuNum,S.FACT_ID FROM T_SO_MANU S WHERE S.MANU_STATUS='0' GROUP BY S.FACT_ID) M1 ON M1.FACT_ID=T.ID
   LEFT OUTER JOIN (SELECT COUNT(*) AS paperReadyNum,S1.FACT_ID FROM T_SO_MANU S1 WHERE S1.PAPER_READY_STATUS='0' GROUP BY S1.FACT_ID) M2 ON M2.FACT_ID=T.ID
   LEFT OUTER JOIN (SELECT COUNT(*) AS prodInfoNum,S2.FACT_ID FROM T_SO_MANU S2 WHERE S2.PROD_INFO_STATUS='0' GROUP BY S2.FACT_ID) M3 ON M3.FACT_ID=T.ID
   WHERE T.ID = #{factId}
```

3. 工序产能
```
SELECT T.CAPA_TYPE,T.DAILY_CAPA,T.UOM, O.OU_NAME as ouName
FROM T_FACT_STDCAPA T
LEFT JOIN T_OU O ON O.ID = T.OU_ID
```

4.产能数据
```
SELECT T.DT,T.CAPA_TYPE,T.CAPA,C.DAILY_CAPA,C.UOM
from T_OCCUPY T
  LEFT JOIN T_FACT_STDCAPA C ON C.FACT_ID=T.FACT_ID
LEFT JOIN T_PROD P ON P.ID=T.PROD_ID
WHERE T.FACT_ID = #{factId}
```
5印刷订单
```
SELECT c.CUST_CODE custCode,c.CUST_NAME custName,t.SO_NO soNo,B.ADDR_NAME agentName,t.SO_DATE soDate,t.DUE_DATE dueDate
 ,m.ACPT_USER acptUser,m.ACPT_TIME acptTime,m.MANU_COMP_DATE manuCompDate,m.DIST_METHOD distMethod,m.DIST_QTY distQty,m.MANU_STATUS manuStatus
  ,x.QUALIFY_LEVEL qualifyLevel,x.PRINT_DIFF_LEVEL printDiffLevel,x.BIND_DIFF_LEVEL bindDiffLevel,p.MANU_QTY manuQty,p.PROD_CODE prodCode,p.PROD_NAME prodName,p.PROD_TYPE prodType
from  T_SO t
  LEFT JOIN  T_CUST c on t.CUST_ID=c.ID
  LEFT JOIN T_SO_MANU m on t.ID = m.SO_ID
LEFT JOIN (select r.FACT_ID,r.OU_ID,r.QUALIFY_LEVEL,r.PRINT_DIFF_LEVEL,r.BIND_DIFF_LEVEL from T_FACT_RELATE r where r.FACT_ID=1
         ) x on x.OU_ID=t.OU_ID
LEFT JOIN
  (SELECT d.SO_ID,d.MANU_QTY,p.PROD_CODE,p.PROD_NAME,p.PROD_TYPE FROM T_SO_PROD d LEFT JOIN T_PROD p on d.PROD_ID=p.ID) p ON t.ID=p.SO_ID
LEFT JOIN T_ADDRESS_BOOK b on T.AGENT_ID=B.ID
WHERE t.OU_ID=1
```
