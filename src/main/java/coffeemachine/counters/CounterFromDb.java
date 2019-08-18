package coffeemachine.counters;

import java.sql.*;

public class CounterFromDb implements Counter {

    @Override
    public int getWaterCount() {
        String SQL = "select descale_count from COUNTERS";

        return executeQuery(SQL);
    }

    public void setWaterCount(int value) {
        String updateSql = "update COUNTERS SET descale_count=" + value;
        executeQuery(updateSql);
    }

    @Override
    public void reduceCount() {
        setWaterCount(getWaterCount() - 1);
    }

    private Connection connect() throws SQLException {
        return DriverManager.getConnection("jdbc:postgresql://localhost:5432/coffeemachine?currentSchema=coffee_schema", null, null);
    }

    private int executeQuery(String SQL) {
        int count = 0;
        try (Connection connection = connect();
             Statement stmt = connection.createStatement();
             ResultSet rs = stmt.executeQuery(SQL)) {
            rs.next();
            count = rs.getInt(1);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return count;
    }

}
