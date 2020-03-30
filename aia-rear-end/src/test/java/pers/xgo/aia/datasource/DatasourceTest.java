package pers.xgo.aia.datasource;

import com.zaxxer.hikari.HikariDataSource;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

@SpringBootTest
@RunWith(SpringRunner.class)
public class DatasourceTest {

    @Autowired
    private DataSource dataSource;

    @Test
    public void springDataSoucreTest(){
        //输出为true
        System.out.println(dataSource instanceof HikariDataSource);

        try{
            Connection connection = dataSource.getConnection();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select database() as 'db'");
            if(resultSet.next()){
                System.out.println("db name : " + resultSet.getString("db"));
            }
            statement.close();
            connection.close();
        }catch (Exception exception){
            exception.printStackTrace();
        }
    }
}
