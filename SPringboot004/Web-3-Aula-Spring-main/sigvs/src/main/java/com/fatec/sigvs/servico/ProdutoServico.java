package com.fatec.sigvs.servico;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fatec.sigvs.model.Catalogo;
import com.fatec.sigvs.model.IImagemRepository;
import com.fatec.sigvs.model.IProdutoRepository;
import com.fatec.sigvs.model.Imagem;
import com.fatec.sigvs.model.Produto;


@Service
public class ProdutoServico implements IProdutoServico {
	@Autowired
	IProdutoRepository repo_produtos;

	@Autowired
	IImagemRepository repo_imagens;
	
	@Override
	public List<Catalogo> consultaCatalogo() {
		Catalogo cat = null;
		List<Produto> listaP = repo_produtos.findAll();
		List<Imagem> listaI = repo_imagens.findAll();
		List<Catalogo> listaC = new ArrayList<Catalogo>();
		
		for(Produto p : listaP) {
			for(Imagem i : listaI) {
				 cat = new Catalogo(
						 p.getId(), 
						 p.getDescricao(), 
						 p.getCategoria(), 
						 p.getQtdeEstoque(), 
						 i.getArquivo()
				);
				listaC.add(cat);
			}
		}
		
		return listaC;
	}

	@Override
	public List<Produto> consultaPorDescricao() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Produto> cadastrar(Produto produto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Produto> consultarPorId(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Produto> atualizar(Long id, Produto produto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void excluir(Long id) {
		// TODO Auto-generated method stub
		
	}
}
