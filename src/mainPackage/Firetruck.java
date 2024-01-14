package mainPackage;

public enum Firetruck {
    GBA("Gasniczy Bojowy Autopompa", 4.2/16,"Volvo"),
    GBM("Gasniczy Bojowy Motopompa",2.0, "Star");

    private String typ;
    private double typeOfTank;
    private String mark;
    Firetruck(String typ, double typeOfTank, String mark) {
        this.typ = typ;
        this.mark = mark;
        this.typeOfTank = typeOfTank;
    }

    public String getTyp() {
        return typ;
    }

    public void setTyp(String typ) {
        this.typ = typ;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public double getTypeOfTank() {
        return typeOfTank;
    }

    public void setTypeOfTank(double typeOfTank) {
        this.typeOfTank = typeOfTank;
    }
}
