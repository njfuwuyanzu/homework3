package util;

import org.apache.commons.dbcp2.BasicDataSource;
import org.apache.commons.dbcp2.BasicDataSourceFactory;

import javax.sql.DataSource;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;


public class DbcpUtil {
    private static DataSource ds=null;

    
    static {
        Properties ps = new Properties();
        InputStream in = new DbcpUtil().getClass().getClassLoader().getResourceAsStream("dbcpconfig.properties");
        try {
            ps.load(in);
            ds= BasicDataSourceFactory.createDataSource(ps);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static DataSource getDataSource(){
        return ds;
    }
}
