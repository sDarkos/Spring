package Homework1.Hospital;

import Homework1.IHospital.IClientCard;
import org.springframework.stereotype.Component;

@Component("clientCard")
public class ClientCard implements IClientCard {
    @Override
    public void clientData() {
        System.out.println("Мед. карта клиента");
    }
}
