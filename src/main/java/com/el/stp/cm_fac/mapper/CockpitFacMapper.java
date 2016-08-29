package com.el.stp.cm_fac.mapper;

import com.el.stp.cm_fac.domain.CapacityDomain;
import com.el.sys.domain.KeyValue;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created on 2016/8/7 20:00.
 * 驾驶舱（工厂）
 * @author Conway
 */
public interface CockpitFacMapper {
    /**
     *  各生产订单状态订单数
     *  param: facid  工厂ID
     */
    @Select({
        "SELECT DISTINCT A.MANU_STATUS key,NVL(COUNT(1) OVER (PARTITION BY A.MANU_STATUS),0)val",
        "FROM(",
        "   SELECT ma.so_id,ma.MANU_STATUS",
        "   FROM T_SO_MANU ma",
        "   INNER JOIN T_OCCUPY occ",
        "       on ma.id=occ.SO_MANU_ID",
        "   WHERE occ.FACT_ID=#{facid}",
        "       AND to_char(occ.DT,'yyyy-mm-dd') BETWEEN to_char(trunc(sysdate,'mm'),'yyyy-mm-dd') and to_char(last_day(sysdate),'yyyy-mm-dd') ",
        "       AND ma.MANU_STATUS in('01','02','03') ",
        "   GROUP BY ma.SO_ID,ma.MANU_STATUS",
        " )A"
    })
    List<KeyValue> orderStatusNum(@Param("facid") String facid);

    /**
     * 工厂按天占用产能总和
     * param： facid 工厂ID，capaType 产能类型
     */
    @Select({
        "SELECT occ.CAPA_TYPE capaType,occ.DT dt,NVL(SUM(occ.CAPA),0)num",
        " FROM T_OCCUPY occ",
        "WHERE occ.FACT_ID=#{facid}",
        "   AND to_char(occ.DT,'yyyy-mm-dd') BETWEEN to_char(trunc(sysdate,'mm'),'yyyy-mm-dd') and to_char(last_day(sysdate),'yyyy-mm-dd')",
        "   AND occ.CAPA_TYPE=#{capaType}",
        "GROUP BY occ.CAPA_TYPE,occ.DT"
    })
    List<CapacityDomain> facOorderDayCapacityNum(@Param("facid") String facid, @Param("capaType") String capaType);

    /**
     *  工厂日产能总和
     *  param: ouid 工厂ID，capaType 产能类型
     */
    @Select({
        "SELECT stdca.CAPA_TYPE capaType,NVL(SUM(stdca.DAILY_CAPA),0)num",
        " FROM T_FACT_STDCAPA stdca",
        "WHERE stdca.FACT_ID=#{facid}",
        "   AND stdca.CAPA_TYPE=#{capaType}",
        "GROUP BY stdca.CAPA_TYPE"
    })
    CapacityDomain facOrderCapacityTotal(@Param("facid") String facid, @Param("capaType") String capaType);


}

