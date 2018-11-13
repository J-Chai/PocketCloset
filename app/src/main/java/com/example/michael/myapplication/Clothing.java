package com.example.michael.myapplication;

import java.util.ArrayList;
import java.util.List;

public class Clothing extends Entry {

    //Clothing-only data members
    private String clothingCondition;
    private List<Outfit> associatedOutfits;
    private List<Closet> associatedClosets;

    public Clothing(String clothingName, int thumbnail)
    {
        super(clothingName, thumbnail);
        associatedClosets = new ArrayList<>();
        associatedOutfits = new ArrayList<>();
    }    
    
    public static Clothing createFromString(String properties) {
        /* Properties is ordered, separated with commas, as follows:
        *   Name
        *   Id
        *   Thumbnail (identifier)
        *   Condition
        */
        String[] vals = properties.split(",");
        return new Clothing(vals[0], Integer.parseInt(vals[1]));
    }

    //"Extended" methods from Entry
    public int getClothingId() {
        return getEntryId();
    }
    public void setClothingId(int clothingId) {
        setEntryId(clothingId);
    }
    public String getClothingName() {
        return getEntryName();
    }
    public void setClothingName(String clothingName) { setEntryName(clothingName); }

    //Clothing-only methods
    public String getClothingCondition() {
        return clothingCondition;
    }
    public List<Outfit> getAssociatedOutfits() {
        return associatedOutfits;
    }
    public void setAssociatedOutfits(List<Outfit> associatedOutfits) {
        this.associatedOutfits = associatedOutfits;
    }
    public List<Closet> getAssociatedClosets() {
        return associatedClosets;
    }
    //TODO: Add to associated closets and outfitsPock
    public void addClothing(Clothing newClothing)
    {

    }
}
