package br.com.zup.ListaDeProdutos.controllers;

import br.com.zup.ListaDeProdutos.dominio.Produto;
import br.com.zup.ListaDeProdutos.service.ProdutoService;
import org.apache.catalina.LifecycleState;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController// meu controlador
@RequestMapping("/produtos") // Fazendo um mapeamento generico para todos os meu metódos abaixo.
public class ProdutoController {

    @Autowired // o spring faz a injeção do meu produtoService.
    private ProdutoService produtoService;

    @PostMapping //Vou receber informação nesse metódo...
    public List<Produto> cadastrarProduto(@RequestBody Produto produto){

        produtoService.adicionarProduto(produto);
        return produtoService.retornarEstoque();

    }

    @GetMapping // Retornar a informação, não preciso receber...
    public List<Produto> visualizarListaDeProdutos(){

        return produtoService.retornarEstoque();

    }

}
