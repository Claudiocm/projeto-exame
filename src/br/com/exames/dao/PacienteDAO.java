package br.com.exames.dao;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.exames.conection.ConexaoBD;
import br.com.exames.entidade.Paciente;

public class PacienteDAO {
	private ConexaoBD conexao;

	public PacienteDAO() throws Exception {
		conexao.getConnection();
	}

	public void cadastrar(Paciente paciente) throws Exception {
		PreparedStatement statement = conexao.getConnection()
				.prepareStatement("insert into paciente (pctNome, pctNascimento, pctEndereco, pctFone, pctSexo) "
						+ "values (?,?,?, ?,?)");

		try {
			statement.setString(1, paciente.getPctNome());
			statement.setDate(2, (Date) paciente.getPctNascimento());
			statement.setString(3, paciente.getPctEndereco());
			statement.setString(4, paciente.getPctFone());
			statement.setString(5, paciente.getPctSexo());
			statement.execute();
			statement.close();
			conexao.getConnection().close();
		} catch (SQLException e) {
			System.out.println("ERRO NO MÈTODO CADASTRAR" + "  "

					+ e.getMessage());
		}
	}

	public List<Paciente> getPacientes() throws Exception {
		PreparedStatement statement = conexao.getConnection().prepareStatement("SELECT * FROM paciente");
		ResultSet rs = statement.executeQuery();
		List<Paciente> pacientes = new ArrayList<Paciente>();
		Paciente paciente;

		while (rs.next()) {
			paciente = new Paciente();
			paciente.setPctId(rs.getInt("id"));
			paciente.setPctNome(rs.getString("pctNome"));
			paciente.setPctNascimento(rs.getDate("pctNascimento"));
			paciente.setPctEndereco(rs.getString("pctEndereco"));
			paciente.setPctSexo(rs.getString("pctSexo"));
			paciente.setPctFone(rs.getString("pctFone"));
			pacientes.add(paciente);
		}

		rs.close();
		statement.close();
		conexao.getConnection().close();

		return pacientes;
	}

	public void remove(int id) throws Exception {
		PreparedStatement statement = conexao.getConnection().prepareStatement("DELETE FROM Paciente WHERE ID=?");
		statement.setInt(1, id);
		statement.execute();
		statement.close();
	}

	public Paciente editar(Paciente paciente) throws Exception {
		PreparedStatement statement = conexao.getConnection().prepareStatement(
				"UPDATE paciente SET PCTNOME=?,PCTNASCIMENTO=?,PCTSEXO=?, PCTFONE=?, PCTENDERECO=? WHERE ID=?");
		statement.setString(1, paciente.getPctNome());
		statement.setDate(2, (Date) paciente.getPctNascimento());
		statement.setString(3, paciente.getPctSexo());
		statement.setString(4, paciente.getPctFone());
		statement.setString(3, paciente.getPctEndereco());
		statement.setInt(5, paciente.getPctId());
		statement.execute();
		statement.close();
		conexao.getConnection().close();
		return paciente;
	}

	public Paciente pacienteId(int id) throws SQLException {

		Paciente paciente = new Paciente();
		PreparedStatement statement = conexao.getConnection().prepareStatement("SELECT * FROM Paciente WHERE ID=?");
		statement.setInt(1, id);
		ResultSet rs = statement.executeQuery();

		while (rs.next()) {
			paciente.setPctId(rs.getInt("id"));
			paciente.setPctNome(rs.getString("pctNome"));
			paciente.setPctNascimento(rs.getDate("pctNascimento"));
			paciente.setPctEndereco(rs.getString("pctEndereco"));
			paciente.setPctSexo(rs.getString("pctSexo"));
			paciente.setPctFone(rs.getString("pctFone"));
		}

		rs.close();
		statement.close();
		conexao.getConnection().close();

		return paciente;

	}

}
