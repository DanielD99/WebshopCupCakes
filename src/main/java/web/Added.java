package web;

import business.exceptions.UserException;
import web.commands.Command;
import web.commands.CommandUnprotectedPage;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Added extends Command {

    public String pageToShow;

    public Added(String pageToShow) {
        this.pageToShow = pageToShow;
    }

    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) throws UserException {

//        Double height = Double.parseDouble(request.getParameter("height"));
//        Double weight = Double.parseDouble(request.getParameter("weight"));
//        Double bmi = calculateBMI(height, weight);
//        request.getSession().setAttribute("weight", weight);
//        request.getSession().setAttribute("height", height);
//        request.getSession().setAttribute("bmiresult", bmi);

        String bottomId = "request.getParameter);";

        request.getSession().setAttribute("bunde",bottomId);


        return "added";
    }

}
