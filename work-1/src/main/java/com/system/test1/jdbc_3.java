package com.system.test1;

import com.system.utils.JDBCUTILS;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbc_3 {
    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        try {
            conn = JDBCUTILS.getConnection();
            String sql = "select * from course;";
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);
            while (rs.next()) {
                String id = rs.getString("id");
                String cname = rs.getString("cname");
                System.out.println(id + "   " + cname);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            JDBCUTILS.close(stmt, conn, rs);
        }
    }
}

