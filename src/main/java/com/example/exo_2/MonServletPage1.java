package com.example.demo_jee_01;

import com.example.exo_2.Personne;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "monServletJSP", value = "/page01")
public class MonServletPage1 extends HttpServlet {
    List<Personne> listPersonne = new ArrayList<Personne>();
    private String prenom;
    @Override
    public void init() throws ServletException {
        Personne p1 = new Personne("Loeuilleux", "Julien", 31);
        Personne p2 = new Personne("Arthur", "Weills", 25);
        listPersonne.add(p1);
        listPersonne.add(p2);

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.setAttribute("listPersonne", listPersonne);

        getServletContext().getRequestDispatcher("/WEB-INF/page-01.jsp").forward(req, resp);
    }
}
