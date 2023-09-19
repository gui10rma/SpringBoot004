package com.fatec.sigvs.model;

public class Catalogo {
	private Long id;
	private String descricao;
	private String categoria;
	private int quantidadeEstoque;
	private byte[] imagem;
	
	public Catalogo(Long id, String descricao, String categoria, int quantidadeEstoque, byte[] imagem) {
		this.id = id;
		this.descricao = descricao;
		this.categoria = categoria;
		this.quantidadeEstoque = quantidadeEstoque;
		this.imagem = imagem;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public int getQuantidadeEstoque() {
		return quantidadeEstoque;
	}

	public void setQuantidadeEstoque(int quantidadeEstoque) {
		this.quantidadeEstoque = quantidadeEstoque;
	}

	public byte[] getImagem() {
		return imagem;
	}

	public void setImagem(byte[] imagem) {
		this.imagem = imagem;
	}
	
	
	
	
	
}
