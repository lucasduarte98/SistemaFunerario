/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODEL;

/**
 *
 * @author junio
 */
public class AcessoModel{
    
    private String login;
    private String senha;
    private int tipo;
    private int ativo;
    private String fk_funcionario;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public int getAtivo() {
        return ativo;
    }

    public void setAtivo(int ativo) {
        this.ativo = ativo;
    }

    public String getFk_funcionario() {
        return fk_funcionario;
    }

    public void setFk_funcionario(String fk_funcionario) {
        this.fk_funcionario = fk_funcionario;
    }
    
}
