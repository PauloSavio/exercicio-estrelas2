package br.com.zup.Produtos.Exceptions;

public class LeadNaoEncontradoException extends RuntimeException{

    public LeadNaoEncontradoException(String message) {
        super(message);
    }
}
