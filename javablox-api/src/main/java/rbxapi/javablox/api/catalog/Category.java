package rbxapi.javablox.api.catalog;

import retrofit2.Call;
import retrofit2.http.GET;

import java.util.Map;

public interface Category {

    @GET("v1/asset-to-category")
    Call<Map<String, Integer>> getAssetToCategoryMapping();

    @GET("v1/asset-to-subcategory")
    Call<Map<String, Integer>> getAssetToSubcategoryMapping();

    @GET("v1/categories")
    Call<Map<String, Integer>> getCategories();

    @GET("v1/subcategories")
    Call<Map<String, Integer>> getSubcategories();
}
