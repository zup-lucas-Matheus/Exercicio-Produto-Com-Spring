package br.com.zup.ListaDeProdutos.controllers;

import br.com.zup.ListaDeProdutos.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController // meu controlador
public class ProdutoController {

    @Autowired // o spring faz a injeção do meu produtoService.
    private ProdutoService produtoService;







}
