package catalog;

import java.util.ArrayList;
import java.util.List;

public class CatalogItem implements Feature{

    private List<Feature> features = new ArrayList<>();
    private int price;
    private String registrationNumber;

    public CatalogItem(String registrationNumber, int price, List<Feature> features) {
        this.features = features;
        this.price = price;
        this.registrationNumber = registrationNumber;
    }

    @Override
    public List<String> getContributors() {
        List<String> result=new ArrayList<>();
            for (int i = 0; i<getFeatures().size(); i++){
                for (int j = 0; j<getFeatures().get(i).getContributors().size(); j++){
                    result.add(getFeatures().get(i).getContributors().get(j));
                }
            }
            return result;

    }

    @Override
    public String getTitle() {
        List<String> result = new ArrayList<>();
        for(int i = 0; i<getFeatures().size(); i++){
            result.add(getFeatures().get(i).getTitle());
        }
        return result.toString();
    }

    public List<Feature> getFeatures() {
        return features;
    }

    public int getPrice() {
        return price;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public int fullLengthAtOneItem(){
        return AudioFeatures.getLenght();
    }

    public int numberOfPagesAtOneItem(){
        return Catalog.getAllPageNumber();
    }

    public List<String> getTitles(){
        List<String> result = new ArrayList<>();
        for(int i = 0; i<getFeatures().size(); i++){
            result.add(getFeatures().get(i).getTitle());
        }
        return result;
    }

    public boolean hasAudioFeature(){
        if(AudioFeatures.getLenght()>0){
            return true;
        }
        return false;
    }

    public boolean hasPrintedFeature(){
        if(PrintedFeatures.getNumberOfPages()>0) {
            return true;
        }
        return false;
    }


}
