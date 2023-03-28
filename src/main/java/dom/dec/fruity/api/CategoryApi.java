package dom.dec.fruity.api;

import dom.dec.fruity.client.CategoryClient;
import dom.dec.fruity.model.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/categories")
@CrossOrigin
public class CategoryApi {
    private CategoryClient client;

    @Autowired
    public CategoryApi(CategoryClient client) {
        this.client = client;
    }

    @GetMapping
    public ResponseEntity<Category[]> getCategories() {
        return new ResponseEntity<>(client.getCategories(), HttpStatus.OK);
    }
}
