package business.persistence;

import business.exceptions.UserException;
import business.services.Bottom;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BottomMapper {

    private Database database;

    public BottomMapper(Database database)
    {
        this.database = database;
    }

    public List<Bottom> getAllBottoms() throws UserException {
        List<Bottom> bottomList = null;

        try (Connection connection = database.connect()) {

            String sql = "SELECT * FROM  bottoms";

            try (PreparedStatement ps = connection.prepareStatement(sql)) {

                ResultSet rs = ps.executeQuery();
                while (rs.next()) {
                    if (bottomList == null){
                        bottomList = new ArrayList<>();
                    }
                    int bottom_id = rs.getInt("bottom_id");
                    String name = rs.getString("name");
                    Bottom bottom = new Bottom(bottom_id, name);
                    bottomList.add(bottom);
                }
            } catch (SQLException ex) {
                throw new UserException(ex.getMessage());
            }


        } catch (SQLException e) {
            e.printStackTrace();
        }
        return bottomList;
    }
}