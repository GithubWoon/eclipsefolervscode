package acrondriver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class test {
    public static void main(String[] args) {
        String jdbcUrl = "jdbc:oracle:thin:@192.168.0.75:1521:xe";
        String username = "ive";
        String password = "7531";

        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {
            // JDBC 드라이버 로드
            Class.forName("oracle.jdbc.driver.OracleDriver");

            // 데이터베이스 연결
            connection = DriverManager.getConnection(jdbcUrl, username, password);

            // SQL 쿼리 작성
            String sqlQuery = "SELECT * FROM INSALEGOODS";

            // PreparedStatement를 사용하여 쿼리 실행
            preparedStatement = connection.prepareStatement(sqlQuery);
            resultSet = preparedStatement.executeQuery();

            // 쿼리 결과 처리
            while (resultSet.next()) {
                int seq = resultSet.getInt("SEQ");
                String goodsCode = resultSet.getString("GOODSCODE");
                String goodsName = resultSet.getString("GOODSNAME");
                String rawMaterialCode = resultSet.getString("RAWMATERIALCODE");
                int rawMaterialQty = resultSet.getInt("RAWMATERIALQTY");

                // 결과 데이터 사용
                System.out.println("SEQ: " + seq);
                System.out.println("GOODSCODE: " + goodsCode);
                System.out.println("GOODSNAME: " + goodsName);
                System.out.println("RAWMATERIALCODE: " + rawMaterialCode);
                System.out.println("RAWMATERIALQTY: " + rawMaterialQty);
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                // 리소스 해제
                if (resultSet != null) resultSet.close();
                if (preparedStatement != null) preparedStatement.close();
                if (connection != null) connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
