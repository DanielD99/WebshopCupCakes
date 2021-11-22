package web.commands;

import business.exceptions.UserException;
import model.Bottoms;
import repositories.BottomsMapper;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.SQLException;
import java.util.List;

public class IndexCommand extends Command {

    public String pageToShow;

    public IndexCommand(String pageToShow) {
        this.pageToShow = pageToShow;
    }

    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) throws UserException {

        List<Bottoms> bunde = null;
        try {

            bunde = BottomsMapper.getAllBottoms();

        } catch (SQLException e) {
            e.printStackTrace();
        }

        request.getSession().setAttribute("bunde", bunde);

        return "index";
    }
}
