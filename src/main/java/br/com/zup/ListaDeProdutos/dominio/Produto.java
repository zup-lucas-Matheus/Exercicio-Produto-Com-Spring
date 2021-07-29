package br.com.zup.ListaDeProdutos.dominio;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class Produto {

    //Atributos...
    @NotBlank(message = "Nome do protudo e obrigatório") // validando o atributo não pode ser em branco.
    @Size(min = 10)
    private String nome;

    @NotBlank(message = "Descrição do protudo e obrigatório")
    private String descricao;

    @Min(value = 20, message = "Quantida tem que ser no minio 20")
    private int quantidade;
    private double valorDoProduto;

    public Produto(){

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getValorDoProduto() {
        return valorDoProduto;
    }

    public void setValorDoProduto(double valorDoProduto) {
        this.valorDoProduto = valorDoProduto;
    }







}
