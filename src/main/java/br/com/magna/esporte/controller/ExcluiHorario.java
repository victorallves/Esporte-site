package br.com.magna.esporte.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.magna.esporte.model.Horario;
import br.com.magna.esporte.model.HorarioDao;

@WebServlet("/ExcluiHorario")
public class ExcluiHorario extends HttpServlet {

	private static final long serialVersionUID = 1L;
		
	protected void doDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	    HorarioDao horarioDao = new HorarioDao();

	    Integer idHorario = Integer.parseInt(request.getParameter("idHorario"));
	    Horario horario = horarioDao.buscarPorId(idHorario);

	    if (idHorario.equals(horario.getIdHorario())) {
	        horarioDao.remover(horario);
	    }
	}
}
