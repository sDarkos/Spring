package Homework1.Hospital;

import Homework1.IHospital.IRegistry;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component("officeNumber")
public class Registry implements IRegistry {

    @Override
    public int getOfficeNumber() {
        return new Random().nextInt(500);
    }
}
