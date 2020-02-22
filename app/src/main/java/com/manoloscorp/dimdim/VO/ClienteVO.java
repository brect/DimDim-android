package com.manoloscorp.dimdim.VO;

public class ClienteVO {

    private String nome;
    private String cpf;
    private String dataNascimento;
    private ClienteDocumentosVO clienteDocumentosVO;
    private double renda;
    private int scoreBureau;
    private ClienteProdutosVO clienteProdutosVO;
    private boolean liberacaoLimite;


    public ClienteVO() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public ClienteDocumentosVO getClienteDocumentosVO() {
        return clienteDocumentosVO;
    }

    public void setClienteDocumentosVO(ClienteDocumentosVO clienteDocumentosVO) {
        this.clienteDocumentosVO = clienteDocumentosVO;
    }

    public double getRenda() {
        return renda;
    }

    public void setRenda(double renda) {
        this.renda = renda;
    }

    public int getScoreBureau() {
        return scoreBureau;
    }

    public void setScoreBureau(int scoreBureau) {
        this.scoreBureau = scoreBureau;
    }

    public ClienteProdutosVO getClienteProdutosVO() {
        return clienteProdutosVO;
    }

    public void setClienteProdutosVO(ClienteProdutosVO clienteProdutosVO) {
        this.clienteProdutosVO = clienteProdutosVO;
    }

    public boolean isLiberacaoLimite() {
        return liberacaoLimite;
    }

    public void setLiberacaoLimite(boolean liberacaoLimite) {
        this.liberacaoLimite = liberacaoLimite;
    }
}
