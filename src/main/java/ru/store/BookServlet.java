package ru.store;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class BookServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        List<Book> books = new ArrayList<Book>();

        books.add(new Book(1L, "Servlets for begginers"));
        books.add(new Book(2L, "Servlets for middle"));
        books.add(new Book(3L, "Servlets for expers"));

        req.setAttribute("bookList", books);

        getServletContext().getRequestDispatcher("/books.jsp").forward(req, resp);

    }
}
