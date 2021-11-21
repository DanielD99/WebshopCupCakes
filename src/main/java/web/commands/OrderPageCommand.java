package web.commands;

import business.exceptions.UserException;
import model.Bottoms;
import model.Toppings;
import repositories.BottomsRepository;
import repositories.ToppingsRepository;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.SQLException;
import java.util.List;

public class OrderPageCommand extends Command{
    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) throws UserException {
        List<Bottoms> bunde = null;
        List<Toppings> toppings = null;
        try {

            toppings = ToppingsRepository.getAllToppings();
            bunde = BottomsRepository.getAllBottoms();

        } catch (SQLException e) {
            e.printStackTrace();
        }

        request.getSession().setAttribute("toppings", toppings);
        request.getSession().setAttribute("bunde", bunde);

        return "orderpage";
    }
}
