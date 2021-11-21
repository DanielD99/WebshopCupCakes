package repositories;

import model.Bottoms;
import model.Toppings;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ToppingsRepository extends BaseRepository {

    public static Toppings getToppingByType(String type) throws SQLException {
        ResultSet rs = executeQuery("SELECT id,type,price FROM Toppings where type = "+type);

        return new Toppings(rs.getInt(1), rs.getString(2), rs.getInt(3));
    }

    public static List<Toppings> getAllToppings() throws SQLException {
        List<Toppings> toppings = new ArrayList<>();

        ResultSet rs = executeQuery("SELECT id,type,price FROM bottoms");

        while (rs.next()){
            toppings.add(new Toppings(rs.getInt(1), rs.getString(2),rs.getInt(3)));
        }

        return toppings;
    }
}
