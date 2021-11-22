package repositories;

import model.Bottoms;
import web.commands.Command;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BaseMapper {

    public static ResultSet executeQuery(String sql){
        try {
            Statement stmt = Command.database.connect().createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            return rs;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
