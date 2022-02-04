package Homework1.Hospital;

import Homework1.IHospital.IHospital;
import Homework1.IHospital.IClientCard;
import Homework1.IHospital.IRegistry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("hospital")
public class Hospital implements IHospital {

    private IClientCard clientCard;
    private IRegistry registry;

    @Autowired
    public void getClientCard(IClientCard clientCard){
        this.clientCard = clientCard;
    }

    @Autowired
    @Qualifier("officeNumber")
    public void getOfficeNumber(IRegistry registry){
        this.registry = registry;
    }

    @Override
    public void doService() {
        System.out.println("здравствуйте!");
        System.out.println("Возьмите вашу карту");
        clientCard.clientData();
        System.out.print("вам нужно пройти в кабинет № " + registry.getOfficeNumber());
    }
}
