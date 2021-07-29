package br.com.zup.ListaDeProdutos.service;


import br.com.zup.ListaDeProdutos.dominio.Produto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service // marcando a minha classe de serviço.
public class ProdutoService {

    //Atributo lista
    private List<Produto> estoque = new ArrayList<>();


    // Metódo para adicionar o produto no estoque.
    public void adicionarProduto(Produto produto){

        estoque.add(produto);

    }

    //Metódo para retornar a lista de estoque.
    public List<Produto> retornarEstoque(){

        return this.estoque;
    }


}
