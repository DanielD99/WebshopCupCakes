package web.commands;

import business.exceptions.UserException;
import model.Bottoms;
import repositories.BottomsRepository;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class IndexCommand extends Command{

    public String pageToShow;

    public IndexCommand(String pageToShow) {
        this.pageToShow = pageToShow;
    }

    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) throws UserException {

        List<Bottoms> bunde = null;
        try {

            bunde = BottomsRepository.getAllBottoms();

        } catch (SQLException e) {
            e.printStackTrace();
        }

        request.getSession().setAttribute("bunde", bunde);

        return "index";
    }
}
