package ru.car.rest.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.ArrayList;
import java.util.List;

public class EmailVerifiedRealization implements ConstraintValidator<EmailVerified, String> {

    private List<String>emailDomens;

    public void initialize(EmailVerified constraint) {
        emailDomens = new ArrayList<>();
        emailDomens.add("ya.ru");
        emailDomens.add("yandex.ru");
        emailDomens.add("mail.ru");
        emailDomens.add("rambler.ru");
    }

    public boolean isValid(String email, ConstraintValidatorContext context){
        for (String emailDomen : emailDomens){
            if (email.endsWith(emailDomen)) return true;
        }
        return false;
    }
}
