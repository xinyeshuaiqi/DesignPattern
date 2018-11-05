package pers.wmx.abstractfactory;

public enum CarEnum {
    BMW1("pers.wmx.abstractfactory.BMW1"),
    BMW2("pers.wmx.abstractfactory.BMW2"),
    Mercedes1("pers.wmx.abstractfactory.Mercedes1"),
    Mercedes2("pers.wmx.abstractfactory.Mercedes2");

    private String value = "";

    private CarEnum(String value){
        this.value = value;
    }

    public String getValue(){
        return this.value;
    }
}
