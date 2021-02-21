package catalog;

import java.util.ArrayList;
import java.util.List;

public class Catalog {

    List<CatalogItem> catalogItems = new ArrayList<>();

    public Catalog(List<CatalogItem> catalogItems) {
        this.catalogItems = catalogItems;
    }

    public Catalog() {

    }

    public List<CatalogItem> getCatalogItems() {
        return catalogItems;
    }

    public void addItem(CatalogItem catalogItem){
        catalogItems.add(catalogItem);
    }

    public double averagePageNumberOver(int number){
        return 0.0;
    }

    public void deleteItemByRegistrationNumber(String regNumber){
        CatalogItem toRemove = null;
        for (CatalogItem catalogItem:catalogItems){
            if(catalogItem.getRegistrationNumber().equals(regNumber)){
                toRemove = catalogItem;
            }
        }
        catalogItems.remove(toRemove);
    }

    public List<CatalogItem> findByCriteria(SearchCriteria searchCriteria){
        List<CatalogItem> result = new ArrayList<>();
        for(CatalogItem catalogItem:catalogItems){
            if(catalogItem.getContributors().equals(searchCriteria.getContributor()) || catalogItem.getTitle().equals(searchCriteria.getTitle())){
                result.add(catalogItem);
            }
        }
        return result;
    }

    public static int getAllPageNumber(){
        return 0;
    }

    public List<CatalogItem> getAudioLibraryItems(){
        List<CatalogItem> result = new ArrayList<>();
        for (CatalogItem catalogItem:catalogItems){
            if(catalogItem.hasAudioFeature()){
                result.add(catalogItem);
            }
        }
        return result;
    }

    public List<CatalogItem> getPrintedLibraryItems(){
        List<CatalogItem> result = new ArrayList<>();
        for (CatalogItem catalogItem:catalogItems){
            if(catalogItem.hasPrintedFeature()){
                result.add(catalogItem);
            }
        }
        return result;
    }
}
