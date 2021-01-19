package week12d02;

import java.util.ArrayList;
import java.util.List;

public class Street {

    private List<Site> sites = new ArrayList<>();

    public List<Site> getSites() {
        return sites;
    }

    public void sellSite(Site site){
        sites.add(site);
    }

    public int lastSold(){
        if(sites.isEmpty()){
            throw new IllegalArgumentException("No site found");
        }
        int result = 0;
        Site lS = sites.get(sites.size()-1);
        int lSSide = lS.getSide();
        for(Site site:sites){
            if(site.getSide()==lSSide){
                result+=2;
            }
        }
        return result-lSSide;
    }

    public List<FenceStat> fenceStatList(){
        int[] result = new int[Fence.values().length];
        for (Site site:sites){
            result[site.getFence().getID()]++;
        }
        List<FenceStat> fenceStats = new ArrayList<>();
        for (Fence fence:Fence.values()){
            fenceStats.add(new FenceStat(result[fence.getID()], fence));
        }
        return fenceStats;
    }
}
