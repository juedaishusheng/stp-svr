package com.el.cfg.repository;

import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedJdbcTypes;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import static org.apache.ibatis.type.JdbcType.CHAR;
import static org.apache.ibatis.type.JdbcType.NCHAR;

/**
 * Created on 16/5/20.
 *
 * @author panlw
 */
@MappedJdbcTypes({NCHAR, CHAR})
public class PurifyStringTypeHandler extends MyBatisBaseTypeHandler<String> {

    @Override
    public void setNonNullParameter(PreparedStatement ps, int i, String parameter, JdbcType jdbcType) throws SQLException {
        ps.setString(i, parameter);
    }

    @Override
    public String getNullableResult(ResultSet rs, String columnName) throws SQLException {
        return nullToBlank(rs.getString(columnName));
    }

    @Override
    public String getNullableResult(ResultSet rs, int columnIndex) throws SQLException {
        return nullToBlank(rs.getString(columnIndex));
    }

    @Override
    public String getNullableResult(CallableStatement cs, int columnIndex) throws SQLException {
        return nullToBlank(cs.getString(columnIndex));
    }

    private static String nullToBlank(String value) {
        return value == null ? "" : value.trim();
    }

}
