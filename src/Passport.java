public class Passport {
    private final String number;//номер
    private final String surname;//фамилия
    private final String name;//имя
    private final String patronymic;//отчество

    private final String birthDate;//дата рождения

    public Passport(String number, String surname, String name, String patronymic, String birthDate) throws Exception {
        if(number==null || number.isEmpty() || number.isBlank()){
            throw new Exception("Не заполнен номер паспорта");
        }else {
            this.number=number;
        }

        if(surname==null || surname.isEmpty() || surname.isBlank()){
            throw new Exception("Не заполнена Фамилия");
        }else {
            this.surname=surname;
        }

        if(name==null || name.isEmpty() || name.isBlank()){
            throw new Exception("Не заполнено Имя");
        }else {
            this.name=name;
        }

        if(patronymic==null){
            this.patronymic="";
        }else {
            this.patronymic=patronymic;
        }

        if(birthDate==null || birthDate.isEmpty() || birthDate.isBlank()){
            throw new Exception("Не заполнена дата рождения");
        }else {
            this.birthDate=birthDate;
        }
    }


    public String getNumber() {
        return number;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public String getBirthDate() {
        return birthDate;
    }

    @Override
    public String toString() {
        return "\nНомер паспорта "+number+" выдан "+surname+" "+name+" "+patronymic+" дата рождения "+birthDate;


    }
}

