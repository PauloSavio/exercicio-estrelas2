package br.com.zup.Produtos.Services;

import br.com.zup.Produtos.Dtos.LeadDTO;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LeadService {
    private List<LeadDTO> leads = new ArrayList<>();

    public void cadastrarLead(LeadDTO leadDTO){
        leads.add(leadDTO);
    }

    public List<LeadDTO> exibirLeads(){
        return leads;
    }


}
