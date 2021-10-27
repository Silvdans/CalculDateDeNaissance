package com.company;
import java.time.LocalDate;

public class DateDeNaissance {
    private LocalDate date;

    public DateDeNaissance(){

    }

    public int calculAge(int jour,int mois,int année){

        date = LocalDate.of(année,mois,jour);
        int age = LocalDate.now().getYear() - date.getYear();
        if(mois >= LocalDate.now().getMonth().getValue()){
            if(jour > LocalDate.now().getDayOfMonth()){
                age = age - 1;
            }
        }
        return age;

    }
}
