package com.flippey.utils;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author flippey
 * @create 2018-11-28 16:46
 */
public class C3p0Util {


    private static ComboPooledDataSource cpds = new ComboPooledDataSource();


    public static Connection getConnection() throws SQLException {
        return cpds.getConnection();
    }

    public static DataSource getDataSource() {
        return cpds;
    }

    //关闭资源
    public static void closeAll(Connection cnn, Statement st, ResultSet rst) {
        if (cnn != null) {
            try {
                cnn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        if (st != null) {
            try {
                st.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        if (rst != null) {
            try {
                rst.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
