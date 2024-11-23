package io.github.cursodsousa.produtosapi.controller;

import io.github.cursodsousa.produtosapi.model.Produto;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    @PostMapping
    public Produto salvar(@RequestBody Produto produto){
        System.out.println("Produto recebido: " + produto);
        return produto;
    }
}
