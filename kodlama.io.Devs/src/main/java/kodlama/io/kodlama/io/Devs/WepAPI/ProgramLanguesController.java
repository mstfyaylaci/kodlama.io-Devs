package kodlama.io.kodlama.io.Devs.WepAPI;

import kodlama.io.kodlama.io.Devs.Business.Absracts.IProgramLanguageService;
import kodlama.io.kodlama.io.Devs.Entities.Concretes.ProgramLanguage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/programlanguages")
public class ProgramLanguesController {
    private IProgramLanguageService programLanguageService;
    @Autowired
    public ProgramLanguesController(IProgramLanguageService programLanguageService) {
        this.programLanguageService = programLanguageService;
    }

    @GetMapping("/getall")
    public List<ProgramLanguage> getAll(){
        return programLanguageService.getAll();
    }

    @PostMapping("/add")
    public void add(ProgramLanguage programLanguage)throws Exception{
         programLanguageService.add(programLanguage);
    }
    @PutMapping("/update")
    public void update(ProgramLanguage programLanguage,int id){
        programLanguageService.update(programLanguage,id);
    }
    @DeleteMapping("/delete")
    public void delete(int id){
        programLanguageService.delete(id);
    }
}
