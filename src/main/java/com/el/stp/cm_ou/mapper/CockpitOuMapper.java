package com.el.stp.cm_ou.mapper;

import com.el.stp.cm_fac.domain.CapacityDomain;
import com.el.sys.domain.KeyValue;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created on 2016/8/4 20:00.
 * 驾驶舱（业务公司）
 * @author Conway
 */
public interface CockpitOuMapper {

    /**
     * 订单总数key 和未分单订单数val
     * param ouid  用户公司ID
     */
    @Select({
        "SELECT count(so.id) key ,NVL(sum(A.undiv),0)val",
        " FROM T_SO so",
        "LEFT OUTER JOIN (",
        "   SELECT so_id,1 as undiv ",
        "   FROM T_SO_PROD",
        "   WHERE MANU_QTY>DISTING_QTY+DIST_QTY",
        "   GROUP BY SO_ID",
        " )A",
        "ON so.id=A.SO_ID",
        "WHERE so.OU_ID=#{ouid}"
    })
    KeyValue orderSeperateNum(String ouid);

    /**
     *  各生产订单状态订单数
     *  param ouid  用户公司ID
     */
    @Select({
        "SELECT DISTINCT B.MANU_STATUS key,COUNT(1) OVER (PARTITION BY B.MANU_STATUS)val",
        " FROM(",
        "   SELECT occ.SO_ID,manu.MANU_STATUS ",
        "   FROM T_OCCUPY occ ",
        "   INNER JOIN T_OU ou on ((occ.DISTOU_ID=ou.id) or (occ.DISTOU_ID=ou.RELATED_OU_ID1))",
        "   LEFT OUTER JOIN T_SO_MANU manu on manu.id=occ.SO_MANU_ID and manu.MANU_STATUS in('01','02','03')",
        "   WHERE to_char(occ.DT,'yyyy-mm-dd') BETWEEN to_char(trunc(sysdate,'mm'),'yyyy-mm-dd') and to_char(last_day(sysdate),'yyyy-mm-dd')",
        "   AND ou.id=#{ouid}",
        "   AND NOT EXISTS (",
        "           SELECT 1",
        "           FROM T_SO_PROD sopro",
        "           WHERE sopro.MANU_QTY > sopro.DISTING_QTY + sopro.DIST_QTY and occ.SO_ID=sopro.SO_ID ",
        "           GROUP BY sopro.SO_ID",
        "       )",
        "GROUP BY occ.SO_ID,manu.MANU_STATUS",
        " )B"
    })
    List<KeyValue> orderStatusNum(String ouid);

    /**
     *  工厂按天占用产能总和
     *  param ouid 用户公司ID，capaType 产能类型
     */
    @Select({
        "SELECT occ.CAPA_TYPE capaType,occ.DT dt,NVL(SUM(OCC.CAPA),0) num",
        " FROM T_OCCUPY occ",
        "INNER JOIN T_OU ou",
        "   ON( occ.DISTOU_ID=ou.ID or occ.DISTOU_ID=ou.RELATED_OU_ID1)",
        "WHERE to_char(occ.DT,'yyyy-mm-dd') BETWEEN to_char(trunc(sysdate,'mm'),'yyyy-mm-dd') and to_char(last_day(sysdate),'yyyy-mm-dd')",
        "   AND ou.ID=#{ouid} and occ.CAPA_TYPE=#{capaType}",
        "GROUP BY occ.CAPA_TYPE,occ.DT "
    })
    List<CapacityDomain> ouOrderDayCapacityNum(String ouid,String capaType);

    /**
     *  公司日产能总和
     *  param ouid 用户公司ID，capaType 产能类型
     */
    @Select({
        "SELECT stdca.CAPA_TYPE capaType,NVL(SUM(stdca.DAILY_CAPA),0) num",
        " FROM T_FACT_STDCAPA stdca",
        "INNER JOIN T_OU ou",
        " ON (stdca.OU_ID=ou.ID or  stdca.OU_ID=ou.RELATED_OU_ID1)",
        "WHERE stdca.CAPA_TYPE=#{capaType} and ou.ID=#{ouid}",
        "GROUP BY stdca.CAPA_TYPE"
    })
    CapacityDomain ouOrderCapacityTotal(String ouid,String capaType);


}

