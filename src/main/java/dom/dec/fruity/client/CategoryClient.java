package dom.dec.fruity.client;

import dom.dec.fruity.model.Category;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.client.RestTemplate;

@Controller
public class CategoryClient {
    @Value("${baseUrl}")
    private String url;
    private RestTemplate restTemplate;

    public CategoryClient() {
        this.restTemplate = new RestTemplate();
    }


    public Category[] getCategories() {
        Category[] categories = restTemplate.getForObject(url, Category[].class);

        return categories;
    }
}
