package com.nidalas.wealthrating.dao;

import com.nidalas.wealthrating.entity.Person;
import com.nidalas.wealthrating.entity.WealthEntity;
import com.nidalas.wealthrating.repository.WealthyRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WealthDao {
    @Autowired
    private WealthyRepo wealthyRepo;

    public List<WealthEntity> getAll(){
        return this.wealthyRepo.findAll();
    }

    public WealthEntity getById(Long id){
//        try {
            return this.wealthyRepo.getByIdNumber(id);
//        }catch (Exception err){
//            System.out.println(err.getMessage());
//            return null;
//        }
    }

    public String wealthRate(Person person, float assetValue ,double threshold){
        if (assetValue==0){
            return person.getPersonalInfo().getCity()+" doesn't exist. Sorry we can't evaluate his/her wealth.";
        }

        double fortune=person.getFinancialInfo().getCash() + person.getFinancialInfo().getNumberOfAssets() * assetValue;
        if(fortune >=threshold){
            WealthEntity wealth=new WealthEntity();
            wealth.setIdNumber(person.getId());
            wealth.setFirstName(person.getPersonalInfo().getFirstName());
            wealth.setLastName(person.getPersonalInfo().getLastName());
            wealth.setFortune(fortune);

            this.wealthyRepo.save(wealth);
            return "This man is rich";
        }else{
            return "This man is not considered as a rich";
        }
    }
}
