package br.com.zup.Produtos.Services;

import br.com.zup.Produtos.Dtos.LeadDTO;
import br.com.zup.Produtos.Dtos.ProdutosDTO;
import br.com.zup.Produtos.Exceptions.LeadEProdutoJaCadastradoException;
import br.com.zup.Produtos.Exceptions.LeadNaoEncontradoException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LeadService {
    private List<LeadDTO> leads = new ArrayList<>();

    public void cadastrarLead(LeadDTO leadDTO){
        try{
            verificarLeadEProduto(leadDTO);
            leads.add(leadDTO);
        }catch (LeadEProdutoJaCadastradoException exception){
            throw new RuntimeException(exception.getMessage());
        }catch (LeadNaoEncontradoException exception){
            leads.add(leadDTO);
        }
    }

    public void verificarLeadEProduto(LeadDTO objetoChegando){
        LeadDTO objetoDaLista = buscarLead(objetoChegando.getEmail());

        for (ProdutosDTO produtosDTO : objetoChegando.getProdutos()){
            if (produtoEstaPresente(objetoDaLista.getProdutos(), produtosDTO.getNome())){
                throw new LeadEProdutoJaCadastradoException("Lead e produto já cadastrados");
            }
        }
    }

    public LeadDTO buscarLead(String email){
        for (LeadDTO leadDTO : leads ){
            if(leadDTO.getEmail().equalsIgnoreCase(email)){
                return leadDTO;
            }
        }
        throw new LeadNaoEncontradoException("Lead não encontrado");
    }

    public boolean produtoEstaPresente (List<ProdutosDTO> listaDeInteresse, String nomeProduto){
        for(ProdutosDTO produtosDTO : listaDeInteresse){
            if (produtosDTO.getNome().equalsIgnoreCase(nomeProduto)){
                return true;
            }
        }
        return false;
    }

    public List<LeadDTO> exibirLeads(){
        return leads;
    }

}
