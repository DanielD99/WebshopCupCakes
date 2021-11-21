package repositories;

import model.Bottoms;
import web.commands.Command;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class BottomsRepository extends BaseRepository {

    public static Bottoms getBottomByType(String type) throws SQLException {
        ResultSet rs = executeQuery("SELECT id,type,price FROM bottoms where type = "+type);

        return new Bottoms(rs.getInt(1), rs.getString(2), rs.getInt(3));
    }

    public static List<Bottoms> getAllBottoms() throws SQLException {
        List<Bottoms> bunde = new ArrayList<>();

        ResultSet rs = executeQuery("SELECT id,type,price FROM bottoms");

        while (rs.next()){
            bunde.add(new Bottoms(rs.getInt(1), rs.getString(2),rs.getInt(3)));
        }

        return bunde;
    }
}
