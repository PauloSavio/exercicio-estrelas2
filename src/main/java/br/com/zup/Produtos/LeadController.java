package br.com.zup.Produtos;

import br.com.zup.Produtos.Dtos.LeadDTO;
import br.com.zup.Produtos.Services.LeadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/leads")
public class LeadController {

    @Autowired
    private LeadService leadService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void cadastrarLead(@RequestBody LeadDTO leadDTO){
        leadService.cadastrarLead(leadDTO);
    }

    @GetMapping
    public List<LeadDTO> exibirLeads(){
        return leadService.exibirLeads();
    }
}
