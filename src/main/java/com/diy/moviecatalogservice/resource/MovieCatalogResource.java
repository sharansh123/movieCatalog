package com.diy.moviecatalogservice.resource;

import com.diy.moviecatalogservice.models.CatalogItem;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/catalog")
public class MovieCatalogResource {

    @RequestMapping("/{id}")
    public List<CatalogItem> getCatalog(@PathVariable  String id){
        return Collections.singletonList(new CatalogItem("Titanic","romance",9));
    }
}
