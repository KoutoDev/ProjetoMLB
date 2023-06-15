package model.dao;

import model.bean.Psicologo;
import database.ConexaoBD;
import java.sql.*;
import model.bean.Endereco;
import model.bean.Telefone;

public class PsicologoDAO {

    // Verifica se o usuário existe no banco de dados
    public boolean existe(Psicologo psicologo) throws Exception {
        String sql = "SELECT * FROM paciente WHERE email = ? AND senha = ?";
        try (Connection conn = ConexaoBD.obtemConexao(); PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, psicologo.getEmail());
            ps.setString(2, psicologo.getSenha());
            try (ResultSet rs = ps.executeQuery()) {
                return rs.next();
            }
        }
    }

    // Obter nome do usuário com base no e-mail para mostrar Bem-Vindo (nome)... usado junto com o método acima
    public String obterNomePsicologo(String email) throws Exception {
        // Variável para armazenar o nome do paciente
        String nomePsicologo = null;
        // Consulta SQL para selecionar o nome do paciente com base no email
        String sql = "SELECT nome FROM psicologo WHERE email = ?";
        try (Connection conn = ConexaoBD.obtemConexao(); PreparedStatement ps = conn.prepareStatement(sql)) {
            // Obtém o valor da coluna "nome" do resultado da consulta SQL
            ps.setString(1, email);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    // Retorna o nome do paciente obtido da consulta SQL (pode ser nulo se nenhum paciente for encontrado)
                    nomePsicologo = rs.getString("nome");
                }
            }
        }
        return nomePsicologo;
    }

    // CRUD
    // CREATE
    // CREATE TELEFONE
    public void createTelefonePsicologo(Telefone telefone) throws SQLException {
        Connection conn = null;
        PreparedStatement create = null;

        try {
            // Obtem conexão com o banco de dados
            conn = ConexaoBD.obtemConexao();
            // Preparando o SQL para inserir Paciente
            String sql = "INSERT INTO telefone_psicologo (comercial) VALUES (?)";
            create = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            create.setString(1, telefone.getNumero());
            // Executa a inserção
            create.executeUpdate();
            // Obtém a chave gerada
            ResultSet generatedKeys = create.getGeneratedKeys();
            generatedKeys.next();
            int idTel = generatedKeys.getInt(1);
            telefone.setCodTel(idTel);

            System.out.println("Telefone inserido com sucesso!");
        } catch (SQLException e) {
            System.out.println("Erro ao inserir telefone do paciente: " + e.getMessage());
        } finally {
            if (create != null) {
                create.close();
            }
            if (conn != null) {
                conn.close();
            }
        }
    }

    // CREATE ENDERECO
    public void createEnderecoPsicologo(Endereco endereco) throws SQLException {
        Connection conn = null;
        PreparedStatement create = null;

        try {
            // Obtem conexão com o banco de dados
            conn = ConexaoBD.obtemConexao();
            // Preparando o SQL para inserir Paciente
            String sql = "INSERT INTO endereco_psicologo (rua, bairro, cidade, estado, cep) VALUES (?,?,?,?,?)";
            create = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            create.setString(1, endereco.getRua());
            create.setString(2, endereco.getBairro());
            create.setString(3, endereco.getCidade());
            create.setString(4, endereco.getEstado());
            create.setInt(5, endereco.getCep());
            // Executa a inserção
            create.executeUpdate();
            // Obtém a chave gerada
            ResultSet generatedKeys = create.getGeneratedKeys();
            generatedKeys.next();
            int idEndereco = generatedKeys.getInt(1);
            endereco.setCodEndereco(idEndereco);
            System.out.println("Endereço inserido com sucesso!");
        } catch (SQLException e) {
            System.out.println("Erro ao inserir endereço do paciente: " + e.getMessage());
        } finally {
            if (create != null) {
                create.close();
            }
            if (conn != null) {
                conn.close();
            }
        }
    }

    // CREATE PSICOLOGO
    public void createPsicologo(Psicologo psicologo) throws SQLException {
        Connection conn = null;
        PreparedStatement create = null;
        try {
            // Obter conexão com banco de dados
            conn = ConexaoBD.obtemConexao();
            // Preparando o SQL para inserir Psicologo
            String sql = "INSERT INTO psicologo (nome, numero_conselho, profissionalizacao, tipo_consulta, email, senha, cod_tel, cod_endereco) VALUES(?,?,?,?,?,?,?,?)";
            String idTel = "SELECT cod_tel FROM telefone_psicologo ORDER BY cod_tel DESC LIMIT 1";
            String idEnd = "SELECT cod_endereco FROM endereco_psicologo ORDER BY cod_endereco DESC LIMIT 1";

            // Criando PreparedStatement com retorno das chaves geradas
            create = conn.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);

            // Obter o ID do telefone mais recente adicionado
            int codTel = -1;// valor padrão caso a consulta não retorne nenhum resultado
            Statement stmtTel = conn.createStatement();
            ResultSet rsTel = stmtTel.executeQuery(idTel);
            if (rsTel.next()) {
                codTel = rsTel.getInt("cod_tel");
            }

            // Obter o ID do endereco mais recente adicionado
            int codEndereco = -1;// valor padrão caso a consulta não retorne nenhum resultado
            Statement stmtEnd = conn.createStatement();
            ResultSet rsEnd = stmtEnd.executeQuery(idEnd);
            if (rsEnd.next()) {
                codEndereco = rsEnd.getInt("cod_endereco");
            }

            // Parametros de valor para create
            create.setString(1, psicologo.getNome());
            create.setInt(2, psicologo.getNumConselho());
            create.setString(3, psicologo.getProfissionalizacao());
            create.setString(4, psicologo.getTipoConsulta());
            create.setString(5, psicologo.getEmail());
            create.setString(6, psicologo.getSenha());
            create.setInt(7, codTel);
            create.setInt(8, codEndereco);

            //Executa a inserção
            create.executeUpdate();

            // Obtém a chave gerada
            ResultSet generatedKeys = create.getGeneratedKeys();
            if (generatedKeys.next()) {
                int idPessoa = generatedKeys.getInt(1);
                psicologo.setIdPessoa(idPessoa);
            }

            System.out.println("Psícologo inserido com sucesso!");
        } catch (SQLException e) {
            System.out.println("Erro ao inserir psícologo: " + e.getMessage());
        } finally {
            // Fecha os recursos
            if (create != null) {
                create.close();
            }
            if (conn != null) {
                conn.close();
            }
        }
    }
}