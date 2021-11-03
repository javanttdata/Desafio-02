package trilha.back.financys.controller;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import trilha.back.financys.DTO.LancamentosDTO;
import trilha.back.financys.entities.Lancamentos;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("lancamentos")
public class LancamentosController {

    private final List<Lancamentos> list = new ArrayList<Lancamentos>();

    @PostMapping
    @ResponseStatus(HttpStatus.FOUND)
    public LancamentosDTO create(@RequestBody Lancamentos lancamentos){
        list.add(lancamentos);
        return new LancamentosDTO(list.indexOf(lancamentos));
    }

//    @GetMapping
//    public List<Lancamentos> read (){
//        return list.stream().sorted().collect(Collectors.toList());
//    }
}
