package wh_12_2;

public class Country {
    private String countryCode;
    private String countryName;
    private long countryPopulation;

    public Country(String countryCode, String countryName, long countryPopulation) {
        this.countryCode = countryCode;
        this.countryName = countryName;
        this.countryPopulation = countryPopulation;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public double getCountryPopulation() {
        return countryPopulation;
    }

    public void setCountryPopulation(long countryPopulation) {
        this.countryPopulation = countryPopulation;
    }

    @Override
    public String toString() {
        return countryName + " (" + countryCode + ") ma " + countryPopulation + " ludnosci\n";
    }
}