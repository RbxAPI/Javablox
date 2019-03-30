package io.github.rbxapi.javablox.api.catalog;

/**
 * https://catalog.roblox.com/docs#/Category
 */
public interface CatalogCategory {

    /**
     * Lists Category Names and their Ids
     * https://catalog.roblox.com/docs#!/Category/get_v1_categories
     *
     * @return {}
     */
    String getCategoryList();

    /**
     * Lists Subcategory Names and their Ids
     * https://catalog.roblox.com/docs#!/Category/get_v1_subcategories
     *
     * @return {}
     */
    String getSubcategoryList();
}
