package br.com.magna.esporte.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.magna.esporte.model.Horario;
import br.com.magna.esporte.model.HorarioDao;

@WebServlet("/CadastroDeHorario")
public class CadastroDeHorario extends HttpServlet {

	private static final long serialVersionUID = 1L;


	public CadastroDeHorario() {
	
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		HorarioDao horarioDao = new HorarioDao();
		Horario horario  = new Horario();
		
		String nome = request.getParameter("nome");
		String esporte = request.getParameter("esporte");
		Integer sets = Integer.parseInt(request.getParameter("sets"));

		
		horario.setNome(nome);
		horario.setEsporte(esporte);
		horario.setNumeroDeSets(sets);

		horarioDao.cadastrar(horario);
		
		List<Horario> horarios = horarioDao.listar();

	    request.setAttribute("horarios", horarios);
	    
		response.sendRedirect("./cadastro.jsp");
	}

}
