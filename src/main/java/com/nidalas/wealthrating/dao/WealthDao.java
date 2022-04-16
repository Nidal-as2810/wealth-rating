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

    public WealthEntity getById(String id){
        return this.wealthyRepo.getById(id);
    }

    public String wealthRate(Person person, float assetValue ,float threshold){
        float fortune=person.getFinancialInfo().getCash() + person.getFinancialInfo().getNumberOfAssets() * assetValue;
        if(fortune >=threshold){
            WealthEntity wealth=new WealthEntity();
            wealth.setId(person.getId());
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
