package br.com.magna.esporte.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.magna.esporte.model.Horario;
import br.com.magna.esporte.model.HorarioDao;

@WebServlet("/EditaHorario")
public class EditaHorario extends HttpServlet {

	private static final long serialVersionUID = 1L;
		
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	    HorarioDao horarioDao = new HorarioDao();

	    Integer idHorario = Integer.parseInt(request.getParameter("idHorario"));
	    Horario horario = horarioDao.buscarPorId(idHorario);

	    if (idHorario.equals(horario.getIdHorario())) {
	        String nome = request.getParameter("nome");
	        String esporte = request.getParameter("esporte");
	        Integer sets = Integer.parseInt(request.getParameter("sets"));

	        horario.setNome(nome);
	        horario.setEsporte(esporte);
	        horario.setNumeroDeSets(sets);

	        horarioDao.atualizar(horario);
	    }
	}
}