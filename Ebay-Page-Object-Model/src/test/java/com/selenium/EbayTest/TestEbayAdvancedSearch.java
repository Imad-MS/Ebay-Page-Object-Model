package com.selenium.EbayTest;
import com.selenium.Ebay.EbayAdvancedSearch;
import org.junit.jupiter.api.Test;

public class TestEbayAdvancedSearch {
    @Test
    public void TestItemsAndStores(){
        EbayAdvancedSearch advancedSearch = new EbayAdvancedSearch();
        advancedSearch.itemsAndStores("by seller");
    }

    @Test
    public void TestFindByKeyword(){
        EbayAdvancedSearch advancedSearch = new EbayAdvancedSearch();
        advancedSearch.findByKeyword("iphone");
    }

    @Test
    public void TestSearchIncluding(){
        EbayAdvancedSearch advancedSearch = new EbayAdvancedSearch();
        advancedSearch.searchIncluding(0);
    }

    @Test
    public void TestPrice(){
        EbayAdvancedSearch advancedSearch = new EbayAdvancedSearch();
        advancedSearch.price("0", "1000");
    }

    @Test
    public void TestBuyingFormats(){
        EbayAdvancedSearch advancedSearch = new EbayAdvancedSearch();
        advancedSearch.buyingFormats(0);

    }

    @Test
    public void TestCondition(){
        EbayAdvancedSearch advancedSearch = new EbayAdvancedSearch();
        advancedSearch.condition(1);
    }

    @Test
    public void TestShowResults(){
        EbayAdvancedSearch advancedSearch = new EbayAdvancedSearch();
        advancedSearch.showResults();
    }

    @Test
    public void TestShippingOptions(){
        EbayAdvancedSearch advancedSearch = new EbayAdvancedSearch();
        advancedSearch.shippingOptions(0);
    }

    @Test
    public void TestLocation(){
        EbayAdvancedSearch advancedSearch = new EbayAdvancedSearch();
        advancedSearch.location();
    }

    @Test
    public void TestSellers(){
        EbayAdvancedSearch advancedSearch = new EbayAdvancedSearch();
        advancedSearch.sellers();
    }

    @Test
    public void TestSort(){
        EbayAdvancedSearch advancedSearch = new EbayAdvancedSearch();
        advancedSearch.sort();
    }
}
