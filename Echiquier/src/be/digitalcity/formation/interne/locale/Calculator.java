package be.digitalcity.formation.interne.locale;

public class Calculator {

    public void FaireUneConversionGPS(double data){

        class CoordonneesGPS{
            public double longitude;
            public double latitude;
        }

        CoordonneesGPS coordonneesGPS = new CoordonneesGPS();
        coordonneesGPS.latitude = data;
        coordonneesGPS.longitude = data;
    }
}
