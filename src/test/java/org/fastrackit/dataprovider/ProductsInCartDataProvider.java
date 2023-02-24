package org.fastrackit.dataprovider;


import org.fasttrackit.products.ProductsInCart;
import org.testng.annotations.DataProvider;

public class  ProductsInCartDataProvider{
    @DataProvider(name = "productsInCartProvider")
    public static Object[][] createProductsInCartProvider() {
        ProductsInCart productsInCart1 = new ProductsInCart("1");
        ProductsInCart productsInCart2 = new ProductsInCart("2");
        ProductsInCart productsInCart3 = new ProductsInCart("3");
        ProductsInCart productsInCart4 = new ProductsInCart("4");
        ProductsInCart productsInCart5 = new ProductsInCart("5");
        ProductsInCart productsInCart6 = new ProductsInCart("6");
        ProductsInCart productsInCart7 = new ProductsInCart("7");
        ProductsInCart productsInCart8 = new ProductsInCart("8");
        ProductsInCart productsInCart9 = new ProductsInCart("9");
        ProductsInCart productsInCart0 = new ProductsInCart("0");

        return new Object[][] {
                new Object[]
                        {productsInCart1},
                        {productsInCart2},
                        {productsInCart3},
                        {productsInCart4},
                        {productsInCart5},
                        {productsInCart6},
                        {productsInCart7},
                        {productsInCart8},
                        {productsInCart9},
                        {productsInCart0},


        };
    }




    /**
     *
        @DataProvider(name = "productsInCartDataProvider")
        public static Object[][] createProductsInCartProvider(){
            ProductsInCart productInCart1 = new ProductsInCart("1");
            ProductsInCart productInCart2 = new ProductsInCart("2");
            ProductsInCart productInCart3 = new ProductsInCart("3");
            ProductsInCart productInCart4 = new ProductsInCart("4");
            ProductsInCart productInCart5 = new ProductsInCart("5");
            ProductsInCart productInCart6 = new ProductsInCart("6");
            ProductsInCart productInCart7 = new ProductsInCart("7");
            ProductsInCart productInCart8 = new ProductsInCart("8");
            ProductsInCart productInCart9 = new ProductsInCart("9");
            ProductsInCart productInCart0 = new ProductsInCart("0");



            return new Object[][]{new Object[]
                    {    productInCart1    },
                    {    productInCart2    },
                    {    productInCart3    },
                    {    productInCart4   },
                    {    productInCart5    },
                    {    productInCart6   },
                    {    productInCart7    },
                    {    productInCart8    },
                    {    productInCart9    },
                    {    productInCart0    },
            };
        }
     */
    }

