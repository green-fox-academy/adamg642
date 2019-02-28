package com.greenfoxacademy.basicwebshop;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.*;
import java.util.stream.Collectors;

@Controller
public class WebShopController {
    List<ItemModel> itemModelList = new ArrayList<>();



    @RequestMapping("/webshop")
    public String getWebshop(Model model) {
        itializeItemModelList();
        model.addAttribute("items",itemModelList);
        return "MainPage.html";
    }

    @RequestMapping("/only-avaiable")
    public String getOnlyAvaiable(Model model) {
        itializeItemModelList();
       // itemModelList.stream().filter(itemModel -> itemModel.getQuantity()>0);
       List<ItemModel> filteredItemModelList = itemModelList.stream()
                .filter(itemModel -> itemModel.getQuantity()>0)
                .collect(Collectors.toList());
        model.addAttribute("items",filteredItemModelList);
        return "MainPage.html";
    }

    @RequestMapping("/cheapestFirst")
    public String getCheapestFirst(Model model) {
        itializeItemModelList();

        List<ItemModel> filteredItemModelList = itemModelList.stream()
                .sorted(Comparator.comparing(itemModel -> itemModel.getPrice()))
                .collect(Collectors.toList());
        model.addAttribute("items",filteredItemModelList);
        return "MainPage.html";
    }

    @RequestMapping("/getnike")
    public String getNike(Model model) {

        itializeItemModelList();

        List<ItemModel> filteredItemModelList = itemModelList.stream()
                .filter(itemModel -> itemModel.getDestripction().contains("nike")
                || itemModel.getName().contains("nike"))
                .collect(Collectors.toList());
        model.addAttribute("items",filteredItemModelList);
        return "MainPage.html";

    }

    @RequestMapping("/avarage")
    public String getAvarge(Model model) {

        itializeItemModelList();

        double averagePrice = itemModelList
                .stream()
                .collect(Collectors.averagingInt(p -> p.getPrice()));

        model.addAttribute("average",averagePrice);

        return "AveragePage.html";

    }


    @RequestMapping("/mostExpensive")
    public String getMostExpensive(Model model) {

        itializeItemModelList();

       ItemModel Max = itemModelList.stream()
                .max(Comparator.comparing(itemModel -> itemModel.getPrice())).get();

        model.addAttribute("average",Max.getName());

        return "AveragePage.html";

    }

    @RequestMapping("/search")
    public String getSearch(@RequestBody String formData, Model model) {
        System.out.println(formData);
        String formDataValue = formData.substring(9,formData.length());
        itializeItemModelList();

        List<ItemModel> filteredItemModelList = itemModelList.stream()
                .filter(itemModel -> itemModel.getDestripction().contains(formDataValue)
                        || itemModel.getName().contains(formDataValue))
                .collect(Collectors.toList());
        model.addAttribute("items",filteredItemModelList);
        return "MainPage.html";

    }

    public void itializeItemModelList() {
        this.itemModelList = new ArrayList<>();
        ItemModel itemModel = new ItemModel("hh","ga",444,0);
        ItemModel itemModel2 = new ItemModel("jhgurnike","ggfsdfa",45434,114);
        ItemModel itemModel3 = new ItemModel("hherw","nike",5211,4);
        this.itemModelList.add(itemModel);
        this.itemModelList.add(itemModel2);
        this.itemModelList.add(itemModel3);
    }
}
