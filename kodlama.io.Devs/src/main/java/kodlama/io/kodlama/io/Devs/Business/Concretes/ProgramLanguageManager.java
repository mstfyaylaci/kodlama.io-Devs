package kodlama.io.kodlama.io.Devs.Business.Concretes;

import kodlama.io.kodlama.io.Devs.Business.Absracts.IProgramLanguageService;
import kodlama.io.kodlama.io.Devs.DataAccess.Abstracts.IProgramLanguageDao;
import kodlama.io.kodlama.io.Devs.Entities.Concretes.ProgramLanguage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProgramLanguageManager implements IProgramLanguageService {

    private IProgramLanguageDao programLanguageDao;
    @Autowired
    public ProgramLanguageManager(IProgramLanguageDao programLanguageDao) {
        this.programLanguageDao = programLanguageDao;
    }

    @Override
    public List<ProgramLanguage> getAll() {
       return programLanguageDao.getAll();
    }

    @Override
    public ProgramLanguage getById(int id) {
        return programLanguageDao.getById(id);
    }

    @Override
    public void add(ProgramLanguage language) throws Exception{
        if (language.getName().isEmpty()){
            throw new Exception("Program ismi boş olamaz");
        } else if (!this.isValid(language)) {
            throw new Exception("Program ismi tekrar edemez");
        }
        else
        programLanguageDao.add(language);
    }

    @Override
    public void delete(int id) {
        programLanguageDao.delete(id);
    }

    @Override
    public void update(ProgramLanguage language,int id) {
        programLanguageDao.update(language,id);
    }

    @Override
    public boolean isValid(ProgramLanguage language) {
        for (ProgramLanguage language1:getAll()) {
            if (language1.getName().equalsIgnoreCase(language.getName())){
                return false;
            }
        }
        return true;
    }
}
