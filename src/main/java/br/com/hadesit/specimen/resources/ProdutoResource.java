package br.com.hadesit.specimen.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.hadesit.specimen.model.Produto;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api("API REST Produtos")
@RestController
@RequestMapping("/produto")
public class ProdutoResource {
	
	@ApiOperation(value="Retorna uma lista de produtos")
	@GetMapping(produces="application/json")
	public @ResponseBody Iterable<Produto> listaProdutos(){
		List<Produto> lista = new ArrayList<Produto>();
		
		Produto p = new Produto();
		p.setId(1);
		p.setCodigo(1000L);
		p.setDescricao("Leite Integral Longa Vida 1L");
		lista.add(p);
		
		p = new Produto();
		p.setId(2);
		p.setCodigo(1005L);
		p.setDescricao("Coca-Cola Lata 350 ML");
		lista.add(p);
		
		Iterable<Produto> retorno = lista;
		
		return retorno;
	}

}
