package dev.java10x.CadastroDeNinjas.Ninjas.Controler.Service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class NinjaController {

    @GetMapping("/boasVindas") //pegar informações
    public String boasVindas(){
        return "Essa é minha primeira mensagem nessa rota";
    }


}
